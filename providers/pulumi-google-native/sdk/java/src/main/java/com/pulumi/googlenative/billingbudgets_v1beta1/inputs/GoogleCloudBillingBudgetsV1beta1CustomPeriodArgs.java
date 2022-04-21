// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.billingbudgets_v1beta1.inputs.GoogleTypeDateArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * All date times begin at 12 AM US and Canadian Pacific Time (UTC-8).
 * 
 */
public final class GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs Empty = new GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs();

    /**
     * Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
     */
    @Import(name="endDate")
    private @Nullable Output<GoogleTypeDateArgs> endDate;

    public Optional<Output<GoogleTypeDateArgs>> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    /**
     * The start date must be after January 1, 2017.
     * 
     */
    @Import(name="startDate", required=true)
    private Output<GoogleTypeDateArgs> startDate;

    public Output<GoogleTypeDateArgs> startDate() {
        return this.startDate;
    }

    private GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs() {}

    private GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs(GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs $) {
        this.endDate = $.endDate;
        this.startDate = $.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs $;

        public Builder() {
            $ = new GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs();
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs defaults) {
            $ = new GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs(Objects.requireNonNull(defaults));
        }

        public Builder endDate(@Nullable Output<GoogleTypeDateArgs> endDate) {
            $.endDate = endDate;
            return this;
        }

        public Builder endDate(GoogleTypeDateArgs endDate) {
            return endDate(Output.of(endDate));
        }

        public Builder startDate(Output<GoogleTypeDateArgs> startDate) {
            $.startDate = startDate;
            return this;
        }

        public Builder startDate(GoogleTypeDateArgs startDate) {
            return startDate(Output.of(startDate));
        }

        public GoogleCloudBillingBudgetsV1beta1CustomPeriodArgs build() {
            $.startDate = Objects.requireNonNull($.startDate, "expected parameter 'startDate' to be non-null");
            return $;
        }
    }

}
