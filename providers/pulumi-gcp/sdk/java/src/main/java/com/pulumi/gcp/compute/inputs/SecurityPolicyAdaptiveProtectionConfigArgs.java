// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyAdaptiveProtectionConfigArgs extends ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigArgs Empty = new SecurityPolicyAdaptiveProtectionConfigArgs();

    /**
     * Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
     */
    @Import(name="layer7DdosDefenseConfig")
    private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> layer7DdosDefenseConfig;

    /**
     * @return Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
     */
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

        /**
         * @param layer7DdosDefenseConfig Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder layer7DdosDefenseConfig(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs> layer7DdosDefenseConfig) {
            $.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
            return this;
        }

        /**
         * @param layer7DdosDefenseConfig Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder layer7DdosDefenseConfig(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigArgs layer7DdosDefenseConfig) {
            return layer7DdosDefenseConfig(Output.of(layer7DdosDefenseConfig));
        }

        public SecurityPolicyAdaptiveProtectionConfigArgs build() {
            return $;
        }
    }

}
