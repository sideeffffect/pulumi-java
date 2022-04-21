// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexGetArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs();

    /**
     * Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    @Import(name="hotwordRegex", required=true)
    private Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexGetArgs> hotwordRegex;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexGetArgs> hotwordRegex() {
        return this.hotwordRegex;
    }

    /**
     * Likelihood adjustment to apply to all matching findings.
     * Structure is documented below.
     * 
     */
    @Import(name="likelihoodAdjustment", required=true)
    private Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs> likelihoodAdjustment;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs> likelihoodAdjustment() {
        return this.likelihoodAdjustment;
    }

    /**
     * Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     * used to match substrings of the finding itself. For example, the certainty of a phone number regex
     * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     * Structure is documented below.
     * 
     */
    @Import(name="proximity", required=true)
    private Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs> proximity;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs> proximity() {
        return this.proximity;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs $) {
        this.hotwordRegex = $.hotwordRegex;
        this.likelihoodAdjustment = $.likelihoodAdjustment;
        this.proximity = $.proximity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder hotwordRegex(Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexGetArgs> hotwordRegex) {
            $.hotwordRegex = hotwordRegex;
            return this;
        }

        public Builder hotwordRegex(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexGetArgs hotwordRegex) {
            return hotwordRegex(Output.of(hotwordRegex));
        }

        public Builder likelihoodAdjustment(Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs> likelihoodAdjustment) {
            $.likelihoodAdjustment = likelihoodAdjustment;
            return this;
        }

        public Builder likelihoodAdjustment(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentGetArgs likelihoodAdjustment) {
            return likelihoodAdjustment(Output.of(likelihoodAdjustment));
        }

        public Builder proximity(Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs> proximity) {
            $.proximity = proximity;
            return this;
        }

        public Builder proximity(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs proximity) {
            return proximity(Output.of(proximity));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleGetArgs build() {
            $.hotwordRegex = Objects.requireNonNull($.hotwordRegex, "expected parameter 'hotwordRegex' to be non-null");
            $.likelihoodAdjustment = Objects.requireNonNull($.likelihoodAdjustment, "expected parameter 'likelihoodAdjustment' to be non-null");
            $.proximity = Objects.requireNonNull($.proximity, "expected parameter 'proximity' to be non-null");
            return $;
        }
    }

}
