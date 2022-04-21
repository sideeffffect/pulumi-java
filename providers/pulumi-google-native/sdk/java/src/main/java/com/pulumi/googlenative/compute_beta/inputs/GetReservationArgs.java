// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReservationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReservationArgs Empty = new GetReservationArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="reservation", required=true)
    private String reservation;

    public String reservation() {
        return this.reservation;
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetReservationArgs() {}

    private GetReservationArgs(GetReservationArgs $) {
        this.project = $.project;
        this.reservation = $.reservation;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReservationArgs $;

        public Builder() {
            $ = new GetReservationArgs();
        }

        public Builder(GetReservationArgs defaults) {
            $ = new GetReservationArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder reservation(String reservation) {
            $.reservation = reservation;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetReservationArgs build() {
            $.reservation = Objects.requireNonNull($.reservation, "expected parameter 'reservation' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
