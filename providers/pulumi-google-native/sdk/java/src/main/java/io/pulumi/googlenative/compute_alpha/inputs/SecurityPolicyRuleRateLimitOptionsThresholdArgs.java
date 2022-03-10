// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsThresholdArgs Empty = new SecurityPolicyRuleRateLimitOptionsThresholdArgs();

    /**
     * Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Interval over which the threshold is computed.
     * 
     */
    @InputImport(name="intervalSec")
      private final @Nullable Input<Integer> intervalSec;

    public Input<Integer> getIntervalSec() {
        return this.intervalSec == null ? Input.empty() : this.intervalSec;
    }

    public SecurityPolicyRuleRateLimitOptionsThresholdArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<Integer> intervalSec) {
        this.count = count;
        this.intervalSec = intervalSec;
    }

    private SecurityPolicyRuleRateLimitOptionsThresholdArgs() {
        this.count = Input.empty();
        this.intervalSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<Integer> intervalSec;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.intervalSec = defaults.intervalSec;
        }

        public Builder count(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder count(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder intervalSec(@Nullable Input<Integer> intervalSec) {
            this.intervalSec = intervalSec;
            return this;
        }

        public Builder intervalSec(@Nullable Integer intervalSec) {
            this.intervalSec = Input.ofNullable(intervalSec);
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsThresholdArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsThresholdArgs(count, intervalSec);
        }
    }
}
