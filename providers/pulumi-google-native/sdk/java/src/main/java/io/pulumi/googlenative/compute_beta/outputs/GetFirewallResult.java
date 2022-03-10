// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.FirewallAllowedItemResponse;
import io.pulumi.googlenative.compute_beta.outputs.FirewallDeniedItemResponse;
import io.pulumi.googlenative.compute_beta.outputs.FirewallLogConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetFirewallResult {
    /**
     * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
     * 
     */
    private final List<FirewallAllowedItemResponse> allowed;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
     * 
     */
    private final List<FirewallDeniedItemResponse> denied;
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private final String description;
    /**
     * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Both IPv4 and IPv6 are supported.
     * 
     */
    private final List<String> destinationRanges;
    /**
     * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
     * 
     */
    private final String direction;
    /**
     * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the firewall rule will be enabled.
     * 
     */
    private final Boolean disabled;
    /**
     * Type of the resource. Always compute#firewall for firewall rules.
     * 
     */
    private final String kind;
    /**
     * This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
     * 
     */
    private final FirewallLogConfigResponse logConfig;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private final String name;
    /**
     * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used: global/networks/default If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network - projects/myproject/global/networks/my-network - global/networks/default
     * 
     */
    private final String network;
    /**
     * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than `65535`.
     * 
     */
    private final Integer priority;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Both IPv4 and IPv6 are supported.
     * 
     */
    private final List<String> sourceRanges;
    /**
     * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
     * 
     */
    private final List<String> sourceServiceAccounts;
    /**
     * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
     * 
     */
    private final List<String> sourceTags;
    /**
     * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    private final List<String> targetServiceAccounts;
    /**
     * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    private final List<String> targetTags;

    @OutputCustomType.Constructor
    private GetFirewallResult(
        @OutputCustomType.Parameter("allowed") List<FirewallAllowedItemResponse> allowed,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("denied") List<FirewallDeniedItemResponse> denied,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("destinationRanges") List<String> destinationRanges,
        @OutputCustomType.Parameter("direction") String direction,
        @OutputCustomType.Parameter("disabled") Boolean disabled,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("logConfig") FirewallLogConfigResponse logConfig,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("network") String network,
        @OutputCustomType.Parameter("priority") Integer priority,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("sourceRanges") List<String> sourceRanges,
        @OutputCustomType.Parameter("sourceServiceAccounts") List<String> sourceServiceAccounts,
        @OutputCustomType.Parameter("sourceTags") List<String> sourceTags,
        @OutputCustomType.Parameter("targetServiceAccounts") List<String> targetServiceAccounts,
        @OutputCustomType.Parameter("targetTags") List<String> targetTags) {
        this.allowed = allowed;
        this.creationTimestamp = creationTimestamp;
        this.denied = denied;
        this.description = description;
        this.destinationRanges = destinationRanges;
        this.direction = direction;
        this.disabled = disabled;
        this.kind = kind;
        this.logConfig = logConfig;
        this.name = name;
        this.network = network;
        this.priority = priority;
        this.selfLink = selfLink;
        this.sourceRanges = sourceRanges;
        this.sourceServiceAccounts = sourceServiceAccounts;
        this.sourceTags = sourceTags;
        this.targetServiceAccounts = targetServiceAccounts;
        this.targetTags = targetTags;
    }

    /**
     * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
     * 
    */
    public List<FirewallAllowedItemResponse> getAllowed() {
        return this.allowed;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
     * 
    */
    public List<FirewallDeniedItemResponse> getDenied() {
        return this.denied;
    }
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Both IPv4 and IPv6 are supported.
     * 
    */
    public List<String> getDestinationRanges() {
        return this.destinationRanges;
    }
    /**
     * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
     * 
    */
    public String getDirection() {
        return this.direction;
    }
    /**
     * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the firewall rule will be enabled.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * Type of the resource. Always compute#firewall for firewall rules.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
     * 
    */
    public FirewallLogConfigResponse getLogConfig() {
        return this.logConfig;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used: global/networks/default If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network - projects/myproject/global/networks/my-network - global/networks/default
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than `65535`.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Both IPv4 and IPv6 are supported.
     * 
    */
    public List<String> getSourceRanges() {
        return this.sourceRanges;
    }
    /**
     * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
     * 
    */
    public List<String> getSourceServiceAccounts() {
        return this.sourceServiceAccounts;
    }
    /**
     * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
     * 
    */
    public List<String> getSourceTags() {
        return this.sourceTags;
    }
    /**
     * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
    */
    public List<String> getTargetServiceAccounts() {
        return this.targetServiceAccounts;
    }
    /**
     * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
    */
    public List<String> getTargetTags() {
        return this.targetTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FirewallAllowedItemResponse> allowed;
        private String creationTimestamp;
        private List<FirewallDeniedItemResponse> denied;
        private String description;
        private List<String> destinationRanges;
        private String direction;
        private Boolean disabled;
        private String kind;
        private FirewallLogConfigResponse logConfig;
        private String name;
        private String network;
        private Integer priority;
        private String selfLink;
        private List<String> sourceRanges;
        private List<String> sourceServiceAccounts;
        private List<String> sourceTags;
        private List<String> targetServiceAccounts;
        private List<String> targetTags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowed = defaults.allowed;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.denied = defaults.denied;
    	      this.description = defaults.description;
    	      this.destinationRanges = defaults.destinationRanges;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.kind = defaults.kind;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.selfLink = defaults.selfLink;
    	      this.sourceRanges = defaults.sourceRanges;
    	      this.sourceServiceAccounts = defaults.sourceServiceAccounts;
    	      this.sourceTags = defaults.sourceTags;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
    	      this.targetTags = defaults.targetTags;
        }

        public Builder allowed(List<FirewallAllowedItemResponse> allowed) {
            this.allowed = Objects.requireNonNull(allowed);
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder denied(List<FirewallDeniedItemResponse> denied) {
            this.denied = Objects.requireNonNull(denied);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder destinationRanges(List<String> destinationRanges) {
            this.destinationRanges = Objects.requireNonNull(destinationRanges);
            return this;
        }

        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder logConfig(FirewallLogConfigResponse logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder sourceRanges(List<String> sourceRanges) {
            this.sourceRanges = Objects.requireNonNull(sourceRanges);
            return this;
        }

        public Builder sourceServiceAccounts(List<String> sourceServiceAccounts) {
            this.sourceServiceAccounts = Objects.requireNonNull(sourceServiceAccounts);
            return this;
        }

        public Builder sourceTags(List<String> sourceTags) {
            this.sourceTags = Objects.requireNonNull(sourceTags);
            return this;
        }

        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
            return this;
        }

        public Builder targetTags(List<String> targetTags) {
            this.targetTags = Objects.requireNonNull(targetTags);
            return this;
        }
        public GetFirewallResult build() {
            return new GetFirewallResult(allowed, creationTimestamp, denied, description, destinationRanges, direction, disabled, kind, logConfig, name, network, priority, selfLink, sourceRanges, sourceServiceAccounts, sourceTags, targetServiceAccounts, targetTags);
        }
    }
}
