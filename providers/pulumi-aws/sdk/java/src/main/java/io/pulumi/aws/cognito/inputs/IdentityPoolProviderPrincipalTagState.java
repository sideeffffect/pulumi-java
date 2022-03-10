// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPoolProviderPrincipalTagState extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPoolProviderPrincipalTagState Empty = new IdentityPoolProviderPrincipalTagState();

    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     */
    @InputImport(name="identityPoolId")
      private final @Nullable Input<String> identityPoolId;

    public Input<String> getIdentityPoolId() {
        return this.identityPoolId == null ? Input.empty() : this.identityPoolId;
    }

    /**
     * The name of the identity provider
     * * `principal_tags`: (Optional: []) - String to string map of variables
     * * `use_defaults`: (Optional: true) use default (username and clientID) attribute mappings.
     * 
     */
    @InputImport(name="identityProviderName")
      private final @Nullable Input<String> identityProviderName;

    public Input<String> getIdentityProviderName() {
        return this.identityProviderName == null ? Input.empty() : this.identityProviderName;
    }

    @InputImport(name="principalTags")
      private final @Nullable Input<Map<String,String>> principalTags;

    public Input<Map<String,String>> getPrincipalTags() {
        return this.principalTags == null ? Input.empty() : this.principalTags;
    }

    @InputImport(name="useDefaults")
      private final @Nullable Input<Boolean> useDefaults;

    public Input<Boolean> getUseDefaults() {
        return this.useDefaults == null ? Input.empty() : this.useDefaults;
    }

    public IdentityPoolProviderPrincipalTagState(
        @Nullable Input<String> identityPoolId,
        @Nullable Input<String> identityProviderName,
        @Nullable Input<Map<String,String>> principalTags,
        @Nullable Input<Boolean> useDefaults) {
        this.identityPoolId = identityPoolId;
        this.identityProviderName = identityProviderName;
        this.principalTags = principalTags;
        this.useDefaults = useDefaults;
    }

    private IdentityPoolProviderPrincipalTagState() {
        this.identityPoolId = Input.empty();
        this.identityProviderName = Input.empty();
        this.principalTags = Input.empty();
        this.useDefaults = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolProviderPrincipalTagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identityPoolId;
        private @Nullable Input<String> identityProviderName;
        private @Nullable Input<Map<String,String>> principalTags;
        private @Nullable Input<Boolean> useDefaults;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolProviderPrincipalTagState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.identityProviderName = defaults.identityProviderName;
    	      this.principalTags = defaults.principalTags;
    	      this.useDefaults = defaults.useDefaults;
        }

        public Builder identityPoolId(@Nullable Input<String> identityPoolId) {
            this.identityPoolId = identityPoolId;
            return this;
        }

        public Builder identityPoolId(@Nullable String identityPoolId) {
            this.identityPoolId = Input.ofNullable(identityPoolId);
            return this;
        }

        public Builder identityProviderName(@Nullable Input<String> identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }

        public Builder identityProviderName(@Nullable String identityProviderName) {
            this.identityProviderName = Input.ofNullable(identityProviderName);
            return this;
        }

        public Builder principalTags(@Nullable Input<Map<String,String>> principalTags) {
            this.principalTags = principalTags;
            return this;
        }

        public Builder principalTags(@Nullable Map<String,String> principalTags) {
            this.principalTags = Input.ofNullable(principalTags);
            return this;
        }

        public Builder useDefaults(@Nullable Input<Boolean> useDefaults) {
            this.useDefaults = useDefaults;
            return this;
        }

        public Builder useDefaults(@Nullable Boolean useDefaults) {
            this.useDefaults = Input.ofNullable(useDefaults);
            return this;
        }
        public IdentityPoolProviderPrincipalTagState build() {
            return new IdentityPoolProviderPrincipalTagState(identityPoolId, identityProviderName, principalTags, useDefaults);
        }
    }
}
