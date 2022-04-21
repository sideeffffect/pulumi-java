// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VpnConnectionRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnConnectionRouteArgs Empty = new VpnConnectionRouteArgs();

    /**
     * The CIDR block associated with the local subnet of the customer network.
     * 
     */
    @Import(name="destinationCidrBlock", required=true)
    private Output<String> destinationCidrBlock;

    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * The ID of the VPN connection.
     * 
     */
    @Import(name="vpnConnectionId", required=true)
    private Output<String> vpnConnectionId;

    public Output<String> vpnConnectionId() {
        return this.vpnConnectionId;
    }

    private VpnConnectionRouteArgs() {}

    private VpnConnectionRouteArgs(VpnConnectionRouteArgs $) {
        this.destinationCidrBlock = $.destinationCidrBlock;
        this.vpnConnectionId = $.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnConnectionRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnConnectionRouteArgs $;

        public Builder() {
            $ = new VpnConnectionRouteArgs();
        }

        public Builder(VpnConnectionRouteArgs defaults) {
            $ = new VpnConnectionRouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationCidrBlock(Output<String> destinationCidrBlock) {
            $.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        public Builder destinationCidrBlock(String destinationCidrBlock) {
            return destinationCidrBlock(Output.of(destinationCidrBlock));
        }

        public Builder vpnConnectionId(Output<String> vpnConnectionId) {
            $.vpnConnectionId = vpnConnectionId;
            return this;
        }

        public Builder vpnConnectionId(String vpnConnectionId) {
            return vpnConnectionId(Output.of(vpnConnectionId));
        }

        public VpnConnectionRouteArgs build() {
            $.destinationCidrBlock = Objects.requireNonNull($.destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
            $.vpnConnectionId = Objects.requireNonNull($.vpnConnectionId, "expected parameter 'vpnConnectionId' to be non-null");
            return $;
        }
    }

}
