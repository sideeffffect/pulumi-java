// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryEncryptionConfiguration {
    /**
     * The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
     * 
     */
    private final @Nullable String encryptionType;
    /**
     * The ARN of the KMS key to use when `encryption_type` is `KMS`. If not specified, uses the default AWS managed key for ECR.
     * 
     */
    private final @Nullable String kmsKey;

    @CustomType.Constructor
    private RepositoryEncryptionConfiguration(
        @CustomType.Parameter("encryptionType") @Nullable String encryptionType,
        @CustomType.Parameter("kmsKey") @Nullable String kmsKey) {
        this.encryptionType = encryptionType;
        this.kmsKey = kmsKey;
    }

    /**
     * The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
     * 
    */
    public Optional<String> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }
    /**
     * The ARN of the KMS key to use when `encryption_type` is `KMS`. If not specified, uses the default AWS managed key for ECR.
     * 
    */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encryptionType;
        private @Nullable String kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionType = defaults.encryptionType;
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder encryptionType(@Nullable String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }        public RepositoryEncryptionConfiguration build() {
            return new RepositoryEncryptionConfiguration(encryptionType, kmsKey);
        }
    }
}
