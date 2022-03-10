// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.JobTemplateRateIncreaseCriteria;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class JobTemplateExponentialRolloutRate {
    /**
     * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This parameter allows you to define the initial rate of rollout.
     * 
     */
    private final Integer baseRatePerMinute;
    /**
     * The exponential factor to increase the rate of rollout for a job.
     * 
     */
    private final Double incrementFactor;
    /**
     * The criteria to initiate the increase in rate of rollout for a job.
     * 
     */
    private final JobTemplateRateIncreaseCriteria rateIncreaseCriteria;

    @OutputCustomType.Constructor
    private JobTemplateExponentialRolloutRate(
        @OutputCustomType.Parameter("baseRatePerMinute") Integer baseRatePerMinute,
        @OutputCustomType.Parameter("incrementFactor") Double incrementFactor,
        @OutputCustomType.Parameter("rateIncreaseCriteria") JobTemplateRateIncreaseCriteria rateIncreaseCriteria) {
        this.baseRatePerMinute = baseRatePerMinute;
        this.incrementFactor = incrementFactor;
        this.rateIncreaseCriteria = rateIncreaseCriteria;
    }

    /**
     * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This parameter allows you to define the initial rate of rollout.
     * 
    */
    public Integer getBaseRatePerMinute() {
        return this.baseRatePerMinute;
    }
    /**
     * The exponential factor to increase the rate of rollout for a job.
     * 
    */
    public Double getIncrementFactor() {
        return this.incrementFactor;
    }
    /**
     * The criteria to initiate the increase in rate of rollout for a job.
     * 
    */
    public JobTemplateRateIncreaseCriteria getRateIncreaseCriteria() {
        return this.rateIncreaseCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateExponentialRolloutRate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer baseRatePerMinute;
        private Double incrementFactor;
        private JobTemplateRateIncreaseCriteria rateIncreaseCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateExponentialRolloutRate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseRatePerMinute = defaults.baseRatePerMinute;
    	      this.incrementFactor = defaults.incrementFactor;
    	      this.rateIncreaseCriteria = defaults.rateIncreaseCriteria;
        }

        public Builder baseRatePerMinute(Integer baseRatePerMinute) {
            this.baseRatePerMinute = Objects.requireNonNull(baseRatePerMinute);
            return this;
        }

        public Builder incrementFactor(Double incrementFactor) {
            this.incrementFactor = Objects.requireNonNull(incrementFactor);
            return this;
        }

        public Builder rateIncreaseCriteria(JobTemplateRateIncreaseCriteria rateIncreaseCriteria) {
            this.rateIncreaseCriteria = Objects.requireNonNull(rateIncreaseCriteria);
            return this;
        }
        public JobTemplateExponentialRolloutRate build() {
            return new JobTemplateExponentialRolloutRate(baseRatePerMinute, incrementFactor, rateIncreaseCriteria);
        }
    }
}
