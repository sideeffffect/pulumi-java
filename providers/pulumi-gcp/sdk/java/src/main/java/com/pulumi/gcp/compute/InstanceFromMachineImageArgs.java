// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageAdvancedMachineFeaturesArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageConfidentialInstanceConfigArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageGuestAcceleratorArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkInterfaceArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageNetworkPerformanceConfigArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinityArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageServiceAccountArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageArgs Empty = new InstanceFromMachineImageArgs();

    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @Import(name="advancedMachineFeatures")
    private @Nullable Output<InstanceFromMachineImageAdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Optional<Output<InstanceFromMachineImageAdvancedMachineFeaturesArgs>> advancedMachineFeatures() {
        return Optional.ofNullable(this.advancedMachineFeatures);
    }

    /**
     * If true, allows Terraform to stop the instance to update its properties. If you try to update a property that requires
     * stopping the instance without setting this field, the update will fail.
     * 
     */
    @Import(name="allowStoppingForUpdate")
    private @Nullable Output<Boolean> allowStoppingForUpdate;

    public Optional<Output<Boolean>> allowStoppingForUpdate() {
        return Optional.ofNullable(this.allowStoppingForUpdate);
    }

    /**
     * Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    @Import(name="canIpForward")
    private @Nullable Output<Boolean> canIpForward;

    public Optional<Output<Boolean>> canIpForward() {
        return Optional.ofNullable(this.canIpForward);
    }

    /**
     * The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    @Import(name="confidentialInstanceConfig")
    private @Nullable Output<InstanceFromMachineImageConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Optional<Output<InstanceFromMachineImageConfidentialInstanceConfigArgs>> confidentialInstanceConfig() {
        return Optional.ofNullable(this.confidentialInstanceConfig);
    }

    /**
     * Whether deletion protection is enabled on this instance.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * A brief description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Desired status of the instance. Either &#34;RUNNING&#34; or &#34;TERMINATED&#34;.
     * 
     */
    @Import(name="desiredStatus")
    private @Nullable Output<String> desiredStatus;

    public Optional<Output<String>> desiredStatus() {
        return Optional.ofNullable(this.desiredStatus);
    }

    /**
     * Whether the instance has virtual displays enabled.
     * 
     */
    @Import(name="enableDisplay")
    private @Nullable Output<Boolean> enableDisplay;

    public Optional<Output<Boolean>> enableDisplay() {
        return Optional.ofNullable(this.enableDisplay);
    }

    /**
     * List of the type and count of accelerator cards attached to the instance.
     * 
     */
    @Import(name="guestAccelerators")
    private @Nullable Output<List<InstanceFromMachineImageGuestAcceleratorArgs>> guestAccelerators;

    public Optional<Output<List<InstanceFromMachineImageGuestAcceleratorArgs>>> guestAccelerators() {
        return Optional.ofNullable(this.guestAccelerators);
    }

    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression [a-z]([-a-z0-9]*[a-z0-9]), concatenated with periods. The
     * entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * A set of key/value label pairs assigned to the instance.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The machine type to create.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * Metadata key/value pairs made available within the instance.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Metadata startup scripts made available within the instance.
     * 
     */
    @Import(name="metadataStartupScript")
    private @Nullable Output<String> metadataStartupScript;

    public Optional<Output<String>> metadataStartupScript() {
        return Optional.ofNullable(this.metadataStartupScript);
    }

    /**
     * The minimum CPU platform specified for the VM instance.
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The networks attached to the instance.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<InstanceFromMachineImageNetworkInterfaceArgs>> networkInterfaces;

    public Optional<Output<List<InstanceFromMachineImageNetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    @Import(name="networkPerformanceConfig")
    private @Nullable Output<InstanceFromMachineImageNetworkPerformanceConfigArgs> networkPerformanceConfig;

    public Optional<Output<InstanceFromMachineImageNetworkPerformanceConfigArgs>> networkPerformanceConfig() {
        return Optional.ofNullable(this.networkPerformanceConfig);
    }

    /**
     * The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @Import(name="reservationAffinity")
    private @Nullable Output<InstanceFromMachineImageReservationAffinityArgs> reservationAffinity;

    public Optional<Output<InstanceFromMachineImageReservationAffinityArgs>> reservationAffinity() {
        return Optional.ofNullable(this.reservationAffinity);
    }

    /**
     * A list of short names or self_links of resource policies to attach to the instance. Currently a max of 1 resource policy
     * is supported.
     * 
     */
    @Import(name="resourcePolicies")
    private @Nullable Output<String> resourcePolicies;

    public Optional<Output<String>> resourcePolicies() {
        return Optional.ofNullable(this.resourcePolicies);
    }

    /**
     * The scheduling strategy being used by the instance.
     * 
     */
    @Import(name="scheduling")
    private @Nullable Output<InstanceFromMachineImageSchedulingArgs> scheduling;

    public Optional<Output<InstanceFromMachineImageSchedulingArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    /**
     * The service account to attach to the instance.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<InstanceFromMachineImageServiceAccountArgs> serviceAccount;

    public Optional<Output<InstanceFromMachineImageServiceAccountArgs>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * The shielded vm config being used by the instance.
     * 
     */
    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<InstanceFromMachineImageShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Optional<Output<InstanceFromMachineImageShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    /**
     * Name or self link of a machine
     * image to create the instance based on.
     * 
     */
    @Import(name="sourceMachineImage", required=true)
    private Output<String> sourceMachineImage;

    public Output<String> sourceMachineImage() {
        return this.sourceMachineImage;
    }

    /**
     * The list of tags attached to the instance.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceFromMachineImageArgs() {}

    private InstanceFromMachineImageArgs(InstanceFromMachineImageArgs $) {
        this.advancedMachineFeatures = $.advancedMachineFeatures;
        this.allowStoppingForUpdate = $.allowStoppingForUpdate;
        this.canIpForward = $.canIpForward;
        this.confidentialInstanceConfig = $.confidentialInstanceConfig;
        this.deletionProtection = $.deletionProtection;
        this.description = $.description;
        this.desiredStatus = $.desiredStatus;
        this.enableDisplay = $.enableDisplay;
        this.guestAccelerators = $.guestAccelerators;
        this.hostname = $.hostname;
        this.labels = $.labels;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.metadataStartupScript = $.metadataStartupScript;
        this.minCpuPlatform = $.minCpuPlatform;
        this.name = $.name;
        this.networkInterfaces = $.networkInterfaces;
        this.networkPerformanceConfig = $.networkPerformanceConfig;
        this.project = $.project;
        this.reservationAffinity = $.reservationAffinity;
        this.resourcePolicies = $.resourcePolicies;
        this.scheduling = $.scheduling;
        this.serviceAccount = $.serviceAccount;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.sourceMachineImage = $.sourceMachineImage;
        this.tags = $.tags;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageArgs();
        }

        public Builder(InstanceFromMachineImageArgs defaults) {
            $ = new InstanceFromMachineImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder advancedMachineFeatures(@Nullable Output<InstanceFromMachineImageAdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            $.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }

        public Builder advancedMachineFeatures(InstanceFromMachineImageAdvancedMachineFeaturesArgs advancedMachineFeatures) {
            return advancedMachineFeatures(Output.of(advancedMachineFeatures));
        }

        public Builder allowStoppingForUpdate(@Nullable Output<Boolean> allowStoppingForUpdate) {
            $.allowStoppingForUpdate = allowStoppingForUpdate;
            return this;
        }

        public Builder allowStoppingForUpdate(Boolean allowStoppingForUpdate) {
            return allowStoppingForUpdate(Output.of(allowStoppingForUpdate));
        }

        public Builder canIpForward(@Nullable Output<Boolean> canIpForward) {
            $.canIpForward = canIpForward;
            return this;
        }

        public Builder canIpForward(Boolean canIpForward) {
            return canIpForward(Output.of(canIpForward));
        }

        public Builder confidentialInstanceConfig(@Nullable Output<InstanceFromMachineImageConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            $.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }

        public Builder confidentialInstanceConfig(InstanceFromMachineImageConfidentialInstanceConfigArgs confidentialInstanceConfig) {
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

        public Builder desiredStatus(@Nullable Output<String> desiredStatus) {
            $.desiredStatus = desiredStatus;
            return this;
        }

        public Builder desiredStatus(String desiredStatus) {
            return desiredStatus(Output.of(desiredStatus));
        }

        public Builder enableDisplay(@Nullable Output<Boolean> enableDisplay) {
            $.enableDisplay = enableDisplay;
            return this;
        }

        public Builder enableDisplay(Boolean enableDisplay) {
            return enableDisplay(Output.of(enableDisplay));
        }

        public Builder guestAccelerators(@Nullable Output<List<InstanceFromMachineImageGuestAcceleratorArgs>> guestAccelerators) {
            $.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder guestAccelerators(List<InstanceFromMachineImageGuestAcceleratorArgs> guestAccelerators) {
            return guestAccelerators(Output.of(guestAccelerators));
        }

        public Builder guestAccelerators(InstanceFromMachineImageGuestAcceleratorArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
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

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder metadataStartupScript(@Nullable Output<String> metadataStartupScript) {
            $.metadataStartupScript = metadataStartupScript;
            return this;
        }

        public Builder metadataStartupScript(String metadataStartupScript) {
            return metadataStartupScript(Output.of(metadataStartupScript));
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

        public Builder networkInterfaces(@Nullable Output<List<InstanceFromMachineImageNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(List<InstanceFromMachineImageNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        public Builder networkInterfaces(InstanceFromMachineImageNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public Builder networkPerformanceConfig(@Nullable Output<InstanceFromMachineImageNetworkPerformanceConfigArgs> networkPerformanceConfig) {
            $.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }

        public Builder networkPerformanceConfig(InstanceFromMachineImageNetworkPerformanceConfigArgs networkPerformanceConfig) {
            return networkPerformanceConfig(Output.of(networkPerformanceConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder reservationAffinity(@Nullable Output<InstanceFromMachineImageReservationAffinityArgs> reservationAffinity) {
            $.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder reservationAffinity(InstanceFromMachineImageReservationAffinityArgs reservationAffinity) {
            return reservationAffinity(Output.of(reservationAffinity));
        }

        public Builder resourcePolicies(@Nullable Output<String> resourcePolicies) {
            $.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder resourcePolicies(String resourcePolicies) {
            return resourcePolicies(Output.of(resourcePolicies));
        }

        public Builder scheduling(@Nullable Output<InstanceFromMachineImageSchedulingArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        public Builder scheduling(InstanceFromMachineImageSchedulingArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        public Builder serviceAccount(@Nullable Output<InstanceFromMachineImageServiceAccountArgs> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(InstanceFromMachineImageServiceAccountArgs serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder shieldedInstanceConfig(@Nullable Output<InstanceFromMachineImageShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedInstanceConfig(InstanceFromMachineImageShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        public Builder sourceMachineImage(Output<String> sourceMachineImage) {
            $.sourceMachineImage = sourceMachineImage;
            return this;
        }

        public Builder sourceMachineImage(String sourceMachineImage) {
            return sourceMachineImage(Output.of(sourceMachineImage));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceFromMachineImageArgs build() {
            $.sourceMachineImage = Objects.requireNonNull($.sourceMachineImage, "expected parameter 'sourceMachineImage' to be non-null");
            return $;
        }
    }

}
