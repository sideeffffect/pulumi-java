// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HaVpnGatewayVpnInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HaVpnGatewayVpnInterfaceArgs Empty = new HaVpnGatewayVpnInterfaceArgs();

    /**
     * The numeric ID of this VPN gateway interface.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<Integer> id;

    public Input<Integer> getId() {
        return this.id == null ? Input.empty() : this.id;
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
    @InputImport(name="interconnectAttachment")
      private final @Nullable Input<String> interconnectAttachment;

    public Input<String> getInterconnectAttachment() {
        return this.interconnectAttachment == null ? Input.empty() : this.interconnectAttachment;
    }

    /**
     * - 
     * The external IP address for this VPN gateway interface.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    public HaVpnGatewayVpnInterfaceArgs(
        @Nullable Input<Integer> id,
        @Nullable Input<String> interconnectAttachment,
        @Nullable Input<String> ipAddress) {
        this.id = id;
        this.interconnectAttachment = interconnectAttachment;
        this.ipAddress = ipAddress;
    }

    private HaVpnGatewayVpnInterfaceArgs() {
        this.id = Input.empty();
        this.interconnectAttachment = Input.empty();
        this.ipAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HaVpnGatewayVpnInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> id;
        private @Nullable Input<String> interconnectAttachment;
        private @Nullable Input<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(HaVpnGatewayVpnInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.interconnectAttachment = defaults.interconnectAttachment;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder id(@Nullable Input<Integer> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable Integer id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder interconnectAttachment(@Nullable Input<String> interconnectAttachment) {
            this.interconnectAttachment = interconnectAttachment;
            return this;
        }

        public Builder interconnectAttachment(@Nullable String interconnectAttachment) {
            this.interconnectAttachment = Input.ofNullable(interconnectAttachment);
            return this;
        }

        public Builder ipAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }
        public HaVpnGatewayVpnInterfaceArgs build() {
            return new HaVpnGatewayVpnInterfaceArgs(id, interconnectAttachment, ipAddress);
        }
    }
}
