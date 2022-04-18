// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionAuthenticateOidcGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionAuthenticateOidcGetArgs Empty = new ListenerDefaultActionAuthenticateOidcGetArgs();

    /**
     * Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    @Import(name="authenticationRequestExtraParams")
      private final @Nullable Output<Map<String,String>> authenticationRequestExtraParams;

    public Output<Map<String,String>> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Codegen.empty() : this.authenticationRequestExtraParams;
    }

    /**
     * Authorization endpoint of the IdP.
     * 
     */
    @Import(name="authorizationEndpoint", required=true)
      private final Output<String> authorizationEndpoint;

    public Output<String> authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * OAuth 2.0 client identifier.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * OAuth 2.0 client secret.
     * 
     */
    @Import(name="clientSecret", required=true)
      private final Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * OIDC issuer identifier of the IdP.
     * 
     */
    @Import(name="issuer", required=true)
      private final Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer;
    }

    /**
     * Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    @Import(name="onUnauthenticatedRequest")
      private final @Nullable Output<String> onUnauthenticatedRequest;

    public Output<String> onUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest == null ? Codegen.empty() : this.onUnauthenticatedRequest;
    }

    /**
     * Set of user claims to be requested from the IdP.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    /**
     * Name of the cookie used to maintain session information.
     * 
     */
    @Import(name="sessionCookieName")
      private final @Nullable Output<String> sessionCookieName;

    public Output<String> sessionCookieName() {
        return this.sessionCookieName == null ? Codegen.empty() : this.sessionCookieName;
    }

    /**
     * Maximum duration of the authentication session, in seconds.
     * 
     */
    @Import(name="sessionTimeout")
      private final @Nullable Output<Integer> sessionTimeout;

    public Output<Integer> sessionTimeout() {
        return this.sessionTimeout == null ? Codegen.empty() : this.sessionTimeout;
    }

    /**
     * Token endpoint of the IdP.
     * 
     */
    @Import(name="tokenEndpoint", required=true)
      private final Output<String> tokenEndpoint;

    public Output<String> tokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * User info endpoint of the IdP.
     * 
     */
    @Import(name="userInfoEndpoint", required=true)
      private final Output<String> userInfoEndpoint;

    public Output<String> userInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public ListenerDefaultActionAuthenticateOidcGetArgs(
        @Nullable Output<Map<String,String>> authenticationRequestExtraParams,
        Output<String> authorizationEndpoint,
        Output<String> clientId,
        Output<String> clientSecret,
        Output<String> issuer,
        @Nullable Output<String> onUnauthenticatedRequest,
        @Nullable Output<String> scope,
        @Nullable Output<String> sessionCookieName,
        @Nullable Output<Integer> sessionTimeout,
        Output<String> tokenEndpoint,
        Output<String> userInfoEndpoint) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint, "expected parameter 'tokenEndpoint' to be non-null");
        this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint, "expected parameter 'userInfoEndpoint' to be non-null");
    }

    private ListenerDefaultActionAuthenticateOidcGetArgs() {
        this.authenticationRequestExtraParams = Codegen.empty();
        this.authorizationEndpoint = Codegen.empty();
        this.clientId = Codegen.empty();
        this.clientSecret = Codegen.empty();
        this.issuer = Codegen.empty();
        this.onUnauthenticatedRequest = Codegen.empty();
        this.scope = Codegen.empty();
        this.sessionCookieName = Codegen.empty();
        this.sessionTimeout = Codegen.empty();
        this.tokenEndpoint = Codegen.empty();
        this.userInfoEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionAuthenticateOidcGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> authenticationRequestExtraParams;
        private Output<String> authorizationEndpoint;
        private Output<String> clientId;
        private Output<String> clientSecret;
        private Output<String> issuer;
        private @Nullable Output<String> onUnauthenticatedRequest;
        private @Nullable Output<String> scope;
        private @Nullable Output<String> sessionCookieName;
        private @Nullable Output<Integer> sessionTimeout;
        private Output<String> tokenEndpoint;
        private Output<String> userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionAuthenticateOidcGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuer = defaults.issuer;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.userInfoEndpoint = defaults.userInfoEndpoint;
        }

        public Builder authenticationRequestExtraParams(@Nullable Output<Map<String,String>> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }
        public Builder authenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Codegen.ofNullable(authenticationRequestExtraParams);
            return this;
        }
        public Builder authorizationEndpoint(Output<String> authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Output.of(Objects.requireNonNull(authorizationEndpoint));
            return this;
        }
        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder clientSecret(Output<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Output.of(Objects.requireNonNull(clientSecret));
            return this;
        }
        public Builder issuer(Output<String> issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Output.of(Objects.requireNonNull(issuer));
            return this;
        }
        public Builder onUnauthenticatedRequest(@Nullable Output<String> onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }
        public Builder onUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Codegen.ofNullable(onUnauthenticatedRequest);
            return this;
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder sessionCookieName(@Nullable Output<String> sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }
        public Builder sessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = Codegen.ofNullable(sessionCookieName);
            return this;
        }
        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        public Builder sessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = Codegen.ofNullable(sessionTimeout);
            return this;
        }
        public Builder tokenEndpoint(Output<String> tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Output.of(Objects.requireNonNull(tokenEndpoint));
            return this;
        }
        public Builder userInfoEndpoint(Output<String> userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }
        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Output.of(Objects.requireNonNull(userInfoEndpoint));
            return this;
        }        public ListenerDefaultActionAuthenticateOidcGetArgs build() {
            return new ListenerDefaultActionAuthenticateOidcGetArgs(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, userInfoEndpoint);
        }
    }
}
