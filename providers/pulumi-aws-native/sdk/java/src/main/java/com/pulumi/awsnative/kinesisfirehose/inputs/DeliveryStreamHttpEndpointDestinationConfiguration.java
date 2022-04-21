// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamBufferingHints;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptions;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamHttpEndpointConfiguration;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamHttpEndpointRequestConfiguration;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfiguration;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamRetryOptions;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfiguration;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamHttpEndpointDestinationConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamHttpEndpointDestinationConfiguration Empty = new DeliveryStreamHttpEndpointDestinationConfiguration();

    @Import(name="bufferingHints")
    private @Nullable DeliveryStreamBufferingHints bufferingHints;

    public Optional<DeliveryStreamBufferingHints> bufferingHints() {
        return Optional.ofNullable(this.bufferingHints);
    }

    @Import(name="cloudWatchLoggingOptions")
    private @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;

    public Optional<DeliveryStreamCloudWatchLoggingOptions> cloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }

    @Import(name="endpointConfiguration", required=true)
    private DeliveryStreamHttpEndpointConfiguration endpointConfiguration;

    public DeliveryStreamHttpEndpointConfiguration endpointConfiguration() {
        return this.endpointConfiguration;
    }

    @Import(name="processingConfiguration")
    private @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;

    public Optional<DeliveryStreamProcessingConfiguration> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }

    @Import(name="requestConfiguration")
    private @Nullable DeliveryStreamHttpEndpointRequestConfiguration requestConfiguration;

    public Optional<DeliveryStreamHttpEndpointRequestConfiguration> requestConfiguration() {
        return Optional.ofNullable(this.requestConfiguration);
    }

    @Import(name="retryOptions")
    private @Nullable DeliveryStreamRetryOptions retryOptions;

    public Optional<DeliveryStreamRetryOptions> retryOptions() {
        return Optional.ofNullable(this.retryOptions);
    }

    @Import(name="roleARN")
    private @Nullable String roleARN;

    public Optional<String> roleARN() {
        return Optional.ofNullable(this.roleARN);
    }

    @Import(name="s3BackupMode")
    private @Nullable String s3BackupMode;

    public Optional<String> s3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }

    @Import(name="s3Configuration", required=true)
    private DeliveryStreamS3DestinationConfiguration s3Configuration;

    public DeliveryStreamS3DestinationConfiguration s3Configuration() {
        return this.s3Configuration;
    }

    private DeliveryStreamHttpEndpointDestinationConfiguration() {}

    private DeliveryStreamHttpEndpointDestinationConfiguration(DeliveryStreamHttpEndpointDestinationConfiguration $) {
        this.bufferingHints = $.bufferingHints;
        this.cloudWatchLoggingOptions = $.cloudWatchLoggingOptions;
        this.endpointConfiguration = $.endpointConfiguration;
        this.processingConfiguration = $.processingConfiguration;
        this.requestConfiguration = $.requestConfiguration;
        this.retryOptions = $.retryOptions;
        this.roleARN = $.roleARN;
        this.s3BackupMode = $.s3BackupMode;
        this.s3Configuration = $.s3Configuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamHttpEndpointDestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamHttpEndpointDestinationConfiguration $;

        public Builder() {
            $ = new DeliveryStreamHttpEndpointDestinationConfiguration();
        }

        public Builder(DeliveryStreamHttpEndpointDestinationConfiguration defaults) {
            $ = new DeliveryStreamHttpEndpointDestinationConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder bufferingHints(@Nullable DeliveryStreamBufferingHints bufferingHints) {
            $.bufferingHints = bufferingHints;
            return this;
        }

        public Builder cloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            $.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder endpointConfiguration(DeliveryStreamHttpEndpointConfiguration endpointConfiguration) {
            $.endpointConfiguration = endpointConfiguration;
            return this;
        }

        public Builder processingConfiguration(@Nullable DeliveryStreamProcessingConfiguration processingConfiguration) {
            $.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder requestConfiguration(@Nullable DeliveryStreamHttpEndpointRequestConfiguration requestConfiguration) {
            $.requestConfiguration = requestConfiguration;
            return this;
        }

        public Builder retryOptions(@Nullable DeliveryStreamRetryOptions retryOptions) {
            $.retryOptions = retryOptions;
            return this;
        }

        public Builder roleARN(@Nullable String roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        public Builder s3BackupMode(@Nullable String s3BackupMode) {
            $.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder s3Configuration(DeliveryStreamS3DestinationConfiguration s3Configuration) {
            $.s3Configuration = s3Configuration;
            return this;
        }

        public DeliveryStreamHttpEndpointDestinationConfiguration build() {
            $.endpointConfiguration = Objects.requireNonNull($.endpointConfiguration, "expected parameter 'endpointConfiguration' to be non-null");
            $.s3Configuration = Objects.requireNonNull($.s3Configuration, "expected parameter 's3Configuration' to be non-null");
            return $;
        }
    }

}
