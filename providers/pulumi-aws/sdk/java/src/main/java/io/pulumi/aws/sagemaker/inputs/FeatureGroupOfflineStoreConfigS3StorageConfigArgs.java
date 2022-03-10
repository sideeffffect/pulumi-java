// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupOfflineStoreConfigS3StorageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOfflineStoreConfigS3StorageConfigArgs Empty = new FeatureGroupOfflineStoreConfigS3StorageConfigArgs();

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The S3 URI, or location in Amazon S3, of OfflineStore.
     * 
     */
    @InputImport(name="s3Uri", required=true)
      private final Input<String> s3Uri;

    public Input<String> getS3Uri() {
        return this.s3Uri;
    }

    public FeatureGroupOfflineStoreConfigS3StorageConfigArgs(
        @Nullable Input<String> kmsKeyId,
        Input<String> s3Uri) {
        this.kmsKeyId = kmsKeyId;
        this.s3Uri = Objects.requireNonNull(s3Uri, "expected parameter 's3Uri' to be non-null");
    }

    private FeatureGroupOfflineStoreConfigS3StorageConfigArgs() {
        this.kmsKeyId = Input.empty();
        this.s3Uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigS3StorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;
        private Input<String> s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOfflineStoreConfigS3StorageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder s3Uri(Input<String> s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }

        public Builder s3Uri(String s3Uri) {
            this.s3Uri = Input.of(Objects.requireNonNull(s3Uri));
            return this;
        }
        public FeatureGroupOfflineStoreConfigS3StorageConfigArgs build() {
            return new FeatureGroupOfflineStoreConfigS3StorageConfigArgs(kmsKeyId, s3Uri);
        }
    }
}
