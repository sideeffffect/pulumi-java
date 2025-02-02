// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A TimeSeriesRatio specifies two TimeSeries to use for computing the good_service / total_service ratio. The specified TimeSeries must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE. The TimeSeriesRatio must specify exactly two of good, bad, and total, and the relationship good_service + bad_service = total_service will be assumed.
 * 
 */
public final class TimeSeriesRatioArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeSeriesRatioArgs Empty = new TimeSeriesRatioArgs();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="badServiceFilter")
    private @Nullable Output<String> badServiceFilter;

    /**
     * @return A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Optional<Output<String>> badServiceFilter() {
        return Optional.ofNullable(this.badServiceFilter);
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="goodServiceFilter")
    private @Nullable Output<String> goodServiceFilter;

    /**
     * @return A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Optional<Output<String>> goodServiceFilter() {
        return Optional.ofNullable(this.goodServiceFilter);
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="totalServiceFilter")
    private @Nullable Output<String> totalServiceFilter;

    /**
     * @return A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Optional<Output<String>> totalServiceFilter() {
        return Optional.ofNullable(this.totalServiceFilter);
    }

    private TimeSeriesRatioArgs() {}

    private TimeSeriesRatioArgs(TimeSeriesRatioArgs $) {
        this.badServiceFilter = $.badServiceFilter;
        this.goodServiceFilter = $.goodServiceFilter;
        this.totalServiceFilter = $.totalServiceFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesRatioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesRatioArgs $;

        public Builder() {
            $ = new TimeSeriesRatioArgs();
        }

        public Builder(TimeSeriesRatioArgs defaults) {
            $ = new TimeSeriesRatioArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param badServiceFilter A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder badServiceFilter(@Nullable Output<String> badServiceFilter) {
            $.badServiceFilter = badServiceFilter;
            return this;
        }

        /**
         * @param badServiceFilter A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder badServiceFilter(String badServiceFilter) {
            return badServiceFilter(Output.of(badServiceFilter));
        }

        /**
         * @param goodServiceFilter A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder goodServiceFilter(@Nullable Output<String> goodServiceFilter) {
            $.goodServiceFilter = goodServiceFilter;
            return this;
        }

        /**
         * @param goodServiceFilter A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder goodServiceFilter(String goodServiceFilter) {
            return goodServiceFilter(Output.of(goodServiceFilter));
        }

        /**
         * @param totalServiceFilter A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder totalServiceFilter(@Nullable Output<String> totalServiceFilter) {
            $.totalServiceFilter = totalServiceFilter;
            return this;
        }

        /**
         * @param totalServiceFilter A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder totalServiceFilter(String totalServiceFilter) {
            return totalServiceFilter(Output.of(totalServiceFilter));
        }

        public TimeSeriesRatioArgs build() {
            return $;
        }
    }

}
