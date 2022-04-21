// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.enums.SparkChartViewSparkChartType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A sparkChart is a small chart suitable for inclusion in a table-cell or inline in text. This message contains the configuration for a sparkChart to show up on a Scorecard, showing recent trends of the scorecard&#39;s timeseries.
 * 
 */
public final class SparkChartViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkChartViewArgs Empty = new SparkChartViewArgs();

    /**
     * The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    @Import(name="minAlignmentPeriod")
    private @Nullable Output<String> minAlignmentPeriod;

    public Optional<Output<String>> minAlignmentPeriod() {
        return Optional.ofNullable(this.minAlignmentPeriod);
    }

    /**
     * The type of sparkchart to show in this chartView.
     * 
     */
    @Import(name="sparkChartType", required=true)
    private Output<SparkChartViewSparkChartType> sparkChartType;

    public Output<SparkChartViewSparkChartType> sparkChartType() {
        return this.sparkChartType;
    }

    private SparkChartViewArgs() {}

    private SparkChartViewArgs(SparkChartViewArgs $) {
        this.minAlignmentPeriod = $.minAlignmentPeriod;
        this.sparkChartType = $.sparkChartType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkChartViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkChartViewArgs $;

        public Builder() {
            $ = new SparkChartViewArgs();
        }

        public Builder(SparkChartViewArgs defaults) {
            $ = new SparkChartViewArgs(Objects.requireNonNull(defaults));
        }

        public Builder minAlignmentPeriod(@Nullable Output<String> minAlignmentPeriod) {
            $.minAlignmentPeriod = minAlignmentPeriod;
            return this;
        }

        public Builder minAlignmentPeriod(String minAlignmentPeriod) {
            return minAlignmentPeriod(Output.of(minAlignmentPeriod));
        }

        public Builder sparkChartType(Output<SparkChartViewSparkChartType> sparkChartType) {
            $.sparkChartType = sparkChartType;
            return this;
        }

        public Builder sparkChartType(SparkChartViewSparkChartType sparkChartType) {
            return sparkChartType(Output.of(sparkChartType));
        }

        public SparkChartViewArgs build() {
            $.sparkChartType = Objects.requireNonNull($.sparkChartType, "expected parameter 'sparkChartType' to be non-null");
            return $;
        }
    }

}
