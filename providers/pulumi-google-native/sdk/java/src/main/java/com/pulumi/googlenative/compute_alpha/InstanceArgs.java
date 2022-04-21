// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.InstanceKeyRevocationActionType;
import com.pulumi.googlenative.compute_alpha.enums.InstancePostKeyRevocationActionType;
import com.pulumi.googlenative.compute_alpha.enums.InstancePrivateIpv6GoogleAccess;
import com.pulumi.googlenative.compute_alpha.inputs.AcceleratorConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.AdvancedMachineFeaturesArgs;
import com.pulumi.googlenative.compute_alpha.inputs.AttachedDiskArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ConfidentialInstanceConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.DisplayDeviceArgs;
import com.pulumi.googlenative.compute_alpha.inputs.InstanceParamsArgs;
import com.pulumi.googlenative.compute_alpha.inputs.MetadataArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NetworkInterfaceArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NetworkPerformanceConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ReservationAffinityArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SchedulingArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ServiceAccountArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ShieldedInstanceConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ShieldedInstanceIntegrityPolicyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ShieldedVmConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ShieldedVmIntegrityPolicyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.TagsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @Import(name="advancedMachineFeatures")
    private @Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Optional<Output<AdvancedMachineFeaturesArgs>> advancedMachineFeatures() {
        return Optional.ofNullable(this.advancedMachineFeatures);
    }

    /**
     * Allows this instance to send and receive packets with non-matching destination or source IPs. This is required if you plan to use this instance to forward routes. For more information, see Enabling IP Forwarding .
     * 
     */
    @Import(name="canIpForward")
    private @Nullable Output<Boolean> canIpForward;

    public Optional<Output<Boolean>> canIpForward() {
        return Optional.ofNullable(this.canIpForward);
    }

    @Import(name="confidentialInstanceConfig")
    private @Nullable Output<ConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Optional<Output<ConfidentialInstanceConfigArgs>> confidentialInstanceConfig() {
        return Optional.ofNullable(this.confidentialInstanceConfig);
    }

    /**
     * Whether the resource should be protected against deletion.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
     * 
     */
    @Import(name="disks")
    private @Nullable Output<List<AttachedDiskArgs>> disks;

    public Optional<Output<List<AttachedDiskArgs>>> disks() {
        return Optional.ofNullable(this.disks);
    }

    /**
     * Enables display device for the instance.
     * 
     */
    @Import(name="displayDevice")
    private @Nullable Output<DisplayDeviceArgs> displayDevice;

    public Optional<Output<DisplayDeviceArgs>> displayDevice() {
        return Optional.ofNullable(this.displayDevice);
    }

    /**
     * Specifies whether the disks restored from source snapshots or source machine image should erase Windows specific VSS signature.
     * 
     */
    @Import(name="eraseWindowsVssSignature")
    private @Nullable Output<Boolean> eraseWindowsVssSignature;

    public Optional<Output<Boolean>> eraseWindowsVssSignature() {
        return Optional.ofNullable(this.eraseWindowsVssSignature);
    }

    /**
     * A list of the type and count of accelerator cards attached to the instance.
     * 
     */
    @Import(name="guestAccelerators")
    private @Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators;

    public Optional<Output<List<AcceleratorConfigArgs>>> guestAccelerators() {
        return Optional.ofNullable(this.guestAccelerators);
    }

    /**
     * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Encrypts or decrypts data for an instance with a customer-supplied encryption key. If you are creating a new instance, this field encrypts the local SSD and in-memory contents of the instance using a key that you provide. If you are restarting an instance protected with a customer-supplied encryption key, you must provide the correct key in order to successfully restart the instance. If you do not provide an encryption key when creating the instance, then the local SSD and in-memory contents will be encrypted using an automatically generated key and you do not need to provide a key to start the instance later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt local SSDs and in-memory content in a managed instance group.
     * 
     */
    @Import(name="instanceEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> instanceEncryptionKey;

    public Optional<Output<CustomerEncryptionKeyArgs>> instanceEncryptionKey() {
        return Optional.ofNullable(this.instanceEncryptionKey);
    }

    /**
     * KeyRevocationActionType of the instance.
     * 
     */
    @Import(name="keyRevocationActionType")
    private @Nullable Output<InstanceKeyRevocationActionType> keyRevocationActionType;

    public Optional<Output<InstanceKeyRevocationActionType>> keyRevocationActionType() {
        return Optional.ofNullable(this.keyRevocationActionType);
    }

    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type: zones/us-central1-f/machineTypes/n1-standard-1 To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY For example: zones/us-central1-f/machineTypes/custom-4-5120 For a full list of restrictions, read the Specifications for custom machine types.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<MetadataArgs> metadata;

    public Optional<Output<MetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: &#34;Intel Haswell&#34; or minCpuPlatform: &#34;Intel Sandy Bridge&#34;.
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

    public Optional<Output<List<NetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    @Import(name="networkPerformanceConfig")
    private @Nullable Output<NetworkPerformanceConfigArgs> networkPerformanceConfig;

    public Optional<Output<NetworkPerformanceConfigArgs>> networkPerformanceConfig() {
        return Optional.ofNullable(this.networkPerformanceConfig);
    }

    /**
     * Input only. [Input Only] Additional params passed with the request, but not persisted as part of resource payload.
     * 
     */
    @Import(name="params")
    private @Nullable Output<InstanceParamsArgs> params;

    public Optional<Output<InstanceParamsArgs>> params() {
        return Optional.ofNullable(this.params);
    }

    /**
     * PostKeyRevocationActionType of the instance.
     * 
     */
    @Import(name="postKeyRevocationActionType")
    private @Nullable Output<InstancePostKeyRevocationActionType> postKeyRevocationActionType;

    public Optional<Output<InstancePostKeyRevocationActionType>> postKeyRevocationActionType() {
        return Optional.ofNullable(this.postKeyRevocationActionType);
    }

    /**
     * Total amount of preserved state for SUSPENDED instances. Read-only in the api.
     * 
     */
    @Import(name="preservedStateSizeGb")
    private @Nullable Output<String> preservedStateSizeGb;

    public Optional<Output<String>> preservedStateSizeGb() {
        return Optional.ofNullable(this.preservedStateSizeGb);
    }

    /**
     * The private IPv6 google access type for the VM. If not specified, use INHERIT_FROM_SUBNETWORK as default.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
    private @Nullable Output<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Optional<Output<InstancePrivateIpv6GoogleAccess>> privateIpv6GoogleAccess() {
        return Optional.ofNullable(this.privateIpv6GoogleAccess);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @Import(name="reservationAffinity")
    private @Nullable Output<ReservationAffinityArgs> reservationAffinity;

    public Optional<Output<ReservationAffinityArgs>> reservationAffinity() {
        return Optional.ofNullable(this.reservationAffinity);
    }

    /**
     * Resource policies applied to this instance.
     * 
     */
    @Import(name="resourcePolicies")
    private @Nullable Output<List<String>> resourcePolicies;

    public Optional<Output<List<String>>> resourcePolicies() {
        return Optional.ofNullable(this.resourcePolicies);
    }

    /**
     * Sets the scheduling options for this instance.
     * 
     */
    @Import(name="scheduling")
    private @Nullable Output<SchedulingArgs> scheduling;

    public Optional<Output<SchedulingArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    /**
     * [Input Only] Secure tags to apply to this instance. These can be later modified by the update method. Maximum number of secure tags allowed is 50.
     * 
     */
    @Import(name="secureTags")
    private @Nullable Output<List<String>> secureTags;

    public Optional<Output<List<String>>> secureTags() {
        return Optional.ofNullable(this.secureTags);
    }

    /**
     * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported. Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
     * 
     */
    @Import(name="serviceAccounts")
    private @Nullable Output<List<ServiceAccountArgs>> serviceAccounts;

    public Optional<Output<List<ServiceAccountArgs>>> serviceAccounts() {
        return Optional.ofNullable(this.serviceAccounts);
    }

    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Optional<Output<ShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    @Import(name="shieldedInstanceIntegrityPolicy")
    private @Nullable Output<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy;

    public Optional<Output<ShieldedInstanceIntegrityPolicyArgs>> shieldedInstanceIntegrityPolicy() {
        return Optional.ofNullable(this.shieldedInstanceIntegrityPolicy);
    }

    /**
     * Deprecating, please use shielded_instance_config.
     * 
     */
    @Import(name="shieldedVmConfig")
    private @Nullable Output<ShieldedVmConfigArgs> shieldedVmConfig;

    public Optional<Output<ShieldedVmConfigArgs>> shieldedVmConfig() {
        return Optional.ofNullable(this.shieldedVmConfig);
    }

    /**
     * Deprecating, please use shielded_instance_integrity_policy.
     * 
     */
    @Import(name="shieldedVmIntegrityPolicy")
    private @Nullable Output<ShieldedVmIntegrityPolicyArgs> shieldedVmIntegrityPolicy;

    public Optional<Output<ShieldedVmIntegrityPolicyArgs>> shieldedVmIntegrityPolicy() {
        return Optional.ofNullable(this.shieldedVmIntegrityPolicy);
    }

    @Import(name="sourceInstanceTemplate")
    private @Nullable Output<String> sourceInstanceTemplate;

    public Optional<Output<String>> sourceInstanceTemplate() {
        return Optional.ofNullable(this.sourceInstanceTemplate);
    }

    /**
     * Source machine image
     * 
     */
    @Import(name="sourceMachineImage")
    private @Nullable Output<String> sourceMachineImage;

    public Optional<Output<String>> sourceMachineImage() {
        return Optional.ofNullable(this.sourceMachineImage);
    }

    /**
     * Source machine image encryption key when creating an instance from a machine image.
     * 
     */
    @Import(name="sourceMachineImageEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey;

    public Optional<Output<CustomerEncryptionKeyArgs>> sourceMachineImageEncryptionKey() {
        return Optional.ofNullable(this.sourceMachineImageEncryptionKey);
    }

    /**
     * Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the &#39;tags.items&#39; field.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<TagsArgs> tags;

    public Optional<Output<TagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.advancedMachineFeatures = $.advancedMachineFeatures;
        this.canIpForward = $.canIpForward;
        this.confidentialInstanceConfig = $.confidentialInstanceConfig;
        this.deletionProtection = $.deletionProtection;
        this.description = $.description;
        this.disks = $.disks;
        this.displayDevice = $.displayDevice;
        this.eraseWindowsVssSignature = $.eraseWindowsVssSignature;
        this.guestAccelerators = $.guestAccelerators;
        this.hostname = $.hostname;
        this.instanceEncryptionKey = $.instanceEncryptionKey;
        this.keyRevocationActionType = $.keyRevocationActionType;
        this.labels = $.labels;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.minCpuPlatform = $.minCpuPlatform;
        this.name = $.name;
        this.networkInterfaces = $.networkInterfaces;
        this.networkPerformanceConfig = $.networkPerformanceConfig;
        this.params = $.params;
        this.postKeyRevocationActionType = $.postKeyRevocationActionType;
        this.preservedStateSizeGb = $.preservedStateSizeGb;
        this.privateIpv6GoogleAccess = $.privateIpv6GoogleAccess;
        this.project = $.project;
        this.requestId = $.requestId;
        this.reservationAffinity = $.reservationAffinity;
        this.resourcePolicies = $.resourcePolicies;
        this.scheduling = $.scheduling;
        this.secureTags = $.secureTags;
        this.serviceAccounts = $.serviceAccounts;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.shieldedInstanceIntegrityPolicy = $.shieldedInstanceIntegrityPolicy;
        this.shieldedVmConfig = $.shieldedVmConfig;
        this.shieldedVmIntegrityPolicy = $.shieldedVmIntegrityPolicy;
        this.sourceInstanceTemplate = $.sourceInstanceTemplate;
        this.sourceMachineImage = $.sourceMachineImage;
        this.sourceMachineImageEncryptionKey = $.sourceMachineImageEncryptionKey;
        this.tags = $.tags;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder advancedMachineFeatures(@Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            $.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }

        public Builder advancedMachineFeatures(AdvancedMachineFeaturesArgs advancedMachineFeatures) {
            return advancedMachineFeatures(Output.of(advancedMachineFeatures));
        }

        public Builder canIpForward(@Nullable Output<Boolean> canIpForward) {
            $.canIpForward = canIpForward;
            return this;
        }

        public Builder canIpForward(Boolean canIpForward) {
            return canIpForward(Output.of(canIpForward));
        }

        public Builder confidentialInstanceConfig(@Nullable Output<ConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            $.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }

        public Builder confidentialInstanceConfig(ConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            return confidentialInstanceConfig(Output.of(confidentialInstanceConfig));
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disks(@Nullable Output<List<AttachedDiskArgs>> disks) {
            $.disks = disks;
            return this;
        }

        public Builder disks(List<AttachedDiskArgs> disks) {
            return disks(Output.of(disks));
        }

        public Builder disks(AttachedDiskArgs... disks) {
            return disks(List.of(disks));
        }

        public Builder displayDevice(@Nullable Output<DisplayDeviceArgs> displayDevice) {
            $.displayDevice = displayDevice;
            return this;
        }

        public Builder displayDevice(DisplayDeviceArgs displayDevice) {
            return displayDevice(Output.of(displayDevice));
        }

        public Builder eraseWindowsVssSignature(@Nullable Output<Boolean> eraseWindowsVssSignature) {
            $.eraseWindowsVssSignature = eraseWindowsVssSignature;
            return this;
        }

        public Builder eraseWindowsVssSignature(Boolean eraseWindowsVssSignature) {
            return eraseWindowsVssSignature(Output.of(eraseWindowsVssSignature));
        }

        public Builder guestAccelerators(@Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators) {
            $.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder guestAccelerators(List<AcceleratorConfigArgs> guestAccelerators) {
            return guestAccelerators(Output.of(guestAccelerators));
        }

        public Builder guestAccelerators(AcceleratorConfigArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        public Builder instanceEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> instanceEncryptionKey) {
            $.instanceEncryptionKey = instanceEncryptionKey;
            return this;
        }

        public Builder instanceEncryptionKey(CustomerEncryptionKeyArgs instanceEncryptionKey) {
            return instanceEncryptionKey(Output.of(instanceEncryptionKey));
        }

        public Builder keyRevocationActionType(@Nullable Output<InstanceKeyRevocationActionType> keyRevocationActionType) {
            $.keyRevocationActionType = keyRevocationActionType;
            return this;
        }

        public Builder keyRevocationActionType(InstanceKeyRevocationActionType keyRevocationActionType) {
            return keyRevocationActionType(Output.of(keyRevocationActionType));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public Builder metadata(@Nullable Output<MetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(MetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(List<NetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        public Builder networkInterfaces(NetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public Builder networkPerformanceConfig(@Nullable Output<NetworkPerformanceConfigArgs> networkPerformanceConfig) {
            $.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }

        public Builder networkPerformanceConfig(NetworkPerformanceConfigArgs networkPerformanceConfig) {
            return networkPerformanceConfig(Output.of(networkPerformanceConfig));
        }

        public Builder params(@Nullable Output<InstanceParamsArgs> params) {
            $.params = params;
            return this;
        }

        public Builder params(InstanceParamsArgs params) {
            return params(Output.of(params));
        }

        public Builder postKeyRevocationActionType(@Nullable Output<InstancePostKeyRevocationActionType> postKeyRevocationActionType) {
            $.postKeyRevocationActionType = postKeyRevocationActionType;
            return this;
        }

        public Builder postKeyRevocationActionType(InstancePostKeyRevocationActionType postKeyRevocationActionType) {
            return postKeyRevocationActionType(Output.of(postKeyRevocationActionType));
        }

        public Builder preservedStateSizeGb(@Nullable Output<String> preservedStateSizeGb) {
            $.preservedStateSizeGb = preservedStateSizeGb;
            return this;
        }

        public Builder preservedStateSizeGb(String preservedStateSizeGb) {
            return preservedStateSizeGb(Output.of(preservedStateSizeGb));
        }

        public Builder privateIpv6GoogleAccess(@Nullable Output<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            $.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder privateIpv6GoogleAccess(InstancePrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            return privateIpv6GoogleAccess(Output.of(privateIpv6GoogleAccess));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder reservationAffinity(@Nullable Output<ReservationAffinityArgs> reservationAffinity) {
            $.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder reservationAffinity(ReservationAffinityArgs reservationAffinity) {
            return reservationAffinity(Output.of(reservationAffinity));
        }

        public Builder resourcePolicies(@Nullable Output<List<String>> resourcePolicies) {
            $.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder resourcePolicies(List<String> resourcePolicies) {
            return resourcePolicies(Output.of(resourcePolicies));
        }

        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }

        public Builder scheduling(@Nullable Output<SchedulingArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        public Builder scheduling(SchedulingArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        public Builder secureTags(@Nullable Output<List<String>> secureTags) {
            $.secureTags = secureTags;
            return this;
        }

        public Builder secureTags(List<String> secureTags) {
            return secureTags(Output.of(secureTags));
        }

        public Builder secureTags(String... secureTags) {
            return secureTags(List.of(secureTags));
        }

        public Builder serviceAccounts(@Nullable Output<List<ServiceAccountArgs>> serviceAccounts) {
            $.serviceAccounts = serviceAccounts;
            return this;
        }

        public Builder serviceAccounts(List<ServiceAccountArgs> serviceAccounts) {
            return serviceAccounts(Output.of(serviceAccounts));
        }

        public Builder serviceAccounts(ServiceAccountArgs... serviceAccounts) {
            return serviceAccounts(List.of(serviceAccounts));
        }

        public Builder shieldedInstanceConfig(@Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedInstanceConfig(ShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        public Builder shieldedInstanceIntegrityPolicy(@Nullable Output<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy) {
            $.shieldedInstanceIntegrityPolicy = shieldedInstanceIntegrityPolicy;
            return this;
        }

        public Builder shieldedInstanceIntegrityPolicy(ShieldedInstanceIntegrityPolicyArgs shieldedInstanceIntegrityPolicy) {
            return shieldedInstanceIntegrityPolicy(Output.of(shieldedInstanceIntegrityPolicy));
        }

        public Builder shieldedVmConfig(@Nullable Output<ShieldedVmConfigArgs> shieldedVmConfig) {
            $.shieldedVmConfig = shieldedVmConfig;
            return this;
        }

        public Builder shieldedVmConfig(ShieldedVmConfigArgs shieldedVmConfig) {
            return shieldedVmConfig(Output.of(shieldedVmConfig));
        }

        public Builder shieldedVmIntegrityPolicy(@Nullable Output<ShieldedVmIntegrityPolicyArgs> shieldedVmIntegrityPolicy) {
            $.shieldedVmIntegrityPolicy = shieldedVmIntegrityPolicy;
            return this;
        }

        public Builder shieldedVmIntegrityPolicy(ShieldedVmIntegrityPolicyArgs shieldedVmIntegrityPolicy) {
            return shieldedVmIntegrityPolicy(Output.of(shieldedVmIntegrityPolicy));
        }

        public Builder sourceInstanceTemplate(@Nullable Output<String> sourceInstanceTemplate) {
            $.sourceInstanceTemplate = sourceInstanceTemplate;
            return this;
        }

        public Builder sourceInstanceTemplate(String sourceInstanceTemplate) {
            return sourceInstanceTemplate(Output.of(sourceInstanceTemplate));
        }

        public Builder sourceMachineImage(@Nullable Output<String> sourceMachineImage) {
            $.sourceMachineImage = sourceMachineImage;
            return this;
        }

        public Builder sourceMachineImage(String sourceMachineImage) {
            return sourceMachineImage(Output.of(sourceMachineImage));
        }

        public Builder sourceMachineImageEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey) {
            $.sourceMachineImageEncryptionKey = sourceMachineImageEncryptionKey;
            return this;
        }

        public Builder sourceMachineImageEncryptionKey(CustomerEncryptionKeyArgs sourceMachineImageEncryptionKey) {
            return sourceMachineImageEncryptionKey(Output.of(sourceMachineImageEncryptionKey));
        }

        public Builder tags(@Nullable Output<TagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(TagsArgs tags) {
            return tags(Output.of(tags));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceArgs build() {
            return $;
        }
    }

}
