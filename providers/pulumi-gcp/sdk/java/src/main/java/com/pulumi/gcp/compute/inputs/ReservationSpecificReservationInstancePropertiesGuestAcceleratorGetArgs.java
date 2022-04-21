// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs Empty = new ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs();

    /**
     * The number of the guest accelerator cards exposed to
     * this instance.
     * 
     */
    @Import(name="acceleratorCount", required=true)
    private Output<Integer> acceleratorCount;

    public Output<Integer> acceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * The full or partial URL of the accelerator type to
     * attach to this instance. For example:
     * `projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100`
     * If you are creating an instance template, specify only the accelerator name.
     * 
     */
    @Import(name="acceleratorType", required=true)
    private Output<String> acceleratorType;

    public Output<String> acceleratorType() {
        return this.acceleratorType;
    }

    private ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs() {}

    private ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs(ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs $) {
        this.acceleratorCount = $.acceleratorCount;
        this.acceleratorType = $.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs $;

        public Builder() {
            $ = new ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs();
        }

        public Builder(ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs defaults) {
            $ = new ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorCount(Output<Integer> acceleratorCount) {
            $.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder acceleratorCount(Integer acceleratorCount) {
            return acceleratorCount(Output.of(acceleratorCount));
        }

        public Builder acceleratorType(Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs build() {
            $.acceleratorCount = Objects.requireNonNull($.acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
            $.acceleratorType = Objects.requireNonNull($.acceleratorType, "expected parameter 'acceleratorType' to be non-null");
            return $;
        }
    }

}
