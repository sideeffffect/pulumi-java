// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HookVersionLoggingConfigArgs extends ResourceArgs {

    public static final HookVersionLoggingConfigArgs Empty = new HookVersionLoggingConfigArgs();

    /**
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type&#39;s handlers.
     * 
     */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    /**
     * @return The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type&#39;s handlers.
     * 
     */
    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    /**
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * 
     */
    @Import(name="logRoleArn")
    private @Nullable Output<String> logRoleArn;

    /**
     * @return The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * 
     */
    public Optional<Output<String>> logRoleArn() {
        return Optional.ofNullable(this.logRoleArn);
    }

    private HookVersionLoggingConfigArgs() {}

    private HookVersionLoggingConfigArgs(HookVersionLoggingConfigArgs $) {
        this.logGroupName = $.logGroupName;
        this.logRoleArn = $.logRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HookVersionLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HookVersionLoggingConfigArgs $;

        public Builder() {
            $ = new HookVersionLoggingConfigArgs();
        }

        public Builder(HookVersionLoggingConfigArgs defaults) {
            $ = new HookVersionLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logGroupName The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type&#39;s handlers.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        /**
         * @param logGroupName The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type&#39;s handlers.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        /**
         * @param logRoleArn The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
         * 
         * @return builder
         * 
         */
        public Builder logRoleArn(@Nullable Output<String> logRoleArn) {
            $.logRoleArn = logRoleArn;
            return this;
        }

        /**
         * @param logRoleArn The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
         * 
         * @return builder
         * 
         */
        public Builder logRoleArn(String logRoleArn) {
            return logRoleArn(Output.of(logRoleArn));
        }

        public HookVersionLoggingConfigArgs build() {
            return $;
        }
    }

}
