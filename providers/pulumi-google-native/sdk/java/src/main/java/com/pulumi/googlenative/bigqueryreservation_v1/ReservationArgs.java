// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryreservation_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    @Import(name="ignoreIdleSlots")
    private @Nullable Output<Boolean> ignoreIdleSlots;

    public Optional<Output<Boolean>> ignoreIdleSlots() {
        return Optional.ofNullable(this.ignoreIdleSlots);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="reservationId")
    private @Nullable Output<String> reservationId;

    public Optional<Output<String>> reservationId() {
        return Optional.ofNullable(this.reservationId);
    }

    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation&#39;s slot capacity exceed the project&#39;s slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project&#39;s slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    @Import(name="slotCapacity")
    private @Nullable Output<String> slotCapacity;

    public Optional<Output<String>> slotCapacity() {
        return Optional.ofNullable(this.slotCapacity);
    }

    private ReservationArgs() {}

    private ReservationArgs(ReservationArgs $) {
        this.ignoreIdleSlots = $.ignoreIdleSlots;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.reservationId = $.reservationId;
        this.slotCapacity = $.slotCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationArgs $;

        public Builder() {
            $ = new ReservationArgs();
        }

        public Builder(ReservationArgs defaults) {
            $ = new ReservationArgs(Objects.requireNonNull(defaults));
        }

        public Builder ignoreIdleSlots(@Nullable Output<Boolean> ignoreIdleSlots) {
            $.ignoreIdleSlots = ignoreIdleSlots;
            return this;
        }

        public Builder ignoreIdleSlots(Boolean ignoreIdleSlots) {
            return ignoreIdleSlots(Output.of(ignoreIdleSlots));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder reservationId(@Nullable Output<String> reservationId) {
            $.reservationId = reservationId;
            return this;
        }

        public Builder reservationId(String reservationId) {
            return reservationId(Output.of(reservationId));
        }

        public Builder slotCapacity(@Nullable Output<String> slotCapacity) {
            $.slotCapacity = slotCapacity;
            return this;
        }

        public Builder slotCapacity(String slotCapacity) {
            return slotCapacity(Output.of(slotCapacity));
        }

        public ReservationArgs build() {
            return $;
        }
    }

}
