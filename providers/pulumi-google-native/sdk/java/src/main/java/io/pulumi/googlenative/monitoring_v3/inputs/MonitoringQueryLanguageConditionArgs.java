// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.TriggerArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A condition type that allows alert policies to be defined using Monitoring Query Language (https://cloud.google.com/monitoring/mql).
 * 
 */
public final class MonitoringQueryLanguageConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringQueryLanguageConditionArgs Empty = new MonitoringQueryLanguageConditionArgs();

    /**
     * The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
     * 
     */
    @InputImport(name="duration")
      private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    /**
     * Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a boolean stream.
     * 
     */
    @InputImport(name="query")
      private final @Nullable Input<String> query;

    public Input<String> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
     * 
     */
    @InputImport(name="trigger")
      private final @Nullable Input<TriggerArgs> trigger;

    public Input<TriggerArgs> getTrigger() {
        return this.trigger == null ? Input.empty() : this.trigger;
    }

    public MonitoringQueryLanguageConditionArgs(
        @Nullable Input<String> duration,
        @Nullable Input<String> query,
        @Nullable Input<TriggerArgs> trigger) {
        this.duration = duration;
        this.query = query;
        this.trigger = trigger;
    }

    private MonitoringQueryLanguageConditionArgs() {
        this.duration = Input.empty();
        this.query = Input.empty();
        this.trigger = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringQueryLanguageConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> duration;
        private @Nullable Input<String> query;
        private @Nullable Input<TriggerArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringQueryLanguageConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.query = defaults.query;
    	      this.trigger = defaults.trigger;
        }

        public Builder duration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder query(@Nullable Input<String> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable String query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder trigger(@Nullable Input<TriggerArgs> trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder trigger(@Nullable TriggerArgs trigger) {
            this.trigger = Input.ofNullable(trigger);
            return this;
        }
        public MonitoringQueryLanguageConditionArgs build() {
            return new MonitoringQueryLanguageConditionArgs(duration, query, trigger);
        }
    }
}
