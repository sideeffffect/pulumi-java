// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for Cloud Armor Adaptive Protection (CAAP).
 * 
 */
public final class SecurityPolicyAdaptiveProtectionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigArgs Empty = new SecurityPolicyAdaptiveProtectionConfigArgs();

    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
     */
    @Import(name="layer7DdosDefenseConfig")
    private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> layer7DdosDefenseConfig;

    public Optional<Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs>> layer7DdosDefenseConfig() {
        return Optional.ofNullable(this.layer7DdosDefenseConfig);
    }

    private SecurityPolicyAdaptiveProtectionConfigArgs() {}

    private SecurityPolicyAdaptiveProtectionConfigArgs(SecurityPolicyAdaptiveProtectionConfigArgs $) {
        this.layer7DdosDefenseConfig = $.layer7DdosDefenseConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyAdaptiveProtectionConfigArgs $;

        public Builder() {
            $ = new SecurityPolicyAdaptiveProtectionConfigArgs();
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigArgs defaults) {
            $ = new SecurityPolicyAdaptiveProtectionConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder layer7DdosDefenseConfig(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> layer7DdosDefenseConfig) {
            $.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
            return this;
        }

        public Builder layer7DdosDefenseConfig(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs layer7DdosDefenseConfig) {
            return layer7DdosDefenseConfig(Output.of(layer7DdosDefenseConfig));
        }

        public SecurityPolicyAdaptiveProtectionConfigArgs build() {
            return $;
        }
    }

}
