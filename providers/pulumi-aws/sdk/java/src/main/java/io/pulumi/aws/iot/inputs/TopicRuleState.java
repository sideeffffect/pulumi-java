// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.TopicRuleCloudwatchAlarmGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleCloudwatchMetricGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleDynamodbGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleDynamodbv2GetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleElasticsearchGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleFirehoseGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleIotAnalyticGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleIotEventGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleKinesisGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleLambdaGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleRepublishGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleS3GetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleSnsGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleSqsGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleStepFunctionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleState extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleState Empty = new TopicRuleState();

    /**
     * The ARN of the topic rule
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    @InputImport(name="cloudwatchAlarm")
      private final @Nullable Input<TopicRuleCloudwatchAlarmGetArgs> cloudwatchAlarm;

    public Input<TopicRuleCloudwatchAlarmGetArgs> getCloudwatchAlarm() {
        return this.cloudwatchAlarm == null ? Input.empty() : this.cloudwatchAlarm;
    }

    @InputImport(name="cloudwatchMetric")
      private final @Nullable Input<TopicRuleCloudwatchMetricGetArgs> cloudwatchMetric;

    public Input<TopicRuleCloudwatchMetricGetArgs> getCloudwatchMetric() {
        return this.cloudwatchMetric == null ? Input.empty() : this.cloudwatchMetric;
    }

    /**
     * The description of the rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="dynamodb")
      private final @Nullable Input<TopicRuleDynamodbGetArgs> dynamodb;

    public Input<TopicRuleDynamodbGetArgs> getDynamodb() {
        return this.dynamodb == null ? Input.empty() : this.dynamodb;
    }

    @InputImport(name="dynamodbv2s")
      private final @Nullable Input<List<TopicRuleDynamodbv2GetArgs>> dynamodbv2s;

    public Input<List<TopicRuleDynamodbv2GetArgs>> getDynamodbv2s() {
        return this.dynamodbv2s == null ? Input.empty() : this.dynamodbv2s;
    }

    @InputImport(name="elasticsearch")
      private final @Nullable Input<TopicRuleElasticsearchGetArgs> elasticsearch;

    public Input<TopicRuleElasticsearchGetArgs> getElasticsearch() {
        return this.elasticsearch == null ? Input.empty() : this.elasticsearch;
    }

    /**
     * Specifies whether the rule is enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Configuration block with error action to be associated with the rule. See the documentation for `cloudwatch_alarm`, `cloudwatch_metric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iot_analytics`, `iot_events`, `kinesis`, `lambda`, `republish`, `s3`, `step_functions`, `sns`, `sqs` configuration blocks for further configuration details.
     * 
     */
    @InputImport(name="errorAction")
      private final @Nullable Input<TopicRuleErrorActionGetArgs> errorAction;

    public Input<TopicRuleErrorActionGetArgs> getErrorAction() {
        return this.errorAction == null ? Input.empty() : this.errorAction;
    }

    @InputImport(name="firehose")
      private final @Nullable Input<TopicRuleFirehoseGetArgs> firehose;

    public Input<TopicRuleFirehoseGetArgs> getFirehose() {
        return this.firehose == null ? Input.empty() : this.firehose;
    }

    @InputImport(name="iotAnalytics")
      private final @Nullable Input<List<TopicRuleIotAnalyticGetArgs>> iotAnalytics;

    public Input<List<TopicRuleIotAnalyticGetArgs>> getIotAnalytics() {
        return this.iotAnalytics == null ? Input.empty() : this.iotAnalytics;
    }

    @InputImport(name="iotEvents")
      private final @Nullable Input<List<TopicRuleIotEventGetArgs>> iotEvents;

    public Input<List<TopicRuleIotEventGetArgs>> getIotEvents() {
        return this.iotEvents == null ? Input.empty() : this.iotEvents;
    }

    @InputImport(name="kinesis")
      private final @Nullable Input<TopicRuleKinesisGetArgs> kinesis;

    public Input<TopicRuleKinesisGetArgs> getKinesis() {
        return this.kinesis == null ? Input.empty() : this.kinesis;
    }

    @InputImport(name="lambda")
      private final @Nullable Input<TopicRuleLambdaGetArgs> lambda;

    public Input<TopicRuleLambdaGetArgs> getLambda() {
        return this.lambda == null ? Input.empty() : this.lambda;
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="republish")
      private final @Nullable Input<TopicRuleRepublishGetArgs> republish;

    public Input<TopicRuleRepublishGetArgs> getRepublish() {
        return this.republish == null ? Input.empty() : this.republish;
    }

    @InputImport(name="s3")
      private final @Nullable Input<TopicRuleS3GetArgs> s3;

    public Input<TopicRuleS3GetArgs> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    @InputImport(name="sns")
      private final @Nullable Input<TopicRuleSnsGetArgs> sns;

    public Input<TopicRuleSnsGetArgs> getSns() {
        return this.sns == null ? Input.empty() : this.sns;
    }

    /**
     * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
     * 
     */
    @InputImport(name="sql")
      private final @Nullable Input<String> sql;

    public Input<String> getSql() {
        return this.sql == null ? Input.empty() : this.sql;
    }

    /**
     * The version of the SQL rules engine to use when evaluating the rule.
     * 
     */
    @InputImport(name="sqlVersion")
      private final @Nullable Input<String> sqlVersion;

    public Input<String> getSqlVersion() {
        return this.sqlVersion == null ? Input.empty() : this.sqlVersion;
    }

    @InputImport(name="sqs")
      private final @Nullable Input<TopicRuleSqsGetArgs> sqs;

    public Input<TopicRuleSqsGetArgs> getSqs() {
        return this.sqs == null ? Input.empty() : this.sqs;
    }

    @InputImport(name="stepFunctions")
      private final @Nullable Input<List<TopicRuleStepFunctionGetArgs>> stepFunctions;

    public Input<List<TopicRuleStepFunctionGetArgs>> getStepFunctions() {
        return this.stepFunctions == null ? Input.empty() : this.stepFunctions;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public TopicRuleState(
        @Nullable Input<String> arn,
        @Nullable Input<TopicRuleCloudwatchAlarmGetArgs> cloudwatchAlarm,
        @Nullable Input<TopicRuleCloudwatchMetricGetArgs> cloudwatchMetric,
        @Nullable Input<String> description,
        @Nullable Input<TopicRuleDynamodbGetArgs> dynamodb,
        @Nullable Input<List<TopicRuleDynamodbv2GetArgs>> dynamodbv2s,
        @Nullable Input<TopicRuleElasticsearchGetArgs> elasticsearch,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<TopicRuleErrorActionGetArgs> errorAction,
        @Nullable Input<TopicRuleFirehoseGetArgs> firehose,
        @Nullable Input<List<TopicRuleIotAnalyticGetArgs>> iotAnalytics,
        @Nullable Input<List<TopicRuleIotEventGetArgs>> iotEvents,
        @Nullable Input<TopicRuleKinesisGetArgs> kinesis,
        @Nullable Input<TopicRuleLambdaGetArgs> lambda,
        @Nullable Input<String> name,
        @Nullable Input<TopicRuleRepublishGetArgs> republish,
        @Nullable Input<TopicRuleS3GetArgs> s3,
        @Nullable Input<TopicRuleSnsGetArgs> sns,
        @Nullable Input<String> sql,
        @Nullable Input<String> sqlVersion,
        @Nullable Input<TopicRuleSqsGetArgs> sqs,
        @Nullable Input<List<TopicRuleStepFunctionGetArgs>> stepFunctions,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.cloudwatchAlarm = cloudwatchAlarm;
        this.cloudwatchMetric = cloudwatchMetric;
        this.description = description;
        this.dynamodb = dynamodb;
        this.dynamodbv2s = dynamodbv2s;
        this.elasticsearch = elasticsearch;
        this.enabled = enabled;
        this.errorAction = errorAction;
        this.firehose = firehose;
        this.iotAnalytics = iotAnalytics;
        this.iotEvents = iotEvents;
        this.kinesis = kinesis;
        this.lambda = lambda;
        this.name = name;
        this.republish = republish;
        this.s3 = s3;
        this.sns = sns;
        this.sql = sql;
        this.sqlVersion = sqlVersion;
        this.sqs = sqs;
        this.stepFunctions = stepFunctions;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private TopicRuleState() {
        this.arn = Input.empty();
        this.cloudwatchAlarm = Input.empty();
        this.cloudwatchMetric = Input.empty();
        this.description = Input.empty();
        this.dynamodb = Input.empty();
        this.dynamodbv2s = Input.empty();
        this.elasticsearch = Input.empty();
        this.enabled = Input.empty();
        this.errorAction = Input.empty();
        this.firehose = Input.empty();
        this.iotAnalytics = Input.empty();
        this.iotEvents = Input.empty();
        this.kinesis = Input.empty();
        this.lambda = Input.empty();
        this.name = Input.empty();
        this.republish = Input.empty();
        this.s3 = Input.empty();
        this.sns = Input.empty();
        this.sql = Input.empty();
        this.sqlVersion = Input.empty();
        this.sqs = Input.empty();
        this.stepFunctions = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<TopicRuleCloudwatchAlarmGetArgs> cloudwatchAlarm;
        private @Nullable Input<TopicRuleCloudwatchMetricGetArgs> cloudwatchMetric;
        private @Nullable Input<String> description;
        private @Nullable Input<TopicRuleDynamodbGetArgs> dynamodb;
        private @Nullable Input<List<TopicRuleDynamodbv2GetArgs>> dynamodbv2s;
        private @Nullable Input<TopicRuleElasticsearchGetArgs> elasticsearch;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<TopicRuleErrorActionGetArgs> errorAction;
        private @Nullable Input<TopicRuleFirehoseGetArgs> firehose;
        private @Nullable Input<List<TopicRuleIotAnalyticGetArgs>> iotAnalytics;
        private @Nullable Input<List<TopicRuleIotEventGetArgs>> iotEvents;
        private @Nullable Input<TopicRuleKinesisGetArgs> kinesis;
        private @Nullable Input<TopicRuleLambdaGetArgs> lambda;
        private @Nullable Input<String> name;
        private @Nullable Input<TopicRuleRepublishGetArgs> republish;
        private @Nullable Input<TopicRuleS3GetArgs> s3;
        private @Nullable Input<TopicRuleSnsGetArgs> sns;
        private @Nullable Input<String> sql;
        private @Nullable Input<String> sqlVersion;
        private @Nullable Input<TopicRuleSqsGetArgs> sqs;
        private @Nullable Input<List<TopicRuleStepFunctionGetArgs>> stepFunctions;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cloudwatchAlarm = defaults.cloudwatchAlarm;
    	      this.cloudwatchMetric = defaults.cloudwatchMetric;
    	      this.description = defaults.description;
    	      this.dynamodb = defaults.dynamodb;
    	      this.dynamodbv2s = defaults.dynamodbv2s;
    	      this.elasticsearch = defaults.elasticsearch;
    	      this.enabled = defaults.enabled;
    	      this.errorAction = defaults.errorAction;
    	      this.firehose = defaults.firehose;
    	      this.iotAnalytics = defaults.iotAnalytics;
    	      this.iotEvents = defaults.iotEvents;
    	      this.kinesis = defaults.kinesis;
    	      this.lambda = defaults.lambda;
    	      this.name = defaults.name;
    	      this.republish = defaults.republish;
    	      this.s3 = defaults.s3;
    	      this.sns = defaults.sns;
    	      this.sql = defaults.sql;
    	      this.sqlVersion = defaults.sqlVersion;
    	      this.sqs = defaults.sqs;
    	      this.stepFunctions = defaults.stepFunctions;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder cloudwatchAlarm(@Nullable Input<TopicRuleCloudwatchAlarmGetArgs> cloudwatchAlarm) {
            this.cloudwatchAlarm = cloudwatchAlarm;
            return this;
        }

        public Builder cloudwatchAlarm(@Nullable TopicRuleCloudwatchAlarmGetArgs cloudwatchAlarm) {
            this.cloudwatchAlarm = Input.ofNullable(cloudwatchAlarm);
            return this;
        }

        public Builder cloudwatchMetric(@Nullable Input<TopicRuleCloudwatchMetricGetArgs> cloudwatchMetric) {
            this.cloudwatchMetric = cloudwatchMetric;
            return this;
        }

        public Builder cloudwatchMetric(@Nullable TopicRuleCloudwatchMetricGetArgs cloudwatchMetric) {
            this.cloudwatchMetric = Input.ofNullable(cloudwatchMetric);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder dynamodb(@Nullable Input<TopicRuleDynamodbGetArgs> dynamodb) {
            this.dynamodb = dynamodb;
            return this;
        }

        public Builder dynamodb(@Nullable TopicRuleDynamodbGetArgs dynamodb) {
            this.dynamodb = Input.ofNullable(dynamodb);
            return this;
        }

        public Builder dynamodbv2s(@Nullable Input<List<TopicRuleDynamodbv2GetArgs>> dynamodbv2s) {
            this.dynamodbv2s = dynamodbv2s;
            return this;
        }

        public Builder dynamodbv2s(@Nullable List<TopicRuleDynamodbv2GetArgs> dynamodbv2s) {
            this.dynamodbv2s = Input.ofNullable(dynamodbv2s);
            return this;
        }

        public Builder elasticsearch(@Nullable Input<TopicRuleElasticsearchGetArgs> elasticsearch) {
            this.elasticsearch = elasticsearch;
            return this;
        }

        public Builder elasticsearch(@Nullable TopicRuleElasticsearchGetArgs elasticsearch) {
            this.elasticsearch = Input.ofNullable(elasticsearch);
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder errorAction(@Nullable Input<TopicRuleErrorActionGetArgs> errorAction) {
            this.errorAction = errorAction;
            return this;
        }

        public Builder errorAction(@Nullable TopicRuleErrorActionGetArgs errorAction) {
            this.errorAction = Input.ofNullable(errorAction);
            return this;
        }

        public Builder firehose(@Nullable Input<TopicRuleFirehoseGetArgs> firehose) {
            this.firehose = firehose;
            return this;
        }

        public Builder firehose(@Nullable TopicRuleFirehoseGetArgs firehose) {
            this.firehose = Input.ofNullable(firehose);
            return this;
        }

        public Builder iotAnalytics(@Nullable Input<List<TopicRuleIotAnalyticGetArgs>> iotAnalytics) {
            this.iotAnalytics = iotAnalytics;
            return this;
        }

        public Builder iotAnalytics(@Nullable List<TopicRuleIotAnalyticGetArgs> iotAnalytics) {
            this.iotAnalytics = Input.ofNullable(iotAnalytics);
            return this;
        }

        public Builder iotEvents(@Nullable Input<List<TopicRuleIotEventGetArgs>> iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }

        public Builder iotEvents(@Nullable List<TopicRuleIotEventGetArgs> iotEvents) {
            this.iotEvents = Input.ofNullable(iotEvents);
            return this;
        }

        public Builder kinesis(@Nullable Input<TopicRuleKinesisGetArgs> kinesis) {
            this.kinesis = kinesis;
            return this;
        }

        public Builder kinesis(@Nullable TopicRuleKinesisGetArgs kinesis) {
            this.kinesis = Input.ofNullable(kinesis);
            return this;
        }

        public Builder lambda(@Nullable Input<TopicRuleLambdaGetArgs> lambda) {
            this.lambda = lambda;
            return this;
        }

        public Builder lambda(@Nullable TopicRuleLambdaGetArgs lambda) {
            this.lambda = Input.ofNullable(lambda);
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

        public Builder republish(@Nullable Input<TopicRuleRepublishGetArgs> republish) {
            this.republish = republish;
            return this;
        }

        public Builder republish(@Nullable TopicRuleRepublishGetArgs republish) {
            this.republish = Input.ofNullable(republish);
            return this;
        }

        public Builder s3(@Nullable Input<TopicRuleS3GetArgs> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder s3(@Nullable TopicRuleS3GetArgs s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }

        public Builder sns(@Nullable Input<TopicRuleSnsGetArgs> sns) {
            this.sns = sns;
            return this;
        }

        public Builder sns(@Nullable TopicRuleSnsGetArgs sns) {
            this.sns = Input.ofNullable(sns);
            return this;
        }

        public Builder sql(@Nullable Input<String> sql) {
            this.sql = sql;
            return this;
        }

        public Builder sql(@Nullable String sql) {
            this.sql = Input.ofNullable(sql);
            return this;
        }

        public Builder sqlVersion(@Nullable Input<String> sqlVersion) {
            this.sqlVersion = sqlVersion;
            return this;
        }

        public Builder sqlVersion(@Nullable String sqlVersion) {
            this.sqlVersion = Input.ofNullable(sqlVersion);
            return this;
        }

        public Builder sqs(@Nullable Input<TopicRuleSqsGetArgs> sqs) {
            this.sqs = sqs;
            return this;
        }

        public Builder sqs(@Nullable TopicRuleSqsGetArgs sqs) {
            this.sqs = Input.ofNullable(sqs);
            return this;
        }

        public Builder stepFunctions(@Nullable Input<List<TopicRuleStepFunctionGetArgs>> stepFunctions) {
            this.stepFunctions = stepFunctions;
            return this;
        }

        public Builder stepFunctions(@Nullable List<TopicRuleStepFunctionGetArgs> stepFunctions) {
            this.stepFunctions = Input.ofNullable(stepFunctions);
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
        public TopicRuleState build() {
            return new TopicRuleState(arn, cloudwatchAlarm, cloudwatchMetric, description, dynamodb, dynamodbv2s, elasticsearch, enabled, errorAction, firehose, iotAnalytics, iotEvents, kinesis, lambda, name, republish, s3, sns, sql, sqlVersion, sqs, stepFunctions, tags, tagsAll);
        }
    }
}
