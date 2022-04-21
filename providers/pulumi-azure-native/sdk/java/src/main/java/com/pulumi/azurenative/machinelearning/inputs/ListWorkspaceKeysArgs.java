// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWorkspaceKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWorkspaceKeysArgs Empty = new ListWorkspaceKeysArgs();

    /**
     * The name of the resource group to which the machine learning workspace belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the machine learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private ListWorkspaceKeysArgs() {}

    private ListWorkspaceKeysArgs(ListWorkspaceKeysArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWorkspaceKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWorkspaceKeysArgs $;

        public Builder() {
            $ = new ListWorkspaceKeysArgs();
        }

        public Builder(ListWorkspaceKeysArgs defaults) {
            $ = new ListWorkspaceKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public ListWorkspaceKeysArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
