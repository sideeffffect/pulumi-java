// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationAccessControlTranslationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationArgs Empty = new BucketReplicationConfigRuleDestinationArgs();

    /**
     * A configuration block that specifies the overrides to use for object owners on replication documented below. Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object. Must be used in conjunction with `account` owner override configuration.
     * 
     */
    @InputImport(name="accessControlTranslation")
      private final @Nullable Input<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> accessControlTranslation;

    public Input<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> getAccessControlTranslation() {
        return this.accessControlTranslation == null ? Input.empty() : this.accessControlTranslation;
    }

    /**
     * The Account ID to specify the replica ownership. Must be used in conjunction with `access_control_translation` override configuration.
     * 
     */
    @InputImport(name="account")
      private final @Nullable Input<String> account;

    public Input<String> getAccount() {
        return this.account == null ? Input.empty() : this.account;
    }

    /**
     * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the objects identified by the rule.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * A configuration block that provides information about encryption documented below. If `source_selection_criteria` is specified, you must specify this element.
     * 
     */
    @InputImport(name="encryptionConfiguration")
      private final @Nullable Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> encryptionConfiguration;

    public Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    /**
     * A configuration block that specifies replication metrics-related settings enabling replication metrics and events documented below.
     * 
     */
    @InputImport(name="metrics")
      private final @Nullable Input<BucketReplicationConfigRuleDestinationMetricsArgs> metrics;

    public Input<BucketReplicationConfigRuleDestinationMetricsArgs> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    /**
     * A configuration block that specifies S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated documented below. Replication Time Control must be used in conjunction with `metrics`.
     * 
     */
    @InputImport(name="replicationTime")
      private final @Nullable Input<BucketReplicationConfigRuleDestinationReplicationTimeArgs> replicationTime;

    public Input<BucketReplicationConfigRuleDestinationReplicationTimeArgs> getReplicationTime() {
        return this.replicationTime == null ? Input.empty() : this.replicationTime;
    }

    /**
     * The [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Destination.html#AmazonS3-Type-Destination-StorageClass) used to store the object. By default, Amazon S3 uses the storage class of the source object to create the object replica.
     * 
     */
    @InputImport(name="storageClass")
      private final @Nullable Input<String> storageClass;

    public Input<String> getStorageClass() {
        return this.storageClass == null ? Input.empty() : this.storageClass;
    }

    public BucketReplicationConfigRuleDestinationArgs(
        @Nullable Input<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> accessControlTranslation,
        @Nullable Input<String> account,
        Input<String> bucket,
        @Nullable Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Input<BucketReplicationConfigRuleDestinationMetricsArgs> metrics,
        @Nullable Input<BucketReplicationConfigRuleDestinationReplicationTimeArgs> replicationTime,
        @Nullable Input<String> storageClass) {
        this.accessControlTranslation = accessControlTranslation;
        this.account = account;
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.encryptionConfiguration = encryptionConfiguration;
        this.metrics = metrics;
        this.replicationTime = replicationTime;
        this.storageClass = storageClass;
    }

    private BucketReplicationConfigRuleDestinationArgs() {
        this.accessControlTranslation = Input.empty();
        this.account = Input.empty();
        this.bucket = Input.empty();
        this.encryptionConfiguration = Input.empty();
        this.metrics = Input.empty();
        this.replicationTime = Input.empty();
        this.storageClass = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> accessControlTranslation;
        private @Nullable Input<String> account;
        private Input<String> bucket;
        private @Nullable Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Input<BucketReplicationConfigRuleDestinationMetricsArgs> metrics;
        private @Nullable Input<BucketReplicationConfigRuleDestinationReplicationTimeArgs> replicationTime;
        private @Nullable Input<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlTranslation = defaults.accessControlTranslation;
    	      this.account = defaults.account;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.metrics = defaults.metrics;
    	      this.replicationTime = defaults.replicationTime;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder accessControlTranslation(@Nullable Input<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }

        public Builder accessControlTranslation(@Nullable BucketReplicationConfigRuleDestinationAccessControlTranslationArgs accessControlTranslation) {
            this.accessControlTranslation = Input.ofNullable(accessControlTranslation);
            return this;
        }

        public Builder account(@Nullable Input<String> account) {
            this.account = account;
            return this;
        }

        public Builder account(@Nullable String account) {
            this.account = Input.ofNullable(account);
            return this;
        }

        public Builder bucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder encryptionConfiguration(@Nullable Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder encryptionConfiguration(@Nullable BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder metrics(@Nullable Input<BucketReplicationConfigRuleDestinationMetricsArgs> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder metrics(@Nullable BucketReplicationConfigRuleDestinationMetricsArgs metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder replicationTime(@Nullable Input<BucketReplicationConfigRuleDestinationReplicationTimeArgs> replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }

        public Builder replicationTime(@Nullable BucketReplicationConfigRuleDestinationReplicationTimeArgs replicationTime) {
            this.replicationTime = Input.ofNullable(replicationTime);
            return this;
        }

        public Builder storageClass(@Nullable Input<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder storageClass(@Nullable String storageClass) {
            this.storageClass = Input.ofNullable(storageClass);
            return this;
        }
        public BucketReplicationConfigRuleDestinationArgs build() {
            return new BucketReplicationConfigRuleDestinationArgs(accessControlTranslation, account, bucket, encryptionConfiguration, metrics, replicationTime, storageClass);
        }
    }
}
