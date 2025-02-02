// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationRuntimeStatusPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeStatusPlainArgs Empty = new GetIntegrationRuntimeStatusPlainArgs();

    /**
     * Integration runtime name
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
    private String integrationRuntimeName;

    /**
     * @return Integration runtime name
     * 
     */
    public String integrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetIntegrationRuntimeStatusPlainArgs() {}

    private GetIntegrationRuntimeStatusPlainArgs(GetIntegrationRuntimeStatusPlainArgs $) {
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationRuntimeStatusPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationRuntimeStatusPlainArgs $;

        public Builder() {
            $ = new GetIntegrationRuntimeStatusPlainArgs();
        }

        public Builder(GetIntegrationRuntimeStatusPlainArgs defaults) {
            $ = new GetIntegrationRuntimeStatusPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationRuntimeName Integration runtime name
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetIntegrationRuntimeStatusPlainArgs build() {
            $.integrationRuntimeName = Objects.requireNonNull($.integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
