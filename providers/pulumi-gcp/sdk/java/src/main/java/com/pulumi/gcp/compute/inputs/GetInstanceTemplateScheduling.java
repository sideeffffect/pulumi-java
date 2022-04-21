// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.GetInstanceTemplateSchedulingNodeAffinity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTemplateScheduling extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateScheduling Empty = new GetInstanceTemplateScheduling();

    /**
     * Specifies whether the instance should be
     * automatically restarted if it is terminated by Compute Engine (not
     * terminated by a user). This defaults to true.
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

    /**
     * Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    @Import(name="nodeAffinities", required=true)
    private List<GetInstanceTemplateSchedulingNodeAffinity> nodeAffinities;

    public List<GetInstanceTemplateSchedulingNodeAffinity> nodeAffinities() {
        return this.nodeAffinities;
    }

    /**
     * Defines the maintenance behavior for this
     * instance.
     * 
     */
    @Import(name="onHostMaintenance", required=true)
    private String onHostMaintenance;

    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Allows instance to be preempted. This defaults to
     * false. Read more on this
     * [here](https://cloud.google.com/compute/docs/instances/preemptible).
     * 
     */
    @Import(name="preemptible", required=true)
    private Boolean preemptible;

    public Boolean preemptible() {
        return this.preemptible;
    }

    private GetInstanceTemplateScheduling() {}

    private GetInstanceTemplateScheduling(GetInstanceTemplateScheduling $) {
        this.automaticRestart = $.automaticRestart;
        this.minNodeCpus = $.minNodeCpus;
        this.nodeAffinities = $.nodeAffinities;
        this.onHostMaintenance = $.onHostMaintenance;
        this.preemptible = $.preemptible;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTemplateScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTemplateScheduling $;

        public Builder() {
            $ = new GetInstanceTemplateScheduling();
        }

        public Builder(GetInstanceTemplateScheduling defaults) {
            $ = new GetInstanceTemplateScheduling(Objects.requireNonNull(defaults));
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            $.automaticRestart = automaticRestart;
            return this;
        }

        public Builder minNodeCpus(Integer minNodeCpus) {
            $.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder nodeAffinities(List<GetInstanceTemplateSchedulingNodeAffinity> nodeAffinities) {
            $.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder nodeAffinities(GetInstanceTemplateSchedulingNodeAffinity... nodeAffinities) {
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

        public GetInstanceTemplateScheduling build() {
            $.automaticRestart = Objects.requireNonNull($.automaticRestart, "expected parameter 'automaticRestart' to be non-null");
            $.minNodeCpus = Objects.requireNonNull($.minNodeCpus, "expected parameter 'minNodeCpus' to be non-null");
            $.nodeAffinities = Objects.requireNonNull($.nodeAffinities, "expected parameter 'nodeAffinities' to be non-null");
            $.onHostMaintenance = Objects.requireNonNull($.onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
            $.preemptible = Objects.requireNonNull($.preemptible, "expected parameter 'preemptible' to be non-null");
            return $;
        }
    }

}
