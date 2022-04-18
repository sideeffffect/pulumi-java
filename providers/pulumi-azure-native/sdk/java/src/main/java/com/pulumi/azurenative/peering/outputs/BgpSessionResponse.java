// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BgpSessionResponse {
    /**
     * The maximum number of prefixes advertised over the IPv4 session.
     * 
     */
    private final @Nullable Integer maxPrefixesAdvertisedV4;
    /**
     * The maximum number of prefixes advertised over the IPv6 session.
     * 
     */
    private final @Nullable Integer maxPrefixesAdvertisedV6;
    /**
     * The MD5 authentication key of the session.
     * 
     */
    private final @Nullable String md5AuthenticationKey;
    /**
     * The IPv4 session address on Microsoft's end.
     * 
     */
    private final @Nullable String microsoftSessionIPv4Address;
    /**
     * The IPv6 session address on Microsoft's end.
     * 
     */
    private final @Nullable String microsoftSessionIPv6Address;
    /**
     * The IPv4 session address on peer's end.
     * 
     */
    private final @Nullable String peerSessionIPv4Address;
    /**
     * The IPv6 session address on peer's end.
     * 
     */
    private final @Nullable String peerSessionIPv6Address;
    /**
     * The IPv4 prefix that contains both ends' IPv4 addresses.
     * 
     */
    private final @Nullable String sessionPrefixV4;
    /**
     * The IPv6 prefix that contains both ends' IPv6 addresses.
     * 
     */
    private final @Nullable String sessionPrefixV6;
    /**
     * The state of the IPv4 session.
     * 
     */
    private final String sessionStateV4;
    /**
     * The state of the IPv6 session.
     * 
     */
    private final String sessionStateV6;

    @CustomType.Constructor
    private BgpSessionResponse(
        @CustomType.Parameter("maxPrefixesAdvertisedV4") @Nullable Integer maxPrefixesAdvertisedV4,
        @CustomType.Parameter("maxPrefixesAdvertisedV6") @Nullable Integer maxPrefixesAdvertisedV6,
        @CustomType.Parameter("md5AuthenticationKey") @Nullable String md5AuthenticationKey,
        @CustomType.Parameter("microsoftSessionIPv4Address") @Nullable String microsoftSessionIPv4Address,
        @CustomType.Parameter("microsoftSessionIPv6Address") @Nullable String microsoftSessionIPv6Address,
        @CustomType.Parameter("peerSessionIPv4Address") @Nullable String peerSessionIPv4Address,
        @CustomType.Parameter("peerSessionIPv6Address") @Nullable String peerSessionIPv6Address,
        @CustomType.Parameter("sessionPrefixV4") @Nullable String sessionPrefixV4,
        @CustomType.Parameter("sessionPrefixV6") @Nullable String sessionPrefixV6,
        @CustomType.Parameter("sessionStateV4") String sessionStateV4,
        @CustomType.Parameter("sessionStateV6") String sessionStateV6) {
        this.maxPrefixesAdvertisedV4 = maxPrefixesAdvertisedV4;
        this.maxPrefixesAdvertisedV6 = maxPrefixesAdvertisedV6;
        this.md5AuthenticationKey = md5AuthenticationKey;
        this.microsoftSessionIPv4Address = microsoftSessionIPv4Address;
        this.microsoftSessionIPv6Address = microsoftSessionIPv6Address;
        this.peerSessionIPv4Address = peerSessionIPv4Address;
        this.peerSessionIPv6Address = peerSessionIPv6Address;
        this.sessionPrefixV4 = sessionPrefixV4;
        this.sessionPrefixV6 = sessionPrefixV6;
        this.sessionStateV4 = sessionStateV4;
        this.sessionStateV6 = sessionStateV6;
    }

    /**
     * The maximum number of prefixes advertised over the IPv4 session.
     * 
    */
    public Optional<Integer> maxPrefixesAdvertisedV4() {
        return Optional.ofNullable(this.maxPrefixesAdvertisedV4);
    }
    /**
     * The maximum number of prefixes advertised over the IPv6 session.
     * 
    */
    public Optional<Integer> maxPrefixesAdvertisedV6() {
        return Optional.ofNullable(this.maxPrefixesAdvertisedV6);
    }
    /**
     * The MD5 authentication key of the session.
     * 
    */
    public Optional<String> md5AuthenticationKey() {
        return Optional.ofNullable(this.md5AuthenticationKey);
    }
    /**
     * The IPv4 session address on Microsoft's end.
     * 
    */
    public Optional<String> microsoftSessionIPv4Address() {
        return Optional.ofNullable(this.microsoftSessionIPv4Address);
    }
    /**
     * The IPv6 session address on Microsoft's end.
     * 
    */
    public Optional<String> microsoftSessionIPv6Address() {
        return Optional.ofNullable(this.microsoftSessionIPv6Address);
    }
    /**
     * The IPv4 session address on peer's end.
     * 
    */
    public Optional<String> peerSessionIPv4Address() {
        return Optional.ofNullable(this.peerSessionIPv4Address);
    }
    /**
     * The IPv6 session address on peer's end.
     * 
    */
    public Optional<String> peerSessionIPv6Address() {
        return Optional.ofNullable(this.peerSessionIPv6Address);
    }
    /**
     * The IPv4 prefix that contains both ends' IPv4 addresses.
     * 
    */
    public Optional<String> sessionPrefixV4() {
        return Optional.ofNullable(this.sessionPrefixV4);
    }
    /**
     * The IPv6 prefix that contains both ends' IPv6 addresses.
     * 
    */
    public Optional<String> sessionPrefixV6() {
        return Optional.ofNullable(this.sessionPrefixV6);
    }
    /**
     * The state of the IPv4 session.
     * 
    */
    public String sessionStateV4() {
        return this.sessionStateV4;
    }
    /**
     * The state of the IPv6 session.
     * 
    */
    public String sessionStateV6() {
        return this.sessionStateV6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BgpSessionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxPrefixesAdvertisedV4;
        private @Nullable Integer maxPrefixesAdvertisedV6;
        private @Nullable String md5AuthenticationKey;
        private @Nullable String microsoftSessionIPv4Address;
        private @Nullable String microsoftSessionIPv6Address;
        private @Nullable String peerSessionIPv4Address;
        private @Nullable String peerSessionIPv6Address;
        private @Nullable String sessionPrefixV4;
        private @Nullable String sessionPrefixV6;
        private String sessionStateV4;
        private String sessionStateV6;

        public Builder() {
    	      // Empty
        }

        public Builder(BgpSessionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPrefixesAdvertisedV4 = defaults.maxPrefixesAdvertisedV4;
    	      this.maxPrefixesAdvertisedV6 = defaults.maxPrefixesAdvertisedV6;
    	      this.md5AuthenticationKey = defaults.md5AuthenticationKey;
    	      this.microsoftSessionIPv4Address = defaults.microsoftSessionIPv4Address;
    	      this.microsoftSessionIPv6Address = defaults.microsoftSessionIPv6Address;
    	      this.peerSessionIPv4Address = defaults.peerSessionIPv4Address;
    	      this.peerSessionIPv6Address = defaults.peerSessionIPv6Address;
    	      this.sessionPrefixV4 = defaults.sessionPrefixV4;
    	      this.sessionPrefixV6 = defaults.sessionPrefixV6;
    	      this.sessionStateV4 = defaults.sessionStateV4;
    	      this.sessionStateV6 = defaults.sessionStateV6;
        }

        public Builder maxPrefixesAdvertisedV4(@Nullable Integer maxPrefixesAdvertisedV4) {
            this.maxPrefixesAdvertisedV4 = maxPrefixesAdvertisedV4;
            return this;
        }
        public Builder maxPrefixesAdvertisedV6(@Nullable Integer maxPrefixesAdvertisedV6) {
            this.maxPrefixesAdvertisedV6 = maxPrefixesAdvertisedV6;
            return this;
        }
        public Builder md5AuthenticationKey(@Nullable String md5AuthenticationKey) {
            this.md5AuthenticationKey = md5AuthenticationKey;
            return this;
        }
        public Builder microsoftSessionIPv4Address(@Nullable String microsoftSessionIPv4Address) {
            this.microsoftSessionIPv4Address = microsoftSessionIPv4Address;
            return this;
        }
        public Builder microsoftSessionIPv6Address(@Nullable String microsoftSessionIPv6Address) {
            this.microsoftSessionIPv6Address = microsoftSessionIPv6Address;
            return this;
        }
        public Builder peerSessionIPv4Address(@Nullable String peerSessionIPv4Address) {
            this.peerSessionIPv4Address = peerSessionIPv4Address;
            return this;
        }
        public Builder peerSessionIPv6Address(@Nullable String peerSessionIPv6Address) {
            this.peerSessionIPv6Address = peerSessionIPv6Address;
            return this;
        }
        public Builder sessionPrefixV4(@Nullable String sessionPrefixV4) {
            this.sessionPrefixV4 = sessionPrefixV4;
            return this;
        }
        public Builder sessionPrefixV6(@Nullable String sessionPrefixV6) {
            this.sessionPrefixV6 = sessionPrefixV6;
            return this;
        }
        public Builder sessionStateV4(String sessionStateV4) {
            this.sessionStateV4 = Objects.requireNonNull(sessionStateV4);
            return this;
        }
        public Builder sessionStateV6(String sessionStateV6) {
            this.sessionStateV6 = Objects.requireNonNull(sessionStateV6);
            return this;
        }        public BgpSessionResponse build() {
            return new BgpSessionResponse(maxPrefixesAdvertisedV4, maxPrefixesAdvertisedV6, md5AuthenticationKey, microsoftSessionIPv4Address, microsoftSessionIPv6Address, peerSessionIPv4Address, peerSessionIPv6Address, sessionPrefixV4, sessionPrefixV6, sessionStateV4, sessionStateV6);
        }
    }
}
