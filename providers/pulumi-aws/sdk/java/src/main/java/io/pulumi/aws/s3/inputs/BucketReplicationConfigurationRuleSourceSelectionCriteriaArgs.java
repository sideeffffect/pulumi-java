// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs Empty = new BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs();

    /**
     * Match SSE-KMS encrypted objects (documented below). If specified, `replica_kms_key_id`
     * in `destination` must be specified as well.
     * 
     */
    @InputImport(name="sseKmsEncryptedObjects")
      private final @Nullable Input<BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects;

    public Input<BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> getSseKmsEncryptedObjects() {
        return this.sseKmsEncryptedObjects == null ? Input.empty() : this.sseKmsEncryptedObjects;
    }

    public BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs(@Nullable Input<BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    private BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs() {
        this.sseKmsEncryptedObjects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sseKmsEncryptedObjects = defaults.sseKmsEncryptedObjects;
        }

        public Builder sseKmsEncryptedObjects(@Nullable Input<BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }

        public Builder sseKmsEncryptedObjects(@Nullable BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = Input.ofNullable(sseKmsEncryptedObjects);
            return this;
        }
        public BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs build() {
            return new BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs(sseKmsEncryptedObjects);
        }
    }
}
