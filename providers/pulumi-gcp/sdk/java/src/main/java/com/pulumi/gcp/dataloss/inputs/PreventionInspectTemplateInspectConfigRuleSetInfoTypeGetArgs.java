// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs();

    /**
     * Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
     * or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs(PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
