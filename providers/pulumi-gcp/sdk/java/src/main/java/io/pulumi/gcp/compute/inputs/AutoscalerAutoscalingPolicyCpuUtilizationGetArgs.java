// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyCpuUtilizationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyCpuUtilizationGetArgs Empty = new AutoscalerAutoscalingPolicyCpuUtilizationGetArgs();

    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are:
     * - NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics.
     * - OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    @Import(name="predictiveMethod")
      private final @Nullable Output<String> predictiveMethod;

    public Output<String> predictiveMethod() {
        return this.predictiveMethod == null ? Codegen.empty() : this.predictiveMethod;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="target", required=true)
      private final Output<Double> target;

    public Output<Double> target() {
        return this.target;
    }

    public AutoscalerAutoscalingPolicyCpuUtilizationGetArgs(
        @Nullable Output<String> predictiveMethod,
        Output<Double> target) {
        this.predictiveMethod = predictiveMethod;
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private AutoscalerAutoscalingPolicyCpuUtilizationGetArgs() {
        this.predictiveMethod = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyCpuUtilizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> predictiveMethod;
        private Output<Double> target;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyCpuUtilizationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predictiveMethod = defaults.predictiveMethod;
    	      this.target = defaults.target;
        }

        public Builder predictiveMethod(@Nullable Output<String> predictiveMethod) {
            this.predictiveMethod = predictiveMethod;
            return this;
        }
        public Builder predictiveMethod(@Nullable String predictiveMethod) {
            this.predictiveMethod = Codegen.ofNullable(predictiveMethod);
            return this;
        }
        public Builder target(Output<Double> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(Double target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public AutoscalerAutoscalingPolicyCpuUtilizationGetArgs build() {
            return new AutoscalerAutoscalingPolicyCpuUtilizationGetArgs(predictiveMethod, target);
        }
    }
}
