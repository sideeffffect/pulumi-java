// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs extends ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs();

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="distributionFilter", required=true)
    private Output<String> distributionFilter;

    /**
     * @return A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Output<String> distributionFilter() {
        return this.distributionFilter;
    }

    /**
     * Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min &lt;= x &lt;= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max. Summed value `X` should satisfy
     * `range.min &lt;= X &lt;= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    @Import(name="range", required=true)
    private Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs> range;

    /**
     * @return Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min &lt;= x &lt;= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max. Summed value `X` should satisfy
     * `range.min &lt;= X &lt;= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    public Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs> range() {
        return this.range;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs() {}

    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs $) {
        this.distributionFilter = $.distributionFilter;
        this.range = $.range;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs $;

        public Builder() {
            $ = new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs();
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs defaults) {
            $ = new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distributionFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * aggregating values to quantify the good service provided.
         * Must have ValueType = DISTRIBUTION and
         * MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder distributionFilter(Output<String> distributionFilter) {
            $.distributionFilter = distributionFilter;
            return this;
        }

        /**
         * @param distributionFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * aggregating values to quantify the good service provided.
         * Must have ValueType = DISTRIBUTION and
         * MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder distributionFilter(String distributionFilter) {
            return distributionFilter(Output.of(distributionFilter));
        }

        /**
         * @param range Range of numerical values. The computed good_service
         * will be the count of values x in the Distribution such
         * that range.min &lt;= x &lt;= range.max. inclusive of min and
         * max. Open ranges can be defined by setting
         * just one of min or max. Summed value `X` should satisfy
         * `range.min &lt;= X &lt;= range.max` for a good window.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder range(Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range Range of numerical values. The computed good_service
         * will be the count of values x in the Distribution such
         * that range.min &lt;= x &lt;= range.max. inclusive of min and
         * max. Open ranges can be defined by setting
         * just one of min or max. Summed value `X` should satisfy
         * `range.min &lt;= X &lt;= range.max` for a good window.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder range(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs range) {
            return range(Output.of(range));
        }

        public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs build() {
            $.distributionFilter = Objects.requireNonNull($.distributionFilter, "expected parameter 'distributionFilter' to be non-null");
            $.range = Objects.requireNonNull($.range, "expected parameter 'range' to be non-null");
            return $;
        }
    }

}
