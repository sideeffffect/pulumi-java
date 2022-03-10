// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BqmlIterationResultArgs extends io.pulumi.resources.ResourceArgs {

    public static final BqmlIterationResultArgs Empty = new BqmlIterationResultArgs();

    /**
     * [Output-only, Beta] Time taken to run the training iteration in milliseconds.
     * 
     */
    @InputImport(name="durationMs")
      private final @Nullable Input<String> durationMs;

    public Input<String> getDurationMs() {
        return this.durationMs == null ? Input.empty() : this.durationMs;
    }

    /**
     * [Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method option is specified as no_split or auto_split with input data size less than 500 rows.
     * 
     */
    @InputImport(name="evalLoss")
      private final @Nullable Input<Double> evalLoss;

    public Input<Double> getEvalLoss() {
        return this.evalLoss == null ? Input.empty() : this.evalLoss;
    }

    /**
     * [Output-only, Beta] Index of the ML training iteration, starting from zero for each training run.
     * 
     */
    @InputImport(name="index")
      private final @Nullable Input<Integer> index;

    public Input<Integer> getIndex() {
        return this.index == null ? Input.empty() : this.index;
    }

    /**
     * [Output-only, Beta] Learning rate used for this iteration, it varies for different training iterations if learn_rate_strategy option is not constant.
     * 
     */
    @InputImport(name="learnRate")
      private final @Nullable Input<Double> learnRate;

    public Input<Double> getLearnRate() {
        return this.learnRate == null ? Input.empty() : this.learnRate;
    }

    /**
     * [Output-only, Beta] Training loss computed on the training data at the end of the iteration. The training loss function is defined by model type.
     * 
     */
    @InputImport(name="trainingLoss")
      private final @Nullable Input<Double> trainingLoss;

    public Input<Double> getTrainingLoss() {
        return this.trainingLoss == null ? Input.empty() : this.trainingLoss;
    }

    public BqmlIterationResultArgs(
        @Nullable Input<String> durationMs,
        @Nullable Input<Double> evalLoss,
        @Nullable Input<Integer> index,
        @Nullable Input<Double> learnRate,
        @Nullable Input<Double> trainingLoss) {
        this.durationMs = durationMs;
        this.evalLoss = evalLoss;
        this.index = index;
        this.learnRate = learnRate;
        this.trainingLoss = trainingLoss;
    }

    private BqmlIterationResultArgs() {
        this.durationMs = Input.empty();
        this.evalLoss = Input.empty();
        this.index = Input.empty();
        this.learnRate = Input.empty();
        this.trainingLoss = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlIterationResultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> durationMs;
        private @Nullable Input<Double> evalLoss;
        private @Nullable Input<Integer> index;
        private @Nullable Input<Double> learnRate;
        private @Nullable Input<Double> trainingLoss;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlIterationResultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationMs = defaults.durationMs;
    	      this.evalLoss = defaults.evalLoss;
    	      this.index = defaults.index;
    	      this.learnRate = defaults.learnRate;
    	      this.trainingLoss = defaults.trainingLoss;
        }

        public Builder durationMs(@Nullable Input<String> durationMs) {
            this.durationMs = durationMs;
            return this;
        }

        public Builder durationMs(@Nullable String durationMs) {
            this.durationMs = Input.ofNullable(durationMs);
            return this;
        }

        public Builder evalLoss(@Nullable Input<Double> evalLoss) {
            this.evalLoss = evalLoss;
            return this;
        }

        public Builder evalLoss(@Nullable Double evalLoss) {
            this.evalLoss = Input.ofNullable(evalLoss);
            return this;
        }

        public Builder index(@Nullable Input<Integer> index) {
            this.index = index;
            return this;
        }

        public Builder index(@Nullable Integer index) {
            this.index = Input.ofNullable(index);
            return this;
        }

        public Builder learnRate(@Nullable Input<Double> learnRate) {
            this.learnRate = learnRate;
            return this;
        }

        public Builder learnRate(@Nullable Double learnRate) {
            this.learnRate = Input.ofNullable(learnRate);
            return this;
        }

        public Builder trainingLoss(@Nullable Input<Double> trainingLoss) {
            this.trainingLoss = trainingLoss;
            return this;
        }

        public Builder trainingLoss(@Nullable Double trainingLoss) {
            this.trainingLoss = Input.ofNullable(trainingLoss);
            return this;
        }
        public BqmlIterationResultArgs build() {
            return new BqmlIterationResultArgs(durationMs, evalLoss, index, learnRate, trainingLoss);
        }
    }
}
