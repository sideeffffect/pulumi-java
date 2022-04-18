// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionMonitorEndpointScopeItemResponse {
    /**
     * The address of the endpoint item. Supported types are IPv4/IPv6 subnet mask or IPv4/IPv6 IP address.
     * 
     */
    private final @Nullable String address;

    @CustomType.Constructor
    private ConnectionMonitorEndpointScopeItemResponse(@CustomType.Parameter("address") @Nullable String address) {
        this.address = address;
    }

    /**
     * The address of the endpoint item. Supported types are IPv4/IPv6 subnet mask or IPv4/IPv6 IP address.
     * 
    */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointScopeItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointScopeItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }        public ConnectionMonitorEndpointScopeItemResponse build() {
            return new ConnectionMonitorEndpointScopeItemResponse(address);
        }
    }
}
