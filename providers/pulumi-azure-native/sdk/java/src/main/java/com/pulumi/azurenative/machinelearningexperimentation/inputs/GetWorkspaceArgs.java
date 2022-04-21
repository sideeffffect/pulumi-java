// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningexperimentation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkspaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkspaceArgs Empty = new GetWorkspaceArgs();

    /**
     * The name of the machine learning team account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group to which the machine learning team account belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the machine learning team account workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetWorkspaceArgs() {}

    private GetWorkspaceArgs(GetWorkspaceArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspaceArgs $;

        public Builder() {
            $ = new GetWorkspaceArgs();
        }

        public Builder(GetWorkspaceArgs defaults) {
            $ = new GetWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetWorkspaceArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
