// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricAlarmMetricQueryMetricGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricAlarmMetricQueryMetricGetArgs Empty = new MetricAlarmMetricQueryMetricGetArgs();

    /**
     * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @InputImport(name="dimensions")
      private final @Nullable Input<Map<String,String>> dimensions;

    public Input<Map<String,String>> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    /**
     * The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @InputImport(name="metricName", required=true)
      private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * The period in seconds over which the specified `stat` is applied.
     * 
     */
    @InputImport(name="period", required=true)
      private final Input<Integer> period;

    public Input<Integer> getPeriod() {
        return this.period;
    }

    /**
     * The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
     */
    @InputImport(name="stat", required=true)
      private final Input<String> stat;

    public Input<String> getStat() {
        return this.stat;
    }

    /**
     * The unit for this metric.
     * 
     */
    @InputImport(name="unit")
      private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    public MetricAlarmMetricQueryMetricGetArgs(
        @Nullable Input<Map<String,String>> dimensions,
        Input<String> metricName,
        @Nullable Input<String> namespace,
        Input<Integer> period,
        Input<String> stat,
        @Nullable Input<String> unit) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.namespace = namespace;
        this.period = Objects.requireNonNull(period, "expected parameter 'period' to be non-null");
        this.stat = Objects.requireNonNull(stat, "expected parameter 'stat' to be non-null");
        this.unit = unit;
    }

    private MetricAlarmMetricQueryMetricGetArgs() {
        this.dimensions = Input.empty();
        this.metricName = Input.empty();
        this.namespace = Input.empty();
        this.period = Input.empty();
        this.stat = Input.empty();
        this.unit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlarmMetricQueryMetricGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> dimensions;
        private Input<String> metricName;
        private @Nullable Input<String> namespace;
        private Input<Integer> period;
        private Input<String> stat;
        private @Nullable Input<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlarmMetricQueryMetricGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.period = defaults.period;
    	      this.stat = defaults.stat;
    	      this.unit = defaults.unit;
        }

        public Builder dimensions(@Nullable Input<Map<String,String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder metricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder namespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder period(Input<Integer> period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }

        public Builder period(Integer period) {
            this.period = Input.of(Objects.requireNonNull(period));
            return this;
        }

        public Builder stat(Input<String> stat) {
            this.stat = Objects.requireNonNull(stat);
            return this;
        }

        public Builder stat(String stat) {
            this.stat = Input.of(Objects.requireNonNull(stat));
            return this;
        }

        public Builder unit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }
        public MetricAlarmMetricQueryMetricGetArgs build() {
            return new MetricAlarmMetricQueryMetricGetArgs(dimensions, metricName, namespace, period, stat, unit);
        }
    }
}
