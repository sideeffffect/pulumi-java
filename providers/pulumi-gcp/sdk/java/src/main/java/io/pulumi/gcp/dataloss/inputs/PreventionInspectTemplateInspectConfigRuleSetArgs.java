// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs;
import java.util.List;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetArgs();

    /**
     * If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    @Import(name="infoTypes", required=true)
      private final Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes;

    public Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes() {
        return this.infoTypes;
    }

    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * Structure is documented below.
     * 
     */
    @Import(name="rules", required=true)
      private final Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules;

    public Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules() {
        return this.rules;
    }

    public PreventionInspectTemplateInspectConfigRuleSetArgs(
        Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes,
        Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules) {
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigRuleSetArgs() {
        this.infoTypes = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes;
        private Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder infoTypes(Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public Builder infoTypes(List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs> infoTypes) {
            this.infoTypes = Output.of(Objects.requireNonNull(infoTypes));
            return this;
        }
        public Builder infoTypes(PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder rules(Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs> rules) {
            this.rules = Output.of(Objects.requireNonNull(rules));
            return this;
        }
        public Builder rules(PreventionInspectTemplateInspectConfigRuleSetRuleArgs... rules) {
            return rules(List.of(rules));
        }        public PreventionInspectTemplateInspectConfigRuleSetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetArgs(infoTypes, rules);
        }
    }
}
