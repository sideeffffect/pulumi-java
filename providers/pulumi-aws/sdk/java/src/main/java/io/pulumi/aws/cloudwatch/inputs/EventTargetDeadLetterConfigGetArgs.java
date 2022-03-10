// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetDeadLetterConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetDeadLetterConfigGetArgs Empty = new EventTargetDeadLetterConfigGetArgs();

    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    public EventTargetDeadLetterConfigGetArgs(@Nullable Input<String> arn) {
        this.arn = arn;
    }

    private EventTargetDeadLetterConfigGetArgs() {
        this.arn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetDeadLetterConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetDeadLetterConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }
        public EventTargetDeadLetterConfigGetArgs build() {
            return new EventTargetDeadLetterConfigGetArgs(arn);
        }
    }
}
