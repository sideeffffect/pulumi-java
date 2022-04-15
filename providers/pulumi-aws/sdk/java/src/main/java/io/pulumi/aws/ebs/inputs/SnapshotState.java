// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotState extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotState Empty = new SnapshotState();

    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The data encryption key identifier for the snapshot.
     * 
     */
    @Import(name="dataEncryptionKeyId")
      private final @Nullable Output<String> dataEncryptionKeyId;

    public Output<String> dataEncryptionKeyId() {
        return this.dataEncryptionKeyId == null ? Codegen.empty() : this.dataEncryptionKeyId;
    }

    /**
     * A description of what the snapshot is.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether the snapshot is encrypted.
     * 
     */
    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> encrypted() {
        return this.encrypted == null ? Codegen.empty() : this.encrypted;
    }

    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
     * 
     */
    @Import(name="outpostArn")
      private final @Nullable Output<String> outpostArn;

    public Output<String> outpostArn() {
        return this.outpostArn == null ? Codegen.empty() : this.outpostArn;
    }

    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    @Import(name="ownerAlias")
      private final @Nullable Output<String> ownerAlias;

    public Output<String> ownerAlias() {
        return this.ownerAlias == null ? Codegen.empty() : this.ownerAlias;
    }

    /**
     * The AWS account ID of the EBS snapshot owner.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> ownerId() {
        return this.ownerId == null ? Codegen.empty() : this.ownerId;
    }

    /**
     * Indicates whether to permanently restore an archived snapshot.
     * 
     */
    @Import(name="permanentRestore")
      private final @Nullable Output<Boolean> permanentRestore;

    public Output<Boolean> permanentRestore() {
        return this.permanentRestore == null ? Codegen.empty() : this.permanentRestore;
    }

    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    @Import(name="storageTier")
      private final @Nullable Output<String> storageTier;

    public Output<String> storageTier() {
        return this.storageTier == null ? Codegen.empty() : this.storageTier;
    }

    /**
     * A map of tags to assign to the snapshot. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    @Import(name="temporaryRestoreDays")
      private final @Nullable Output<Integer> temporaryRestoreDays;

    public Output<Integer> temporaryRestoreDays() {
        return this.temporaryRestoreDays == null ? Codegen.empty() : this.temporaryRestoreDays;
    }

    /**
     * The Volume ID of which to make a snapshot.
     * 
     */
    @Import(name="volumeId")
      private final @Nullable Output<String> volumeId;

    public Output<String> volumeId() {
        return this.volumeId == null ? Codegen.empty() : this.volumeId;
    }

    /**
     * The size of the drive in GiBs.
     * 
     */
    @Import(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> volumeSize() {
        return this.volumeSize == null ? Codegen.empty() : this.volumeSize;
    }

    public SnapshotState(
        @Nullable Output<String> arn,
        @Nullable Output<String> dataEncryptionKeyId,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> outpostArn,
        @Nullable Output<String> ownerAlias,
        @Nullable Output<String> ownerId,
        @Nullable Output<Boolean> permanentRestore,
        @Nullable Output<String> storageTier,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Integer> temporaryRestoreDays,
        @Nullable Output<String> volumeId,
        @Nullable Output<Integer> volumeSize) {
        this.arn = arn;
        this.dataEncryptionKeyId = dataEncryptionKeyId;
        this.description = description;
        this.encrypted = encrypted;
        this.kmsKeyId = kmsKeyId;
        this.outpostArn = outpostArn;
        this.ownerAlias = ownerAlias;
        this.ownerId = ownerId;
        this.permanentRestore = permanentRestore;
        this.storageTier = storageTier;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.temporaryRestoreDays = temporaryRestoreDays;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
    }

    private SnapshotState() {
        this.arn = Codegen.empty();
        this.dataEncryptionKeyId = Codegen.empty();
        this.description = Codegen.empty();
        this.encrypted = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.outpostArn = Codegen.empty();
        this.ownerAlias = Codegen.empty();
        this.ownerId = Codegen.empty();
        this.permanentRestore = Codegen.empty();
        this.storageTier = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.temporaryRestoreDays = Codegen.empty();
        this.volumeId = Codegen.empty();
        this.volumeSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> dataEncryptionKeyId;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> outpostArn;
        private @Nullable Output<String> ownerAlias;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<Boolean> permanentRestore;
        private @Nullable Output<String> storageTier;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Integer> temporaryRestoreDays;
        private @Nullable Output<String> volumeId;
        private @Nullable Output<Integer> volumeSize;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataEncryptionKeyId = defaults.dataEncryptionKeyId;
    	      this.description = defaults.description;
    	      this.encrypted = defaults.encrypted;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerAlias = defaults.ownerAlias;
    	      this.ownerId = defaults.ownerId;
    	      this.permanentRestore = defaults.permanentRestore;
    	      this.storageTier = defaults.storageTier;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.temporaryRestoreDays = defaults.temporaryRestoreDays;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSize = defaults.volumeSize;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder dataEncryptionKeyId(@Nullable Output<String> dataEncryptionKeyId) {
            this.dataEncryptionKeyId = dataEncryptionKeyId;
            return this;
        }
        public Builder dataEncryptionKeyId(@Nullable String dataEncryptionKeyId) {
            this.dataEncryptionKeyId = Codegen.ofNullable(dataEncryptionKeyId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Codegen.ofNullable(encrypted);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder outpostArn(@Nullable Output<String> outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }
        public Builder outpostArn(@Nullable String outpostArn) {
            this.outpostArn = Codegen.ofNullable(outpostArn);
            return this;
        }
        public Builder ownerAlias(@Nullable Output<String> ownerAlias) {
            this.ownerAlias = ownerAlias;
            return this;
        }
        public Builder ownerAlias(@Nullable String ownerAlias) {
            this.ownerAlias = Codegen.ofNullable(ownerAlias);
            return this;
        }
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Codegen.ofNullable(ownerId);
            return this;
        }
        public Builder permanentRestore(@Nullable Output<Boolean> permanentRestore) {
            this.permanentRestore = permanentRestore;
            return this;
        }
        public Builder permanentRestore(@Nullable Boolean permanentRestore) {
            this.permanentRestore = Codegen.ofNullable(permanentRestore);
            return this;
        }
        public Builder storageTier(@Nullable Output<String> storageTier) {
            this.storageTier = storageTier;
            return this;
        }
        public Builder storageTier(@Nullable String storageTier) {
            this.storageTier = Codegen.ofNullable(storageTier);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder temporaryRestoreDays(@Nullable Output<Integer> temporaryRestoreDays) {
            this.temporaryRestoreDays = temporaryRestoreDays;
            return this;
        }
        public Builder temporaryRestoreDays(@Nullable Integer temporaryRestoreDays) {
            this.temporaryRestoreDays = Codegen.ofNullable(temporaryRestoreDays);
            return this;
        }
        public Builder volumeId(@Nullable Output<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Codegen.ofNullable(volumeId);
            return this;
        }
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Codegen.ofNullable(volumeSize);
            return this;
        }        public SnapshotState build() {
            return new SnapshotState(arn, dataEncryptionKeyId, description, encrypted, kmsKeyId, outpostArn, ownerAlias, ownerId, permanentRestore, storageTier, tags, tagsAll, temporaryRestoreDays, volumeId, volumeSize);
        }
    }
}
