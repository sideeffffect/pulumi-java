// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublicVirtualInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicVirtualInterfaceArgs Empty = new PublicVirtualInterfaceArgs();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @Import(name="addressFamily", required=true)
    private Output<String> addressFamily;

    public Output<String> addressFamily() {
        return this.addressFamily;
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

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @Import(name="bgpAsn", required=true)
    private Output<Integer> bgpAsn;

    public Output<Integer> bgpAsn() {
        return this.bgpAsn;
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
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    public Output<String> connectionId() {
        return this.connectionId;
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
     * The name for the virtual interface.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of routes to be advertised to the AWS network in this region.
     * 
     */
    @Import(name="routeFilterPrefixes", required=true)
    private Output<List<String>> routeFilterPrefixes;

    public Output<List<String>> routeFilterPrefixes() {
        return this.routeFilterPrefixes;
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
     * The VLAN ID.
     * 
     */
    @Import(name="vlan", required=true)
    private Output<Integer> vlan;

    public Output<Integer> vlan() {
        return this.vlan;
    }

    private PublicVirtualInterfaceArgs() {}

    private PublicVirtualInterfaceArgs(PublicVirtualInterfaceArgs $) {
        this.addressFamily = $.addressFamily;
        this.amazonAddress = $.amazonAddress;
        this.bgpAsn = $.bgpAsn;
        this.bgpAuthKey = $.bgpAuthKey;
        this.connectionId = $.connectionId;
        this.customerAddress = $.customerAddress;
        this.name = $.name;
        this.routeFilterPrefixes = $.routeFilterPrefixes;
        this.tags = $.tags;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicVirtualInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicVirtualInterfaceArgs $;

        public Builder() {
            $ = new PublicVirtualInterfaceArgs();
        }

        public Builder(PublicVirtualInterfaceArgs defaults) {
            $ = new PublicVirtualInterfaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder addressFamily(Output<String> addressFamily) {
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

        public Builder bgpAsn(Output<Integer> bgpAsn) {
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

        public Builder connectionId(Output<String> connectionId) {
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

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder routeFilterPrefixes(Output<List<String>> routeFilterPrefixes) {
            $.routeFilterPrefixes = routeFilterPrefixes;
            return this;
        }

        public Builder routeFilterPrefixes(List<String> routeFilterPrefixes) {
            return routeFilterPrefixes(Output.of(routeFilterPrefixes));
        }

        public Builder routeFilterPrefixes(String... routeFilterPrefixes) {
            return routeFilterPrefixes(List.of(routeFilterPrefixes));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder vlan(Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        public PublicVirtualInterfaceArgs build() {
            $.addressFamily = Objects.requireNonNull($.addressFamily, "expected parameter 'addressFamily' to be non-null");
            $.bgpAsn = Objects.requireNonNull($.bgpAsn, "expected parameter 'bgpAsn' to be non-null");
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            $.routeFilterPrefixes = Objects.requireNonNull($.routeFilterPrefixes, "expected parameter 'routeFilterPrefixes' to be non-null");
            $.vlan = Objects.requireNonNull($.vlan, "expected parameter 'vlan' to be non-null");
            return $;
        }
    }

}
