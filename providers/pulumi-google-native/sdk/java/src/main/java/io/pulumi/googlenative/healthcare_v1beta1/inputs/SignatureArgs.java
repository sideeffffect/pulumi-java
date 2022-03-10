// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.ImageArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User signature.
 * 
 */
public final class SignatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final SignatureArgs Empty = new SignatureArgs();

    /**
     * Optional. An image of the user's signature.
     * 
     */
    @InputImport(name="image")
      private final @Nullable Input<ImageArgs> image;

    public Input<ImageArgs> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Optional. Metadata associated with the user's signature. For example, the user's name or the user's title.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Optional. Timestamp of the signature.
     * 
     */
    @InputImport(name="signatureTime")
      private final @Nullable Input<String> signatureTime;

    public Input<String> getSignatureTime() {
        return this.signatureTime == null ? Input.empty() : this.signatureTime;
    }

    /**
     * User's UUID provided by the client.
     * 
     */
    @InputImport(name="userId", required=true)
      private final Input<String> userId;

    public Input<String> getUserId() {
        return this.userId;
    }

    public SignatureArgs(
        @Nullable Input<ImageArgs> image,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> signatureTime,
        Input<String> userId) {
        this.image = image;
        this.metadata = metadata;
        this.signatureTime = signatureTime;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private SignatureArgs() {
        this.image = Input.empty();
        this.metadata = Input.empty();
        this.signatureTime = Input.empty();
        this.userId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ImageArgs> image;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> signatureTime;
        private Input<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(SignatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.metadata = defaults.metadata;
    	      this.signatureTime = defaults.signatureTime;
    	      this.userId = defaults.userId;
        }

        public Builder image(@Nullable Input<ImageArgs> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable ImageArgs image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder metadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder signatureTime(@Nullable Input<String> signatureTime) {
            this.signatureTime = signatureTime;
            return this;
        }

        public Builder signatureTime(@Nullable String signatureTime) {
            this.signatureTime = Input.ofNullable(signatureTime);
            return this;
        }

        public Builder userId(Input<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Input.of(Objects.requireNonNull(userId));
            return this;
        }
        public SignatureArgs build() {
            return new SignatureArgs(image, metadata, signatureTime, userId);
        }
    }
}
