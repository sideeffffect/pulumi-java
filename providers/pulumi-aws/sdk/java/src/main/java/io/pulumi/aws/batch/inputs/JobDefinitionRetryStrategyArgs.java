// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyEvaluateOnExitArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobDefinitionRetryStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDefinitionRetryStrategyArgs Empty = new JobDefinitionRetryStrategyArgs();

    /**
     * The number of times to move a job to the `RUNNABLE` status. You may specify between `1` and `10` attempts.
     * 
     */
    @Import(name="attempts")
      private final @Nullable Output<Integer> attempts;

    public Output<Integer> attempts() {
        return this.attempts == null ? Codegen.empty() : this.attempts;
    }

    /**
     * The evaluate on exit conditions under which the job should be retried or failed. If this parameter is specified, then the `attempts` parameter must also be specified. You may specify up to 5 configuration blocks.
     * 
     */
    @Import(name="evaluateOnExits")
      private final @Nullable Output<List<JobDefinitionRetryStrategyEvaluateOnExitArgs>> evaluateOnExits;

    public Output<List<JobDefinitionRetryStrategyEvaluateOnExitArgs>> evaluateOnExits() {
        return this.evaluateOnExits == null ? Codegen.empty() : this.evaluateOnExits;
    }

    public JobDefinitionRetryStrategyArgs(
        @Nullable Output<Integer> attempts,
        @Nullable Output<List<JobDefinitionRetryStrategyEvaluateOnExitArgs>> evaluateOnExits) {
        this.attempts = attempts;
        this.evaluateOnExits = evaluateOnExits;
    }

    private JobDefinitionRetryStrategyArgs() {
        this.attempts = Codegen.empty();
        this.evaluateOnExits = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDefinitionRetryStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> attempts;
        private @Nullable Output<List<JobDefinitionRetryStrategyEvaluateOnExitArgs>> evaluateOnExits;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDefinitionRetryStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attempts = defaults.attempts;
    	      this.evaluateOnExits = defaults.evaluateOnExits;
        }

        public Builder attempts(@Nullable Output<Integer> attempts) {
            this.attempts = attempts;
            return this;
        }
        public Builder attempts(@Nullable Integer attempts) {
            this.attempts = Codegen.ofNullable(attempts);
            return this;
        }
        public Builder evaluateOnExits(@Nullable Output<List<JobDefinitionRetryStrategyEvaluateOnExitArgs>> evaluateOnExits) {
            this.evaluateOnExits = evaluateOnExits;
            return this;
        }
        public Builder evaluateOnExits(@Nullable List<JobDefinitionRetryStrategyEvaluateOnExitArgs> evaluateOnExits) {
            this.evaluateOnExits = Codegen.ofNullable(evaluateOnExits);
            return this;
        }
        public Builder evaluateOnExits(JobDefinitionRetryStrategyEvaluateOnExitArgs... evaluateOnExits) {
            return evaluateOnExits(List.of(evaluateOnExits));
        }        public JobDefinitionRetryStrategyArgs build() {
            return new JobDefinitionRetryStrategyArgs(attempts, evaluateOnExits);
        }
    }
}
