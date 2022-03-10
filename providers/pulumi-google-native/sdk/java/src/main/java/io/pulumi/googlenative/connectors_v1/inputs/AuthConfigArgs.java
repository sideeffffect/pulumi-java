// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.connectors_v1.enums.AuthConfigAuthType;
import io.pulumi.googlenative.connectors_v1.inputs.ConfigVariableArgs;
import io.pulumi.googlenative.connectors_v1.inputs.Oauth2ClientCredentialsArgs;
import io.pulumi.googlenative.connectors_v1.inputs.Oauth2JwtBearerArgs;
import io.pulumi.googlenative.connectors_v1.inputs.UserPasswordArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AuthConfig defines details of a authentication type.
 * 
 */
public final class AuthConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthConfigArgs Empty = new AuthConfigArgs();

    /**
     * List containing additional auth configs.
     * 
     */
    @InputImport(name="additionalVariables")
      private final @Nullable Input<List<ConfigVariableArgs>> additionalVariables;

    public Input<List<ConfigVariableArgs>> getAdditionalVariables() {
        return this.additionalVariables == null ? Input.empty() : this.additionalVariables;
    }

    /**
     * The type of authentication configured.
     * 
     */
    @InputImport(name="authType")
      private final @Nullable Input<AuthConfigAuthType> authType;

    public Input<AuthConfigAuthType> getAuthType() {
        return this.authType == null ? Input.empty() : this.authType;
    }

    /**
     * Oauth2ClientCredentials.
     * 
     */
    @InputImport(name="oauth2ClientCredentials")
      private final @Nullable Input<Oauth2ClientCredentialsArgs> oauth2ClientCredentials;

    public Input<Oauth2ClientCredentialsArgs> getOauth2ClientCredentials() {
        return this.oauth2ClientCredentials == null ? Input.empty() : this.oauth2ClientCredentials;
    }

    /**
     * Oauth2JwtBearer.
     * 
     */
    @InputImport(name="oauth2JwtBearer")
      private final @Nullable Input<Oauth2JwtBearerArgs> oauth2JwtBearer;

    public Input<Oauth2JwtBearerArgs> getOauth2JwtBearer() {
        return this.oauth2JwtBearer == null ? Input.empty() : this.oauth2JwtBearer;
    }

    /**
     * UserPassword.
     * 
     */
    @InputImport(name="userPassword")
      private final @Nullable Input<UserPasswordArgs> userPassword;

    public Input<UserPasswordArgs> getUserPassword() {
        return this.userPassword == null ? Input.empty() : this.userPassword;
    }

    public AuthConfigArgs(
        @Nullable Input<List<ConfigVariableArgs>> additionalVariables,
        @Nullable Input<AuthConfigAuthType> authType,
        @Nullable Input<Oauth2ClientCredentialsArgs> oauth2ClientCredentials,
        @Nullable Input<Oauth2JwtBearerArgs> oauth2JwtBearer,
        @Nullable Input<UserPasswordArgs> userPassword) {
        this.additionalVariables = additionalVariables;
        this.authType = authType;
        this.oauth2ClientCredentials = oauth2ClientCredentials;
        this.oauth2JwtBearer = oauth2JwtBearer;
        this.userPassword = userPassword;
    }

    private AuthConfigArgs() {
        this.additionalVariables = Input.empty();
        this.authType = Input.empty();
        this.oauth2ClientCredentials = Input.empty();
        this.oauth2JwtBearer = Input.empty();
        this.userPassword = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ConfigVariableArgs>> additionalVariables;
        private @Nullable Input<AuthConfigAuthType> authType;
        private @Nullable Input<Oauth2ClientCredentialsArgs> oauth2ClientCredentials;
        private @Nullable Input<Oauth2JwtBearerArgs> oauth2JwtBearer;
        private @Nullable Input<UserPasswordArgs> userPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalVariables = defaults.additionalVariables;
    	      this.authType = defaults.authType;
    	      this.oauth2ClientCredentials = defaults.oauth2ClientCredentials;
    	      this.oauth2JwtBearer = defaults.oauth2JwtBearer;
    	      this.userPassword = defaults.userPassword;
        }

        public Builder additionalVariables(@Nullable Input<List<ConfigVariableArgs>> additionalVariables) {
            this.additionalVariables = additionalVariables;
            return this;
        }

        public Builder additionalVariables(@Nullable List<ConfigVariableArgs> additionalVariables) {
            this.additionalVariables = Input.ofNullable(additionalVariables);
            return this;
        }

        public Builder authType(@Nullable Input<AuthConfigAuthType> authType) {
            this.authType = authType;
            return this;
        }

        public Builder authType(@Nullable AuthConfigAuthType authType) {
            this.authType = Input.ofNullable(authType);
            return this;
        }

        public Builder oauth2ClientCredentials(@Nullable Input<Oauth2ClientCredentialsArgs> oauth2ClientCredentials) {
            this.oauth2ClientCredentials = oauth2ClientCredentials;
            return this;
        }

        public Builder oauth2ClientCredentials(@Nullable Oauth2ClientCredentialsArgs oauth2ClientCredentials) {
            this.oauth2ClientCredentials = Input.ofNullable(oauth2ClientCredentials);
            return this;
        }

        public Builder oauth2JwtBearer(@Nullable Input<Oauth2JwtBearerArgs> oauth2JwtBearer) {
            this.oauth2JwtBearer = oauth2JwtBearer;
            return this;
        }

        public Builder oauth2JwtBearer(@Nullable Oauth2JwtBearerArgs oauth2JwtBearer) {
            this.oauth2JwtBearer = Input.ofNullable(oauth2JwtBearer);
            return this;
        }

        public Builder userPassword(@Nullable Input<UserPasswordArgs> userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder userPassword(@Nullable UserPasswordArgs userPassword) {
            this.userPassword = Input.ofNullable(userPassword);
            return this;
        }
        public AuthConfigArgs build() {
            return new AuthConfigArgs(additionalVariables, authType, oauth2ClientCredentials, oauth2JwtBearer, userPassword);
        }
    }
}
