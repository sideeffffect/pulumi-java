// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.ScheduledQueryRulesAlertTriggerMetricTrigger;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduledQueryRulesAlertTrigger {
    /**
     * @return A `metric_trigger` block as defined above. Trigger condition for metric query rule.
     * 
     */
    private final @Nullable ScheduledQueryRulesAlertTriggerMetricTrigger metricTrigger;
    /**
     * @return Evaluation operation for rule - &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
     * 
     */
    private final String operator;
    /**
     * @return Result or count threshold based on which rule should be triggered.  Values must be between 0 and 10000 inclusive.
     * 
     */
    private final Double threshold;

    @CustomType.Constructor
    private ScheduledQueryRulesAlertTrigger(
        @CustomType.Parameter("metricTrigger") @Nullable ScheduledQueryRulesAlertTriggerMetricTrigger metricTrigger,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("threshold") Double threshold) {
        this.metricTrigger = metricTrigger;
        this.operator = operator;
        this.threshold = threshold;
    }

    /**
     * @return A `metric_trigger` block as defined above. Trigger condition for metric query rule.
     * 
     */
    public Optional<ScheduledQueryRulesAlertTriggerMetricTrigger> metricTrigger() {
        return Optional.ofNullable(this.metricTrigger);
    }
    /**
     * @return Evaluation operation for rule - &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Result or count threshold based on which rule should be triggered.  Values must be between 0 and 10000 inclusive.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryRulesAlertTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ScheduledQueryRulesAlertTriggerMetricTrigger metricTrigger;
        private String operator;
        private Double threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryRulesAlertTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTrigger = defaults.metricTrigger;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
        }

        public Builder metricTrigger(@Nullable ScheduledQueryRulesAlertTriggerMetricTrigger metricTrigger) {
            this.metricTrigger = metricTrigger;
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }        public ScheduledQueryRulesAlertTrigger build() {
            return new ScheduledQueryRulesAlertTrigger(metricTrigger, operator, threshold);
        }
    }
}
