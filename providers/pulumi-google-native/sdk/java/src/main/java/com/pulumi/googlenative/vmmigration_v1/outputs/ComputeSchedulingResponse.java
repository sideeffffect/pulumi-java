// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration_v1.outputs.SchedulingNodeAffinityResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ComputeSchedulingResponse {
    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. Ignored if no node_affinites are configured.
     * 
     */
    private final Integer minNodeCpus;
    /**
     * A set of node affinity and anti-affinity configurations for sole tenant nodes.
     * 
     */
    private final List<SchedulingNodeAffinityResponse> nodeAffinities;
    /**
     * How the instance should behave when the host machine undergoes maintenance that may temporarily impact instance performance.
     * 
     */
    private final String onHostMaintenance;
    /**
     * Whether the Instance should be automatically restarted whenever it is terminated by Compute Engine (not terminated by user). This configuration is identical to `automaticRestart` field in Compute Engine create instance under scheduling. It was changed to an enum (instead of a boolean) to match the default value in Compute Engine which is automatic restart.
     * 
     */
    private final String restartType;

    @CustomType.Constructor
    private ComputeSchedulingResponse(
        @CustomType.Parameter("minNodeCpus") Integer minNodeCpus,
        @CustomType.Parameter("nodeAffinities") List<SchedulingNodeAffinityResponse> nodeAffinities,
        @CustomType.Parameter("onHostMaintenance") String onHostMaintenance,
        @CustomType.Parameter("restartType") String restartType) {
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.restartType = restartType;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. Ignored if no node_affinites are configured.
     * 
    */
    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }
    /**
     * A set of node affinity and anti-affinity configurations for sole tenant nodes.
     * 
    */
    public List<SchedulingNodeAffinityResponse> nodeAffinities() {
        return this.nodeAffinities;
    }
    /**
     * How the instance should behave when the host machine undergoes maintenance that may temporarily impact instance performance.
     * 
    */
    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }
    /**
     * Whether the Instance should be automatically restarted whenever it is terminated by Compute Engine (not terminated by user). This configuration is identical to `automaticRestart` field in Compute Engine create instance under scheduling. It was changed to an enum (instead of a boolean) to match the default value in Compute Engine which is automatic restart.
     * 
    */
    public String restartType() {
        return this.restartType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeSchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private String restartType;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeSchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.restartType = defaults.restartType;
        }

        public Builder minNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }
        public Builder nodeAffinities(List<SchedulingNodeAffinityResponse> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(SchedulingNodeAffinityResponse... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }
        public Builder restartType(String restartType) {
            this.restartType = Objects.requireNonNull(restartType);
            return this;
        }        public ComputeSchedulingResponse build() {
            return new ComputeSchedulingResponse(minNodeCpus, nodeAffinities, onHostMaintenance, restartType);
        }
    }
}
