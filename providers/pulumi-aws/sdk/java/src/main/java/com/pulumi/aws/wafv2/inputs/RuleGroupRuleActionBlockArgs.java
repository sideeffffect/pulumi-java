// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionBlockArgs Empty = new RuleGroupRuleActionBlockArgs();

    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    @Import(name="customResponse")
    private @Nullable Output<RuleGroupRuleActionBlockCustomResponseArgs> customResponse;

    public Optional<Output<RuleGroupRuleActionBlockCustomResponseArgs>> customResponse() {
        return Optional.ofNullable(this.customResponse);
    }

    private RuleGroupRuleActionBlockArgs() {}

    private RuleGroupRuleActionBlockArgs(RuleGroupRuleActionBlockArgs $) {
        this.customResponse = $.customResponse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleActionBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleActionBlockArgs $;

        public Builder() {
            $ = new RuleGroupRuleActionBlockArgs();
        }

        public Builder(RuleGroupRuleActionBlockArgs defaults) {
            $ = new RuleGroupRuleActionBlockArgs(Objects.requireNonNull(defaults));
        }

        public Builder customResponse(@Nullable Output<RuleGroupRuleActionBlockCustomResponseArgs> customResponse) {
            $.customResponse = customResponse;
            return this;
        }

        public Builder customResponse(RuleGroupRuleActionBlockCustomResponseArgs customResponse) {
            return customResponse(Output.of(customResponse));
        }

        public RuleGroupRuleActionBlockArgs build() {
            return $;
        }
    }

}
