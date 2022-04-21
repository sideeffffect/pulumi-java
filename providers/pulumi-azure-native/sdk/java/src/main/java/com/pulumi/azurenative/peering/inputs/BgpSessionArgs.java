// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that define a BGP session.
 * 
 */
public final class BgpSessionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BgpSessionArgs Empty = new BgpSessionArgs();

    /**
     * The maximum number of prefixes advertised over the IPv4 session.
     * 
     */
    @Import(name="maxPrefixesAdvertisedV4")
    private @Nullable Output<Integer> maxPrefixesAdvertisedV4;

    public Optional<Output<Integer>> maxPrefixesAdvertisedV4() {
        return Optional.ofNullable(this.maxPrefixesAdvertisedV4);
    }

    /**
     * The maximum number of prefixes advertised over the IPv6 session.
     * 
     */
    @Import(name="maxPrefixesAdvertisedV6")
    private @Nullable Output<Integer> maxPrefixesAdvertisedV6;

    public Optional<Output<Integer>> maxPrefixesAdvertisedV6() {
        return Optional.ofNullable(this.maxPrefixesAdvertisedV6);
    }

    /**
     * The MD5 authentication key of the session.
     * 
     */
    @Import(name="md5AuthenticationKey")
    private @Nullable Output<String> md5AuthenticationKey;

    public Optional<Output<String>> md5AuthenticationKey() {
        return Optional.ofNullable(this.md5AuthenticationKey);
    }

    /**
     * The IPv4 session address on Microsoft&#39;s end.
     * 
     */
    @Import(name="microsoftSessionIPv4Address")
    private @Nullable Output<String> microsoftSessionIPv4Address;

    public Optional<Output<String>> microsoftSessionIPv4Address() {
        return Optional.ofNullable(this.microsoftSessionIPv4Address);
    }

    /**
     * The IPv6 session address on Microsoft&#39;s end.
     * 
     */
    @Import(name="microsoftSessionIPv6Address")
    private @Nullable Output<String> microsoftSessionIPv6Address;

    public Optional<Output<String>> microsoftSessionIPv6Address() {
        return Optional.ofNullable(this.microsoftSessionIPv6Address);
    }

    /**
     * The IPv4 session address on peer&#39;s end.
     * 
     */
    @Import(name="peerSessionIPv4Address")
    private @Nullable Output<String> peerSessionIPv4Address;

    public Optional<Output<String>> peerSessionIPv4Address() {
        return Optional.ofNullable(this.peerSessionIPv4Address);
    }

    /**
     * The IPv6 session address on peer&#39;s end.
     * 
     */
    @Import(name="peerSessionIPv6Address")
    private @Nullable Output<String> peerSessionIPv6Address;

    public Optional<Output<String>> peerSessionIPv6Address() {
        return Optional.ofNullable(this.peerSessionIPv6Address);
    }

    /**
     * The IPv4 prefix that contains both ends&#39; IPv4 addresses.
     * 
     */
    @Import(name="sessionPrefixV4")
    private @Nullable Output<String> sessionPrefixV4;

    public Optional<Output<String>> sessionPrefixV4() {
        return Optional.ofNullable(this.sessionPrefixV4);
    }

    /**
     * The IPv6 prefix that contains both ends&#39; IPv6 addresses.
     * 
     */
    @Import(name="sessionPrefixV6")
    private @Nullable Output<String> sessionPrefixV6;

    public Optional<Output<String>> sessionPrefixV6() {
        return Optional.ofNullable(this.sessionPrefixV6);
    }

    private BgpSessionArgs() {}

    private BgpSessionArgs(BgpSessionArgs $) {
        this.maxPrefixesAdvertisedV4 = $.maxPrefixesAdvertisedV4;
        this.maxPrefixesAdvertisedV6 = $.maxPrefixesAdvertisedV6;
        this.md5AuthenticationKey = $.md5AuthenticationKey;
        this.microsoftSessionIPv4Address = $.microsoftSessionIPv4Address;
        this.microsoftSessionIPv6Address = $.microsoftSessionIPv6Address;
        this.peerSessionIPv4Address = $.peerSessionIPv4Address;
        this.peerSessionIPv6Address = $.peerSessionIPv6Address;
        this.sessionPrefixV4 = $.sessionPrefixV4;
        this.sessionPrefixV6 = $.sessionPrefixV6;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BgpSessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BgpSessionArgs $;

        public Builder() {
            $ = new BgpSessionArgs();
        }

        public Builder(BgpSessionArgs defaults) {
            $ = new BgpSessionArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxPrefixesAdvertisedV4(@Nullable Output<Integer> maxPrefixesAdvertisedV4) {
            $.maxPrefixesAdvertisedV4 = maxPrefixesAdvertisedV4;
            return this;
        }

        public Builder maxPrefixesAdvertisedV4(Integer maxPrefixesAdvertisedV4) {
            return maxPrefixesAdvertisedV4(Output.of(maxPrefixesAdvertisedV4));
        }

        public Builder maxPrefixesAdvertisedV6(@Nullable Output<Integer> maxPrefixesAdvertisedV6) {
            $.maxPrefixesAdvertisedV6 = maxPrefixesAdvertisedV6;
            return this;
        }

        public Builder maxPrefixesAdvertisedV6(Integer maxPrefixesAdvertisedV6) {
            return maxPrefixesAdvertisedV6(Output.of(maxPrefixesAdvertisedV6));
        }

        public Builder md5AuthenticationKey(@Nullable Output<String> md5AuthenticationKey) {
            $.md5AuthenticationKey = md5AuthenticationKey;
            return this;
        }

        public Builder md5AuthenticationKey(String md5AuthenticationKey) {
            return md5AuthenticationKey(Output.of(md5AuthenticationKey));
        }

        public Builder microsoftSessionIPv4Address(@Nullable Output<String> microsoftSessionIPv4Address) {
            $.microsoftSessionIPv4Address = microsoftSessionIPv4Address;
            return this;
        }

        public Builder microsoftSessionIPv4Address(String microsoftSessionIPv4Address) {
            return microsoftSessionIPv4Address(Output.of(microsoftSessionIPv4Address));
        }

        public Builder microsoftSessionIPv6Address(@Nullable Output<String> microsoftSessionIPv6Address) {
            $.microsoftSessionIPv6Address = microsoftSessionIPv6Address;
            return this;
        }

        public Builder microsoftSessionIPv6Address(String microsoftSessionIPv6Address) {
            return microsoftSessionIPv6Address(Output.of(microsoftSessionIPv6Address));
        }

        public Builder peerSessionIPv4Address(@Nullable Output<String> peerSessionIPv4Address) {
            $.peerSessionIPv4Address = peerSessionIPv4Address;
            return this;
        }

        public Builder peerSessionIPv4Address(String peerSessionIPv4Address) {
            return peerSessionIPv4Address(Output.of(peerSessionIPv4Address));
        }

        public Builder peerSessionIPv6Address(@Nullable Output<String> peerSessionIPv6Address) {
            $.peerSessionIPv6Address = peerSessionIPv6Address;
            return this;
        }

        public Builder peerSessionIPv6Address(String peerSessionIPv6Address) {
            return peerSessionIPv6Address(Output.of(peerSessionIPv6Address));
        }

        public Builder sessionPrefixV4(@Nullable Output<String> sessionPrefixV4) {
            $.sessionPrefixV4 = sessionPrefixV4;
            return this;
        }

        public Builder sessionPrefixV4(String sessionPrefixV4) {
            return sessionPrefixV4(Output.of(sessionPrefixV4));
        }

        public Builder sessionPrefixV6(@Nullable Output<String> sessionPrefixV6) {
            $.sessionPrefixV6 = sessionPrefixV6;
            return this;
        }

        public Builder sessionPrefixV6(String sessionPrefixV6) {
            return sessionPrefixV6(Output.of(sessionPrefixV6));
        }

        public BgpSessionArgs build() {
            return $;
        }
    }

}
