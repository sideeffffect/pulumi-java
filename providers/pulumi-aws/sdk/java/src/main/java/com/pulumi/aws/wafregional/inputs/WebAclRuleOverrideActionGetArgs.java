// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleOverrideActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleOverrideActionGetArgs Empty = new WebAclRuleOverrideActionGetArgs();

    /**
     * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private WebAclRuleOverrideActionGetArgs() {}

    private WebAclRuleOverrideActionGetArgs(WebAclRuleOverrideActionGetArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleOverrideActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleOverrideActionGetArgs $;

        public Builder() {
            $ = new WebAclRuleOverrideActionGetArgs();
        }

        public Builder(WebAclRuleOverrideActionGetArgs defaults) {
            $ = new WebAclRuleOverrideActionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebAclRuleOverrideActionGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
