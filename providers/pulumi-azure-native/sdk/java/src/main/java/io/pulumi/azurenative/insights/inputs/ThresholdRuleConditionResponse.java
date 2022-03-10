// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceResponse;
import io.pulumi.azurenative.insights.inputs.RuleMetricDataSourceResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule condition based on a metric crossing a threshold.
 * 
 */
public final class ThresholdRuleConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ThresholdRuleConditionResponse Empty = new ThresholdRuleConditionResponse();

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @InputImport(name="dataSource")
      private final @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;

    public Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> getDataSource() {
        return this.dataSource == null ? null : this.dataSource;
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.ThresholdRuleCondition'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * the operator used to compare the data and the threshold.
     * 
     */
    @InputImport(name="operator", required=true)
      private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * the threshold value that activates the alert.
     * 
     */
    @InputImport(name="threshold", required=true)
      private final Double threshold;

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * the time aggregation operator. How the data that are collected should be combined over time. The default value is the PrimaryAggregationType of the Metric.
     * 
     */
    @InputImport(name="timeAggregation")
      private final @Nullable String timeAggregation;

    public Optional<String> getTimeAggregation() {
        return this.timeAggregation == null ? Optional.empty() : Optional.ofNullable(this.timeAggregation);
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    @InputImport(name="windowSize")
      private final @Nullable String windowSize;

    public Optional<String> getWindowSize() {
        return this.windowSize == null ? Optional.empty() : Optional.ofNullable(this.windowSize);
    }

    public ThresholdRuleConditionResponse(
        @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource,
        String odataType,
        String operator,
        Double threshold,
        @Nullable String timeAggregation,
        @Nullable String windowSize) {
        this.dataSource = dataSource;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.timeAggregation = timeAggregation;
        this.windowSize = windowSize;
    }

    private ThresholdRuleConditionResponse() {
        this.dataSource = null;
        this.odataType = null;
        this.operator = null;
        this.threshold = null;
        this.timeAggregation = null;
        this.windowSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThresholdRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
        private String odataType;
        private String operator;
        private Double threshold;
        private @Nullable String timeAggregation;
        private @Nullable String windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ThresholdRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.timeAggregation = defaults.timeAggregation;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder dataSource(@Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder timeAggregation(@Nullable String timeAggregation) {
            this.timeAggregation = timeAggregation;
            return this;
        }

        public Builder windowSize(@Nullable String windowSize) {
            this.windowSize = windowSize;
            return this;
        }
        public ThresholdRuleConditionResponse build() {
            return new ThresholdRuleConditionResponse(dataSource, odataType, operator, threshold, timeAggregation, windowSize);
        }
    }
}
