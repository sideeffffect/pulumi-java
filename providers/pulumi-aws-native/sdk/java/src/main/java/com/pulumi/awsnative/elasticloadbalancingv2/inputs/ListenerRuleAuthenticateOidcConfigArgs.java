// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleAuthenticateOidcConfigArgs extends ResourceArgs {

    public static final ListenerRuleAuthenticateOidcConfigArgs Empty = new ListenerRuleAuthenticateOidcConfigArgs();

    @Import(name="authenticationRequestExtraParams")
    private @Nullable Output<Object> authenticationRequestExtraParams;

    public Optional<Output<Object>> authenticationRequestExtraParams() {
        return Optional.ofNullable(this.authenticationRequestExtraParams);
    }

    @Import(name="authorizationEndpoint", required=true)
    private Output<String> authorizationEndpoint;

    public Output<String> authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    @Import(name="clientId", required=true)
    private Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    @Import(name="issuer", required=true)
    private Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer;
    }

    @Import(name="onUnauthenticatedRequest")
    private @Nullable Output<String> onUnauthenticatedRequest;

    public Optional<Output<String>> onUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }

    @Import(name="scope")
    private @Nullable Output<String> scope;

    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    @Import(name="sessionCookieName")
    private @Nullable Output<String> sessionCookieName;

    public Optional<Output<String>> sessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }

    @Import(name="sessionTimeout")
    private @Nullable Output<Integer> sessionTimeout;

    public Optional<Output<Integer>> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }

    @Import(name="tokenEndpoint", required=true)
    private Output<String> tokenEndpoint;

    public Output<String> tokenEndpoint() {
        return this.tokenEndpoint;
    }

    @Import(name="useExistingClientSecret")
    private @Nullable Output<Boolean> useExistingClientSecret;

    public Optional<Output<Boolean>> useExistingClientSecret() {
        return Optional.ofNullable(this.useExistingClientSecret);
    }

    @Import(name="userInfoEndpoint", required=true)
    private Output<String> userInfoEndpoint;

    public Output<String> userInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    private ListenerRuleAuthenticateOidcConfigArgs() {}

    private ListenerRuleAuthenticateOidcConfigArgs(ListenerRuleAuthenticateOidcConfigArgs $) {
        this.authenticationRequestExtraParams = $.authenticationRequestExtraParams;
        this.authorizationEndpoint = $.authorizationEndpoint;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.issuer = $.issuer;
        this.onUnauthenticatedRequest = $.onUnauthenticatedRequest;
        this.scope = $.scope;
        this.sessionCookieName = $.sessionCookieName;
        this.sessionTimeout = $.sessionTimeout;
        this.tokenEndpoint = $.tokenEndpoint;
        this.useExistingClientSecret = $.useExistingClientSecret;
        this.userInfoEndpoint = $.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleAuthenticateOidcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleAuthenticateOidcConfigArgs $;

        public Builder() {
            $ = new ListenerRuleAuthenticateOidcConfigArgs();
        }

        public Builder(ListenerRuleAuthenticateOidcConfigArgs defaults) {
            $ = new ListenerRuleAuthenticateOidcConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationRequestExtraParams(@Nullable Output<Object> authenticationRequestExtraParams) {
            $.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder authenticationRequestExtraParams(Object authenticationRequestExtraParams) {
            return authenticationRequestExtraParams(Output.of(authenticationRequestExtraParams));
        }

        public Builder authorizationEndpoint(Output<String> authorizationEndpoint) {
            $.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            return authorizationEndpoint(Output.of(authorizationEndpoint));
        }

        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder issuer(Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        public Builder onUnauthenticatedRequest(@Nullable Output<String> onUnauthenticatedRequest) {
            $.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder onUnauthenticatedRequest(String onUnauthenticatedRequest) {
            return onUnauthenticatedRequest(Output.of(onUnauthenticatedRequest));
        }

        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder sessionCookieName(@Nullable Output<String> sessionCookieName) {
            $.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder sessionCookieName(String sessionCookieName) {
            return sessionCookieName(Output.of(sessionCookieName));
        }

        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            $.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder sessionTimeout(Integer sessionTimeout) {
            return sessionTimeout(Output.of(sessionTimeout));
        }

        public Builder tokenEndpoint(Output<String> tokenEndpoint) {
            $.tokenEndpoint = tokenEndpoint;
            return this;
        }

        public Builder tokenEndpoint(String tokenEndpoint) {
            return tokenEndpoint(Output.of(tokenEndpoint));
        }

        public Builder useExistingClientSecret(@Nullable Output<Boolean> useExistingClientSecret) {
            $.useExistingClientSecret = useExistingClientSecret;
            return this;
        }

        public Builder useExistingClientSecret(Boolean useExistingClientSecret) {
            return useExistingClientSecret(Output.of(useExistingClientSecret));
        }

        public Builder userInfoEndpoint(Output<String> userInfoEndpoint) {
            $.userInfoEndpoint = userInfoEndpoint;
            return this;
        }

        public Builder userInfoEndpoint(String userInfoEndpoint) {
            return userInfoEndpoint(Output.of(userInfoEndpoint));
        }

        public ListenerRuleAuthenticateOidcConfigArgs build() {
            $.authorizationEndpoint = Objects.requireNonNull($.authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            $.tokenEndpoint = Objects.requireNonNull($.tokenEndpoint, "expected parameter 'tokenEndpoint' to be non-null");
            $.userInfoEndpoint = Objects.requireNonNull($.userInfoEndpoint, "expected parameter 'userInfoEndpoint' to be non-null");
            return $;
        }
    }

}
