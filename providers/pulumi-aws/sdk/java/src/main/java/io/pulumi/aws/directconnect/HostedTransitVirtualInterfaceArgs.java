// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedTransitVirtualInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostedTransitVirtualInterfaceArgs Empty = new HostedTransitVirtualInterfaceArgs();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @Import(name="addressFamily", required=true)
      private final Output<String> addressFamily;

    public Output<String> addressFamily() {
        return this.addressFamily;
    }

    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @Import(name="amazonAddress")
      private final @Nullable Output<String> amazonAddress;

    public Output<String> amazonAddress() {
        return this.amazonAddress == null ? Codegen.empty() : this.amazonAddress;
    }

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @Import(name="bgpAsn", required=true)
      private final Output<Integer> bgpAsn;

    public Output<Integer> bgpAsn() {
        return this.bgpAsn;
    }

    /**
     * The authentication key for BGP configuration.
     * 
     */
    @Import(name="bgpAuthKey")
      private final @Nullable Output<String> bgpAuthKey;

    public Output<String> bgpAuthKey() {
        return this.bgpAuthKey == null ? Codegen.empty() : this.bgpAuthKey;
    }

    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @Import(name="connectionId", required=true)
      private final Output<String> connectionId;

    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @Import(name="customerAddress")
      private final @Nullable Output<String> customerAddress;

    public Output<String> customerAddress() {
        return this.customerAddress == null ? Codegen.empty() : this.customerAddress;
    }

    /**
     * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
     * 
     */
    @Import(name="mtu")
      private final @Nullable Output<Integer> mtu;

    public Output<Integer> mtu() {
        return this.mtu == null ? Codegen.empty() : this.mtu;
    }

    /**
     * The name for the virtual interface.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The AWS account that will own the new virtual interface.
     * 
     */
    @Import(name="ownerAccountId", required=true)
      private final Output<String> ownerAccountId;

    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * The VLAN ID.
     * 
     */
    @Import(name="vlan", required=true)
      private final Output<Integer> vlan;

    public Output<Integer> vlan() {
        return this.vlan;
    }

    public HostedTransitVirtualInterfaceArgs(
        Output<String> addressFamily,
        @Nullable Output<String> amazonAddress,
        Output<Integer> bgpAsn,
        @Nullable Output<String> bgpAuthKey,
        Output<String> connectionId,
        @Nullable Output<String> customerAddress,
        @Nullable Output<Integer> mtu,
        @Nullable Output<String> name,
        Output<String> ownerAccountId,
        Output<Integer> vlan) {
        this.addressFamily = Objects.requireNonNull(addressFamily, "expected parameter 'addressFamily' to be non-null");
        this.amazonAddress = amazonAddress;
        this.bgpAsn = Objects.requireNonNull(bgpAsn, "expected parameter 'bgpAsn' to be non-null");
        this.bgpAuthKey = bgpAuthKey;
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.customerAddress = customerAddress;
        this.mtu = mtu;
        this.name = name;
        this.ownerAccountId = Objects.requireNonNull(ownerAccountId, "expected parameter 'ownerAccountId' to be non-null");
        this.vlan = Objects.requireNonNull(vlan, "expected parameter 'vlan' to be non-null");
    }

    private HostedTransitVirtualInterfaceArgs() {
        this.addressFamily = Codegen.empty();
        this.amazonAddress = Codegen.empty();
        this.bgpAsn = Codegen.empty();
        this.bgpAuthKey = Codegen.empty();
        this.connectionId = Codegen.empty();
        this.customerAddress = Codegen.empty();
        this.mtu = Codegen.empty();
        this.name = Codegen.empty();
        this.ownerAccountId = Codegen.empty();
        this.vlan = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedTransitVirtualInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> addressFamily;
        private @Nullable Output<String> amazonAddress;
        private Output<Integer> bgpAsn;
        private @Nullable Output<String> bgpAuthKey;
        private Output<String> connectionId;
        private @Nullable Output<String> customerAddress;
        private @Nullable Output<Integer> mtu;
        private @Nullable Output<String> name;
        private Output<String> ownerAccountId;
        private Output<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedTransitVirtualInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.amazonAddress = defaults.amazonAddress;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.bgpAuthKey = defaults.bgpAuthKey;
    	      this.connectionId = defaults.connectionId;
    	      this.customerAddress = defaults.customerAddress;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.vlan = defaults.vlan;
        }

        public Builder addressFamily(Output<String> addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }
        public Builder addressFamily(String addressFamily) {
            this.addressFamily = Output.of(Objects.requireNonNull(addressFamily));
            return this;
        }
        public Builder amazonAddress(@Nullable Output<String> amazonAddress) {
            this.amazonAddress = amazonAddress;
            return this;
        }
        public Builder amazonAddress(@Nullable String amazonAddress) {
            this.amazonAddress = Codegen.ofNullable(amazonAddress);
            return this;
        }
        public Builder bgpAsn(Output<Integer> bgpAsn) {
            this.bgpAsn = Objects.requireNonNull(bgpAsn);
            return this;
        }
        public Builder bgpAsn(Integer bgpAsn) {
            this.bgpAsn = Output.of(Objects.requireNonNull(bgpAsn));
            return this;
        }
        public Builder bgpAuthKey(@Nullable Output<String> bgpAuthKey) {
            this.bgpAuthKey = bgpAuthKey;
            return this;
        }
        public Builder bgpAuthKey(@Nullable String bgpAuthKey) {
            this.bgpAuthKey = Codegen.ofNullable(bgpAuthKey);
            return this;
        }
        public Builder connectionId(Output<String> connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }
        public Builder connectionId(String connectionId) {
            this.connectionId = Output.of(Objects.requireNonNull(connectionId));
            return this;
        }
        public Builder customerAddress(@Nullable Output<String> customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }
        public Builder customerAddress(@Nullable String customerAddress) {
            this.customerAddress = Codegen.ofNullable(customerAddress);
            return this;
        }
        public Builder mtu(@Nullable Output<Integer> mtu) {
            this.mtu = mtu;
            return this;
        }
        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = Codegen.ofNullable(mtu);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder ownerAccountId(Output<String> ownerAccountId) {
            this.ownerAccountId = Objects.requireNonNull(ownerAccountId);
            return this;
        }
        public Builder ownerAccountId(String ownerAccountId) {
            this.ownerAccountId = Output.of(Objects.requireNonNull(ownerAccountId));
            return this;
        }
        public Builder vlan(Output<Integer> vlan) {
            this.vlan = Objects.requireNonNull(vlan);
            return this;
        }
        public Builder vlan(Integer vlan) {
            this.vlan = Output.of(Objects.requireNonNull(vlan));
            return this;
        }        public HostedTransitVirtualInterfaceArgs build() {
            return new HostedTransitVirtualInterfaceArgs(addressFamily, amazonAddress, bgpAsn, bgpAuthKey, connectionId, customerAddress, mtu, name, ownerAccountId, vlan);
        }
    }
}
