// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerDefaultActionForwardTargetGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardTargetGroupArgs Empty = new ListenerDefaultActionForwardTargetGroupArgs();

    /**
     * ARN of the target group.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * Weight. The range is 0 to 999.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ListenerDefaultActionForwardTargetGroupArgs() {}

    private ListenerDefaultActionForwardTargetGroupArgs(ListenerDefaultActionForwardTargetGroupArgs $) {
        this.arn = $.arn;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionForwardTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionForwardTargetGroupArgs $;

        public Builder() {
            $ = new ListenerDefaultActionForwardTargetGroupArgs();
        }

        public Builder(ListenerDefaultActionForwardTargetGroupArgs defaults) {
            $ = new ListenerDefaultActionForwardTargetGroupArgs(Objects.requireNonNull(defaults));
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

        public ListenerDefaultActionForwardTargetGroupArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
