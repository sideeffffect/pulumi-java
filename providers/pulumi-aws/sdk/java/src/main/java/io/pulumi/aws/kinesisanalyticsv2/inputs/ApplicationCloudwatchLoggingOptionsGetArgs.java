// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationCloudwatchLoggingOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationCloudwatchLoggingOptionsGetArgs Empty = new ApplicationCloudwatchLoggingOptionsGetArgs();

    @Import(name="cloudwatchLoggingOptionId")
      private final @Nullable Output<String> cloudwatchLoggingOptionId;

    public Output<String> cloudwatchLoggingOptionId() {
        return this.cloudwatchLoggingOptionId == null ? Codegen.empty() : this.cloudwatchLoggingOptionId;
    }

    /**
     * The ARN of the CloudWatch log stream to receive application messages.
     * 
     */
    @Import(name="logStreamArn", required=true)
      private final Output<String> logStreamArn;

    public Output<String> logStreamArn() {
        return this.logStreamArn;
    }

    public ApplicationCloudwatchLoggingOptionsGetArgs(
        @Nullable Output<String> cloudwatchLoggingOptionId,
        Output<String> logStreamArn) {
        this.cloudwatchLoggingOptionId = cloudwatchLoggingOptionId;
        this.logStreamArn = Objects.requireNonNull(logStreamArn, "expected parameter 'logStreamArn' to be non-null");
    }

    private ApplicationCloudwatchLoggingOptionsGetArgs() {
        this.cloudwatchLoggingOptionId = Codegen.empty();
        this.logStreamArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationCloudwatchLoggingOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudwatchLoggingOptionId;
        private Output<String> logStreamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationCloudwatchLoggingOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLoggingOptionId = defaults.cloudwatchLoggingOptionId;
    	      this.logStreamArn = defaults.logStreamArn;
        }

        public Builder cloudwatchLoggingOptionId(@Nullable Output<String> cloudwatchLoggingOptionId) {
            this.cloudwatchLoggingOptionId = cloudwatchLoggingOptionId;
            return this;
        }
        public Builder cloudwatchLoggingOptionId(@Nullable String cloudwatchLoggingOptionId) {
            this.cloudwatchLoggingOptionId = Codegen.ofNullable(cloudwatchLoggingOptionId);
            return this;
        }
        public Builder logStreamArn(Output<String> logStreamArn) {
            this.logStreamArn = Objects.requireNonNull(logStreamArn);
            return this;
        }
        public Builder logStreamArn(String logStreamArn) {
            this.logStreamArn = Output.of(Objects.requireNonNull(logStreamArn));
            return this;
        }        public ApplicationCloudwatchLoggingOptionsGetArgs build() {
            return new ApplicationCloudwatchLoggingOptionsGetArgs(cloudwatchLoggingOptionId, logStreamArn);
        }
    }
}
