// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLabelingJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLabelingJobArgs Empty = new GetLabelingJobArgs();

    /**
     * Boolean value to indicate whether to include JobInstructions in response.
     * 
     */
    @Import(name="includeJobInstructions")
    private @Nullable Output<Boolean> includeJobInstructions;

    /**
     * @return Boolean value to indicate whether to include JobInstructions in response.
     * 
     */
    public Optional<Output<Boolean>> includeJobInstructions() {
        return Optional.ofNullable(this.includeJobInstructions);
    }

    /**
     * Boolean value to indicate whether to include LabelCategories in response.
     * 
     */
    @Import(name="includeLabelCategories")
    private @Nullable Output<Boolean> includeLabelCategories;

    /**
     * @return Boolean value to indicate whether to include LabelCategories in response.
     * 
     */
    public Optional<Output<Boolean>> includeLabelCategories() {
        return Optional.ofNullable(this.includeLabelCategories);
    }

    /**
     * Name and identifier for LabelingJob.
     * 
     */
    @Import(name="labelingJobId", required=true)
    private Output<String> labelingJobId;

    /**
     * @return Name and identifier for LabelingJob.
     * 
     */
    public Output<String> labelingJobId() {
        return this.labelingJobId;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group in which workspace is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private GetLabelingJobArgs() {}

    private GetLabelingJobArgs(GetLabelingJobArgs $) {
        this.includeJobInstructions = $.includeJobInstructions;
        this.includeLabelCategories = $.includeLabelCategories;
        this.labelingJobId = $.labelingJobId;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLabelingJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLabelingJobArgs $;

        public Builder() {
            $ = new GetLabelingJobArgs();
        }

        public Builder(GetLabelingJobArgs defaults) {
            $ = new GetLabelingJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeJobInstructions Boolean value to indicate whether to include JobInstructions in response.
         * 
         * @return builder
         * 
         */
        public Builder includeJobInstructions(@Nullable Output<Boolean> includeJobInstructions) {
            $.includeJobInstructions = includeJobInstructions;
            return this;
        }

        /**
         * @param includeJobInstructions Boolean value to indicate whether to include JobInstructions in response.
         * 
         * @return builder
         * 
         */
        public Builder includeJobInstructions(Boolean includeJobInstructions) {
            return includeJobInstructions(Output.of(includeJobInstructions));
        }

        /**
         * @param includeLabelCategories Boolean value to indicate whether to include LabelCategories in response.
         * 
         * @return builder
         * 
         */
        public Builder includeLabelCategories(@Nullable Output<Boolean> includeLabelCategories) {
            $.includeLabelCategories = includeLabelCategories;
            return this;
        }

        /**
         * @param includeLabelCategories Boolean value to indicate whether to include LabelCategories in response.
         * 
         * @return builder
         * 
         */
        public Builder includeLabelCategories(Boolean includeLabelCategories) {
            return includeLabelCategories(Output.of(includeLabelCategories));
        }

        /**
         * @param labelingJobId Name and identifier for LabelingJob.
         * 
         * @return builder
         * 
         */
        public Builder labelingJobId(Output<String> labelingJobId) {
            $.labelingJobId = labelingJobId;
            return this;
        }

        /**
         * @param labelingJobId Name and identifier for LabelingJob.
         * 
         * @return builder
         * 
         */
        public Builder labelingJobId(String labelingJobId) {
            return labelingJobId(Output.of(labelingJobId));
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public GetLabelingJobArgs build() {
            $.labelingJobId = Objects.requireNonNull($.labelingJobId, "expected parameter 'labelingJobId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
