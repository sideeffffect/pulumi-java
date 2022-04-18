// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.AdvancedMachineFeaturesResponse;
import com.pulumi.googlenative.compute_alpha.outputs.AttachedDiskResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ConfidentialInstanceConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.DisplayDeviceResponse;
import com.pulumi.googlenative.compute_alpha.outputs.MetadataResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkInterfaceResponse;
import com.pulumi.googlenative.compute_alpha.outputs.NetworkPerformanceConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ReservationAffinityResponse;
import com.pulumi.googlenative.compute_alpha.outputs.SchedulingResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ServiceAccountResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ShieldedInstanceConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ShieldedVmConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
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
     * Display Device properties to enable support for remote display products like: Teradici, VNC and TeamViewer Note that for MachineImage, this is not supported yet.
     * 
     */
    private final DisplayDeviceResponse displayDevice;
    /**
     * A list of guest accelerator cards' type and count to use for instances created from these properties.
     * 
     */
    private final List<AcceleratorConfigResponse> guestAccelerators;
    /**
     * KeyRevocationActionType of the instance.
     * 
     */
    private final String keyRevocationActionType;
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
     * PostKeyRevocationActionType of the instance.
     * 
     */
    private final String postKeyRevocationActionType;
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
     * [Input Only] Secure tags to apply to this instance. Maximum number of secure tags allowed is 50. Note that for MachineImage, this is not supported yet.
     * 
     */
    private final List<String> secureTags;
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
     * Specifies the Shielded VM options for the instances that are created from these properties.
     * 
     */
    private final ShieldedVmConfigResponse shieldedVmConfig;
    /**
     * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    private final TagsResponse tags;

    @CustomType.Constructor
    private InstancePropertiesResponse(
        @CustomType.Parameter("advancedMachineFeatures") AdvancedMachineFeaturesResponse advancedMachineFeatures,
        @CustomType.Parameter("canIpForward") Boolean canIpForward,
        @CustomType.Parameter("confidentialInstanceConfig") ConfidentialInstanceConfigResponse confidentialInstanceConfig,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("disks") List<AttachedDiskResponse> disks,
        @CustomType.Parameter("displayDevice") DisplayDeviceResponse displayDevice,
        @CustomType.Parameter("guestAccelerators") List<AcceleratorConfigResponse> guestAccelerators,
        @CustomType.Parameter("keyRevocationActionType") String keyRevocationActionType,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("metadata") MetadataResponse metadata,
        @CustomType.Parameter("minCpuPlatform") String minCpuPlatform,
        @CustomType.Parameter("networkInterfaces") List<NetworkInterfaceResponse> networkInterfaces,
        @CustomType.Parameter("networkPerformanceConfig") NetworkPerformanceConfigResponse networkPerformanceConfig,
        @CustomType.Parameter("postKeyRevocationActionType") String postKeyRevocationActionType,
        @CustomType.Parameter("privateIpv6GoogleAccess") String privateIpv6GoogleAccess,
        @CustomType.Parameter("reservationAffinity") ReservationAffinityResponse reservationAffinity,
        @CustomType.Parameter("resourceManagerTags") Map<String,String> resourceManagerTags,
        @CustomType.Parameter("resourcePolicies") List<String> resourcePolicies,
        @CustomType.Parameter("scheduling") SchedulingResponse scheduling,
        @CustomType.Parameter("secureTags") List<String> secureTags,
        @CustomType.Parameter("serviceAccounts") List<ServiceAccountResponse> serviceAccounts,
        @CustomType.Parameter("shieldedInstanceConfig") ShieldedInstanceConfigResponse shieldedInstanceConfig,
        @CustomType.Parameter("shieldedVmConfig") ShieldedVmConfigResponse shieldedVmConfig,
        @CustomType.Parameter("tags") TagsResponse tags) {
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.canIpForward = canIpForward;
        this.confidentialInstanceConfig = confidentialInstanceConfig;
        this.description = description;
        this.disks = disks;
        this.displayDevice = displayDevice;
        this.guestAccelerators = guestAccelerators;
        this.keyRevocationActionType = keyRevocationActionType;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.networkInterfaces = networkInterfaces;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.postKeyRevocationActionType = postKeyRevocationActionType;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.reservationAffinity = reservationAffinity;
        this.resourceManagerTags = resourceManagerTags;
        this.resourcePolicies = resourcePolicies;
        this.scheduling = scheduling;
        this.secureTags = secureTags;
        this.serviceAccounts = serviceAccounts;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.shieldedVmConfig = shieldedVmConfig;
        this.tags = tags;
    }

    /**
     * Controls for advanced machine-related behavior features. Note that for MachineImage, this is not supported yet.
     * 
    */
    public AdvancedMachineFeaturesResponse advancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
    */
    public Boolean canIpForward() {
        return this.canIpForward;
    }
    /**
     * Specifies the Confidential Instance options. Note that for MachineImage, this is not supported yet.
     * 
    */
    public ConfidentialInstanceConfigResponse confidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * An optional text description for the instances that are created from these properties.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * An array of disks that are associated with the instances that are created from these properties.
     * 
    */
    public List<AttachedDiskResponse> disks() {
        return this.disks;
    }
    /**
     * Display Device properties to enable support for remote display products like: Teradici, VNC and TeamViewer Note that for MachineImage, this is not supported yet.
     * 
    */
    public DisplayDeviceResponse displayDevice() {
        return this.displayDevice;
    }
    /**
     * A list of guest accelerator cards' type and count to use for instances created from these properties.
     * 
    */
    public List<AcceleratorConfigResponse> guestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * KeyRevocationActionType of the instance.
     * 
    */
    public String keyRevocationActionType() {
        return this.keyRevocationActionType;
    }
    /**
     * Labels to apply to instances that are created from these properties.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The machine type to use for instances that are created from these properties.
     * 
    */
    public String machineType() {
        return this.machineType;
    }
    /**
     * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
    */
    public MetadataResponse metadata() {
        return this.metadata;
    }
    /**
     * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
     * 
    */
    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * An array of network access configurations for this interface.
     * 
    */
    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Note that for MachineImage, this is not supported yet.
     * 
    */
    public NetworkPerformanceConfigResponse networkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }
    /**
     * PostKeyRevocationActionType of the instance.
     * 
    */
    public String postKeyRevocationActionType() {
        return this.postKeyRevocationActionType;
    }
    /**
     * The private IPv6 google access type for VMs. If not specified, use INHERIT_FROM_SUBNETWORK as default. Note that for MachineImage, this is not supported yet.
     * 
    */
    public String privateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * Specifies the reservations that instances can consume from. Note that for MachineImage, this is not supported yet.
     * 
    */
    public ReservationAffinityResponse reservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
     * 
    */
    public Map<String,String> resourceManagerTags() {
        return this.resourceManagerTags;
    }
    /**
     * Resource policies (names, not URLs) applied to instances created from these properties. Note that for MachineImage, this is not supported yet.
     * 
    */
    public List<String> resourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * Specifies the scheduling options for the instances that are created from these properties.
     * 
    */
    public SchedulingResponse scheduling() {
        return this.scheduling;
    }
    /**
     * [Input Only] Secure tags to apply to this instance. Maximum number of secure tags allowed is 50. Note that for MachineImage, this is not supported yet.
     * 
    */
    public List<String> secureTags() {
        return this.secureTags;
    }
    /**
     * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
     * 
    */
    public List<ServiceAccountResponse> serviceAccounts() {
        return this.serviceAccounts;
    }
    /**
     * Note that for MachineImage, this is not supported yet.
     * 
    */
    public ShieldedInstanceConfigResponse shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Specifies the Shielded VM options for the instances that are created from these properties.
     * 
    */
    public ShieldedVmConfigResponse shieldedVmConfig() {
        return this.shieldedVmConfig;
    }
    /**
     * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
    */
    public TagsResponse tags() {
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
        private DisplayDeviceResponse displayDevice;
        private List<AcceleratorConfigResponse> guestAccelerators;
        private String keyRevocationActionType;
        private Map<String,String> labels;
        private String machineType;
        private MetadataResponse metadata;
        private String minCpuPlatform;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private NetworkPerformanceConfigResponse networkPerformanceConfig;
        private String postKeyRevocationActionType;
        private String privateIpv6GoogleAccess;
        private ReservationAffinityResponse reservationAffinity;
        private Map<String,String> resourceManagerTags;
        private List<String> resourcePolicies;
        private SchedulingResponse scheduling;
        private List<String> secureTags;
        private List<ServiceAccountResponse> serviceAccounts;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private ShieldedVmConfigResponse shieldedVmConfig;
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
    	      this.displayDevice = defaults.displayDevice;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.keyRevocationActionType = defaults.keyRevocationActionType;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.postKeyRevocationActionType = defaults.postKeyRevocationActionType;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourceManagerTags = defaults.resourceManagerTags;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.scheduling = defaults.scheduling;
    	      this.secureTags = defaults.secureTags;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.shieldedVmConfig = defaults.shieldedVmConfig;
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
        public Builder disks(AttachedDiskResponse... disks) {
            return disks(List.of(disks));
        }
        public Builder displayDevice(DisplayDeviceResponse displayDevice) {
            this.displayDevice = Objects.requireNonNull(displayDevice);
            return this;
        }
        public Builder guestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(AcceleratorConfigResponse... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder keyRevocationActionType(String keyRevocationActionType) {
            this.keyRevocationActionType = Objects.requireNonNull(keyRevocationActionType);
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
        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder networkPerformanceConfig(NetworkPerformanceConfigResponse networkPerformanceConfig) {
            this.networkPerformanceConfig = Objects.requireNonNull(networkPerformanceConfig);
            return this;
        }
        public Builder postKeyRevocationActionType(String postKeyRevocationActionType) {
            this.postKeyRevocationActionType = Objects.requireNonNull(postKeyRevocationActionType);
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
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }
        public Builder scheduling(SchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }
        public Builder secureTags(List<String> secureTags) {
            this.secureTags = Objects.requireNonNull(secureTags);
            return this;
        }
        public Builder secureTags(String... secureTags) {
            return secureTags(List.of(secureTags));
        }
        public Builder serviceAccounts(List<ServiceAccountResponse> serviceAccounts) {
            this.serviceAccounts = Objects.requireNonNull(serviceAccounts);
            return this;
        }
        public Builder serviceAccounts(ServiceAccountResponse... serviceAccounts) {
            return serviceAccounts(List.of(serviceAccounts));
        }
        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }
        public Builder shieldedVmConfig(ShieldedVmConfigResponse shieldedVmConfig) {
            this.shieldedVmConfig = Objects.requireNonNull(shieldedVmConfig);
            return this;
        }
        public Builder tags(TagsResponse tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public InstancePropertiesResponse build() {
            return new InstancePropertiesResponse(advancedMachineFeatures, canIpForward, confidentialInstanceConfig, description, disks, displayDevice, guestAccelerators, keyRevocationActionType, labels, machineType, metadata, minCpuPlatform, networkInterfaces, networkPerformanceConfig, postKeyRevocationActionType, privateIpv6GoogleAccess, reservationAffinity, resourceManagerTags, resourcePolicies, scheduling, secureTags, serviceAccounts, shieldedInstanceConfig, shieldedVmConfig, tags);
        }
    }
}
