// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.HostRuleResponse;
import com.pulumi.googlenative.compute.beta.outputs.HttpHeaderActionResponse;
import com.pulumi.googlenative.compute.beta.outputs.HttpRedirectActionResponse;
import com.pulumi.googlenative.compute.beta.outputs.HttpRouteActionResponse;
import com.pulumi.googlenative.compute.beta.outputs.PathMatcherResponse;
import com.pulumi.googlenative.compute.beta.outputs.UrlMapTestResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUrlMapResult {
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within defaultRouteAction. defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    private final HttpRouteActionResponse defaultRouteAction;
    /**
     * @return The full or partial URL of the defaultService resource to which traffic is directed if none of the hostRules match. If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. defaultService has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    private final String defaultService;
    /**
     * @return When none of the specified hostRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    private final HttpRedirectActionResponse defaultUrlRedirect;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field is ignored when inserting a UrlMap. An up-to-date fingerprint must be provided in order to update the UrlMap, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a UrlMap.
     * 
     */
    private final String fingerprint;
    /**
     * @return Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction specified here take effect after headerAction specified under pathMatcher. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final HttpHeaderActionResponse headerAction;
    /**
     * @return The list of host rules to use against the URL.
     * 
     */
    private final List<HostRuleResponse> hostRules;
    /**
     * @return Type of the resource. Always compute#urlMaps for url maps.
     * 
     */
    private final String kind;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return The list of named PathMatchers to use against the URL.
     * 
     */
    private final List<PathMatcherResponse> pathMatchers;
    /**
     * @return URL of the region where the regional URL map resides. This field is not applicable to global URL maps. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final List<UrlMapTestResponse> tests;

    @CustomType.Constructor
    private GetUrlMapResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("defaultRouteAction") HttpRouteActionResponse defaultRouteAction,
        @CustomType.Parameter("defaultService") String defaultService,
        @CustomType.Parameter("defaultUrlRedirect") HttpRedirectActionResponse defaultUrlRedirect,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("headerAction") HttpHeaderActionResponse headerAction,
        @CustomType.Parameter("hostRules") List<HostRuleResponse> hostRules,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pathMatchers") List<PathMatcherResponse> pathMatchers,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("tests") List<UrlMapTestResponse> tests) {
        this.creationTimestamp = creationTimestamp;
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.fingerprint = fingerprint;
        this.headerAction = headerAction;
        this.hostRules = hostRules;
        this.kind = kind;
        this.name = name;
        this.pathMatchers = pathMatchers;
        this.region = region;
        this.selfLink = selfLink;
        this.tests = tests;
    }

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within defaultRouteAction. defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    public HttpRouteActionResponse defaultRouteAction() {
        return this.defaultRouteAction;
    }
    /**
     * @return The full or partial URL of the defaultService resource to which traffic is directed if none of the hostRules match. If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. defaultService has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    public String defaultService() {
        return this.defaultService;
    }
    /**
     * @return When none of the specified hostRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    public HttpRedirectActionResponse defaultUrlRedirect() {
        return this.defaultUrlRedirect;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field is ignored when inserting a UrlMap. An up-to-date fingerprint must be provided in order to update the UrlMap, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a UrlMap.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction specified here take effect after headerAction specified under pathMatcher. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public HttpHeaderActionResponse headerAction() {
        return this.headerAction;
    }
    /**
     * @return The list of host rules to use against the URL.
     * 
     */
    public List<HostRuleResponse> hostRules() {
        return this.hostRules;
    }
    /**
     * @return Type of the resource. Always compute#urlMaps for url maps.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The list of named PathMatchers to use against the URL.
     * 
     */
    public List<PathMatcherResponse> pathMatchers() {
        return this.pathMatchers;
    }
    /**
     * @return URL of the region where the regional URL map resides. This field is not applicable to global URL maps. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public List<UrlMapTestResponse> tests() {
        return this.tests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUrlMapResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private HttpRouteActionResponse defaultRouteAction;
        private String defaultService;
        private HttpRedirectActionResponse defaultUrlRedirect;
        private String description;
        private String fingerprint;
        private HttpHeaderActionResponse headerAction;
        private List<HostRuleResponse> hostRules;
        private String kind;
        private String name;
        private List<PathMatcherResponse> pathMatchers;
        private String region;
        private String selfLink;
        private List<UrlMapTestResponse> tests;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUrlMapResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.headerAction = defaults.headerAction;
    	      this.hostRules = defaults.hostRules;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.pathMatchers = defaults.pathMatchers;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.tests = defaults.tests;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder defaultRouteAction(HttpRouteActionResponse defaultRouteAction) {
            this.defaultRouteAction = Objects.requireNonNull(defaultRouteAction);
            return this;
        }
        public Builder defaultService(String defaultService) {
            this.defaultService = Objects.requireNonNull(defaultService);
            return this;
        }
        public Builder defaultUrlRedirect(HttpRedirectActionResponse defaultUrlRedirect) {
            this.defaultUrlRedirect = Objects.requireNonNull(defaultUrlRedirect);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder headerAction(HttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }
        public Builder hostRules(List<HostRuleResponse> hostRules) {
            this.hostRules = Objects.requireNonNull(hostRules);
            return this;
        }
        public Builder hostRules(HostRuleResponse... hostRules) {
            return hostRules(List.of(hostRules));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pathMatchers(List<PathMatcherResponse> pathMatchers) {
            this.pathMatchers = Objects.requireNonNull(pathMatchers);
            return this;
        }
        public Builder pathMatchers(PathMatcherResponse... pathMatchers) {
            return pathMatchers(List.of(pathMatchers));
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder tests(List<UrlMapTestResponse> tests) {
            this.tests = Objects.requireNonNull(tests);
            return this;
        }
        public Builder tests(UrlMapTestResponse... tests) {
            return tests(List.of(tests));
        }        public GetUrlMapResult build() {
            return new GetUrlMapResult(creationTimestamp, defaultRouteAction, defaultService, defaultUrlRedirect, description, fingerprint, headerAction, hostRules, kind, name, pathMatchers, region, selfLink, tests);
        }
    }
}
