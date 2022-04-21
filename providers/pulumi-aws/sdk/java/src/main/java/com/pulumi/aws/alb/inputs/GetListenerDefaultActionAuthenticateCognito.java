// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetListenerDefaultActionAuthenticateCognito extends com.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionAuthenticateCognito Empty = new GetListenerDefaultActionAuthenticateCognito();

    @Import(name="authenticationRequestExtraParams", required=true)
    private Map<String,String> authenticationRequestExtraParams;

    public Map<String,String> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams;
    }

    @Import(name="onUnauthenticatedRequest", required=true)
    private String onUnauthenticatedRequest;

    public String onUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest;
    }

    @Import(name="scope", required=true)
    private String scope;

    public String scope() {
        return this.scope;
    }

    @Import(name="sessionCookieName", required=true)
    private String sessionCookieName;

    public String sessionCookieName() {
        return this.sessionCookieName;
    }

    @Import(name="sessionTimeout", required=true)
    private Integer sessionTimeout;

    public Integer sessionTimeout() {
        return this.sessionTimeout;
    }

    @Import(name="userPoolArn", required=true)
    private String userPoolArn;

    public String userPoolArn() {
        return this.userPoolArn;
    }

    @Import(name="userPoolClientId", required=true)
    private String userPoolClientId;

    public String userPoolClientId() {
        return this.userPoolClientId;
    }

    @Import(name="userPoolDomain", required=true)
    private String userPoolDomain;

    public String userPoolDomain() {
        return this.userPoolDomain;
    }

    private GetListenerDefaultActionAuthenticateCognito() {}

    private GetListenerDefaultActionAuthenticateCognito(GetListenerDefaultActionAuthenticateCognito $) {
        this.authenticationRequestExtraParams = $.authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = $.onUnauthenticatedRequest;
        this.scope = $.scope;
        this.sessionCookieName = $.sessionCookieName;
        this.sessionTimeout = $.sessionTimeout;
        this.userPoolArn = $.userPoolArn;
        this.userPoolClientId = $.userPoolClientId;
        this.userPoolDomain = $.userPoolDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListenerDefaultActionAuthenticateCognito defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListenerDefaultActionAuthenticateCognito $;

        public Builder() {
            $ = new GetListenerDefaultActionAuthenticateCognito();
        }

        public Builder(GetListenerDefaultActionAuthenticateCognito defaults) {
            $ = new GetListenerDefaultActionAuthenticateCognito(Objects.requireNonNull(defaults));
        }

        public Builder authenticationRequestExtraParams(Map<String,String> authenticationRequestExtraParams) {
            $.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder onUnauthenticatedRequest(String onUnauthenticatedRequest) {
            $.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public Builder sessionCookieName(String sessionCookieName) {
            $.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder sessionTimeout(Integer sessionTimeout) {
            $.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder userPoolArn(String userPoolArn) {
            $.userPoolArn = userPoolArn;
            return this;
        }

        public Builder userPoolClientId(String userPoolClientId) {
            $.userPoolClientId = userPoolClientId;
            return this;
        }

        public Builder userPoolDomain(String userPoolDomain) {
            $.userPoolDomain = userPoolDomain;
            return this;
        }

        public GetListenerDefaultActionAuthenticateCognito build() {
            $.authenticationRequestExtraParams = Objects.requireNonNull($.authenticationRequestExtraParams, "expected parameter 'authenticationRequestExtraParams' to be non-null");
            $.onUnauthenticatedRequest = Objects.requireNonNull($.onUnauthenticatedRequest, "expected parameter 'onUnauthenticatedRequest' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.sessionCookieName = Objects.requireNonNull($.sessionCookieName, "expected parameter 'sessionCookieName' to be non-null");
            $.sessionTimeout = Objects.requireNonNull($.sessionTimeout, "expected parameter 'sessionTimeout' to be non-null");
            $.userPoolArn = Objects.requireNonNull($.userPoolArn, "expected parameter 'userPoolArn' to be non-null");
            $.userPoolClientId = Objects.requireNonNull($.userPoolClientId, "expected parameter 'userPoolClientId' to be non-null");
            $.userPoolDomain = Objects.requireNonNull($.userPoolDomain, "expected parameter 'userPoolDomain' to be non-null");
            return $;
        }
    }

}
