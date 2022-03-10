// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricAlarmState extends io.pulumi.resources.ResourceArgs {

    public static final MetricAlarmState Empty = new MetricAlarmState();

    /**
     * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
     * 
     */
    @InputImport(name="actionsEnabled")
      private final @Nullable Input<Boolean> actionsEnabled;

    public Input<Boolean> getActionsEnabled() {
        return this.actionsEnabled == null ? Input.empty() : this.actionsEnabled;
    }

    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="alarmActions")
      private final @Nullable Input<List<String>> alarmActions;

    public Input<List<String>> getAlarmActions() {
        return this.alarmActions == null ? Input.empty() : this.alarmActions;
    }

    /**
     * The description for the alarm.
     * 
     */
    @InputImport(name="alarmDescription")
      private final @Nullable Input<String> alarmDescription;

    public Input<String> getAlarmDescription() {
        return this.alarmDescription == null ? Input.empty() : this.alarmDescription;
    }

    /**
     * The ARN of the CloudWatch Metric Alarm.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
     * 
     */
    @InputImport(name="comparisonOperator")
      private final @Nullable Input<String> comparisonOperator;

    public Input<String> getComparisonOperator() {
        return this.comparisonOperator == null ? Input.empty() : this.comparisonOperator;
    }

    /**
     * The number of datapoints that must be breaching to trigger the alarm.
     * 
     */
    @InputImport(name="datapointsToAlarm")
      private final @Nullable Input<Integer> datapointsToAlarm;

    public Input<Integer> getDatapointsToAlarm() {
        return this.datapointsToAlarm == null ? Input.empty() : this.datapointsToAlarm;
    }

    /**
     * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @InputImport(name="dimensions")
      private final @Nullable Input<Map<String,String>> dimensions;

    public Input<Map<String,String>> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    /**
     * Used only for alarms
     * based on percentiles. If you specify `ignore`, the alarm state will not
     * change during periods with too few data points to be statistically significant.
     * If you specify `evaluate` or omit this parameter, the alarm will always be
     * evaluated and possibly change state no matter how many data points are available.
     * The following values are supported: `ignore`, and `evaluate`.
     * 
     */
    @InputImport(name="evaluateLowSampleCountPercentiles")
      private final @Nullable Input<String> evaluateLowSampleCountPercentiles;

    public Input<String> getEvaluateLowSampleCountPercentiles() {
        return this.evaluateLowSampleCountPercentiles == null ? Input.empty() : this.evaluateLowSampleCountPercentiles;
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     */
    @InputImport(name="evaluationPeriods")
      private final @Nullable Input<Integer> evaluationPeriods;

    public Input<Integer> getEvaluationPeriods() {
        return this.evaluationPeriods == null ? Input.empty() : this.evaluationPeriods;
    }

    /**
     * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * 
     */
    @InputImport(name="extendedStatistic")
      private final @Nullable Input<String> extendedStatistic;

    public Input<String> getExtendedStatistic() {
        return this.extendedStatistic == null ? Input.empty() : this.extendedStatistic;
    }

    /**
     * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="insufficientDataActions")
      private final @Nullable Input<List<String>> insufficientDataActions;

    public Input<List<String>> getInsufficientDataActions() {
        return this.insufficientDataActions == null ? Input.empty() : this.insufficientDataActions;
    }

    /**
     * The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @InputImport(name="metricName")
      private final @Nullable Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName == null ? Input.empty() : this.metricName;
    }

    /**
     * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * 
     */
    @InputImport(name="metricQueries")
      private final @Nullable Input<List<MetricAlarmMetricQueryGetArgs>> metricQueries;

    public Input<List<MetricAlarmMetricQueryGetArgs>> getMetricQueries() {
        return this.metricQueries == null ? Input.empty() : this.metricQueries;
    }

    /**
     * The descriptive name for the alarm. This name must be unique within the user's AWS account
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="okActions")
      private final @Nullable Input<List<String>> okActions;

    public Input<List<String>> getOkActions() {
        return this.okActions == null ? Input.empty() : this.okActions;
    }

    /**
     * The period in seconds over which the specified `stat` is applied.
     * 
     */
    @InputImport(name="period")
      private final @Nullable Input<Integer> period;

    public Input<Integer> getPeriod() {
        return this.period == null ? Input.empty() : this.period;
    }

    /**
     * The statistic to apply to the alarm's associated metric.
     * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
     * 
     */
    @InputImport(name="statistic")
      private final @Nullable Input<String> statistic;

    public Input<String> getStatistic() {
        return this.statistic == null ? Input.empty() : this.statistic;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
     * 
     */
    @InputImport(name="threshold")
      private final @Nullable Input<Double> threshold;

    public Input<Double> getThreshold() {
        return this.threshold == null ? Input.empty() : this.threshold;
    }

    /**
     * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
     * 
     */
    @InputImport(name="thresholdMetricId")
      private final @Nullable Input<String> thresholdMetricId;

    public Input<String> getThresholdMetricId() {
        return this.thresholdMetricId == null ? Input.empty() : this.thresholdMetricId;
    }

    /**
     * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
     * 
     */
    @InputImport(name="treatMissingData")
      private final @Nullable Input<String> treatMissingData;

    public Input<String> getTreatMissingData() {
        return this.treatMissingData == null ? Input.empty() : this.treatMissingData;
    }

    /**
     * The unit for this metric.
     * 
     */
    @InputImport(name="unit")
      private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    public MetricAlarmState(
        @Nullable Input<Boolean> actionsEnabled,
        @Nullable Input<List<String>> alarmActions,
        @Nullable Input<String> alarmDescription,
        @Nullable Input<String> arn,
        @Nullable Input<String> comparisonOperator,
        @Nullable Input<Integer> datapointsToAlarm,
        @Nullable Input<Map<String,String>> dimensions,
        @Nullable Input<String> evaluateLowSampleCountPercentiles,
        @Nullable Input<Integer> evaluationPeriods,
        @Nullable Input<String> extendedStatistic,
        @Nullable Input<List<String>> insufficientDataActions,
        @Nullable Input<String> metricName,
        @Nullable Input<List<MetricAlarmMetricQueryGetArgs>> metricQueries,
        @Nullable Input<String> name,
        @Nullable Input<String> namespace,
        @Nullable Input<List<String>> okActions,
        @Nullable Input<Integer> period,
        @Nullable Input<String> statistic,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Double> threshold,
        @Nullable Input<String> thresholdMetricId,
        @Nullable Input<String> treatMissingData,
        @Nullable Input<String> unit) {
        this.actionsEnabled = actionsEnabled;
        this.alarmActions = alarmActions;
        this.alarmDescription = alarmDescription;
        this.arn = arn;
        this.comparisonOperator = comparisonOperator;
        this.datapointsToAlarm = datapointsToAlarm;
        this.dimensions = dimensions;
        this.evaluateLowSampleCountPercentiles = evaluateLowSampleCountPercentiles;
        this.evaluationPeriods = evaluationPeriods;
        this.extendedStatistic = extendedStatistic;
        this.insufficientDataActions = insufficientDataActions;
        this.metricName = metricName;
        this.metricQueries = metricQueries;
        this.name = name;
        this.namespace = namespace;
        this.okActions = okActions;
        this.period = period;
        this.statistic = statistic;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.threshold = threshold;
        this.thresholdMetricId = thresholdMetricId;
        this.treatMissingData = treatMissingData;
        this.unit = unit;
    }

    private MetricAlarmState() {
        this.actionsEnabled = Input.empty();
        this.alarmActions = Input.empty();
        this.alarmDescription = Input.empty();
        this.arn = Input.empty();
        this.comparisonOperator = Input.empty();
        this.datapointsToAlarm = Input.empty();
        this.dimensions = Input.empty();
        this.evaluateLowSampleCountPercentiles = Input.empty();
        this.evaluationPeriods = Input.empty();
        this.extendedStatistic = Input.empty();
        this.insufficientDataActions = Input.empty();
        this.metricName = Input.empty();
        this.metricQueries = Input.empty();
        this.name = Input.empty();
        this.namespace = Input.empty();
        this.okActions = Input.empty();
        this.period = Input.empty();
        this.statistic = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.threshold = Input.empty();
        this.thresholdMetricId = Input.empty();
        this.treatMissingData = Input.empty();
        this.unit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlarmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> actionsEnabled;
        private @Nullable Input<List<String>> alarmActions;
        private @Nullable Input<String> alarmDescription;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> comparisonOperator;
        private @Nullable Input<Integer> datapointsToAlarm;
        private @Nullable Input<Map<String,String>> dimensions;
        private @Nullable Input<String> evaluateLowSampleCountPercentiles;
        private @Nullable Input<Integer> evaluationPeriods;
        private @Nullable Input<String> extendedStatistic;
        private @Nullable Input<List<String>> insufficientDataActions;
        private @Nullable Input<String> metricName;
        private @Nullable Input<List<MetricAlarmMetricQueryGetArgs>> metricQueries;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespace;
        private @Nullable Input<List<String>> okActions;
        private @Nullable Input<Integer> period;
        private @Nullable Input<String> statistic;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Double> threshold;
        private @Nullable Input<String> thresholdMetricId;
        private @Nullable Input<String> treatMissingData;
        private @Nullable Input<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlarmState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsEnabled = defaults.actionsEnabled;
    	      this.alarmActions = defaults.alarmActions;
    	      this.alarmDescription = defaults.alarmDescription;
    	      this.arn = defaults.arn;
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.datapointsToAlarm = defaults.datapointsToAlarm;
    	      this.dimensions = defaults.dimensions;
    	      this.evaluateLowSampleCountPercentiles = defaults.evaluateLowSampleCountPercentiles;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.extendedStatistic = defaults.extendedStatistic;
    	      this.insufficientDataActions = defaults.insufficientDataActions;
    	      this.metricName = defaults.metricName;
    	      this.metricQueries = defaults.metricQueries;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.okActions = defaults.okActions;
    	      this.period = defaults.period;
    	      this.statistic = defaults.statistic;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.threshold = defaults.threshold;
    	      this.thresholdMetricId = defaults.thresholdMetricId;
    	      this.treatMissingData = defaults.treatMissingData;
    	      this.unit = defaults.unit;
        }

        public Builder actionsEnabled(@Nullable Input<Boolean> actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }

        public Builder actionsEnabled(@Nullable Boolean actionsEnabled) {
            this.actionsEnabled = Input.ofNullable(actionsEnabled);
            return this;
        }

        public Builder alarmActions(@Nullable Input<List<String>> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }

        public Builder alarmActions(@Nullable List<String> alarmActions) {
            this.alarmActions = Input.ofNullable(alarmActions);
            return this;
        }

        public Builder alarmDescription(@Nullable Input<String> alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }

        public Builder alarmDescription(@Nullable String alarmDescription) {
            this.alarmDescription = Input.ofNullable(alarmDescription);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder comparisonOperator(@Nullable Input<String> comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        public Builder comparisonOperator(@Nullable String comparisonOperator) {
            this.comparisonOperator = Input.ofNullable(comparisonOperator);
            return this;
        }

        public Builder datapointsToAlarm(@Nullable Input<Integer> datapointsToAlarm) {
            this.datapointsToAlarm = datapointsToAlarm;
            return this;
        }

        public Builder datapointsToAlarm(@Nullable Integer datapointsToAlarm) {
            this.datapointsToAlarm = Input.ofNullable(datapointsToAlarm);
            return this;
        }

        public Builder dimensions(@Nullable Input<Map<String,String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder evaluateLowSampleCountPercentiles(@Nullable Input<String> evaluateLowSampleCountPercentiles) {
            this.evaluateLowSampleCountPercentiles = evaluateLowSampleCountPercentiles;
            return this;
        }

        public Builder evaluateLowSampleCountPercentiles(@Nullable String evaluateLowSampleCountPercentiles) {
            this.evaluateLowSampleCountPercentiles = Input.ofNullable(evaluateLowSampleCountPercentiles);
            return this;
        }

        public Builder evaluationPeriods(@Nullable Input<Integer> evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }

        public Builder evaluationPeriods(@Nullable Integer evaluationPeriods) {
            this.evaluationPeriods = Input.ofNullable(evaluationPeriods);
            return this;
        }

        public Builder extendedStatistic(@Nullable Input<String> extendedStatistic) {
            this.extendedStatistic = extendedStatistic;
            return this;
        }

        public Builder extendedStatistic(@Nullable String extendedStatistic) {
            this.extendedStatistic = Input.ofNullable(extendedStatistic);
            return this;
        }

        public Builder insufficientDataActions(@Nullable Input<List<String>> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }

        public Builder insufficientDataActions(@Nullable List<String> insufficientDataActions) {
            this.insufficientDataActions = Input.ofNullable(insufficientDataActions);
            return this;
        }

        public Builder metricName(@Nullable Input<String> metricName) {
            this.metricName = metricName;
            return this;
        }

        public Builder metricName(@Nullable String metricName) {
            this.metricName = Input.ofNullable(metricName);
            return this;
        }

        public Builder metricQueries(@Nullable Input<List<MetricAlarmMetricQueryGetArgs>> metricQueries) {
            this.metricQueries = metricQueries;
            return this;
        }

        public Builder metricQueries(@Nullable List<MetricAlarmMetricQueryGetArgs> metricQueries) {
            this.metricQueries = Input.ofNullable(metricQueries);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder namespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder okActions(@Nullable Input<List<String>> okActions) {
            this.okActions = okActions;
            return this;
        }

        public Builder okActions(@Nullable List<String> okActions) {
            this.okActions = Input.ofNullable(okActions);
            return this;
        }

        public Builder period(@Nullable Input<Integer> period) {
            this.period = period;
            return this;
        }

        public Builder period(@Nullable Integer period) {
            this.period = Input.ofNullable(period);
            return this;
        }

        public Builder statistic(@Nullable Input<String> statistic) {
            this.statistic = statistic;
            return this;
        }

        public Builder statistic(@Nullable String statistic) {
            this.statistic = Input.ofNullable(statistic);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder threshold(@Nullable Input<Double> threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder threshold(@Nullable Double threshold) {
            this.threshold = Input.ofNullable(threshold);
            return this;
        }

        public Builder thresholdMetricId(@Nullable Input<String> thresholdMetricId) {
            this.thresholdMetricId = thresholdMetricId;
            return this;
        }

        public Builder thresholdMetricId(@Nullable String thresholdMetricId) {
            this.thresholdMetricId = Input.ofNullable(thresholdMetricId);
            return this;
        }

        public Builder treatMissingData(@Nullable Input<String> treatMissingData) {
            this.treatMissingData = treatMissingData;
            return this;
        }

        public Builder treatMissingData(@Nullable String treatMissingData) {
            this.treatMissingData = Input.ofNullable(treatMissingData);
            return this;
        }

        public Builder unit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }
        public MetricAlarmState build() {
            return new MetricAlarmState(actionsEnabled, alarmActions, alarmDescription, arn, comparisonOperator, datapointsToAlarm, dimensions, evaluateLowSampleCountPercentiles, evaluationPeriods, extendedStatistic, insufficientDataActions, metricName, metricQueries, name, namespace, okActions, period, statistic, tags, tagsAll, threshold, thresholdMetricId, treatMissingData, unit);
        }
    }
}
