// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataflow.v1b3.enums.WorkerPoolDefaultPackageSet;
import com.pulumi.googlenative.dataflow.v1b3.enums.WorkerPoolIpConfiguration;
import com.pulumi.googlenative.dataflow.v1b3.enums.WorkerPoolTeardownPolicy;
import com.pulumi.googlenative.dataflow.v1b3.inputs.AutoscalingSettingsArgs;
import com.pulumi.googlenative.dataflow.v1b3.inputs.DiskArgs;
import com.pulumi.googlenative.dataflow.v1b3.inputs.PackageArgs;
import com.pulumi.googlenative.dataflow.v1b3.inputs.SdkHarnessContainerImageArgs;
import com.pulumi.googlenative.dataflow.v1b3.inputs.TaskRunnerSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes one particular pool of Cloud Dataflow workers to be instantiated by the Cloud Dataflow service in order to perform the computations required by a job. Note that a workflow job may use multiple pools, in order to match the various computational requirements of the various stages of the job.
 * 
 */
public final class WorkerPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * Settings for autoscaling of this WorkerPool.
     * 
     */
    @Import(name="autoscalingSettings")
    private @Nullable Output<AutoscalingSettingsArgs> autoscalingSettings;

    /**
     * @return Settings for autoscaling of this WorkerPool.
     * 
     */
    public Optional<Output<AutoscalingSettingsArgs>> autoscalingSettings() {
        return Optional.ofNullable(this.autoscalingSettings);
    }

    /**
     * Data disks that are used by a VM in this workflow.
     * 
     */
    @Import(name="dataDisks")
    private @Nullable Output<List<DiskArgs>> dataDisks;

    /**
     * @return Data disks that are used by a VM in this workflow.
     * 
     */
    public Optional<Output<List<DiskArgs>>> dataDisks() {
        return Optional.ofNullable(this.dataDisks);
    }

    /**
     * The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
     * 
     */
    @Import(name="defaultPackageSet")
    private @Nullable Output<WorkerPoolDefaultPackageSet> defaultPackageSet;

    /**
     * @return The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
     * 
     */
    public Optional<Output<WorkerPoolDefaultPackageSet>> defaultPackageSet() {
        return Optional.ofNullable(this.defaultPackageSet);
    }

    /**
     * Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Fully qualified source image for disks.
     * 
     */
    @Import(name="diskSourceImage")
    private @Nullable Output<String> diskSourceImage;

    /**
     * @return Fully qualified source image for disks.
     * 
     */
    public Optional<Output<String>> diskSourceImage() {
        return Optional.ofNullable(this.diskSourceImage);
    }

    /**
     * Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @Import(name="ipConfiguration")
    private @Nullable Output<WorkerPoolIpConfiguration> ipConfiguration;

    /**
     * @return Configuration for VM IPs.
     * 
     */
    public Optional<Output<WorkerPoolIpConfiguration>> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    /**
     * The kind of the worker pool; currently only `harness` and `shuffle` are supported.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind of the worker pool; currently only `harness` and `shuffle` are supported.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Machine type (e.g. &#34;n1-standard-1&#34;). If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return Machine type (e.g. &#34;n1-standard-1&#34;). If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * Metadata to set on the Google Compute Engine VMs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Metadata to set on the Google Compute Engine VMs.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
     * 
     */
    @Import(name="numThreadsPerWorker")
    private @Nullable Output<Integer> numThreadsPerWorker;

    /**
     * @return The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
     * 
     */
    public Optional<Output<Integer>> numThreadsPerWorker() {
        return Optional.ofNullable(this.numThreadsPerWorker);
    }

    /**
     * Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="numWorkers")
    private @Nullable Output<Integer> numWorkers;

    /**
     * @return Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Optional<Output<Integer>> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }

    /**
     * The action to take on host maintenance, as defined by the Google Compute Engine API.
     * 
     */
    @Import(name="onHostMaintenance")
    private @Nullable Output<String> onHostMaintenance;

    /**
     * @return The action to take on host maintenance, as defined by the Google Compute Engine API.
     * 
     */
    public Optional<Output<String>> onHostMaintenance() {
        return Optional.ofNullable(this.onHostMaintenance);
    }

    /**
     * Packages to be installed on workers.
     * 
     */
    @Import(name="packages")
    private @Nullable Output<List<PackageArgs>> packages;

    /**
     * @return Packages to be installed on workers.
     * 
     */
    public Optional<Output<List<PackageArgs>>> packages() {
        return Optional.ofNullable(this.packages);
    }

    /**
     * Extra arguments for this worker pool.
     * 
     */
    @Import(name="poolArgs")
    private @Nullable Output<Map<String,String>> poolArgs;

    /**
     * @return Extra arguments for this worker pool.
     * 
     */
    public Optional<Output<Map<String,String>>> poolArgs() {
        return Optional.ofNullable(this.poolArgs);
    }

    /**
     * Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
     * 
     */
    @Import(name="sdkHarnessContainerImages")
    private @Nullable Output<List<SdkHarnessContainerImageArgs>> sdkHarnessContainerImages;

    /**
     * @return Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
     * 
     */
    public Optional<Output<List<SdkHarnessContainerImageArgs>>> sdkHarnessContainerImages() {
        return Optional.ofNullable(this.sdkHarnessContainerImages);
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. Expected to be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return Subnetwork to which VMs will be assigned, if desired. Expected to be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
     * 
     */
    @Import(name="taskrunnerSettings")
    private @Nullable Output<TaskRunnerSettingsArgs> taskrunnerSettings;

    /**
     * @return Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
     * 
     */
    public Optional<Output<TaskRunnerSettingsArgs>> taskrunnerSettings() {
        return Optional.ofNullable(this.taskrunnerSettings);
    }

    /**
     * Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user&#39;s project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="teardownPolicy")
    private @Nullable Output<WorkerPoolTeardownPolicy> teardownPolicy;

    /**
     * @return Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user&#39;s project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Optional<Output<WorkerPoolTeardownPolicy>> teardownPolicy() {
        return Optional.ofNullable(this.teardownPolicy);
    }

    /**
     * Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead.
     * 
     * @deprecated
     * Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead.
     * 
     */
    @Deprecated /* Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead. */
    @Import(name="workerHarnessContainerImage", required=true)
    private Output<String> workerHarnessContainerImage;

    /**
     * @return Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead.
     * 
     * @deprecated
     * Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead.
     * 
     */
    @Deprecated /* Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead. */
    public Output<String> workerHarnessContainerImage() {
        return this.workerHarnessContainerImage;
    }

    /**
     * Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private WorkerPoolArgs() {}

    private WorkerPoolArgs(WorkerPoolArgs $) {
        this.autoscalingSettings = $.autoscalingSettings;
        this.dataDisks = $.dataDisks;
        this.defaultPackageSet = $.defaultPackageSet;
        this.diskSizeGb = $.diskSizeGb;
        this.diskSourceImage = $.diskSourceImage;
        this.diskType = $.diskType;
        this.ipConfiguration = $.ipConfiguration;
        this.kind = $.kind;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.network = $.network;
        this.numThreadsPerWorker = $.numThreadsPerWorker;
        this.numWorkers = $.numWorkers;
        this.onHostMaintenance = $.onHostMaintenance;
        this.packages = $.packages;
        this.poolArgs = $.poolArgs;
        this.sdkHarnessContainerImages = $.sdkHarnessContainerImages;
        this.subnetwork = $.subnetwork;
        this.taskrunnerSettings = $.taskrunnerSettings;
        this.teardownPolicy = $.teardownPolicy;
        this.workerHarnessContainerImage = $.workerHarnessContainerImage;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerPoolArgs $;

        public Builder() {
            $ = new WorkerPoolArgs();
        }

        public Builder(WorkerPoolArgs defaults) {
            $ = new WorkerPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingSettings Settings for autoscaling of this WorkerPool.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingSettings(@Nullable Output<AutoscalingSettingsArgs> autoscalingSettings) {
            $.autoscalingSettings = autoscalingSettings;
            return this;
        }

        /**
         * @param autoscalingSettings Settings for autoscaling of this WorkerPool.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingSettings(AutoscalingSettingsArgs autoscalingSettings) {
            return autoscalingSettings(Output.of(autoscalingSettings));
        }

        /**
         * @param dataDisks Data disks that are used by a VM in this workflow.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(@Nullable Output<List<DiskArgs>> dataDisks) {
            $.dataDisks = dataDisks;
            return this;
        }

        /**
         * @param dataDisks Data disks that are used by a VM in this workflow.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(List<DiskArgs> dataDisks) {
            return dataDisks(Output.of(dataDisks));
        }

        /**
         * @param dataDisks Data disks that are used by a VM in this workflow.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(DiskArgs... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }

        /**
         * @param defaultPackageSet The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
         * 
         * @return builder
         * 
         */
        public Builder defaultPackageSet(@Nullable Output<WorkerPoolDefaultPackageSet> defaultPackageSet) {
            $.defaultPackageSet = defaultPackageSet;
            return this;
        }

        /**
         * @param defaultPackageSet The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
         * 
         * @return builder
         * 
         */
        public Builder defaultPackageSet(WorkerPoolDefaultPackageSet defaultPackageSet) {
            return defaultPackageSet(Output.of(defaultPackageSet));
        }

        /**
         * @param diskSizeGb Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param diskSourceImage Fully qualified source image for disks.
         * 
         * @return builder
         * 
         */
        public Builder diskSourceImage(@Nullable Output<String> diskSourceImage) {
            $.diskSourceImage = diskSourceImage;
            return this;
        }

        /**
         * @param diskSourceImage Fully qualified source image for disks.
         * 
         * @return builder
         * 
         */
        public Builder diskSourceImage(String diskSourceImage) {
            return diskSourceImage(Output.of(diskSourceImage));
        }

        /**
         * @param diskType Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param ipConfiguration Configuration for VM IPs.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(@Nullable Output<WorkerPoolIpConfiguration> ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        /**
         * @param ipConfiguration Configuration for VM IPs.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(WorkerPoolIpConfiguration ipConfiguration) {
            return ipConfiguration(Output.of(ipConfiguration));
        }

        /**
         * @param kind The kind of the worker pool; currently only `harness` and `shuffle` are supported.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the worker pool; currently only `harness` and `shuffle` are supported.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param machineType Machine type (e.g. &#34;n1-standard-1&#34;). If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Machine type (e.g. &#34;n1-standard-1&#34;). If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param metadata Metadata to set on the Google Compute Engine VMs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Metadata to set on the Google Compute Engine VMs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param network Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param numThreadsPerWorker The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
         * 
         * @return builder
         * 
         */
        public Builder numThreadsPerWorker(@Nullable Output<Integer> numThreadsPerWorker) {
            $.numThreadsPerWorker = numThreadsPerWorker;
            return this;
        }

        /**
         * @param numThreadsPerWorker The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
         * 
         * @return builder
         * 
         */
        public Builder numThreadsPerWorker(Integer numThreadsPerWorker) {
            return numThreadsPerWorker(Output.of(numThreadsPerWorker));
        }

        /**
         * @param numWorkers Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            $.numWorkers = numWorkers;
            return this;
        }

        /**
         * @param numWorkers Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder numWorkers(Integer numWorkers) {
            return numWorkers(Output.of(numWorkers));
        }

        /**
         * @param onHostMaintenance The action to take on host maintenance, as defined by the Google Compute Engine API.
         * 
         * @return builder
         * 
         */
        public Builder onHostMaintenance(@Nullable Output<String> onHostMaintenance) {
            $.onHostMaintenance = onHostMaintenance;
            return this;
        }

        /**
         * @param onHostMaintenance The action to take on host maintenance, as defined by the Google Compute Engine API.
         * 
         * @return builder
         * 
         */
        public Builder onHostMaintenance(String onHostMaintenance) {
            return onHostMaintenance(Output.of(onHostMaintenance));
        }

        /**
         * @param packages Packages to be installed on workers.
         * 
         * @return builder
         * 
         */
        public Builder packages(@Nullable Output<List<PackageArgs>> packages) {
            $.packages = packages;
            return this;
        }

        /**
         * @param packages Packages to be installed on workers.
         * 
         * @return builder
         * 
         */
        public Builder packages(List<PackageArgs> packages) {
            return packages(Output.of(packages));
        }

        /**
         * @param packages Packages to be installed on workers.
         * 
         * @return builder
         * 
         */
        public Builder packages(PackageArgs... packages) {
            return packages(List.of(packages));
        }

        /**
         * @param poolArgs Extra arguments for this worker pool.
         * 
         * @return builder
         * 
         */
        public Builder poolArgs(@Nullable Output<Map<String,String>> poolArgs) {
            $.poolArgs = poolArgs;
            return this;
        }

        /**
         * @param poolArgs Extra arguments for this worker pool.
         * 
         * @return builder
         * 
         */
        public Builder poolArgs(Map<String,String> poolArgs) {
            return poolArgs(Output.of(poolArgs));
        }

        /**
         * @param sdkHarnessContainerImages Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
         * 
         * @return builder
         * 
         */
        public Builder sdkHarnessContainerImages(@Nullable Output<List<SdkHarnessContainerImageArgs>> sdkHarnessContainerImages) {
            $.sdkHarnessContainerImages = sdkHarnessContainerImages;
            return this;
        }

        /**
         * @param sdkHarnessContainerImages Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
         * 
         * @return builder
         * 
         */
        public Builder sdkHarnessContainerImages(List<SdkHarnessContainerImageArgs> sdkHarnessContainerImages) {
            return sdkHarnessContainerImages(Output.of(sdkHarnessContainerImages));
        }

        /**
         * @param sdkHarnessContainerImages Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
         * 
         * @return builder
         * 
         */
        public Builder sdkHarnessContainerImages(SdkHarnessContainerImageArgs... sdkHarnessContainerImages) {
            return sdkHarnessContainerImages(List.of(sdkHarnessContainerImages));
        }

        /**
         * @param subnetwork Subnetwork to which VMs will be assigned, if desired. Expected to be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork Subnetwork to which VMs will be assigned, if desired. Expected to be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param taskrunnerSettings Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
         * 
         * @return builder
         * 
         */
        public Builder taskrunnerSettings(@Nullable Output<TaskRunnerSettingsArgs> taskrunnerSettings) {
            $.taskrunnerSettings = taskrunnerSettings;
            return this;
        }

        /**
         * @param taskrunnerSettings Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
         * 
         * @return builder
         * 
         */
        public Builder taskrunnerSettings(TaskRunnerSettingsArgs taskrunnerSettings) {
            return taskrunnerSettings(Output.of(taskrunnerSettings));
        }

        /**
         * @param teardownPolicy Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user&#39;s project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder teardownPolicy(@Nullable Output<WorkerPoolTeardownPolicy> teardownPolicy) {
            $.teardownPolicy = teardownPolicy;
            return this;
        }

        /**
         * @param teardownPolicy Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user&#39;s project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder teardownPolicy(WorkerPoolTeardownPolicy teardownPolicy) {
            return teardownPolicy(Output.of(teardownPolicy));
        }

        /**
         * @param workerHarnessContainerImage Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead.
         * 
         */
        @Deprecated /* Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead. */
        public Builder workerHarnessContainerImage(Output<String> workerHarnessContainerImage) {
            $.workerHarnessContainerImage = workerHarnessContainerImage;
            return this;
        }

        /**
         * @param workerHarnessContainerImage Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead.
         * 
         */
        @Deprecated /* Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use sdk_harness_container_images instead. */
        public Builder workerHarnessContainerImage(String workerHarnessContainerImage) {
            return workerHarnessContainerImage(Output.of(workerHarnessContainerImage));
        }

        /**
         * @param zone Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public WorkerPoolArgs build() {
            $.workerHarnessContainerImage = Objects.requireNonNull($.workerHarnessContainerImage, "expected parameter 'workerHarnessContainerImage' to be non-null");
            return $;
        }
    }

}
