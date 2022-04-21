// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs();

    /**
     * The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     * Structure is documented below.
     * 
     */
    @Import(name="exclusionRule")
    private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs> exclusionRule;

    public Optional<Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs>> exclusionRule() {
        return Optional.ofNullable(this.exclusionRule);
    }

    /**
     * Hotword-based detection rule.
     * Structure is documented below.
     * 
     */
    @Import(name="hotwordRule")
    private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs> hotwordRule;

    public Optional<Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs>> hotwordRule() {
        return Optional.ofNullable(this.hotwordRule);
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs(PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs $) {
        this.exclusionRule = $.exclusionRule;
        this.hotwordRule = $.hotwordRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder exclusionRule(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs> exclusionRule) {
            $.exclusionRule = exclusionRule;
            return this;
        }

        public Builder exclusionRule(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs exclusionRule) {
            return exclusionRule(Output.of(exclusionRule));
        }

        public Builder hotwordRule(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs> hotwordRule) {
            $.hotwordRule = hotwordRule;
            return this;
        }

        public Builder hotwordRule(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs hotwordRule) {
            return hotwordRule(Output.of(hotwordRule));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs build() {
            return $;
        }
    }

}
