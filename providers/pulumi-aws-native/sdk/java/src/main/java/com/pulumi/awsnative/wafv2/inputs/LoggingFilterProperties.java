// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.LoggingConfigurationLoggingFilterPropertiesDefaultBehavior;
import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
 * 
 */
public final class LoggingFilterProperties extends com.pulumi.resources.InvokeArgs {

    public static final LoggingFilterProperties Empty = new LoggingFilterProperties();

    /**
     * Default handling for logs that don&#39;t match any of the specified filtering conditions.
     * 
     */
    @Import(name="defaultBehavior", required=true)
    private LoggingConfigurationLoggingFilterPropertiesDefaultBehavior defaultBehavior;

    public LoggingConfigurationLoggingFilterPropertiesDefaultBehavior defaultBehavior() {
        return this.defaultBehavior;
    }

    /**
     * The filters that you want to apply to the logs.
     * 
     */
    @Import(name="filters", required=true)
    private List<LoggingConfigurationFilter> filters;

    public List<LoggingConfigurationFilter> filters() {
        return this.filters;
    }

    private LoggingFilterProperties() {}

    private LoggingFilterProperties(LoggingFilterProperties $) {
        this.defaultBehavior = $.defaultBehavior;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingFilterProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingFilterProperties $;

        public Builder() {
            $ = new LoggingFilterProperties();
        }

        public Builder(LoggingFilterProperties defaults) {
            $ = new LoggingFilterProperties(Objects.requireNonNull(defaults));
        }

        public Builder defaultBehavior(LoggingConfigurationLoggingFilterPropertiesDefaultBehavior defaultBehavior) {
            $.defaultBehavior = defaultBehavior;
            return this;
        }

        public Builder filters(List<LoggingConfigurationFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(LoggingConfigurationFilter... filters) {
            return filters(List.of(filters));
        }

        public LoggingFilterProperties build() {
            $.defaultBehavior = Objects.requireNonNull($.defaultBehavior, "expected parameter 'defaultBehavior' to be non-null");
            $.filters = Objects.requireNonNull($.filters, "expected parameter 'filters' to be non-null");
            return $;
        }
    }

}
