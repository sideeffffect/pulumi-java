// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
 * 
 */
public final class HPAScalingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final HPAScalingPolicyArgs Empty = new HPAScalingPolicyArgs();

    /**
     * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * 
     */
    @Import(name="periodSeconds", required=true)
    private Output<Integer> periodSeconds;

    public Output<Integer> periodSeconds() {
        return this.periodSeconds;
    }

    /**
     * Type is used to specify the scaling policy.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    public Output<Integer> value() {
        return this.value;
    }

    private HPAScalingPolicyArgs() {}

    private HPAScalingPolicyArgs(HPAScalingPolicyArgs $) {
        this.periodSeconds = $.periodSeconds;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HPAScalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HPAScalingPolicyArgs $;

        public Builder() {
            $ = new HPAScalingPolicyArgs();
        }

        public Builder(HPAScalingPolicyArgs defaults) {
            $ = new HPAScalingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder periodSeconds(Output<Integer> periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        public Builder periodSeconds(Integer periodSeconds) {
            return periodSeconds(Output.of(periodSeconds));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public HPAScalingPolicyArgs build() {
            $.periodSeconds = Objects.requireNonNull($.periodSeconds, "expected parameter 'periodSeconds' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
