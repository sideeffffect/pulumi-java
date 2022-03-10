// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of Amazon S3 Compatible dataset.
 * 
 */
public final class AmazonS3CompatibleLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmazonS3CompatibleLocationArgs Empty = new AmazonS3CompatibleLocationArgs();

    /**
     * Specify the bucketName of Amazon S3 Compatible. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="bucketName")
      private final @Nullable Input<Object> bucketName;

    public Input<Object> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileName")
      private final @Nullable Input<Object> fileName;

    public Input<Object> getFileName() {
        return this.fileName == null ? Input.empty() : this.fileName;
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="folderPath")
      private final @Nullable Input<Object> folderPath;

    public Input<Object> getFolderPath() {
        return this.folderPath == null ? Input.empty() : this.folderPath;
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'AmazonS3CompatibleLocation'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Specify the version of Amazon S3 Compatible. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<Object> version;

    public Input<Object> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public AmazonS3CompatibleLocationArgs(
        @Nullable Input<Object> bucketName,
        @Nullable Input<Object> fileName,
        @Nullable Input<Object> folderPath,
        Input<String> type,
        @Nullable Input<Object> version) {
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = version;
    }

    private AmazonS3CompatibleLocationArgs() {
        this.bucketName = Input.empty();
        this.fileName = Input.empty();
        this.folderPath = Input.empty();
        this.type = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3CompatibleLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> bucketName;
        private @Nullable Input<Object> fileName;
        private @Nullable Input<Object> folderPath;
        private Input<String> type;
        private @Nullable Input<Object> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3CompatibleLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder bucketName(@Nullable Input<Object> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable Object bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder fileName(@Nullable Input<Object> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileName(@Nullable Object fileName) {
            this.fileName = Input.ofNullable(fileName);
            return this;
        }

        public Builder folderPath(@Nullable Input<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = Input.ofNullable(folderPath);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder version(@Nullable Input<Object> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable Object version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public AmazonS3CompatibleLocationArgs build() {
            return new AmazonS3CompatibleLocationArgs(bucketName, fileName, folderPath, type, version);
        }
    }
}
