// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanQuotaSettingsArgs extends ResourceArgs {

    public static final UsagePlanQuotaSettingsArgs Empty = new UsagePlanQuotaSettingsArgs();

    /**
     * The maximum number of requests that users can make within the specified time period.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return The maximum number of requests that users can make within the specified time period.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * For the initial time period, the number of requests to subtract from the specified limit. When you first implement a usage plan, the plan might start in the middle of the week or month. With this property, you can decrease the limit for this initial time period.
     * 
     */
    @Import(name="offset")
    private @Nullable Output<Integer> offset;

    /**
     * @return For the initial time period, the number of requests to subtract from the specified limit. When you first implement a usage plan, the plan might start in the middle of the week or month. With this property, you can decrease the limit for this initial time period.
     * 
     */
    public Optional<Output<Integer>> offset() {
        return Optional.ofNullable(this.offset);
    }

    /**
     * The time period for which the maximum limit of requests applies, such as DAY or WEEK. For valid values, see the period property for the UsagePlan resource in the Amazon API Gateway REST API Reference.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return The time period for which the maximum limit of requests applies, such as DAY or WEEK. For valid values, see the period property for the UsagePlan resource in the Amazon API Gateway REST API Reference.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    private UsagePlanQuotaSettingsArgs() {}

    private UsagePlanQuotaSettingsArgs(UsagePlanQuotaSettingsArgs $) {
        this.limit = $.limit;
        this.offset = $.offset;
        this.period = $.period;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsagePlanQuotaSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsagePlanQuotaSettingsArgs $;

        public Builder() {
            $ = new UsagePlanQuotaSettingsArgs();
        }

        public Builder(UsagePlanQuotaSettingsArgs defaults) {
            $ = new UsagePlanQuotaSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limit The maximum number of requests that users can make within the specified time period.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit The maximum number of requests that users can make within the specified time period.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param offset For the initial time period, the number of requests to subtract from the specified limit. When you first implement a usage plan, the plan might start in the middle of the week or month. With this property, you can decrease the limit for this initial time period.
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Output<Integer> offset) {
            $.offset = offset;
            return this;
        }

        /**
         * @param offset For the initial time period, the number of requests to subtract from the specified limit. When you first implement a usage plan, the plan might start in the middle of the week or month. With this property, you can decrease the limit for this initial time period.
         * 
         * @return builder
         * 
         */
        public Builder offset(Integer offset) {
            return offset(Output.of(offset));
        }

        /**
         * @param period The time period for which the maximum limit of requests applies, such as DAY or WEEK. For valid values, see the period property for the UsagePlan resource in the Amazon API Gateway REST API Reference.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The time period for which the maximum limit of requests applies, such as DAY or WEEK. For valid values, see the period property for the UsagePlan resource in the Amazon API Gateway REST API Reference.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        public UsagePlanQuotaSettingsArgs build() {
            return $;
        }
    }

}
