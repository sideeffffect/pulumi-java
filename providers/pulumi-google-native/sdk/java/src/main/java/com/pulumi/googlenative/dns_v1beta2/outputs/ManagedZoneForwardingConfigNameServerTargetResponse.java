// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedZoneForwardingConfigNameServerTargetResponse {
    /**
     * Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    private final String forwardingPath;
    /**
     * IPv4 address of a target name server.
     * 
     */
    private final String ipv4Address;
    /**
     * IPv6 address of a target name server. Does not accept both fields (ipv4 & ipv6) being populated.
     * 
     */
    private final String ipv6Address;
    private final String kind;

    @CustomType.Constructor
    private ManagedZoneForwardingConfigNameServerTargetResponse(
        @CustomType.Parameter("forwardingPath") String forwardingPath,
        @CustomType.Parameter("ipv4Address") String ipv4Address,
        @CustomType.Parameter("ipv6Address") String ipv6Address,
        @CustomType.Parameter("kind") String kind) {
        this.forwardingPath = forwardingPath;
        this.ipv4Address = ipv4Address;
        this.ipv6Address = ipv6Address;
        this.kind = kind;
    }

    /**
     * Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
    */
    public String forwardingPath() {
        return this.forwardingPath;
    }
    /**
     * IPv4 address of a target name server.
     * 
    */
    public String ipv4Address() {
        return this.ipv4Address;
    }
    /**
     * IPv6 address of a target name server. Does not accept both fields (ipv4 & ipv6) being populated.
     * 
    */
    public String ipv6Address() {
        return this.ipv6Address;
    }
    public String kind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigNameServerTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String forwardingPath;
        private String ipv4Address;
        private String ipv6Address;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigNameServerTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
        }

        public Builder forwardingPath(String forwardingPath) {
            this.forwardingPath = Objects.requireNonNull(forwardingPath);
            return this;
        }
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public ManagedZoneForwardingConfigNameServerTargetResponse build() {
            return new ManagedZoneForwardingConfigNameServerTargetResponse(forwardingPath, ipv4Address, ipv6Address, kind);
        }
    }
}
