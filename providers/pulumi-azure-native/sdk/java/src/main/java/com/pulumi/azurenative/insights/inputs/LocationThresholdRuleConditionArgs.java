// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceArgs;
import com.pulumi.azurenative.insights.inputs.RuleMetricDataSourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule condition based on a certain number of locations failing.
 * 
 */
public final class LocationThresholdRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationThresholdRuleConditionArgs Empty = new LocationThresholdRuleConditionArgs();

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @Import(name="dataSource")
    private @Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;

    public Optional<Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>>> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }

    /**
     * the number of locations that must fail to activate the alert.
     * 
     */
    @Import(name="failedLocationCount", required=true)
    private Output<Integer> failedLocationCount;

    public Output<Integer> failedLocationCount() {
        return this.failedLocationCount;
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.LocationThresholdRuleCondition&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    @Import(name="windowSize")
    private @Nullable Output<String> windowSize;

    public Optional<Output<String>> windowSize() {
        return Optional.ofNullable(this.windowSize);
    }

    private LocationThresholdRuleConditionArgs() {}

    private LocationThresholdRuleConditionArgs(LocationThresholdRuleConditionArgs $) {
        this.dataSource = $.dataSource;
        this.failedLocationCount = $.failedLocationCount;
        this.odataType = $.odataType;
        this.windowSize = $.windowSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationThresholdRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationThresholdRuleConditionArgs $;

        public Builder() {
            $ = new LocationThresholdRuleConditionArgs();
        }

        public Builder(LocationThresholdRuleConditionArgs defaults) {
            $ = new LocationThresholdRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataSource(@Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        public Builder dataSource(Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs> dataSource) {
            return dataSource(Output.of(dataSource));
        }

        public Builder failedLocationCount(Output<Integer> failedLocationCount) {
            $.failedLocationCount = failedLocationCount;
            return this;
        }

        public Builder failedLocationCount(Integer failedLocationCount) {
            return failedLocationCount(Output.of(failedLocationCount));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public Builder windowSize(@Nullable Output<String> windowSize) {
            $.windowSize = windowSize;
            return this;
        }

        public Builder windowSize(String windowSize) {
            return windowSize(Output.of(windowSize));
        }

        public LocationThresholdRuleConditionArgs build() {
            $.failedLocationCount = Objects.requireNonNull($.failedLocationCount, "expected parameter 'failedLocationCount' to be non-null");
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
