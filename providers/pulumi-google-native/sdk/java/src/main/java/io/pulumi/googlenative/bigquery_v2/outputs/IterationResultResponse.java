// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IterationResultResponse {
    /**
     * Time taken to run the iteration in milliseconds.
     * 
     */
    private final String durationMs;
    /**
     * Loss computed on the eval data at the end of iteration.
     * 
     */
    private final Double evalLoss;
    /**
     * Index of the iteration, 0 based.
     * 
     */
    private final Integer index;
    /**
     * Learn rate used for this iteration.
     * 
     */
    private final Double learnRate;
    /**
     * Loss computed on the training data at the end of iteration.
     * 
     */
    private final Double trainingLoss;

    @OutputCustomType.Constructor({"durationMs","evalLoss","index","learnRate","trainingLoss"})
    private IterationResultResponse(
        String durationMs,
        Double evalLoss,
        Integer index,
        Double learnRate,
        Double trainingLoss) {
        this.durationMs = durationMs;
        this.evalLoss = evalLoss;
        this.index = index;
        this.learnRate = learnRate;
        this.trainingLoss = trainingLoss;
    }

    /**
     * Time taken to run the iteration in milliseconds.
     * 
    */
    public String getDurationMs() {
        return this.durationMs;
    }
    /**
     * Loss computed on the eval data at the end of iteration.
     * 
    */
    public Double getEvalLoss() {
        return this.evalLoss;
    }
    /**
     * Index of the iteration, 0 based.
     * 
    */
    public Integer getIndex() {
        return this.index;
    }
    /**
     * Learn rate used for this iteration.
     * 
    */
    public Double getLearnRate() {
        return this.learnRate;
    }
    /**
     * Loss computed on the training data at the end of iteration.
     * 
    */
    public Double getTrainingLoss() {
        return this.trainingLoss;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IterationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String durationMs;
        private Double evalLoss;
        private Integer index;
        private Double learnRate;
        private Double trainingLoss;

        public Builder() {
    	      // Empty
        }

        public Builder(IterationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationMs = defaults.durationMs;
    	      this.evalLoss = defaults.evalLoss;
    	      this.index = defaults.index;
    	      this.learnRate = defaults.learnRate;
    	      this.trainingLoss = defaults.trainingLoss;
        }

        public Builder setDurationMs(String durationMs) {
            this.durationMs = Objects.requireNonNull(durationMs);
            return this;
        }

        public Builder setEvalLoss(Double evalLoss) {
            this.evalLoss = Objects.requireNonNull(evalLoss);
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder setLearnRate(Double learnRate) {
            this.learnRate = Objects.requireNonNull(learnRate);
            return this;
        }

        public Builder setTrainingLoss(Double trainingLoss) {
            this.trainingLoss = Objects.requireNonNull(trainingLoss);
            return this;
        }
        public IterationResultResponse build() {
            return new IterationResultResponse(durationMs, evalLoss, index, learnRate, trainingLoss);
        }
    }
}
