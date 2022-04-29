// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;


public final class RuleGroupImmunityTimePropertyArgs extends ResourceArgs {

    public static final RuleGroupImmunityTimePropertyArgs Empty = new RuleGroupImmunityTimePropertyArgs();

    @Import(name="immunityTime", required=true)
    private Output<Integer> immunityTime;

    public Output<Integer> immunityTime() {
        return this.immunityTime;
    }

    private RuleGroupImmunityTimePropertyArgs() {}

    private RuleGroupImmunityTimePropertyArgs(RuleGroupImmunityTimePropertyArgs $) {
        this.immunityTime = $.immunityTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupImmunityTimePropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupImmunityTimePropertyArgs $;

        public Builder() {
            $ = new RuleGroupImmunityTimePropertyArgs();
        }

        public Builder(RuleGroupImmunityTimePropertyArgs defaults) {
            $ = new RuleGroupImmunityTimePropertyArgs(Objects.requireNonNull(defaults));
        }

        public Builder immunityTime(Output<Integer> immunityTime) {
            $.immunityTime = immunityTime;
            return this;
        }

        public Builder immunityTime(Integer immunityTime) {
            return immunityTime(Output.of(immunityTime));
        }

        public RuleGroupImmunityTimePropertyArgs build() {
            $.immunityTime = Objects.requireNonNull($.immunityTime, "expected parameter 'immunityTime' to be non-null");
            return $;
        }
    }

}
