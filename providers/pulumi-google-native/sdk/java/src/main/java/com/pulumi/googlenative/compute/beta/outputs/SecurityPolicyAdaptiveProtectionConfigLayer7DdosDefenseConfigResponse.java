// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse {
    /**
     * @return If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    private final Boolean enable;
    /**
     * @return Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    private final String ruleVisibility;

    @CustomType.Constructor
    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse(
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("ruleVisibility") String ruleVisibility) {
        this.enable = enable;
        this.ruleVisibility = ruleVisibility;
    }

    /**
     * @return If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    public String ruleVisibility() {
        return this.ruleVisibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private String ruleVisibility;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.ruleVisibility = defaults.ruleVisibility;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder ruleVisibility(String ruleVisibility) {
            this.ruleVisibility = Objects.requireNonNull(ruleVisibility);
            return this;
        }        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse build() {
            return new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse(enable, ruleVisibility);
        }
    }
}
