// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.logging.v2.enums.MetricDescriptorLaunchStage;
import com.pulumi.googlenative.logging.v2.enums.MetricDescriptorMetricKind;
import com.pulumi.googlenative.logging.v2.enums.MetricDescriptorValueType;
import com.pulumi.googlenative.logging.v2.inputs.LabelDescriptorArgs;
import com.pulumi.googlenative.logging.v2.inputs.MetricDescriptorMetadataArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a metric type and its schema. Once a metric descriptor is created, deleting or altering it stops data collection and makes the metric type&#39;s existing data unusable.
 * 
 */
public final class MetricDescriptorArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorArgs Empty = new MetricDescriptorArgs();

    /**
     * A detailed description of the metric, which can be used in documentation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A detailed description of the metric, which can be used in documentation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;. This field is optional but it is recommended to be set for any metrics associated with user-visible concepts, such as Quota.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;. This field is optional but it is recommended to be set for any metrics associated with user-visible concepts, such as Quota.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The set of labels that can be used to describe a specific instance of this metric type. For example, the appengine.googleapis.com/http/server/response_latencies metric type has a label for the HTTP response code, response_code, so you can look at latencies for successful responses or just for responses that failed.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<LabelDescriptorArgs>> labels;

    /**
     * @return The set of labels that can be used to describe a specific instance of this metric type. For example, the appengine.googleapis.com/http/server/response_latencies metric type has a label for the HTTP response code, response_code, so you can look at latencies for successful responses or just for responses that failed.
     * 
     */
    public Optional<Output<List<LabelDescriptorArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Optional. The launch stage of the metric definition.
     * 
     */
    @Import(name="launchStage")
    private @Nullable Output<MetricDescriptorLaunchStage> launchStage;

    /**
     * @return Optional. The launch stage of the metric definition.
     * 
     */
    public Optional<Output<MetricDescriptorLaunchStage>> launchStage() {
        return Optional.ofNullable(this.launchStage);
    }

    /**
     * Optional. Metadata which can be used to guide usage of the metric.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<MetricDescriptorMetadataArgs> metadata;

    /**
     * @return Optional. Metadata which can be used to guide usage of the metric.
     * 
     */
    public Optional<Output<MetricDescriptorMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metric_kind and value_type might not be supported.
     * 
     */
    @Import(name="metricKind")
    private @Nullable Output<MetricDescriptorMetricKind> metricKind;

    /**
     * @return Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metric_kind and value_type might not be supported.
     * 
     */
    public Optional<Output<MetricDescriptorMetricKind>> metricKind() {
        return Optional.ofNullable(this.metricKind);
    }

    /**
     * Read-only. If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that is associated with this metric type can only be associated with one of the monitored resource types listed here.
     * 
     */
    @Import(name="monitoredResourceTypes")
    private @Nullable Output<List<String>> monitoredResourceTypes;

    /**
     * @return Read-only. If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that is associated with this metric type can only be associated with one of the monitored resource types listed here.
     * 
     */
    public Optional<Output<List<String>>> monitoredResourceTypes() {
        return Optional.ofNullable(this.monitoredResourceTypes);
    }

    /**
     * The resource name of the metric descriptor.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the metric descriptor.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined metric types have the DNS name custom.googleapis.com or external.googleapis.com. Metric types should use a natural hierarchical grouping. For example: &#34;custom.googleapis.com/invoice/paid/amount&#34; &#34;external.googleapis.com/prometheus/up&#34; &#34;appengine.googleapis.com/http/server/response_latencies&#34;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined metric types have the DNS name custom.googleapis.com or external.googleapis.com. Metric types should use a natural hierarchical grouping. For example: &#34;custom.googleapis.com/invoice/paid/amount&#34; &#34;external.googleapis.com/prometheus/up&#34; &#34;appengine.googleapis.com/http/server/response_latencies&#34;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The units in which the metric value is reported. It is only applicable if the value_type is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of the stored metric values.Different systems might scale the values to be more easily displayed (so a value of 0.02kBy might be displayed as 20By, and a value of 3523kBy might be displayed as 3.5MBy). However, if the unit is kBy, then the value of the metric is always in thousands of bytes, no matter how it might be displayed.If you want a custom metric to record the exact number of CPU-seconds used by a job, you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as 12005.Alternatively, if you want a custom metric to record data in a more granular way, you can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).The supported units are a subset of The Unified Code for Units of Measure (https://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit By byte s second min minute h hour d day 1 dimensionlessPrefixes (PREFIX) k kilo (10^3) M mega (10^6) G giga (10^9) T tera (10^12) P peta (10^15) E exa (10^18) Z zetta (10^21) Y yotta (10^24) m milli (10^-3) u micro (10^-6) n nano (10^-9) p pico (10^-12) f femto (10^-15) a atto (10^-18) z zepto (10^-21) y yocto (10^-24) Ki kibi (2^10) Mi mebi (2^20) Gi gibi (2^30) Ti tebi (2^40) Pi pebi (2^50)GrammarThe grammar also includes these connectors: / division or ratio (as an infix operator). For examples, kBy/{email} or MiBy/10ms (although you should almost never have /s in a metric unit; rates should always be computed at query time from the underlying cumulative or delta value). . multiplication or composition (as an infix operator). For examples, GBy.d or k{watt}.h.The grammar for a unit is as follows: Expression = Component { &#34;.&#34; Component } { &#34;/&#34; Component } ; Component = ( [ PREFIX ] UNIT | &#34;%&#34; ) [ Annotation ] | Annotation | &#34;1&#34; ; Annotation = &#34;{&#34; NAME &#34;}&#34; ; Notes: Annotation is just a comment if it follows a UNIT. If the annotation is used alone, then the unit is equivalent to 1. For examples, {request}/s == 1/s, By{transmitted}/s == By/s. NAME is a sequence of non-blank printable ASCII characters not containing { or }. 1 represents a unitary dimensionless unit (https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such as in 1/s. It is typically used when none of the basic units are appropriate. For example, &#34;new users per day&#34; can be represented as 1/d or {new-users}/d (and a metric value 5 would mean &#34;5 new users). Alternatively, &#34;thousands of page views per day&#34; would be represented as 1000/d or k1/d or k{page_views}/d (and a metric value of 5.3 would mean &#34;5300 page views per day&#34;). % represents dimensionless value of 1/100, and annotates values giving a percentage (so the metric values are typically in the range of 0..100, and a metric value 3 means &#34;3 percent&#34;). 10^2.% indicates a metric contains a ratio, typically in the range 0..1, that will be multiplied by 100 and displayed as a percentage (so a metric value 0.03 means &#34;3 percent&#34;).
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return The units in which the metric value is reported. It is only applicable if the value_type is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of the stored metric values.Different systems might scale the values to be more easily displayed (so a value of 0.02kBy might be displayed as 20By, and a value of 3523kBy might be displayed as 3.5MBy). However, if the unit is kBy, then the value of the metric is always in thousands of bytes, no matter how it might be displayed.If you want a custom metric to record the exact number of CPU-seconds used by a job, you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as 12005.Alternatively, if you want a custom metric to record data in a more granular way, you can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).The supported units are a subset of The Unified Code for Units of Measure (https://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit By byte s second min minute h hour d day 1 dimensionlessPrefixes (PREFIX) k kilo (10^3) M mega (10^6) G giga (10^9) T tera (10^12) P peta (10^15) E exa (10^18) Z zetta (10^21) Y yotta (10^24) m milli (10^-3) u micro (10^-6) n nano (10^-9) p pico (10^-12) f femto (10^-15) a atto (10^-18) z zepto (10^-21) y yocto (10^-24) Ki kibi (2^10) Mi mebi (2^20) Gi gibi (2^30) Ti tebi (2^40) Pi pebi (2^50)GrammarThe grammar also includes these connectors: / division or ratio (as an infix operator). For examples, kBy/{email} or MiBy/10ms (although you should almost never have /s in a metric unit; rates should always be computed at query time from the underlying cumulative or delta value). . multiplication or composition (as an infix operator). For examples, GBy.d or k{watt}.h.The grammar for a unit is as follows: Expression = Component { &#34;.&#34; Component } { &#34;/&#34; Component } ; Component = ( [ PREFIX ] UNIT | &#34;%&#34; ) [ Annotation ] | Annotation | &#34;1&#34; ; Annotation = &#34;{&#34; NAME &#34;}&#34; ; Notes: Annotation is just a comment if it follows a UNIT. If the annotation is used alone, then the unit is equivalent to 1. For examples, {request}/s == 1/s, By{transmitted}/s == By/s. NAME is a sequence of non-blank printable ASCII characters not containing { or }. 1 represents a unitary dimensionless unit (https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such as in 1/s. It is typically used when none of the basic units are appropriate. For example, &#34;new users per day&#34; can be represented as 1/d or {new-users}/d (and a metric value 5 would mean &#34;5 new users). Alternatively, &#34;thousands of page views per day&#34; would be represented as 1000/d or k1/d or k{page_views}/d (and a metric value of 5.3 would mean &#34;5300 page views per day&#34;). % represents dimensionless value of 1/100, and annotates values giving a percentage (so the metric values are typically in the range of 0..100, and a metric value 3 means &#34;3 percent&#34;). 10^2.% indicates a metric contains a ratio, typically in the range 0..1, that will be multiplied by 100 and displayed as a percentage (so a metric value 0.03 means &#34;3 percent&#34;).
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    /**
     * Whether the measurement is an integer, a floating-point number, etc. Some combinations of metric_kind and value_type might not be supported.
     * 
     */
    @Import(name="valueType")
    private @Nullable Output<MetricDescriptorValueType> valueType;

    /**
     * @return Whether the measurement is an integer, a floating-point number, etc. Some combinations of metric_kind and value_type might not be supported.
     * 
     */
    public Optional<Output<MetricDescriptorValueType>> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    private MetricDescriptorArgs() {}

    private MetricDescriptorArgs(MetricDescriptorArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.launchStage = $.launchStage;
        this.metadata = $.metadata;
        this.metricKind = $.metricKind;
        this.monitoredResourceTypes = $.monitoredResourceTypes;
        this.name = $.name;
        this.type = $.type;
        this.unit = $.unit;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricDescriptorArgs $;

        public Builder() {
            $ = new MetricDescriptorArgs();
        }

        public Builder(MetricDescriptorArgs defaults) {
            $ = new MetricDescriptorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A detailed description of the metric, which can be used in documentation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A detailed description of the metric, which can be used in documentation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;. This field is optional but it is recommended to be set for any metrics associated with user-visible concepts, such as Quota.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example &#34;Request count&#34;. This field is optional but it is recommended to be set for any metrics associated with user-visible concepts, such as Quota.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels The set of labels that can be used to describe a specific instance of this metric type. For example, the appengine.googleapis.com/http/server/response_latencies metric type has a label for the HTTP response code, response_code, so you can look at latencies for successful responses or just for responses that failed.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<LabelDescriptorArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The set of labels that can be used to describe a specific instance of this metric type. For example, the appengine.googleapis.com/http/server/response_latencies metric type has a label for the HTTP response code, response_code, so you can look at latencies for successful responses or just for responses that failed.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<LabelDescriptorArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels The set of labels that can be used to describe a specific instance of this metric type. For example, the appengine.googleapis.com/http/server/response_latencies metric type has a label for the HTTP response code, response_code, so you can look at latencies for successful responses or just for responses that failed.
         * 
         * @return builder
         * 
         */
        public Builder labels(LabelDescriptorArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param launchStage Optional. The launch stage of the metric definition.
         * 
         * @return builder
         * 
         */
        public Builder launchStage(@Nullable Output<MetricDescriptorLaunchStage> launchStage) {
            $.launchStage = launchStage;
            return this;
        }

        /**
         * @param launchStage Optional. The launch stage of the metric definition.
         * 
         * @return builder
         * 
         */
        public Builder launchStage(MetricDescriptorLaunchStage launchStage) {
            return launchStage(Output.of(launchStage));
        }

        /**
         * @param metadata Optional. Metadata which can be used to guide usage of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<MetricDescriptorMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Optional. Metadata which can be used to guide usage of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metadata(MetricDescriptorMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param metricKind Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metric_kind and value_type might not be supported.
         * 
         * @return builder
         * 
         */
        public Builder metricKind(@Nullable Output<MetricDescriptorMetricKind> metricKind) {
            $.metricKind = metricKind;
            return this;
        }

        /**
         * @param metricKind Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metric_kind and value_type might not be supported.
         * 
         * @return builder
         * 
         */
        public Builder metricKind(MetricDescriptorMetricKind metricKind) {
            return metricKind(Output.of(metricKind));
        }

        /**
         * @param monitoredResourceTypes Read-only. If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that is associated with this metric type can only be associated with one of the monitored resource types listed here.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResourceTypes(@Nullable Output<List<String>> monitoredResourceTypes) {
            $.monitoredResourceTypes = monitoredResourceTypes;
            return this;
        }

        /**
         * @param monitoredResourceTypes Read-only. If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that is associated with this metric type can only be associated with one of the monitored resource types listed here.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResourceTypes(List<String> monitoredResourceTypes) {
            return monitoredResourceTypes(Output.of(monitoredResourceTypes));
        }

        /**
         * @param monitoredResourceTypes Read-only. If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that is associated with this metric type can only be associated with one of the monitored resource types listed here.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResourceTypes(String... monitoredResourceTypes) {
            return monitoredResourceTypes(List.of(monitoredResourceTypes));
        }

        /**
         * @param name The resource name of the metric descriptor.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the metric descriptor.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined metric types have the DNS name custom.googleapis.com or external.googleapis.com. Metric types should use a natural hierarchical grouping. For example: &#34;custom.googleapis.com/invoice/paid/amount&#34; &#34;external.googleapis.com/prometheus/up&#34; &#34;appengine.googleapis.com/http/server/response_latencies&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined metric types have the DNS name custom.googleapis.com or external.googleapis.com. Metric types should use a natural hierarchical grouping. For example: &#34;custom.googleapis.com/invoice/paid/amount&#34; &#34;external.googleapis.com/prometheus/up&#34; &#34;appengine.googleapis.com/http/server/response_latencies&#34;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param unit The units in which the metric value is reported. It is only applicable if the value_type is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of the stored metric values.Different systems might scale the values to be more easily displayed (so a value of 0.02kBy might be displayed as 20By, and a value of 3523kBy might be displayed as 3.5MBy). However, if the unit is kBy, then the value of the metric is always in thousands of bytes, no matter how it might be displayed.If you want a custom metric to record the exact number of CPU-seconds used by a job, you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as 12005.Alternatively, if you want a custom metric to record data in a more granular way, you can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).The supported units are a subset of The Unified Code for Units of Measure (https://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit By byte s second min minute h hour d day 1 dimensionlessPrefixes (PREFIX) k kilo (10^3) M mega (10^6) G giga (10^9) T tera (10^12) P peta (10^15) E exa (10^18) Z zetta (10^21) Y yotta (10^24) m milli (10^-3) u micro (10^-6) n nano (10^-9) p pico (10^-12) f femto (10^-15) a atto (10^-18) z zepto (10^-21) y yocto (10^-24) Ki kibi (2^10) Mi mebi (2^20) Gi gibi (2^30) Ti tebi (2^40) Pi pebi (2^50)GrammarThe grammar also includes these connectors: / division or ratio (as an infix operator). For examples, kBy/{email} or MiBy/10ms (although you should almost never have /s in a metric unit; rates should always be computed at query time from the underlying cumulative or delta value). . multiplication or composition (as an infix operator). For examples, GBy.d or k{watt}.h.The grammar for a unit is as follows: Expression = Component { &#34;.&#34; Component } { &#34;/&#34; Component } ; Component = ( [ PREFIX ] UNIT | &#34;%&#34; ) [ Annotation ] | Annotation | &#34;1&#34; ; Annotation = &#34;{&#34; NAME &#34;}&#34; ; Notes: Annotation is just a comment if it follows a UNIT. If the annotation is used alone, then the unit is equivalent to 1. For examples, {request}/s == 1/s, By{transmitted}/s == By/s. NAME is a sequence of non-blank printable ASCII characters not containing { or }. 1 represents a unitary dimensionless unit (https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such as in 1/s. It is typically used when none of the basic units are appropriate. For example, &#34;new users per day&#34; can be represented as 1/d or {new-users}/d (and a metric value 5 would mean &#34;5 new users). Alternatively, &#34;thousands of page views per day&#34; would be represented as 1000/d or k1/d or k{page_views}/d (and a metric value of 5.3 would mean &#34;5300 page views per day&#34;). % represents dimensionless value of 1/100, and annotates values giving a percentage (so the metric values are typically in the range of 0..100, and a metric value 3 means &#34;3 percent&#34;). 10^2.% indicates a metric contains a ratio, typically in the range 0..1, that will be multiplied by 100 and displayed as a percentage (so a metric value 0.03 means &#34;3 percent&#34;).
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit The units in which the metric value is reported. It is only applicable if the value_type is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of the stored metric values.Different systems might scale the values to be more easily displayed (so a value of 0.02kBy might be displayed as 20By, and a value of 3523kBy might be displayed as 3.5MBy). However, if the unit is kBy, then the value of the metric is always in thousands of bytes, no matter how it might be displayed.If you want a custom metric to record the exact number of CPU-seconds used by a job, you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as 12005.Alternatively, if you want a custom metric to record data in a more granular way, you can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).The supported units are a subset of The Unified Code for Units of Measure (https://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit By byte s second min minute h hour d day 1 dimensionlessPrefixes (PREFIX) k kilo (10^3) M mega (10^6) G giga (10^9) T tera (10^12) P peta (10^15) E exa (10^18) Z zetta (10^21) Y yotta (10^24) m milli (10^-3) u micro (10^-6) n nano (10^-9) p pico (10^-12) f femto (10^-15) a atto (10^-18) z zepto (10^-21) y yocto (10^-24) Ki kibi (2^10) Mi mebi (2^20) Gi gibi (2^30) Ti tebi (2^40) Pi pebi (2^50)GrammarThe grammar also includes these connectors: / division or ratio (as an infix operator). For examples, kBy/{email} or MiBy/10ms (although you should almost never have /s in a metric unit; rates should always be computed at query time from the underlying cumulative or delta value). . multiplication or composition (as an infix operator). For examples, GBy.d or k{watt}.h.The grammar for a unit is as follows: Expression = Component { &#34;.&#34; Component } { &#34;/&#34; Component } ; Component = ( [ PREFIX ] UNIT | &#34;%&#34; ) [ Annotation ] | Annotation | &#34;1&#34; ; Annotation = &#34;{&#34; NAME &#34;}&#34; ; Notes: Annotation is just a comment if it follows a UNIT. If the annotation is used alone, then the unit is equivalent to 1. For examples, {request}/s == 1/s, By{transmitted}/s == By/s. NAME is a sequence of non-blank printable ASCII characters not containing { or }. 1 represents a unitary dimensionless unit (https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such as in 1/s. It is typically used when none of the basic units are appropriate. For example, &#34;new users per day&#34; can be represented as 1/d or {new-users}/d (and a metric value 5 would mean &#34;5 new users). Alternatively, &#34;thousands of page views per day&#34; would be represented as 1000/d or k1/d or k{page_views}/d (and a metric value of 5.3 would mean &#34;5300 page views per day&#34;). % represents dimensionless value of 1/100, and annotates values giving a percentage (so the metric values are typically in the range of 0..100, and a metric value 3 means &#34;3 percent&#34;). 10^2.% indicates a metric contains a ratio, typically in the range 0..1, that will be multiplied by 100 and displayed as a percentage (so a metric value 0.03 means &#34;3 percent&#34;).
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param valueType Whether the measurement is an integer, a floating-point number, etc. Some combinations of metric_kind and value_type might not be supported.
         * 
         * @return builder
         * 
         */
        public Builder valueType(@Nullable Output<MetricDescriptorValueType> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType Whether the measurement is an integer, a floating-point number, etc. Some combinations of metric_kind and value_type might not be supported.
         * 
         * @return builder
         * 
         */
        public Builder valueType(MetricDescriptorValueType valueType) {
            return valueType(Output.of(valueType));
        }

        public MetricDescriptorArgs build() {
            return $;
        }
    }

}
