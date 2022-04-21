// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotCopyState extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotCopyState Empty = new SnapshotCopyState();

    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The data encryption key identifier for the snapshot.
     * 
     */
    @Import(name="dataEncryptionKeyId")
    private @Nullable Output<String> dataEncryptionKeyId;

    public Optional<Output<String>> dataEncryptionKeyId() {
        return Optional.ofNullable(this.dataEncryptionKeyId);
    }

    /**
     * A description of what the snapshot is.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the snapshot is encrypted.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    @Import(name="outpostArn")
    private @Nullable Output<String> outpostArn;

    public Optional<Output<String>> outpostArn() {
        return Optional.ofNullable(this.outpostArn);
    }

    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    @Import(name="ownerAlias")
    private @Nullable Output<String> ownerAlias;

    public Optional<Output<String>> ownerAlias() {
        return Optional.ofNullable(this.ownerAlias);
    }

    /**
     * The AWS account ID of the snapshot owner.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * Indicates whether to permanently restore an archived snapshot.
     * 
     */
    @Import(name="permanentRestore")
    private @Nullable Output<Boolean> permanentRestore;

    public Optional<Output<Boolean>> permanentRestore() {
        return Optional.ofNullable(this.permanentRestore);
    }

    /**
     * The region of the source snapshot.
     * 
     */
    @Import(name="sourceRegion")
    private @Nullable Output<String> sourceRegion;

    public Optional<Output<String>> sourceRegion() {
        return Optional.ofNullable(this.sourceRegion);
    }

    /**
     * The ARN for the snapshot to be copied.
     * 
     */
    @Import(name="sourceSnapshotId")
    private @Nullable Output<String> sourceSnapshotId;

    public Optional<Output<String>> sourceSnapshotId() {
        return Optional.ofNullable(this.sourceSnapshotId);
    }

    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    @Import(name="storageTier")
    private @Nullable Output<String> storageTier;

    public Optional<Output<String>> storageTier() {
        return Optional.ofNullable(this.storageTier);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    @Import(name="temporaryRestoreDays")
    private @Nullable Output<Integer> temporaryRestoreDays;

    public Optional<Output<Integer>> temporaryRestoreDays() {
        return Optional.ofNullable(this.temporaryRestoreDays);
    }

    @Import(name="volumeId")
    private @Nullable Output<String> volumeId;

    public Optional<Output<String>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    /**
     * The size of the drive in GiBs.
     * 
     */
    @Import(name="volumeSize")
    private @Nullable Output<Integer> volumeSize;

    public Optional<Output<Integer>> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    private SnapshotCopyState() {}

    private SnapshotCopyState(SnapshotCopyState $) {
        this.arn = $.arn;
        this.dataEncryptionKeyId = $.dataEncryptionKeyId;
        this.description = $.description;
        this.encrypted = $.encrypted;
        this.kmsKeyId = $.kmsKeyId;
        this.outpostArn = $.outpostArn;
        this.ownerAlias = $.ownerAlias;
        this.ownerId = $.ownerId;
        this.permanentRestore = $.permanentRestore;
        this.sourceRegion = $.sourceRegion;
        this.sourceSnapshotId = $.sourceSnapshotId;
        this.storageTier = $.storageTier;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.temporaryRestoreDays = $.temporaryRestoreDays;
        this.volumeId = $.volumeId;
        this.volumeSize = $.volumeSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotCopyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotCopyState $;

        public Builder() {
            $ = new SnapshotCopyState();
        }

        public Builder(SnapshotCopyState defaults) {
            $ = new SnapshotCopyState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder dataEncryptionKeyId(@Nullable Output<String> dataEncryptionKeyId) {
            $.dataEncryptionKeyId = dataEncryptionKeyId;
            return this;
        }

        public Builder dataEncryptionKeyId(String dataEncryptionKeyId) {
            return dataEncryptionKeyId(Output.of(dataEncryptionKeyId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder outpostArn(@Nullable Output<String> outpostArn) {
            $.outpostArn = outpostArn;
            return this;
        }

        public Builder outpostArn(String outpostArn) {
            return outpostArn(Output.of(outpostArn));
        }

        public Builder ownerAlias(@Nullable Output<String> ownerAlias) {
            $.ownerAlias = ownerAlias;
            return this;
        }

        public Builder ownerAlias(String ownerAlias) {
            return ownerAlias(Output.of(ownerAlias));
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        public Builder permanentRestore(@Nullable Output<Boolean> permanentRestore) {
            $.permanentRestore = permanentRestore;
            return this;
        }

        public Builder permanentRestore(Boolean permanentRestore) {
            return permanentRestore(Output.of(permanentRestore));
        }

        public Builder sourceRegion(@Nullable Output<String> sourceRegion) {
            $.sourceRegion = sourceRegion;
            return this;
        }

        public Builder sourceRegion(String sourceRegion) {
            return sourceRegion(Output.of(sourceRegion));
        }

        public Builder sourceSnapshotId(@Nullable Output<String> sourceSnapshotId) {
            $.sourceSnapshotId = sourceSnapshotId;
            return this;
        }

        public Builder sourceSnapshotId(String sourceSnapshotId) {
            return sourceSnapshotId(Output.of(sourceSnapshotId));
        }

        public Builder storageTier(@Nullable Output<String> storageTier) {
            $.storageTier = storageTier;
            return this;
        }

        public Builder storageTier(String storageTier) {
            return storageTier(Output.of(storageTier));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder temporaryRestoreDays(@Nullable Output<Integer> temporaryRestoreDays) {
            $.temporaryRestoreDays = temporaryRestoreDays;
            return this;
        }

        public Builder temporaryRestoreDays(Integer temporaryRestoreDays) {
            return temporaryRestoreDays(Output.of(temporaryRestoreDays));
        }

        public Builder volumeId(@Nullable Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        public Builder volumeSize(Integer volumeSize) {
            return volumeSize(Output.of(volumeSize));
        }

        public SnapshotCopyState build() {
            return $;
        }
    }

}
