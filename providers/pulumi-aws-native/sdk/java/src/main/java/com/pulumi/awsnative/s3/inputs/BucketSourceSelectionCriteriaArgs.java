// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketReplicaModificationsArgs;
import com.pulumi.awsnative.s3.inputs.BucketSseKmsEncryptedObjectsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A container that describes additional filters for identifying the source objects that you want to replicate.
 * 
 */
public final class BucketSourceSelectionCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketSourceSelectionCriteriaArgs Empty = new BucketSourceSelectionCriteriaArgs();

    /**
     * A filter that you can specify for selection for modifications on replicas.
     * 
     */
    @Import(name="replicaModifications")
    private @Nullable Output<BucketReplicaModificationsArgs> replicaModifications;

    public Optional<Output<BucketReplicaModificationsArgs>> replicaModifications() {
        return Optional.ofNullable(this.replicaModifications);
    }

    /**
     * A container for filter information for the selection of Amazon S3 objects encrypted with AWS KMS.
     * 
     */
    @Import(name="sseKmsEncryptedObjects")
    private @Nullable Output<BucketSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects;

    public Optional<Output<BucketSseKmsEncryptedObjectsArgs>> sseKmsEncryptedObjects() {
        return Optional.ofNullable(this.sseKmsEncryptedObjects);
    }

    private BucketSourceSelectionCriteriaArgs() {}

    private BucketSourceSelectionCriteriaArgs(BucketSourceSelectionCriteriaArgs $) {
        this.replicaModifications = $.replicaModifications;
        this.sseKmsEncryptedObjects = $.sseKmsEncryptedObjects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketSourceSelectionCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketSourceSelectionCriteriaArgs $;

        public Builder() {
            $ = new BucketSourceSelectionCriteriaArgs();
        }

        public Builder(BucketSourceSelectionCriteriaArgs defaults) {
            $ = new BucketSourceSelectionCriteriaArgs(Objects.requireNonNull(defaults));
        }

        public Builder replicaModifications(@Nullable Output<BucketReplicaModificationsArgs> replicaModifications) {
            $.replicaModifications = replicaModifications;
            return this;
        }

        public Builder replicaModifications(BucketReplicaModificationsArgs replicaModifications) {
            return replicaModifications(Output.of(replicaModifications));
        }

        public Builder sseKmsEncryptedObjects(@Nullable Output<BucketSseKmsEncryptedObjectsArgs> sseKmsEncryptedObjects) {
            $.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }

        public Builder sseKmsEncryptedObjects(BucketSseKmsEncryptedObjectsArgs sseKmsEncryptedObjects) {
            return sseKmsEncryptedObjects(Output.of(sseKmsEncryptedObjects));
        }

        public BucketSourceSelectionCriteriaArgs build() {
            return $;
        }
    }

}
