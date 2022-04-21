// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardTargetGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardTargetGroupArgs Empty = new ListenerRuleActionForwardTargetGroupArgs();

    /**
     * The Amazon Resource Name (ARN) of the target group.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The weight. The range is 0 to 999.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ListenerRuleActionForwardTargetGroupArgs() {}

    private ListenerRuleActionForwardTargetGroupArgs(ListenerRuleActionForwardTargetGroupArgs $) {
        this.arn = $.arn;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleActionForwardTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleActionForwardTargetGroupArgs $;

        public Builder() {
            $ = new ListenerRuleActionForwardTargetGroupArgs();
        }

        public Builder(ListenerRuleActionForwardTargetGroupArgs defaults) {
            $ = new ListenerRuleActionForwardTargetGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public ListenerRuleActionForwardTargetGroupArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
