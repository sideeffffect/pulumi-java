// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.enums.SecurityProfileStatisticalThresholdStatistic;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityProfileStatisticalThreshold {
    /**
     * @return The percentile which resolves to a threshold value by which compliance with a behavior is determined
     * 
     */
    private final @Nullable SecurityProfileStatisticalThresholdStatistic statistic;

    @CustomType.Constructor
    private SecurityProfileStatisticalThreshold(@CustomType.Parameter("statistic") @Nullable SecurityProfileStatisticalThresholdStatistic statistic) {
        this.statistic = statistic;
    }

    /**
     * @return The percentile which resolves to a threshold value by which compliance with a behavior is determined
     * 
     */
    public Optional<SecurityProfileStatisticalThresholdStatistic> statistic() {
        return Optional.ofNullable(this.statistic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileStatisticalThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecurityProfileStatisticalThresholdStatistic statistic;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileStatisticalThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statistic = defaults.statistic;
        }

        public Builder statistic(@Nullable SecurityProfileStatisticalThresholdStatistic statistic) {
            this.statistic = statistic;
            return this;
        }        public SecurityProfileStatisticalThreshold build() {
            return new SecurityProfileStatisticalThreshold(statistic);
        }
    }
}
