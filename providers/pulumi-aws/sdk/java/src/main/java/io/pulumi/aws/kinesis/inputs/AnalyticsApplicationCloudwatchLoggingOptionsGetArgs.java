// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationCloudwatchLoggingOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationCloudwatchLoggingOptionsGetArgs Empty = new AnalyticsApplicationCloudwatchLoggingOptionsGetArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The ARN of the CloudWatch Log Stream.
     * 
     */
    @Import(name="logStreamArn", required=true)
      private final Output<String> logStreamArn;

    public Output<String> logStreamArn() {
        return this.logStreamArn;
    }

    /**
     * The ARN of the IAM Role used to send application messages.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    public AnalyticsApplicationCloudwatchLoggingOptionsGetArgs(
        @Nullable Output<String> id,
        Output<String> logStreamArn,
        Output<String> roleArn) {
        this.id = id;
        this.logStreamArn = Objects.requireNonNull(logStreamArn, "expected parameter 'logStreamArn' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AnalyticsApplicationCloudwatchLoggingOptionsGetArgs() {
        this.id = Codegen.empty();
        this.logStreamArn = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationCloudwatchLoggingOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private Output<String> logStreamArn;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationCloudwatchLoggingOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.logStreamArn = defaults.logStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder logStreamArn(Output<String> logStreamArn) {
            this.logStreamArn = Objects.requireNonNull(logStreamArn);
            return this;
        }
        public Builder logStreamArn(String logStreamArn) {
            this.logStreamArn = Output.of(Objects.requireNonNull(logStreamArn));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public AnalyticsApplicationCloudwatchLoggingOptionsGetArgs build() {
            return new AnalyticsApplicationCloudwatchLoggingOptionsGetArgs(id, logStreamArn, roleArn);
        }
    }
}
