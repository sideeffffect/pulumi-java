// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig {
    /**
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution. Valid values are `Enabled` and `Disabled`. See below.
     * 
     */
    private final String realtimeMetricsSubscriptionStatus;

    @OutputCustomType.Constructor({"realtimeMetricsSubscriptionStatus"})
    private MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig(String realtimeMetricsSubscriptionStatus) {
        this.realtimeMetricsSubscriptionStatus = realtimeMetricsSubscriptionStatus;
    }

    /**
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution. Valid values are `Enabled` and `Disabled`. See below.
     * 
    */
    public String getRealtimeMetricsSubscriptionStatus() {
        return this.realtimeMetricsSubscriptionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String realtimeMetricsSubscriptionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realtimeMetricsSubscriptionStatus = defaults.realtimeMetricsSubscriptionStatus;
        }

        public Builder setRealtimeMetricsSubscriptionStatus(String realtimeMetricsSubscriptionStatus) {
            this.realtimeMetricsSubscriptionStatus = Objects.requireNonNull(realtimeMetricsSubscriptionStatus);
            return this;
        }
        public MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig build() {
            return new MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionStatus);
        }
    }
}
