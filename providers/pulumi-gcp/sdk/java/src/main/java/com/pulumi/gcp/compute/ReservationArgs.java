// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs;
import com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationArgs extends ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The share setting for reservations.
     * Structure is documented below.
     * 
     */
    @Import(name="shareSettings")
    private @Nullable Output<ReservationShareSettingsArgs> shareSettings;

    /**
     * @return The share setting for reservations.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ReservationShareSettingsArgs>> shareSettings() {
        return Optional.ofNullable(this.shareSettings);
    }

    /**
     * Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    @Import(name="specificReservation", required=true)
    private Output<ReservationSpecificReservationArgs> specificReservation;

    /**
     * @return Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    public Output<ReservationSpecificReservationArgs> specificReservation() {
        return this.specificReservation;
    }

    /**
     * When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    @Import(name="specificReservationRequired")
    private @Nullable Output<Boolean> specificReservationRequired;

    /**
     * @return When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> specificReservationRequired() {
        return Optional.ofNullable(this.specificReservationRequired);
    }

    /**
     * The zone where the reservation is made.
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return The zone where the reservation is made.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private ReservationArgs() {}

    private ReservationArgs(ReservationArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.shareSettings = $.shareSettings;
        this.specificReservation = $.specificReservation;
        this.specificReservationRequired = $.specificReservationRequired;
        this.zone = $.zone;
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

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param shareSettings The share setting for reservations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(@Nullable Output<ReservationShareSettingsArgs> shareSettings) {
            $.shareSettings = shareSettings;
            return this;
        }

        /**
         * @param shareSettings The share setting for reservations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(ReservationShareSettingsArgs shareSettings) {
            return shareSettings(Output.of(shareSettings));
        }

        /**
         * @param specificReservation Reservation for instances with specific machine shapes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder specificReservation(Output<ReservationSpecificReservationArgs> specificReservation) {
            $.specificReservation = specificReservation;
            return this;
        }

        /**
         * @param specificReservation Reservation for instances with specific machine shapes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder specificReservation(ReservationSpecificReservationArgs specificReservation) {
            return specificReservation(Output.of(specificReservation));
        }

        /**
         * @param specificReservationRequired When set to true, only VMs that target this reservation by name can
         * consume this reservation. Otherwise, it can be consumed by VMs with
         * affinity for any reservation. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder specificReservationRequired(@Nullable Output<Boolean> specificReservationRequired) {
            $.specificReservationRequired = specificReservationRequired;
            return this;
        }

        /**
         * @param specificReservationRequired When set to true, only VMs that target this reservation by name can
         * consume this reservation. Otherwise, it can be consumed by VMs with
         * affinity for any reservation. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder specificReservationRequired(Boolean specificReservationRequired) {
            return specificReservationRequired(Output.of(specificReservationRequired));
        }

        /**
         * @param zone The zone where the reservation is made.
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone where the reservation is made.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ReservationArgs build() {
            $.specificReservation = Objects.requireNonNull($.specificReservation, "expected parameter 'specificReservation' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
