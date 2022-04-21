// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryreservation_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReservationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReservationArgs Empty = new GetReservationArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="reservationId", required=true)
    private String reservationId;

    public String reservationId() {
        return this.reservationId;
    }

    private GetReservationArgs() {}

    private GetReservationArgs(GetReservationArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.reservationId = $.reservationId;
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

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder reservationId(String reservationId) {
            $.reservationId = reservationId;
            return this;
        }

        public GetReservationArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.reservationId = Objects.requireNonNull($.reservationId, "expected parameter 'reservationId' to be non-null");
            return $;
        }
    }

}
