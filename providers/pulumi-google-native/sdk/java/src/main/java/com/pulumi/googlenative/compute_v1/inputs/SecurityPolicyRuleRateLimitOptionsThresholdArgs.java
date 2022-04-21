// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsThresholdArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsThresholdArgs Empty = new SecurityPolicyRuleRateLimitOptionsThresholdArgs();

    /**
     * Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Interval over which the threshold is computed.
     * 
     */
    @Import(name="intervalSec")
    private @Nullable Output<Integer> intervalSec;

    public Optional<Output<Integer>> intervalSec() {
        return Optional.ofNullable(this.intervalSec);
    }

    private SecurityPolicyRuleRateLimitOptionsThresholdArgs() {}

    private SecurityPolicyRuleRateLimitOptionsThresholdArgs(SecurityPolicyRuleRateLimitOptionsThresholdArgs $) {
        this.count = $.count;
        this.intervalSec = $.intervalSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleRateLimitOptionsThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleRateLimitOptionsThresholdArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleRateLimitOptionsThresholdArgs();
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsThresholdArgs defaults) {
            $ = new SecurityPolicyRuleRateLimitOptionsThresholdArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder intervalSec(@Nullable Output<Integer> intervalSec) {
            $.intervalSec = intervalSec;
            return this;
        }

        public Builder intervalSec(Integer intervalSec) {
            return intervalSec(Output.of(intervalSec));
        }

        public SecurityPolicyRuleRateLimitOptionsThresholdArgs build() {
            return $;
        }
    }

}
