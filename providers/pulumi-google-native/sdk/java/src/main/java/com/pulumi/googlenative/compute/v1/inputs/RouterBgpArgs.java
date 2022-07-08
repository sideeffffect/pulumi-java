// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.enums.RouterBgpAdvertiseMode;
import com.pulumi.googlenative.compute.v1.enums.RouterBgpAdvertisedGroupsItem;
import com.pulumi.googlenative.compute.v1.inputs.RouterAdvertisedIpRangeArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouterBgpArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouterBgpArgs Empty = new RouterBgpArgs();

    /**
     * User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
     * 
     */
    @Import(name="advertiseMode")
    private @Nullable Output<RouterBgpAdvertiseMode> advertiseMode;

    /**
     * @return User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
     * 
     */
    public Optional<Output<RouterBgpAdvertiseMode>> advertiseMode() {
        return Optional.ofNullable(this.advertiseMode);
    }

    /**
     * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    @Import(name="advertisedGroups")
    private @Nullable Output<List<RouterBgpAdvertisedGroupsItem>> advertisedGroups;

    /**
     * @return User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    public Optional<Output<List<RouterBgpAdvertisedGroupsItem>>> advertisedGroups() {
        return Optional.ofNullable(this.advertisedGroups);
    }

    /**
     * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    @Import(name="advertisedIpRanges")
    private @Nullable Output<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges;

    /**
     * @return User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    public Optional<Output<List<RouterAdvertisedIpRangeArgs>>> advertisedIpRanges() {
        return Optional.ofNullable(this.advertisedIpRanges);
    }

    /**
     * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
     * 
     */
    @Import(name="asn")
    private @Nullable Output<Integer> asn;

    /**
     * @return Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
     * 
     */
    public Optional<Output<Integer>> asn() {
        return Optional.ofNullable(this.asn);
    }

    /**
     * The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
     * 
     */
    @Import(name="keepaliveInterval")
    private @Nullable Output<Integer> keepaliveInterval;

    /**
     * @return The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
     * 
     */
    public Optional<Output<Integer>> keepaliveInterval() {
        return Optional.ofNullable(this.keepaliveInterval);
    }

    private RouterBgpArgs() {}

    private RouterBgpArgs(RouterBgpArgs $) {
        this.advertiseMode = $.advertiseMode;
        this.advertisedGroups = $.advertisedGroups;
        this.advertisedIpRanges = $.advertisedIpRanges;
        this.asn = $.asn;
        this.keepaliveInterval = $.keepaliveInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterBgpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterBgpArgs $;

        public Builder() {
            $ = new RouterBgpArgs();
        }

        public Builder(RouterBgpArgs defaults) {
            $ = new RouterBgpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advertiseMode User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
         * 
         * @return builder
         * 
         */
        public Builder advertiseMode(@Nullable Output<RouterBgpAdvertiseMode> advertiseMode) {
            $.advertiseMode = advertiseMode;
            return this;
        }

        /**
         * @param advertiseMode User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
         * 
         * @return builder
         * 
         */
        public Builder advertiseMode(RouterBgpAdvertiseMode advertiseMode) {
            return advertiseMode(Output.of(advertiseMode));
        }

        /**
         * @param advertisedGroups User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
         * 
         * @return builder
         * 
         */
        public Builder advertisedGroups(@Nullable Output<List<RouterBgpAdvertisedGroupsItem>> advertisedGroups) {
            $.advertisedGroups = advertisedGroups;
            return this;
        }

        /**
         * @param advertisedGroups User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
         * 
         * @return builder
         * 
         */
        public Builder advertisedGroups(List<RouterBgpAdvertisedGroupsItem> advertisedGroups) {
            return advertisedGroups(Output.of(advertisedGroups));
        }

        /**
         * @param advertisedGroups User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
         * 
         * @return builder
         * 
         */
        public Builder advertisedGroups(RouterBgpAdvertisedGroupsItem... advertisedGroups) {
            return advertisedGroups(List.of(advertisedGroups));
        }

        /**
         * @param advertisedIpRanges User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder advertisedIpRanges(@Nullable Output<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges) {
            $.advertisedIpRanges = advertisedIpRanges;
            return this;
        }

        /**
         * @param advertisedIpRanges User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder advertisedIpRanges(List<RouterAdvertisedIpRangeArgs> advertisedIpRanges) {
            return advertisedIpRanges(Output.of(advertisedIpRanges));
        }

        /**
         * @param advertisedIpRanges User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder advertisedIpRanges(RouterAdvertisedIpRangeArgs... advertisedIpRanges) {
            return advertisedIpRanges(List.of(advertisedIpRanges));
        }

        /**
         * @param asn Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
         * 
         * @return builder
         * 
         */
        public Builder asn(@Nullable Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param keepaliveInterval The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
         * 
         * @return builder
         * 
         */
        public Builder keepaliveInterval(@Nullable Output<Integer> keepaliveInterval) {
            $.keepaliveInterval = keepaliveInterval;
            return this;
        }

        /**
         * @param keepaliveInterval The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer&#39;s hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
         * 
         * @return builder
         * 
         */
        public Builder keepaliveInterval(Integer keepaliveInterval) {
            return keepaliveInterval(Output.of(keepaliveInterval));
        }

        public RouterBgpArgs build() {
            return $;
        }
    }

}
