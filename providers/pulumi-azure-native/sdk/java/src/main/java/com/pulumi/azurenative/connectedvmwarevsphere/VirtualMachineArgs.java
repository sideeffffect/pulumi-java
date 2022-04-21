// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere;

import com.pulumi.azurenative.connectedvmwarevsphere.enums.FirmwareType;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.HardwareProfileArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.IdentityArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.NetworkProfileArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.OsProfileArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.PlacementProfileArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.StorageProfileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Gets or sets the extended location.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * Firmware type
     * 
     */
    @Import(name="firmwareType")
    private @Nullable Output<Either<String,FirmwareType>> firmwareType;

    public Optional<Output<Either<String,FirmwareType>>> firmwareType() {
        return Optional.ofNullable(this.firmwareType);
    }

    /**
     * Hardware properties.
     * 
     */
    @Import(name="hardwareProfile")
    private @Nullable Output<HardwareProfileArgs> hardwareProfile;

    public Optional<Output<HardwareProfileArgs>> hardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }

    /**
     * The identity of the resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityArgs> identity;

    public Optional<Output<IdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Gets or sets the inventory Item ID for the virtual machine.
     * 
     */
    @Import(name="inventoryItemId")
    private @Nullable Output<String> inventoryItemId;

    public Optional<Output<String>> inventoryItemId() {
        return Optional.ofNullable(this.inventoryItemId);
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Gets or sets the location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
     */
    @Import(name="moRefId")
    private @Nullable Output<String> moRefId;

    public Optional<Output<String>> moRefId() {
        return Optional.ofNullable(this.moRefId);
    }

    /**
     * Network properties.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<NetworkProfileArgs> networkProfile;

    public Optional<Output<NetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * OS properties.
     * 
     */
    @Import(name="osProfile")
    private @Nullable Output<OsProfileArgs> osProfile;

    public Optional<Output<OsProfileArgs>> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }

    /**
     * Placement properties.
     * 
     */
    @Import(name="placementProfile")
    private @Nullable Output<PlacementProfileArgs> placementProfile;

    public Optional<Output<PlacementProfileArgs>> placementProfile() {
        return Optional.ofNullable(this.placementProfile);
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
     */
    @Import(name="resourcePoolId")
    private @Nullable Output<String> resourcePoolId;

    public Optional<Output<String>> resourcePoolId() {
        return Optional.ofNullable(this.resourcePoolId);
    }

    /**
     * Gets or sets the SMBIOS UUID of the vm.
     * 
     */
    @Import(name="smbiosUuid")
    private @Nullable Output<String> smbiosUuid;

    public Optional<Output<String>> smbiosUuid() {
        return Optional.ofNullable(this.smbiosUuid);
    }

    /**
     * Storage properties.
     * 
     */
    @Import(name="storageProfile")
    private @Nullable Output<StorageProfileArgs> storageProfile;

    public Optional<Output<StorageProfileArgs>> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }

    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
     */
    @Import(name="templateId")
    private @Nullable Output<String> templateId;

    public Optional<Output<String>> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    @Import(name="vCenterId")
    private @Nullable Output<String> vCenterId;

    public Optional<Output<String>> vCenterId() {
        return Optional.ofNullable(this.vCenterId);
    }

    /**
     * Name of the virtual machine resource.
     * 
     */
    @Import(name="virtualMachineName")
    private @Nullable Output<String> virtualMachineName;

    public Optional<Output<String>> virtualMachineName() {
        return Optional.ofNullable(this.virtualMachineName);
    }

    private VirtualMachineArgs() {}

    private VirtualMachineArgs(VirtualMachineArgs $) {
        this.extendedLocation = $.extendedLocation;
        this.firmwareType = $.firmwareType;
        this.hardwareProfile = $.hardwareProfile;
        this.identity = $.identity;
        this.inventoryItemId = $.inventoryItemId;
        this.kind = $.kind;
        this.location = $.location;
        this.moRefId = $.moRefId;
        this.networkProfile = $.networkProfile;
        this.osProfile = $.osProfile;
        this.placementProfile = $.placementProfile;
        this.resourceGroupName = $.resourceGroupName;
        this.resourcePoolId = $.resourcePoolId;
        this.smbiosUuid = $.smbiosUuid;
        this.storageProfile = $.storageProfile;
        this.tags = $.tags;
        this.templateId = $.templateId;
        this.vCenterId = $.vCenterId;
        this.virtualMachineName = $.virtualMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineArgs $;

        public Builder() {
            $ = new VirtualMachineArgs();
        }

        public Builder(VirtualMachineArgs defaults) {
            $ = new VirtualMachineArgs(Objects.requireNonNull(defaults));
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        public Builder firmwareType(@Nullable Output<Either<String,FirmwareType>> firmwareType) {
            $.firmwareType = firmwareType;
            return this;
        }

        public Builder firmwareType(Either<String,FirmwareType> firmwareType) {
            return firmwareType(Output.of(firmwareType));
        }

        public Builder hardwareProfile(@Nullable Output<HardwareProfileArgs> hardwareProfile) {
            $.hardwareProfile = hardwareProfile;
            return this;
        }

        public Builder hardwareProfile(HardwareProfileArgs hardwareProfile) {
            return hardwareProfile(Output.of(hardwareProfile));
        }

        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(IdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder inventoryItemId(@Nullable Output<String> inventoryItemId) {
            $.inventoryItemId = inventoryItemId;
            return this;
        }

        public Builder inventoryItemId(String inventoryItemId) {
            return inventoryItemId(Output.of(inventoryItemId));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder moRefId(@Nullable Output<String> moRefId) {
            $.moRefId = moRefId;
            return this;
        }

        public Builder moRefId(String moRefId) {
            return moRefId(Output.of(moRefId));
        }

        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(NetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        public Builder osProfile(@Nullable Output<OsProfileArgs> osProfile) {
            $.osProfile = osProfile;
            return this;
        }

        public Builder osProfile(OsProfileArgs osProfile) {
            return osProfile(Output.of(osProfile));
        }

        public Builder placementProfile(@Nullable Output<PlacementProfileArgs> placementProfile) {
            $.placementProfile = placementProfile;
            return this;
        }

        public Builder placementProfile(PlacementProfileArgs placementProfile) {
            return placementProfile(Output.of(placementProfile));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourcePoolId(@Nullable Output<String> resourcePoolId) {
            $.resourcePoolId = resourcePoolId;
            return this;
        }

        public Builder resourcePoolId(String resourcePoolId) {
            return resourcePoolId(Output.of(resourcePoolId));
        }

        public Builder smbiosUuid(@Nullable Output<String> smbiosUuid) {
            $.smbiosUuid = smbiosUuid;
            return this;
        }

        public Builder smbiosUuid(String smbiosUuid) {
            return smbiosUuid(Output.of(smbiosUuid));
        }

        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        public Builder storageProfile(StorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder templateId(@Nullable Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        public Builder vCenterId(@Nullable Output<String> vCenterId) {
            $.vCenterId = vCenterId;
            return this;
        }

        public Builder vCenterId(String vCenterId) {
            return vCenterId(Output.of(vCenterId));
        }

        public Builder virtualMachineName(@Nullable Output<String> virtualMachineName) {
            $.virtualMachineName = virtualMachineName;
            return this;
        }

        public Builder virtualMachineName(String virtualMachineName) {
            return virtualMachineName(Output.of(virtualMachineName));
        }

        public VirtualMachineArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
