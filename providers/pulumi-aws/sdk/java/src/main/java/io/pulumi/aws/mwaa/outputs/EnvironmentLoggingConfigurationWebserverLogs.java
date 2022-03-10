// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentLoggingConfigurationWebserverLogs {
    private final @Nullable String cloudWatchLogGroupArn;
    /**
     * Enabling or disabling the collection of logs
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
     */
    private final @Nullable String logLevel;

    @OutputCustomType.Constructor
    private EnvironmentLoggingConfigurationWebserverLogs(
        @OutputCustomType.Parameter("cloudWatchLogGroupArn") @Nullable String cloudWatchLogGroupArn,
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("logLevel") @Nullable String logLevel) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
        this.enabled = enabled;
        this.logLevel = logLevel;
    }

    public Optional<String> getCloudWatchLogGroupArn() {
        return Optional.ofNullable(this.cloudWatchLogGroupArn);
    }
    /**
     * Enabling or disabling the collection of logs
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
    */
    public Optional<String> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfigurationWebserverLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudWatchLogGroupArn;
        private @Nullable Boolean enabled;
        private @Nullable String logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLoggingConfigurationWebserverLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder cloudWatchLogGroupArn(@Nullable String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public EnvironmentLoggingConfigurationWebserverLogs build() {
            return new EnvironmentLoggingConfigurationWebserverLogs(cloudWatchLogGroupArn, enabled, logLevel);
        }
    }
}
