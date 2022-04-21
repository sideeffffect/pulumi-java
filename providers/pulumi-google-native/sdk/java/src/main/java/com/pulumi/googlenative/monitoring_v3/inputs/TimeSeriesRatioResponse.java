// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A TimeSeriesRatio specifies two TimeSeries to use for computing the good_service / total_service ratio. The specified TimeSeries must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE. The TimeSeriesRatio must specify exactly two of good, bad, and total, and the relationship good_service + bad_service = total_service will be assumed.
 * 
 */
public final class TimeSeriesRatioResponse extends com.pulumi.resources.InvokeArgs {

    public static final TimeSeriesRatioResponse Empty = new TimeSeriesRatioResponse();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="badServiceFilter", required=true)
    private String badServiceFilter;

    public String badServiceFilter() {
        return this.badServiceFilter;
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="goodServiceFilter", required=true)
    private String goodServiceFilter;

    public String goodServiceFilter() {
        return this.goodServiceFilter;
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="totalServiceFilter", required=true)
    private String totalServiceFilter;

    public String totalServiceFilter() {
        return this.totalServiceFilter;
    }

    private TimeSeriesRatioResponse() {}

    private TimeSeriesRatioResponse(TimeSeriesRatioResponse $) {
        this.badServiceFilter = $.badServiceFilter;
        this.goodServiceFilter = $.goodServiceFilter;
        this.totalServiceFilter = $.totalServiceFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesRatioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesRatioResponse $;

        public Builder() {
            $ = new TimeSeriesRatioResponse();
        }

        public Builder(TimeSeriesRatioResponse defaults) {
            $ = new TimeSeriesRatioResponse(Objects.requireNonNull(defaults));
        }

        public Builder badServiceFilter(String badServiceFilter) {
            $.badServiceFilter = badServiceFilter;
            return this;
        }

        public Builder goodServiceFilter(String goodServiceFilter) {
            $.goodServiceFilter = goodServiceFilter;
            return this;
        }

        public Builder totalServiceFilter(String totalServiceFilter) {
            $.totalServiceFilter = totalServiceFilter;
            return this;
        }

        public TimeSeriesRatioResponse build() {
            $.badServiceFilter = Objects.requireNonNull($.badServiceFilter, "expected parameter 'badServiceFilter' to be non-null");
            $.goodServiceFilter = Objects.requireNonNull($.goodServiceFilter, "expected parameter 'goodServiceFilter' to be non-null");
            $.totalServiceFilter = Objects.requireNonNull($.totalServiceFilter, "expected parameter 'totalServiceFilter' to be non-null");
            return $;
        }
    }

}
