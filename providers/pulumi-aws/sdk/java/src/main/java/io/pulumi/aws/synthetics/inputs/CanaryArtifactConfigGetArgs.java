// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.aws.synthetics.inputs.CanaryArtifactConfigS3EncryptionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryArtifactConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryArtifactConfigGetArgs Empty = new CanaryArtifactConfigGetArgs();

    /**
     * Configuration of the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See S3 Encryption.
     * 
     */
    @InputImport(name="s3Encryption")
      private final @Nullable Input<CanaryArtifactConfigS3EncryptionGetArgs> s3Encryption;

    public Input<CanaryArtifactConfigS3EncryptionGetArgs> getS3Encryption() {
        return this.s3Encryption == null ? Input.empty() : this.s3Encryption;
    }

    public CanaryArtifactConfigGetArgs(@Nullable Input<CanaryArtifactConfigS3EncryptionGetArgs> s3Encryption) {
        this.s3Encryption = s3Encryption;
    }

    private CanaryArtifactConfigGetArgs() {
        this.s3Encryption = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryArtifactConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CanaryArtifactConfigS3EncryptionGetArgs> s3Encryption;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryArtifactConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Encryption = defaults.s3Encryption;
        }

        public Builder s3Encryption(@Nullable Input<CanaryArtifactConfigS3EncryptionGetArgs> s3Encryption) {
            this.s3Encryption = s3Encryption;
            return this;
        }

        public Builder s3Encryption(@Nullable CanaryArtifactConfigS3EncryptionGetArgs s3Encryption) {
            this.s3Encryption = Input.ofNullable(s3Encryption);
            return this;
        }
        public CanaryArtifactConfigGetArgs build() {
            return new CanaryArtifactConfigGetArgs(s3Encryption);
        }
    }
}
