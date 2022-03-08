// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RecommendedActionMetricInfoResponse {
    /**
     * Gets the name of the metric. e.g., CPU, Number of Queries.
     * 
     */
    private final String metricName;
    /**
     * Gets the start time of time interval given by this MetricInfo.
     * 
     */
    private final String startTime;
    /**
     * Gets the duration of time interval for the value given by this MetricInfo. e.g., PT1H (1 hour)
     * 
     */
    private final String timeGrain;
    /**
     * Gets the unit in which metric is measured. e.g., DTU, Frequency
     * 
     */
    private final String unit;
    /**
     * Gets the value of the metric in the time interval given by this MetricInfo.
     * 
     */
    private final Double value;

    @OutputCustomType.Constructor({"metricName","startTime","timeGrain","unit","value"})
    private RecommendedActionMetricInfoResponse(
        String metricName,
        String startTime,
        String timeGrain,
        String unit,
        Double value) {
        this.metricName = metricName;
        this.startTime = startTime;
        this.timeGrain = timeGrain;
        this.unit = unit;
        this.value = value;
    }

    /**
     * Gets the name of the metric. e.g., CPU, Number of Queries.
     * 
    */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * Gets the start time of time interval given by this MetricInfo.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Gets the duration of time interval for the value given by this MetricInfo. e.g., PT1H (1 hour)
     * 
    */
    public String getTimeGrain() {
        return this.timeGrain;
    }
    /**
     * Gets the unit in which metric is measured. e.g., DTU, Frequency
     * 
    */
    public String getUnit() {
        return this.unit;
    }
    /**
     * Gets the value of the metric in the time interval given by this MetricInfo.
     * 
    */
    public Double getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedActionMetricInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricName;
        private String startTime;
        private String timeGrain;
        private String unit;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedActionMetricInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.startTime = defaults.startTime;
    	      this.timeGrain = defaults.timeGrain;
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTimeGrain(String timeGrain) {
            this.timeGrain = Objects.requireNonNull(timeGrain);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder setValue(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public RecommendedActionMetricInfoResponse build() {
            return new RecommendedActionMetricInfoResponse(metricName, startTime, timeGrain, unit, value);
        }
    }
}
