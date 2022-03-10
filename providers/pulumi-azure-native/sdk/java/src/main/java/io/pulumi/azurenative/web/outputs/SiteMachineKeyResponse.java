// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SiteMachineKeyResponse {
    /**
     * Algorithm used for decryption.
     * 
     */
    private final @Nullable String decryption;
    /**
     * Decryption key.
     * 
     */
    private final @Nullable String decryptionKey;
    /**
     * MachineKey validation.
     * 
     */
    private final @Nullable String validation;
    /**
     * Validation key.
     * 
     */
    private final @Nullable String validationKey;

    @OutputCustomType.Constructor
    private SiteMachineKeyResponse(
        @OutputCustomType.Parameter("decryption") @Nullable String decryption,
        @OutputCustomType.Parameter("decryptionKey") @Nullable String decryptionKey,
        @OutputCustomType.Parameter("validation") @Nullable String validation,
        @OutputCustomType.Parameter("validationKey") @Nullable String validationKey) {
        this.decryption = decryption;
        this.decryptionKey = decryptionKey;
        this.validation = validation;
        this.validationKey = validationKey;
    }

    /**
     * Algorithm used for decryption.
     * 
    */
    public Optional<String> getDecryption() {
        return Optional.ofNullable(this.decryption);
    }
    /**
     * Decryption key.
     * 
    */
    public Optional<String> getDecryptionKey() {
        return Optional.ofNullable(this.decryptionKey);
    }
    /**
     * MachineKey validation.
     * 
    */
    public Optional<String> getValidation() {
        return Optional.ofNullable(this.validation);
    }
    /**
     * Validation key.
     * 
    */
    public Optional<String> getValidationKey() {
        return Optional.ofNullable(this.validationKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteMachineKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String decryption;
        private @Nullable String decryptionKey;
        private @Nullable String validation;
        private @Nullable String validationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteMachineKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decryption = defaults.decryption;
    	      this.decryptionKey = defaults.decryptionKey;
    	      this.validation = defaults.validation;
    	      this.validationKey = defaults.validationKey;
        }

        public Builder decryption(@Nullable String decryption) {
            this.decryption = decryption;
            return this;
        }

        public Builder decryptionKey(@Nullable String decryptionKey) {
            this.decryptionKey = decryptionKey;
            return this;
        }

        public Builder validation(@Nullable String validation) {
            this.validation = validation;
            return this;
        }

        public Builder validationKey(@Nullable String validationKey) {
            this.validationKey = validationKey;
            return this;
        }
        public SiteMachineKeyResponse build() {
            return new SiteMachineKeyResponse(decryption, decryptionKey, validation, validationKey);
        }
    }
}
