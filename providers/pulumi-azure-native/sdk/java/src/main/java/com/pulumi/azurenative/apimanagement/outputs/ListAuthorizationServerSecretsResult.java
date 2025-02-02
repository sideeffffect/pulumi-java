// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListAuthorizationServerSecretsResult {
    /**
     * @return oAuth Authorization Server Secrets.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * @return Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
     */
    private final @Nullable String resourceOwnerPassword;
    /**
     * @return Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
     */
    private final @Nullable String resourceOwnerUsername;

    @CustomType.Constructor
    private ListAuthorizationServerSecretsResult(
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("resourceOwnerPassword") @Nullable String resourceOwnerPassword,
        @CustomType.Parameter("resourceOwnerUsername") @Nullable String resourceOwnerUsername) {
        this.clientSecret = clientSecret;
        this.resourceOwnerPassword = resourceOwnerPassword;
        this.resourceOwnerUsername = resourceOwnerUsername;
    }

    /**
     * @return oAuth Authorization Server Secrets.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
     */
    public Optional<String> resourceOwnerPassword() {
        return Optional.ofNullable(this.resourceOwnerPassword);
    }
    /**
     * @return Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
     */
    public Optional<String> resourceOwnerUsername() {
        return Optional.ofNullable(this.resourceOwnerUsername);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAuthorizationServerSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientSecret;
        private @Nullable String resourceOwnerPassword;
        private @Nullable String resourceOwnerUsername;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAuthorizationServerSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientSecret = defaults.clientSecret;
    	      this.resourceOwnerPassword = defaults.resourceOwnerPassword;
    	      this.resourceOwnerUsername = defaults.resourceOwnerUsername;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder resourceOwnerPassword(@Nullable String resourceOwnerPassword) {
            this.resourceOwnerPassword = resourceOwnerPassword;
            return this;
        }
        public Builder resourceOwnerUsername(@Nullable String resourceOwnerUsername) {
            this.resourceOwnerUsername = resourceOwnerUsername;
            return this;
        }        public ListAuthorizationServerSecretsResult build() {
            return new ListAuthorizationServerSecretsResult(clientSecret, resourceOwnerPassword, resourceOwnerUsername);
        }
    }
}
