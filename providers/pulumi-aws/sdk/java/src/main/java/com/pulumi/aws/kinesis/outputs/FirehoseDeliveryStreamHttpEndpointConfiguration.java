// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamHttpEndpointConfiguration {
    /**
     * @return The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
     * 
     */
    private final @Nullable String accessKey;
    /**
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
     * 
     */
    private final @Nullable Integer bufferingInterval;
    /**
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * 
     */
    private final @Nullable Integer bufferingSize;
    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * @return The HTTP endpoint name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The data processing configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration processingConfiguration;
    /**
     * @return The request configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration requestConfiguration;
    /**
     * @return Total amount of seconds Firehose spends on retries. This duration starts after the initial attempt fails, It does not include the time periods during which Firehose waits for acknowledgment from the specified destination after each attempt. Valid values between `0` and `7200`. Default is `300`.
     * 
     */
    private final @Nullable Integer retryDuration;
    /**
     * @return Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs. The pattern needs to be `arn:.*`.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * @return Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDataOnly` and `AllData`.  Default value is `FailedDataOnly`.
     * 
     */
    private final @Nullable String s3BackupMode;
    /**
     * @return The HTTP endpoint URL to which Kinesis Firehose sends your data.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private FirehoseDeliveryStreamHttpEndpointConfiguration(
        @CustomType.Parameter("accessKey") @Nullable String accessKey,
        @CustomType.Parameter("bufferingInterval") @Nullable Integer bufferingInterval,
        @CustomType.Parameter("bufferingSize") @Nullable Integer bufferingSize,
        @CustomType.Parameter("cloudwatchLoggingOptions") @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("processingConfiguration") @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration processingConfiguration,
        @CustomType.Parameter("requestConfiguration") @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration requestConfiguration,
        @CustomType.Parameter("retryDuration") @Nullable Integer retryDuration,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("s3BackupMode") @Nullable String s3BackupMode,
        @CustomType.Parameter("url") String url) {
        this.accessKey = accessKey;
        this.bufferingInterval = bufferingInterval;
        this.bufferingSize = bufferingSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.name = name;
        this.processingConfiguration = processingConfiguration;
        this.requestConfiguration = requestConfiguration;
        this.retryDuration = retryDuration;
        this.roleArn = roleArn;
        this.s3BackupMode = s3BackupMode;
        this.url = url;
    }

    /**
     * @return The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
     * 
     */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
     * 
     */
    public Optional<Integer> bufferingInterval() {
        return Optional.ofNullable(this.bufferingInterval);
    }
    /**
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * 
     */
    public Optional<Integer> bufferingSize() {
        return Optional.ofNullable(this.bufferingSize);
    }
    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below.
     * 
     */
    public Optional<FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * @return The HTTP endpoint name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The data processing configuration.  More details are given below.
     * 
     */
    public Optional<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    /**
     * @return The request configuration.  More details are given below.
     * 
     */
    public Optional<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration> requestConfiguration() {
        return Optional.ofNullable(this.requestConfiguration);
    }
    /**
     * @return Total amount of seconds Firehose spends on retries. This duration starts after the initial attempt fails, It does not include the time periods during which Firehose waits for acknowledgment from the specified destination after each attempt. Valid values between `0` and `7200`. Default is `300`.
     * 
     */
    public Optional<Integer> retryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }
    /**
     * @return Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs. The pattern needs to be `arn:.*`.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDataOnly` and `AllData`.  Default value is `FailedDataOnly`.
     * 
     */
    public Optional<String> s3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }
    /**
     * @return The HTTP endpoint URL to which Kinesis Firehose sends your data.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable Integer bufferingInterval;
        private @Nullable Integer bufferingSize;
        private @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable String name;
        private @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration processingConfiguration;
        private @Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration requestConfiguration;
        private @Nullable Integer retryDuration;
        private @Nullable String roleArn;
        private @Nullable String s3BackupMode;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.bufferingInterval = defaults.bufferingInterval;
    	      this.bufferingSize = defaults.bufferingSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.name = defaults.name;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.requestConfiguration = defaults.requestConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.url = defaults.url;
        }

        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public Builder bufferingInterval(@Nullable Integer bufferingInterval) {
            this.bufferingInterval = bufferingInterval;
            return this;
        }
        public Builder bufferingSize(@Nullable Integer bufferingSize) {
            this.bufferingSize = bufferingSize;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder processingConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder requestConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration requestConfiguration) {
            this.requestConfiguration = requestConfiguration;
            return this;
        }
        public Builder retryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder s3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public FirehoseDeliveryStreamHttpEndpointConfiguration build() {
            return new FirehoseDeliveryStreamHttpEndpointConfiguration(accessKey, bufferingInterval, bufferingSize, cloudwatchLoggingOptions, name, processingConfiguration, requestConfiguration, retryDuration, roleArn, s3BackupMode, url);
        }
    }
}
