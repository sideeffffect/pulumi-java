// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetArgs Empty = new EventTargetArgs();

    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    @InputImport(name="arn", required=true)
      private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * 
     */
    @InputImport(name="batchTarget")
      private final @Nullable Input<EventTargetBatchTargetArgs> batchTarget;

    public Input<EventTargetBatchTargetArgs> getBatchTarget() {
        return this.batchTarget == null ? Input.empty() : this.batchTarget;
    }

    /**
     * Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * 
     */
    @InputImport(name="deadLetterConfig")
      private final @Nullable Input<EventTargetDeadLetterConfigArgs> deadLetterConfig;

    public Input<EventTargetDeadLetterConfigArgs> getDeadLetterConfig() {
        return this.deadLetterConfig == null ? Input.empty() : this.deadLetterConfig;
    }

    /**
     * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * 
     */
    @InputImport(name="ecsTarget")
      private final @Nullable Input<EventTargetEcsTargetArgs> ecsTarget;

    public Input<EventTargetEcsTargetArgs> getEcsTarget() {
        return this.ecsTarget == null ? Input.empty() : this.ecsTarget;
    }

    /**
     * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
     * 
     */
    @InputImport(name="eventBusName")
      private final @Nullable Input<String> eventBusName;

    public Input<String> getEventBusName() {
        return this.eventBusName == null ? Input.empty() : this.eventBusName;
    }

    /**
     * Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * 
     */
    @InputImport(name="httpTarget")
      private final @Nullable Input<EventTargetHttpTargetArgs> httpTarget;

    public Input<EventTargetHttpTargetArgs> getHttpTarget() {
        return this.httpTarget == null ? Input.empty() : this.httpTarget;
    }

    /**
     * Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
     * 
     */
    @InputImport(name="input")
      private final @Nullable Input<String> input;

    public Input<String> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
     * 
     */
    @InputImport(name="inputPath")
      private final @Nullable Input<String> inputPath;

    public Input<String> getInputPath() {
        return this.inputPath == null ? Input.empty() : this.inputPath;
    }

    /**
     * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
     * 
     */
    @InputImport(name="inputTransformer")
      private final @Nullable Input<EventTargetInputTransformerArgs> inputTransformer;

    public Input<EventTargetInputTransformerArgs> getInputTransformer() {
        return this.inputTransformer == null ? Input.empty() : this.inputTransformer;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * 
     */
    @InputImport(name="kinesisTarget")
      private final @Nullable Input<EventTargetKinesisTargetArgs> kinesisTarget;

    public Input<EventTargetKinesisTargetArgs> getKinesisTarget() {
        return this.kinesisTarget == null ? Input.empty() : this.kinesisTarget;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * 
     */
    @InputImport(name="redshiftTarget")
      private final @Nullable Input<EventTargetRedshiftTargetArgs> redshiftTarget;

    public Input<EventTargetRedshiftTargetArgs> getRedshiftTarget() {
        return this.redshiftTarget == null ? Input.empty() : this.redshiftTarget;
    }

    /**
     * Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * 
     */
    @InputImport(name="retryPolicy")
      private final @Nullable Input<EventTargetRetryPolicyArgs> retryPolicy;

    public Input<EventTargetRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Input.empty() : this.retryPolicy;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
     * 
     */
    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * The name of the rule you want to add targets to.
     * 
     */
    @InputImport(name="rule", required=true)
      private final Input<String> rule;

    public Input<String> getRule() {
        return this.rule;
    }

    /**
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * 
     */
    @InputImport(name="runCommandTargets")
      private final @Nullable Input<List<EventTargetRunCommandTargetArgs>> runCommandTargets;

    public Input<List<EventTargetRunCommandTargetArgs>> getRunCommandTargets() {
        return this.runCommandTargets == null ? Input.empty() : this.runCommandTargets;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * 
     */
    @InputImport(name="sqsTarget")
      private final @Nullable Input<EventTargetSqsTargetArgs> sqsTarget;

    public Input<EventTargetSqsTargetArgs> getSqsTarget() {
        return this.sqsTarget == null ? Input.empty() : this.sqsTarget;
    }

    /**
     * The unique target assignment ID.  If missing, will generate a random, unique id.
     * 
     */
    @InputImport(name="targetId")
      private final @Nullable Input<String> targetId;

    public Input<String> getTargetId() {
        return this.targetId == null ? Input.empty() : this.targetId;
    }

    public EventTargetArgs(
        Input<String> arn,
        @Nullable Input<EventTargetBatchTargetArgs> batchTarget,
        @Nullable Input<EventTargetDeadLetterConfigArgs> deadLetterConfig,
        @Nullable Input<EventTargetEcsTargetArgs> ecsTarget,
        @Nullable Input<String> eventBusName,
        @Nullable Input<EventTargetHttpTargetArgs> httpTarget,
        @Nullable Input<String> input,
        @Nullable Input<String> inputPath,
        @Nullable Input<EventTargetInputTransformerArgs> inputTransformer,
        @Nullable Input<EventTargetKinesisTargetArgs> kinesisTarget,
        @Nullable Input<EventTargetRedshiftTargetArgs> redshiftTarget,
        @Nullable Input<EventTargetRetryPolicyArgs> retryPolicy,
        @Nullable Input<String> roleArn,
        Input<String> rule,
        @Nullable Input<List<EventTargetRunCommandTargetArgs>> runCommandTargets,
        @Nullable Input<EventTargetSqsTargetArgs> sqsTarget,
        @Nullable Input<String> targetId) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.batchTarget = batchTarget;
        this.deadLetterConfig = deadLetterConfig;
        this.ecsTarget = ecsTarget;
        this.eventBusName = eventBusName;
        this.httpTarget = httpTarget;
        this.input = input;
        this.inputPath = inputPath;
        this.inputTransformer = inputTransformer;
        this.kinesisTarget = kinesisTarget;
        this.redshiftTarget = redshiftTarget;
        this.retryPolicy = retryPolicy;
        this.roleArn = roleArn;
        this.rule = Objects.requireNonNull(rule, "expected parameter 'rule' to be non-null");
        this.runCommandTargets = runCommandTargets;
        this.sqsTarget = sqsTarget;
        this.targetId = targetId;
    }

    private EventTargetArgs() {
        this.arn = Input.empty();
        this.batchTarget = Input.empty();
        this.deadLetterConfig = Input.empty();
        this.ecsTarget = Input.empty();
        this.eventBusName = Input.empty();
        this.httpTarget = Input.empty();
        this.input = Input.empty();
        this.inputPath = Input.empty();
        this.inputTransformer = Input.empty();
        this.kinesisTarget = Input.empty();
        this.redshiftTarget = Input.empty();
        this.retryPolicy = Input.empty();
        this.roleArn = Input.empty();
        this.rule = Input.empty();
        this.runCommandTargets = Input.empty();
        this.sqsTarget = Input.empty();
        this.targetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<EventTargetBatchTargetArgs> batchTarget;
        private @Nullable Input<EventTargetDeadLetterConfigArgs> deadLetterConfig;
        private @Nullable Input<EventTargetEcsTargetArgs> ecsTarget;
        private @Nullable Input<String> eventBusName;
        private @Nullable Input<EventTargetHttpTargetArgs> httpTarget;
        private @Nullable Input<String> input;
        private @Nullable Input<String> inputPath;
        private @Nullable Input<EventTargetInputTransformerArgs> inputTransformer;
        private @Nullable Input<EventTargetKinesisTargetArgs> kinesisTarget;
        private @Nullable Input<EventTargetRedshiftTargetArgs> redshiftTarget;
        private @Nullable Input<EventTargetRetryPolicyArgs> retryPolicy;
        private @Nullable Input<String> roleArn;
        private Input<String> rule;
        private @Nullable Input<List<EventTargetRunCommandTargetArgs>> runCommandTargets;
        private @Nullable Input<EventTargetSqsTargetArgs> sqsTarget;
        private @Nullable Input<String> targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.batchTarget = defaults.batchTarget;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.ecsTarget = defaults.ecsTarget;
    	      this.eventBusName = defaults.eventBusName;
    	      this.httpTarget = defaults.httpTarget;
    	      this.input = defaults.input;
    	      this.inputPath = defaults.inputPath;
    	      this.inputTransformer = defaults.inputTransformer;
    	      this.kinesisTarget = defaults.kinesisTarget;
    	      this.redshiftTarget = defaults.redshiftTarget;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.roleArn = defaults.roleArn;
    	      this.rule = defaults.rule;
    	      this.runCommandTargets = defaults.runCommandTargets;
    	      this.sqsTarget = defaults.sqsTarget;
    	      this.targetId = defaults.targetId;
        }

        public Builder arn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder batchTarget(@Nullable Input<EventTargetBatchTargetArgs> batchTarget) {
            this.batchTarget = batchTarget;
            return this;
        }

        public Builder batchTarget(@Nullable EventTargetBatchTargetArgs batchTarget) {
            this.batchTarget = Input.ofNullable(batchTarget);
            return this;
        }

        public Builder deadLetterConfig(@Nullable Input<EventTargetDeadLetterConfigArgs> deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }

        public Builder deadLetterConfig(@Nullable EventTargetDeadLetterConfigArgs deadLetterConfig) {
            this.deadLetterConfig = Input.ofNullable(deadLetterConfig);
            return this;
        }

        public Builder ecsTarget(@Nullable Input<EventTargetEcsTargetArgs> ecsTarget) {
            this.ecsTarget = ecsTarget;
            return this;
        }

        public Builder ecsTarget(@Nullable EventTargetEcsTargetArgs ecsTarget) {
            this.ecsTarget = Input.ofNullable(ecsTarget);
            return this;
        }

        public Builder eventBusName(@Nullable Input<String> eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }

        public Builder eventBusName(@Nullable String eventBusName) {
            this.eventBusName = Input.ofNullable(eventBusName);
            return this;
        }

        public Builder httpTarget(@Nullable Input<EventTargetHttpTargetArgs> httpTarget) {
            this.httpTarget = httpTarget;
            return this;
        }

        public Builder httpTarget(@Nullable EventTargetHttpTargetArgs httpTarget) {
            this.httpTarget = Input.ofNullable(httpTarget);
            return this;
        }

        public Builder input(@Nullable Input<String> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable String input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder inputPath(@Nullable Input<String> inputPath) {
            this.inputPath = inputPath;
            return this;
        }

        public Builder inputPath(@Nullable String inputPath) {
            this.inputPath = Input.ofNullable(inputPath);
            return this;
        }

        public Builder inputTransformer(@Nullable Input<EventTargetInputTransformerArgs> inputTransformer) {
            this.inputTransformer = inputTransformer;
            return this;
        }

        public Builder inputTransformer(@Nullable EventTargetInputTransformerArgs inputTransformer) {
            this.inputTransformer = Input.ofNullable(inputTransformer);
            return this;
        }

        public Builder kinesisTarget(@Nullable Input<EventTargetKinesisTargetArgs> kinesisTarget) {
            this.kinesisTarget = kinesisTarget;
            return this;
        }

        public Builder kinesisTarget(@Nullable EventTargetKinesisTargetArgs kinesisTarget) {
            this.kinesisTarget = Input.ofNullable(kinesisTarget);
            return this;
        }

        public Builder redshiftTarget(@Nullable Input<EventTargetRedshiftTargetArgs> redshiftTarget) {
            this.redshiftTarget = redshiftTarget;
            return this;
        }

        public Builder redshiftTarget(@Nullable EventTargetRedshiftTargetArgs redshiftTarget) {
            this.redshiftTarget = Input.ofNullable(redshiftTarget);
            return this;
        }

        public Builder retryPolicy(@Nullable Input<EventTargetRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable EventTargetRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Input.ofNullable(retryPolicy);
            return this;
        }

        public Builder roleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder rule(Input<String> rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public Builder rule(String rule) {
            this.rule = Input.of(Objects.requireNonNull(rule));
            return this;
        }

        public Builder runCommandTargets(@Nullable Input<List<EventTargetRunCommandTargetArgs>> runCommandTargets) {
            this.runCommandTargets = runCommandTargets;
            return this;
        }

        public Builder runCommandTargets(@Nullable List<EventTargetRunCommandTargetArgs> runCommandTargets) {
            this.runCommandTargets = Input.ofNullable(runCommandTargets);
            return this;
        }

        public Builder sqsTarget(@Nullable Input<EventTargetSqsTargetArgs> sqsTarget) {
            this.sqsTarget = sqsTarget;
            return this;
        }

        public Builder sqsTarget(@Nullable EventTargetSqsTargetArgs sqsTarget) {
            this.sqsTarget = Input.ofNullable(sqsTarget);
            return this;
        }

        public Builder targetId(@Nullable Input<String> targetId) {
            this.targetId = targetId;
            return this;
        }

        public Builder targetId(@Nullable String targetId) {
            this.targetId = Input.ofNullable(targetId);
            return this;
        }
        public EventTargetArgs build() {
            return new EventTargetArgs(arn, batchTarget, deadLetterConfig, ecsTarget, eventBusName, httpTarget, input, inputPath, inputTransformer, kinesisTarget, redshiftTarget, retryPolicy, roleArn, rule, runCommandTargets, sqsTarget, targetId);
        }
    }
}
