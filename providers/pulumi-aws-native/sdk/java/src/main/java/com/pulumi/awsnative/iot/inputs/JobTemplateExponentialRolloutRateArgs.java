// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.inputs.JobTemplateRateIncreaseCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Allows you to create an exponential rate of rollout for a job.
 * 
 */
public final class JobTemplateExponentialRolloutRateArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateExponentialRolloutRateArgs Empty = new JobTemplateExponentialRolloutRateArgs();

    /**
     * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This parameter allows you to define the initial rate of rollout.
     * 
     */
    @Import(name="baseRatePerMinute", required=true)
    private Output<Integer> baseRatePerMinute;

    public Output<Integer> baseRatePerMinute() {
        return this.baseRatePerMinute;
    }

    /**
     * The exponential factor to increase the rate of rollout for a job.
     * 
     */
    @Import(name="incrementFactor", required=true)
    private Output<Double> incrementFactor;

    public Output<Double> incrementFactor() {
        return this.incrementFactor;
    }

    /**
     * The criteria to initiate the increase in rate of rollout for a job.
     * 
     */
    @Import(name="rateIncreaseCriteria", required=true)
    private Output<JobTemplateRateIncreaseCriteriaArgs> rateIncreaseCriteria;

    public Output<JobTemplateRateIncreaseCriteriaArgs> rateIncreaseCriteria() {
        return this.rateIncreaseCriteria;
    }

    private JobTemplateExponentialRolloutRateArgs() {}

    private JobTemplateExponentialRolloutRateArgs(JobTemplateExponentialRolloutRateArgs $) {
        this.baseRatePerMinute = $.baseRatePerMinute;
        this.incrementFactor = $.incrementFactor;
        this.rateIncreaseCriteria = $.rateIncreaseCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateExponentialRolloutRateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateExponentialRolloutRateArgs $;

        public Builder() {
            $ = new JobTemplateExponentialRolloutRateArgs();
        }

        public Builder(JobTemplateExponentialRolloutRateArgs defaults) {
            $ = new JobTemplateExponentialRolloutRateArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseRatePerMinute(Output<Integer> baseRatePerMinute) {
            $.baseRatePerMinute = baseRatePerMinute;
            return this;
        }

        public Builder baseRatePerMinute(Integer baseRatePerMinute) {
            return baseRatePerMinute(Output.of(baseRatePerMinute));
        }

        public Builder incrementFactor(Output<Double> incrementFactor) {
            $.incrementFactor = incrementFactor;
            return this;
        }

        public Builder incrementFactor(Double incrementFactor) {
            return incrementFactor(Output.of(incrementFactor));
        }

        public Builder rateIncreaseCriteria(Output<JobTemplateRateIncreaseCriteriaArgs> rateIncreaseCriteria) {
            $.rateIncreaseCriteria = rateIncreaseCriteria;
            return this;
        }

        public Builder rateIncreaseCriteria(JobTemplateRateIncreaseCriteriaArgs rateIncreaseCriteria) {
            return rateIncreaseCriteria(Output.of(rateIncreaseCriteria));
        }

        public JobTemplateExponentialRolloutRateArgs build() {
            $.baseRatePerMinute = Objects.requireNonNull($.baseRatePerMinute, "expected parameter 'baseRatePerMinute' to be non-null");
            $.incrementFactor = Objects.requireNonNull($.incrementFactor, "expected parameter 'incrementFactor' to be non-null");
            $.rateIncreaseCriteria = Objects.requireNonNull($.rateIncreaseCriteria, "expected parameter 'rateIncreaseCriteria' to be non-null");
            return $;
        }
    }

}
