// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupCustomAction;
import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupStatelessRule;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupStatelessRulesAndCustomActions extends com.pulumi.resources.InvokeArgs {

    public static final RuleGroupStatelessRulesAndCustomActions Empty = new RuleGroupStatelessRulesAndCustomActions();

    @Import(name="customActions")
    private @Nullable List<RuleGroupCustomAction> customActions;

    public Optional<List<RuleGroupCustomAction>> customActions() {
        return Optional.ofNullable(this.customActions);
    }

    @Import(name="statelessRules", required=true)
    private List<RuleGroupStatelessRule> statelessRules;

    public List<RuleGroupStatelessRule> statelessRules() {
        return this.statelessRules;
    }

    private RuleGroupStatelessRulesAndCustomActions() {}

    private RuleGroupStatelessRulesAndCustomActions(RuleGroupStatelessRulesAndCustomActions $) {
        this.customActions = $.customActions;
        this.statelessRules = $.statelessRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupStatelessRulesAndCustomActions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupStatelessRulesAndCustomActions $;

        public Builder() {
            $ = new RuleGroupStatelessRulesAndCustomActions();
        }

        public Builder(RuleGroupStatelessRulesAndCustomActions defaults) {
            $ = new RuleGroupStatelessRulesAndCustomActions(Objects.requireNonNull(defaults));
        }

        public Builder customActions(@Nullable List<RuleGroupCustomAction> customActions) {
            $.customActions = customActions;
            return this;
        }

        public Builder customActions(RuleGroupCustomAction... customActions) {
            return customActions(List.of(customActions));
        }

        public Builder statelessRules(List<RuleGroupStatelessRule> statelessRules) {
            $.statelessRules = statelessRules;
            return this;
        }

        public Builder statelessRules(RuleGroupStatelessRule... statelessRules) {
            return statelessRules(List.of(statelessRules));
        }

        public RuleGroupStatelessRulesAndCustomActions build() {
            $.statelessRules = Objects.requireNonNull($.statelessRules, "expected parameter 'statelessRules' to be non-null");
            return $;
        }
    }

}
