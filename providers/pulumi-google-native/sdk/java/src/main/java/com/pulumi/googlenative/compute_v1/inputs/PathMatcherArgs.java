// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.inputs.HttpHeaderActionArgs;
import com.pulumi.googlenative.compute_v1.inputs.HttpRedirectActionArgs;
import com.pulumi.googlenative.compute_v1.inputs.HttpRouteActionArgs;
import com.pulumi.googlenative.compute_v1.inputs.HttpRouteRuleArgs;
import com.pulumi.googlenative.compute_v1.inputs.PathRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A matcher for the path portion of the URL. The BackendService from the longest-matched rule will serve the URL. If no rule was matched, the default service is used.
 * 
 */
public final class PathMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final PathMatcherArgs Empty = new PathMatcherArgs();

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher's defaultRouteAction.
     * 
     */
    @Import(name="defaultRouteAction")
      private final @Nullable Output<HttpRouteActionArgs> defaultRouteAction;

    public Output<HttpRouteActionArgs> defaultRouteAction() {
        return this.defaultRouteAction == null ? Codegen.empty() : this.defaultRouteAction;
    }

    /**
     * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
     */
    @Import(name="defaultService")
      private final @Nullable Output<String> defaultService;

    public Output<String> defaultService() {
        return this.defaultService == null ? Codegen.empty() : this.defaultService;
    }

    /**
     * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="defaultUrlRedirect")
      private final @Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect;

    public Output<HttpRedirectActionArgs> defaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Codegen.empty() : this.defaultUrlRedirect;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction")
      private final @Nullable Output<HttpHeaderActionArgs> headerAction;

    public Output<HttpHeaderActionArgs> headerAction() {
        return this.headerAction == null ? Codegen.empty() : this.headerAction;
    }

    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
     */
    @Import(name="pathRules")
      private final @Nullable Output<List<PathRuleArgs>> pathRules;

    public Output<List<PathRuleArgs>> pathRules() {
        return this.pathRules == null ? Codegen.empty() : this.pathRules;
    }

    /**
     * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
     */
    @Import(name="routeRules")
      private final @Nullable Output<List<HttpRouteRuleArgs>> routeRules;

    public Output<List<HttpRouteRuleArgs>> routeRules() {
        return this.routeRules == null ? Codegen.empty() : this.routeRules;
    }

    public PathMatcherArgs(
        @Nullable Output<HttpRouteActionArgs> defaultRouteAction,
        @Nullable Output<String> defaultService,
        @Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect,
        @Nullable Output<String> description,
        @Nullable Output<HttpHeaderActionArgs> headerAction,
        @Nullable Output<String> name,
        @Nullable Output<List<PathRuleArgs>> pathRules,
        @Nullable Output<List<HttpRouteRuleArgs>> routeRules) {
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.headerAction = headerAction;
        this.name = name;
        this.pathRules = pathRules;
        this.routeRules = routeRules;
    }

    private PathMatcherArgs() {
        this.defaultRouteAction = Codegen.empty();
        this.defaultService = Codegen.empty();
        this.defaultUrlRedirect = Codegen.empty();
        this.description = Codegen.empty();
        this.headerAction = Codegen.empty();
        this.name = Codegen.empty();
        this.pathRules = Codegen.empty();
        this.routeRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HttpRouteActionArgs> defaultRouteAction;
        private @Nullable Output<String> defaultService;
        private @Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect;
        private @Nullable Output<String> description;
        private @Nullable Output<HttpHeaderActionArgs> headerAction;
        private @Nullable Output<String> name;
        private @Nullable Output<List<PathRuleArgs>> pathRules;
        private @Nullable Output<List<HttpRouteRuleArgs>> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(PathMatcherArgs defaults) {
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

        public Builder defaultRouteAction(@Nullable Output<HttpRouteActionArgs> defaultRouteAction) {
            this.defaultRouteAction = defaultRouteAction;
            return this;
        }
        public Builder defaultRouteAction(@Nullable HttpRouteActionArgs defaultRouteAction) {
            this.defaultRouteAction = Codegen.ofNullable(defaultRouteAction);
            return this;
        }
        public Builder defaultService(@Nullable Output<String> defaultService) {
            this.defaultService = defaultService;
            return this;
        }
        public Builder defaultService(@Nullable String defaultService) {
            this.defaultService = Codegen.ofNullable(defaultService);
            return this;
        }
        public Builder defaultUrlRedirect(@Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }
        public Builder defaultUrlRedirect(@Nullable HttpRedirectActionArgs defaultUrlRedirect) {
            this.defaultUrlRedirect = Codegen.ofNullable(defaultUrlRedirect);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder headerAction(@Nullable Output<HttpHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder headerAction(@Nullable HttpHeaderActionArgs headerAction) {
            this.headerAction = Codegen.ofNullable(headerAction);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder pathRules(@Nullable Output<List<PathRuleArgs>> pathRules) {
            this.pathRules = pathRules;
            return this;
        }
        public Builder pathRules(@Nullable List<PathRuleArgs> pathRules) {
            this.pathRules = Codegen.ofNullable(pathRules);
            return this;
        }
        public Builder pathRules(PathRuleArgs... pathRules) {
            return pathRules(List.of(pathRules));
        }
        public Builder routeRules(@Nullable Output<List<HttpRouteRuleArgs>> routeRules) {
            this.routeRules = routeRules;
            return this;
        }
        public Builder routeRules(@Nullable List<HttpRouteRuleArgs> routeRules) {
            this.routeRules = Codegen.ofNullable(routeRules);
            return this;
        }
        public Builder routeRules(HttpRouteRuleArgs... routeRules) {
            return routeRules(List.of(routeRules));
        }        public PathMatcherArgs build() {
            return new PathMatcherArgs(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, name, pathRules, routeRules);
        }
    }
}
