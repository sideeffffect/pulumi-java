// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UploadState extends io.pulumi.resources.ResourceArgs {

    public static final UploadState Empty = new UploadState();

    /**
     * The Amazon Resource Name of this upload.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The upload's category.
     * 
     */
    @InputImport(name="category")
      private final @Nullable Input<String> category;

    public Input<String> getCategory() {
        return this.category == null ? Input.empty() : this.category;
    }

    /**
     * The upload's content type (for example, application/octet-stream).
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * The upload's metadata. For example, for Android, this contains information that is parsed from the manifest and is displayed in the AWS Device Farm console after the associated app is uploaded.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<String> metadata;

    public Input<String> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The upload's file name. The name should not contain any forward slashes (/). If you are uploading an iOS app, the file name must end with the .ipa extension. If you are uploading an Android app, the file name must end with the .apk extension. For all others, the file name must end with the .zip file extension.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ARN of the project for the upload.
     * 
     */
    @InputImport(name="projectArn")
      private final @Nullable Input<String> projectArn;

    public Input<String> getProjectArn() {
        return this.projectArn == null ? Input.empty() : this.projectArn;
    }

    /**
     * The upload's upload type. See [AWS Docs](https://docs.aws.amazon.com/devicefarm/latest/APIReference/API_CreateUpload.html#API_CreateUpload_RequestSyntax) for valid list of values.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The presigned Amazon S3 URL that was used to store a file using a PUT request.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public UploadState(
        @Nullable Input<String> arn,
        @Nullable Input<String> category,
        @Nullable Input<String> contentType,
        @Nullable Input<String> metadata,
        @Nullable Input<String> name,
        @Nullable Input<String> projectArn,
        @Nullable Input<String> type,
        @Nullable Input<String> url) {
        this.arn = arn;
        this.category = category;
        this.contentType = contentType;
        this.metadata = metadata;
        this.name = name;
        this.projectArn = projectArn;
        this.type = type;
        this.url = url;
    }

    private UploadState() {
        this.arn = Input.empty();
        this.category = Input.empty();
        this.contentType = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.projectArn = Input.empty();
        this.type = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UploadState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> category;
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<String> projectArn;
        private @Nullable Input<String> type;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(UploadState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.category = defaults.category;
    	      this.contentType = defaults.contentType;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.projectArn = defaults.projectArn;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder category(@Nullable Input<String> category) {
            this.category = category;
            return this;
        }

        public Builder category(@Nullable String category) {
            this.category = Input.ofNullable(category);
            return this;
        }

        public Builder contentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder metadata(@Nullable Input<String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable String metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder projectArn(@Nullable Input<String> projectArn) {
            this.projectArn = projectArn;
            return this;
        }

        public Builder projectArn(@Nullable String projectArn) {
            this.projectArn = Input.ofNullable(projectArn);
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

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public UploadState build() {
            return new UploadState(arn, category, contentType, metadata, name, projectArn, type, url);
        }
    }
}
