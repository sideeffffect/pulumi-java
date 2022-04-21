// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1PeriodResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Renewal settings for renewable Offers.
 * 
 */
public final class GoogleCloudChannelV1RenewalSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1RenewalSettingsResponse Empty = new GoogleCloudChannelV1RenewalSettingsResponse();

    /**
     * If false, the plan will be completed at the end date.
     * 
     */
    @Import(name="enableRenewal", required=true)
    private Boolean enableRenewal;

    public Boolean enableRenewal() {
        return this.enableRenewal;
    }

    /**
     * Describes how frequently the reseller will be billed, such as once per month.
     * 
     */
    @Import(name="paymentCycle", required=true)
    private GoogleCloudChannelV1PeriodResponse paymentCycle;

    public GoogleCloudChannelV1PeriodResponse paymentCycle() {
        return this.paymentCycle;
    }

    /**
     * Describes how a reseller will be billed.
     * 
     */
    @Import(name="paymentPlan", required=true)
    private String paymentPlan;

    public String paymentPlan() {
        return this.paymentPlan;
    }

    /**
     * If true and enable_renewal = true, the unit (for example seats or licenses) will be set to the number of active units at renewal time.
     * 
     */
    @Import(name="resizeUnitCount", required=true)
    private Boolean resizeUnitCount;

    public Boolean resizeUnitCount() {
        return this.resizeUnitCount;
    }

    private GoogleCloudChannelV1RenewalSettingsResponse() {}

    private GoogleCloudChannelV1RenewalSettingsResponse(GoogleCloudChannelV1RenewalSettingsResponse $) {
        this.enableRenewal = $.enableRenewal;
        this.paymentCycle = $.paymentCycle;
        this.paymentPlan = $.paymentPlan;
        this.resizeUnitCount = $.resizeUnitCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudChannelV1RenewalSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1RenewalSettingsResponse $;

        public Builder() {
            $ = new GoogleCloudChannelV1RenewalSettingsResponse();
        }

        public Builder(GoogleCloudChannelV1RenewalSettingsResponse defaults) {
            $ = new GoogleCloudChannelV1RenewalSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder enableRenewal(Boolean enableRenewal) {
            $.enableRenewal = enableRenewal;
            return this;
        }

        public Builder paymentCycle(GoogleCloudChannelV1PeriodResponse paymentCycle) {
            $.paymentCycle = paymentCycle;
            return this;
        }

        public Builder paymentPlan(String paymentPlan) {
            $.paymentPlan = paymentPlan;
            return this;
        }

        public Builder resizeUnitCount(Boolean resizeUnitCount) {
            $.resizeUnitCount = resizeUnitCount;
            return this;
        }

        public GoogleCloudChannelV1RenewalSettingsResponse build() {
            $.enableRenewal = Objects.requireNonNull($.enableRenewal, "expected parameter 'enableRenewal' to be non-null");
            $.paymentCycle = Objects.requireNonNull($.paymentCycle, "expected parameter 'paymentCycle' to be non-null");
            $.paymentPlan = Objects.requireNonNull($.paymentPlan, "expected parameter 'paymentPlan' to be non-null");
            $.resizeUnitCount = Objects.requireNonNull($.resizeUnitCount, "expected parameter 'resizeUnitCount' to be non-null");
            return $;
        }
    }

}
