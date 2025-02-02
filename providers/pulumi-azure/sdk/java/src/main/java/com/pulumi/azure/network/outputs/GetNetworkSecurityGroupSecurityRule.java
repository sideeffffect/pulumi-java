// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkSecurityGroupSecurityRule {
    /**
     * @return Is network traffic is allowed or denied?
     * 
     */
    private final String access;
    /**
     * @return The description for this rule.
     * 
     */
    private final String description;
    /**
     * @return CIDR or destination IP range or * to match any IP.
     * 
     */
    private final String destinationAddressPrefix;
    /**
     * @return A list of CIDRs or destination IP ranges.
     * 
     */
    private final List<String> destinationAddressPrefixes;
    /**
     * @return A List of destination Application Security Group ID&#39;s
     * 
     */
    private final @Nullable List<String> destinationApplicationSecurityGroupIds;
    /**
     * @return The Destination Port or Range.
     * 
     */
    private final String destinationPortRange;
    private final List<String> destinationPortRanges;
    /**
     * @return The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    private final String direction;
    /**
     * @return Specifies the Name of the Network Security Group.
     * 
     */
    private final String name;
    /**
     * @return The priority of the rule
     * 
     */
    private final Integer priority;
    /**
     * @return The network protocol this rule applies to.
     * 
     */
    private final String protocol;
    /**
     * @return CIDR or source IP range or * to match any IP.
     * 
     */
    private final String sourceAddressPrefix;
    /**
     * @return A list of CIDRs or source IP ranges.
     * 
     */
    private final List<String> sourceAddressPrefixes;
    /**
     * @return A List of source Application Security Group ID&#39;s
     * 
     */
    private final @Nullable List<String> sourceApplicationSecurityGroupIds;
    /**
     * @return The Source Port or Range.
     * 
     */
    private final String sourcePortRange;
    private final List<String> sourcePortRanges;

    @CustomType.Constructor
    private GetNetworkSecurityGroupSecurityRule(
        @CustomType.Parameter("access") String access,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("destinationAddressPrefix") String destinationAddressPrefix,
        @CustomType.Parameter("destinationAddressPrefixes") List<String> destinationAddressPrefixes,
        @CustomType.Parameter("destinationApplicationSecurityGroupIds") @Nullable List<String> destinationApplicationSecurityGroupIds,
        @CustomType.Parameter("destinationPortRange") String destinationPortRange,
        @CustomType.Parameter("destinationPortRanges") List<String> destinationPortRanges,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("sourceAddressPrefix") String sourceAddressPrefix,
        @CustomType.Parameter("sourceAddressPrefixes") List<String> sourceAddressPrefixes,
        @CustomType.Parameter("sourceApplicationSecurityGroupIds") @Nullable List<String> sourceApplicationSecurityGroupIds,
        @CustomType.Parameter("sourcePortRange") String sourcePortRange,
        @CustomType.Parameter("sourcePortRanges") List<String> sourcePortRanges) {
        this.access = access;
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        this.destinationApplicationSecurityGroupIds = destinationApplicationSecurityGroupIds;
        this.destinationPortRange = destinationPortRange;
        this.destinationPortRanges = destinationPortRanges;
        this.direction = direction;
        this.name = name;
        this.priority = priority;
        this.protocol = protocol;
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        this.sourceApplicationSecurityGroupIds = sourceApplicationSecurityGroupIds;
        this.sourcePortRange = sourcePortRange;
        this.sourcePortRanges = sourcePortRanges;
    }

    /**
     * @return Is network traffic is allowed or denied?
     * 
     */
    public String access() {
        return this.access;
    }
    /**
     * @return The description for this rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return CIDR or destination IP range or * to match any IP.
     * 
     */
    public String destinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }
    /**
     * @return A list of CIDRs or destination IP ranges.
     * 
     */
    public List<String> destinationAddressPrefixes() {
        return this.destinationAddressPrefixes;
    }
    /**
     * @return A List of destination Application Security Group ID&#39;s
     * 
     */
    public List<String> destinationApplicationSecurityGroupIds() {
        return this.destinationApplicationSecurityGroupIds == null ? List.of() : this.destinationApplicationSecurityGroupIds;
    }
    /**
     * @return The Destination Port or Range.
     * 
     */
    public String destinationPortRange() {
        return this.destinationPortRange;
    }
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }
    /**
     * @return The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return Specifies the Name of the Network Security Group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The priority of the rule
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The network protocol this rule applies to.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return CIDR or source IP range or * to match any IP.
     * 
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }
    /**
     * @return A list of CIDRs or source IP ranges.
     * 
     */
    public List<String> sourceAddressPrefixes() {
        return this.sourceAddressPrefixes;
    }
    /**
     * @return A List of source Application Security Group ID&#39;s
     * 
     */
    public List<String> sourceApplicationSecurityGroupIds() {
        return this.sourceApplicationSecurityGroupIds == null ? List.of() : this.sourceApplicationSecurityGroupIds;
    }
    /**
     * @return The Source Port or Range.
     * 
     */
    public String sourcePortRange() {
        return this.sourcePortRange;
    }
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkSecurityGroupSecurityRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private String description;
        private String destinationAddressPrefix;
        private List<String> destinationAddressPrefixes;
        private @Nullable List<String> destinationApplicationSecurityGroupIds;
        private String destinationPortRange;
        private List<String> destinationPortRanges;
        private String direction;
        private String name;
        private Integer priority;
        private String protocol;
        private String sourceAddressPrefix;
        private List<String> sourceAddressPrefixes;
        private @Nullable List<String> sourceApplicationSecurityGroupIds;
        private String sourcePortRange;
        private List<String> sourcePortRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkSecurityGroupSecurityRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationAddressPrefixes = defaults.destinationAddressPrefixes;
    	      this.destinationApplicationSecurityGroupIds = defaults.destinationApplicationSecurityGroupIds;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourceAddressPrefixes = defaults.sourceAddressPrefixes;
    	      this.sourceApplicationSecurityGroupIds = defaults.sourceApplicationSecurityGroupIds;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder destinationAddressPrefix(String destinationAddressPrefix) {
            this.destinationAddressPrefix = Objects.requireNonNull(destinationAddressPrefix);
            return this;
        }
        public Builder destinationAddressPrefixes(List<String> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = Objects.requireNonNull(destinationAddressPrefixes);
            return this;
        }
        public Builder destinationAddressPrefixes(String... destinationAddressPrefixes) {
            return destinationAddressPrefixes(List.of(destinationAddressPrefixes));
        }
        public Builder destinationApplicationSecurityGroupIds(@Nullable List<String> destinationApplicationSecurityGroupIds) {
            this.destinationApplicationSecurityGroupIds = destinationApplicationSecurityGroupIds;
            return this;
        }
        public Builder destinationApplicationSecurityGroupIds(String... destinationApplicationSecurityGroupIds) {
            return destinationApplicationSecurityGroupIds(List.of(destinationApplicationSecurityGroupIds));
        }
        public Builder destinationPortRange(String destinationPortRange) {
            this.destinationPortRange = Objects.requireNonNull(destinationPortRange);
            return this;
        }
        public Builder destinationPortRanges(List<String> destinationPortRanges) {
            this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
            return this;
        }
        public Builder destinationPortRanges(String... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder sourceAddressPrefix(String sourceAddressPrefix) {
            this.sourceAddressPrefix = Objects.requireNonNull(sourceAddressPrefix);
            return this;
        }
        public Builder sourceAddressPrefixes(List<String> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = Objects.requireNonNull(sourceAddressPrefixes);
            return this;
        }
        public Builder sourceAddressPrefixes(String... sourceAddressPrefixes) {
            return sourceAddressPrefixes(List.of(sourceAddressPrefixes));
        }
        public Builder sourceApplicationSecurityGroupIds(@Nullable List<String> sourceApplicationSecurityGroupIds) {
            this.sourceApplicationSecurityGroupIds = sourceApplicationSecurityGroupIds;
            return this;
        }
        public Builder sourceApplicationSecurityGroupIds(String... sourceApplicationSecurityGroupIds) {
            return sourceApplicationSecurityGroupIds(List.of(sourceApplicationSecurityGroupIds));
        }
        public Builder sourcePortRange(String sourcePortRange) {
            this.sourcePortRange = Objects.requireNonNull(sourcePortRange);
            return this;
        }
        public Builder sourcePortRanges(List<String> sourcePortRanges) {
            this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
            return this;
        }
        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }        public GetNetworkSecurityGroupSecurityRule build() {
            return new GetNetworkSecurityGroupSecurityRule(access, description, destinationAddressPrefix, destinationAddressPrefixes, destinationApplicationSecurityGroupIds, destinationPortRange, destinationPortRanges, direction, name, priority, protocol, sourceAddressPrefix, sourceAddressPrefixes, sourceApplicationSecurityGroupIds, sourcePortRange, sourcePortRanges);
        }
    }
}
