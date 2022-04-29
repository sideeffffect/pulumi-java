// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetCapacityReservationFleetArgs extends InvokeArgs {

    public static final GetCapacityReservationFleetArgs Empty = new GetCapacityReservationFleetArgs();

    @Import(name="capacityReservationFleetId", required=true)
    private String capacityReservationFleetId;

    public String capacityReservationFleetId() {
        return this.capacityReservationFleetId;
    }

    private GetCapacityReservationFleetArgs() {}

    private GetCapacityReservationFleetArgs(GetCapacityReservationFleetArgs $) {
        this.capacityReservationFleetId = $.capacityReservationFleetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCapacityReservationFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCapacityReservationFleetArgs $;

        public Builder() {
            $ = new GetCapacityReservationFleetArgs();
        }

        public Builder(GetCapacityReservationFleetArgs defaults) {
            $ = new GetCapacityReservationFleetArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityReservationFleetId(String capacityReservationFleetId) {
            $.capacityReservationFleetId = capacityReservationFleetId;
            return this;
        }

        public GetCapacityReservationFleetArgs build() {
            $.capacityReservationFleetId = Objects.requireNonNull($.capacityReservationFleetId, "expected parameter 'capacityReservationFleetId' to be non-null");
            return $;
        }
    }

}
