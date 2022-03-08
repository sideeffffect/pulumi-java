// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.ReplicaSetCondition;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReplicaSetStatus {
    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
     */
    private final @Nullable Integer availableReplicas;
    /**
     * Represents the latest available observations of a replica set's current state.
     * 
     */
    private final @Nullable List<ReplicaSetCondition> conditions;
    /**
     * The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
     */
    private final @Nullable Integer fullyLabeledReplicas;
    /**
     * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
     */
    private final @Nullable Integer observedGeneration;
    /**
     * The number of ready replicas for this replica set.
     * 
     */
    private final @Nullable Integer readyReplicas;
    /**
     * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    private final Integer replicas;

    @OutputCustomType.Constructor({"availableReplicas","conditions","fullyLabeledReplicas","observedGeneration","readyReplicas","replicas"})
    private ReplicaSetStatus(
        @Nullable Integer availableReplicas,
        @Nullable List<ReplicaSetCondition> conditions,
        @Nullable Integer fullyLabeledReplicas,
        @Nullable Integer observedGeneration,
        @Nullable Integer readyReplicas,
        Integer replicas) {
        this.availableReplicas = availableReplicas;
        this.conditions = conditions;
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = replicas;
    }

    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
    */
    public Optional<Integer> getAvailableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }
    /**
     * Represents the latest available observations of a replica set's current state.
     * 
    */
    public List<ReplicaSetCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
    */
    public Optional<Integer> getFullyLabeledReplicas() {
        return Optional.ofNullable(this.fullyLabeledReplicas);
    }
    /**
     * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
    */
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * The number of ready replicas for this replica set.
     * 
    */
    public Optional<Integer> getReadyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    /**
     * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
    */
    public Integer getReplicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availableReplicas;
        private @Nullable List<ReplicaSetCondition> conditions;
        private @Nullable Integer fullyLabeledReplicas;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private Integer replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.conditions = defaults.conditions;
    	      this.fullyLabeledReplicas = defaults.fullyLabeledReplicas;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
        }

        public Builder setAvailableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }

        public Builder setConditions(@Nullable List<ReplicaSetCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setFullyLabeledReplicas(@Nullable Integer fullyLabeledReplicas) {
            this.fullyLabeledReplicas = fullyLabeledReplicas;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setReadyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }

        public Builder setReplicas(Integer replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public ReplicaSetStatus build() {
            return new ReplicaSetStatus(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
        }
    }
}
