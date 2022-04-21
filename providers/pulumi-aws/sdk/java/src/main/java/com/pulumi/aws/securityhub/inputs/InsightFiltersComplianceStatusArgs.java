// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersComplianceStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersComplianceStatusArgs Empty = new InsightFiltersComplianceStatusArgs();

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    @Import(name="comparison", required=true)
    private Output<String> comparison;

    public Output<String> comparison() {
        return this.comparison;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private InsightFiltersComplianceStatusArgs() {}

    private InsightFiltersComplianceStatusArgs(InsightFiltersComplianceStatusArgs $) {
        this.comparison = $.comparison;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersComplianceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersComplianceStatusArgs $;

        public Builder() {
            $ = new InsightFiltersComplianceStatusArgs();
        }

        public Builder(InsightFiltersComplianceStatusArgs defaults) {
            $ = new InsightFiltersComplianceStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder comparison(Output<String> comparison) {
            $.comparison = comparison;
            return this;
        }

        public Builder comparison(String comparison) {
            return comparison(Output.of(comparison));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public InsightFiltersComplianceStatusArgs build() {
            $.comparison = Objects.requireNonNull($.comparison, "expected parameter 'comparison' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
