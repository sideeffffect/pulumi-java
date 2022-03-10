// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupState extends io.pulumi.resources.ResourceArgs {

    public static final BackupState Empty = new BackupState();

    /**
     * Amazon Resource Name of the backup.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The ID of the file system to back up. Required if backing up Lustre or Windows file systems.
     * 
     */
    @InputImport(name="fileSystemId")
      private final @Nullable Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId == null ? Input.empty() : this.fileSystemId;
    }

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the backup of the Amazon FSx file system's data at rest.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * AWS account identifier that created the file system.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The type of the file system backup.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The ID of the volume to back up. Required if backing up a ONTAP Volume.
     * 
     */
    @InputImport(name="volumeId")
      private final @Nullable Input<String> volumeId;

    public Input<String> getVolumeId() {
        return this.volumeId == null ? Input.empty() : this.volumeId;
    }

    public BackupState(
        @Nullable Input<String> arn,
        @Nullable Input<String> fileSystemId,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> ownerId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> type,
        @Nullable Input<String> volumeId) {
        this.arn = arn;
        this.fileSystemId = fileSystemId;
        this.kmsKeyId = kmsKeyId;
        this.ownerId = ownerId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
        this.volumeId = volumeId;
    }

    private BackupState() {
        this.arn = Input.empty();
        this.fileSystemId = Input.empty();
        this.kmsKeyId = Input.empty();
        this.ownerId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.type = Input.empty();
        this.volumeId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> fileSystemId;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> type;
        private @Nullable Input<String> volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder fileSystemId(@Nullable Input<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        public Builder fileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = Input.ofNullable(fileSystemId);
            return this;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder ownerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder volumeId(@Nullable Input<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Input.ofNullable(volumeId);
            return this;
        }
        public BackupState build() {
            return new BackupState(arn, fileSystemId, kmsKeyId, ownerId, tags, tagsAll, type, volumeId);
        }
    }
}
