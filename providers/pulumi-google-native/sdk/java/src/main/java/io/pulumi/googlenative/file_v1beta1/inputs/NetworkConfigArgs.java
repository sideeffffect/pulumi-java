// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.file_v1beta1.enums.NetworkConfigConnectMode;
import io.pulumi.googlenative.file_v1beta1.enums.NetworkConfigModesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network configuration for the instance.
 * 
 */
public final class NetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    @InputImport(name="connectMode")
      private final @Nullable Input<NetworkConfigConnectMode> connectMode;

    public Input<NetworkConfigConnectMode> getConnectMode() {
        return this.connectMode == null ? Input.empty() : this.connectMode;
    }

    /**
     * Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
     * 
     */
    @InputImport(name="modes")
      private final @Nullable Input<List<NetworkConfigModesItem>> modes;

    public Input<List<NetworkConfigModesItem>> getModes() {
        return this.modes == null ? Input.empty() : this.modes;
    }

    /**
     * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier or a /24 CIDR block for High Scale or Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or 192.168.0.0/24. The range you specify can't overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore instances in the selected VPC network.
     * 
     */
    @InputImport(name="reservedIpRange")
      private final @Nullable Input<String> reservedIpRange;

    public Input<String> getReservedIpRange() {
        return this.reservedIpRange == null ? Input.empty() : this.reservedIpRange;
    }

    public NetworkConfigArgs(
        @Nullable Input<NetworkConfigConnectMode> connectMode,
        @Nullable Input<List<NetworkConfigModesItem>> modes,
        @Nullable Input<String> network,
        @Nullable Input<String> reservedIpRange) {
        this.connectMode = connectMode;
        this.modes = modes;
        this.network = network;
        this.reservedIpRange = reservedIpRange;
    }

    private NetworkConfigArgs() {
        this.connectMode = Input.empty();
        this.modes = Input.empty();
        this.network = Input.empty();
        this.reservedIpRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NetworkConfigConnectMode> connectMode;
        private @Nullable Input<List<NetworkConfigModesItem>> modes;
        private @Nullable Input<String> network;
        private @Nullable Input<String> reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectMode = defaults.connectMode;
    	      this.modes = defaults.modes;
    	      this.network = defaults.network;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder connectMode(@Nullable Input<NetworkConfigConnectMode> connectMode) {
            this.connectMode = connectMode;
            return this;
        }

        public Builder connectMode(@Nullable NetworkConfigConnectMode connectMode) {
            this.connectMode = Input.ofNullable(connectMode);
            return this;
        }

        public Builder modes(@Nullable Input<List<NetworkConfigModesItem>> modes) {
            this.modes = modes;
            return this;
        }

        public Builder modes(@Nullable List<NetworkConfigModesItem> modes) {
            this.modes = Input.ofNullable(modes);
            return this;
        }

        public Builder network(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder reservedIpRange(@Nullable Input<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }

        public Builder reservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Input.ofNullable(reservedIpRange);
            return this;
        }
        public NetworkConfigArgs build() {
            return new NetworkConfigArgs(connectMode, modes, network, reservedIpRange);
        }
    }
}
