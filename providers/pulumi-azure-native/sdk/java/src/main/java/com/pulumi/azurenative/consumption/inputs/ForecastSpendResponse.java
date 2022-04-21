// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.consumption.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * The forecasted cost which is being tracked for a budget.
 * 
 */
public final class ForecastSpendResponse extends com.pulumi.resources.InvokeArgs {

    public static final ForecastSpendResponse Empty = new ForecastSpendResponse();

    /**
     * The forecasted cost for the total time period which is being tracked by the budget. This value is only provided if the budget contains a forecast alert type.
     * 
     */
    @Import(name="amount", required=true)
    private Double amount;

    public Double amount() {
        return this.amount;
    }

    /**
     * The unit of measure for the budget amount.
     * 
     */
    @Import(name="unit", required=true)
    private String unit;

    public String unit() {
        return this.unit;
    }

    private ForecastSpendResponse() {}

    private ForecastSpendResponse(ForecastSpendResponse $) {
        this.amount = $.amount;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForecastSpendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForecastSpendResponse $;

        public Builder() {
            $ = new ForecastSpendResponse();
        }

        public Builder(ForecastSpendResponse defaults) {
            $ = new ForecastSpendResponse(Objects.requireNonNull(defaults));
        }

        public Builder amount(Double amount) {
            $.amount = amount;
            return this;
        }

        public Builder unit(String unit) {
            $.unit = unit;
            return this;
        }

        public ForecastSpendResponse build() {
            $.amount = Objects.requireNonNull($.amount, "expected parameter 'amount' to be non-null");
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            return $;
        }
    }

}
