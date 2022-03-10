// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.AllocationSpecificSKUReservationArgs;
import io.pulumi.googlenative.compute_v1.inputs.ShareSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a reservation resource. A reservation ensures that capacity is held in a specific zone even if the reserved VMs are not running. For more information, read Reserving zonal resources.
 * 
 */
public final class ReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Share-settings for shared-reservation
     * 
     */
    @InputImport(name="shareSettings")
      private final @Nullable Input<ShareSettingsArgs> shareSettings;

    public Input<ShareSettingsArgs> getShareSettings() {
        return this.shareSettings == null ? Input.empty() : this.shareSettings;
    }

    /**
     * Reservation for instances with specific machine shapes.
     * 
     */
    @InputImport(name="specificReservation")
      private final @Nullable Input<AllocationSpecificSKUReservationArgs> specificReservation;

    public Input<AllocationSpecificSKUReservationArgs> getSpecificReservation() {
        return this.specificReservation == null ? Input.empty() : this.specificReservation;
    }

    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    @InputImport(name="specificReservationRequired")
      private final @Nullable Input<Boolean> specificReservationRequired;

    public Input<Boolean> getSpecificReservationRequired() {
        return this.specificReservationRequired == null ? Input.empty() : this.specificReservationRequired;
    }

    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public ReservationArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<ShareSettingsArgs> shareSettings,
        @Nullable Input<AllocationSpecificSKUReservationArgs> specificReservation,
        @Nullable Input<Boolean> specificReservationRequired,
        @Nullable Input<String> zone) {
        this.description = description;
        this.name = name;
        this.shareSettings = shareSettings;
        this.specificReservation = specificReservation;
        this.specificReservationRequired = specificReservationRequired;
        this.zone = zone;
    }

    private ReservationArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.shareSettings = Input.empty();
        this.specificReservation = Input.empty();
        this.specificReservationRequired = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<ShareSettingsArgs> shareSettings;
        private @Nullable Input<AllocationSpecificSKUReservationArgs> specificReservation;
        private @Nullable Input<Boolean> specificReservationRequired;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.zone = defaults.zone;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder shareSettings(@Nullable Input<ShareSettingsArgs> shareSettings) {
            this.shareSettings = shareSettings;
            return this;
        }

        public Builder shareSettings(@Nullable ShareSettingsArgs shareSettings) {
            this.shareSettings = Input.ofNullable(shareSettings);
            return this;
        }

        public Builder specificReservation(@Nullable Input<AllocationSpecificSKUReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }

        public Builder specificReservation(@Nullable AllocationSpecificSKUReservationArgs specificReservation) {
            this.specificReservation = Input.ofNullable(specificReservation);
            return this;
        }

        public Builder specificReservationRequired(@Nullable Input<Boolean> specificReservationRequired) {
            this.specificReservationRequired = specificReservationRequired;
            return this;
        }

        public Builder specificReservationRequired(@Nullable Boolean specificReservationRequired) {
            this.specificReservationRequired = Input.ofNullable(specificReservationRequired);
            return this;
        }

        public Builder zone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public ReservationArgs build() {
            return new ReservationArgs(description, name, shareSettings, specificReservation, specificReservationRequired, zone);
        }
    }
}
