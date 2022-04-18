// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnServerConfigVpnClientRevokedCertificateResponse {
    /**
     * The certificate name.
     * 
     */
    private final @Nullable String name;
    /**
     * The revoked VPN client certificate thumbprint.
     * 
     */
    private final @Nullable String thumbprint;

    @CustomType.Constructor
    private VpnServerConfigVpnClientRevokedCertificateResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("thumbprint") @Nullable String thumbprint) {
        this.name = name;
        this.thumbprint = thumbprint;
    }

    /**
     * The certificate name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The revoked VPN client certificate thumbprint.
     * 
    */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigVpnClientRevokedCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigVpnClientRevokedCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }        public VpnServerConfigVpnClientRevokedCertificateResponse build() {
            return new VpnServerConfigVpnClientRevokedCertificateResponse(name, thumbprint);
        }
    }
}
