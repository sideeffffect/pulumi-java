// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.GetInstanceSchedulingNodeAffinity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceScheduling extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceScheduling Empty = new GetInstanceScheduling();

    /**
     * Specifies if the instance should be
     * restarted if it was terminated by Compute Engine (not a user).
     * 
     */
    @Import(name="automaticRestart", required=true)
      private final Boolean automaticRestart;

    public Boolean automaticRestart() {
        return this.automaticRestart;
    }

    @Import(name="minNodeCpus", required=true)
      private final Integer minNodeCpus;

    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }

    @Import(name="nodeAffinities", required=true)
      private final List<GetInstanceSchedulingNodeAffinity> nodeAffinities;

    public List<GetInstanceSchedulingNodeAffinity> nodeAffinities() {
        return this.nodeAffinities;
    }

    /**
     * Describes maintenance behavior for the
     * instance. One of `MIGRATE` or `TERMINATE`, for more info, read
     * [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options)
     * 
     */
    @Import(name="onHostMaintenance", required=true)
      private final String onHostMaintenance;

    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Whether the instance is preemptible.
     * 
     */
    @Import(name="preemptible", required=true)
      private final Boolean preemptible;

    public Boolean preemptible() {
        return this.preemptible;
    }

    public GetInstanceScheduling(
        Boolean automaticRestart,
        Integer minNodeCpus,
        List<GetInstanceSchedulingNodeAffinity> nodeAffinities,
        String onHostMaintenance,
        Boolean preemptible) {
        this.automaticRestart = Objects.requireNonNull(automaticRestart, "expected parameter 'automaticRestart' to be non-null");
        this.minNodeCpus = Objects.requireNonNull(minNodeCpus, "expected parameter 'minNodeCpus' to be non-null");
        this.nodeAffinities = Objects.requireNonNull(nodeAffinities, "expected parameter 'nodeAffinities' to be non-null");
        this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
        this.preemptible = Objects.requireNonNull(preemptible, "expected parameter 'preemptible' to be non-null");
    }

    private GetInstanceScheduling() {
        this.automaticRestart = null;
        this.minNodeCpus = null;
        this.nodeAffinities = List.of();
        this.onHostMaintenance = null;
        this.preemptible = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private Integer minNodeCpus;
        private List<GetInstanceSchedulingNodeAffinity> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }
        public Builder minNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }
        public Builder nodeAffinities(List<GetInstanceSchedulingNodeAffinity> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(GetInstanceSchedulingNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }
        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }        public GetInstanceScheduling build() {
            return new GetInstanceScheduling(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible);
        }
    }
}
