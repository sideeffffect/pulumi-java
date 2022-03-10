// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityProviderConfigOidcGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityProviderConfigOidcGetArgs Empty = new IdentityProviderConfigOidcGetArgs();

    /**
     * Client ID for the OpenID Connect identity provider.
     * 
     */
    @InputImport(name="clientId", required=true)
      private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    /**
     * The JWT claim that the provider will use to return groups.
     * 
     */
    @InputImport(name="groupsClaim")
      private final @Nullable Input<String> groupsClaim;

    public Input<String> getGroupsClaim() {
        return this.groupsClaim == null ? Input.empty() : this.groupsClaim;
    }

    /**
     * A prefix that is prepended to group claims e.g., `oidc:`.
     * 
     */
    @InputImport(name="groupsPrefix")
      private final @Nullable Input<String> groupsPrefix;

    public Input<String> getGroupsPrefix() {
        return this.groupsPrefix == null ? Input.empty() : this.groupsPrefix;
    }

    /**
     * The name of the identity provider config.
     * 
     */
    @InputImport(name="identityProviderConfigName", required=true)
      private final Input<String> identityProviderConfigName;

    public Input<String> getIdentityProviderConfigName() {
        return this.identityProviderConfigName;
    }

    /**
     * Issuer URL for the OpenID Connect identity provider.
     * 
     */
    @InputImport(name="issuerUrl", required=true)
      private final Input<String> issuerUrl;

    public Input<String> getIssuerUrl() {
        return this.issuerUrl;
    }

    /**
     * The key value pairs that describe required claims in the identity token.
     * 
     */
    @InputImport(name="requiredClaims")
      private final @Nullable Input<Map<String,String>> requiredClaims;

    public Input<Map<String,String>> getRequiredClaims() {
        return this.requiredClaims == null ? Input.empty() : this.requiredClaims;
    }

    /**
     * The JWT claim that the provider will use as the username.
     * 
     */
    @InputImport(name="usernameClaim")
      private final @Nullable Input<String> usernameClaim;

    public Input<String> getUsernameClaim() {
        return this.usernameClaim == null ? Input.empty() : this.usernameClaim;
    }

    /**
     * A prefix that is prepended to username claims.
     * 
     */
    @InputImport(name="usernamePrefix")
      private final @Nullable Input<String> usernamePrefix;

    public Input<String> getUsernamePrefix() {
        return this.usernamePrefix == null ? Input.empty() : this.usernamePrefix;
    }

    public IdentityProviderConfigOidcGetArgs(
        Input<String> clientId,
        @Nullable Input<String> groupsClaim,
        @Nullable Input<String> groupsPrefix,
        Input<String> identityProviderConfigName,
        Input<String> issuerUrl,
        @Nullable Input<Map<String,String>> requiredClaims,
        @Nullable Input<String> usernameClaim,
        @Nullable Input<String> usernamePrefix) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.groupsClaim = groupsClaim;
        this.groupsPrefix = groupsPrefix;
        this.identityProviderConfigName = Objects.requireNonNull(identityProviderConfigName, "expected parameter 'identityProviderConfigName' to be non-null");
        this.issuerUrl = Objects.requireNonNull(issuerUrl, "expected parameter 'issuerUrl' to be non-null");
        this.requiredClaims = requiredClaims;
        this.usernameClaim = usernameClaim;
        this.usernamePrefix = usernamePrefix;
    }

    private IdentityProviderConfigOidcGetArgs() {
        this.clientId = Input.empty();
        this.groupsClaim = Input.empty();
        this.groupsPrefix = Input.empty();
        this.identityProviderConfigName = Input.empty();
        this.issuerUrl = Input.empty();
        this.requiredClaims = Input.empty();
        this.usernameClaim = Input.empty();
        this.usernamePrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderConfigOidcGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clientId;
        private @Nullable Input<String> groupsClaim;
        private @Nullable Input<String> groupsPrefix;
        private Input<String> identityProviderConfigName;
        private Input<String> issuerUrl;
        private @Nullable Input<Map<String,String>> requiredClaims;
        private @Nullable Input<String> usernameClaim;
        private @Nullable Input<String> usernamePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderConfigOidcGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.groupsClaim = defaults.groupsClaim;
    	      this.groupsPrefix = defaults.groupsPrefix;
    	      this.identityProviderConfigName = defaults.identityProviderConfigName;
    	      this.issuerUrl = defaults.issuerUrl;
    	      this.requiredClaims = defaults.requiredClaims;
    	      this.usernameClaim = defaults.usernameClaim;
    	      this.usernamePrefix = defaults.usernamePrefix;
        }

        public Builder clientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder clientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder groupsClaim(@Nullable Input<String> groupsClaim) {
            this.groupsClaim = groupsClaim;
            return this;
        }

        public Builder groupsClaim(@Nullable String groupsClaim) {
            this.groupsClaim = Input.ofNullable(groupsClaim);
            return this;
        }

        public Builder groupsPrefix(@Nullable Input<String> groupsPrefix) {
            this.groupsPrefix = groupsPrefix;
            return this;
        }

        public Builder groupsPrefix(@Nullable String groupsPrefix) {
            this.groupsPrefix = Input.ofNullable(groupsPrefix);
            return this;
        }

        public Builder identityProviderConfigName(Input<String> identityProviderConfigName) {
            this.identityProviderConfigName = Objects.requireNonNull(identityProviderConfigName);
            return this;
        }

        public Builder identityProviderConfigName(String identityProviderConfigName) {
            this.identityProviderConfigName = Input.of(Objects.requireNonNull(identityProviderConfigName));
            return this;
        }

        public Builder issuerUrl(Input<String> issuerUrl) {
            this.issuerUrl = Objects.requireNonNull(issuerUrl);
            return this;
        }

        public Builder issuerUrl(String issuerUrl) {
            this.issuerUrl = Input.of(Objects.requireNonNull(issuerUrl));
            return this;
        }

        public Builder requiredClaims(@Nullable Input<Map<String,String>> requiredClaims) {
            this.requiredClaims = requiredClaims;
            return this;
        }

        public Builder requiredClaims(@Nullable Map<String,String> requiredClaims) {
            this.requiredClaims = Input.ofNullable(requiredClaims);
            return this;
        }

        public Builder usernameClaim(@Nullable Input<String> usernameClaim) {
            this.usernameClaim = usernameClaim;
            return this;
        }

        public Builder usernameClaim(@Nullable String usernameClaim) {
            this.usernameClaim = Input.ofNullable(usernameClaim);
            return this;
        }

        public Builder usernamePrefix(@Nullable Input<String> usernamePrefix) {
            this.usernamePrefix = usernamePrefix;
            return this;
        }

        public Builder usernamePrefix(@Nullable String usernamePrefix) {
            this.usernamePrefix = Input.ofNullable(usernamePrefix);
            return this;
        }
        public IdentityProviderConfigOidcGetArgs build() {
            return new IdentityProviderConfigOidcGetArgs(clientId, groupsClaim, groupsPrefix, identityProviderConfigName, issuerUrl, requiredClaims, usernameClaim, usernamePrefix);
        }
    }
}
