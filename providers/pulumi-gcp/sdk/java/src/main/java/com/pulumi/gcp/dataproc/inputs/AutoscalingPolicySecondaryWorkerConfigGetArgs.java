// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscalingPolicySecondaryWorkerConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicySecondaryWorkerConfigGetArgs Empty = new AutoscalingPolicySecondaryWorkerConfigGetArgs();

    /**
     * Maximum number of instances for this group. Note that by default, clusters will not use
     * secondary workers. Required for secondary workers if the minimum secondary instances is set.
     * Bounds: [minInstances, ). Defaults to 0.
     * 
     */
    @Import(name="maxInstances")
    private @Nullable Output<Integer> maxInstances;

    public Optional<Output<Integer>> maxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }

    /**
     * Minimum number of instances for this group. Bounds: [0, maxInstances]. Defaults to 0.
     * 
     */
    @Import(name="minInstances")
    private @Nullable Output<Integer> minInstances;

    public Optional<Output<Integer>> minInstances() {
        return Optional.ofNullable(this.minInstances);
    }

    /**
     * Weight for the instance group, which is used to determine the fraction of total workers
     * in the cluster from this instance group. For example, if primary workers have weight 2,
     * and secondary workers have weight 1, the cluster will have approximately 2 primary workers
     * for each secondary worker.
     * The cluster may not reach the specified balance if constrained by min/max bounds or other
     * autoscaling settings. For example, if maxInstances for secondary workers is 0, then only
     * primary workers will be added. The cluster can also be out of balance when created.
     * If weight is not set on any instance group, the cluster will default to equal weight for
     * all groups: the cluster will attempt to maintain an equal number of workers in each group
     * within the configured size bounds for each group. If weight is set for one group only,
     * the cluster will default to zero weight on the unset group. For example if weight is set
     * only on primary workers, the cluster will use primary workers only and no secondary workers.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private AutoscalingPolicySecondaryWorkerConfigGetArgs() {}

    private AutoscalingPolicySecondaryWorkerConfigGetArgs(AutoscalingPolicySecondaryWorkerConfigGetArgs $) {
        this.maxInstances = $.maxInstances;
        this.minInstances = $.minInstances;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingPolicySecondaryWorkerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicySecondaryWorkerConfigGetArgs $;

        public Builder() {
            $ = new AutoscalingPolicySecondaryWorkerConfigGetArgs();
        }

        public Builder(AutoscalingPolicySecondaryWorkerConfigGetArgs defaults) {
            $ = new AutoscalingPolicySecondaryWorkerConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            $.maxInstances = maxInstances;
            return this;
        }

        public Builder maxInstances(Integer maxInstances) {
            return maxInstances(Output.of(maxInstances));
        }

        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            $.minInstances = minInstances;
            return this;
        }

        public Builder minInstances(Integer minInstances) {
            return minInstances(Output.of(minInstances));
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public AutoscalingPolicySecondaryWorkerConfigGetArgs build() {
            return $;
        }
    }

}
