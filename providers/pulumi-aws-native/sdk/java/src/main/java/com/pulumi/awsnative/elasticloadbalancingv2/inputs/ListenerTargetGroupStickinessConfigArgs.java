// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerTargetGroupStickinessConfigArgs extends ResourceArgs {

    public static final ListenerTargetGroupStickinessConfigArgs Empty = new ListenerTargetGroupStickinessConfigArgs();

    @Import(name="durationSeconds")
    private @Nullable Output<Integer> durationSeconds;

    public Optional<Output<Integer>> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ListenerTargetGroupStickinessConfigArgs() {}

    private ListenerTargetGroupStickinessConfigArgs(ListenerTargetGroupStickinessConfigArgs $) {
        this.durationSeconds = $.durationSeconds;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerTargetGroupStickinessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerTargetGroupStickinessConfigArgs $;

        public Builder() {
            $ = new ListenerTargetGroupStickinessConfigArgs();
        }

        public Builder(ListenerTargetGroupStickinessConfigArgs defaults) {
            $ = new ListenerTargetGroupStickinessConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder durationSeconds(@Nullable Output<Integer> durationSeconds) {
            $.durationSeconds = durationSeconds;
            return this;
        }

        public Builder durationSeconds(Integer durationSeconds) {
            return durationSeconds(Output.of(durationSeconds));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ListenerTargetGroupStickinessConfigArgs build() {
            return $;
        }
    }

}
