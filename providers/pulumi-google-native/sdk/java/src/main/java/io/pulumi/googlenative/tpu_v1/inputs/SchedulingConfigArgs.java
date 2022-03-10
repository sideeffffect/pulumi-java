// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sets the scheduling options for this node.
 * 
 */
public final class SchedulingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingConfigArgs Empty = new SchedulingConfigArgs();

    /**
     * Defines whether the node is preemptible.
     * 
     */
    @InputImport(name="preemptible")
      private final @Nullable Input<Boolean> preemptible;

    public Input<Boolean> getPreemptible() {
        return this.preemptible == null ? Input.empty() : this.preemptible;
    }

    /**
     * Whether the node is created under a reservation.
     * 
     */
    @InputImport(name="reserved")
      private final @Nullable Input<Boolean> reserved;

    public Input<Boolean> getReserved() {
        return this.reserved == null ? Input.empty() : this.reserved;
    }

    public SchedulingConfigArgs(
        @Nullable Input<Boolean> preemptible,
        @Nullable Input<Boolean> reserved) {
        this.preemptible = preemptible;
        this.reserved = reserved;
    }

    private SchedulingConfigArgs() {
        this.preemptible = Input.empty();
        this.reserved = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> preemptible;
        private @Nullable Input<Boolean> reserved;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptible = defaults.preemptible;
    	      this.reserved = defaults.reserved;
        }

        public Builder preemptible(@Nullable Input<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }

        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = Input.ofNullable(preemptible);
            return this;
        }

        public Builder reserved(@Nullable Input<Boolean> reserved) {
            this.reserved = reserved;
            return this;
        }

        public Builder reserved(@Nullable Boolean reserved) {
            this.reserved = Input.ofNullable(reserved);
            return this;
        }
        public SchedulingConfigArgs build() {
            return new SchedulingConfigArgs(preemptible, reserved);
        }
    }
}
