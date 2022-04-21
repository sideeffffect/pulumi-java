// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.AdvancedMachineFeaturesResponse;
import com.pulumi.googlenative.compute_beta.inputs.AttachedDiskResponse;
import com.pulumi.googlenative.compute_beta.inputs.ConfidentialInstanceConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.DisplayDeviceResponse;
import com.pulumi.googlenative.compute_beta.inputs.MetadataResponse;
import com.pulumi.googlenative.compute_beta.inputs.NetworkInterfaceResponse;
import com.pulumi.googlenative.compute_beta.inputs.NetworkPerformanceConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.ReservationAffinityResponse;
import com.pulumi.googlenative.compute_beta.inputs.SchedulingResponse;
import com.pulumi.googlenative.compute_beta.inputs.ServiceAccountResponse;
import com.pulumi.googlenative.compute_beta.inputs.ShieldedInstanceConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.ShieldedVmConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class InstancePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstancePropertiesResponse Empty = new InstancePropertiesResponse();

    /**
     * Controls for advanced machine-related behavior features. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="advancedMachineFeatures", required=true)
    private AdvancedMachineFeaturesResponse advancedMachineFeatures;

    public AdvancedMachineFeaturesResponse advancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }

    /**
     * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
     */
    @Import(name="canIpForward", required=true)
    private Boolean canIpForward;

    public Boolean canIpForward() {
        return this.canIpForward;
    }

    /**
     * Specifies the Confidential Instance options. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="confidentialInstanceConfig", required=true)
    private ConfidentialInstanceConfigResponse confidentialInstanceConfig;

    public ConfidentialInstanceConfigResponse confidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }

    /**
     * An optional text description for the instances that are created from these properties.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * An array of disks that are associated with the instances that are created from these properties.
     * 
     */
    @Import(name="disks", required=true)
    private List<AttachedDiskResponse> disks;

    public List<AttachedDiskResponse> disks() {
        return this.disks;
    }

    /**
     * Display Device properties to enable support for remote display products like: Teradici, VNC and TeamViewer Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="displayDevice", required=true)
    private DisplayDeviceResponse displayDevice;

    public DisplayDeviceResponse displayDevice() {
        return this.displayDevice;
    }

    /**
     * A list of guest accelerator cards&#39; type and count to use for instances created from these properties.
     * 
     */
    @Import(name="guestAccelerators", required=true)
    private List<AcceleratorConfigResponse> guestAccelerators;

    public List<AcceleratorConfigResponse> guestAccelerators() {
        return this.guestAccelerators;
    }

    /**
     * Labels to apply to instances that are created from these properties.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The machine type to use for instances that are created from these properties.
     * 
     */
    @Import(name="machineType", required=true)
    private String machineType;

    public String machineType() {
        return this.machineType;
    }

    /**
     * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
     */
    @Import(name="metadata", required=true)
    private MetadataResponse metadata;

    public MetadataResponse metadata() {
        return this.metadata;
    }

    /**
     * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: &#34;Intel Haswell&#34; or minCpuPlatform: &#34;Intel Sandy Bridge&#34;. For more information, read Specifying a Minimum CPU Platform.
     * 
     */
    @Import(name="minCpuPlatform", required=true)
    private String minCpuPlatform;

    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * An array of network access configurations for this interface.
     * 
     */
    @Import(name="networkInterfaces", required=true)
    private List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="networkPerformanceConfig", required=true)
    private NetworkPerformanceConfigResponse networkPerformanceConfig;

    public NetworkPerformanceConfigResponse networkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }

    /**
     * PostKeyRevocationActionType of the instance.
     * 
     */
    @Import(name="postKeyRevocationActionType", required=true)
    private String postKeyRevocationActionType;

    public String postKeyRevocationActionType() {
        return this.postKeyRevocationActionType;
    }

    /**
     * The private IPv6 google access type for VMs. If not specified, use INHERIT_FROM_SUBNETWORK as default. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="privateIpv6GoogleAccess", required=true)
    private String privateIpv6GoogleAccess;

    public String privateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }

    /**
     * Specifies the reservations that instances can consume from. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="reservationAffinity", required=true)
    private ReservationAffinityResponse reservationAffinity;

    public ReservationAffinityResponse reservationAffinity() {
        return this.reservationAffinity;
    }

    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * 
     */
    @Import(name="resourceManagerTags", required=true)
    private Map<String,String> resourceManagerTags;

    public Map<String,String> resourceManagerTags() {
        return this.resourceManagerTags;
    }

    /**
     * Resource policies (names, not URLs) applied to instances created from these properties. Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="resourcePolicies", required=true)
    private List<String> resourcePolicies;

    public List<String> resourcePolicies() {
        return this.resourcePolicies;
    }

    /**
     * Specifies the scheduling options for the instances that are created from these properties.
     * 
     */
    @Import(name="scheduling", required=true)
    private SchedulingResponse scheduling;

    public SchedulingResponse scheduling() {
        return this.scheduling;
    }

    /**
     * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
     * 
     */
    @Import(name="serviceAccounts", required=true)
    private List<ServiceAccountResponse> serviceAccounts;

    public List<ServiceAccountResponse> serviceAccounts() {
        return this.serviceAccounts;
    }

    /**
     * Note that for MachineImage, this is not supported yet.
     * 
     */
    @Import(name="shieldedInstanceConfig", required=true)
    private ShieldedInstanceConfigResponse shieldedInstanceConfig;

    public ShieldedInstanceConfigResponse shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }

    /**
     * Specifies the Shielded VM options for the instances that are created from these properties.
     * 
     */
    @Import(name="shieldedVmConfig", required=true)
    private ShieldedVmConfigResponse shieldedVmConfig;

    public ShieldedVmConfigResponse shieldedVmConfig() {
        return this.shieldedVmConfig;
    }

    /**
     * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    @Import(name="tags", required=true)
    private TagsResponse tags;

    public TagsResponse tags() {
        return this.tags;
    }

    private InstancePropertiesResponse() {}

    private InstancePropertiesResponse(InstancePropertiesResponse $) {
        this.advancedMachineFeatures = $.advancedMachineFeatures;
        this.canIpForward = $.canIpForward;
        this.confidentialInstanceConfig = $.confidentialInstanceConfig;
        this.description = $.description;
        this.disks = $.disks;
        this.displayDevice = $.displayDevice;
        this.guestAccelerators = $.guestAccelerators;
        this.labels = $.labels;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.minCpuPlatform = $.minCpuPlatform;
        this.networkInterfaces = $.networkInterfaces;
        this.networkPerformanceConfig = $.networkPerformanceConfig;
        this.postKeyRevocationActionType = $.postKeyRevocationActionType;
        this.privateIpv6GoogleAccess = $.privateIpv6GoogleAccess;
        this.reservationAffinity = $.reservationAffinity;
        this.resourceManagerTags = $.resourceManagerTags;
        this.resourcePolicies = $.resourcePolicies;
        this.scheduling = $.scheduling;
        this.serviceAccounts = $.serviceAccounts;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.shieldedVmConfig = $.shieldedVmConfig;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePropertiesResponse $;

        public Builder() {
            $ = new InstancePropertiesResponse();
        }

        public Builder(InstancePropertiesResponse defaults) {
            $ = new InstancePropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder advancedMachineFeatures(AdvancedMachineFeaturesResponse advancedMachineFeatures) {
            $.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }

        public Builder canIpForward(Boolean canIpForward) {
            $.canIpForward = canIpForward;
            return this;
        }

        public Builder confidentialInstanceConfig(ConfidentialInstanceConfigResponse confidentialInstanceConfig) {
            $.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder disks(List<AttachedDiskResponse> disks) {
            $.disks = disks;
            return this;
        }

        public Builder disks(AttachedDiskResponse... disks) {
            return disks(List.of(disks));
        }

        public Builder displayDevice(DisplayDeviceResponse displayDevice) {
            $.displayDevice = displayDevice;
            return this;
        }

        public Builder guestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            $.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder guestAccelerators(AcceleratorConfigResponse... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }

        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        public Builder machineType(String machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder metadata(MetadataResponse metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public Builder networkPerformanceConfig(NetworkPerformanceConfigResponse networkPerformanceConfig) {
            $.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }

        public Builder postKeyRevocationActionType(String postKeyRevocationActionType) {
            $.postKeyRevocationActionType = postKeyRevocationActionType;
            return this;
        }

        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            $.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder reservationAffinity(ReservationAffinityResponse reservationAffinity) {
            $.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder resourceManagerTags(Map<String,String> resourceManagerTags) {
            $.resourceManagerTags = resourceManagerTags;
            return this;
        }

        public Builder resourcePolicies(List<String> resourcePolicies) {
            $.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }

        public Builder scheduling(SchedulingResponse scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        public Builder serviceAccounts(List<ServiceAccountResponse> serviceAccounts) {
            $.serviceAccounts = serviceAccounts;
            return this;
        }

        public Builder serviceAccounts(ServiceAccountResponse... serviceAccounts) {
            return serviceAccounts(List.of(serviceAccounts));
        }

        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedVmConfig(ShieldedVmConfigResponse shieldedVmConfig) {
            $.shieldedVmConfig = shieldedVmConfig;
            return this;
        }

        public Builder tags(TagsResponse tags) {
            $.tags = tags;
            return this;
        }

        public InstancePropertiesResponse build() {
            $.advancedMachineFeatures = Objects.requireNonNull($.advancedMachineFeatures, "expected parameter 'advancedMachineFeatures' to be non-null");
            $.canIpForward = Objects.requireNonNull($.canIpForward, "expected parameter 'canIpForward' to be non-null");
            $.confidentialInstanceConfig = Objects.requireNonNull($.confidentialInstanceConfig, "expected parameter 'confidentialInstanceConfig' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.disks = Objects.requireNonNull($.disks, "expected parameter 'disks' to be non-null");
            $.displayDevice = Objects.requireNonNull($.displayDevice, "expected parameter 'displayDevice' to be non-null");
            $.guestAccelerators = Objects.requireNonNull($.guestAccelerators, "expected parameter 'guestAccelerators' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.minCpuPlatform = Objects.requireNonNull($.minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
            $.networkInterfaces = Objects.requireNonNull($.networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
            $.networkPerformanceConfig = Objects.requireNonNull($.networkPerformanceConfig, "expected parameter 'networkPerformanceConfig' to be non-null");
            $.postKeyRevocationActionType = Objects.requireNonNull($.postKeyRevocationActionType, "expected parameter 'postKeyRevocationActionType' to be non-null");
            $.privateIpv6GoogleAccess = Objects.requireNonNull($.privateIpv6GoogleAccess, "expected parameter 'privateIpv6GoogleAccess' to be non-null");
            $.reservationAffinity = Objects.requireNonNull($.reservationAffinity, "expected parameter 'reservationAffinity' to be non-null");
            $.resourceManagerTags = Objects.requireNonNull($.resourceManagerTags, "expected parameter 'resourceManagerTags' to be non-null");
            $.resourcePolicies = Objects.requireNonNull($.resourcePolicies, "expected parameter 'resourcePolicies' to be non-null");
            $.scheduling = Objects.requireNonNull($.scheduling, "expected parameter 'scheduling' to be non-null");
            $.serviceAccounts = Objects.requireNonNull($.serviceAccounts, "expected parameter 'serviceAccounts' to be non-null");
            $.shieldedInstanceConfig = Objects.requireNonNull($.shieldedInstanceConfig, "expected parameter 'shieldedInstanceConfig' to be non-null");
            $.shieldedVmConfig = Objects.requireNonNull($.shieldedVmConfig, "expected parameter 'shieldedVmConfig' to be non-null");
            $.tags = Objects.requireNonNull($.tags, "expected parameter 'tags' to be non-null");
            return $;
        }
    }

}
