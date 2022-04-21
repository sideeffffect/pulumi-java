// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The interface for the external VPN gateway.
 * 
 */
public final class ExternalVpnGatewayInterfaceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExternalVpnGatewayInterfaceResponse Empty = new ExternalVpnGatewayInterfaceResponse();

    /**
     * IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider&#39;s VPN gateway, it cannot be an IP address from Google Compute Engine.
     * 
     */
    @Import(name="ipAddress", required=true)
    private String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    private ExternalVpnGatewayInterfaceResponse() {}

    private ExternalVpnGatewayInterfaceResponse(ExternalVpnGatewayInterfaceResponse $) {
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalVpnGatewayInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalVpnGatewayInterfaceResponse $;

        public Builder() {
            $ = new ExternalVpnGatewayInterfaceResponse();
        }

        public Builder(ExternalVpnGatewayInterfaceResponse defaults) {
            $ = new ExternalVpnGatewayInterfaceResponse(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public ExternalVpnGatewayInterfaceResponse build() {
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            return $;
        }
    }

}
