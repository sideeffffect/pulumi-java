// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.logging.v2.enums.MetricVersion;
import com.pulumi.googlenative.logging.v2.inputs.BucketOptionsArgs;
import com.pulumi.googlenative.logging.v2.inputs.MetricDescriptorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricArgs Empty = new MetricArgs();

    /**
     * Optional. The bucket_options are required when the logs-based metric is using a DISTRIBUTION value type and it describes the bucket boundaries used to create a histogram of the extracted values.
     * 
     */
    @Import(name="bucketOptions")
    private @Nullable Output<BucketOptionsArgs> bucketOptions;

    /**
     * @return Optional. The bucket_options are required when the logs-based metric is using a DISTRIBUTION value type and it describes the bucket boundaries used to create a histogram of the extracted values.
     * 
     */
    public Optional<Output<BucketOptionsArgs>> bucketOptions() {
        return Optional.ofNullable(this.bucketOptions);
    }

    /**
     * Optional. A description of this metric, which is used in documentation. The maximum length of the description is 8000 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A description of this metric, which is used in documentation. The maximum length of the description is 8000 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. If set to True, then this metric is disabled and it does not generate any points.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Optional. If set to True, then this metric is disabled and it does not generate any points.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced_filters) which is used to match log entries. Example: &#34;resource.type=gae_app AND severity&gt;=ERROR&#34; The maximum length of the filter is 20000 characters.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced_filters) which is used to match log entries. Example: &#34;resource.type=gae_app AND severity&gt;=ERROR&#34; The maximum length of the filter is 20000 characters.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    /**
     * Optional. A map from a label key string to an extractor expression which is used to extract data from a log entry field and assign as the label value. Each label key specified in the LabelDescriptor must have an associated extractor expression in this map. The syntax of the extractor expression is the same as for the value_extractor field.The extracted value is converted to the type defined in the label descriptor. If the either the extraction or the type conversion fails, the label will have a default value. The default value for a string label is an empty string, for an integer label its 0, and for a boolean label its false.Note that there are upper bounds on the maximum number of labels and the number of active time series that are allowed in a project.
     * 
     */
    @Import(name="labelExtractors")
    private @Nullable Output<Map<String,String>> labelExtractors;

    /**
     * @return Optional. A map from a label key string to an extractor expression which is used to extract data from a log entry field and assign as the label value. Each label key specified in the LabelDescriptor must have an associated extractor expression in this map. The syntax of the extractor expression is the same as for the value_extractor field.The extracted value is converted to the type defined in the label descriptor. If the either the extraction or the type conversion fails, the label will have a default value. The default value for a string label is an empty string, for an integer label its 0, and for a boolean label its false.Note that there are upper bounds on the maximum number of labels and the number of active time series that are allowed in a project.
     * 
     */
    public Optional<Output<Map<String,String>>> labelExtractors() {
        return Optional.ofNullable(this.labelExtractors);
    }

    /**
     * Optional. The metric descriptor associated with the logs-based metric. If unspecified, it uses a default metric descriptor with a DELTA metric kind, INT64 value type, with no labels and a unit of &#34;1&#34;. Such a metric counts the number of log entries matching the filter expression.The name, type, and description fields in the metric_descriptor are output only, and is constructed using the name and description field in the LogMetric.To create a logs-based metric that records a distribution of log values, a DELTA metric kind with a DISTRIBUTION value type must be used along with a value_extractor expression in the LogMetric.Each label in the metric descriptor must have a matching label name as the key and an extractor expression as the value in the label_extractors map.The metric_kind and value_type fields in the metric_descriptor cannot be updated once initially configured. New labels can be added in the metric_descriptor, but existing labels cannot be modified except for their description.
     * 
     */
    @Import(name="metricDescriptor")
    private @Nullable Output<MetricDescriptorArgs> metricDescriptor;

    /**
     * @return Optional. The metric descriptor associated with the logs-based metric. If unspecified, it uses a default metric descriptor with a DELTA metric kind, INT64 value type, with no labels and a unit of &#34;1&#34;. Such a metric counts the number of log entries matching the filter expression.The name, type, and description fields in the metric_descriptor are output only, and is constructed using the name and description field in the LogMetric.To create a logs-based metric that records a distribution of log values, a DELTA metric kind with a DISTRIBUTION value type must be used along with a value_extractor expression in the LogMetric.Each label in the metric descriptor must have a matching label name as the key and an extractor expression as the value in the label_extractors map.The metric_kind and value_type fields in the metric_descriptor cannot be updated once initially configured. New labels can be added in the metric_descriptor, but existing labels cannot be modified except for their description.
     * 
     */
    public Optional<Output<MetricDescriptorArgs>> metricDescriptor() {
        return Optional.ofNullable(this.metricDescriptor);
    }

    /**
     * The client-assigned metric identifier. Examples: &#34;error_count&#34;, &#34;nginx/requests&#34;.Metric identifiers are limited to 100 characters and can include only the following characters: A-Z, a-z, 0-9, and the special characters _-.,+!*&#39;,()%/. The forward-slash character (/) denotes a hierarchy of name pieces, and it cannot be the first character of the name.This field is the [METRIC_ID] part of a metric resource name in the format &#34;projects/PROJECT_ID/metrics/METRIC_ID&#34;. Example: If the resource name of a metric is &#34;projects/my-project/metrics/nginx%2Frequests&#34;, this field&#39;s value is &#34;nginx/requests&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The client-assigned metric identifier. Examples: &#34;error_count&#34;, &#34;nginx/requests&#34;.Metric identifiers are limited to 100 characters and can include only the following characters: A-Z, a-z, 0-9, and the special characters _-.,+!*&#39;,()%/. The forward-slash character (/) denotes a hierarchy of name pieces, and it cannot be the first character of the name.This field is the [METRIC_ID] part of a metric resource name in the format &#34;projects/PROJECT_ID/metrics/METRIC_ID&#34;. Example: If the resource name of a metric is &#34;projects/my-project/metrics/nginx%2Frequests&#34;, this field&#39;s value is &#34;nginx/requests&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. A value_extractor is required when using a distribution logs-based metric to extract the values to record from a log entry. Two functions are supported for value extraction: EXTRACT(field) or REGEXP_EXTRACT(field, regex). The argument are: 1. field: The name of the log entry field from which the value is to be extracted. 2. regex: A regular expression using the Google RE2 syntax (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified log entry field. The value of the field is converted to a string before applying the regex. It is an error to specify a regex that does not include exactly one capture group.The result of the extraction must be convertible to a double type, as the distribution always records double values. If either the extraction or the conversion to double fails, then those values are not recorded in the distribution.Example: REGEXP_EXTRACT(jsonPayload.request, &#34;.*quantity=(\d+).*&#34;)
     * 
     */
    @Import(name="valueExtractor")
    private @Nullable Output<String> valueExtractor;

    /**
     * @return Optional. A value_extractor is required when using a distribution logs-based metric to extract the values to record from a log entry. Two functions are supported for value extraction: EXTRACT(field) or REGEXP_EXTRACT(field, regex). The argument are: 1. field: The name of the log entry field from which the value is to be extracted. 2. regex: A regular expression using the Google RE2 syntax (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified log entry field. The value of the field is converted to a string before applying the regex. It is an error to specify a regex that does not include exactly one capture group.The result of the extraction must be convertible to a double type, as the distribution always records double values. If either the extraction or the conversion to double fails, then those values are not recorded in the distribution.Example: REGEXP_EXTRACT(jsonPayload.request, &#34;.*quantity=(\d+).*&#34;)
     * 
     */
    public Optional<Output<String>> valueExtractor() {
        return Optional.ofNullable(this.valueExtractor);
    }

    /**
     * Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed.
     * 
     * @deprecated
     * Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed.
     * 
     */
    @Deprecated /* Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed. */
    @Import(name="version")
    private @Nullable Output<MetricVersion> version;

    /**
     * @return Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed.
     * 
     * @deprecated
     * Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed.
     * 
     */
    @Deprecated /* Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed. */
    public Optional<Output<MetricVersion>> version() {
        return Optional.ofNullable(this.version);
    }

    private MetricArgs() {}

    private MetricArgs(MetricArgs $) {
        this.bucketOptions = $.bucketOptions;
        this.description = $.description;
        this.disabled = $.disabled;
        this.filter = $.filter;
        this.labelExtractors = $.labelExtractors;
        this.metricDescriptor = $.metricDescriptor;
        this.name = $.name;
        this.project = $.project;
        this.valueExtractor = $.valueExtractor;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricArgs $;

        public Builder() {
            $ = new MetricArgs();
        }

        public Builder(MetricArgs defaults) {
            $ = new MetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketOptions Optional. The bucket_options are required when the logs-based metric is using a DISTRIBUTION value type and it describes the bucket boundaries used to create a histogram of the extracted values.
         * 
         * @return builder
         * 
         */
        public Builder bucketOptions(@Nullable Output<BucketOptionsArgs> bucketOptions) {
            $.bucketOptions = bucketOptions;
            return this;
        }

        /**
         * @param bucketOptions Optional. The bucket_options are required when the logs-based metric is using a DISTRIBUTION value type and it describes the bucket boundaries used to create a histogram of the extracted values.
         * 
         * @return builder
         * 
         */
        public Builder bucketOptions(BucketOptionsArgs bucketOptions) {
            return bucketOptions(Output.of(bucketOptions));
        }

        /**
         * @param description Optional. A description of this metric, which is used in documentation. The maximum length of the description is 8000 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A description of this metric, which is used in documentation. The maximum length of the description is 8000 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disabled Optional. If set to True, then this metric is disabled and it does not generate any points.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Optional. If set to True, then this metric is disabled and it does not generate any points.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param filter An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced_filters) which is used to match log entries. Example: &#34;resource.type=gae_app AND severity&gt;=ERROR&#34; The maximum length of the filter is 20000 characters.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced_filters) which is used to match log entries. Example: &#34;resource.type=gae_app AND severity&gt;=ERROR&#34; The maximum length of the filter is 20000 characters.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param labelExtractors Optional. A map from a label key string to an extractor expression which is used to extract data from a log entry field and assign as the label value. Each label key specified in the LabelDescriptor must have an associated extractor expression in this map. The syntax of the extractor expression is the same as for the value_extractor field.The extracted value is converted to the type defined in the label descriptor. If the either the extraction or the type conversion fails, the label will have a default value. The default value for a string label is an empty string, for an integer label its 0, and for a boolean label its false.Note that there are upper bounds on the maximum number of labels and the number of active time series that are allowed in a project.
         * 
         * @return builder
         * 
         */
        public Builder labelExtractors(@Nullable Output<Map<String,String>> labelExtractors) {
            $.labelExtractors = labelExtractors;
            return this;
        }

        /**
         * @param labelExtractors Optional. A map from a label key string to an extractor expression which is used to extract data from a log entry field and assign as the label value. Each label key specified in the LabelDescriptor must have an associated extractor expression in this map. The syntax of the extractor expression is the same as for the value_extractor field.The extracted value is converted to the type defined in the label descriptor. If the either the extraction or the type conversion fails, the label will have a default value. The default value for a string label is an empty string, for an integer label its 0, and for a boolean label its false.Note that there are upper bounds on the maximum number of labels and the number of active time series that are allowed in a project.
         * 
         * @return builder
         * 
         */
        public Builder labelExtractors(Map<String,String> labelExtractors) {
            return labelExtractors(Output.of(labelExtractors));
        }

        /**
         * @param metricDescriptor Optional. The metric descriptor associated with the logs-based metric. If unspecified, it uses a default metric descriptor with a DELTA metric kind, INT64 value type, with no labels and a unit of &#34;1&#34;. Such a metric counts the number of log entries matching the filter expression.The name, type, and description fields in the metric_descriptor are output only, and is constructed using the name and description field in the LogMetric.To create a logs-based metric that records a distribution of log values, a DELTA metric kind with a DISTRIBUTION value type must be used along with a value_extractor expression in the LogMetric.Each label in the metric descriptor must have a matching label name as the key and an extractor expression as the value in the label_extractors map.The metric_kind and value_type fields in the metric_descriptor cannot be updated once initially configured. New labels can be added in the metric_descriptor, but existing labels cannot be modified except for their description.
         * 
         * @return builder
         * 
         */
        public Builder metricDescriptor(@Nullable Output<MetricDescriptorArgs> metricDescriptor) {
            $.metricDescriptor = metricDescriptor;
            return this;
        }

        /**
         * @param metricDescriptor Optional. The metric descriptor associated with the logs-based metric. If unspecified, it uses a default metric descriptor with a DELTA metric kind, INT64 value type, with no labels and a unit of &#34;1&#34;. Such a metric counts the number of log entries matching the filter expression.The name, type, and description fields in the metric_descriptor are output only, and is constructed using the name and description field in the LogMetric.To create a logs-based metric that records a distribution of log values, a DELTA metric kind with a DISTRIBUTION value type must be used along with a value_extractor expression in the LogMetric.Each label in the metric descriptor must have a matching label name as the key and an extractor expression as the value in the label_extractors map.The metric_kind and value_type fields in the metric_descriptor cannot be updated once initially configured. New labels can be added in the metric_descriptor, but existing labels cannot be modified except for their description.
         * 
         * @return builder
         * 
         */
        public Builder metricDescriptor(MetricDescriptorArgs metricDescriptor) {
            return metricDescriptor(Output.of(metricDescriptor));
        }

        /**
         * @param name The client-assigned metric identifier. Examples: &#34;error_count&#34;, &#34;nginx/requests&#34;.Metric identifiers are limited to 100 characters and can include only the following characters: A-Z, a-z, 0-9, and the special characters _-.,+!*&#39;,()%/. The forward-slash character (/) denotes a hierarchy of name pieces, and it cannot be the first character of the name.This field is the [METRIC_ID] part of a metric resource name in the format &#34;projects/PROJECT_ID/metrics/METRIC_ID&#34;. Example: If the resource name of a metric is &#34;projects/my-project/metrics/nginx%2Frequests&#34;, this field&#39;s value is &#34;nginx/requests&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The client-assigned metric identifier. Examples: &#34;error_count&#34;, &#34;nginx/requests&#34;.Metric identifiers are limited to 100 characters and can include only the following characters: A-Z, a-z, 0-9, and the special characters _-.,+!*&#39;,()%/. The forward-slash character (/) denotes a hierarchy of name pieces, and it cannot be the first character of the name.This field is the [METRIC_ID] part of a metric resource name in the format &#34;projects/PROJECT_ID/metrics/METRIC_ID&#34;. Example: If the resource name of a metric is &#34;projects/my-project/metrics/nginx%2Frequests&#34;, this field&#39;s value is &#34;nginx/requests&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param valueExtractor Optional. A value_extractor is required when using a distribution logs-based metric to extract the values to record from a log entry. Two functions are supported for value extraction: EXTRACT(field) or REGEXP_EXTRACT(field, regex). The argument are: 1. field: The name of the log entry field from which the value is to be extracted. 2. regex: A regular expression using the Google RE2 syntax (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified log entry field. The value of the field is converted to a string before applying the regex. It is an error to specify a regex that does not include exactly one capture group.The result of the extraction must be convertible to a double type, as the distribution always records double values. If either the extraction or the conversion to double fails, then those values are not recorded in the distribution.Example: REGEXP_EXTRACT(jsonPayload.request, &#34;.*quantity=(\d+).*&#34;)
         * 
         * @return builder
         * 
         */
        public Builder valueExtractor(@Nullable Output<String> valueExtractor) {
            $.valueExtractor = valueExtractor;
            return this;
        }

        /**
         * @param valueExtractor Optional. A value_extractor is required when using a distribution logs-based metric to extract the values to record from a log entry. Two functions are supported for value extraction: EXTRACT(field) or REGEXP_EXTRACT(field, regex). The argument are: 1. field: The name of the log entry field from which the value is to be extracted. 2. regex: A regular expression using the Google RE2 syntax (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified log entry field. The value of the field is converted to a string before applying the regex. It is an error to specify a regex that does not include exactly one capture group.The result of the extraction must be convertible to a double type, as the distribution always records double values. If either the extraction or the conversion to double fails, then those values are not recorded in the distribution.Example: REGEXP_EXTRACT(jsonPayload.request, &#34;.*quantity=(\d+).*&#34;)
         * 
         * @return builder
         * 
         */
        public Builder valueExtractor(String valueExtractor) {
            return valueExtractor(Output.of(valueExtractor));
        }

        /**
         * @param version Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed.
         * 
         */
        @Deprecated /* Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed. */
        public Builder version(@Nullable Output<MetricVersion> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed.
         * 
         */
        @Deprecated /* Deprecated. The API version that created or updated this metric. The v2 format is used by default and cannot be changed. */
        public Builder version(MetricVersion version) {
            return version(Output.of(version));
        }

        public MetricArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            return $;
        }
    }

}
