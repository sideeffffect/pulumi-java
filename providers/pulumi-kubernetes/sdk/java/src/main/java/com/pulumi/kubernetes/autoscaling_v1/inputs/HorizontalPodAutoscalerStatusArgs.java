// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * current status of a horizontal pod autoscaler
 * 
 */
public final class HorizontalPodAutoscalerStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerStatusArgs Empty = new HorizontalPodAutoscalerStatusArgs();

    /**
     * current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
     * 
     */
    @Import(name="currentCPUUtilizationPercentage")
    private @Nullable Output<Integer> currentCPUUtilizationPercentage;

    public Optional<Output<Integer>> currentCPUUtilizationPercentage() {
        return Optional.ofNullable(this.currentCPUUtilizationPercentage);
    }

    /**
     * current number of replicas of pods managed by this autoscaler.
     * 
     */
    @Import(name="currentReplicas", required=true)
    private Output<Integer> currentReplicas;

    public Output<Integer> currentReplicas() {
        return this.currentReplicas;
    }

    /**
     * desired number of replicas of pods managed by this autoscaler.
     * 
     */
    @Import(name="desiredReplicas", required=true)
    private Output<Integer> desiredReplicas;

    public Output<Integer> desiredReplicas() {
        return this.desiredReplicas;
    }

    /**
     * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    @Import(name="lastScaleTime")
    private @Nullable Output<String> lastScaleTime;

    public Optional<Output<String>> lastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }

    /**
     * most recent generation observed by this autoscaler.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    private HorizontalPodAutoscalerStatusArgs() {}

    private HorizontalPodAutoscalerStatusArgs(HorizontalPodAutoscalerStatusArgs $) {
        this.currentCPUUtilizationPercentage = $.currentCPUUtilizationPercentage;
        this.currentReplicas = $.currentReplicas;
        this.desiredReplicas = $.desiredReplicas;
        this.lastScaleTime = $.lastScaleTime;
        this.observedGeneration = $.observedGeneration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HorizontalPodAutoscalerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HorizontalPodAutoscalerStatusArgs $;

        public Builder() {
            $ = new HorizontalPodAutoscalerStatusArgs();
        }

        public Builder(HorizontalPodAutoscalerStatusArgs defaults) {
            $ = new HorizontalPodAutoscalerStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder currentCPUUtilizationPercentage(@Nullable Output<Integer> currentCPUUtilizationPercentage) {
            $.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
            return this;
        }

        public Builder currentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage) {
            return currentCPUUtilizationPercentage(Output.of(currentCPUUtilizationPercentage));
        }

        public Builder currentReplicas(Output<Integer> currentReplicas) {
            $.currentReplicas = currentReplicas;
            return this;
        }

        public Builder currentReplicas(Integer currentReplicas) {
            return currentReplicas(Output.of(currentReplicas));
        }

        public Builder desiredReplicas(Output<Integer> desiredReplicas) {
            $.desiredReplicas = desiredReplicas;
            return this;
        }

        public Builder desiredReplicas(Integer desiredReplicas) {
            return desiredReplicas(Output.of(desiredReplicas));
        }

        public Builder lastScaleTime(@Nullable Output<String> lastScaleTime) {
            $.lastScaleTime = lastScaleTime;
            return this;
        }

        public Builder lastScaleTime(String lastScaleTime) {
            return lastScaleTime(Output.of(lastScaleTime));
        }

        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public HorizontalPodAutoscalerStatusArgs build() {
            $.currentReplicas = Objects.requireNonNull($.currentReplicas, "expected parameter 'currentReplicas' to be non-null");
            $.desiredReplicas = Objects.requireNonNull($.desiredReplicas, "expected parameter 'desiredReplicas' to be non-null");
            return $;
        }
    }

}
