// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod;
import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptionsArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamElasticsearchBufferingHintsArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamElasticsearchRetryOptionsArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamVpcConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamElasticsearchDestinationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamElasticsearchDestinationConfigurationArgs Empty = new DeliveryStreamElasticsearchDestinationConfigurationArgs();

    @InputImport(name="bufferingHints")
      private final @Nullable Input<DeliveryStreamElasticsearchBufferingHintsArgs> bufferingHints;

    public Input<DeliveryStreamElasticsearchBufferingHintsArgs> getBufferingHints() {
        return this.bufferingHints == null ? Input.empty() : this.bufferingHints;
    }

    @InputImport(name="cloudWatchLoggingOptions")
      private final @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;

    public Input<DeliveryStreamCloudWatchLoggingOptionsArgs> getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions == null ? Input.empty() : this.cloudWatchLoggingOptions;
    }

    @InputImport(name="clusterEndpoint")
      private final @Nullable Input<String> clusterEndpoint;

    public Input<String> getClusterEndpoint() {
        return this.clusterEndpoint == null ? Input.empty() : this.clusterEndpoint;
    }

    @InputImport(name="domainARN")
      private final @Nullable Input<String> domainARN;

    public Input<String> getDomainARN() {
        return this.domainARN == null ? Input.empty() : this.domainARN;
    }

    @InputImport(name="indexName", required=true)
      private final Input<String> indexName;

    public Input<String> getIndexName() {
        return this.indexName;
    }

    @InputImport(name="indexRotationPeriod")
      private final @Nullable Input<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod> indexRotationPeriod;

    public Input<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod> getIndexRotationPeriod() {
        return this.indexRotationPeriod == null ? Input.empty() : this.indexRotationPeriod;
    }

    @InputImport(name="processingConfiguration")
      private final @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;

    public Input<DeliveryStreamProcessingConfigurationArgs> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Input.empty() : this.processingConfiguration;
    }

    @InputImport(name="retryOptions")
      private final @Nullable Input<DeliveryStreamElasticsearchRetryOptionsArgs> retryOptions;

    public Input<DeliveryStreamElasticsearchRetryOptionsArgs> getRetryOptions() {
        return this.retryOptions == null ? Input.empty() : this.retryOptions;
    }

    @InputImport(name="roleARN", required=true)
      private final Input<String> roleARN;

    public Input<String> getRoleARN() {
        return this.roleARN;
    }

    @InputImport(name="s3BackupMode")
      private final @Nullable Input<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode> s3BackupMode;

    public Input<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode> getS3BackupMode() {
        return this.s3BackupMode == null ? Input.empty() : this.s3BackupMode;
    }

    @InputImport(name="s3Configuration", required=true)
      private final Input<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration;

    public Input<DeliveryStreamS3DestinationConfigurationArgs> getS3Configuration() {
        return this.s3Configuration;
    }

    @InputImport(name="typeName")
      private final @Nullable Input<String> typeName;

    public Input<String> getTypeName() {
        return this.typeName == null ? Input.empty() : this.typeName;
    }

    @InputImport(name="vpcConfiguration")
      private final @Nullable Input<DeliveryStreamVpcConfigurationArgs> vpcConfiguration;

    public Input<DeliveryStreamVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Input.empty() : this.vpcConfiguration;
    }

    public DeliveryStreamElasticsearchDestinationConfigurationArgs(
        @Nullable Input<DeliveryStreamElasticsearchBufferingHintsArgs> bufferingHints,
        @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions,
        @Nullable Input<String> clusterEndpoint,
        @Nullable Input<String> domainARN,
        Input<String> indexName,
        @Nullable Input<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod> indexRotationPeriod,
        @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration,
        @Nullable Input<DeliveryStreamElasticsearchRetryOptionsArgs> retryOptions,
        Input<String> roleARN,
        @Nullable Input<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode> s3BackupMode,
        Input<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration,
        @Nullable Input<String> typeName,
        @Nullable Input<DeliveryStreamVpcConfigurationArgs> vpcConfiguration) {
        this.bufferingHints = bufferingHints;
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.clusterEndpoint = clusterEndpoint;
        this.domainARN = domainARN;
        this.indexName = Objects.requireNonNull(indexName, "expected parameter 'indexName' to be non-null");
        this.indexRotationPeriod = indexRotationPeriod;
        this.processingConfiguration = processingConfiguration;
        this.retryOptions = retryOptions;
        this.roleARN = Objects.requireNonNull(roleARN, "expected parameter 'roleARN' to be non-null");
        this.s3BackupMode = s3BackupMode;
        this.s3Configuration = Objects.requireNonNull(s3Configuration, "expected parameter 's3Configuration' to be non-null");
        this.typeName = typeName;
        this.vpcConfiguration = vpcConfiguration;
    }

    private DeliveryStreamElasticsearchDestinationConfigurationArgs() {
        this.bufferingHints = Input.empty();
        this.cloudWatchLoggingOptions = Input.empty();
        this.clusterEndpoint = Input.empty();
        this.domainARN = Input.empty();
        this.indexName = Input.empty();
        this.indexRotationPeriod = Input.empty();
        this.processingConfiguration = Input.empty();
        this.retryOptions = Input.empty();
        this.roleARN = Input.empty();
        this.s3BackupMode = Input.empty();
        this.s3Configuration = Input.empty();
        this.typeName = Input.empty();
        this.vpcConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamElasticsearchDestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DeliveryStreamElasticsearchBufferingHintsArgs> bufferingHints;
        private @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;
        private @Nullable Input<String> clusterEndpoint;
        private @Nullable Input<String> domainARN;
        private Input<String> indexName;
        private @Nullable Input<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod> indexRotationPeriod;
        private @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;
        private @Nullable Input<DeliveryStreamElasticsearchRetryOptionsArgs> retryOptions;
        private Input<String> roleARN;
        private @Nullable Input<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode> s3BackupMode;
        private Input<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration;
        private @Nullable Input<String> typeName;
        private @Nullable Input<DeliveryStreamVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamElasticsearchDestinationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bufferingHints = defaults.bufferingHints;
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.domainARN = defaults.domainARN;
    	      this.indexName = defaults.indexName;
    	      this.indexRotationPeriod = defaults.indexRotationPeriod;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryOptions = defaults.retryOptions;
    	      this.roleARN = defaults.roleARN;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.s3Configuration = defaults.s3Configuration;
    	      this.typeName = defaults.typeName;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder bufferingHints(@Nullable Input<DeliveryStreamElasticsearchBufferingHintsArgs> bufferingHints) {
            this.bufferingHints = bufferingHints;
            return this;
        }

        public Builder bufferingHints(@Nullable DeliveryStreamElasticsearchBufferingHintsArgs bufferingHints) {
            this.bufferingHints = Input.ofNullable(bufferingHints);
            return this;
        }

        public Builder cloudWatchLoggingOptions(@Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder cloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptionsArgs cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = Input.ofNullable(cloudWatchLoggingOptions);
            return this;
        }

        public Builder clusterEndpoint(@Nullable Input<String> clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder clusterEndpoint(@Nullable String clusterEndpoint) {
            this.clusterEndpoint = Input.ofNullable(clusterEndpoint);
            return this;
        }

        public Builder domainARN(@Nullable Input<String> domainARN) {
            this.domainARN = domainARN;
            return this;
        }

        public Builder domainARN(@Nullable String domainARN) {
            this.domainARN = Input.ofNullable(domainARN);
            return this;
        }

        public Builder indexName(Input<String> indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }

        public Builder indexName(String indexName) {
            this.indexName = Input.of(Objects.requireNonNull(indexName));
            return this;
        }

        public Builder indexRotationPeriod(@Nullable Input<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod> indexRotationPeriod) {
            this.indexRotationPeriod = indexRotationPeriod;
            return this;
        }

        public Builder indexRotationPeriod(@Nullable DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod indexRotationPeriod) {
            this.indexRotationPeriod = Input.ofNullable(indexRotationPeriod);
            return this;
        }

        public Builder processingConfiguration(@Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder processingConfiguration(@Nullable DeliveryStreamProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Input.ofNullable(processingConfiguration);
            return this;
        }

        public Builder retryOptions(@Nullable Input<DeliveryStreamElasticsearchRetryOptionsArgs> retryOptions) {
            this.retryOptions = retryOptions;
            return this;
        }

        public Builder retryOptions(@Nullable DeliveryStreamElasticsearchRetryOptionsArgs retryOptions) {
            this.retryOptions = Input.ofNullable(retryOptions);
            return this;
        }

        public Builder roleARN(Input<String> roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }

        public Builder roleARN(String roleARN) {
            this.roleARN = Input.of(Objects.requireNonNull(roleARN));
            return this;
        }

        public Builder s3BackupMode(@Nullable Input<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode> s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder s3BackupMode(@Nullable DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode s3BackupMode) {
            this.s3BackupMode = Input.ofNullable(s3BackupMode);
            return this;
        }

        public Builder s3Configuration(Input<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration) {
            this.s3Configuration = Objects.requireNonNull(s3Configuration);
            return this;
        }

        public Builder s3Configuration(DeliveryStreamS3DestinationConfigurationArgs s3Configuration) {
            this.s3Configuration = Input.of(Objects.requireNonNull(s3Configuration));
            return this;
        }

        public Builder typeName(@Nullable Input<String> typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder typeName(@Nullable String typeName) {
            this.typeName = Input.ofNullable(typeName);
            return this;
        }

        public Builder vpcConfiguration(@Nullable Input<DeliveryStreamVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder vpcConfiguration(@Nullable DeliveryStreamVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Input.ofNullable(vpcConfiguration);
            return this;
        }
        public DeliveryStreamElasticsearchDestinationConfigurationArgs build() {
            return new DeliveryStreamElasticsearchDestinationConfigurationArgs(bufferingHints, cloudWatchLoggingOptions, clusterEndpoint, domainARN, indexName, indexRotationPeriod, processingConfiguration, retryOptions, roleARN, s3BackupMode, s3Configuration, typeName, vpcConfiguration);
        }
    }
}
