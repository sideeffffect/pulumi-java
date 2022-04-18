// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.CapacityReservationUtilizationResponse;
import com.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CapacityReservationInstanceViewResponse {
    /**
     * The resource status information.
     * 
     */
    private final @Nullable List<InstanceViewStatusResponse> statuses;
    /**
     * Unutilized capacity of the capacity reservation.
     * 
     */
    private final @Nullable CapacityReservationUtilizationResponse utilizationInfo;

    @CustomType.Constructor
    private CapacityReservationInstanceViewResponse(
        @CustomType.Parameter("statuses") @Nullable List<InstanceViewStatusResponse> statuses,
        @CustomType.Parameter("utilizationInfo") @Nullable CapacityReservationUtilizationResponse utilizationInfo) {
        this.statuses = statuses;
        this.utilizationInfo = utilizationInfo;
    }

    /**
     * The resource status information.
     * 
    */
    public List<InstanceViewStatusResponse> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * Unutilized capacity of the capacity reservation.
     * 
    */
    public Optional<CapacityReservationUtilizationResponse> utilizationInfo() {
        return Optional.ofNullable(this.utilizationInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable CapacityReservationUtilizationResponse utilizationInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statuses = defaults.statuses;
    	      this.utilizationInfo = defaults.utilizationInfo;
        }

        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(InstanceViewStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder utilizationInfo(@Nullable CapacityReservationUtilizationResponse utilizationInfo) {
            this.utilizationInfo = utilizationInfo;
            return this;
        }        public CapacityReservationInstanceViewResponse build() {
            return new CapacityReservationInstanceViewResponse(statuses, utilizationInfo);
        }
    }
}
