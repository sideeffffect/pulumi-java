// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.VirtualDiskResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualMachineTemplateResult {
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    private final String customResourceName;
    /**
     * Gets or sets the disks the template.
     * 
     */
    private final List<VirtualDiskResponse> disks;
    /**
     * Gets or sets the extended location.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Firmware type
     * 
     */
    private final String firmwareType;
    /**
     * Gets or sets the folder path of the template.
     * 
     */
    private final String folderPath;
    /**
     * Gets or sets the Id.
     * 
     */
    private final String id;
    /**
     * Gets or sets the inventory Item ID for the virtual machine template.
     * 
     */
    private final @Nullable String inventoryItemId;
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    private final @Nullable String kind;
    /**
     * Gets or sets the location.
     * 
     */
    private final String location;
    /**
     * Gets or sets memory size in MBs for the template.
     * 
     */
    private final Integer memorySizeMB;
    /**
     * Gets or sets the vCenter Managed Object name for the virtual machine template.
     * 
     */
    private final String moName;
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine
     * template.
     * 
     */
    private final @Nullable String moRefId;
    /**
     * Gets or sets the name.
     * 
     */
    private final String name;
    /**
     * Gets or sets the network interfaces of the template.
     * 
     */
    private final List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * Gets or sets the number of vCPUs for the template.
     * 
     */
    private final Integer numCPUs;
    /**
     * Gets or sets the number of cores per socket for the template.
     * Defaults to 1 if unspecified.
     * 
     */
    private final Integer numCoresPerSocket;
    /**
     * Gets or sets os name.
     * 
     */
    private final String osName;
    /**
     * Gets or sets the type of the os.
     * 
     */
    private final String osType;
    /**
     * Gets or sets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The resource status information.
     * 
     */
    private final List<ResourceStatusResponse> statuses;
    /**
     * The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Gets or sets the Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets or sets the current version of VMware Tools.
     * 
     */
    private final String toolsVersion;
    /**
     * Gets or sets the current version status of VMware Tools installed in the guest operating system.
     * 
     */
    private final String toolsVersionStatus;
    /**
     * Gets or sets the type of the resource.
     * 
     */
    private final String type;
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    private final String uuid;
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
     */
    private final @Nullable String vCenterId;

    @OutputCustomType.Constructor
    private GetVirtualMachineTemplateResult(
        @OutputCustomType.Parameter("customResourceName") String customResourceName,
        @OutputCustomType.Parameter("disks") List<VirtualDiskResponse> disks,
        @OutputCustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @OutputCustomType.Parameter("firmwareType") String firmwareType,
        @OutputCustomType.Parameter("folderPath") String folderPath,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("inventoryItemId") @Nullable String inventoryItemId,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("memorySizeMB") Integer memorySizeMB,
        @OutputCustomType.Parameter("moName") String moName,
        @OutputCustomType.Parameter("moRefId") @Nullable String moRefId,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("networkInterfaces") List<NetworkInterfaceResponse> networkInterfaces,
        @OutputCustomType.Parameter("numCPUs") Integer numCPUs,
        @OutputCustomType.Parameter("numCoresPerSocket") Integer numCoresPerSocket,
        @OutputCustomType.Parameter("osName") String osName,
        @OutputCustomType.Parameter("osType") String osType,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("statuses") List<ResourceStatusResponse> statuses,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("toolsVersion") String toolsVersion,
        @OutputCustomType.Parameter("toolsVersionStatus") String toolsVersionStatus,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("uuid") String uuid,
        @OutputCustomType.Parameter("vCenterId") @Nullable String vCenterId) {
        this.customResourceName = customResourceName;
        this.disks = disks;
        this.extendedLocation = extendedLocation;
        this.firmwareType = firmwareType;
        this.folderPath = folderPath;
        this.id = id;
        this.inventoryItemId = inventoryItemId;
        this.kind = kind;
        this.location = location;
        this.memorySizeMB = memorySizeMB;
        this.moName = moName;
        this.moRefId = moRefId;
        this.name = name;
        this.networkInterfaces = networkInterfaces;
        this.numCPUs = numCPUs;
        this.numCoresPerSocket = numCoresPerSocket;
        this.osName = osName;
        this.osType = osType;
        this.provisioningState = provisioningState;
        this.statuses = statuses;
        this.systemData = systemData;
        this.tags = tags;
        this.toolsVersion = toolsVersion;
        this.toolsVersionStatus = toolsVersionStatus;
        this.type = type;
        this.uuid = uuid;
        this.vCenterId = vCenterId;
    }

    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
    */
    public String getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the disks the template.
     * 
    */
    public List<VirtualDiskResponse> getDisks() {
        return this.disks;
    }
    /**
     * Gets or sets the extended location.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Firmware type
     * 
    */
    public String getFirmwareType() {
        return this.firmwareType;
    }
    /**
     * Gets or sets the folder path of the template.
     * 
    */
    public String getFolderPath() {
        return this.folderPath;
    }
    /**
     * Gets or sets the Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the inventory Item ID for the virtual machine template.
     * 
    */
    public Optional<String> getInventoryItemId() {
        return Optional.ofNullable(this.inventoryItemId);
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Gets or sets the location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets or sets memory size in MBs for the template.
     * 
    */
    public Integer getMemorySizeMB() {
        return this.memorySizeMB;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the virtual machine template.
     * 
    */
    public String getMoName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine
     * template.
     * 
    */
    public Optional<String> getMoRefId() {
        return Optional.ofNullable(this.moRefId);
    }
    /**
     * Gets or sets the name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the network interfaces of the template.
     * 
    */
    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Gets or sets the number of vCPUs for the template.
     * 
    */
    public Integer getNumCPUs() {
        return this.numCPUs;
    }
    /**
     * Gets or sets the number of cores per socket for the template.
     * Defaults to 1 if unspecified.
     * 
    */
    public Integer getNumCoresPerSocket() {
        return this.numCoresPerSocket;
    }
    /**
     * Gets or sets os name.
     * 
    */
    public String getOsName() {
        return this.osName;
    }
    /**
     * Gets or sets the type of the os.
     * 
    */
    public String getOsType() {
        return this.osType;
    }
    /**
     * Gets or sets the provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource status information.
     * 
    */
    public List<ResourceStatusResponse> getStatuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets or sets the current version of VMware Tools.
     * 
    */
    public String getToolsVersion() {
        return this.toolsVersion;
    }
    /**
     * Gets or sets the current version status of VMware Tools installed in the guest operating system.
     * 
    */
    public String getToolsVersionStatus() {
        return this.toolsVersionStatus;
    }
    /**
     * Gets or sets the type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
    */
    public String getUuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
    */
    public Optional<String> getVCenterId() {
        return Optional.ofNullable(this.vCenterId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customResourceName;
        private List<VirtualDiskResponse> disks;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String firmwareType;
        private String folderPath;
        private String id;
        private @Nullable String inventoryItemId;
        private @Nullable String kind;
        private String location;
        private Integer memorySizeMB;
        private String moName;
        private @Nullable String moRefId;
        private String name;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private Integer numCPUs;
        private Integer numCoresPerSocket;
        private String osName;
        private String osType;
        private String provisioningState;
        private List<ResourceStatusResponse> statuses;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String toolsVersion;
        private String toolsVersionStatus;
        private String type;
        private String uuid;
        private @Nullable String vCenterId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResourceName = defaults.customResourceName;
    	      this.disks = defaults.disks;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.firmwareType = defaults.firmwareType;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.inventoryItemId = defaults.inventoryItemId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.memorySizeMB = defaults.memorySizeMB;
    	      this.moName = defaults.moName;
    	      this.moRefId = defaults.moRefId;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.numCPUs = defaults.numCPUs;
    	      this.numCoresPerSocket = defaults.numCoresPerSocket;
    	      this.osName = defaults.osName;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.statuses = defaults.statuses;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.toolsVersion = defaults.toolsVersion;
    	      this.toolsVersionStatus = defaults.toolsVersionStatus;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.vCenterId = defaults.vCenterId;
        }

        public Builder customResourceName(String customResourceName) {
            this.customResourceName = Objects.requireNonNull(customResourceName);
            return this;
        }

        public Builder disks(List<VirtualDiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder firmwareType(String firmwareType) {
            this.firmwareType = Objects.requireNonNull(firmwareType);
            return this;
        }

        public Builder folderPath(String folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder inventoryItemId(@Nullable String inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder memorySizeMB(Integer memorySizeMB) {
            this.memorySizeMB = Objects.requireNonNull(memorySizeMB);
            return this;
        }

        public Builder moName(String moName) {
            this.moName = Objects.requireNonNull(moName);
            return this;
        }

        public Builder moRefId(@Nullable String moRefId) {
            this.moRefId = moRefId;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder numCPUs(Integer numCPUs) {
            this.numCPUs = Objects.requireNonNull(numCPUs);
            return this;
        }

        public Builder numCoresPerSocket(Integer numCoresPerSocket) {
            this.numCoresPerSocket = Objects.requireNonNull(numCoresPerSocket);
            return this;
        }

        public Builder osName(String osName) {
            this.osName = Objects.requireNonNull(osName);
            return this;
        }

        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder statuses(List<ResourceStatusResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder toolsVersion(String toolsVersion) {
            this.toolsVersion = Objects.requireNonNull(toolsVersion);
            return this;
        }

        public Builder toolsVersionStatus(String toolsVersionStatus) {
            this.toolsVersionStatus = Objects.requireNonNull(toolsVersionStatus);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }

        public Builder vCenterId(@Nullable String vCenterId) {
            this.vCenterId = vCenterId;
            return this;
        }
        public GetVirtualMachineTemplateResult build() {
            return new GetVirtualMachineTemplateResult(customResourceName, disks, extendedLocation, firmwareType, folderPath, id, inventoryItemId, kind, location, memorySizeMB, moName, moRefId, name, networkInterfaces, numCPUs, numCoresPerSocket, osName, osType, provisioningState, statuses, systemData, tags, toolsVersion, toolsVersionStatus, type, uuid, vCenterId);
        }
    }
}
