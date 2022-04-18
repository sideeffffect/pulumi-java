// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.HubPublicIPAddressesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HubIPAddressesResponse {
    /**
     * Private IP Address associated with azure firewall.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * Public IP addresses associated with azure firewall.
     * 
     */
    private final @Nullable HubPublicIPAddressesResponse publicIPs;

    @CustomType.Constructor
    private HubIPAddressesResponse(
        @CustomType.Parameter("privateIPAddress") @Nullable String privateIPAddress,
        @CustomType.Parameter("publicIPs") @Nullable HubPublicIPAddressesResponse publicIPs) {
        this.privateIPAddress = privateIPAddress;
        this.publicIPs = publicIPs;
    }

    /**
     * Private IP Address associated with azure firewall.
     * 
    */
    public Optional<String> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * Public IP addresses associated with azure firewall.
     * 
    */
    public Optional<HubPublicIPAddressesResponse> publicIPs() {
        return Optional.ofNullable(this.publicIPs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubIPAddressesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String privateIPAddress;
        private @Nullable HubPublicIPAddressesResponse publicIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(HubIPAddressesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicIPs = defaults.publicIPs;
        }

        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }
        public Builder publicIPs(@Nullable HubPublicIPAddressesResponse publicIPs) {
            this.publicIPs = publicIPs;
            return this;
        }        public HubIPAddressesResponse build() {
            return new HubIPAddressesResponse(privateIPAddress, publicIPs);
        }
    }
}
