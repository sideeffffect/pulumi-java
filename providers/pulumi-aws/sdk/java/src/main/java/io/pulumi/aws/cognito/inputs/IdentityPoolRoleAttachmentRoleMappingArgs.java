// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPoolRoleAttachmentRoleMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPoolRoleAttachmentRoleMappingArgs Empty = new IdentityPoolRoleAttachmentRoleMappingArgs();

    /**
     * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
     * 
     */
    @InputImport(name="ambiguousRoleResolution")
      private final @Nullable Input<String> ambiguousRoleResolution;

    public Input<String> getAmbiguousRoleResolution() {
        return this.ambiguousRoleResolution == null ? Input.empty() : this.ambiguousRoleResolution;
    }

    /**
     * A string identifying the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id". Depends on `cognito_identity_providers` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
     * 
     */
    @InputImport(name="identityProvider", required=true)
      private final Input<String> identityProvider;

    public Input<String> getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
     * 
     */
    @InputImport(name="mappingRules")
      private final @Nullable Input<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules;

    public Input<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> getMappingRules() {
        return this.mappingRules == null ? Input.empty() : this.mappingRules;
    }

    /**
     * The role mapping type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public IdentityPoolRoleAttachmentRoleMappingArgs(
        @Nullable Input<String> ambiguousRoleResolution,
        Input<String> identityProvider,
        @Nullable Input<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules,
        Input<String> type) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
        this.identityProvider = Objects.requireNonNull(identityProvider, "expected parameter 'identityProvider' to be non-null");
        this.mappingRules = mappingRules;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IdentityPoolRoleAttachmentRoleMappingArgs() {
        this.ambiguousRoleResolution = Input.empty();
        this.identityProvider = Input.empty();
        this.mappingRules = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolRoleAttachmentRoleMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ambiguousRoleResolution;
        private Input<String> identityProvider;
        private @Nullable Input<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolRoleAttachmentRoleMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambiguousRoleResolution = defaults.ambiguousRoleResolution;
    	      this.identityProvider = defaults.identityProvider;
    	      this.mappingRules = defaults.mappingRules;
    	      this.type = defaults.type;
        }

        public Builder ambiguousRoleResolution(@Nullable Input<String> ambiguousRoleResolution) {
            this.ambiguousRoleResolution = ambiguousRoleResolution;
            return this;
        }

        public Builder ambiguousRoleResolution(@Nullable String ambiguousRoleResolution) {
            this.ambiguousRoleResolution = Input.ofNullable(ambiguousRoleResolution);
            return this;
        }

        public Builder identityProvider(Input<String> identityProvider) {
            this.identityProvider = Objects.requireNonNull(identityProvider);
            return this;
        }

        public Builder identityProvider(String identityProvider) {
            this.identityProvider = Input.of(Objects.requireNonNull(identityProvider));
            return this;
        }

        public Builder mappingRules(@Nullable Input<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules) {
            this.mappingRules = mappingRules;
            return this;
        }

        public Builder mappingRules(@Nullable List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs> mappingRules) {
            this.mappingRules = Input.ofNullable(mappingRules);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public IdentityPoolRoleAttachmentRoleMappingArgs build() {
            return new IdentityPoolRoleAttachmentRoleMappingArgs(ambiguousRoleResolution, identityProvider, mappingRules, type);
        }
    }
}
