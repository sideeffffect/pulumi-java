// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListMachineLearningComputeKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListMachineLearningComputeKeysArgs Empty = new ListMachineLearningComputeKeysArgs();

    /**
     * Name of the Azure Machine Learning compute.
     * 
     */
    @InputImport(name="computeName", required=true)
      private final String computeName;

    public String getComputeName() {
        return this.computeName;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ListMachineLearningComputeKeysArgs(
        String computeName,
        String resourceGroupName,
        String workspaceName) {
        this.computeName = Objects.requireNonNull(computeName, "expected parameter 'computeName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ListMachineLearningComputeKeysArgs() {
        this.computeName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMachineLearningComputeKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMachineLearningComputeKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeName = defaults.computeName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder computeName(String computeName) {
            this.computeName = Objects.requireNonNull(computeName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public ListMachineLearningComputeKeysArgs build() {
            return new ListMachineLearningComputeKeysArgs(computeName, resourceGroupName, workspaceName);
        }
    }
}
