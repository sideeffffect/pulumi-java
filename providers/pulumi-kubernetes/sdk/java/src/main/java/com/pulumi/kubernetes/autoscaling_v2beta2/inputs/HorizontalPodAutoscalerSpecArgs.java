// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.CrossVersionObjectReferenceArgs;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.HorizontalPodAutoscalerBehaviorArgs;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricSpecArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 * 
 */
public final class HorizontalPodAutoscalerSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerSpecArgs Empty = new HorizontalPodAutoscalerSpecArgs();

    /**
     * behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively). If not set, the default HPAScalingRules for scale up and scale down are used.
     * 
     */
    @Import(name="behavior")
      private final @Nullable Output<HorizontalPodAutoscalerBehaviorArgs> behavior;

    public Output<HorizontalPodAutoscalerBehaviorArgs> behavior() {
        return this.behavior == null ? Codegen.empty() : this.behavior;
    }

    /**
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
     * 
     */
    @Import(name="maxReplicas", required=true)
      private final Output<Integer> maxReplicas;

    public Output<Integer> maxReplicas() {
        return this.maxReplicas;
    }

    /**
     * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<List<MetricSpecArgs>> metrics;

    public Output<List<MetricSpecArgs>> metrics() {
        return this.metrics == null ? Codegen.empty() : this.metrics;
    }

    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
     */
    @Import(name="minReplicas")
      private final @Nullable Output<Integer> minReplicas;

    public Output<Integer> minReplicas() {
        return this.minReplicas == null ? Codegen.empty() : this.minReplicas;
    }

    /**
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
     * 
     */
    @Import(name="scaleTargetRef", required=true)
      private final Output<CrossVersionObjectReferenceArgs> scaleTargetRef;

    public Output<CrossVersionObjectReferenceArgs> scaleTargetRef() {
        return this.scaleTargetRef;
    }

    public HorizontalPodAutoscalerSpecArgs(
        @Nullable Output<HorizontalPodAutoscalerBehaviorArgs> behavior,
        Output<Integer> maxReplicas,
        @Nullable Output<List<MetricSpecArgs>> metrics,
        @Nullable Output<Integer> minReplicas,
        Output<CrossVersionObjectReferenceArgs> scaleTargetRef) {
        this.behavior = behavior;
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.metrics = metrics;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef, "expected parameter 'scaleTargetRef' to be non-null");
    }

    private HorizontalPodAutoscalerSpecArgs() {
        this.behavior = Codegen.empty();
        this.maxReplicas = Codegen.empty();
        this.metrics = Codegen.empty();
        this.minReplicas = Codegen.empty();
        this.scaleTargetRef = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HorizontalPodAutoscalerBehaviorArgs> behavior;
        private Output<Integer> maxReplicas;
        private @Nullable Output<List<MetricSpecArgs>> metrics;
        private @Nullable Output<Integer> minReplicas;
        private Output<CrossVersionObjectReferenceArgs> scaleTargetRef;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
        }

        public Builder behavior(@Nullable Output<HorizontalPodAutoscalerBehaviorArgs> behavior) {
            this.behavior = behavior;
            return this;
        }
        public Builder behavior(@Nullable HorizontalPodAutoscalerBehaviorArgs behavior) {
            this.behavior = Codegen.ofNullable(behavior);
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
        public Builder metrics(@Nullable Output<List<MetricSpecArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<MetricSpecArgs> metrics) {
            this.metrics = Codegen.ofNullable(metrics);
            return this;
        }
        public Builder metrics(MetricSpecArgs... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder minReplicas(@Nullable Output<Integer> minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Builder minReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = Codegen.ofNullable(minReplicas);
            return this;
        }
        public Builder scaleTargetRef(Output<CrossVersionObjectReferenceArgs> scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }
        public Builder scaleTargetRef(CrossVersionObjectReferenceArgs scaleTargetRef) {
            this.scaleTargetRef = Output.of(Objects.requireNonNull(scaleTargetRef));
            return this;
        }        public HorizontalPodAutoscalerSpecArgs build() {
            return new HorizontalPodAutoscalerSpecArgs(behavior, maxReplicas, metrics, minReplicas, scaleTargetRef);
        }
    }
}
