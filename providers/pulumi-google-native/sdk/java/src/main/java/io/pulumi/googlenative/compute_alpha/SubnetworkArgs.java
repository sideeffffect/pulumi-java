// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkAggregationInterval;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkIpv6AccessType;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkMetadata;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkPrivateIpv6GoogleAccess;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkPurpose;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkRole;
import io.pulumi.googlenative.compute_alpha.enums.SubnetworkStackType;
import io.pulumi.googlenative.compute_alpha.inputs.SubnetworkLogConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SubnetworkSecondaryRangeArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkArgs Empty = new SubnetworkArgs();

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Sets the aggregation interval for collecting flow logs. Increasing the interval time reduces the amount of generated flow logs for long-lasting connections. Default is an interval of 5 seconds per connection. Valid values: INTERVAL_5_SEC, INTERVAL_30_SEC, INTERVAL_1_MIN, INTERVAL_5_MIN, INTERVAL_10_MIN, INTERVAL_15_MIN.
     * 
     */
    @InputImport(name="aggregationInterval")
      private final @Nullable Input<SubnetworkAggregationInterval> aggregationInterval;

    public Input<SubnetworkAggregationInterval> getAggregationInterval() {
        return this.aggregationInterval == null ? Input.empty() : this.aggregationInterval;
    }

    /**
     * Whether this subnetwork's ranges can conflict with existing static routes. Setting this to true allows this subnetwork's primary and secondary ranges to overlap with (and contain) static routes that have already been configured on the corresponding network. For example if a static route has range 10.1.0.0/16, a subnet range 10.0.0.0/8 could only be created if allow_conflicting_routes=true. Overlapping is only allowed on subnetwork operations; routes whose ranges conflict with this subnetwork's ranges won't be allowed unless route.allow_conflicting_subnetworks is set to true. Typically packets destined to IPs within the subnetwork (which may contain private/sensitive data) are prevented from leaving the virtual network. Setting this field to true will disable this feature. The default value is false and applies to all existing subnetworks and automatically created subnetworks. This field cannot be set to true at resource creation time.
     * 
     */
    @InputImport(name="allowSubnetCidrRoutesOverlap")
      private final @Nullable Input<Boolean> allowSubnetCidrRoutesOverlap;

    public Input<Boolean> getAllowSubnetCidrRoutesOverlap() {
        return this.allowSubnetCidrRoutesOverlap == null ? Input.empty() : this.allowSubnetCidrRoutesOverlap;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @InputImport(name="enableFlowLogs")
      private final @Nullable Input<Boolean> enableFlowLogs;

    public Input<Boolean> getEnableFlowLogs() {
        return this.enableFlowLogs == null ? Input.empty() : this.enableFlowLogs;
    }

    /**
     * Enables Layer2 communication on the subnetwork.
     * 
     */
    @InputImport(name="enableL2")
      private final @Nullable Input<Boolean> enableL2;

    public Input<Boolean> getEnableL2() {
        return this.enableL2 == null ? Input.empty() : this.enableL2;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    @InputImport(name="flowSampling")
      private final @Nullable Input<Double> flowSampling;

    public Input<Double> getFlowSampling() {
        return this.flowSampling == null ? Input.empty() : this.flowSampling;
    }

    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
     */
    @InputImport(name="ipCidrRange")
      private final @Nullable Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Input.empty() : this.ipCidrRange;
    }

    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    @InputImport(name="ipv6AccessType")
      private final @Nullable Input<SubnetworkIpv6AccessType> ipv6AccessType;

    public Input<SubnetworkIpv6AccessType> getIpv6AccessType() {
        return this.ipv6AccessType == null ? Input.empty() : this.ipv6AccessType;
    }

    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<SubnetworkLogConfigArgs> logConfig;

    public Input<SubnetworkLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Configures whether metadata fields should be added to the reported VPC flow logs. Options are INCLUDE_ALL_METADATA, EXCLUDE_ALL_METADATA, and CUSTOM_METADATA. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<SubnetworkMetadata> metadata;

    public Input<SubnetworkMetadata> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
     */
    @InputImport(name="privateIpGoogleAccess")
      private final @Nullable Input<Boolean> privateIpGoogleAccess;

    public Input<Boolean> getPrivateIpGoogleAccess() {
        return this.privateIpGoogleAccess == null ? Input.empty() : this.privateIpGoogleAccess;
    }

    /**
     * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @InputImport(name="privateIpv6GoogleAccess")
      private final @Nullable Input<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Input<SubnetworkPrivateIpv6GoogleAccess> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Input.empty() : this.privateIpv6GoogleAccess;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @InputImport(name="purpose")
      private final @Nullable Input<SubnetworkPurpose> purpose;

    public Input<SubnetworkPurpose> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
     */
    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The URL of the reserved internal range.
     * 
     */
    @InputImport(name="reservedInternalRange")
      private final @Nullable Input<String> reservedInternalRange;

    public Input<String> getReservedInternalRange() {
        return this.reservedInternalRange == null ? Input.empty() : this.reservedInternalRange;
    }

    /**
     * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<SubnetworkRole> role;

    public Input<SubnetworkRole> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
     */
    @InputImport(name="secondaryIpRanges")
      private final @Nullable Input<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges;

    public Input<List<SubnetworkSecondaryRangeArgs>> getSecondaryIpRanges() {
        return this.secondaryIpRanges == null ? Input.empty() : this.secondaryIpRanges;
    }

    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @InputImport(name="stackType")
      private final @Nullable Input<SubnetworkStackType> stackType;

    public Input<SubnetworkStackType> getStackType() {
        return this.stackType == null ? Input.empty() : this.stackType;
    }

    /**
     * A repeated field indicating the VLAN IDs supported on this subnetwork. During Subnet creation, specifying vlan is valid only if enable_l2 is true. During Subnet Update, specifying vlan is allowed only for l2 enabled subnets. Restricted to only one VLAN.
     * 
     */
    @InputImport(name="vlans")
      private final @Nullable Input<List<Integer>> vlans;

    public Input<List<Integer>> getVlans() {
        return this.vlans == null ? Input.empty() : this.vlans;
    }

    public SubnetworkArgs(
        @Nullable Input<SubnetworkAggregationInterval> aggregationInterval,
        @Nullable Input<Boolean> allowSubnetCidrRoutesOverlap,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableFlowLogs,
        @Nullable Input<Boolean> enableL2,
        @Nullable Input<Double> flowSampling,
        @Nullable Input<String> ipCidrRange,
        @Nullable Input<SubnetworkIpv6AccessType> ipv6AccessType,
        @Nullable Input<SubnetworkLogConfigArgs> logConfig,
        @Nullable Input<SubnetworkMetadata> metadata,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<Boolean> privateIpGoogleAccess,
        @Nullable Input<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess,
        @Nullable Input<String> project,
        @Nullable Input<SubnetworkPurpose> purpose,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<String> reservedInternalRange,
        @Nullable Input<SubnetworkRole> role,
        @Nullable Input<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges,
        @Nullable Input<SubnetworkStackType> stackType,
        @Nullable Input<List<Integer>> vlans) {
        this.aggregationInterval = aggregationInterval;
        this.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
        this.description = description;
        this.enableFlowLogs = enableFlowLogs;
        this.enableL2 = enableL2;
        this.flowSampling = flowSampling;
        this.ipCidrRange = ipCidrRange;
        this.ipv6AccessType = ipv6AccessType;
        this.logConfig = logConfig;
        this.metadata = metadata;
        this.name = name;
        this.network = network;
        this.privateIpGoogleAccess = privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.project = project;
        this.purpose = purpose;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.reservedInternalRange = reservedInternalRange;
        this.role = role;
        this.secondaryIpRanges = secondaryIpRanges;
        this.stackType = stackType;
        this.vlans = vlans;
    }

    private SubnetworkArgs() {
        this.aggregationInterval = Input.empty();
        this.allowSubnetCidrRoutesOverlap = Input.empty();
        this.description = Input.empty();
        this.enableFlowLogs = Input.empty();
        this.enableL2 = Input.empty();
        this.flowSampling = Input.empty();
        this.ipCidrRange = Input.empty();
        this.ipv6AccessType = Input.empty();
        this.logConfig = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.privateIpGoogleAccess = Input.empty();
        this.privateIpv6GoogleAccess = Input.empty();
        this.project = Input.empty();
        this.purpose = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.reservedInternalRange = Input.empty();
        this.role = Input.empty();
        this.secondaryIpRanges = Input.empty();
        this.stackType = Input.empty();
        this.vlans = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubnetworkAggregationInterval> aggregationInterval;
        private @Nullable Input<Boolean> allowSubnetCidrRoutesOverlap;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableFlowLogs;
        private @Nullable Input<Boolean> enableL2;
        private @Nullable Input<Double> flowSampling;
        private @Nullable Input<String> ipCidrRange;
        private @Nullable Input<SubnetworkIpv6AccessType> ipv6AccessType;
        private @Nullable Input<SubnetworkLogConfigArgs> logConfig;
        private @Nullable Input<SubnetworkMetadata> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<Boolean> privateIpGoogleAccess;
        private @Nullable Input<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;
        private @Nullable Input<String> project;
        private @Nullable Input<SubnetworkPurpose> purpose;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> reservedInternalRange;
        private @Nullable Input<SubnetworkRole> role;
        private @Nullable Input<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges;
        private @Nullable Input<SubnetworkStackType> stackType;
        private @Nullable Input<List<Integer>> vlans;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.allowSubnetCidrRoutesOverlap = defaults.allowSubnetCidrRoutesOverlap;
    	      this.description = defaults.description;
    	      this.enableFlowLogs = defaults.enableFlowLogs;
    	      this.enableL2 = defaults.enableL2;
    	      this.flowSampling = defaults.flowSampling;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.logConfig = defaults.logConfig;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.reservedInternalRange = defaults.reservedInternalRange;
    	      this.role = defaults.role;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.stackType = defaults.stackType;
    	      this.vlans = defaults.vlans;
        }

        public Builder aggregationInterval(@Nullable Input<SubnetworkAggregationInterval> aggregationInterval) {
            this.aggregationInterval = aggregationInterval;
            return this;
        }

        public Builder aggregationInterval(@Nullable SubnetworkAggregationInterval aggregationInterval) {
            this.aggregationInterval = Input.ofNullable(aggregationInterval);
            return this;
        }

        public Builder allowSubnetCidrRoutesOverlap(@Nullable Input<Boolean> allowSubnetCidrRoutesOverlap) {
            this.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
            return this;
        }

        public Builder allowSubnetCidrRoutesOverlap(@Nullable Boolean allowSubnetCidrRoutesOverlap) {
            this.allowSubnetCidrRoutesOverlap = Input.ofNullable(allowSubnetCidrRoutesOverlap);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder enableFlowLogs(@Nullable Input<Boolean> enableFlowLogs) {
            this.enableFlowLogs = enableFlowLogs;
            return this;
        }

        public Builder enableFlowLogs(@Nullable Boolean enableFlowLogs) {
            this.enableFlowLogs = Input.ofNullable(enableFlowLogs);
            return this;
        }

        public Builder enableL2(@Nullable Input<Boolean> enableL2) {
            this.enableL2 = enableL2;
            return this;
        }

        public Builder enableL2(@Nullable Boolean enableL2) {
            this.enableL2 = Input.ofNullable(enableL2);
            return this;
        }

        public Builder flowSampling(@Nullable Input<Double> flowSampling) {
            this.flowSampling = flowSampling;
            return this;
        }

        public Builder flowSampling(@Nullable Double flowSampling) {
            this.flowSampling = Input.ofNullable(flowSampling);
            return this;
        }

        public Builder ipCidrRange(@Nullable Input<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Input.ofNullable(ipCidrRange);
            return this;
        }

        public Builder ipv6AccessType(@Nullable Input<SubnetworkIpv6AccessType> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder ipv6AccessType(@Nullable SubnetworkIpv6AccessType ipv6AccessType) {
            this.ipv6AccessType = Input.ofNullable(ipv6AccessType);
            return this;
        }

        public Builder logConfig(@Nullable Input<SubnetworkLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(@Nullable SubnetworkLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder metadata(@Nullable Input<SubnetworkMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable SubnetworkMetadata metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder network(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder privateIpGoogleAccess(@Nullable Input<Boolean> privateIpGoogleAccess) {
            this.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }

        public Builder privateIpGoogleAccess(@Nullable Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Input.ofNullable(privateIpGoogleAccess);
            return this;
        }

        public Builder privateIpv6GoogleAccess(@Nullable Input<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder privateIpv6GoogleAccess(@Nullable SubnetworkPrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Input.ofNullable(privateIpv6GoogleAccess);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder purpose(@Nullable Input<SubnetworkPurpose> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder purpose(@Nullable SubnetworkPurpose purpose) {
            this.purpose = Input.ofNullable(purpose);
            return this;
        }

        public Builder region(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder reservedInternalRange(@Nullable Input<String> reservedInternalRange) {
            this.reservedInternalRange = reservedInternalRange;
            return this;
        }

        public Builder reservedInternalRange(@Nullable String reservedInternalRange) {
            this.reservedInternalRange = Input.ofNullable(reservedInternalRange);
            return this;
        }

        public Builder role(@Nullable Input<SubnetworkRole> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable SubnetworkRole role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder secondaryIpRanges(@Nullable Input<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges) {
            this.secondaryIpRanges = secondaryIpRanges;
            return this;
        }

        public Builder secondaryIpRanges(@Nullable List<SubnetworkSecondaryRangeArgs> secondaryIpRanges) {
            this.secondaryIpRanges = Input.ofNullable(secondaryIpRanges);
            return this;
        }

        public Builder stackType(@Nullable Input<SubnetworkStackType> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder stackType(@Nullable SubnetworkStackType stackType) {
            this.stackType = Input.ofNullable(stackType);
            return this;
        }

        public Builder vlans(@Nullable Input<List<Integer>> vlans) {
            this.vlans = vlans;
            return this;
        }

        public Builder vlans(@Nullable List<Integer> vlans) {
            this.vlans = Input.ofNullable(vlans);
            return this;
        }
        public SubnetworkArgs build() {
            return new SubnetworkArgs(aggregationInterval, allowSubnetCidrRoutesOverlap, description, enableFlowLogs, enableL2, flowSampling, ipCidrRange, ipv6AccessType, logConfig, metadata, name, network, privateIpGoogleAccess, privateIpv6GoogleAccess, project, purpose, region, requestId, reservedInternalRange, role, secondaryIpRanges, stackType, vlans);
        }
    }
}
