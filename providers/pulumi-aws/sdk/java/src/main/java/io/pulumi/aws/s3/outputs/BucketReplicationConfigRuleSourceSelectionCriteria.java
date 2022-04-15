// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModifications;
import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjects;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketReplicationConfigRuleSourceSelectionCriteria {
    /**
     * A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModifications replicaModifications;
    /**
     * A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects;

    @CustomType.Constructor
    private BucketReplicationConfigRuleSourceSelectionCriteria(
        @CustomType.Parameter("replicaModifications") @Nullable BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModifications replicaModifications,
        @CustomType.Parameter("sseKmsEncryptedObjects") @Nullable BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.replicaModifications = replicaModifications;
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    /**
     * A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
     * 
    */
    public Optional<BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModifications> replicaModifications() {
        return Optional.ofNullable(this.replicaModifications);
    }
    /**
     * A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
     * 
    */
    public Optional<BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjects> sseKmsEncryptedObjects() {
        return Optional.ofNullable(this.sseKmsEncryptedObjects);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleSourceSelectionCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModifications replicaModifications;
        private @Nullable BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleSourceSelectionCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaModifications = defaults.replicaModifications;
    	      this.sseKmsEncryptedObjects = defaults.sseKmsEncryptedObjects;
        }

        public Builder replicaModifications(@Nullable BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModifications replicaModifications) {
            this.replicaModifications = replicaModifications;
            return this;
        }
        public Builder sseKmsEncryptedObjects(@Nullable BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }        public BucketReplicationConfigRuleSourceSelectionCriteria build() {
            return new BucketReplicationConfigRuleSourceSelectionCriteria(replicaModifications, sseKmsEncryptedObjects);
        }
    }
}
