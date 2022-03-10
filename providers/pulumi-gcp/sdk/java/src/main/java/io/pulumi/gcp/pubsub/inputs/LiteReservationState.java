// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteReservationState extends io.pulumi.resources.ResourceArgs {

    public static final LiteReservationState Empty = new LiteReservationState();

    /**
     * Name of the reservation.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the pubsub lite reservation.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The reserved throughput capacity. Every unit of throughput capacity is
     * equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed
     * messages.
     * 
     */
    @InputImport(name="throughputCapacity")
      private final @Nullable Input<Integer> throughputCapacity;

    public Input<Integer> getThroughputCapacity() {
        return this.throughputCapacity == null ? Input.empty() : this.throughputCapacity;
    }

    public LiteReservationState(
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<Integer> throughputCapacity) {
        this.name = name;
        this.project = project;
        this.region = region;
        this.throughputCapacity = throughputCapacity;
    }

    private LiteReservationState() {
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.throughputCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteReservationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<Integer> throughputCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteReservationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.throughputCapacity = defaults.throughputCapacity;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder throughputCapacity(@Nullable Input<Integer> throughputCapacity) {
            this.throughputCapacity = throughputCapacity;
            return this;
        }

        public Builder throughputCapacity(@Nullable Integer throughputCapacity) {
            this.throughputCapacity = Input.ofNullable(throughputCapacity);
            return this;
        }
        public LiteReservationState build() {
            return new LiteReservationState(name, project, region, throughputCapacity);
        }
    }
}
