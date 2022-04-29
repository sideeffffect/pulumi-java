// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HaVpnGatewayVpnInterfaceArgs extends ResourceArgs {

    public static final HaVpnGatewayVpnInterfaceArgs Empty = new HaVpnGatewayVpnInterfaceArgs();

    /**
     * The numeric ID of this VPN gateway interface.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The numeric ID of this VPN gateway interface.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * URL of the interconnect attachment resource. When the value
     * of this field is present, the VPN Gateway will be used for
     * IPsec-encrypted Cloud Interconnect; all Egress or Ingress
     * traffic for this VPN Gateway interface will go through the
     * specified interconnect attachment resource.
     * Not currently available publicly.
     * 
     */
    @Import(name="interconnectAttachment")
    private @Nullable Output<String> interconnectAttachment;

    /**
     * @return URL of the interconnect attachment resource. When the value
     * of this field is present, the VPN Gateway will be used for
     * IPsec-encrypted Cloud Interconnect; all Egress or Ingress
     * traffic for this VPN Gateway interface will go through the
     * specified interconnect attachment resource.
     * Not currently available publicly.
     * 
     */
    public Optional<Output<String>> interconnectAttachment() {
        return Optional.ofNullable(this.interconnectAttachment);
    }

    /**
     * - 
     * The external IP address for this VPN gateway interface.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return -
     * The external IP address for this VPN gateway interface.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    private HaVpnGatewayVpnInterfaceArgs() {}

    private HaVpnGatewayVpnInterfaceArgs(HaVpnGatewayVpnInterfaceArgs $) {
        this.id = $.id;
        this.interconnectAttachment = $.interconnectAttachment;
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HaVpnGatewayVpnInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HaVpnGatewayVpnInterfaceArgs $;

        public Builder() {
            $ = new HaVpnGatewayVpnInterfaceArgs();
        }

        public Builder(HaVpnGatewayVpnInterfaceArgs defaults) {
            $ = new HaVpnGatewayVpnInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The numeric ID of this VPN gateway interface.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The numeric ID of this VPN gateway interface.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param interconnectAttachment URL of the interconnect attachment resource. When the value
         * of this field is present, the VPN Gateway will be used for
         * IPsec-encrypted Cloud Interconnect; all Egress or Ingress
         * traffic for this VPN Gateway interface will go through the
         * specified interconnect attachment resource.
         * Not currently available publicly.
         * 
         * @return builder
         * 
         */
        public Builder interconnectAttachment(@Nullable Output<String> interconnectAttachment) {
            $.interconnectAttachment = interconnectAttachment;
            return this;
        }

        /**
         * @param interconnectAttachment URL of the interconnect attachment resource. When the value
         * of this field is present, the VPN Gateway will be used for
         * IPsec-encrypted Cloud Interconnect; all Egress or Ingress
         * traffic for this VPN Gateway interface will go through the
         * specified interconnect attachment resource.
         * Not currently available publicly.
         * 
         * @return builder
         * 
         */
        public Builder interconnectAttachment(String interconnectAttachment) {
            return interconnectAttachment(Output.of(interconnectAttachment));
        }

        /**
         * @param ipAddress -
         * The external IP address for this VPN gateway interface.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress -
         * The external IP address for this VPN gateway interface.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public HaVpnGatewayVpnInterfaceArgs build() {
            return $;
        }
    }

}
