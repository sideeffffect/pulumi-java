// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties {
    /**
     * The bucket name used to store the data.
     * 
     */
    private final String bucketName;
    /**
     * Either SSE_KMS or SSE_S3.
     * 
     */
    private final String encryptionOption;
    /**
     * Must be provided if SSE_KMS is specified as the encryption option
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * String used to prefix all data in the bucket.
     * 
     */
    private final @Nullable String objectKeyPrefix;

    @OutputCustomType.Constructor({"bucketName","encryptionOption","kmsKeyId","objectKeyPrefix"})
    private MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties(
        String bucketName,
        String encryptionOption,
        @Nullable String kmsKeyId,
        @Nullable String objectKeyPrefix) {
        this.bucketName = bucketName;
        this.encryptionOption = encryptionOption;
        this.kmsKeyId = kmsKeyId;
        this.objectKeyPrefix = objectKeyPrefix;
    }

    /**
     * The bucket name used to store the data.
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * Either SSE_KMS or SSE_S3.
     * 
    */
    public String getEncryptionOption() {
        return this.encryptionOption;
    }
    /**
     * Must be provided if SSE_KMS is specified as the encryption option
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * String used to prefix all data in the bucket.
     * 
    */
    public Optional<String> getObjectKeyPrefix() {
        return Optional.ofNullable(this.objectKeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String encryptionOption;
        private @Nullable String kmsKeyId;
        private @Nullable String objectKeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.objectKeyPrefix = defaults.objectKeyPrefix;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setEncryptionOption(String encryptionOption) {
            this.encryptionOption = Objects.requireNonNull(encryptionOption);
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setObjectKeyPrefix(@Nullable String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }
        public MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties build() {
            return new MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties(bucketName, encryptionOption, kmsKeyId, objectKeyPrefix);
        }
    }
}
