// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyMetricArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleDownControlArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScaleInControlArgs;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyScalingScheduleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionAutoscalerAutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerAutoscalingPolicyArgs Empty = new RegionAutoscalerAutoscalingPolicyArgs();

    /**
     * The number of seconds that the autoscaler should wait before it
     * starts collecting information from a new instance. This prevents
     * the autoscaler from collecting information when the instance is
     * initializing, during which the collected usage would not be
     * reliable. The default time autoscaler waits is 60 seconds.
     * Virtual machine initialization times might vary because of
     * numerous factors. We recommend that you test how long an
     * instance may take to initialize. To do this, create an instance
     * and time the startup process.
     * 
     */
    @Import(name="cooldownPeriod")
      private final @Nullable Output<Integer> cooldownPeriod;

    public Output<Integer> cooldownPeriod() {
        return this.cooldownPeriod == null ? Codegen.empty() : this.cooldownPeriod;
    }

    /**
     * Defines the CPU utilization policy that allows the autoscaler to
     * scale based on the average CPU utilization of a managed instance
     * group.
     * Structure is documented below.
     * 
     */
    @Import(name="cpuUtilization")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization;

    public Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization() {
        return this.cpuUtilization == null ? Codegen.empty() : this.cpuUtilization;
    }

    /**
     * Configuration parameters of autoscaling based on a load balancer.
     * Structure is documented below.
     * 
     */
    @Import(name="loadBalancingUtilization")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;

    public Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization() {
        return this.loadBalancingUtilization == null ? Codegen.empty() : this.loadBalancingUtilization;
    }

    /**
     * The maximum number of instances that the autoscaler can scale up
     * to. This is required when creating or updating an autoscaler. The
     * maximum number of replicas should not be lower than minimal number
     * of replicas.
     * 
     */
    @Import(name="maxReplicas", required=true)
      private final Output<Integer> maxReplicas;

    public Output<Integer> maxReplicas() {
        return this.maxReplicas;
    }

    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * Structure is documented below.
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricArgs>> metrics;

    public Output<List<RegionAutoscalerAutoscalingPolicyMetricArgs>> metrics() {
        return this.metrics == null ? Codegen.empty() : this.metrics;
    }

    /**
     * The minimum number of replicas that the autoscaler can scale down
     * to. This cannot be less than 0. If not provided, autoscaler will
     * choose a default value depending on maximum number of instances
     * allowed.
     * 
     */
    @Import(name="minReplicas", required=true)
      private final Output<Integer> minReplicas;

    public Output<Integer> minReplicas() {
        return this.minReplicas;
    }

    /**
     * Defines operating mode for this policy.
     * Default value is `ON`.
     * Possible values are `OFF`, `ONLY_UP`, and `ON`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * Defines scale down controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @Import(name="scaleDownControl")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl;

    public Output<RegionAutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl() {
        return this.scaleDownControl == null ? Codegen.empty() : this.scaleDownControl;
    }

    /**
     * Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * 
     */
    @Import(name="scaleInControl")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl;

    public Output<RegionAutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl() {
        return this.scaleInControl == null ? Codegen.empty() : this.scaleInControl;
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler and they can overlap.
     * Structure is documented below.
     * 
     */
    @Import(name="scalingSchedules")
      private final @Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules;

    public Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules() {
        return this.scalingSchedules == null ? Codegen.empty() : this.scalingSchedules;
    }

    public RegionAutoscalerAutoscalingPolicyArgs(
        @Nullable Output<Integer> cooldownPeriod,
        @Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization,
        @Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization,
        Output<Integer> maxReplicas,
        @Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricArgs>> metrics,
        Output<Integer> minReplicas,
        @Nullable Output<String> mode,
        @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl,
        @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl,
        @Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules) {
        this.cooldownPeriod = cooldownPeriod;
        this.cpuUtilization = cpuUtilization;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.metrics = metrics;
        this.minReplicas = Objects.requireNonNull(minReplicas, "expected parameter 'minReplicas' to be non-null");
        this.mode = mode;
        this.scaleDownControl = scaleDownControl;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    private RegionAutoscalerAutoscalingPolicyArgs() {
        this.cooldownPeriod = Codegen.empty();
        this.cpuUtilization = Codegen.empty();
        this.loadBalancingUtilization = Codegen.empty();
        this.maxReplicas = Codegen.empty();
        this.metrics = Codegen.empty();
        this.minReplicas = Codegen.empty();
        this.mode = Codegen.empty();
        this.scaleDownControl = Codegen.empty();
        this.scaleInControl = Codegen.empty();
        this.scalingSchedules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionAutoscalerAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cooldownPeriod;
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization;
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;
        private Output<Integer> maxReplicas;
        private @Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricArgs>> metrics;
        private Output<Integer> minReplicas;
        private @Nullable Output<String> mode;
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl;
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl;
        private @Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionAutoscalerAutoscalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleDownControl = defaults.scaleDownControl;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder cooldownPeriod(@Nullable Output<Integer> cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }
        public Builder cooldownPeriod(@Nullable Integer cooldownPeriod) {
            this.cooldownPeriod = Codegen.ofNullable(cooldownPeriod);
            return this;
        }
        public Builder cpuUtilization(@Nullable Output<RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }
        public Builder cpuUtilization(@Nullable RegionAutoscalerAutoscalingPolicyCpuUtilizationArgs cpuUtilization) {
            this.cpuUtilization = Codegen.ofNullable(cpuUtilization);
            return this;
        }
        public Builder loadBalancingUtilization(@Nullable Output<RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }
        public Builder loadBalancingUtilization(@Nullable RegionAutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs loadBalancingUtilization) {
            this.loadBalancingUtilization = Codegen.ofNullable(loadBalancingUtilization);
            return this;
        }
        public Builder maxReplicas(Output<Integer> maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }
        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = Output.of(Objects.requireNonNull(maxReplicas));
            return this;
        }
        public Builder metrics(@Nullable Output<List<RegionAutoscalerAutoscalingPolicyMetricArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<RegionAutoscalerAutoscalingPolicyMetricArgs> metrics) {
            this.metrics = Codegen.ofNullable(metrics);
            return this;
        }
        public Builder metrics(RegionAutoscalerAutoscalingPolicyMetricArgs... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder minReplicas(Output<Integer> minReplicas) {
            this.minReplicas = Objects.requireNonNull(minReplicas);
            return this;
        }
        public Builder minReplicas(Integer minReplicas) {
            this.minReplicas = Output.of(Objects.requireNonNull(minReplicas));
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder scaleDownControl(@Nullable Output<RegionAutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl) {
            this.scaleDownControl = scaleDownControl;
            return this;
        }
        public Builder scaleDownControl(@Nullable RegionAutoscalerAutoscalingPolicyScaleDownControlArgs scaleDownControl) {
            this.scaleDownControl = Codegen.ofNullable(scaleDownControl);
            return this;
        }
        public Builder scaleInControl(@Nullable Output<RegionAutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }
        public Builder scaleInControl(@Nullable RegionAutoscalerAutoscalingPolicyScaleInControlArgs scaleInControl) {
            this.scaleInControl = Codegen.ofNullable(scaleInControl);
            return this;
        }
        public Builder scalingSchedules(@Nullable Output<List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }
        public Builder scalingSchedules(@Nullable List<RegionAutoscalerAutoscalingPolicyScalingScheduleArgs> scalingSchedules) {
            this.scalingSchedules = Codegen.ofNullable(scalingSchedules);
            return this;
        }
        public Builder scalingSchedules(RegionAutoscalerAutoscalingPolicyScalingScheduleArgs... scalingSchedules) {
            return scalingSchedules(List.of(scalingSchedules));
        }        public RegionAutoscalerAutoscalingPolicyArgs build() {
            return new RegionAutoscalerAutoscalingPolicyArgs(cooldownPeriod, cpuUtilization, loadBalancingUtilization, maxReplicas, metrics, minReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
