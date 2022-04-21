// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetComputeCapacityGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetComputeCapacityGetArgs Empty = new FleetComputeCapacityGetArgs();

    /**
     * Number of currently available instances that can be used to stream sessions.
     * 
     */
    @Import(name="available")
    private @Nullable Output<Integer> available;

    public Optional<Output<Integer>> available() {
        return Optional.ofNullable(this.available);
    }

    /**
     * Desired number of streaming instances.
     * 
     */
    @Import(name="desiredInstances", required=true)
    private Output<Integer> desiredInstances;

    public Output<Integer> desiredInstances() {
        return this.desiredInstances;
    }

    /**
     * Number of instances in use for streaming.
     * 
     */
    @Import(name="inUse")
    private @Nullable Output<Integer> inUse;

    public Optional<Output<Integer>> inUse() {
        return Optional.ofNullable(this.inUse);
    }

    /**
     * Total number of simultaneous streaming instances that are running.
     * 
     */
    @Import(name="running")
    private @Nullable Output<Integer> running;

    public Optional<Output<Integer>> running() {
        return Optional.ofNullable(this.running);
    }

    private FleetComputeCapacityGetArgs() {}

    private FleetComputeCapacityGetArgs(FleetComputeCapacityGetArgs $) {
        this.available = $.available;
        this.desiredInstances = $.desiredInstances;
        this.inUse = $.inUse;
        this.running = $.running;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetComputeCapacityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetComputeCapacityGetArgs $;

        public Builder() {
            $ = new FleetComputeCapacityGetArgs();
        }

        public Builder(FleetComputeCapacityGetArgs defaults) {
            $ = new FleetComputeCapacityGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder available(@Nullable Output<Integer> available) {
            $.available = available;
            return this;
        }

        public Builder available(Integer available) {
            return available(Output.of(available));
        }

        public Builder desiredInstances(Output<Integer> desiredInstances) {
            $.desiredInstances = desiredInstances;
            return this;
        }

        public Builder desiredInstances(Integer desiredInstances) {
            return desiredInstances(Output.of(desiredInstances));
        }

        public Builder inUse(@Nullable Output<Integer> inUse) {
            $.inUse = inUse;
            return this;
        }

        public Builder inUse(Integer inUse) {
            return inUse(Output.of(inUse));
        }

        public Builder running(@Nullable Output<Integer> running) {
            $.running = running;
            return this;
        }

        public Builder running(Integer running) {
            return running(Output.of(running));
        }

        public FleetComputeCapacityGetArgs build() {
            $.desiredInstances = Objects.requireNonNull($.desiredInstances, "expected parameter 'desiredInstances' to be non-null");
            return $;
        }
    }

}
