// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information of estimated or observed impact on various metrics for an Azure SQL Database, Server or Elastic Pool Recommended Action.
 * 
 */
public final class RecommendedActionImpactRecordResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecommendedActionImpactRecordResponse Empty = new RecommendedActionImpactRecordResponse();

    /**
     * Gets the absolute value of this dimension if applicable. e.g., Number of Queries affected
     * 
     */
    @Import(name="absoluteValue", required=true)
    private Double absoluteValue;

    public Double absoluteValue() {
        return this.absoluteValue;
    }

    /**
     * Gets the absolute change in the value of this dimension. e.g., Absolute Disk space change in Megabytes
     * 
     */
    @Import(name="changeValueAbsolute", required=true)
    private Double changeValueAbsolute;

    public Double changeValueAbsolute() {
        return this.changeValueAbsolute;
    }

    /**
     * Gets the relative change in the value of this dimension. e.g., Relative Disk space change in Percentage
     * 
     */
    @Import(name="changeValueRelative", required=true)
    private Double changeValueRelative;

    public Double changeValueRelative() {
        return this.changeValueRelative;
    }

    /**
     * Gets the name of the impact dimension. e.g., CPUChange, DiskSpaceChange, NumberOfQueriesAffected.
     * 
     */
    @Import(name="dimensionName", required=true)
    private String dimensionName;

    public String dimensionName() {
        return this.dimensionName;
    }

    /**
     * Gets the name of the impact dimension. e.g., CPUChange, DiskSpaceChange, NumberOfQueriesAffected.
     * 
     */
    @Import(name="unit", required=true)
    private String unit;

    public String unit() {
        return this.unit;
    }

    private RecommendedActionImpactRecordResponse() {}

    private RecommendedActionImpactRecordResponse(RecommendedActionImpactRecordResponse $) {
        this.absoluteValue = $.absoluteValue;
        this.changeValueAbsolute = $.changeValueAbsolute;
        this.changeValueRelative = $.changeValueRelative;
        this.dimensionName = $.dimensionName;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecommendedActionImpactRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecommendedActionImpactRecordResponse $;

        public Builder() {
            $ = new RecommendedActionImpactRecordResponse();
        }

        public Builder(RecommendedActionImpactRecordResponse defaults) {
            $ = new RecommendedActionImpactRecordResponse(Objects.requireNonNull(defaults));
        }

        public Builder absoluteValue(Double absoluteValue) {
            $.absoluteValue = absoluteValue;
            return this;
        }

        public Builder changeValueAbsolute(Double changeValueAbsolute) {
            $.changeValueAbsolute = changeValueAbsolute;
            return this;
        }

        public Builder changeValueRelative(Double changeValueRelative) {
            $.changeValueRelative = changeValueRelative;
            return this;
        }

        public Builder dimensionName(String dimensionName) {
            $.dimensionName = dimensionName;
            return this;
        }

        public Builder unit(String unit) {
            $.unit = unit;
            return this;
        }

        public RecommendedActionImpactRecordResponse build() {
            $.absoluteValue = Objects.requireNonNull($.absoluteValue, "expected parameter 'absoluteValue' to be non-null");
            $.changeValueAbsolute = Objects.requireNonNull($.changeValueAbsolute, "expected parameter 'changeValueAbsolute' to be non-null");
            $.changeValueRelative = Objects.requireNonNull($.changeValueRelative, "expected parameter 'changeValueRelative' to be non-null");
            $.dimensionName = Objects.requireNonNull($.dimensionName, "expected parameter 'dimensionName' to be non-null");
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            return $;
        }
    }

}
