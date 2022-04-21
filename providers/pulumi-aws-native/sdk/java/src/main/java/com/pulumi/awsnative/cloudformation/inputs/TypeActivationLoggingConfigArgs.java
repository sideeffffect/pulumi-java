// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TypeActivationLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final TypeActivationLoggingConfigArgs Empty = new TypeActivationLoggingConfigArgs();

    /**
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type&#39;s handlers.
     * 
     */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    /**
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * 
     */
    @Import(name="logRoleArn")
    private @Nullable Output<String> logRoleArn;

    public Optional<Output<String>> logRoleArn() {
        return Optional.ofNullable(this.logRoleArn);
    }

    private TypeActivationLoggingConfigArgs() {}

    private TypeActivationLoggingConfigArgs(TypeActivationLoggingConfigArgs $) {
        this.logGroupName = $.logGroupName;
        this.logRoleArn = $.logRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypeActivationLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypeActivationLoggingConfigArgs $;

        public Builder() {
            $ = new TypeActivationLoggingConfigArgs();
        }

        public Builder(TypeActivationLoggingConfigArgs defaults) {
            $ = new TypeActivationLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        public Builder logRoleArn(@Nullable Output<String> logRoleArn) {
            $.logRoleArn = logRoleArn;
            return this;
        }

        public Builder logRoleArn(String logRoleArn) {
            return logRoleArn(Output.of(logRoleArn));
        }

        public TypeActivationLoggingConfigArgs build() {
            return $;
        }
    }

}
