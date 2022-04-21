// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanarySchedule extends com.pulumi.resources.InvokeArgs {

    public static final CanarySchedule Empty = new CanarySchedule();

    @Import(name="durationInSeconds")
    private @Nullable String durationInSeconds;

    public Optional<String> durationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }

    @Import(name="expression", required=true)
    private String expression;

    public String expression() {
        return this.expression;
    }

    private CanarySchedule() {}

    private CanarySchedule(CanarySchedule $) {
        this.durationInSeconds = $.durationInSeconds;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CanarySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CanarySchedule $;

        public Builder() {
            $ = new CanarySchedule();
        }

        public Builder(CanarySchedule defaults) {
            $ = new CanarySchedule(Objects.requireNonNull(defaults));
        }

        public Builder durationInSeconds(@Nullable String durationInSeconds) {
            $.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        public CanarySchedule build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
