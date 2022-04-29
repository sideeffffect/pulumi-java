// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupCustomRequestHandlingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Count traffic towards application.
 * 
 */
public final class RuleGroupRuleActionCountPropertiesArgs extends ResourceArgs {

    public static final RuleGroupRuleActionCountPropertiesArgs Empty = new RuleGroupRuleActionCountPropertiesArgs();

    @Import(name="customRequestHandling")
    private @Nullable Output<RuleGroupCustomRequestHandlingArgs> customRequestHandling;

    public Optional<Output<RuleGroupCustomRequestHandlingArgs>> customRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    private RuleGroupRuleActionCountPropertiesArgs() {}

    private RuleGroupRuleActionCountPropertiesArgs(RuleGroupRuleActionCountPropertiesArgs $) {
        this.customRequestHandling = $.customRequestHandling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleActionCountPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleActionCountPropertiesArgs $;

        public Builder() {
            $ = new RuleGroupRuleActionCountPropertiesArgs();
        }

        public Builder(RuleGroupRuleActionCountPropertiesArgs defaults) {
            $ = new RuleGroupRuleActionCountPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder customRequestHandling(@Nullable Output<RuleGroupCustomRequestHandlingArgs> customRequestHandling) {
            $.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder customRequestHandling(RuleGroupCustomRequestHandlingArgs customRequestHandling) {
            return customRequestHandling(Output.of(customRequestHandling));
        }

        public RuleGroupRuleActionCountPropertiesArgs build() {
            return $;
        }
    }

}
