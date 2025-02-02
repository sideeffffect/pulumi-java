// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.outputs.JobTemplateExponentialRolloutRate;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobExecutionsRolloutConfigProperties {
    /**
     * @return The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
     * 
     */
    private final @Nullable JobTemplateExponentialRolloutRate exponentialRolloutRate;
    /**
     * @return The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
     * 
     */
    private final @Nullable Integer maximumPerMinute;

    @CustomType.Constructor
    private JobExecutionsRolloutConfigProperties(
        @CustomType.Parameter("exponentialRolloutRate") @Nullable JobTemplateExponentialRolloutRate exponentialRolloutRate,
        @CustomType.Parameter("maximumPerMinute") @Nullable Integer maximumPerMinute) {
        this.exponentialRolloutRate = exponentialRolloutRate;
        this.maximumPerMinute = maximumPerMinute;
    }

    /**
     * @return The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
     * 
     */
    public Optional<JobTemplateExponentialRolloutRate> exponentialRolloutRate() {
        return Optional.ofNullable(this.exponentialRolloutRate);
    }
    /**
     * @return The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
     * 
     */
    public Optional<Integer> maximumPerMinute() {
        return Optional.ofNullable(this.maximumPerMinute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExecutionsRolloutConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobTemplateExponentialRolloutRate exponentialRolloutRate;
        private @Nullable Integer maximumPerMinute;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExecutionsRolloutConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exponentialRolloutRate = defaults.exponentialRolloutRate;
    	      this.maximumPerMinute = defaults.maximumPerMinute;
        }

        public Builder exponentialRolloutRate(@Nullable JobTemplateExponentialRolloutRate exponentialRolloutRate) {
            this.exponentialRolloutRate = exponentialRolloutRate;
            return this;
        }
        public Builder maximumPerMinute(@Nullable Integer maximumPerMinute) {
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }        public JobExecutionsRolloutConfigProperties build() {
            return new JobExecutionsRolloutConfigProperties(exponentialRolloutRate, maximumPerMinute);
        }
    }
}
