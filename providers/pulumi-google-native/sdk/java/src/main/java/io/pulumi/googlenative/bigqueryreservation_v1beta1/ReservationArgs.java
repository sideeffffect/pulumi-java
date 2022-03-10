// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    @InputImport(name="ignoreIdleSlots")
      private final @Nullable Input<Boolean> ignoreIdleSlots;

    public Input<Boolean> getIgnoreIdleSlots() {
        return this.ignoreIdleSlots == null ? Input.empty() : this.ignoreIdleSlots;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="reservationId")
      private final @Nullable Input<String> reservationId;

    public Input<String> getReservationId() {
        return this.reservationId == null ? Input.empty() : this.reservationId;
    }

    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation's slot capacity exceed the project's slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    @InputImport(name="slotCapacity")
      private final @Nullable Input<String> slotCapacity;

    public Input<String> getSlotCapacity() {
        return this.slotCapacity == null ? Input.empty() : this.slotCapacity;
    }

    public ReservationArgs(
        @Nullable Input<Boolean> ignoreIdleSlots,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> reservationId,
        @Nullable Input<String> slotCapacity) {
        this.ignoreIdleSlots = ignoreIdleSlots;
        this.location = location;
        this.name = name;
        this.project = project;
        this.reservationId = reservationId;
        this.slotCapacity = slotCapacity;
    }

    private ReservationArgs() {
        this.ignoreIdleSlots = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.reservationId = Input.empty();
        this.slotCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> ignoreIdleSlots;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> reservationId;
        private @Nullable Input<String> slotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreIdleSlots = defaults.ignoreIdleSlots;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.reservationId = defaults.reservationId;
    	      this.slotCapacity = defaults.slotCapacity;
        }

        public Builder ignoreIdleSlots(@Nullable Input<Boolean> ignoreIdleSlots) {
            this.ignoreIdleSlots = ignoreIdleSlots;
            return this;
        }

        public Builder ignoreIdleSlots(@Nullable Boolean ignoreIdleSlots) {
            this.ignoreIdleSlots = Input.ofNullable(ignoreIdleSlots);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
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

        public Builder reservationId(@Nullable Input<String> reservationId) {
            this.reservationId = reservationId;
            return this;
        }

        public Builder reservationId(@Nullable String reservationId) {
            this.reservationId = Input.ofNullable(reservationId);
            return this;
        }

        public Builder slotCapacity(@Nullable Input<String> slotCapacity) {
            this.slotCapacity = slotCapacity;
            return this;
        }

        public Builder slotCapacity(@Nullable String slotCapacity) {
            this.slotCapacity = Input.ofNullable(slotCapacity);
            return this;
        }
        public ReservationArgs build() {
            return new ReservationArgs(ignoreIdleSlots, location, name, project, reservationId, slotCapacity);
        }
    }
}
