// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A VPN gateway interface.
 * 
 */
public final class VpnGatewayVpnGatewayInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnGatewayVpnGatewayInterfaceArgs Empty = new VpnGatewayVpnGatewayInterfaceArgs();

    /**
     * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for IPsec-encrypted Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource. Not currently available publicly.
     * 
     */
    @Import(name="interconnectAttachment")
    private @Nullable Output<String> interconnectAttachment;

    public Optional<Output<String>> interconnectAttachment() {
        return Optional.ofNullable(this.interconnectAttachment);
    }

    private VpnGatewayVpnGatewayInterfaceArgs() {}

    private VpnGatewayVpnGatewayInterfaceArgs(VpnGatewayVpnGatewayInterfaceArgs $) {
        this.interconnectAttachment = $.interconnectAttachment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnGatewayVpnGatewayInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnGatewayVpnGatewayInterfaceArgs $;

        public Builder() {
            $ = new VpnGatewayVpnGatewayInterfaceArgs();
        }

        public Builder(VpnGatewayVpnGatewayInterfaceArgs defaults) {
            $ = new VpnGatewayVpnGatewayInterfaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder interconnectAttachment(@Nullable Output<String> interconnectAttachment) {
            $.interconnectAttachment = interconnectAttachment;
            return this;
        }

        public Builder interconnectAttachment(String interconnectAttachment) {
            return interconnectAttachment(Output.of(interconnectAttachment));
        }

        public VpnGatewayVpnGatewayInterfaceArgs build() {
            return $;
        }
    }

}
