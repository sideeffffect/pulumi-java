// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs Empty = new FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs();

    /**
     * Enables or disables the logging. Defaults to `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The CloudWatch group name for logging. This value is required if `enabled` is true.
     * 
     */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    /**
     * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
     * 
     */
    @Import(name="logStreamName")
    private @Nullable Output<String> logStreamName;

    public Optional<Output<String>> logStreamName() {
        return Optional.ofNullable(this.logStreamName);
    }

    private FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs() {}

    private FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs(FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs $) {
        this.enabled = $.enabled;
        this.logGroupName = $.logGroupName;
        this.logStreamName = $.logStreamName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs();
        }

        public Builder(FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs defaults) {
            $ = new FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        public Builder logStreamName(@Nullable Output<String> logStreamName) {
            $.logStreamName = logStreamName;
            return this;
        }

        public Builder logStreamName(String logStreamName) {
            return logStreamName(Output.of(logStreamName));
        }

        public FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsGetArgs build() {
            return $;
        }
    }

}
