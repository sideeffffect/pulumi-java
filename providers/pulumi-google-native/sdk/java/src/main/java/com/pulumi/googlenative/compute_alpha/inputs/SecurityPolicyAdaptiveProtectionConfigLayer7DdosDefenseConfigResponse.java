// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration options for L7 DDoS detection.
 * 
 */
public final class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse Empty = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse();

    /**
     * If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    @Import(name="enable", required=true)
    private Boolean enable;

    public Boolean enable() {
        return this.enable;
    }

    /**
     * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    @Import(name="ruleVisibility", required=true)
    private String ruleVisibility;

    public String ruleVisibility() {
        return this.ruleVisibility;
    }

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse() {}

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse $) {
        this.enable = $.enable;
        this.ruleVisibility = $.ruleVisibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse $;

        public Builder() {
            $ = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse();
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse defaults) {
            $ = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder enable(Boolean enable) {
            $.enable = enable;
            return this;
        }

        public Builder ruleVisibility(String ruleVisibility) {
            $.ruleVisibility = ruleVisibility;
            return this;
        }

        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse build() {
            $.enable = Objects.requireNonNull($.enable, "expected parameter 'enable' to be non-null");
            $.ruleVisibility = Objects.requireNonNull($.ruleVisibility, "expected parameter 'ruleVisibility' to be non-null");
            return $;
        }
    }

}
