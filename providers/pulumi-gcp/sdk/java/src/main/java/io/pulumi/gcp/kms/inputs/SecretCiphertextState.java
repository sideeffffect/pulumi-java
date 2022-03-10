// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretCiphertextState extends io.pulumi.resources.ResourceArgs {

    public static final SecretCiphertextState Empty = new SecretCiphertextState();

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
     * Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    @InputImport(name="ciphertext")
      private final @Nullable Input<String> ciphertext;

    public Input<String> getCiphertext() {
        return this.ciphertext == null ? Input.empty() : this.ciphertext;
    }

    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}'`
     * 
     */
    @InputImport(name="cryptoKey")
      private final @Nullable Input<String> cryptoKey;

    public Input<String> getCryptoKey() {
        return this.cryptoKey == null ? Input.empty() : this.cryptoKey;
    }

    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="plaintext")
      private final @Nullable Input<String> plaintext;

    public Input<String> getPlaintext() {
        return this.plaintext == null ? Input.empty() : this.plaintext;
    }

    public SecretCiphertextState(
        @Nullable Input<String> additionalAuthenticatedData,
        @Nullable Input<String> ciphertext,
        @Nullable Input<String> cryptoKey,
        @Nullable Input<String> plaintext) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
        this.ciphertext = ciphertext;
        this.cryptoKey = cryptoKey;
        this.plaintext = plaintext;
    }

    private SecretCiphertextState() {
        this.additionalAuthenticatedData = Input.empty();
        this.ciphertext = Input.empty();
        this.cryptoKey = Input.empty();
        this.plaintext = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretCiphertextState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> additionalAuthenticatedData;
        private @Nullable Input<String> ciphertext;
        private @Nullable Input<String> cryptoKey;
        private @Nullable Input<String> plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretCiphertextState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAuthenticatedData = defaults.additionalAuthenticatedData;
    	      this.ciphertext = defaults.ciphertext;
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

        public Builder ciphertext(@Nullable Input<String> ciphertext) {
            this.ciphertext = ciphertext;
            return this;
        }

        public Builder ciphertext(@Nullable String ciphertext) {
            this.ciphertext = Input.ofNullable(ciphertext);
            return this;
        }

        public Builder cryptoKey(@Nullable Input<String> cryptoKey) {
            this.cryptoKey = cryptoKey;
            return this;
        }

        public Builder cryptoKey(@Nullable String cryptoKey) {
            this.cryptoKey = Input.ofNullable(cryptoKey);
            return this;
        }

        public Builder plaintext(@Nullable Input<String> plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        public Builder plaintext(@Nullable String plaintext) {
            this.plaintext = Input.ofNullable(plaintext);
            return this;
        }
        public SecretCiphertextState build() {
            return new SecretCiphertextState(additionalAuthenticatedData, ciphertext, cryptoKey, plaintext);
        }
    }
}
