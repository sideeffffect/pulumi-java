// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretCiphertextArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretCiphertextArgs Empty = new SecretCiphertextArgs();

    /**
     * The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="additionalAuthenticatedData")
      private final @Nullable Input<String> additionalAuthenticatedData;

    public Input<String> getAdditionalAuthenticatedData() {
        return this.additionalAuthenticatedData == null ? Input.empty() : this.additionalAuthenticatedData;
    }

    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}'`
     * 
     */
    @InputImport(name="cryptoKey", required=true)
      private final Input<String> cryptoKey;

    public Input<String> getCryptoKey() {
        return this.cryptoKey;
    }

    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="plaintext", required=true)
      private final Input<String> plaintext;

    public Input<String> getPlaintext() {
        return this.plaintext;
    }

    public SecretCiphertextArgs(
        @Nullable Input<String> additionalAuthenticatedData,
        Input<String> cryptoKey,
        Input<String> plaintext) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
        this.cryptoKey = Objects.requireNonNull(cryptoKey, "expected parameter 'cryptoKey' to be non-null");
        this.plaintext = Objects.requireNonNull(plaintext, "expected parameter 'plaintext' to be non-null");
    }

    private SecretCiphertextArgs() {
        this.additionalAuthenticatedData = Input.empty();
        this.cryptoKey = Input.empty();
        this.plaintext = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretCiphertextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> additionalAuthenticatedData;
        private Input<String> cryptoKey;
        private Input<String> plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretCiphertextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAuthenticatedData = defaults.additionalAuthenticatedData;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.plaintext = defaults.plaintext;
        }

        public Builder additionalAuthenticatedData(@Nullable Input<String> additionalAuthenticatedData) {
            this.additionalAuthenticatedData = additionalAuthenticatedData;
            return this;
        }

        public Builder additionalAuthenticatedData(@Nullable String additionalAuthenticatedData) {
            this.additionalAuthenticatedData = Input.ofNullable(additionalAuthenticatedData);
            return this;
        }

        public Builder cryptoKey(Input<String> cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public Builder cryptoKey(String cryptoKey) {
            this.cryptoKey = Input.of(Objects.requireNonNull(cryptoKey));
            return this;
        }

        public Builder plaintext(Input<String> plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }

        public Builder plaintext(String plaintext) {
            this.plaintext = Input.of(Objects.requireNonNull(plaintext));
            return this;
        }
        public SecretCiphertextArgs build() {
            return new SecretCiphertextArgs(additionalAuthenticatedData, cryptoKey, plaintext);
        }
    }
}
