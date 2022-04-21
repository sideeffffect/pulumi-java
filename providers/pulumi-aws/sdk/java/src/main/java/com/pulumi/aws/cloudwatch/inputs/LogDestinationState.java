// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogDestinationState extends com.pulumi.resources.ResourceArgs {

    public static final LogDestinationState Empty = new LogDestinationState();

    /**
     * The Amazon Resource Name (ARN) specifying the log destination.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A name for the log destination
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * The ARN of the target Amazon Kinesis stream resource for the destination
     * 
     */
    @Import(name="targetArn")
    private @Nullable Output<String> targetArn;

    public Optional<Output<String>> targetArn() {
        return Optional.ofNullable(this.targetArn);
    }

    private LogDestinationState() {}

    private LogDestinationState(LogDestinationState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.targetArn = $.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogDestinationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogDestinationState $;

        public Builder() {
            $ = new LogDestinationState();
        }

        public Builder(LogDestinationState defaults) {
            $ = new LogDestinationState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder targetArn(@Nullable Output<String> targetArn) {
            $.targetArn = targetArn;
            return this;
        }

        public Builder targetArn(String targetArn) {
            return targetArn(Output.of(targetArn));
        }

        public LogDestinationState build() {
            return $;
        }
    }

}
