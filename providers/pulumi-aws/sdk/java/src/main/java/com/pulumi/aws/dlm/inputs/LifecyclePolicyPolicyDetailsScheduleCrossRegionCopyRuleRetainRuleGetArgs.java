// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs Empty = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs();

    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    @Import(name="interval", required=true)
    private Output<Integer> interval;

    public Output<Integer> interval() {
        return this.interval;
    }

    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    @Import(name="intervalUnit", required=true)
    private Output<String> intervalUnit;

    public Output<String> intervalUnit() {
        return this.intervalUnit;
    }

    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs() {}

    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs $) {
        this.interval = $.interval;
        this.intervalUnit = $.intervalUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs $;

        public Builder() {
            $ = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs();
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs defaults) {
            $ = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder interval(Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public Builder intervalUnit(Output<String> intervalUnit) {
            $.intervalUnit = intervalUnit;
            return this;
        }

        public Builder intervalUnit(String intervalUnit) {
            return intervalUnit(Output.of(intervalUnit));
        }

        public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs build() {
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.intervalUnit = Objects.requireNonNull($.intervalUnit, "expected parameter 'intervalUnit' to be non-null");
            return $;
        }
    }

}
