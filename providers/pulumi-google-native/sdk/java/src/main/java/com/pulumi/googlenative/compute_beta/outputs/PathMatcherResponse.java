// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.HttpHeaderActionResponse;
import com.pulumi.googlenative.compute_beta.outputs.HttpRedirectActionResponse;
import com.pulumi.googlenative.compute_beta.outputs.HttpRouteActionResponse;
import com.pulumi.googlenative.compute_beta.outputs.HttpRouteRuleResponse;
import com.pulumi.googlenative.compute_beta.outputs.PathRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PathMatcherResponse {
    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher's defaultRouteAction.
     * 
     */
    private final HttpRouteActionResponse defaultRouteAction;
    /**
     * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
     */
    private final String defaultService;
    /**
     * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    private final HttpRedirectActionResponse defaultUrlRedirect;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final HttpHeaderActionResponse headerAction;
    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    private final String name;
    /**
     * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
     */
    private final List<PathRuleResponse> pathRules;
    /**
     * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
     */
    private final List<HttpRouteRuleResponse> routeRules;

    @CustomType.Constructor
    private PathMatcherResponse(
        @CustomType.Parameter("defaultRouteAction") HttpRouteActionResponse defaultRouteAction,
        @CustomType.Parameter("defaultService") String defaultService,
        @CustomType.Parameter("defaultUrlRedirect") HttpRedirectActionResponse defaultUrlRedirect,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("headerAction") HttpHeaderActionResponse headerAction,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pathRules") List<PathRuleResponse> pathRules,
        @CustomType.Parameter("routeRules") List<HttpRouteRuleResponse> routeRules) {
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.headerAction = headerAction;
        this.name = name;
        this.pathRules = pathRules;
        this.routeRules = routeRules;
    }

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher's defaultRouteAction.
     * 
    */
    public HttpRouteActionResponse defaultRouteAction() {
        return this.defaultRouteAction;
    }
    /**
     * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
    */
    public String defaultService() {
        return this.defaultService;
    }
    /**
     * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
    */
    public HttpRedirectActionResponse defaultUrlRedirect() {
        return this.defaultUrlRedirect;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
    */
    public HttpHeaderActionResponse headerAction() {
        return this.headerAction;
    }
    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
    */
    public List<PathRuleResponse> pathRules() {
        return this.pathRules;
    }
    /**
     * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
    */
    public List<HttpRouteRuleResponse> routeRules() {
        return this.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteActionResponse defaultRouteAction;
        private String defaultService;
        private HttpRedirectActionResponse defaultUrlRedirect;
        private String description;
        private HttpHeaderActionResponse headerAction;
        private String name;
        private List<PathRuleResponse> pathRules;
        private List<HttpRouteRuleResponse> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(PathMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.routeRules = defaults.routeRules;
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
        public Builder headerAction(HttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pathRules(List<PathRuleResponse> pathRules) {
            this.pathRules = Objects.requireNonNull(pathRules);
            return this;
        }
        public Builder pathRules(PathRuleResponse... pathRules) {
            return pathRules(List.of(pathRules));
        }
        public Builder routeRules(List<HttpRouteRuleResponse> routeRules) {
            this.routeRules = Objects.requireNonNull(routeRules);
            return this;
        }
        public Builder routeRules(HttpRouteRuleResponse... routeRules) {
            return routeRules(List.of(routeRules));
        }        public PathMatcherResponse build() {
            return new PathMatcherResponse(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, name, pathRules, routeRules);
        }
    }
}
