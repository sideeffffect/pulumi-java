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
    private Boolean automaticRestart;

    public Boolean automaticRestart() {
        return this.automaticRestart;
    }

    @Import(name="minNodeCpus", required=true)
    private Integer minNodeCpus;

    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }

    @Import(name="nodeAffinities", required=true)
    private List<GetInstanceSchedulingNodeAffinity> nodeAffinities;

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
    private String onHostMaintenance;

    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Whether the instance is preemptible.
     * 
     */
    @Import(name="preemptible", required=true)
    private Boolean preemptible;

    public Boolean preemptible() {
        return this.preemptible;
    }

    private GetInstanceScheduling() {}

    private GetInstanceScheduling(GetInstanceScheduling $) {
        this.automaticRestart = $.automaticRestart;
        this.minNodeCpus = $.minNodeCpus;
        this.nodeAffinities = $.nodeAffinities;
        this.onHostMaintenance = $.onHostMaintenance;
        this.preemptible = $.preemptible;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceScheduling $;

        public Builder() {
            $ = new GetInstanceScheduling();
        }

        public Builder(GetInstanceScheduling defaults) {
            $ = new GetInstanceScheduling(Objects.requireNonNull(defaults));
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            $.automaticRestart = automaticRestart;
            return this;
        }

        public Builder minNodeCpus(Integer minNodeCpus) {
            $.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder nodeAffinities(List<GetInstanceSchedulingNodeAffinity> nodeAffinities) {
            $.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder nodeAffinities(GetInstanceSchedulingNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }

        public Builder onHostMaintenance(String onHostMaintenance) {
            $.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder preemptible(Boolean preemptible) {
            $.preemptible = preemptible;
            return this;
        }

        public GetInstanceScheduling build() {
            $.automaticRestart = Objects.requireNonNull($.automaticRestart, "expected parameter 'automaticRestart' to be non-null");
            $.minNodeCpus = Objects.requireNonNull($.minNodeCpus, "expected parameter 'minNodeCpus' to be non-null");
            $.nodeAffinities = Objects.requireNonNull($.nodeAffinities, "expected parameter 'nodeAffinities' to be non-null");
            $.onHostMaintenance = Objects.requireNonNull($.onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
            $.preemptible = Objects.requireNonNull($.preemptible, "expected parameter 'preemptible' to be non-null");
            return $;
        }
    }

}
