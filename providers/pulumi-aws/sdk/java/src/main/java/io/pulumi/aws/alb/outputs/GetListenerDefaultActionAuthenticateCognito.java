// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionAuthenticateCognito {
    private final Map<String,String> authenticationRequestExtraParams;
    private final String onUnauthenticatedRequest;
    private final String scope;
    private final String sessionCookieName;
    private final Integer sessionTimeout;
    private final String userPoolArn;
    private final String userPoolClientId;
    private final String userPoolDomain;

    @CustomType.Constructor
    private GetListenerDefaultActionAuthenticateCognito(
        @CustomType.Parameter("authenticationRequestExtraParams") Map<String,String> authenticationRequestExtraParams,
        @CustomType.Parameter("onUnauthenticatedRequest") String onUnauthenticatedRequest,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("sessionCookieName") String sessionCookieName,
        @CustomType.Parameter("sessionTimeout") Integer sessionTimeout,
        @CustomType.Parameter("userPoolArn") String userPoolArn,
        @CustomType.Parameter("userPoolClientId") String userPoolClientId,
        @CustomType.Parameter("userPoolDomain") String userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = userPoolArn;
        this.userPoolClientId = userPoolClientId;
        this.userPoolDomain = userPoolDomain;
    }

    public Map<String,String> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams;
    }
    public String onUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest;
    }
    public String scope() {
        return this.scope;
    }
    public String sessionCookieName() {
        return this.sessionCookieName;
    }
    public Integer sessionTimeout() {
        return this.sessionTimeout;
    }
    public String userPoolArn() {
        return this.userPoolArn;
    }
    public String userPoolClientId() {
        return this.userPoolClientId;
    }
    public String userPoolDomain() {
        return this.userPoolDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionAuthenticateCognito defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> authenticationRequestExtraParams;
        private String onUnauthenticatedRequest;
        private String scope;
        private String sessionCookieName;
        private Integer sessionTimeout;
        private String userPoolArn;
        private String userPoolClientId;
        private String userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionAuthenticateCognito defaults) {
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

        public Builder authenticationRequestExtraParams(Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Objects.requireNonNull(authenticationRequestExtraParams);
            return this;
        }
        public Builder onUnauthenticatedRequest(String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Objects.requireNonNull(onUnauthenticatedRequest);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder sessionCookieName(String sessionCookieName) {
            this.sessionCookieName = Objects.requireNonNull(sessionCookieName);
            return this;
        }
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.sessionTimeout = Objects.requireNonNull(sessionTimeout);
            return this;
        }
        public Builder userPoolArn(String userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }
        public Builder userPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }
        public Builder userPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }        public GetListenerDefaultActionAuthenticateCognito build() {
            return new GetListenerDefaultActionAuthenticateCognito(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
