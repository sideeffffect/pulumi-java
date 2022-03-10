// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerTargetGroupTuple extends io.pulumi.resources.InvokeArgs {

    public static final ListenerTargetGroupTuple Empty = new ListenerTargetGroupTuple();

    @InputImport(name="targetGroupArn")
      private final @Nullable String targetGroupArn;

    public Optional<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Optional.empty() : Optional.ofNullable(this.targetGroupArn);
    }

    @InputImport(name="weight")
      private final @Nullable Integer weight;

    public Optional<Integer> getWeight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public ListenerTargetGroupTuple(
        @Nullable String targetGroupArn,
        @Nullable Integer weight) {
        this.targetGroupArn = targetGroupArn;
        this.weight = weight;
    }

    private ListenerTargetGroupTuple() {
        this.targetGroupArn = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerTargetGroupTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetGroupArn;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerTargetGroupTuple defaults) {
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
        }
        public ListenerTargetGroupTuple build() {
            return new ListenerTargetGroupTuple(targetGroupArn, weight);
        }
    }
}
