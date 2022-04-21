// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataflow_v1b3.enums.RuntimeEnvironmentIpConfiguration;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The environment values to set at runtime.
 * 
 */
public final class RuntimeEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeEnvironmentArgs Empty = new RuntimeEnvironmentArgs();

    /**
     * Additional experiment flags for the job, specified with the `--experiments` option.
     * 
     */
    @Import(name="additionalExperiments")
    private @Nullable Output<List<String>> additionalExperiments;

    public Optional<Output<List<String>>> additionalExperiments() {
        return Optional.ofNullable(this.additionalExperiments);
    }

    /**
     * Additional user labels to be specified for the job. Keys and values should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="additionalUserLabels")
    private @Nullable Output<Map<String,String>> additionalUserLabels;

    public Optional<Output<Map<String,String>>> additionalUserLabels() {
        return Optional.ofNullable(this.additionalUserLabels);
    }

    /**
     * Whether to bypass the safety checks for the job&#39;s temporary directory. Use with caution.
     * 
     */
    @Import(name="bypassTempDirValidation")
    private @Nullable Output<Boolean> bypassTempDirValidation;

    public Optional<Output<Boolean>> bypassTempDirValidation() {
        return Optional.ofNullable(this.bypassTempDirValidation);
    }

    /**
     * Whether to enable Streaming Engine for the job.
     * 
     */
    @Import(name="enableStreamingEngine")
    private @Nullable Output<Boolean> enableStreamingEngine;

    public Optional<Output<Boolean>> enableStreamingEngine() {
        return Optional.ofNullable(this.enableStreamingEngine);
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @Import(name="ipConfiguration")
    private @Nullable Output<RuntimeEnvironmentIpConfiguration> ipConfiguration;

    public Optional<Output<RuntimeEnvironmentIpConfiguration>> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    /**
     * Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * The maximum number of Google Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    @Import(name="maxWorkers")
    private @Nullable Output<Integer> maxWorkers;

    public Optional<Output<Integer>> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The initial number of Google Compute Engine instnaces for the job.
     * 
     */
    @Import(name="numWorkers")
    private @Nullable Output<Integer> numWorkers;

    public Optional<Output<Integer>> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }

    /**
     * The email address of the service account to run the job as.
     * 
     */
    @Import(name="serviceAccountEmail")
    private @Nullable Output<String> serviceAccountEmail;

    public Optional<Output<String>> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form &#34;https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK&#34; or &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    @Import(name="tempLocation")
    private @Nullable Output<String> tempLocation;

    public Optional<Output<String>> tempLocation() {
        return Optional.ofNullable(this.tempLocation);
    }

    /**
     * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane&#39;s region.
     * 
     */
    @Import(name="workerRegion")
    private @Nullable Output<String> workerRegion;

    public Optional<Output<String>> workerRegion() {
        return Optional.ofNullable(this.workerRegion);
    }

    /**
     * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane&#39;s region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
     * 
     */
    @Import(name="workerZone")
    private @Nullable Output<String> workerZone;

    public Optional<Output<String>> workerZone() {
        return Optional.ofNullable(this.workerZone);
    }

    /**
     * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private RuntimeEnvironmentArgs() {}

    private RuntimeEnvironmentArgs(RuntimeEnvironmentArgs $) {
        this.additionalExperiments = $.additionalExperiments;
        this.additionalUserLabels = $.additionalUserLabels;
        this.bypassTempDirValidation = $.bypassTempDirValidation;
        this.enableStreamingEngine = $.enableStreamingEngine;
        this.ipConfiguration = $.ipConfiguration;
        this.kmsKeyName = $.kmsKeyName;
        this.machineType = $.machineType;
        this.maxWorkers = $.maxWorkers;
        this.network = $.network;
        this.numWorkers = $.numWorkers;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.subnetwork = $.subnetwork;
        this.tempLocation = $.tempLocation;
        this.workerRegion = $.workerRegion;
        this.workerZone = $.workerZone;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeEnvironmentArgs $;

        public Builder() {
            $ = new RuntimeEnvironmentArgs();
        }

        public Builder(RuntimeEnvironmentArgs defaults) {
            $ = new RuntimeEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalExperiments(@Nullable Output<List<String>> additionalExperiments) {
            $.additionalExperiments = additionalExperiments;
            return this;
        }

        public Builder additionalExperiments(List<String> additionalExperiments) {
            return additionalExperiments(Output.of(additionalExperiments));
        }

        public Builder additionalExperiments(String... additionalExperiments) {
            return additionalExperiments(List.of(additionalExperiments));
        }

        public Builder additionalUserLabels(@Nullable Output<Map<String,String>> additionalUserLabels) {
            $.additionalUserLabels = additionalUserLabels;
            return this;
        }

        public Builder additionalUserLabels(Map<String,String> additionalUserLabels) {
            return additionalUserLabels(Output.of(additionalUserLabels));
        }

        public Builder bypassTempDirValidation(@Nullable Output<Boolean> bypassTempDirValidation) {
            $.bypassTempDirValidation = bypassTempDirValidation;
            return this;
        }

        public Builder bypassTempDirValidation(Boolean bypassTempDirValidation) {
            return bypassTempDirValidation(Output.of(bypassTempDirValidation));
        }

        public Builder enableStreamingEngine(@Nullable Output<Boolean> enableStreamingEngine) {
            $.enableStreamingEngine = enableStreamingEngine;
            return this;
        }

        public Builder enableStreamingEngine(Boolean enableStreamingEngine) {
            return enableStreamingEngine(Output.of(enableStreamingEngine));
        }

        public Builder ipConfiguration(@Nullable Output<RuntimeEnvironmentIpConfiguration> ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder ipConfiguration(RuntimeEnvironmentIpConfiguration ipConfiguration) {
            return ipConfiguration(Output.of(ipConfiguration));
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            $.maxWorkers = maxWorkers;
            return this;
        }

        public Builder maxWorkers(Integer maxWorkers) {
            return maxWorkers(Output.of(maxWorkers));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            $.numWorkers = numWorkers;
            return this;
        }

        public Builder numWorkers(Integer numWorkers) {
            return numWorkers(Output.of(numWorkers));
        }

        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public Builder tempLocation(@Nullable Output<String> tempLocation) {
            $.tempLocation = tempLocation;
            return this;
        }

        public Builder tempLocation(String tempLocation) {
            return tempLocation(Output.of(tempLocation));
        }

        public Builder workerRegion(@Nullable Output<String> workerRegion) {
            $.workerRegion = workerRegion;
            return this;
        }

        public Builder workerRegion(String workerRegion) {
            return workerRegion(Output.of(workerRegion));
        }

        public Builder workerZone(@Nullable Output<String> workerZone) {
            $.workerZone = workerZone;
            return this;
        }

        public Builder workerZone(String workerZone) {
            return workerZone(Output.of(workerZone));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public RuntimeEnvironmentArgs build() {
            return $;
        }
    }

}
