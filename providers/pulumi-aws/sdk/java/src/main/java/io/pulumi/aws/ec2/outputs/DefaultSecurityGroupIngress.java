// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefaultSecurityGroupIngress {
    /**
     * List of CIDR blocks.
     * 
     */
    private final @Nullable List<String> cidrBlocks;
    /**
     * Description of this rule.
     * 
     */
    private final @Nullable String description;
    /**
     * Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    private final Integer fromPort;
    /**
     * List of IPv6 CIDR blocks.
     * 
     */
    private final @Nullable List<String> ipv6CidrBlocks;
    /**
     * List of prefix list IDs (for allowing access to VPC endpoints)
     * 
     */
    private final @Nullable List<String> prefixListIds;
    /**
     * Protocol. If you select a protocol of "-1" (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to `0`. If not `icmp`, `tcp`, `udp`, or `-1` use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    private final String protocol;
    /**
     * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    private final @Nullable Boolean self;
    /**
     * End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    private final Integer toPort;

    @OutputCustomType.Constructor
    private DefaultSecurityGroupIngress(
        @OutputCustomType.Parameter("cidrBlocks") @Nullable List<String> cidrBlocks,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("fromPort") Integer fromPort,
        @OutputCustomType.Parameter("ipv6CidrBlocks") @Nullable List<String> ipv6CidrBlocks,
        @OutputCustomType.Parameter("prefixListIds") @Nullable List<String> prefixListIds,
        @OutputCustomType.Parameter("protocol") String protocol,
        @OutputCustomType.Parameter("securityGroups") @Nullable List<String> securityGroups,
        @OutputCustomType.Parameter("self") @Nullable Boolean self,
        @OutputCustomType.Parameter("toPort") Integer toPort) {
        this.cidrBlocks = cidrBlocks;
        this.description = description;
        this.fromPort = fromPort;
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.prefixListIds = prefixListIds;
        this.protocol = protocol;
        this.securityGroups = securityGroups;
        this.self = self;
        this.toPort = toPort;
    }

    /**
     * List of CIDR blocks.
     * 
    */
    public List<String> getCidrBlocks() {
        return this.cidrBlocks == null ? List.of() : this.cidrBlocks;
    }
    /**
     * Description of this rule.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Start port (or ICMP type number if protocol is `icmp`)
     * 
    */
    public Integer getFromPort() {
        return this.fromPort;
    }
    /**
     * List of IPv6 CIDR blocks.
     * 
    */
    public List<String> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? List.of() : this.ipv6CidrBlocks;
    }
    /**
     * List of prefix list IDs (for allowing access to VPC endpoints)
     * 
    */
    public List<String> getPrefixListIds() {
        return this.prefixListIds == null ? List.of() : this.prefixListIds;
    }
    /**
     * Protocol. If you select a protocol of "-1" (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to `0`. If not `icmp`, `tcp`, `udp`, or `-1` use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
    */
    public List<String> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * Whether the security group itself will be added as a source to this egress rule.
     * 
    */
    public Optional<Boolean> getSelf() {
        return Optional.ofNullable(this.self);
    }
    /**
     * End range port (or ICMP code if protocol is `icmp`).
     * 
    */
    public Integer getToPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSecurityGroupIngress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cidrBlocks;
        private @Nullable String description;
        private Integer fromPort;
        private @Nullable List<String> ipv6CidrBlocks;
        private @Nullable List<String> prefixListIds;
        private String protocol;
        private @Nullable List<String> securityGroups;
        private @Nullable Boolean self;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSecurityGroupIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.description = defaults.description;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.prefixListIds = defaults.prefixListIds;
    	      this.protocol = defaults.protocol;
    	      this.securityGroups = defaults.securityGroups;
    	      this.self = defaults.self;
    	      this.toPort = defaults.toPort;
        }

        public Builder cidrBlocks(@Nullable List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder ipv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        public Builder prefixListIds(@Nullable List<String> prefixListIds) {
            this.prefixListIds = prefixListIds;
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder self(@Nullable Boolean self) {
            this.self = self;
            return this;
        }

        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public DefaultSecurityGroupIngress build() {
            return new DefaultSecurityGroupIngress(cidrBlocks, description, fromPort, ipv6CidrBlocks, prefixListIds, protocol, securityGroups, self, toPort);
        }
    }
}
