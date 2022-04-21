// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A condition type that checks whether a log message in the scoping project (https://cloud.google.com/monitoring/api/v3#project_name) satisfies the given filter. Logs from other projects in the metrics scope are not evaluated.
 * 
 */
public final class LogMatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogMatchResponse Empty = new LogMatchResponse();

    /**
     * A logs-based filter. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries) for how this filter should be constructed.
     * 
     */
    @Import(name="filter", required=true)
    private String filter;

    public String filter() {
        return this.filter;
    }

    /**
     * Optional. A map from a label key to an extractor expression, which is used to extract the value for this label key. Each entry in this map is a specification for how data should be extracted from log entries that match filter. Each combination of extracted values is treated as a separate rule for the purposes of triggering notifications. Label keys and corresponding values can be used in notifications generated by this condition.Please see the documentation on logs-based metric valueExtractors (https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.metrics#LogMetric.FIELDS.value_extractor) for syntax and examples.
     * 
     */
    @Import(name="labelExtractors", required=true)
    private Map<String,String> labelExtractors;

    public Map<String,String> labelExtractors() {
        return this.labelExtractors;
    }

    private LogMatchResponse() {}

    private LogMatchResponse(LogMatchResponse $) {
        this.filter = $.filter;
        this.labelExtractors = $.labelExtractors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogMatchResponse $;

        public Builder() {
            $ = new LogMatchResponse();
        }

        public Builder(LogMatchResponse defaults) {
            $ = new LogMatchResponse(Objects.requireNonNull(defaults));
        }

        public Builder filter(String filter) {
            $.filter = filter;
            return this;
        }

        public Builder labelExtractors(Map<String,String> labelExtractors) {
            $.labelExtractors = labelExtractors;
            return this;
        }

        public LogMatchResponse build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.labelExtractors = Objects.requireNonNull($.labelExtractors, "expected parameter 'labelExtractors' to be non-null");
            return $;
        }
    }

}
