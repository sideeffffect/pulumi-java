// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleLambdaArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleLambdaArgs Empty = new TopicRuleLambdaArgs();

    /**
     * The ARN of the Lambda function.
     * 
     */
    @Import(name="functionArn", required=true)
    private Output<String> functionArn;

    public Output<String> functionArn() {
        return this.functionArn;
    }

    private TopicRuleLambdaArgs() {}

    private TopicRuleLambdaArgs(TopicRuleLambdaArgs $) {
        this.functionArn = $.functionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleLambdaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleLambdaArgs $;

        public Builder() {
            $ = new TopicRuleLambdaArgs();
        }

        public Builder(TopicRuleLambdaArgs defaults) {
            $ = new TopicRuleLambdaArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionArn(Output<String> functionArn) {
            $.functionArn = functionArn;
            return this;
        }

        public Builder functionArn(String functionArn) {
            return functionArn(Output.of(functionArn));
        }

        public TopicRuleLambdaArgs build() {
            $.functionArn = Objects.requireNonNull($.functionArn, "expected parameter 'functionArn' to be non-null");
            return $;
        }
    }

}
