// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.outputs;

import io.pulumi.azurenative.automanage.outputs.ConfigurationProfileAssignmentComplianceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationProfileAssignmentPropertiesResponse {
    /**
     * The Automanage account ARM Resource URI
     * 
     */
    private final @Nullable String accountId;
    /**
     * The configuration setting for the configuration profile.
     * 
     */
    private final @Nullable ConfigurationProfileAssignmentComplianceResponse compliance;
    /**
     * A value indicating configuration profile.
     * 
     */
    private final @Nullable String configurationProfile;
    /**
     * The configuration profile custom preferences ARM resource URI
     * 
     */
    private final @Nullable String configurationProfilePreferenceId;
    /**
     * The state of onboarding, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The target VM resource URI
     * 
     */
    private final @Nullable String targetId;

    @OutputCustomType.Constructor({"accountId","compliance","configurationProfile","configurationProfilePreferenceId","provisioningState","targetId"})
    private ConfigurationProfileAssignmentPropertiesResponse(
        @Nullable String accountId,
        @Nullable ConfigurationProfileAssignmentComplianceResponse compliance,
        @Nullable String configurationProfile,
        @Nullable String configurationProfilePreferenceId,
        String provisioningState,
        @Nullable String targetId) {
        this.accountId = accountId;
        this.compliance = compliance;
        this.configurationProfile = configurationProfile;
        this.configurationProfilePreferenceId = configurationProfilePreferenceId;
        this.provisioningState = provisioningState;
        this.targetId = targetId;
    }

    /**
     * The Automanage account ARM Resource URI
     * 
    */
    public Optional<String> getAccountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * The configuration setting for the configuration profile.
     * 
    */
    public Optional<ConfigurationProfileAssignmentComplianceResponse> getCompliance() {
        return Optional.ofNullable(this.compliance);
    }
    /**
     * A value indicating configuration profile.
     * 
    */
    public Optional<String> getConfigurationProfile() {
        return Optional.ofNullable(this.configurationProfile);
    }
    /**
     * The configuration profile custom preferences ARM resource URI
     * 
    */
    public Optional<String> getConfigurationProfilePreferenceId() {
        return Optional.ofNullable(this.configurationProfilePreferenceId);
    }
    /**
     * The state of onboarding, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The target VM resource URI
     * 
    */
    public Optional<String> getTargetId() {
        return Optional.ofNullable(this.targetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileAssignmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable ConfigurationProfileAssignmentComplianceResponse compliance;
        private @Nullable String configurationProfile;
        private @Nullable String configurationProfilePreferenceId;
        private String provisioningState;
        private @Nullable String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileAssignmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.compliance = defaults.compliance;
    	      this.configurationProfile = defaults.configurationProfile;
    	      this.configurationProfilePreferenceId = defaults.configurationProfilePreferenceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.targetId = defaults.targetId;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setCompliance(@Nullable ConfigurationProfileAssignmentComplianceResponse compliance) {
            this.compliance = compliance;
            return this;
        }

        public Builder setConfigurationProfile(@Nullable String configurationProfile) {
            this.configurationProfile = configurationProfile;
            return this;
        }

        public Builder setConfigurationProfilePreferenceId(@Nullable String configurationProfilePreferenceId) {
            this.configurationProfilePreferenceId = configurationProfilePreferenceId;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTargetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }
        public ConfigurationProfileAssignmentPropertiesResponse build() {
            return new ConfigurationProfileAssignmentPropertiesResponse(accountId, compliance, configurationProfile, configurationProfilePreferenceId, provisioningState, targetId);
        }
    }
}
