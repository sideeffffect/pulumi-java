// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.AdvancedMachineFeaturesResponse;
import io.pulumi.googlenative.compute_v1.outputs.AttachedDiskResponse;
import io.pulumi.googlenative.compute_v1.outputs.ConfidentialInstanceConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.MetadataResponse;
import io.pulumi.googlenative.compute_v1.outputs.NetworkInterfaceResponse;
import io.pulumi.googlenative.compute_v1.outputs.NetworkPerformanceConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.ReservationAffinityResponse;
import io.pulumi.googlenative.compute_v1.outputs.SchedulingResponse;
import io.pulumi.googlenative.compute_v1.outputs.ServiceAccountResponse;
import io.pulumi.googlenative.compute_v1.outputs.ShieldedInstanceConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class InstancePropertiesResponse {
    /**
     * Controls for advanced machine-related behavior features. Note that for MachineImage, this is not supported yet.
     * 
     */
    private final AdvancedMachineFeaturesResponse advancedMachineFeatures;
    /**
     * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
     */
    private final Boolean canIpForward;
    /**
     * Specifies the Confidential Instance options. Note that for MachineImage, this is not supported yet.
     * 
     */
    private final ConfidentialInstanceConfigResponse confidentialInstanceConfig;
    /**
     * An optional text description for the instances that are created from these properties.
     * 
     */
    private final String description;
    /**
     * An array of disks that are associated with the instances that are created from these properties.
     * 
     */
    private final List<AttachedDiskResponse> disks;
    /**
     * A list of guest accelerator cards' type and count to use for instances created from these properties.
     * 
     */
    private final List<AcceleratorConfigResponse> guestAccelerators;
    /**
     * Labels to apply to instances that are created from these properties.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The machine type to use for instances that are created from these properties.
     * 
     */
    private final String machineType;
    /**
     * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
     */
    private final MetadataResponse metadata;
    /**
     * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
     * 
     */
    private final String minCpuPlatform;
    /**
     * An array of network access configurations for this interface.
     * 
     */
    private final List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * Note that for MachineImage, this is not supported yet.
     * 
     */
    private final NetworkPerformanceConfigResponse networkPerformanceConfig;
    /**
     * The private IPv6 google access type for VMs. If not specified, use INHERIT_FROM_SUBNETWORK as default. Note that for MachineImage, this is not supported yet.
     * 
     */
    private final String privateIpv6GoogleAccess;
    /**
     * Specifies the reservations that instances can consume from. Note that for MachineImage, this is not supported yet.
     * 
     */
    private final ReservationAffinityResponse reservationAffinity;
    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
     * 
     */
    private final Map<String,String> resourceManagerTags;
    /**
     * Resource policies (names, not URLs) applied to instances created from these properties. Note that for MachineImage, this is not supported yet.
     * 
     */
    private final List<String> resourcePolicies;
    /**
     * Specifies the scheduling options for the instances that are created from these properties.
     * 
     */
    private final SchedulingResponse scheduling;
    /**
     * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
     * 
     */
    private final List<ServiceAccountResponse> serviceAccounts;
    /**
     * Note that for MachineImage, this is not supported yet.
     * 
     */
    private final ShieldedInstanceConfigResponse shieldedInstanceConfig;
    /**
     * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    private final TagsResponse tags;

    @OutputCustomType.Constructor
    private InstancePropertiesResponse(
        @OutputCustomType.Parameter("advancedMachineFeatures") AdvancedMachineFeaturesResponse advancedMachineFeatures,
        @OutputCustomType.Parameter("canIpForward") Boolean canIpForward,
        @OutputCustomType.Parameter("confidentialInstanceConfig") ConfidentialInstanceConfigResponse confidentialInstanceConfig,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("disks") List<AttachedDiskResponse> disks,
        @OutputCustomType.Parameter("guestAccelerators") List<AcceleratorConfigResponse> guestAccelerators,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("machineType") String machineType,
        @OutputCustomType.Parameter("metadata") MetadataResponse metadata,
        @OutputCustomType.Parameter("minCpuPlatform") String minCpuPlatform,
        @OutputCustomType.Parameter("networkInterfaces") List<NetworkInterfaceResponse> networkInterfaces,
        @OutputCustomType.Parameter("networkPerformanceConfig") NetworkPerformanceConfigResponse networkPerformanceConfig,
        @OutputCustomType.Parameter("privateIpv6GoogleAccess") String privateIpv6GoogleAccess,
        @OutputCustomType.Parameter("reservationAffinity") ReservationAffinityResponse reservationAffinity,
        @OutputCustomType.Parameter("resourceManagerTags") Map<String,String> resourceManagerTags,
        @OutputCustomType.Parameter("resourcePolicies") List<String> resourcePolicies,
        @OutputCustomType.Parameter("scheduling") SchedulingResponse scheduling,
        @OutputCustomType.Parameter("serviceAccounts") List<ServiceAccountResponse> serviceAccounts,
        @OutputCustomType.Parameter("shieldedInstanceConfig") ShieldedInstanceConfigResponse shieldedInstanceConfig,
        @OutputCustomType.Parameter("tags") TagsResponse tags) {
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.canIpForward = canIpForward;
        this.confidentialInstanceConfig = confidentialInstanceConfig;
        this.description = description;
        this.disks = disks;
        this.guestAccelerators = guestAccelerators;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.networkInterfaces = networkInterfaces;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.reservationAffinity = reservationAffinity;
        this.resourceManagerTags = resourceManagerTags;
        this.resourcePolicies = resourcePolicies;
        this.scheduling = scheduling;
        this.serviceAccounts = serviceAccounts;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.tags = tags;
    }

    /**
     * Controls for advanced machine-related behavior features. Note that for MachineImage, this is not supported yet.
     * 
    */
    public AdvancedMachineFeaturesResponse getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
    */
    public Boolean getCanIpForward() {
        return this.canIpForward;
    }
    /**
     * Specifies the Confidential Instance options. Note that for MachineImage, this is not supported yet.
     * 
    */
    public ConfidentialInstanceConfigResponse getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * An optional text description for the instances that are created from these properties.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * An array of disks that are associated with the instances that are created from these properties.
     * 
    */
    public List<AttachedDiskResponse> getDisks() {
        return this.disks;
    }
    /**
     * A list of guest accelerator cards' type and count to use for instances created from these properties.
     * 
    */
    public List<AcceleratorConfigResponse> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * Labels to apply to instances that are created from these properties.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The machine type to use for instances that are created from these properties.
     * 
    */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
    */
    public MetadataResponse getMetadata() {
        return this.metadata;
    }
    /**
     * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
     * 
    */
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * An array of network access configurations for this interface.
     * 
    */
    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Note that for MachineImage, this is not supported yet.
     * 
    */
    public NetworkPerformanceConfigResponse getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }
    /**
     * The private IPv6 google access type for VMs. If not specified, use INHERIT_FROM_SUBNETWORK as default. Note that for MachineImage, this is not supported yet.
     * 
    */
    public String getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * Specifies the reservations that instances can consume from. Note that for MachineImage, this is not supported yet.
     * 
    */
    public ReservationAffinityResponse getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
     * 
    */
    public Map<String,String> getResourceManagerTags() {
        return this.resourceManagerTags;
    }
    /**
     * Resource policies (names, not URLs) applied to instances created from these properties. Note that for MachineImage, this is not supported yet.
     * 
    */
    public List<String> getResourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * Specifies the scheduling options for the instances that are created from these properties.
     * 
    */
    public SchedulingResponse getScheduling() {
        return this.scheduling;
    }
    /**
     * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
     * 
    */
    public List<ServiceAccountResponse> getServiceAccounts() {
        return this.serviceAccounts;
    }
    /**
     * Note that for MachineImage, this is not supported yet.
     * 
    */
    public ShieldedInstanceConfigResponse getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
    */
    public TagsResponse getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedMachineFeaturesResponse advancedMachineFeatures;
        private Boolean canIpForward;
        private ConfidentialInstanceConfigResponse confidentialInstanceConfig;
        private String description;
        private List<AttachedDiskResponse> disks;
        private List<AcceleratorConfigResponse> guestAccelerators;
        private Map<String,String> labels;
        private String machineType;
        private MetadataResponse metadata;
        private String minCpuPlatform;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private NetworkPerformanceConfigResponse networkPerformanceConfig;
        private String privateIpv6GoogleAccess;
        private ReservationAffinityResponse reservationAffinity;
        private Map<String,String> resourceManagerTags;
        private List<String> resourcePolicies;
        private SchedulingResponse scheduling;
        private List<ServiceAccountResponse> serviceAccounts;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private TagsResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourceManagerTags = defaults.resourceManagerTags;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.tags = defaults.tags;
        }

        public Builder advancedMachineFeatures(AdvancedMachineFeaturesResponse advancedMachineFeatures) {
            this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
            return this;
        }

        public Builder canIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }

        public Builder confidentialInstanceConfig(ConfidentialInstanceConfigResponse confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Objects.requireNonNull(confidentialInstanceConfig);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder disks(List<AttachedDiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder guestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder metadata(MetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder networkPerformanceConfig(NetworkPerformanceConfigResponse networkPerformanceConfig) {
            this.networkPerformanceConfig = Objects.requireNonNull(networkPerformanceConfig);
            return this;
        }

        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }

        public Builder reservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }

        public Builder resourceManagerTags(Map<String,String> resourceManagerTags) {
            this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags);
            return this;
        }

        public Builder resourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }

        public Builder scheduling(SchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }

        public Builder serviceAccounts(List<ServiceAccountResponse> serviceAccounts) {
            this.serviceAccounts = Objects.requireNonNull(serviceAccounts);
            return this;
        }

        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }

        public Builder tags(TagsResponse tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public InstancePropertiesResponse build() {
            return new InstancePropertiesResponse(advancedMachineFeatures, canIpForward, confidentialInstanceConfig, description, disks, guestAccelerators, labels, machineType, metadata, minCpuPlatform, networkInterfaces, networkPerformanceConfig, privateIpv6GoogleAccess, reservationAffinity, resourceManagerTags, resourcePolicies, scheduling, serviceAccounts, shieldedInstanceConfig, tags);
        }
    }
}
