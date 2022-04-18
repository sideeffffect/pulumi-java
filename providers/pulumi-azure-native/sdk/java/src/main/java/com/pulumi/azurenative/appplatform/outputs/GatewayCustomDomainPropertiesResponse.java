// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayCustomDomainPropertiesResponse {
    /**
     * The thumbprint of bound certificate.
     * 
     */
    private final @Nullable String thumbprint;

    @CustomType.Constructor
    private GatewayCustomDomainPropertiesResponse(@CustomType.Parameter("thumbprint") @Nullable String thumbprint) {
        this.thumbprint = thumbprint;
    }

    /**
     * The thumbprint of bound certificate.
     * 
    */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayCustomDomainPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayCustomDomainPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }        public GatewayCustomDomainPropertiesResponse build() {
            return new GatewayCustomDomainPropertiesResponse(thumbprint);
        }
    }
}
