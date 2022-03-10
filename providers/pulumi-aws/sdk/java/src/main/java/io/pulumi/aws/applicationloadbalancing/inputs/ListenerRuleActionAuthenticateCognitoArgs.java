// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionAuthenticateCognitoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionAuthenticateCognitoArgs Empty = new ListenerRuleActionAuthenticateCognitoArgs();

    /**
     * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    @InputImport(name="authenticationRequestExtraParams")
      private final @Nullable Input<Map<String,String>> authenticationRequestExtraParams;

    public Input<Map<String,String>> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Input.empty() : this.authenticationRequestExtraParams;
    }

    /**
     * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    @InputImport(name="onUnauthenticatedRequest")
      private final @Nullable Input<String> onUnauthenticatedRequest;

    public Input<String> getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest == null ? Input.empty() : this.onUnauthenticatedRequest;
    }

    /**
     * The set of user claims to be requested from the IdP.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * The name of the cookie used to maintain session information.
     * 
     */
    @InputImport(name="sessionCookieName")
      private final @Nullable Input<String> sessionCookieName;

    public Input<String> getSessionCookieName() {
        return this.sessionCookieName == null ? Input.empty() : this.sessionCookieName;
    }

    /**
     * The maximum duration of the authentication session, in seconds.
     * 
     */
    @InputImport(name="sessionTimeout")
      private final @Nullable Input<Integer> sessionTimeout;

    public Input<Integer> getSessionTimeout() {
        return this.sessionTimeout == null ? Input.empty() : this.sessionTimeout;
    }

    /**
     * The ARN of the Cognito user pool.
     * 
     */
    @InputImport(name="userPoolArn", required=true)
      private final Input<String> userPoolArn;

    public Input<String> getUserPoolArn() {
        return this.userPoolArn;
    }

    /**
     * The ID of the Cognito user pool client.
     * 
     */
    @InputImport(name="userPoolClientId", required=true)
      private final Input<String> userPoolClientId;

    public Input<String> getUserPoolClientId() {
        return this.userPoolClientId;
    }

    /**
     * The domain prefix or fully-qualified domain name of the Cognito user pool.
     * 
     */
    @InputImport(name="userPoolDomain", required=true)
      private final Input<String> userPoolDomain;

    public Input<String> getUserPoolDomain() {
        return this.userPoolDomain;
    }

    public ListenerRuleActionAuthenticateCognitoArgs(
        @Nullable Input<Map<String,String>> authenticationRequestExtraParams,
        @Nullable Input<String> onUnauthenticatedRequest,
        @Nullable Input<String> scope,
        @Nullable Input<String> sessionCookieName,
        @Nullable Input<Integer> sessionTimeout,
        Input<String> userPoolArn,
        Input<String> userPoolClientId,
        Input<String> userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = Objects.requireNonNull(userPoolArn, "expected parameter 'userPoolArn' to be non-null");
        this.userPoolClientId = Objects.requireNonNull(userPoolClientId, "expected parameter 'userPoolClientId' to be non-null");
        this.userPoolDomain = Objects.requireNonNull(userPoolDomain, "expected parameter 'userPoolDomain' to be non-null");
    }

    private ListenerRuleActionAuthenticateCognitoArgs() {
        this.authenticationRequestExtraParams = Input.empty();
        this.onUnauthenticatedRequest = Input.empty();
        this.scope = Input.empty();
        this.sessionCookieName = Input.empty();
        this.sessionTimeout = Input.empty();
        this.userPoolArn = Input.empty();
        this.userPoolClientId = Input.empty();
        this.userPoolDomain = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionAuthenticateCognitoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> authenticationRequestExtraParams;
        private @Nullable Input<String> onUnauthenticatedRequest;
        private @Nullable Input<String> scope;
        private @Nullable Input<String> sessionCookieName;
        private @Nullable Input<Integer> sessionTimeout;
        private Input<String> userPoolArn;
        private Input<String> userPoolClientId;
        private Input<String> userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionAuthenticateCognitoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.userPoolArn = defaults.userPoolArn;
    	      this.userPoolClientId = defaults.userPoolClientId;
    	      this.userPoolDomain = defaults.userPoolDomain;
        }

        public Builder authenticationRequestExtraParams(@Nullable Input<Map<String,String>> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder authenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Input.ofNullable(authenticationRequestExtraParams);
            return this;
        }

        public Builder onUnauthenticatedRequest(@Nullable Input<String> onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder onUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Input.ofNullable(onUnauthenticatedRequest);
            return this;
        }

        public Builder scope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder sessionCookieName(@Nullable Input<String> sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder sessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = Input.ofNullable(sessionCookieName);
            return this;
        }

        public Builder sessionTimeout(@Nullable Input<Integer> sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder sessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = Input.ofNullable(sessionTimeout);
            return this;
        }

        public Builder userPoolArn(Input<String> userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }

        public Builder userPoolArn(String userPoolArn) {
            this.userPoolArn = Input.of(Objects.requireNonNull(userPoolArn));
            return this;
        }

        public Builder userPoolClientId(Input<String> userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }

        public Builder userPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Input.of(Objects.requireNonNull(userPoolClientId));
            return this;
        }

        public Builder userPoolDomain(Input<String> userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }

        public Builder userPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Input.of(Objects.requireNonNull(userPoolDomain));
            return this;
        }
        public ListenerRuleActionAuthenticateCognitoArgs build() {
            return new ListenerRuleActionAuthenticateCognitoArgs(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
