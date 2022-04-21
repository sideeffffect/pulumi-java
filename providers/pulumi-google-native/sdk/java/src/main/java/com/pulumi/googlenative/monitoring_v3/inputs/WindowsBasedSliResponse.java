// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.inputs.MetricRangeResponse;
import com.pulumi.googlenative.monitoring_v3.inputs.PerformanceThresholdResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A WindowsBasedSli defines good_service as the count of time windows for which the provided service was of good quality. Criteria for determining if service was good are embedded in the window_criterion.
 * 
 */
public final class WindowsBasedSliResponse extends com.pulumi.resources.InvokeArgs {

    public static final WindowsBasedSliResponse Empty = new WindowsBasedSliResponse();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
     * 
     */
    @Import(name="goodBadMetricFilter", required=true)
    private String goodBadMetricFilter;

    public String goodBadMetricFilter() {
        return this.goodBadMetricFilter;
    }

    /**
     * A window is good if its performance is high enough.
     * 
     */
    @Import(name="goodTotalRatioThreshold", required=true)
    private PerformanceThresholdResponse goodTotalRatioThreshold;

    public PerformanceThresholdResponse goodTotalRatioThreshold() {
        return this.goodTotalRatioThreshold;
    }

    /**
     * A window is good if the metric&#39;s value is in a good range, averaged across returned streams.
     * 
     */
    @Import(name="metricMeanInRange", required=true)
    private MetricRangeResponse metricMeanInRange;

    public MetricRangeResponse metricMeanInRange() {
        return this.metricMeanInRange;
    }

    /**
     * A window is good if the metric&#39;s value is in a good range, summed across returned streams.
     * 
     */
    @Import(name="metricSumInRange", required=true)
    private MetricRangeResponse metricSumInRange;

    public MetricRangeResponse metricSumInRange() {
        return this.metricSumInRange;
    }

    /**
     * Duration over which window quality is evaluated. Must be an integer fraction of a day and at least 60s.
     * 
     */
    @Import(name="windowPeriod", required=true)
    private String windowPeriod;

    public String windowPeriod() {
        return this.windowPeriod;
    }

    private WindowsBasedSliResponse() {}

    private WindowsBasedSliResponse(WindowsBasedSliResponse $) {
        this.goodBadMetricFilter = $.goodBadMetricFilter;
        this.goodTotalRatioThreshold = $.goodTotalRatioThreshold;
        this.metricMeanInRange = $.metricMeanInRange;
        this.metricSumInRange = $.metricSumInRange;
        this.windowPeriod = $.windowPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsBasedSliResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsBasedSliResponse $;

        public Builder() {
            $ = new WindowsBasedSliResponse();
        }

        public Builder(WindowsBasedSliResponse defaults) {
            $ = new WindowsBasedSliResponse(Objects.requireNonNull(defaults));
        }

        public Builder goodBadMetricFilter(String goodBadMetricFilter) {
            $.goodBadMetricFilter = goodBadMetricFilter;
            return this;
        }

        public Builder goodTotalRatioThreshold(PerformanceThresholdResponse goodTotalRatioThreshold) {
            $.goodTotalRatioThreshold = goodTotalRatioThreshold;
            return this;
        }

        public Builder metricMeanInRange(MetricRangeResponse metricMeanInRange) {
            $.metricMeanInRange = metricMeanInRange;
            return this;
        }

        public Builder metricSumInRange(MetricRangeResponse metricSumInRange) {
            $.metricSumInRange = metricSumInRange;
            return this;
        }

        public Builder windowPeriod(String windowPeriod) {
            $.windowPeriod = windowPeriod;
            return this;
        }

        public WindowsBasedSliResponse build() {
            $.goodBadMetricFilter = Objects.requireNonNull($.goodBadMetricFilter, "expected parameter 'goodBadMetricFilter' to be non-null");
            $.goodTotalRatioThreshold = Objects.requireNonNull($.goodTotalRatioThreshold, "expected parameter 'goodTotalRatioThreshold' to be non-null");
            $.metricMeanInRange = Objects.requireNonNull($.metricMeanInRange, "expected parameter 'metricMeanInRange' to be non-null");
            $.metricSumInRange = Objects.requireNonNull($.metricSumInRange, "expected parameter 'metricSumInRange' to be non-null");
            $.windowPeriod = Objects.requireNonNull($.windowPeriod, "expected parameter 'windowPeriod' to be non-null");
            return $;
        }
    }

}
