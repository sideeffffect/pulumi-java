// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationRuntimeConnectionInfoArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeConnectionInfoArgs Empty = new GetIntegrationRuntimeConnectionInfoArgs();

    /**
     * Integration runtime name
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
      private final String integrationRuntimeName;

    public String integrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    public GetIntegrationRuntimeConnectionInfoArgs(
        String integrationRuntimeName,
        String resourceGroupName,
        String workspaceName) {
        this.integrationRuntimeName = Objects.requireNonNull(integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetIntegrationRuntimeConnectionInfoArgs() {
        this.integrationRuntimeName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String integrationRuntimeName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationRuntimeName = defaults.integrationRuntimeName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder integrationRuntimeName(String integrationRuntimeName) {
            this.integrationRuntimeName = Objects.requireNonNull(integrationRuntimeName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetIntegrationRuntimeConnectionInfoArgs build() {
            return new GetIntegrationRuntimeConnectionInfoArgs(integrationRuntimeName, resourceGroupName, workspaceName);
        }
    }
}
