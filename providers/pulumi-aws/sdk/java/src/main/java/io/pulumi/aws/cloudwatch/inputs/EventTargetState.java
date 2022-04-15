// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetState extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetState Empty = new EventTargetState();

    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="batchTarget")
      private final @Nullable Output<EventTargetBatchTargetGetArgs> batchTarget;

    public Output<EventTargetBatchTargetGetArgs> batchTarget() {
        return this.batchTarget == null ? Codegen.empty() : this.batchTarget;
    }

    /**
     * Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="deadLetterConfig")
      private final @Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig;

    public Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig() {
        return this.deadLetterConfig == null ? Codegen.empty() : this.deadLetterConfig;
    }

    /**
     * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="ecsTarget")
      private final @Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget;

    public Output<EventTargetEcsTargetGetArgs> ecsTarget() {
        return this.ecsTarget == null ? Codegen.empty() : this.ecsTarget;
    }

    /**
     * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
     * 
     */
    @Import(name="eventBusName")
      private final @Nullable Output<String> eventBusName;

    public Output<String> eventBusName() {
        return this.eventBusName == null ? Codegen.empty() : this.eventBusName;
    }

    /**
     * Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * 
     */
    @Import(name="httpTarget")
      private final @Nullable Output<EventTargetHttpTargetGetArgs> httpTarget;

    public Output<EventTargetHttpTargetGetArgs> httpTarget() {
        return this.httpTarget == null ? Codegen.empty() : this.httpTarget;
    }

    /**
     * Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
     * 
     */
    @Import(name="input")
      private final @Nullable Output<String> input;

    public Output<String> input() {
        return this.input == null ? Codegen.empty() : this.input;
    }

    /**
     * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
     * 
     */
    @Import(name="inputPath")
      private final @Nullable Output<String> inputPath;

    public Output<String> inputPath() {
        return this.inputPath == null ? Codegen.empty() : this.inputPath;
    }

    /**
     * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
     * 
     */
    @Import(name="inputTransformer")
      private final @Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer;

    public Output<EventTargetInputTransformerGetArgs> inputTransformer() {
        return this.inputTransformer == null ? Codegen.empty() : this.inputTransformer;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="kinesisTarget")
      private final @Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget;

    public Output<EventTargetKinesisTargetGetArgs> kinesisTarget() {
        return this.kinesisTarget == null ? Codegen.empty() : this.kinesisTarget;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="redshiftTarget")
      private final @Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget;

    public Output<EventTargetRedshiftTargetGetArgs> redshiftTarget() {
        return this.redshiftTarget == null ? Codegen.empty() : this.redshiftTarget;
    }

    /**
     * Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy;

    public Output<EventTargetRetryPolicyGetArgs> retryPolicy() {
        return this.retryPolicy == null ? Codegen.empty() : this.retryPolicy;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    /**
     * The name of the rule you want to add targets to.
     * 
     */
    @Import(name="rule")
      private final @Nullable Output<String> rule;

    public Output<String> rule() {
        return this.rule == null ? Codegen.empty() : this.rule;
    }

    /**
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * 
     */
    @Import(name="runCommandTargets")
      private final @Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets;

    public Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets() {
        return this.runCommandTargets == null ? Codegen.empty() : this.runCommandTargets;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="sqsTarget")
      private final @Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget;

    public Output<EventTargetSqsTargetGetArgs> sqsTarget() {
        return this.sqsTarget == null ? Codegen.empty() : this.sqsTarget;
    }

    /**
     * The unique target assignment ID.  If missing, will generate a random, unique id.
     * 
     */
    @Import(name="targetId")
      private final @Nullable Output<String> targetId;

    public Output<String> targetId() {
        return this.targetId == null ? Codegen.empty() : this.targetId;
    }

    public EventTargetState(
        @Nullable Output<String> arn,
        @Nullable Output<EventTargetBatchTargetGetArgs> batchTarget,
        @Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig,
        @Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget,
        @Nullable Output<String> eventBusName,
        @Nullable Output<EventTargetHttpTargetGetArgs> httpTarget,
        @Nullable Output<String> input,
        @Nullable Output<String> inputPath,
        @Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer,
        @Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget,
        @Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget,
        @Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> rule,
        @Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets,
        @Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget,
        @Nullable Output<String> targetId) {
        this.arn = arn;
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
        this.rule = rule;
        this.runCommandTargets = runCommandTargets;
        this.sqsTarget = sqsTarget;
        this.targetId = targetId;
    }

    private EventTargetState() {
        this.arn = Codegen.empty();
        this.batchTarget = Codegen.empty();
        this.deadLetterConfig = Codegen.empty();
        this.ecsTarget = Codegen.empty();
        this.eventBusName = Codegen.empty();
        this.httpTarget = Codegen.empty();
        this.input = Codegen.empty();
        this.inputPath = Codegen.empty();
        this.inputTransformer = Codegen.empty();
        this.kinesisTarget = Codegen.empty();
        this.redshiftTarget = Codegen.empty();
        this.retryPolicy = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.rule = Codegen.empty();
        this.runCommandTargets = Codegen.empty();
        this.sqsTarget = Codegen.empty();
        this.targetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<EventTargetBatchTargetGetArgs> batchTarget;
        private @Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig;
        private @Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget;
        private @Nullable Output<String> eventBusName;
        private @Nullable Output<EventTargetHttpTargetGetArgs> httpTarget;
        private @Nullable Output<String> input;
        private @Nullable Output<String> inputPath;
        private @Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer;
        private @Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget;
        private @Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget;
        private @Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> rule;
        private @Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets;
        private @Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget;
        private @Nullable Output<String> targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetState defaults) {
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

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder batchTarget(@Nullable Output<EventTargetBatchTargetGetArgs> batchTarget) {
            this.batchTarget = batchTarget;
            return this;
        }
        public Builder batchTarget(@Nullable EventTargetBatchTargetGetArgs batchTarget) {
            this.batchTarget = Codegen.ofNullable(batchTarget);
            return this;
        }
        public Builder deadLetterConfig(@Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }
        public Builder deadLetterConfig(@Nullable EventTargetDeadLetterConfigGetArgs deadLetterConfig) {
            this.deadLetterConfig = Codegen.ofNullable(deadLetterConfig);
            return this;
        }
        public Builder ecsTarget(@Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget) {
            this.ecsTarget = ecsTarget;
            return this;
        }
        public Builder ecsTarget(@Nullable EventTargetEcsTargetGetArgs ecsTarget) {
            this.ecsTarget = Codegen.ofNullable(ecsTarget);
            return this;
        }
        public Builder eventBusName(@Nullable Output<String> eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public Builder eventBusName(@Nullable String eventBusName) {
            this.eventBusName = Codegen.ofNullable(eventBusName);
            return this;
        }
        public Builder httpTarget(@Nullable Output<EventTargetHttpTargetGetArgs> httpTarget) {
            this.httpTarget = httpTarget;
            return this;
        }
        public Builder httpTarget(@Nullable EventTargetHttpTargetGetArgs httpTarget) {
            this.httpTarget = Codegen.ofNullable(httpTarget);
            return this;
        }
        public Builder input(@Nullable Output<String> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable String input) {
            this.input = Codegen.ofNullable(input);
            return this;
        }
        public Builder inputPath(@Nullable Output<String> inputPath) {
            this.inputPath = inputPath;
            return this;
        }
        public Builder inputPath(@Nullable String inputPath) {
            this.inputPath = Codegen.ofNullable(inputPath);
            return this;
        }
        public Builder inputTransformer(@Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer) {
            this.inputTransformer = inputTransformer;
            return this;
        }
        public Builder inputTransformer(@Nullable EventTargetInputTransformerGetArgs inputTransformer) {
            this.inputTransformer = Codegen.ofNullable(inputTransformer);
            return this;
        }
        public Builder kinesisTarget(@Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget) {
            this.kinesisTarget = kinesisTarget;
            return this;
        }
        public Builder kinesisTarget(@Nullable EventTargetKinesisTargetGetArgs kinesisTarget) {
            this.kinesisTarget = Codegen.ofNullable(kinesisTarget);
            return this;
        }
        public Builder redshiftTarget(@Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget) {
            this.redshiftTarget = redshiftTarget;
            return this;
        }
        public Builder redshiftTarget(@Nullable EventTargetRedshiftTargetGetArgs redshiftTarget) {
            this.redshiftTarget = Codegen.ofNullable(redshiftTarget);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable EventTargetRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Codegen.ofNullable(retryPolicy);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }
        public Builder rule(@Nullable Output<String> rule) {
            this.rule = rule;
            return this;
        }
        public Builder rule(@Nullable String rule) {
            this.rule = Codegen.ofNullable(rule);
            return this;
        }
        public Builder runCommandTargets(@Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets) {
            this.runCommandTargets = runCommandTargets;
            return this;
        }
        public Builder runCommandTargets(@Nullable List<EventTargetRunCommandTargetGetArgs> runCommandTargets) {
            this.runCommandTargets = Codegen.ofNullable(runCommandTargets);
            return this;
        }
        public Builder runCommandTargets(EventTargetRunCommandTargetGetArgs... runCommandTargets) {
            return runCommandTargets(List.of(runCommandTargets));
        }
        public Builder sqsTarget(@Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget) {
            this.sqsTarget = sqsTarget;
            return this;
        }
        public Builder sqsTarget(@Nullable EventTargetSqsTargetGetArgs sqsTarget) {
            this.sqsTarget = Codegen.ofNullable(sqsTarget);
            return this;
        }
        public Builder targetId(@Nullable Output<String> targetId) {
            this.targetId = targetId;
            return this;
        }
        public Builder targetId(@Nullable String targetId) {
            this.targetId = Codegen.ofNullable(targetId);
            return this;
        }        public EventTargetState build() {
            return new EventTargetState(arn, batchTarget, deadLetterConfig, ecsTarget, eventBusName, httpTarget, input, inputPath, inputTransformer, kinesisTarget, redshiftTarget, retryPolicy, roleArn, rule, runCommandTargets, sqsTarget, targetId);
        }
    }
}
