// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.DiskResponse;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PipelineResourcesResponse {
    /**
     * Optional. The number of accelerators of the specified type to attach. By specifying this parameter, you will download and install the following third-party software onto your managed Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit.
     * 
     */
    private final String acceleratorCount;
    /**
     * Optional. The Compute Engine defined accelerator type. By specifying this parameter, you will download and install the following third-party software onto your managed Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit. Please see https://cloud.google.com/compute/docs/gpus/ for a list of available accelerator types.
     * 
     */
    private final String acceleratorType;
    /**
     * The size of the boot disk. Defaults to 10 (GB).
     * 
     */
    private final Integer bootDiskSizeGb;
    /**
     * Disks to attach.
     * 
     */
    private final List<DiskResponse> disks;
    /**
     * The minimum number of cores to use. Defaults to 1.
     * 
     */
    private final Integer minimumCpuCores;
    /**
     * The minimum amount of RAM to use. Defaults to 3.75 (GB)
     * 
     */
    private final Double minimumRamGb;
    /**
     * Whether to assign an external IP to the instance. This is an experimental feature that may go away. Defaults to false. Corresponds to `--no_address` flag for [gcloud compute instances create] (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create). In order to use this, must be true for both create time and run time. Cannot be true at run time if false at create time. If you need to ssh into a private IP VM for debugging, you can ssh to a public VM and then ssh into the private VM's Internal IP. If noAddress is set, this pipeline run may only load docker images from Google Container Registry and not Docker Hub. Before using this, you must [configure access to Google services from internal IPs](https://cloud.google.com/compute/docs/configure-private-google-access#configuring_access_to_google_services_from_internal_ips).
     * 
     */
    private final Boolean noAddress;
    /**
     * Whether to use preemptible VMs. Defaults to `false`. In order to use this, must be true for both create time and run time. Cannot be true at run time if false at create time.
     * 
     */
    private final Boolean preemptible;
    /**
     * List of Google Compute Engine availability zones to which resource creation will restricted. If empty, any zone may be chosen.
     * 
     */
    private final List<String> zones;

    @OutputCustomType.Constructor
    private PipelineResourcesResponse(
        @OutputCustomType.Parameter("acceleratorCount") String acceleratorCount,
        @OutputCustomType.Parameter("acceleratorType") String acceleratorType,
        @OutputCustomType.Parameter("bootDiskSizeGb") Integer bootDiskSizeGb,
        @OutputCustomType.Parameter("disks") List<DiskResponse> disks,
        @OutputCustomType.Parameter("minimumCpuCores") Integer minimumCpuCores,
        @OutputCustomType.Parameter("minimumRamGb") Double minimumRamGb,
        @OutputCustomType.Parameter("noAddress") Boolean noAddress,
        @OutputCustomType.Parameter("preemptible") Boolean preemptible,
        @OutputCustomType.Parameter("zones") List<String> zones) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.disks = disks;
        this.minimumCpuCores = minimumCpuCores;
        this.minimumRamGb = minimumRamGb;
        this.noAddress = noAddress;
        this.preemptible = preemptible;
        this.zones = zones;
    }

    /**
     * Optional. The number of accelerators of the specified type to attach. By specifying this parameter, you will download and install the following third-party software onto your managed Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit.
     * 
    */
    public String getAcceleratorCount() {
        return this.acceleratorCount;
    }
    /**
     * Optional. The Compute Engine defined accelerator type. By specifying this parameter, you will download and install the following third-party software onto your managed Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit. Please see https://cloud.google.com/compute/docs/gpus/ for a list of available accelerator types.
     * 
    */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }
    /**
     * The size of the boot disk. Defaults to 10 (GB).
     * 
    */
    public Integer getBootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }
    /**
     * Disks to attach.
     * 
    */
    public List<DiskResponse> getDisks() {
        return this.disks;
    }
    /**
     * The minimum number of cores to use. Defaults to 1.
     * 
    */
    public Integer getMinimumCpuCores() {
        return this.minimumCpuCores;
    }
    /**
     * The minimum amount of RAM to use. Defaults to 3.75 (GB)
     * 
    */
    public Double getMinimumRamGb() {
        return this.minimumRamGb;
    }
    /**
     * Whether to assign an external IP to the instance. This is an experimental feature that may go away. Defaults to false. Corresponds to `--no_address` flag for [gcloud compute instances create] (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create). In order to use this, must be true for both create time and run time. Cannot be true at run time if false at create time. If you need to ssh into a private IP VM for debugging, you can ssh to a public VM and then ssh into the private VM's Internal IP. If noAddress is set, this pipeline run may only load docker images from Google Container Registry and not Docker Hub. Before using this, you must [configure access to Google services from internal IPs](https://cloud.google.com/compute/docs/configure-private-google-access#configuring_access_to_google_services_from_internal_ips).
     * 
    */
    public Boolean getNoAddress() {
        return this.noAddress;
    }
    /**
     * Whether to use preemptible VMs. Defaults to `false`. In order to use this, must be true for both create time and run time. Cannot be true at run time if false at create time.
     * 
    */
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    /**
     * List of Google Compute Engine availability zones to which resource creation will restricted. If empty, any zone may be chosen.
     * 
    */
    public List<String> getZones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorCount;
        private String acceleratorType;
        private Integer bootDiskSizeGb;
        private List<DiskResponse> disks;
        private Integer minimumCpuCores;
        private Double minimumRamGb;
        private Boolean noAddress;
        private Boolean preemptible;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.disks = defaults.disks;
    	      this.minimumCpuCores = defaults.minimumCpuCores;
    	      this.minimumRamGb = defaults.minimumRamGb;
    	      this.noAddress = defaults.noAddress;
    	      this.preemptible = defaults.preemptible;
    	      this.zones = defaults.zones;
        }

        public Builder acceleratorCount(String acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder bootDiskSizeGb(Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb);
            return this;
        }

        public Builder disks(List<DiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder minimumCpuCores(Integer minimumCpuCores) {
            this.minimumCpuCores = Objects.requireNonNull(minimumCpuCores);
            return this;
        }

        public Builder minimumRamGb(Double minimumRamGb) {
            this.minimumRamGb = Objects.requireNonNull(minimumRamGb);
            return this;
        }

        public Builder noAddress(Boolean noAddress) {
            this.noAddress = Objects.requireNonNull(noAddress);
            return this;
        }

        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder zones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public PipelineResourcesResponse build() {
            return new PipelineResourcesResponse(acceleratorCount, acceleratorType, bootDiskSizeGb, disks, minimumCpuCores, minimumRamGb, noAddress, preemptible, zones);
        }
    }
}
