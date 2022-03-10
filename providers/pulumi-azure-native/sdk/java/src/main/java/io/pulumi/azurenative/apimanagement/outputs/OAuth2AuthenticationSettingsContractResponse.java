// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OAuth2AuthenticationSettingsContractResponse {
    /**
     * OAuth authorization server identifier.
     * 
     */
    private final @Nullable String authorizationServerId;
    /**
     * operations scope.
     * 
     */
    private final @Nullable String scope;

    @OutputCustomType.Constructor
    private OAuth2AuthenticationSettingsContractResponse(
        @OutputCustomType.Parameter("authorizationServerId") @Nullable String authorizationServerId,
        @OutputCustomType.Parameter("scope") @Nullable String scope) {
        this.authorizationServerId = authorizationServerId;
        this.scope = scope;
    }

    /**
     * OAuth authorization server identifier.
     * 
    */
    public Optional<String> getAuthorizationServerId() {
        return Optional.ofNullable(this.authorizationServerId);
    }
    /**
     * operations scope.
     * 
    */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuth2AuthenticationSettingsContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationServerId;
        private @Nullable String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuth2AuthenticationSettingsContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationServerId = defaults.authorizationServerId;
    	      this.scope = defaults.scope;
        }

        public Builder authorizationServerId(@Nullable String authorizationServerId) {
            this.authorizationServerId = authorizationServerId;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public OAuth2AuthenticationSettingsContractResponse build() {
            return new OAuth2AuthenticationSettingsContractResponse(authorizationServerId, scope);
        }
    }
}
