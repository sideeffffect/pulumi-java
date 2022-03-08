// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HostedZoneQueryLoggingConfig {
    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
     * 
     */
    private final String cloudWatchLogsLogGroupArn;

    @OutputCustomType.Constructor({"cloudWatchLogsLogGroupArn"})
    private HostedZoneQueryLoggingConfig(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
     * 
    */
    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneQueryLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudWatchLogsLogGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneQueryLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogsLogGroupArn = defaults.cloudWatchLogsLogGroupArn;
        }

        public Builder setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
            this.cloudWatchLogsLogGroupArn = Objects.requireNonNull(cloudWatchLogsLogGroupArn);
            return this;
        }
        public HostedZoneQueryLoggingConfig build() {
            return new HostedZoneQueryLoggingConfig(cloudWatchLogsLogGroupArn);
        }
    }
}
