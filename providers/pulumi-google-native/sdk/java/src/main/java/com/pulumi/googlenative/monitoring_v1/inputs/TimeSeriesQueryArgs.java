// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesFilterArgs;
import com.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesFilterRatioArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TimeSeriesQuery collects the set of supported methods for querying time series data from the Stackdriver metrics API.
 * 
 */
public final class TimeSeriesQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeSeriesQueryArgs Empty = new TimeSeriesQueryArgs();

    /**
     * Filter parameters to fetch time series.
     * 
     */
    @Import(name="timeSeriesFilter")
    private @Nullable Output<TimeSeriesFilterArgs> timeSeriesFilter;

    public Optional<Output<TimeSeriesFilterArgs>> timeSeriesFilter() {
        return Optional.ofNullable(this.timeSeriesFilter);
    }

    /**
     * Parameters to fetch a ratio between two time series filters.
     * 
     */
    @Import(name="timeSeriesFilterRatio")
    private @Nullable Output<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio;

    public Optional<Output<TimeSeriesFilterRatioArgs>> timeSeriesFilterRatio() {
        return Optional.ofNullable(this.timeSeriesFilterRatio);
    }

    /**
     * A query used to fetch time series.
     * 
     */
    @Import(name="timeSeriesQueryLanguage")
    private @Nullable Output<String> timeSeriesQueryLanguage;

    public Optional<Output<String>> timeSeriesQueryLanguage() {
        return Optional.ofNullable(this.timeSeriesQueryLanguage);
    }

    /**
     * The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    @Import(name="unitOverride")
    private @Nullable Output<String> unitOverride;

    public Optional<Output<String>> unitOverride() {
        return Optional.ofNullable(this.unitOverride);
    }

    private TimeSeriesQueryArgs() {}

    private TimeSeriesQueryArgs(TimeSeriesQueryArgs $) {
        this.timeSeriesFilter = $.timeSeriesFilter;
        this.timeSeriesFilterRatio = $.timeSeriesFilterRatio;
        this.timeSeriesQueryLanguage = $.timeSeriesQueryLanguage;
        this.unitOverride = $.unitOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesQueryArgs $;

        public Builder() {
            $ = new TimeSeriesQueryArgs();
        }

        public Builder(TimeSeriesQueryArgs defaults) {
            $ = new TimeSeriesQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder timeSeriesFilter(@Nullable Output<TimeSeriesFilterArgs> timeSeriesFilter) {
            $.timeSeriesFilter = timeSeriesFilter;
            return this;
        }

        public Builder timeSeriesFilter(TimeSeriesFilterArgs timeSeriesFilter) {
            return timeSeriesFilter(Output.of(timeSeriesFilter));
        }

        public Builder timeSeriesFilterRatio(@Nullable Output<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio) {
            $.timeSeriesFilterRatio = timeSeriesFilterRatio;
            return this;
        }

        public Builder timeSeriesFilterRatio(TimeSeriesFilterRatioArgs timeSeriesFilterRatio) {
            return timeSeriesFilterRatio(Output.of(timeSeriesFilterRatio));
        }

        public Builder timeSeriesQueryLanguage(@Nullable Output<String> timeSeriesQueryLanguage) {
            $.timeSeriesQueryLanguage = timeSeriesQueryLanguage;
            return this;
        }

        public Builder timeSeriesQueryLanguage(String timeSeriesQueryLanguage) {
            return timeSeriesQueryLanguage(Output.of(timeSeriesQueryLanguage));
        }

        public Builder unitOverride(@Nullable Output<String> unitOverride) {
            $.unitOverride = unitOverride;
            return this;
        }

        public Builder unitOverride(String unitOverride) {
            return unitOverride(Output.of(unitOverride));
        }

        public TimeSeriesQueryArgs build() {
            return $;
        }
    }

}
