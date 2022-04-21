// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.aws.cognito.inputs.UserPoolClientAnalyticsConfigurationGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolClientTokenValidityUnitsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolClientState extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolClientState Empty = new UserPoolClientState();

    /**
     * Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
     */
    @Import(name="accessTokenValidity")
    private @Nullable Output<Integer> accessTokenValidity;

    public Optional<Output<Integer>> accessTokenValidity() {
        return Optional.ofNullable(this.accessTokenValidity);
    }

    /**
     * List of allowed OAuth flows (code, implicit, client_credentials).
     * 
     */
    @Import(name="allowedOauthFlows")
    private @Nullable Output<List<String>> allowedOauthFlows;

    public Optional<Output<List<String>>> allowedOauthFlows() {
        return Optional.ofNullable(this.allowedOauthFlows);
    }

    /**
     * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
     * 
     */
    @Import(name="allowedOauthFlowsUserPoolClient")
    private @Nullable Output<Boolean> allowedOauthFlowsUserPoolClient;

    public Optional<Output<Boolean>> allowedOauthFlowsUserPoolClient() {
        return Optional.ofNullable(this.allowedOauthFlowsUserPoolClient);
    }

    /**
     * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
     * 
     */
    @Import(name="allowedOauthScopes")
    private @Nullable Output<List<String>> allowedOauthScopes;

    public Optional<Output<List<String>>> allowedOauthScopes() {
        return Optional.ofNullable(this.allowedOauthScopes);
    }

    /**
     * Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
     * 
     */
    @Import(name="analyticsConfiguration")
    private @Nullable Output<UserPoolClientAnalyticsConfigurationGetArgs> analyticsConfiguration;

    public Optional<Output<UserPoolClientAnalyticsConfigurationGetArgs>> analyticsConfiguration() {
        return Optional.ofNullable(this.analyticsConfiguration);
    }

    /**
     * List of allowed callback URLs for the identity providers.
     * 
     */
    @Import(name="callbackUrls")
    private @Nullable Output<List<String>> callbackUrls;

    public Optional<Output<List<String>>> callbackUrls() {
        return Optional.ofNullable(this.callbackUrls);
    }

    /**
     * Client secret of the user pool client.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Default redirect URI. Must be in the list of callback URLs.
     * 
     */
    @Import(name="defaultRedirectUri")
    private @Nullable Output<String> defaultRedirectUri;

    public Optional<Output<String>> defaultRedirectUri() {
        return Optional.ofNullable(this.defaultRedirectUri);
    }

    /**
     * Enables or disables token revocation.
     * 
     */
    @Import(name="enableTokenRevocation")
    private @Nullable Output<Boolean> enableTokenRevocation;

    public Optional<Output<Boolean>> enableTokenRevocation() {
        return Optional.ofNullable(this.enableTokenRevocation);
    }

    /**
     * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
     * 
     */
    @Import(name="explicitAuthFlows")
    private @Nullable Output<List<String>> explicitAuthFlows;

    public Optional<Output<List<String>>> explicitAuthFlows() {
        return Optional.ofNullable(this.explicitAuthFlows);
    }

    /**
     * Should an application secret be generated.
     * 
     */
    @Import(name="generateSecret")
    private @Nullable Output<Boolean> generateSecret;

    public Optional<Output<Boolean>> generateSecret() {
        return Optional.ofNullable(this.generateSecret);
    }

    /**
     * Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
     */
    @Import(name="idTokenValidity")
    private @Nullable Output<Integer> idTokenValidity;

    public Optional<Output<Integer>> idTokenValidity() {
        return Optional.ofNullable(this.idTokenValidity);
    }

    /**
     * List of allowed logout URLs for the identity providers.
     * 
     */
    @Import(name="logoutUrls")
    private @Nullable Output<List<String>> logoutUrls;

    public Optional<Output<List<String>>> logoutUrls() {
        return Optional.ofNullable(this.logoutUrls);
    }

    /**
     * Name of the application client.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
     * 
     */
    @Import(name="preventUserExistenceErrors")
    private @Nullable Output<String> preventUserExistenceErrors;

    public Optional<Output<String>> preventUserExistenceErrors() {
        return Optional.ofNullable(this.preventUserExistenceErrors);
    }

    /**
     * List of user pool attributes the application client can read from.
     * 
     */
    @Import(name="readAttributes")
    private @Nullable Output<List<String>> readAttributes;

    public Optional<Output<List<String>>> readAttributes() {
        return Optional.ofNullable(this.readAttributes);
    }

    /**
     * Time limit in days refresh tokens are valid for.
     * 
     */
    @Import(name="refreshTokenValidity")
    private @Nullable Output<Integer> refreshTokenValidity;

    public Optional<Output<Integer>> refreshTokenValidity() {
        return Optional.ofNullable(this.refreshTokenValidity);
    }

    /**
     * List of provider names for the identity providers that are supported on this client. Uses the `provider_name` attribute of `aws.cognito.IdentityProvider` resource(s), or the equivalent string(s).
     * 
     */
    @Import(name="supportedIdentityProviders")
    private @Nullable Output<List<String>> supportedIdentityProviders;

    public Optional<Output<List<String>>> supportedIdentityProviders() {
        return Optional.ofNullable(this.supportedIdentityProviders);
    }

    /**
     * Configuration block for units in which the validity times are represented in. Detailed below.
     * 
     */
    @Import(name="tokenValidityUnits")
    private @Nullable Output<UserPoolClientTokenValidityUnitsGetArgs> tokenValidityUnits;

    public Optional<Output<UserPoolClientTokenValidityUnitsGetArgs>> tokenValidityUnits() {
        return Optional.ofNullable(this.tokenValidityUnits);
    }

    /**
     * User pool the client belongs to.
     * 
     */
    @Import(name="userPoolId")
    private @Nullable Output<String> userPoolId;

    public Optional<Output<String>> userPoolId() {
        return Optional.ofNullable(this.userPoolId);
    }

    /**
     * List of user pool attributes the application client can write to.
     * 
     */
    @Import(name="writeAttributes")
    private @Nullable Output<List<String>> writeAttributes;

    public Optional<Output<List<String>>> writeAttributes() {
        return Optional.ofNullable(this.writeAttributes);
    }

    private UserPoolClientState() {}

    private UserPoolClientState(UserPoolClientState $) {
        this.accessTokenValidity = $.accessTokenValidity;
        this.allowedOauthFlows = $.allowedOauthFlows;
        this.allowedOauthFlowsUserPoolClient = $.allowedOauthFlowsUserPoolClient;
        this.allowedOauthScopes = $.allowedOauthScopes;
        this.analyticsConfiguration = $.analyticsConfiguration;
        this.callbackUrls = $.callbackUrls;
        this.clientSecret = $.clientSecret;
        this.defaultRedirectUri = $.defaultRedirectUri;
        this.enableTokenRevocation = $.enableTokenRevocation;
        this.explicitAuthFlows = $.explicitAuthFlows;
        this.generateSecret = $.generateSecret;
        this.idTokenValidity = $.idTokenValidity;
        this.logoutUrls = $.logoutUrls;
        this.name = $.name;
        this.preventUserExistenceErrors = $.preventUserExistenceErrors;
        this.readAttributes = $.readAttributes;
        this.refreshTokenValidity = $.refreshTokenValidity;
        this.supportedIdentityProviders = $.supportedIdentityProviders;
        this.tokenValidityUnits = $.tokenValidityUnits;
        this.userPoolId = $.userPoolId;
        this.writeAttributes = $.writeAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolClientState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolClientState $;

        public Builder() {
            $ = new UserPoolClientState();
        }

        public Builder(UserPoolClientState defaults) {
            $ = new UserPoolClientState(Objects.requireNonNull(defaults));
        }

        public Builder accessTokenValidity(@Nullable Output<Integer> accessTokenValidity) {
            $.accessTokenValidity = accessTokenValidity;
            return this;
        }

        public Builder accessTokenValidity(Integer accessTokenValidity) {
            return accessTokenValidity(Output.of(accessTokenValidity));
        }

        public Builder allowedOauthFlows(@Nullable Output<List<String>> allowedOauthFlows) {
            $.allowedOauthFlows = allowedOauthFlows;
            return this;
        }

        public Builder allowedOauthFlows(List<String> allowedOauthFlows) {
            return allowedOauthFlows(Output.of(allowedOauthFlows));
        }

        public Builder allowedOauthFlows(String... allowedOauthFlows) {
            return allowedOauthFlows(List.of(allowedOauthFlows));
        }

        public Builder allowedOauthFlowsUserPoolClient(@Nullable Output<Boolean> allowedOauthFlowsUserPoolClient) {
            $.allowedOauthFlowsUserPoolClient = allowedOauthFlowsUserPoolClient;
            return this;
        }

        public Builder allowedOauthFlowsUserPoolClient(Boolean allowedOauthFlowsUserPoolClient) {
            return allowedOauthFlowsUserPoolClient(Output.of(allowedOauthFlowsUserPoolClient));
        }

        public Builder allowedOauthScopes(@Nullable Output<List<String>> allowedOauthScopes) {
            $.allowedOauthScopes = allowedOauthScopes;
            return this;
        }

        public Builder allowedOauthScopes(List<String> allowedOauthScopes) {
            return allowedOauthScopes(Output.of(allowedOauthScopes));
        }

        public Builder allowedOauthScopes(String... allowedOauthScopes) {
            return allowedOauthScopes(List.of(allowedOauthScopes));
        }

        public Builder analyticsConfiguration(@Nullable Output<UserPoolClientAnalyticsConfigurationGetArgs> analyticsConfiguration) {
            $.analyticsConfiguration = analyticsConfiguration;
            return this;
        }

        public Builder analyticsConfiguration(UserPoolClientAnalyticsConfigurationGetArgs analyticsConfiguration) {
            return analyticsConfiguration(Output.of(analyticsConfiguration));
        }

        public Builder callbackUrls(@Nullable Output<List<String>> callbackUrls) {
            $.callbackUrls = callbackUrls;
            return this;
        }

        public Builder callbackUrls(List<String> callbackUrls) {
            return callbackUrls(Output.of(callbackUrls));
        }

        public Builder callbackUrls(String... callbackUrls) {
            return callbackUrls(List.of(callbackUrls));
        }

        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder defaultRedirectUri(@Nullable Output<String> defaultRedirectUri) {
            $.defaultRedirectUri = defaultRedirectUri;
            return this;
        }

        public Builder defaultRedirectUri(String defaultRedirectUri) {
            return defaultRedirectUri(Output.of(defaultRedirectUri));
        }

        public Builder enableTokenRevocation(@Nullable Output<Boolean> enableTokenRevocation) {
            $.enableTokenRevocation = enableTokenRevocation;
            return this;
        }

        public Builder enableTokenRevocation(Boolean enableTokenRevocation) {
            return enableTokenRevocation(Output.of(enableTokenRevocation));
        }

        public Builder explicitAuthFlows(@Nullable Output<List<String>> explicitAuthFlows) {
            $.explicitAuthFlows = explicitAuthFlows;
            return this;
        }

        public Builder explicitAuthFlows(List<String> explicitAuthFlows) {
            return explicitAuthFlows(Output.of(explicitAuthFlows));
        }

        public Builder explicitAuthFlows(String... explicitAuthFlows) {
            return explicitAuthFlows(List.of(explicitAuthFlows));
        }

        public Builder generateSecret(@Nullable Output<Boolean> generateSecret) {
            $.generateSecret = generateSecret;
            return this;
        }

        public Builder generateSecret(Boolean generateSecret) {
            return generateSecret(Output.of(generateSecret));
        }

        public Builder idTokenValidity(@Nullable Output<Integer> idTokenValidity) {
            $.idTokenValidity = idTokenValidity;
            return this;
        }

        public Builder idTokenValidity(Integer idTokenValidity) {
            return idTokenValidity(Output.of(idTokenValidity));
        }

        public Builder logoutUrls(@Nullable Output<List<String>> logoutUrls) {
            $.logoutUrls = logoutUrls;
            return this;
        }

        public Builder logoutUrls(List<String> logoutUrls) {
            return logoutUrls(Output.of(logoutUrls));
        }

        public Builder logoutUrls(String... logoutUrls) {
            return logoutUrls(List.of(logoutUrls));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder preventUserExistenceErrors(@Nullable Output<String> preventUserExistenceErrors) {
            $.preventUserExistenceErrors = preventUserExistenceErrors;
            return this;
        }

        public Builder preventUserExistenceErrors(String preventUserExistenceErrors) {
            return preventUserExistenceErrors(Output.of(preventUserExistenceErrors));
        }

        public Builder readAttributes(@Nullable Output<List<String>> readAttributes) {
            $.readAttributes = readAttributes;
            return this;
        }

        public Builder readAttributes(List<String> readAttributes) {
            return readAttributes(Output.of(readAttributes));
        }

        public Builder readAttributes(String... readAttributes) {
            return readAttributes(List.of(readAttributes));
        }

        public Builder refreshTokenValidity(@Nullable Output<Integer> refreshTokenValidity) {
            $.refreshTokenValidity = refreshTokenValidity;
            return this;
        }

        public Builder refreshTokenValidity(Integer refreshTokenValidity) {
            return refreshTokenValidity(Output.of(refreshTokenValidity));
        }

        public Builder supportedIdentityProviders(@Nullable Output<List<String>> supportedIdentityProviders) {
            $.supportedIdentityProviders = supportedIdentityProviders;
            return this;
        }

        public Builder supportedIdentityProviders(List<String> supportedIdentityProviders) {
            return supportedIdentityProviders(Output.of(supportedIdentityProviders));
        }

        public Builder supportedIdentityProviders(String... supportedIdentityProviders) {
            return supportedIdentityProviders(List.of(supportedIdentityProviders));
        }

        public Builder tokenValidityUnits(@Nullable Output<UserPoolClientTokenValidityUnitsGetArgs> tokenValidityUnits) {
            $.tokenValidityUnits = tokenValidityUnits;
            return this;
        }

        public Builder tokenValidityUnits(UserPoolClientTokenValidityUnitsGetArgs tokenValidityUnits) {
            return tokenValidityUnits(Output.of(tokenValidityUnits));
        }

        public Builder userPoolId(@Nullable Output<String> userPoolId) {
            $.userPoolId = userPoolId;
            return this;
        }

        public Builder userPoolId(String userPoolId) {
            return userPoolId(Output.of(userPoolId));
        }

        public Builder writeAttributes(@Nullable Output<List<String>> writeAttributes) {
            $.writeAttributes = writeAttributes;
            return this;
        }

        public Builder writeAttributes(List<String> writeAttributes) {
            return writeAttributes(Output.of(writeAttributes));
        }

        public Builder writeAttributes(String... writeAttributes) {
            return writeAttributes(List.of(writeAttributes));
        }

        public UserPoolClientState build() {
            return $;
        }
    }

}
