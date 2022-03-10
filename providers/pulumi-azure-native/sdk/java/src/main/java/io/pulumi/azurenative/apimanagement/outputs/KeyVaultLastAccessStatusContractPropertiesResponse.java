// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultLastAccessStatusContractPropertiesResponse {
    /**
     * Last status code for sync and refresh of secret from key vault.
     * 
     */
    private final @Nullable String code;
    /**
     * Details of the error else empty.
     * 
     */
    private final @Nullable String message;
    /**
     * Last time secret was accessed. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final @Nullable String timeStampUtc;

    @OutputCustomType.Constructor
    private KeyVaultLastAccessStatusContractPropertiesResponse(
        @OutputCustomType.Parameter("code") @Nullable String code,
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("timeStampUtc") @Nullable String timeStampUtc) {
        this.code = code;
        this.message = message;
        this.timeStampUtc = timeStampUtc;
    }

    /**
     * Last status code for sync and refresh of secret from key vault.
     * 
    */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * Details of the error else empty.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Last time secret was accessed. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
    */
    public Optional<String> getTimeStampUtc() {
        return Optional.ofNullable(this.timeStampUtc);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultLastAccessStatusContractPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;
        private @Nullable String timeStampUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultLastAccessStatusContractPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.timeStampUtc = defaults.timeStampUtc;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder timeStampUtc(@Nullable String timeStampUtc) {
            this.timeStampUtc = timeStampUtc;
            return this;
        }
        public KeyVaultLastAccessStatusContractPropertiesResponse build() {
            return new KeyVaultLastAccessStatusContractPropertiesResponse(code, message, timeStampUtc);
        }
    }
}
