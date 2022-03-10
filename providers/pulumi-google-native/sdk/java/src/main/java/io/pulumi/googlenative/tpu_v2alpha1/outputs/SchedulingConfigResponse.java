// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class SchedulingConfigResponse {
    /**
     * Defines whether the node is preemptible.
     * 
     */
    private final Boolean preemptible;
    /**
     * Whether the node is created under a reservation.
     * 
     */
    private final Boolean reserved;

    @OutputCustomType.Constructor
    private SchedulingConfigResponse(
        @OutputCustomType.Parameter("preemptible") Boolean preemptible,
        @OutputCustomType.Parameter("reserved") Boolean reserved) {
        this.preemptible = preemptible;
        this.reserved = reserved;
    }

    /**
     * Defines whether the node is preemptible.
     * 
    */
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    /**
     * Whether the node is created under a reservation.
     * 
    */
    public Boolean getReserved() {
        return this.reserved;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean preemptible;
        private Boolean reserved;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptible = defaults.preemptible;
    	      this.reserved = defaults.reserved;
        }

        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder reserved(Boolean reserved) {
            this.reserved = Objects.requireNonNull(reserved);
            return this;
        }
        public SchedulingConfigResponse build() {
            return new SchedulingConfigResponse(preemptible, reserved);
        }
    }
}
