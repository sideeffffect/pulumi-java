// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CanaryScheduleArgs Empty = new CanaryScheduleArgs();

    /**
     * Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
     * 
     */
    @Import(name="durationInSeconds")
    private @Nullable Output<Integer> durationInSeconds;

    public Optional<Output<Integer>> durationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }

    /**
     * Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    public Output<String> expression() {
        return this.expression;
    }

    private CanaryScheduleArgs() {}

    private CanaryScheduleArgs(CanaryScheduleArgs $) {
        this.durationInSeconds = $.durationInSeconds;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CanaryScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CanaryScheduleArgs $;

        public Builder() {
            $ = new CanaryScheduleArgs();
        }

        public Builder(CanaryScheduleArgs defaults) {
            $ = new CanaryScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder durationInSeconds(@Nullable Output<Integer> durationInSeconds) {
            $.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder durationInSeconds(Integer durationInSeconds) {
            return durationInSeconds(Output.of(durationInSeconds));
        }

        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public CanaryScheduleArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
