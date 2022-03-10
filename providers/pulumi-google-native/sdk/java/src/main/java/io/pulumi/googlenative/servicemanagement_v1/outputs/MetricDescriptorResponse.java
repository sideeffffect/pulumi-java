// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.LabelDescriptorResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.MetricDescriptorMetadataResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MetricDescriptorResponse {
    /**
     * A detailed description of the metric, which can be used in documentation.
     * 
     */
    private final String description;
    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example "Request count". This field is optional but it is recommended to be set for any metrics associated with user-visible concepts, such as Quota.
     * 
     */
    private final String displayName;
    /**
     * The set of labels that can be used to describe a specific instance of this metric type. For example, the `appengine.googleapis.com/http/server/response_latencies` metric type has a label for the HTTP response code, `response_code`, so you can look at latencies for successful responses or just for responses that failed.
     * 
     */
    private final List<LabelDescriptorResponse> labels;
    /**
     * Optional. The launch stage of the metric definition.
     * 
     */
    private final String launchStage;
    /**
     * Optional. Metadata which can be used to guide usage of the metric.
     * 
     */
    private final MetricDescriptorMetadataResponse metadata;
    /**
     * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of `metric_kind` and `value_type` might not be supported.
     * 
     */
    private final String metricKind;
    /**
     * Read-only. If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that is associated with this metric type can only be associated with one of the monitored resource types listed here.
     * 
     */
    private final List<String> monitoredResourceTypes;
    /**
     * The resource name of the metric descriptor.
     * 
     */
    private final String name;
    /**
     * The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined metric types have the DNS name `custom.googleapis.com` or `external.googleapis.com`. Metric types should use a natural hierarchical grouping. For example: "custom.googleapis.com/invoice/paid/amount" "external.googleapis.com/prometheus/up" "appengine.googleapis.com/http/server/response_latencies"
     * 
     */
    private final String type;
    /**
     * The units in which the metric value is reported. It is only applicable if the `value_type` is `INT64`, `DOUBLE`, or `DISTRIBUTION`. The `unit` defines the representation of the stored metric values. Different systems might scale the values to be more easily displayed (so a value of `0.02kBy` _might_ be displayed as `20By`, and a value of `3523kBy` _might_ be displayed as `3.5MBy`). However, if the `unit` is `kBy`, then the value of the metric is always in thousands of bytes, no matter how it might be displayed. If you want a custom metric to record the exact number of CPU-seconds used by a job, you can create an `INT64 CUMULATIVE` metric whose `unit` is `s{CPU}` (or equivalently `1s{CPU}` or just `s`). If the job uses 12,005 CPU-seconds, then the value is written as `12005`. Alternatively, if you want a custom metric to record data in a more granular way, you can create a `DOUBLE CUMULATIVE` metric whose `unit` is `ks{CPU}`, and then write the value `12.005` (which is `12005/1000`), or use `Kis{CPU}` and write `11.723` (which is `12005/1024`). The supported units are a subset of [The Unified Code for Units of Measure](https://unitsofmeasure.org/ucum.html) standard: **Basic units (UNIT)** * `bit` bit * `By` byte * `s` second * `min` minute * `h` hour * `d` day * `1` dimensionless **Prefixes (PREFIX)** * `k` kilo (10^3) * `M` mega (10^6) * `G` giga (10^9) * `T` tera (10^12) * `P` peta (10^15) * `E` exa (10^18) * `Z` zetta (10^21) * `Y` yotta (10^24) * `m` milli (10^-3) * `u` micro (10^-6) * `n` nano (10^-9) * `p` pico (10^-12) * `f` femto (10^-15) * `a` atto (10^-18) * `z` zepto (10^-21) * `y` yocto (10^-24) * `Ki` kibi (2^10) * `Mi` mebi (2^20) * `Gi` gibi (2^30) * `Ti` tebi (2^40) * `Pi` pebi (2^50) **Grammar** The grammar also includes these connectors: * `/` division or ratio (as an infix operator). For examples, `kBy/{email}` or `MiBy/10ms` (although you should almost never have `/s` in a metric `unit`; rates should always be computed at query time from the underlying cumulative or delta value). * `.` multiplication or composition (as an infix operator). For examples, `GBy.d` or `k{watt}.h`. The grammar for a unit is as follows: Expression = Component { "." Component } { "/" Component } ; Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ] | Annotation | "1" ; Annotation = "{" NAME "}" ; Notes: * `Annotation` is just a comment if it follows a `UNIT`. If the annotation is used alone, then the unit is equivalent to `1`. For examples, `{request}/s == 1/s`, `By{transmitted}/s == By/s`. * `NAME` is a sequence of non-blank printable ASCII characters not containing `{` or `}`. * `1` represents a unitary [dimensionless unit](https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such as in `1/s`. It is typically used when none of the basic units are appropriate. For example, "new users per day" can be represented as `1/d` or `{new-users}/d` (and a metric value `5` would mean "5 new users). Alternatively, "thousands of page views per day" would be represented as `1000/d` or `k1/d` or `k{page_views}/d` (and a metric value of `5.3` would mean "5300 page views per day"). * `%` represents dimensionless value of 1/100, and annotates values giving a percentage (so the metric values are typically in the range of 0..100, and a metric value `3` means "3 percent"). * `10^2.%` indicates a metric contains a ratio, typically in the range 0..1, that will be multiplied by 100 and displayed as a percentage (so a metric value `0.03` means "3 percent").
     * 
     */
    private final String unit;
    /**
     * Whether the measurement is an integer, a floating-point number, etc. Some combinations of `metric_kind` and `value_type` might not be supported.
     * 
     */
    private final String valueType;

    @OutputCustomType.Constructor
    private MetricDescriptorResponse(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("labels") List<LabelDescriptorResponse> labels,
        @OutputCustomType.Parameter("launchStage") String launchStage,
        @OutputCustomType.Parameter("metadata") MetricDescriptorMetadataResponse metadata,
        @OutputCustomType.Parameter("metricKind") String metricKind,
        @OutputCustomType.Parameter("monitoredResourceTypes") List<String> monitoredResourceTypes,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("unit") String unit,
        @OutputCustomType.Parameter("valueType") String valueType) {
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.launchStage = launchStage;
        this.metadata = metadata;
        this.metricKind = metricKind;
        this.monitoredResourceTypes = monitoredResourceTypes;
        this.name = name;
        this.type = type;
        this.unit = unit;
        this.valueType = valueType;
    }

    /**
     * A detailed description of the metric, which can be used in documentation.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example "Request count". This field is optional but it is recommended to be set for any metrics associated with user-visible concepts, such as Quota.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The set of labels that can be used to describe a specific instance of this metric type. For example, the `appengine.googleapis.com/http/server/response_latencies` metric type has a label for the HTTP response code, `response_code`, so you can look at latencies for successful responses or just for responses that failed.
     * 
    */
    public List<LabelDescriptorResponse> getLabels() {
        return this.labels;
    }
    /**
     * Optional. The launch stage of the metric definition.
     * 
    */
    public String getLaunchStage() {
        return this.launchStage;
    }
    /**
     * Optional. Metadata which can be used to guide usage of the metric.
     * 
    */
    public MetricDescriptorMetadataResponse getMetadata() {
        return this.metadata;
    }
    /**
     * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of `metric_kind` and `value_type` might not be supported.
     * 
    */
    public String getMetricKind() {
        return this.metricKind;
    }
    /**
     * Read-only. If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that is associated with this metric type can only be associated with one of the monitored resource types listed here.
     * 
    */
    public List<String> getMonitoredResourceTypes() {
        return this.monitoredResourceTypes;
    }
    /**
     * The resource name of the metric descriptor.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined metric types have the DNS name `custom.googleapis.com` or `external.googleapis.com`. Metric types should use a natural hierarchical grouping. For example: "custom.googleapis.com/invoice/paid/amount" "external.googleapis.com/prometheus/up" "appengine.googleapis.com/http/server/response_latencies"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The units in which the metric value is reported. It is only applicable if the `value_type` is `INT64`, `DOUBLE`, or `DISTRIBUTION`. The `unit` defines the representation of the stored metric values. Different systems might scale the values to be more easily displayed (so a value of `0.02kBy` _might_ be displayed as `20By`, and a value of `3523kBy` _might_ be displayed as `3.5MBy`). However, if the `unit` is `kBy`, then the value of the metric is always in thousands of bytes, no matter how it might be displayed. If you want a custom metric to record the exact number of CPU-seconds used by a job, you can create an `INT64 CUMULATIVE` metric whose `unit` is `s{CPU}` (or equivalently `1s{CPU}` or just `s`). If the job uses 12,005 CPU-seconds, then the value is written as `12005`. Alternatively, if you want a custom metric to record data in a more granular way, you can create a `DOUBLE CUMULATIVE` metric whose `unit` is `ks{CPU}`, and then write the value `12.005` (which is `12005/1000`), or use `Kis{CPU}` and write `11.723` (which is `12005/1024`). The supported units are a subset of [The Unified Code for Units of Measure](https://unitsofmeasure.org/ucum.html) standard: **Basic units (UNIT)** * `bit` bit * `By` byte * `s` second * `min` minute * `h` hour * `d` day * `1` dimensionless **Prefixes (PREFIX)** * `k` kilo (10^3) * `M` mega (10^6) * `G` giga (10^9) * `T` tera (10^12) * `P` peta (10^15) * `E` exa (10^18) * `Z` zetta (10^21) * `Y` yotta (10^24) * `m` milli (10^-3) * `u` micro (10^-6) * `n` nano (10^-9) * `p` pico (10^-12) * `f` femto (10^-15) * `a` atto (10^-18) * `z` zepto (10^-21) * `y` yocto (10^-24) * `Ki` kibi (2^10) * `Mi` mebi (2^20) * `Gi` gibi (2^30) * `Ti` tebi (2^40) * `Pi` pebi (2^50) **Grammar** The grammar also includes these connectors: * `/` division or ratio (as an infix operator). For examples, `kBy/{email}` or `MiBy/10ms` (although you should almost never have `/s` in a metric `unit`; rates should always be computed at query time from the underlying cumulative or delta value). * `.` multiplication or composition (as an infix operator). For examples, `GBy.d` or `k{watt}.h`. The grammar for a unit is as follows: Expression = Component { "." Component } { "/" Component } ; Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ] | Annotation | "1" ; Annotation = "{" NAME "}" ; Notes: * `Annotation` is just a comment if it follows a `UNIT`. If the annotation is used alone, then the unit is equivalent to `1`. For examples, `{request}/s == 1/s`, `By{transmitted}/s == By/s`. * `NAME` is a sequence of non-blank printable ASCII characters not containing `{` or `}`. * `1` represents a unitary [dimensionless unit](https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such as in `1/s`. It is typically used when none of the basic units are appropriate. For example, "new users per day" can be represented as `1/d` or `{new-users}/d` (and a metric value `5` would mean "5 new users). Alternatively, "thousands of page views per day" would be represented as `1000/d` or `k1/d` or `k{page_views}/d` (and a metric value of `5.3` would mean "5300 page views per day"). * `%` represents dimensionless value of 1/100, and annotates values giving a percentage (so the metric values are typically in the range of 0..100, and a metric value `3` means "3 percent"). * `10^2.%` indicates a metric contains a ratio, typically in the range 0..1, that will be multiplied by 100 and displayed as a percentage (so a metric value `0.03` means "3 percent").
     * 
    */
    public String getUnit() {
        return this.unit;
    }
    /**
     * Whether the measurement is an integer, a floating-point number, etc. Some combinations of `metric_kind` and `value_type` might not be supported.
     * 
    */
    public String getValueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private List<LabelDescriptorResponse> labels;
        private String launchStage;
        private MetricDescriptorMetadataResponse metadata;
        private String metricKind;
        private List<String> monitoredResourceTypes;
        private String name;
        private String type;
        private String unit;
        private String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.launchStage = defaults.launchStage;
    	      this.metadata = defaults.metadata;
    	      this.metricKind = defaults.metricKind;
    	      this.monitoredResourceTypes = defaults.monitoredResourceTypes;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
    	      this.valueType = defaults.valueType;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder labels(List<LabelDescriptorResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder launchStage(String launchStage) {
            this.launchStage = Objects.requireNonNull(launchStage);
            return this;
        }

        public Builder metadata(MetricDescriptorMetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder metricKind(String metricKind) {
            this.metricKind = Objects.requireNonNull(metricKind);
            return this;
        }

        public Builder monitoredResourceTypes(List<String> monitoredResourceTypes) {
            this.monitoredResourceTypes = Objects.requireNonNull(monitoredResourceTypes);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder valueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }
        public MetricDescriptorResponse build() {
            return new MetricDescriptorResponse(description, displayName, labels, launchStage, metadata, metricKind, monitoredResourceTypes, name, type, unit, valueType);
        }
    }
}
