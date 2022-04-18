// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleTargetGroupTuple {
    private final @Nullable String targetGroupArn;
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private ListenerRuleTargetGroupTuple(
        @CustomType.Parameter("targetGroupArn") @Nullable String targetGroupArn,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.targetGroupArn = targetGroupArn;
        this.weight = weight;
    }

    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleTargetGroupTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetGroupArn;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleTargetGroupTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.weight = defaults.weight;
        }

        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public ListenerRuleTargetGroupTuple build() {
            return new ListenerRuleTargetGroupTuple(targetGroupArn, weight);
        }
    }
}
