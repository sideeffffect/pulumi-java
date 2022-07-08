// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets.v1.inputs;




/**
 * Describes a budget amount targeted to the last Filter.calendar_period spend. At this time, the amount is automatically 100% of the last calendar period&#39;s spend; that is, there are no other options yet. LastPeriodAmount cannot be set for a budget configured with a Filter.custom_period.
 * 
 */
public final class GoogleCloudBillingBudgetsV1LastPeriodAmountArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1LastPeriodAmountArgs Empty = new GoogleCloudBillingBudgetsV1LastPeriodAmountArgs();

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1LastPeriodAmountArgs $;

        public Builder() {
            $ = new GoogleCloudBillingBudgetsV1LastPeriodAmountArgs();
        }
        public GoogleCloudBillingBudgetsV1LastPeriodAmountArgs build() {
            return $;
        }
    }

}
