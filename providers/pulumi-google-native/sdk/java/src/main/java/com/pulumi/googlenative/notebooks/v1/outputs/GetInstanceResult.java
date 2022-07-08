// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.notebooks.v1.outputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.notebooks.v1.outputs.ContainerImageResponse;
import com.pulumi.googlenative.notebooks.v1.outputs.DiskResponse;
import com.pulumi.googlenative.notebooks.v1.outputs.ReservationAffinityResponse;
import com.pulumi.googlenative.notebooks.v1.outputs.ShieldedInstanceConfigResponse;
import com.pulumi.googlenative.notebooks.v1.outputs.UpgradeHistoryEntryResponse;
import com.pulumi.googlenative.notebooks.v1.outputs.VmImageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * @return The hardware accelerator used on this instance. If you use accelerators, make sure that your configuration has [enough vCPUs and memory to support the `machine_type` you have selected](/compute/docs/gpus/#gpus-list).
     * 
     */
    private final AcceleratorConfigResponse acceleratorConfig;
    /**
     * @return Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100.
     * 
     */
    private final String bootDiskSizeGb;
    /**
     * @return Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    private final String bootDiskType;
    /**
     * @return Optional. Flag to enable ip forwarding or not, default false/off. https://cloud.google.com/vpc/docs/using-routes#canipforward
     * 
     */
    private final Boolean canIpForward;
    /**
     * @return Use a container image to start the notebook instance.
     * 
     */
    private final ContainerImageResponse containerImage;
    /**
     * @return Instance creation time.
     * 
     */
    private final String createTime;
    /**
     * @return Email address of entity that sent original CreateInstance request.
     * 
     */
    private final String creator;
    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    private final String customGpuDriverPath;
    /**
     * @return Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data are. If not specified, this defaults to 100.
     * 
     */
    private final String dataDiskSizeGb;
    /**
     * @return Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    private final String dataDiskType;
    /**
     * @return Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
     * 
     */
    private final String diskEncryption;
    /**
     * @return Attached disks to notebook instance.
     * 
     */
    private final List<DiskResponse> disks;
    /**
     * @return Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this field is empty or set to false, the GPU driver won&#39;t be installed. Only applicable to instances with GPUs.
     * 
     */
    private final Boolean installGpuDriver;
    /**
     * @return Input only. The owner of this instance after creation. Format: `alias@example.com` Currently supports one owner only. If not specified, all of the service account users of your VM instance&#39;s service account can use the instance.
     * 
     */
    private final List<String> instanceOwners;
    /**
     * @return Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}` Learn more about [using your own encryption keys](/kms/docs/quickstart).
     * 
     */
    private final String kmsKey;
    /**
     * @return Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The [Compute Engine machine type](/compute/docs/machine-types) of this instance.
     * 
     */
    private final String machineType;
    /**
     * @return Custom metadata to apply to this instance.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * @return The name of this notebook instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * 
     */
    private final String name;
    /**
     * @return The name of the VPC that this instance is in. Format: `projects/{project_id}/global/networks/{network_id}`
     * 
     */
    private final String network;
    /**
     * @return Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    private final String nicType;
    /**
     * @return If true, the notebook instance will not register with the proxy.
     * 
     */
    private final Boolean noProxyAccess;
    /**
     * @return If true, no public IP will be assigned to this instance.
     * 
     */
    private final Boolean noPublicIp;
    /**
     * @return Input only. If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    private final Boolean noRemoveDataDisk;
    /**
     * @return Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
     * 
     */
    private final String postStartupScript;
    /**
     * @return The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    private final String proxyUri;
    /**
     * @return Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this notebook instance.
     * 
     */
    private final ReservationAffinityResponse reservationAffinity;
    /**
     * @return The service account on this instance, giving access to other Google Cloud services. You can use any service account within the same project, but you must have the service account user permission to use the instance. If not specified, the [Compute Engine default service account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Optional. The URIs of service account scopes to be included in Compute Engine instances. If not specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform - https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least: https://www.googleapis.com/auth/compute
     * 
     */
    private final List<String> serviceAccountScopes;
    /**
     * @return Optional. Shielded VM configuration. [Images using supported Shielded VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
     * 
     */
    private final ShieldedInstanceConfigResponse shieldedInstanceConfig;
    /**
     * @return The state of this instance.
     * 
     */
    private final String state;
    /**
     * @return The name of the subnet that this instance is in. Format: `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
     * 
     */
    private final String subnet;
    /**
     * @return Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    private final List<String> tags;
    /**
     * @return Instance update time.
     * 
     */
    private final String updateTime;
    /**
     * @return The upgrade history of this instance.
     * 
     */
    private final List<UpgradeHistoryEntryResponse> upgradeHistory;
    /**
     * @return Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    private final VmImageResponse vmImage;

    @CustomType.Constructor
    private GetInstanceResult(
        @CustomType.Parameter("acceleratorConfig") AcceleratorConfigResponse acceleratorConfig,
        @CustomType.Parameter("bootDiskSizeGb") String bootDiskSizeGb,
        @CustomType.Parameter("bootDiskType") String bootDiskType,
        @CustomType.Parameter("canIpForward") Boolean canIpForward,
        @CustomType.Parameter("containerImage") ContainerImageResponse containerImage,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("creator") String creator,
        @CustomType.Parameter("customGpuDriverPath") String customGpuDriverPath,
        @CustomType.Parameter("dataDiskSizeGb") String dataDiskSizeGb,
        @CustomType.Parameter("dataDiskType") String dataDiskType,
        @CustomType.Parameter("diskEncryption") String diskEncryption,
        @CustomType.Parameter("disks") List<DiskResponse> disks,
        @CustomType.Parameter("installGpuDriver") Boolean installGpuDriver,
        @CustomType.Parameter("instanceOwners") List<String> instanceOwners,
        @CustomType.Parameter("kmsKey") String kmsKey,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("nicType") String nicType,
        @CustomType.Parameter("noProxyAccess") Boolean noProxyAccess,
        @CustomType.Parameter("noPublicIp") Boolean noPublicIp,
        @CustomType.Parameter("noRemoveDataDisk") Boolean noRemoveDataDisk,
        @CustomType.Parameter("postStartupScript") String postStartupScript,
        @CustomType.Parameter("proxyUri") String proxyUri,
        @CustomType.Parameter("reservationAffinity") ReservationAffinityResponse reservationAffinity,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("serviceAccountScopes") List<String> serviceAccountScopes,
        @CustomType.Parameter("shieldedInstanceConfig") ShieldedInstanceConfigResponse shieldedInstanceConfig,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("subnet") String subnet,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("upgradeHistory") List<UpgradeHistoryEntryResponse> upgradeHistory,
        @CustomType.Parameter("vmImage") VmImageResponse vmImage) {
        this.acceleratorConfig = acceleratorConfig;
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.canIpForward = canIpForward;
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.creator = creator;
        this.customGpuDriverPath = customGpuDriverPath;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.diskEncryption = diskEncryption;
        this.disks = disks;
        this.installGpuDriver = installGpuDriver;
        this.instanceOwners = instanceOwners;
        this.kmsKey = kmsKey;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.name = name;
        this.network = network;
        this.nicType = nicType;
        this.noProxyAccess = noProxyAccess;
        this.noPublicIp = noPublicIp;
        this.noRemoveDataDisk = noRemoveDataDisk;
        this.postStartupScript = postStartupScript;
        this.proxyUri = proxyUri;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.state = state;
        this.subnet = subnet;
        this.tags = tags;
        this.updateTime = updateTime;
        this.upgradeHistory = upgradeHistory;
        this.vmImage = vmImage;
    }

    /**
     * @return The hardware accelerator used on this instance. If you use accelerators, make sure that your configuration has [enough vCPUs and memory to support the `machine_type` you have selected](/compute/docs/gpus/#gpus-list).
     * 
     */
    public AcceleratorConfigResponse acceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * @return Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100.
     * 
     */
    public String bootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }
    /**
     * @return Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    public String bootDiskType() {
        return this.bootDiskType;
    }
    /**
     * @return Optional. Flag to enable ip forwarding or not, default false/off. https://cloud.google.com/vpc/docs/using-routes#canipforward
     * 
     */
    public Boolean canIpForward() {
        return this.canIpForward;
    }
    /**
     * @return Use a container image to start the notebook instance.
     * 
     */
    public ContainerImageResponse containerImage() {
        return this.containerImage;
    }
    /**
     * @return Instance creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Email address of entity that sent original CreateInstance request.
     * 
     */
    public String creator() {
        return this.creator;
    }
    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    public String customGpuDriverPath() {
        return this.customGpuDriverPath;
    }
    /**
     * @return Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data are. If not specified, this defaults to 100.
     * 
     */
    public String dataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }
    /**
     * @return Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    public String dataDiskType() {
        return this.dataDiskType;
    }
    /**
     * @return Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
     * 
     */
    public String diskEncryption() {
        return this.diskEncryption;
    }
    /**
     * @return Attached disks to notebook instance.
     * 
     */
    public List<DiskResponse> disks() {
        return this.disks;
    }
    /**
     * @return Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this field is empty or set to false, the GPU driver won&#39;t be installed. Only applicable to instances with GPUs.
     * 
     */
    public Boolean installGpuDriver() {
        return this.installGpuDriver;
    }
    /**
     * @return Input only. The owner of this instance after creation. Format: `alias@example.com` Currently supports one owner only. If not specified, all of the service account users of your VM instance&#39;s service account can use the instance.
     * 
     */
    public List<String> instanceOwners() {
        return this.instanceOwners;
    }
    /**
     * @return Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}` Learn more about [using your own encryption keys](/kms/docs/quickstart).
     * 
     */
    public String kmsKey() {
        return this.kmsKey;
    }
    /**
     * @return Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The [Compute Engine machine type](/compute/docs/machine-types) of this instance.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return Custom metadata to apply to this instance.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return The name of this notebook instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the VPC that this instance is in. Format: `projects/{project_id}/global/networks/{network_id}`
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    public String nicType() {
        return this.nicType;
    }
    /**
     * @return If true, the notebook instance will not register with the proxy.
     * 
     */
    public Boolean noProxyAccess() {
        return this.noProxyAccess;
    }
    /**
     * @return If true, no public IP will be assigned to this instance.
     * 
     */
    public Boolean noPublicIp() {
        return this.noPublicIp;
    }
    /**
     * @return Input only. If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    public Boolean noRemoveDataDisk() {
        return this.noRemoveDataDisk;
    }
    /**
     * @return Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
     * 
     */
    public String postStartupScript() {
        return this.postStartupScript;
    }
    /**
     * @return The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    public String proxyUri() {
        return this.proxyUri;
    }
    /**
     * @return Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this notebook instance.
     * 
     */
    public ReservationAffinityResponse reservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * @return The service account on this instance, giving access to other Google Cloud services. You can use any service account within the same project, but you must have the service account user permission to use the instance. If not specified, the [Compute Engine default service account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Optional. The URIs of service account scopes to be included in Compute Engine instances. If not specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform - https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least: https://www.googleapis.com/auth/compute
     * 
     */
    public List<String> serviceAccountScopes() {
        return this.serviceAccountScopes;
    }
    /**
     * @return Optional. Shielded VM configuration. [Images using supported Shielded VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
     * 
     */
    public ShieldedInstanceConfigResponse shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * @return The state of this instance.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The name of the subnet that this instance is in. Format: `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
     * 
     */
    public String subnet() {
        return this.subnet;
    }
    /**
     * @return Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Instance update time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return The upgrade history of this instance.
     * 
     */
    public List<UpgradeHistoryEntryResponse> upgradeHistory() {
        return this.upgradeHistory;
    }
    /**
     * @return Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    public VmImageResponse vmImage() {
        return this.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcceleratorConfigResponse acceleratorConfig;
        private String bootDiskSizeGb;
        private String bootDiskType;
        private Boolean canIpForward;
        private ContainerImageResponse containerImage;
        private String createTime;
        private String creator;
        private String customGpuDriverPath;
        private String dataDiskSizeGb;
        private String dataDiskType;
        private String diskEncryption;
        private List<DiskResponse> disks;
        private Boolean installGpuDriver;
        private List<String> instanceOwners;
        private String kmsKey;
        private Map<String,String> labels;
        private String machineType;
        private Map<String,String> metadata;
        private String name;
        private String network;
        private String nicType;
        private Boolean noProxyAccess;
        private Boolean noPublicIp;
        private Boolean noRemoveDataDisk;
        private String postStartupScript;
        private String proxyUri;
        private ReservationAffinityResponse reservationAffinity;
        private String serviceAccount;
        private List<String> serviceAccountScopes;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private String state;
        private String subnet;
        private List<String> tags;
        private String updateTime;
        private List<UpgradeHistoryEntryResponse> upgradeHistory;
        private VmImageResponse vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.canIpForward = defaults.canIpForward;
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.diskEncryption = defaults.diskEncryption;
    	      this.disks = defaults.disks;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.instanceOwners = defaults.instanceOwners;
    	      this.kmsKey = defaults.kmsKey;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.noProxyAccess = defaults.noProxyAccess;
    	      this.noPublicIp = defaults.noPublicIp;
    	      this.noRemoveDataDisk = defaults.noRemoveDataDisk;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.proxyUri = defaults.proxyUri;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.state = defaults.state;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.updateTime = defaults.updateTime;
    	      this.upgradeHistory = defaults.upgradeHistory;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder acceleratorConfig(AcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }
        public Builder bootDiskSizeGb(String bootDiskSizeGb) {
            this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb);
            return this;
        }
        public Builder bootDiskType(String bootDiskType) {
            this.bootDiskType = Objects.requireNonNull(bootDiskType);
            return this;
        }
        public Builder canIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }
        public Builder containerImage(ContainerImageResponse containerImage) {
            this.containerImage = Objects.requireNonNull(containerImage);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder creator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }
        public Builder customGpuDriverPath(String customGpuDriverPath) {
            this.customGpuDriverPath = Objects.requireNonNull(customGpuDriverPath);
            return this;
        }
        public Builder dataDiskSizeGb(String dataDiskSizeGb) {
            this.dataDiskSizeGb = Objects.requireNonNull(dataDiskSizeGb);
            return this;
        }
        public Builder dataDiskType(String dataDiskType) {
            this.dataDiskType = Objects.requireNonNull(dataDiskType);
            return this;
        }
        public Builder diskEncryption(String diskEncryption) {
            this.diskEncryption = Objects.requireNonNull(diskEncryption);
            return this;
        }
        public Builder disks(List<DiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }
        public Builder disks(DiskResponse... disks) {
            return disks(List.of(disks));
        }
        public Builder installGpuDriver(Boolean installGpuDriver) {
            this.installGpuDriver = Objects.requireNonNull(installGpuDriver);
            return this;
        }
        public Builder instanceOwners(List<String> instanceOwners) {
            this.instanceOwners = Objects.requireNonNull(instanceOwners);
            return this;
        }
        public Builder instanceOwners(String... instanceOwners) {
            return instanceOwners(List.of(instanceOwners));
        }
        public Builder kmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
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
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
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
        public Builder nicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }
        public Builder noProxyAccess(Boolean noProxyAccess) {
            this.noProxyAccess = Objects.requireNonNull(noProxyAccess);
            return this;
        }
        public Builder noPublicIp(Boolean noPublicIp) {
            this.noPublicIp = Objects.requireNonNull(noPublicIp);
            return this;
        }
        public Builder noRemoveDataDisk(Boolean noRemoveDataDisk) {
            this.noRemoveDataDisk = Objects.requireNonNull(noRemoveDataDisk);
            return this;
        }
        public Builder postStartupScript(String postStartupScript) {
            this.postStartupScript = Objects.requireNonNull(postStartupScript);
            return this;
        }
        public Builder proxyUri(String proxyUri) {
            this.proxyUri = Objects.requireNonNull(proxyUri);
            return this;
        }
        public Builder reservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder serviceAccountScopes(List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Objects.requireNonNull(serviceAccountScopes);
            return this;
        }
        public Builder serviceAccountScopes(String... serviceAccountScopes) {
            return serviceAccountScopes(List.of(serviceAccountScopes));
        }
        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subnet(String subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder upgradeHistory(List<UpgradeHistoryEntryResponse> upgradeHistory) {
            this.upgradeHistory = Objects.requireNonNull(upgradeHistory);
            return this;
        }
        public Builder upgradeHistory(UpgradeHistoryEntryResponse... upgradeHistory) {
            return upgradeHistory(List.of(upgradeHistory));
        }
        public Builder vmImage(VmImageResponse vmImage) {
            this.vmImage = Objects.requireNonNull(vmImage);
            return this;
        }        public GetInstanceResult build() {
            return new GetInstanceResult(acceleratorConfig, bootDiskSizeGb, bootDiskType, canIpForward, containerImage, createTime, creator, customGpuDriverPath, dataDiskSizeGb, dataDiskType, diskEncryption, disks, installGpuDriver, instanceOwners, kmsKey, labels, machineType, metadata, name, network, nicType, noProxyAccess, noPublicIp, noRemoveDataDisk, postStartupScript, proxyUri, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, state, subnet, tags, updateTime, upgradeHistory, vmImage);
        }
    }
}
