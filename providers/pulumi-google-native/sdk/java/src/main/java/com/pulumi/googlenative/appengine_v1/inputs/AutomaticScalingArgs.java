// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine_v1.inputs.CpuUtilizationArgs;
import com.pulumi.googlenative.appengine_v1.inputs.DiskUtilizationArgs;
import com.pulumi.googlenative.appengine_v1.inputs.NetworkUtilizationArgs;
import com.pulumi.googlenative.appengine_v1.inputs.RequestUtilizationArgs;
import com.pulumi.googlenative.appengine_v1.inputs.StandardSchedulerSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Automatic scaling is based on request rate, response latencies, and other application metrics.
 * 
 */
public final class AutomaticScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomaticScalingArgs Empty = new AutomaticScalingArgs();

    /**
     * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="coolDownPeriod")
    private @Nullable Output<String> coolDownPeriod;

    public Optional<Output<String>> coolDownPeriod() {
        return Optional.ofNullable(this.coolDownPeriod);
    }

    /**
     * Target scaling by CPU usage.
     * 
     */
    @Import(name="cpuUtilization")
    private @Nullable Output<CpuUtilizationArgs> cpuUtilization;

    public Optional<Output<CpuUtilizationArgs>> cpuUtilization() {
        return Optional.ofNullable(this.cpuUtilization);
    }

    /**
     * Target scaling by disk usage.
     * 
     */
    @Import(name="diskUtilization")
    private @Nullable Output<DiskUtilizationArgs> diskUtilization;

    public Optional<Output<DiskUtilizationArgs>> diskUtilization() {
        return Optional.ofNullable(this.diskUtilization);
    }

    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
     * 
     */
    @Import(name="maxConcurrentRequests")
    private @Nullable Output<Integer> maxConcurrentRequests;

    public Optional<Output<Integer>> maxConcurrentRequests() {
        return Optional.ofNullable(this.maxConcurrentRequests);
    }

    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    @Import(name="maxIdleInstances")
    private @Nullable Output<Integer> maxIdleInstances;

    public Optional<Output<Integer>> maxIdleInstances() {
        return Optional.ofNullable(this.maxIdleInstances);
    }

    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @Import(name="maxPendingLatency")
    private @Nullable Output<String> maxPendingLatency;

    public Optional<Output<String>> maxPendingLatency() {
        return Optional.ofNullable(this.maxPendingLatency);
    }

    /**
     * Maximum number of instances that should be started to handle requests for this version.
     * 
     */
    @Import(name="maxTotalInstances")
    private @Nullable Output<Integer> maxTotalInstances;

    public Optional<Output<Integer>> maxTotalInstances() {
        return Optional.ofNullable(this.maxTotalInstances);
    }

    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    @Import(name="minIdleInstances")
    private @Nullable Output<Integer> minIdleInstances;

    public Optional<Output<Integer>> minIdleInstances() {
        return Optional.ofNullable(this.minIdleInstances);
    }

    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @Import(name="minPendingLatency")
    private @Nullable Output<String> minPendingLatency;

    public Optional<Output<String>> minPendingLatency() {
        return Optional.ofNullable(this.minPendingLatency);
    }

    /**
     * Minimum number of running instances that should be maintained for this version.
     * 
     */
    @Import(name="minTotalInstances")
    private @Nullable Output<Integer> minTotalInstances;

    public Optional<Output<Integer>> minTotalInstances() {
        return Optional.ofNullable(this.minTotalInstances);
    }

    /**
     * Target scaling by network usage.
     * 
     */
    @Import(name="networkUtilization")
    private @Nullable Output<NetworkUtilizationArgs> networkUtilization;

    public Optional<Output<NetworkUtilizationArgs>> networkUtilization() {
        return Optional.ofNullable(this.networkUtilization);
    }

    /**
     * Target scaling by request utilization.
     * 
     */
    @Import(name="requestUtilization")
    private @Nullable Output<RequestUtilizationArgs> requestUtilization;

    public Optional<Output<RequestUtilizationArgs>> requestUtilization() {
        return Optional.ofNullable(this.requestUtilization);
    }

    /**
     * Scheduler settings for standard environment.
     * 
     */
    @Import(name="standardSchedulerSettings")
    private @Nullable Output<StandardSchedulerSettingsArgs> standardSchedulerSettings;

    public Optional<Output<StandardSchedulerSettingsArgs>> standardSchedulerSettings() {
        return Optional.ofNullable(this.standardSchedulerSettings);
    }

    private AutomaticScalingArgs() {}

    private AutomaticScalingArgs(AutomaticScalingArgs $) {
        this.coolDownPeriod = $.coolDownPeriod;
        this.cpuUtilization = $.cpuUtilization;
        this.diskUtilization = $.diskUtilization;
        this.maxConcurrentRequests = $.maxConcurrentRequests;
        this.maxIdleInstances = $.maxIdleInstances;
        this.maxPendingLatency = $.maxPendingLatency;
        this.maxTotalInstances = $.maxTotalInstances;
        this.minIdleInstances = $.minIdleInstances;
        this.minPendingLatency = $.minPendingLatency;
        this.minTotalInstances = $.minTotalInstances;
        this.networkUtilization = $.networkUtilization;
        this.requestUtilization = $.requestUtilization;
        this.standardSchedulerSettings = $.standardSchedulerSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomaticScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticScalingArgs $;

        public Builder() {
            $ = new AutomaticScalingArgs();
        }

        public Builder(AutomaticScalingArgs defaults) {
            $ = new AutomaticScalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder coolDownPeriod(@Nullable Output<String> coolDownPeriod) {
            $.coolDownPeriod = coolDownPeriod;
            return this;
        }

        public Builder coolDownPeriod(String coolDownPeriod) {
            return coolDownPeriod(Output.of(coolDownPeriod));
        }

        public Builder cpuUtilization(@Nullable Output<CpuUtilizationArgs> cpuUtilization) {
            $.cpuUtilization = cpuUtilization;
            return this;
        }

        public Builder cpuUtilization(CpuUtilizationArgs cpuUtilization) {
            return cpuUtilization(Output.of(cpuUtilization));
        }

        public Builder diskUtilization(@Nullable Output<DiskUtilizationArgs> diskUtilization) {
            $.diskUtilization = diskUtilization;
            return this;
        }

        public Builder diskUtilization(DiskUtilizationArgs diskUtilization) {
            return diskUtilization(Output.of(diskUtilization));
        }

        public Builder maxConcurrentRequests(@Nullable Output<Integer> maxConcurrentRequests) {
            $.maxConcurrentRequests = maxConcurrentRequests;
            return this;
        }

        public Builder maxConcurrentRequests(Integer maxConcurrentRequests) {
            return maxConcurrentRequests(Output.of(maxConcurrentRequests));
        }

        public Builder maxIdleInstances(@Nullable Output<Integer> maxIdleInstances) {
            $.maxIdleInstances = maxIdleInstances;
            return this;
        }

        public Builder maxIdleInstances(Integer maxIdleInstances) {
            return maxIdleInstances(Output.of(maxIdleInstances));
        }

        public Builder maxPendingLatency(@Nullable Output<String> maxPendingLatency) {
            $.maxPendingLatency = maxPendingLatency;
            return this;
        }

        public Builder maxPendingLatency(String maxPendingLatency) {
            return maxPendingLatency(Output.of(maxPendingLatency));
        }

        public Builder maxTotalInstances(@Nullable Output<Integer> maxTotalInstances) {
            $.maxTotalInstances = maxTotalInstances;
            return this;
        }

        public Builder maxTotalInstances(Integer maxTotalInstances) {
            return maxTotalInstances(Output.of(maxTotalInstances));
        }

        public Builder minIdleInstances(@Nullable Output<Integer> minIdleInstances) {
            $.minIdleInstances = minIdleInstances;
            return this;
        }

        public Builder minIdleInstances(Integer minIdleInstances) {
            return minIdleInstances(Output.of(minIdleInstances));
        }

        public Builder minPendingLatency(@Nullable Output<String> minPendingLatency) {
            $.minPendingLatency = minPendingLatency;
            return this;
        }

        public Builder minPendingLatency(String minPendingLatency) {
            return minPendingLatency(Output.of(minPendingLatency));
        }

        public Builder minTotalInstances(@Nullable Output<Integer> minTotalInstances) {
            $.minTotalInstances = minTotalInstances;
            return this;
        }

        public Builder minTotalInstances(Integer minTotalInstances) {
            return minTotalInstances(Output.of(minTotalInstances));
        }

        public Builder networkUtilization(@Nullable Output<NetworkUtilizationArgs> networkUtilization) {
            $.networkUtilization = networkUtilization;
            return this;
        }

        public Builder networkUtilization(NetworkUtilizationArgs networkUtilization) {
            return networkUtilization(Output.of(networkUtilization));
        }

        public Builder requestUtilization(@Nullable Output<RequestUtilizationArgs> requestUtilization) {
            $.requestUtilization = requestUtilization;
            return this;
        }

        public Builder requestUtilization(RequestUtilizationArgs requestUtilization) {
            return requestUtilization(Output.of(requestUtilization));
        }

        public Builder standardSchedulerSettings(@Nullable Output<StandardSchedulerSettingsArgs> standardSchedulerSettings) {
            $.standardSchedulerSettings = standardSchedulerSettings;
            return this;
        }

        public Builder standardSchedulerSettings(StandardSchedulerSettingsArgs standardSchedulerSettings) {
            return standardSchedulerSettings(Output.of(standardSchedulerSettings));
        }

        public AutomaticScalingArgs build() {
            return $;
        }
    }

}
