// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.inputs.Pav2MeterDetailsResponse;
import com.pulumi.azurenative.edgeorder.inputs.PurchaseMeterDetailsResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Holds billing meter details for each type of billing
 * 
 */
public final class BillingMeterDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final BillingMeterDetailsResponse Empty = new BillingMeterDetailsResponse();

    /**
     * Frequency of recurrence
     * 
     */
    @Import(name="frequency", required=true)
    private String frequency;

    public String frequency() {
        return this.frequency;
    }

    /**
     * Represents MeterDetails
     * 
     */
    @Import(name="meterDetails", required=true)
    private Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails;

    public Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails() {
        return this.meterDetails;
    }

    /**
     * Represents Metering type (eg one-time or recurrent)
     * 
     */
    @Import(name="meteringType", required=true)
    private String meteringType;

    public String meteringType() {
        return this.meteringType;
    }

    /**
     * Represents Billing type name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private BillingMeterDetailsResponse() {}

    private BillingMeterDetailsResponse(BillingMeterDetailsResponse $) {
        this.frequency = $.frequency;
        this.meterDetails = $.meterDetails;
        this.meteringType = $.meteringType;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BillingMeterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BillingMeterDetailsResponse $;

        public Builder() {
            $ = new BillingMeterDetailsResponse();
        }

        public Builder(BillingMeterDetailsResponse defaults) {
            $ = new BillingMeterDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder frequency(String frequency) {
            $.frequency = frequency;
            return this;
        }

        public Builder meterDetails(Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails) {
            $.meterDetails = meterDetails;
            return this;
        }

        public Builder meteringType(String meteringType) {
            $.meteringType = meteringType;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public BillingMeterDetailsResponse build() {
            $.frequency = Objects.requireNonNull($.frequency, "expected parameter 'frequency' to be non-null");
            $.meterDetails = Objects.requireNonNull($.meterDetails, "expected parameter 'meterDetails' to be non-null");
            $.meteringType = Objects.requireNonNull($.meteringType, "expected parameter 'meteringType' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
