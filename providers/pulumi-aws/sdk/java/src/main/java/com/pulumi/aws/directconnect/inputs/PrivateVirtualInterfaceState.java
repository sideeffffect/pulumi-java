// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateVirtualInterfaceState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateVirtualInterfaceState Empty = new PrivateVirtualInterfaceState();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @Import(name="addressFamily")
    private @Nullable Output<String> addressFamily;

    public Optional<Output<String>> addressFamily() {
        return Optional.ofNullable(this.addressFamily);
    }

    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @Import(name="amazonAddress")
    private @Nullable Output<String> amazonAddress;

    public Optional<Output<String>> amazonAddress() {
        return Optional.ofNullable(this.amazonAddress);
    }

    @Import(name="amazonSideAsn")
    private @Nullable Output<String> amazonSideAsn;

    public Optional<Output<String>> amazonSideAsn() {
        return Optional.ofNullable(this.amazonSideAsn);
    }

    /**
     * The ARN of the virtual interface.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    @Import(name="awsDevice")
    private @Nullable Output<String> awsDevice;

    public Optional<Output<String>> awsDevice() {
        return Optional.ofNullable(this.awsDevice);
    }

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @Import(name="bgpAsn")
    private @Nullable Output<Integer> bgpAsn;

    public Optional<Output<Integer>> bgpAsn() {
        return Optional.ofNullable(this.bgpAsn);
    }

    /**
     * The authentication key for BGP configuration.
     * 
     */
    @Import(name="bgpAuthKey")
    private @Nullable Output<String> bgpAuthKey;

    public Optional<Output<String>> bgpAuthKey() {
        return Optional.ofNullable(this.bgpAuthKey);
    }

    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @Import(name="connectionId")
    private @Nullable Output<String> connectionId;

    public Optional<Output<String>> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }

    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @Import(name="customerAddress")
    private @Nullable Output<String> customerAddress;

    public Optional<Output<String>> customerAddress() {
        return Optional.ofNullable(this.customerAddress);
    }

    /**
     * The ID of the Direct Connect gateway to which to connect the virtual interface.
     * 
     */
    @Import(name="dxGatewayId")
    private @Nullable Output<String> dxGatewayId;

    public Optional<Output<String>> dxGatewayId() {
        return Optional.ofNullable(this.dxGatewayId);
    }

    /**
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * 
     */
    @Import(name="jumboFrameCapable")
    private @Nullable Output<Boolean> jumboFrameCapable;

    public Optional<Output<Boolean>> jumboFrameCapable() {
        return Optional.ofNullable(this.jumboFrameCapable);
    }

    /**
     * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
     * The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * The name for the virtual interface.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="sitelinkEnabled")
    private @Nullable Output<Boolean> sitelinkEnabled;

    public Optional<Output<Boolean>> sitelinkEnabled() {
        return Optional.ofNullable(this.sitelinkEnabled);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The VLAN ID.
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<Integer> vlan;

    public Optional<Output<Integer>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    /**
     * The ID of the virtual private gateway to which to connect the virtual interface.
     * 
     */
    @Import(name="vpnGatewayId")
    private @Nullable Output<String> vpnGatewayId;

    public Optional<Output<String>> vpnGatewayId() {
        return Optional.ofNullable(this.vpnGatewayId);
    }

    private PrivateVirtualInterfaceState() {}

    private PrivateVirtualInterfaceState(PrivateVirtualInterfaceState $) {
        this.addressFamily = $.addressFamily;
        this.amazonAddress = $.amazonAddress;
        this.amazonSideAsn = $.amazonSideAsn;
        this.arn = $.arn;
        this.awsDevice = $.awsDevice;
        this.bgpAsn = $.bgpAsn;
        this.bgpAuthKey = $.bgpAuthKey;
        this.connectionId = $.connectionId;
        this.customerAddress = $.customerAddress;
        this.dxGatewayId = $.dxGatewayId;
        this.jumboFrameCapable = $.jumboFrameCapable;
        this.mtu = $.mtu;
        this.name = $.name;
        this.sitelinkEnabled = $.sitelinkEnabled;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vlan = $.vlan;
        this.vpnGatewayId = $.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateVirtualInterfaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateVirtualInterfaceState $;

        public Builder() {
            $ = new PrivateVirtualInterfaceState();
        }

        public Builder(PrivateVirtualInterfaceState defaults) {
            $ = new PrivateVirtualInterfaceState(Objects.requireNonNull(defaults));
        }

        public Builder addressFamily(@Nullable Output<String> addressFamily) {
            $.addressFamily = addressFamily;
            return this;
        }

        public Builder addressFamily(String addressFamily) {
            return addressFamily(Output.of(addressFamily));
        }

        public Builder amazonAddress(@Nullable Output<String> amazonAddress) {
            $.amazonAddress = amazonAddress;
            return this;
        }

        public Builder amazonAddress(String amazonAddress) {
            return amazonAddress(Output.of(amazonAddress));
        }

        public Builder amazonSideAsn(@Nullable Output<String> amazonSideAsn) {
            $.amazonSideAsn = amazonSideAsn;
            return this;
        }

        public Builder amazonSideAsn(String amazonSideAsn) {
            return amazonSideAsn(Output.of(amazonSideAsn));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder awsDevice(@Nullable Output<String> awsDevice) {
            $.awsDevice = awsDevice;
            return this;
        }

        public Builder awsDevice(String awsDevice) {
            return awsDevice(Output.of(awsDevice));
        }

        public Builder bgpAsn(@Nullable Output<Integer> bgpAsn) {
            $.bgpAsn = bgpAsn;
            return this;
        }

        public Builder bgpAsn(Integer bgpAsn) {
            return bgpAsn(Output.of(bgpAsn));
        }

        public Builder bgpAuthKey(@Nullable Output<String> bgpAuthKey) {
            $.bgpAuthKey = bgpAuthKey;
            return this;
        }

        public Builder bgpAuthKey(String bgpAuthKey) {
            return bgpAuthKey(Output.of(bgpAuthKey));
        }

        public Builder connectionId(@Nullable Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        public Builder customerAddress(@Nullable Output<String> customerAddress) {
            $.customerAddress = customerAddress;
            return this;
        }

        public Builder customerAddress(String customerAddress) {
            return customerAddress(Output.of(customerAddress));
        }

        public Builder dxGatewayId(@Nullable Output<String> dxGatewayId) {
            $.dxGatewayId = dxGatewayId;
            return this;
        }

        public Builder dxGatewayId(String dxGatewayId) {
            return dxGatewayId(Output.of(dxGatewayId));
        }

        public Builder jumboFrameCapable(@Nullable Output<Boolean> jumboFrameCapable) {
            $.jumboFrameCapable = jumboFrameCapable;
            return this;
        }

        public Builder jumboFrameCapable(Boolean jumboFrameCapable) {
            return jumboFrameCapable(Output.of(jumboFrameCapable));
        }

        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sitelinkEnabled(@Nullable Output<Boolean> sitelinkEnabled) {
            $.sitelinkEnabled = sitelinkEnabled;
            return this;
        }

        public Builder sitelinkEnabled(Boolean sitelinkEnabled) {
            return sitelinkEnabled(Output.of(sitelinkEnabled));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder vlan(@Nullable Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        public Builder vpnGatewayId(@Nullable Output<String> vpnGatewayId) {
            $.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public Builder vpnGatewayId(String vpnGatewayId) {
            return vpnGatewayId(Output.of(vpnGatewayId));
        }

        public PrivateVirtualInterfaceState build() {
            return $;
        }
    }

}
