// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerTargetGroupTupleArgs extends ResourceArgs {

    public static final ListenerTargetGroupTupleArgs Empty = new ListenerTargetGroupTupleArgs();

    @Import(name="targetGroupArn")
    private @Nullable Output<String> targetGroupArn;

    public Optional<Output<String>> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ListenerTargetGroupTupleArgs() {}

    private ListenerTargetGroupTupleArgs(ListenerTargetGroupTupleArgs $) {
        this.targetGroupArn = $.targetGroupArn;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerTargetGroupTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerTargetGroupTupleArgs $;

        public Builder() {
            $ = new ListenerTargetGroupTupleArgs();
        }

        public Builder(ListenerTargetGroupTupleArgs defaults) {
            $ = new ListenerTargetGroupTupleArgs(Objects.requireNonNull(defaults));
        }

        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            $.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder targetGroupArn(String targetGroupArn) {
            return targetGroupArn(Output.of(targetGroupArn));
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public ListenerTargetGroupTupleArgs build() {
            return $;
        }
    }

}
