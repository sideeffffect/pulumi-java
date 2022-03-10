// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for L7 DDoS detection.
 * 
 */
public final class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs Empty = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs();

    /**
     * If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    @InputImport(name="enable")
      private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    @InputImport(name="ruleVisibility")
      private final @Nullable Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility;

    public Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> getRuleVisibility() {
        return this.ruleVisibility == null ? Input.empty() : this.ruleVisibility;
    }

    public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs(
        @Nullable Input<Boolean> enable,
        @Nullable Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility) {
        this.enable = enable;
        this.ruleVisibility = ruleVisibility;
    }

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs() {
        this.enable = Input.empty();
        this.ruleVisibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.ruleVisibility = defaults.ruleVisibility;
        }

        public Builder enable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder enable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder ruleVisibility(@Nullable Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility> ruleVisibility) {
            this.ruleVisibility = ruleVisibility;
            return this;
        }

        public Builder ruleVisibility(@Nullable SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigRuleVisibility ruleVisibility) {
            this.ruleVisibility = Input.ofNullable(ruleVisibility);
            return this;
        }
        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs build() {
            return new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs(enable, ruleVisibility);
        }
    }
}
