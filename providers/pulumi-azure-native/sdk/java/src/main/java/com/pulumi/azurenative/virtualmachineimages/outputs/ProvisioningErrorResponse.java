// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProvisioningErrorResponse {
    /**
     * Verbose error message about the provisioning failure
     * 
     */
    private final @Nullable String message;
    /**
     * Error code of the provisioning failure
     * 
     */
    private final @Nullable String provisioningErrorCode;

    @CustomType.Constructor
    private ProvisioningErrorResponse(
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("provisioningErrorCode") @Nullable String provisioningErrorCode) {
        this.message = message;
        this.provisioningErrorCode = provisioningErrorCode;
    }

    /**
     * Verbose error message about the provisioning failure
     * 
    */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Error code of the provisioning failure
     * 
    */
    public Optional<String> provisioningErrorCode() {
        return Optional.ofNullable(this.provisioningErrorCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisioningErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String provisioningErrorCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisioningErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.provisioningErrorCode = defaults.provisioningErrorCode;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder provisioningErrorCode(@Nullable String provisioningErrorCode) {
            this.provisioningErrorCode = provisioningErrorCode;
            return this;
        }        public ProvisioningErrorResponse build() {
            return new ProvisioningErrorResponse(message, provisioningErrorCode);
        }
    }
}
