// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="additionalAuthenticatedData")
      private final @Nullable Output<String> additionalAuthenticatedData;

    public Output<String> additionalAuthenticatedData() {
        return this.additionalAuthenticatedData == null ? Codegen.empty() : this.additionalAuthenticatedData;
    }

    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}'`
     * 
     */
    @Import(name="cryptoKey", required=true)
      private final Output<String> cryptoKey;

    public Output<String> cryptoKey() {
        return this.cryptoKey;
    }

    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="plaintext", required=true)
      private final Output<String> plaintext;

    public Output<String> plaintext() {
        return this.plaintext;
    }

    public SecretCiphertextArgs(
        @Nullable Output<String> additionalAuthenticatedData,
        Output<String> cryptoKey,
        Output<String> plaintext) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
        this.cryptoKey = Objects.requireNonNull(cryptoKey, "expected parameter 'cryptoKey' to be non-null");
        this.plaintext = Objects.requireNonNull(plaintext, "expected parameter 'plaintext' to be non-null");
    }

    private SecretCiphertextArgs() {
        this.additionalAuthenticatedData = Codegen.empty();
        this.cryptoKey = Codegen.empty();
        this.plaintext = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretCiphertextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> additionalAuthenticatedData;
        private Output<String> cryptoKey;
        private Output<String> plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretCiphertextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAuthenticatedData = defaults.additionalAuthenticatedData;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.plaintext = defaults.plaintext;
        }

        public Builder additionalAuthenticatedData(@Nullable Output<String> additionalAuthenticatedData) {
            this.additionalAuthenticatedData = additionalAuthenticatedData;
            return this;
        }
        public Builder additionalAuthenticatedData(@Nullable String additionalAuthenticatedData) {
            this.additionalAuthenticatedData = Codegen.ofNullable(additionalAuthenticatedData);
            return this;
        }
        public Builder cryptoKey(Output<String> cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }
        public Builder cryptoKey(String cryptoKey) {
            this.cryptoKey = Output.of(Objects.requireNonNull(cryptoKey));
            return this;
        }
        public Builder plaintext(Output<String> plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }
        public Builder plaintext(String plaintext) {
            this.plaintext = Output.of(Objects.requireNonNull(plaintext));
            return this;
        }        public SecretCiphertextArgs build() {
            return new SecretCiphertextArgs(additionalAuthenticatedData, cryptoKey, plaintext);
        }
    }
}
