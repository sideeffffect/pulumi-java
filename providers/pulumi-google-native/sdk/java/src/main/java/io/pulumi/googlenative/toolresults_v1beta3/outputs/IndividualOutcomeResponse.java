// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.DurationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IndividualOutcomeResponse {
    /**
     * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    private final Integer multistepNumber;
    private final String outcomeSummary;
    /**
     * How long it took for this step to run.
     * 
     */
    private final DurationResponse runDuration;
    private final String stepId;

    @OutputCustomType.Constructor({"multistepNumber","outcomeSummary","runDuration","stepId"})
    private IndividualOutcomeResponse(
        Integer multistepNumber,
        String outcomeSummary,
        DurationResponse runDuration,
        String stepId) {
        this.multistepNumber = multistepNumber;
        this.outcomeSummary = outcomeSummary;
        this.runDuration = runDuration;
        this.stepId = stepId;
    }

    /**
     * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
    */
    public Integer getMultistepNumber() {
        return this.multistepNumber;
    }
    public String getOutcomeSummary() {
        return this.outcomeSummary;
    }
    /**
     * How long it took for this step to run.
     * 
    */
    public DurationResponse getRunDuration() {
        return this.runDuration;
    }
    public String getStepId() {
        return this.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndividualOutcomeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer multistepNumber;
        private String outcomeSummary;
        private DurationResponse runDuration;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(IndividualOutcomeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multistepNumber = defaults.multistepNumber;
    	      this.outcomeSummary = defaults.outcomeSummary;
    	      this.runDuration = defaults.runDuration;
    	      this.stepId = defaults.stepId;
        }

        public Builder setMultistepNumber(Integer multistepNumber) {
            this.multistepNumber = Objects.requireNonNull(multistepNumber);
            return this;
        }

        public Builder setOutcomeSummary(String outcomeSummary) {
            this.outcomeSummary = Objects.requireNonNull(outcomeSummary);
            return this;
        }

        public Builder setRunDuration(DurationResponse runDuration) {
            this.runDuration = Objects.requireNonNull(runDuration);
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }
        public IndividualOutcomeResponse build() {
            return new IndividualOutcomeResponse(multistepNumber, outcomeSummary, runDuration, stepId);
        }
    }
}
