// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceAliasIpRangeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceAliasIpRangeGetArgs Empty = new InstanceNetworkInterfaceAliasIpRangeGetArgs();

    /**
     * The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. This range may be a single IP address
     * (e.g. 10.2.3.4), a netmask (e.g. /24) or a CIDR format string (e.g. 10.1.2.0/24).
     * 
     */
    @InputImport(name="ipCidrRange", required=true)
      private final Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
     */
    @InputImport(name="subnetworkRangeName")
      private final @Nullable Input<String> subnetworkRangeName;

    public Input<String> getSubnetworkRangeName() {
        return this.subnetworkRangeName == null ? Input.empty() : this.subnetworkRangeName;
    }

    public InstanceNetworkInterfaceAliasIpRangeGetArgs(
        Input<String> ipCidrRange,
        @Nullable Input<String> subnetworkRangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.subnetworkRangeName = subnetworkRangeName;
    }

    private InstanceNetworkInterfaceAliasIpRangeGetArgs() {
        this.ipCidrRange = Input.empty();
        this.subnetworkRangeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceAliasIpRangeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ipCidrRange;
        private @Nullable Input<String> subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceAliasIpRangeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder ipCidrRange(Input<String> ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Input.of(Objects.requireNonNull(ipCidrRange));
            return this;
        }

        public Builder subnetworkRangeName(@Nullable Input<String> subnetworkRangeName) {
            this.subnetworkRangeName = subnetworkRangeName;
            return this;
        }

        public Builder subnetworkRangeName(@Nullable String subnetworkRangeName) {
            this.subnetworkRangeName = Input.ofNullable(subnetworkRangeName);
            return this;
        }
        public InstanceNetworkInterfaceAliasIpRangeGetArgs build() {
            return new InstanceNetworkInterfaceAliasIpRangeGetArgs(ipCidrRange, subnetworkRangeName);
        }
    }
}
