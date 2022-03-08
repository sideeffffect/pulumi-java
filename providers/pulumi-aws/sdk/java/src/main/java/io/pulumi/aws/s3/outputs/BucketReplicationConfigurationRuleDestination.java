// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleDestinationAccessControlTranslation;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleDestinationMetrics;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleDestinationReplicationTime;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketReplicationConfigurationRuleDestination {
    /**
     * Specifies the overrides to use for object owners on replication. Must be used in conjunction with `account_id` owner override configuration.
     * 
     */
    private final @Nullable BucketReplicationConfigurationRuleDestinationAccessControlTranslation accessControlTranslation;
    /**
     * The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `access_control_translation` override configuration.
     * 
     */
    private final @Nullable String accountId;
    /**
     * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
     * 
     */
    private final String bucket;
    /**
     * Enables replication metrics (required for S3 RTC) (documented below).
     * 
     */
    private final @Nullable BucketReplicationConfigurationRuleDestinationMetrics metrics;
    /**
     * Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
     * `sse_kms_encrypted_objects` source selection criteria.
     * 
     */
    private final @Nullable String replicaKmsKeyId;
    /**
     * Enables S3 Replication Time Control (S3 RTC) (documented below).
     * 
     */
    private final @Nullable BucketReplicationConfigurationRuleDestinationReplicationTime replicationTime;
    /**
     * The [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Destination.html#AmazonS3-Type-Destination-StorageClass) used to store the object. By default, Amazon S3 uses the storage class of the source object to create the object replica.
     * 
     */
    private final @Nullable String storageClass;

    @OutputCustomType.Constructor({"accessControlTranslation","accountId","bucket","metrics","replicaKmsKeyId","replicationTime","storageClass"})
    private BucketReplicationConfigurationRuleDestination(
        @Nullable BucketReplicationConfigurationRuleDestinationAccessControlTranslation accessControlTranslation,
        @Nullable String accountId,
        String bucket,
        @Nullable BucketReplicationConfigurationRuleDestinationMetrics metrics,
        @Nullable String replicaKmsKeyId,
        @Nullable BucketReplicationConfigurationRuleDestinationReplicationTime replicationTime,
        @Nullable String storageClass) {
        this.accessControlTranslation = accessControlTranslation;
        this.accountId = accountId;
        this.bucket = bucket;
        this.metrics = metrics;
        this.replicaKmsKeyId = replicaKmsKeyId;
        this.replicationTime = replicationTime;
        this.storageClass = storageClass;
    }

    /**
     * Specifies the overrides to use for object owners on replication. Must be used in conjunction with `account_id` owner override configuration.
     * 
    */
    public Optional<BucketReplicationConfigurationRuleDestinationAccessControlTranslation> getAccessControlTranslation() {
        return Optional.ofNullable(this.accessControlTranslation);
    }
    /**
     * The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `access_control_translation` override configuration.
     * 
    */
    public Optional<String> getAccountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * Enables replication metrics (required for S3 RTC) (documented below).
     * 
    */
    public Optional<BucketReplicationConfigurationRuleDestinationMetrics> getMetrics() {
        return Optional.ofNullable(this.metrics);
    }
    /**
     * Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
     * `sse_kms_encrypted_objects` source selection criteria.
     * 
    */
    public Optional<String> getReplicaKmsKeyId() {
        return Optional.ofNullable(this.replicaKmsKeyId);
    }
    /**
     * Enables S3 Replication Time Control (S3 RTC) (documented below).
     * 
    */
    public Optional<BucketReplicationConfigurationRuleDestinationReplicationTime> getReplicationTime() {
        return Optional.ofNullable(this.replicationTime);
    }
    /**
     * The [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Destination.html#AmazonS3-Type-Destination-StorageClass) used to store the object. By default, Amazon S3 uses the storage class of the source object to create the object replica.
     * 
    */
    public Optional<String> getStorageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationConfigurationRuleDestinationAccessControlTranslation accessControlTranslation;
        private @Nullable String accountId;
        private String bucket;
        private @Nullable BucketReplicationConfigurationRuleDestinationMetrics metrics;
        private @Nullable String replicaKmsKeyId;
        private @Nullable BucketReplicationConfigurationRuleDestinationReplicationTime replicationTime;
        private @Nullable String storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlTranslation = defaults.accessControlTranslation;
    	      this.accountId = defaults.accountId;
    	      this.bucket = defaults.bucket;
    	      this.metrics = defaults.metrics;
    	      this.replicaKmsKeyId = defaults.replicaKmsKeyId;
    	      this.replicationTime = defaults.replicationTime;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder setAccessControlTranslation(@Nullable BucketReplicationConfigurationRuleDestinationAccessControlTranslation accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setMetrics(@Nullable BucketReplicationConfigurationRuleDestinationMetrics metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setReplicaKmsKeyId(@Nullable String replicaKmsKeyId) {
            this.replicaKmsKeyId = replicaKmsKeyId;
            return this;
        }

        public Builder setReplicationTime(@Nullable BucketReplicationConfigurationRuleDestinationReplicationTime replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }

        public Builder setStorageClass(@Nullable String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public BucketReplicationConfigurationRuleDestination build() {
            return new BucketReplicationConfigurationRuleDestination(accessControlTranslation, accountId, bucket, metrics, replicaKmsKeyId, replicationTime, storageClass);
        }
    }
}
