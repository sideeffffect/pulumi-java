// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.extensions_v1beta1.inputs.ReplicaSetConditionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 * 
 */
public final class ReplicaSetStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicaSetStatusArgs Empty = new ReplicaSetStatusArgs();

    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
     */
    @Import(name="availableReplicas")
    private @Nullable Output<Integer> availableReplicas;

    public Optional<Output<Integer>> availableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }

    /**
     * Represents the latest available observations of a replica set&#39;s current state.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<ReplicaSetConditionArgs>> conditions;

    public Optional<Output<List<ReplicaSetConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
     */
    @Import(name="fullyLabeledReplicas")
    private @Nullable Output<Integer> fullyLabeledReplicas;

    public Optional<Output<Integer>> fullyLabeledReplicas() {
        return Optional.ofNullable(this.fullyLabeledReplicas);
    }

    /**
     * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    /**
     * The number of ready replicas for this replica set.
     * 
     */
    @Import(name="readyReplicas")
    private @Nullable Output<Integer> readyReplicas;

    public Optional<Output<Integer>> readyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }

    /**
     * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    @Import(name="replicas", required=true)
    private Output<Integer> replicas;

    public Output<Integer> replicas() {
        return this.replicas;
    }

    private ReplicaSetStatusArgs() {}

    private ReplicaSetStatusArgs(ReplicaSetStatusArgs $) {
        this.availableReplicas = $.availableReplicas;
        this.conditions = $.conditions;
        this.fullyLabeledReplicas = $.fullyLabeledReplicas;
        this.observedGeneration = $.observedGeneration;
        this.readyReplicas = $.readyReplicas;
        this.replicas = $.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicaSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicaSetStatusArgs $;

        public Builder() {
            $ = new ReplicaSetStatusArgs();
        }

        public Builder(ReplicaSetStatusArgs defaults) {
            $ = new ReplicaSetStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder availableReplicas(@Nullable Output<Integer> availableReplicas) {
            $.availableReplicas = availableReplicas;
            return this;
        }

        public Builder availableReplicas(Integer availableReplicas) {
            return availableReplicas(Output.of(availableReplicas));
        }

        public Builder conditions(@Nullable Output<List<ReplicaSetConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ReplicaSetConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ReplicaSetConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder fullyLabeledReplicas(@Nullable Output<Integer> fullyLabeledReplicas) {
            $.fullyLabeledReplicas = fullyLabeledReplicas;
            return this;
        }

        public Builder fullyLabeledReplicas(Integer fullyLabeledReplicas) {
            return fullyLabeledReplicas(Output.of(fullyLabeledReplicas));
        }

        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public Builder readyReplicas(@Nullable Output<Integer> readyReplicas) {
            $.readyReplicas = readyReplicas;
            return this;
        }

        public Builder readyReplicas(Integer readyReplicas) {
            return readyReplicas(Output.of(readyReplicas));
        }

        public Builder replicas(Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        public ReplicaSetStatusArgs build() {
            $.replicas = Objects.requireNonNull($.replicas, "expected parameter 'replicas' to be non-null");
            return $;
        }
    }

}
