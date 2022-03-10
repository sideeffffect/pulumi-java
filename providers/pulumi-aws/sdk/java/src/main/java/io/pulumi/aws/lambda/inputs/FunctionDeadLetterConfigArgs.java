// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FunctionDeadLetterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionDeadLetterConfigArgs Empty = new FunctionDeadLetterConfigArgs();

    /**
     * ARN of an SNS topic or SQS queue to notify when an invocation fails. If this option is used, the function's IAM role must be granted suitable access to write to the target object, which means allowing either the `sns:Publish` or `sqs:SendMessage` action on this ARN, depending on which service is targeted.
     * 
     */
    @InputImport(name="targetArn", required=true)
      private final Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn;
    }

    public FunctionDeadLetterConfigArgs(Input<String> targetArn) {
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private FunctionDeadLetterConfigArgs() {
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionDeadLetterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionDeadLetterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetArn = defaults.targetArn;
        }

        public Builder targetArn(Input<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public Builder targetArn(String targetArn) {
            this.targetArn = Input.of(Objects.requireNonNull(targetArn));
            return this;
        }
        public FunctionDeadLetterConfigArgs build() {
            return new FunctionDeadLetterConfigArgs(targetArn);
        }
    }
}
