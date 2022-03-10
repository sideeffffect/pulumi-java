// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.inputs.LabelingJobPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabelingJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelingJobArgs Empty = new LabelingJobArgs();

    /**
     * Name and identifier for LabelingJob.
     * 
     */
    @InputImport(name="labelingJobId")
      private final @Nullable Input<String> labelingJobId;

    public Input<String> getLabelingJobId() {
        return this.labelingJobId == null ? Input.empty() : this.labelingJobId;
    }

    /**
     * Definition of a labeling job.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<LabelingJobPropertiesArgs> properties;

    public Input<LabelingJobPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public LabelingJobArgs(
        @Nullable Input<String> labelingJobId,
        @Nullable Input<LabelingJobPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> workspaceName) {
        this.labelingJobId = labelingJobId;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private LabelingJobArgs() {
        this.labelingJobId = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> labelingJobId;
        private @Nullable Input<LabelingJobPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelingJobId = defaults.labelingJobId;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder labelingJobId(@Nullable Input<String> labelingJobId) {
            this.labelingJobId = labelingJobId;
            return this;
        }

        public Builder labelingJobId(@Nullable String labelingJobId) {
            this.labelingJobId = Input.ofNullable(labelingJobId);
            return this;
        }

        public Builder properties(@Nullable Input<LabelingJobPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable LabelingJobPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder workspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public LabelingJobArgs build() {
            return new LabelingJobArgs(labelingJobId, properties, resourceGroupName, workspaceName);
        }
    }
}
