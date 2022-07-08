// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee.v1.inputs.GoogleCloudApigeeV1CustomReportMetricArgs;
import com.pulumi.googlenative.apigee.v1.inputs.GoogleCloudApigeeV1ReportPropertyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReportArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportArgs Empty = new ReportArgs();

    /**
     * This field contains the chart type for the report
     * 
     */
    @Import(name="chartType")
    private @Nullable Output<String> chartType;

    /**
     * @return This field contains the chart type for the report
     * 
     */
    public Optional<Output<String>> chartType() {
        return Optional.ofNullable(this.chartType);
    }

    /**
     * Legacy field: not used. This field contains a list of comments associated with custom report
     * 
     */
    @Import(name="comments")
    private @Nullable Output<List<String>> comments;

    /**
     * @return Legacy field: not used. This field contains a list of comments associated with custom report
     * 
     */
    public Optional<Output<List<String>>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * This contains the list of dimensions for the report
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<List<String>> dimensions;

    /**
     * @return This contains the list of dimensions for the report
     * 
     */
    public Optional<Output<List<String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * This is the display name for the report
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return This is the display name for the report
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * This field contains the filter expression
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return This field contains the filter expression
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Legacy field: not used. Contains the from time for the report
     * 
     */
    @Import(name="fromTime")
    private @Nullable Output<String> fromTime;

    /**
     * @return Legacy field: not used. Contains the from time for the report
     * 
     */
    public Optional<Output<String>> fromTime() {
        return Optional.ofNullable(this.fromTime);
    }

    /**
     * Legacy field: not used This field contains the limit for the result retrieved
     * 
     */
    @Import(name="limit")
    private @Nullable Output<String> limit;

    /**
     * @return Legacy field: not used This field contains the limit for the result retrieved
     * 
     */
    public Optional<Output<String>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * This contains the list of metrics
     * 
     */
    @Import(name="metrics", required=true)
    private Output<List<GoogleCloudApigeeV1CustomReportMetricArgs>> metrics;

    /**
     * @return This contains the list of metrics
     * 
     */
    public Output<List<GoogleCloudApigeeV1CustomReportMetricArgs>> metrics() {
        return this.metrics;
    }

    /**
     * Unique identifier for the report T his is a legacy field used to encode custom report unique id
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier for the report T his is a legacy field used to encode custom report unique id
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Legacy field: not used. This field contains the offset for the data
     * 
     */
    @Import(name="offset")
    private @Nullable Output<String> offset;

    /**
     * @return Legacy field: not used. This field contains the offset for the data
     * 
     */
    public Optional<Output<String>> offset() {
        return Optional.ofNullable(this.offset);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * This field contains report properties such as ui metadata etc.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<List<GoogleCloudApigeeV1ReportPropertyArgs>> properties;

    /**
     * @return This field contains report properties such as ui metadata etc.
     * 
     */
    public Optional<Output<List<GoogleCloudApigeeV1ReportPropertyArgs>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Legacy field: not used much. Contains the list of sort by columns
     * 
     */
    @Import(name="sortByCols")
    private @Nullable Output<List<String>> sortByCols;

    /**
     * @return Legacy field: not used much. Contains the list of sort by columns
     * 
     */
    public Optional<Output<List<String>>> sortByCols() {
        return Optional.ofNullable(this.sortByCols);
    }

    /**
     * Legacy field: not used much. Contains the sort order for the sort columns
     * 
     */
    @Import(name="sortOrder")
    private @Nullable Output<String> sortOrder;

    /**
     * @return Legacy field: not used much. Contains the sort order for the sort columns
     * 
     */
    public Optional<Output<String>> sortOrder() {
        return Optional.ofNullable(this.sortOrder);
    }

    /**
     * Legacy field: not used. This field contains a list of tags associated with custom report
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Legacy field: not used. This field contains a list of tags associated with custom report
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * This field contains the time unit of aggregation for the report
     * 
     */
    @Import(name="timeUnit")
    private @Nullable Output<String> timeUnit;

    /**
     * @return This field contains the time unit of aggregation for the report
     * 
     */
    public Optional<Output<String>> timeUnit() {
        return Optional.ofNullable(this.timeUnit);
    }

    /**
     * Legacy field: not used. Contains the end time for the report
     * 
     */
    @Import(name="toTime")
    private @Nullable Output<String> toTime;

    /**
     * @return Legacy field: not used. Contains the end time for the report
     * 
     */
    public Optional<Output<String>> toTime() {
        return Optional.ofNullable(this.toTime);
    }

    /**
     * Legacy field: not used. This field contains the top k parameter value for restricting the result
     * 
     */
    @Import(name="topk")
    private @Nullable Output<String> topk;

    /**
     * @return Legacy field: not used. This field contains the top k parameter value for restricting the result
     * 
     */
    public Optional<Output<String>> topk() {
        return Optional.ofNullable(this.topk);
    }

    private ReportArgs() {}

    private ReportArgs(ReportArgs $) {
        this.chartType = $.chartType;
        this.comments = $.comments;
        this.dimensions = $.dimensions;
        this.displayName = $.displayName;
        this.filter = $.filter;
        this.fromTime = $.fromTime;
        this.limit = $.limit;
        this.metrics = $.metrics;
        this.name = $.name;
        this.offset = $.offset;
        this.organizationId = $.organizationId;
        this.properties = $.properties;
        this.sortByCols = $.sortByCols;
        this.sortOrder = $.sortOrder;
        this.tags = $.tags;
        this.timeUnit = $.timeUnit;
        this.toTime = $.toTime;
        this.topk = $.topk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportArgs $;

        public Builder() {
            $ = new ReportArgs();
        }

        public Builder(ReportArgs defaults) {
            $ = new ReportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param chartType This field contains the chart type for the report
         * 
         * @return builder
         * 
         */
        public Builder chartType(@Nullable Output<String> chartType) {
            $.chartType = chartType;
            return this;
        }

        /**
         * @param chartType This field contains the chart type for the report
         * 
         * @return builder
         * 
         */
        public Builder chartType(String chartType) {
            return chartType(Output.of(chartType));
        }

        /**
         * @param comments Legacy field: not used. This field contains a list of comments associated with custom report
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<List<String>> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments Legacy field: not used. This field contains a list of comments associated with custom report
         * 
         * @return builder
         * 
         */
        public Builder comments(List<String> comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param comments Legacy field: not used. This field contains a list of comments associated with custom report
         * 
         * @return builder
         * 
         */
        public Builder comments(String... comments) {
            return comments(List.of(comments));
        }

        /**
         * @param dimensions This contains the list of dimensions for the report
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<List<String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions This contains the list of dimensions for the report
         * 
         * @return builder
         * 
         */
        public Builder dimensions(List<String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param dimensions This contains the list of dimensions for the report
         * 
         * @return builder
         * 
         */
        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param displayName This is the display name for the report
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName This is the display name for the report
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param filter This field contains the filter expression
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter This field contains the filter expression
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param fromTime Legacy field: not used. Contains the from time for the report
         * 
         * @return builder
         * 
         */
        public Builder fromTime(@Nullable Output<String> fromTime) {
            $.fromTime = fromTime;
            return this;
        }

        /**
         * @param fromTime Legacy field: not used. Contains the from time for the report
         * 
         * @return builder
         * 
         */
        public Builder fromTime(String fromTime) {
            return fromTime(Output.of(fromTime));
        }

        /**
         * @param limit Legacy field: not used This field contains the limit for the result retrieved
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<String> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Legacy field: not used This field contains the limit for the result retrieved
         * 
         * @return builder
         * 
         */
        public Builder limit(String limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param metrics This contains the list of metrics
         * 
         * @return builder
         * 
         */
        public Builder metrics(Output<List<GoogleCloudApigeeV1CustomReportMetricArgs>> metrics) {
            $.metrics = metrics;
            return this;
        }

        /**
         * @param metrics This contains the list of metrics
         * 
         * @return builder
         * 
         */
        public Builder metrics(List<GoogleCloudApigeeV1CustomReportMetricArgs> metrics) {
            return metrics(Output.of(metrics));
        }

        /**
         * @param metrics This contains the list of metrics
         * 
         * @return builder
         * 
         */
        public Builder metrics(GoogleCloudApigeeV1CustomReportMetricArgs... metrics) {
            return metrics(List.of(metrics));
        }

        /**
         * @param name Unique identifier for the report T his is a legacy field used to encode custom report unique id
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the report T his is a legacy field used to encode custom report unique id
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param offset Legacy field: not used. This field contains the offset for the data
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Output<String> offset) {
            $.offset = offset;
            return this;
        }

        /**
         * @param offset Legacy field: not used. This field contains the offset for the data
         * 
         * @return builder
         * 
         */
        public Builder offset(String offset) {
            return offset(Output.of(offset));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param properties This field contains report properties such as ui metadata etc.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<List<GoogleCloudApigeeV1ReportPropertyArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties This field contains report properties such as ui metadata etc.
         * 
         * @return builder
         * 
         */
        public Builder properties(List<GoogleCloudApigeeV1ReportPropertyArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties This field contains report properties such as ui metadata etc.
         * 
         * @return builder
         * 
         */
        public Builder properties(GoogleCloudApigeeV1ReportPropertyArgs... properties) {
            return properties(List.of(properties));
        }

        /**
         * @param sortByCols Legacy field: not used much. Contains the list of sort by columns
         * 
         * @return builder
         * 
         */
        public Builder sortByCols(@Nullable Output<List<String>> sortByCols) {
            $.sortByCols = sortByCols;
            return this;
        }

        /**
         * @param sortByCols Legacy field: not used much. Contains the list of sort by columns
         * 
         * @return builder
         * 
         */
        public Builder sortByCols(List<String> sortByCols) {
            return sortByCols(Output.of(sortByCols));
        }

        /**
         * @param sortByCols Legacy field: not used much. Contains the list of sort by columns
         * 
         * @return builder
         * 
         */
        public Builder sortByCols(String... sortByCols) {
            return sortByCols(List.of(sortByCols));
        }

        /**
         * @param sortOrder Legacy field: not used much. Contains the sort order for the sort columns
         * 
         * @return builder
         * 
         */
        public Builder sortOrder(@Nullable Output<String> sortOrder) {
            $.sortOrder = sortOrder;
            return this;
        }

        /**
         * @param sortOrder Legacy field: not used much. Contains the sort order for the sort columns
         * 
         * @return builder
         * 
         */
        public Builder sortOrder(String sortOrder) {
            return sortOrder(Output.of(sortOrder));
        }

        /**
         * @param tags Legacy field: not used. This field contains a list of tags associated with custom report
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Legacy field: not used. This field contains a list of tags associated with custom report
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Legacy field: not used. This field contains a list of tags associated with custom report
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param timeUnit This field contains the time unit of aggregation for the report
         * 
         * @return builder
         * 
         */
        public Builder timeUnit(@Nullable Output<String> timeUnit) {
            $.timeUnit = timeUnit;
            return this;
        }

        /**
         * @param timeUnit This field contains the time unit of aggregation for the report
         * 
         * @return builder
         * 
         */
        public Builder timeUnit(String timeUnit) {
            return timeUnit(Output.of(timeUnit));
        }

        /**
         * @param toTime Legacy field: not used. Contains the end time for the report
         * 
         * @return builder
         * 
         */
        public Builder toTime(@Nullable Output<String> toTime) {
            $.toTime = toTime;
            return this;
        }

        /**
         * @param toTime Legacy field: not used. Contains the end time for the report
         * 
         * @return builder
         * 
         */
        public Builder toTime(String toTime) {
            return toTime(Output.of(toTime));
        }

        /**
         * @param topk Legacy field: not used. This field contains the top k parameter value for restricting the result
         * 
         * @return builder
         * 
         */
        public Builder topk(@Nullable Output<String> topk) {
            $.topk = topk;
            return this;
        }

        /**
         * @param topk Legacy field: not used. This field contains the top k parameter value for restricting the result
         * 
         * @return builder
         * 
         */
        public Builder topk(String topk) {
            return topk(Output.of(topk));
        }

        public ReportArgs build() {
            $.metrics = Objects.requireNonNull($.metrics, "expected parameter 'metrics' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
