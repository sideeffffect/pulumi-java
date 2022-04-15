// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs Empty = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs();

    /**
     * If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    /**
     * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    @Import(name="ruleVisibility")
      private final @Nullable Output<String> ruleVisibility;

    public Output<String> ruleVisibility() {
        return this.ruleVisibility == null ? Codegen.empty() : this.ruleVisibility;
    }

    public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs(
        @Nullable Output<Boolean> enable,
        @Nullable Output<String> ruleVisibility) {
        this.enable = enable;
        this.ruleVisibility = ruleVisibility;
    }

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs() {
        this.enable = Codegen.empty();
        this.ruleVisibility = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<String> ruleVisibility;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.ruleVisibility = defaults.ruleVisibility;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }
        public Builder ruleVisibility(@Nullable Output<String> ruleVisibility) {
            this.ruleVisibility = ruleVisibility;
            return this;
        }
        public Builder ruleVisibility(@Nullable String ruleVisibility) {
            this.ruleVisibility = Codegen.ofNullable(ruleVisibility);
            return this;
        }        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs build() {
            return new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs(enable, ruleVisibility);
        }
    }
}
