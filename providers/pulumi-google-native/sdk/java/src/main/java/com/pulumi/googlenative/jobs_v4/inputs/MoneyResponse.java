// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an amount of money with its currency type.
 * 
 */
public final class MoneyResponse extends com.pulumi.resources.InvokeArgs {

    public static final MoneyResponse Empty = new MoneyResponse();

    /**
     * The three-letter currency code defined in ISO 4217.
     * 
     */
    @Import(name="currencyCode", required=true)
    private String currencyCode;

    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * 
     */
    @Import(name="nanos", required=true)
    private Integer nanos;

    public Integer nanos() {
        return this.nanos;
    }

    /**
     * The whole units of the amount. For example if `currencyCode` is `&#34;USD&#34;`, then 1 unit is one US dollar.
     * 
     */
    @Import(name="units", required=true)
    private String units;

    public String units() {
        return this.units;
    }

    private MoneyResponse() {}

    private MoneyResponse(MoneyResponse $) {
        this.currencyCode = $.currencyCode;
        this.nanos = $.nanos;
        this.units = $.units;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MoneyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoneyResponse $;

        public Builder() {
            $ = new MoneyResponse();
        }

        public Builder(MoneyResponse defaults) {
            $ = new MoneyResponse(Objects.requireNonNull(defaults));
        }

        public Builder currencyCode(String currencyCode) {
            $.currencyCode = currencyCode;
            return this;
        }

        public Builder nanos(Integer nanos) {
            $.nanos = nanos;
            return this;
        }

        public Builder units(String units) {
            $.units = units;
            return this;
        }

        public MoneyResponse build() {
            $.currencyCode = Objects.requireNonNull($.currencyCode, "expected parameter 'currencyCode' to be non-null");
            $.nanos = Objects.requireNonNull($.nanos, "expected parameter 'nanos' to be non-null");
            $.units = Objects.requireNonNull($.units, "expected parameter 'units' to be non-null");
            return $;
        }
    }

}
