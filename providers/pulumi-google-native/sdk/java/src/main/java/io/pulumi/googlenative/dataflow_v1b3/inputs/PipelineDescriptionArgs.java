// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataflow_v1b3.inputs.DisplayDataArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.ExecutionStageSummaryArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.TransformSummaryArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A descriptive representation of submitted pipeline as well as the executed form. This data is provided by the Dataflow service for ease of visualizing the pipeline and interpreting Dataflow provided metrics.
 * 
 */
public final class PipelineDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDescriptionArgs Empty = new PipelineDescriptionArgs();

    /**
     * Pipeline level display data.
     * 
     */
    @InputImport(name="displayData")
      private final @Nullable Input<List<DisplayDataArgs>> displayData;

    public Input<List<DisplayDataArgs>> getDisplayData() {
        return this.displayData == null ? Input.empty() : this.displayData;
    }

    /**
     * Description of each stage of execution of the pipeline.
     * 
     */
    @InputImport(name="executionPipelineStage")
      private final @Nullable Input<List<ExecutionStageSummaryArgs>> executionPipelineStage;

    public Input<List<ExecutionStageSummaryArgs>> getExecutionPipelineStage() {
        return this.executionPipelineStage == null ? Input.empty() : this.executionPipelineStage;
    }

    /**
     * Description of each transform in the pipeline and collections between them.
     * 
     */
    @InputImport(name="originalPipelineTransform")
      private final @Nullable Input<List<TransformSummaryArgs>> originalPipelineTransform;

    public Input<List<TransformSummaryArgs>> getOriginalPipelineTransform() {
        return this.originalPipelineTransform == null ? Input.empty() : this.originalPipelineTransform;
    }

    public PipelineDescriptionArgs(
        @Nullable Input<List<DisplayDataArgs>> displayData,
        @Nullable Input<List<ExecutionStageSummaryArgs>> executionPipelineStage,
        @Nullable Input<List<TransformSummaryArgs>> originalPipelineTransform) {
        this.displayData = displayData;
        this.executionPipelineStage = executionPipelineStage;
        this.originalPipelineTransform = originalPipelineTransform;
    }

    private PipelineDescriptionArgs() {
        this.displayData = Input.empty();
        this.executionPipelineStage = Input.empty();
        this.originalPipelineTransform = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DisplayDataArgs>> displayData;
        private @Nullable Input<List<ExecutionStageSummaryArgs>> executionPipelineStage;
        private @Nullable Input<List<TransformSummaryArgs>> originalPipelineTransform;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayData = defaults.displayData;
    	      this.executionPipelineStage = defaults.executionPipelineStage;
    	      this.originalPipelineTransform = defaults.originalPipelineTransform;
        }

        public Builder displayData(@Nullable Input<List<DisplayDataArgs>> displayData) {
            this.displayData = displayData;
            return this;
        }

        public Builder displayData(@Nullable List<DisplayDataArgs> displayData) {
            this.displayData = Input.ofNullable(displayData);
            return this;
        }

        public Builder executionPipelineStage(@Nullable Input<List<ExecutionStageSummaryArgs>> executionPipelineStage) {
            this.executionPipelineStage = executionPipelineStage;
            return this;
        }

        public Builder executionPipelineStage(@Nullable List<ExecutionStageSummaryArgs> executionPipelineStage) {
            this.executionPipelineStage = Input.ofNullable(executionPipelineStage);
            return this;
        }

        public Builder originalPipelineTransform(@Nullable Input<List<TransformSummaryArgs>> originalPipelineTransform) {
            this.originalPipelineTransform = originalPipelineTransform;
            return this;
        }

        public Builder originalPipelineTransform(@Nullable List<TransformSummaryArgs> originalPipelineTransform) {
            this.originalPipelineTransform = Input.ofNullable(originalPipelineTransform);
            return this;
        }
        public PipelineDescriptionArgs build() {
            return new PipelineDescriptionArgs(displayData, executionPipelineStage, originalPipelineTransform);
        }
    }
}
