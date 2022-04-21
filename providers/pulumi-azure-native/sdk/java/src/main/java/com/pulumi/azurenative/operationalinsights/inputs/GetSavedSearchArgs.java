// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSavedSearchArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSavedSearchArgs Empty = new GetSavedSearchArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The id of the saved search.
     * 
     */
    @Import(name="savedSearchId", required=true)
    private String savedSearchId;

    public String savedSearchId() {
        return this.savedSearchId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetSavedSearchArgs() {}

    private GetSavedSearchArgs(GetSavedSearchArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.savedSearchId = $.savedSearchId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSavedSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSavedSearchArgs $;

        public Builder() {
            $ = new GetSavedSearchArgs();
        }

        public Builder(GetSavedSearchArgs defaults) {
            $ = new GetSavedSearchArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder savedSearchId(String savedSearchId) {
            $.savedSearchId = savedSearchId;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetSavedSearchArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.savedSearchId = Objects.requireNonNull($.savedSearchId, "expected parameter 'savedSearchId' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
