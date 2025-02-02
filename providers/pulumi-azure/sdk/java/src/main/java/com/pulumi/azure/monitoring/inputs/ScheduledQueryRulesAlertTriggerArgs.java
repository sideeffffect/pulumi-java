// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerMetricTriggerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledQueryRulesAlertTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryRulesAlertTriggerArgs Empty = new ScheduledQueryRulesAlertTriggerArgs();

    /**
     * A `metric_trigger` block as defined above. Trigger condition for metric query rule.
     * 
     */
    @Import(name="metricTrigger")
    private @Nullable Output<ScheduledQueryRulesAlertTriggerMetricTriggerArgs> metricTrigger;

    /**
     * @return A `metric_trigger` block as defined above. Trigger condition for metric query rule.
     * 
     */
    public Optional<Output<ScheduledQueryRulesAlertTriggerMetricTriggerArgs>> metricTrigger() {
        return Optional.ofNullable(this.metricTrigger);
    }

    /**
     * Evaluation operation for rule - &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return Evaluation operation for rule - &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * Result or count threshold based on which rule should be triggered.  Values must be between 0 and 10000 inclusive.
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    /**
     * @return Result or count threshold based on which rule should be triggered.  Values must be between 0 and 10000 inclusive.
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }

    private ScheduledQueryRulesAlertTriggerArgs() {}

    private ScheduledQueryRulesAlertTriggerArgs(ScheduledQueryRulesAlertTriggerArgs $) {
        this.metricTrigger = $.metricTrigger;
        this.operator = $.operator;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledQueryRulesAlertTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryRulesAlertTriggerArgs $;

        public Builder() {
            $ = new ScheduledQueryRulesAlertTriggerArgs();
        }

        public Builder(ScheduledQueryRulesAlertTriggerArgs defaults) {
            $ = new ScheduledQueryRulesAlertTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricTrigger A `metric_trigger` block as defined above. Trigger condition for metric query rule.
         * 
         * @return builder
         * 
         */
        public Builder metricTrigger(@Nullable Output<ScheduledQueryRulesAlertTriggerMetricTriggerArgs> metricTrigger) {
            $.metricTrigger = metricTrigger;
            return this;
        }

        /**
         * @param metricTrigger A `metric_trigger` block as defined above. Trigger condition for metric query rule.
         * 
         * @return builder
         * 
         */
        public Builder metricTrigger(ScheduledQueryRulesAlertTriggerMetricTriggerArgs metricTrigger) {
            return metricTrigger(Output.of(metricTrigger));
        }

        /**
         * @param operator Evaluation operation for rule - &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Evaluation operation for rule - &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param threshold Result or count threshold based on which rule should be triggered.  Values must be between 0 and 10000 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold Result or count threshold based on which rule should be triggered.  Values must be between 0 and 10000 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public ScheduledQueryRulesAlertTriggerArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            return $;
        }
    }

}
