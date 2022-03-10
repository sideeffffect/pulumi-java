// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.HttpRedirectActionArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpRouteActionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A path-matching rule for a URL. If matched, will use the specified BackendService to handle the traffic arriving at this URL.
 * 
 */
public final class PathRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PathRuleArgs Empty = new PathRuleArgs();

    /**
     * The list of path patterns to match. Each must start with / and the only place a * is allowed is at the end following a /. The string fed to the path matcher does not include any text after the first ? or #, and those chars are not allowed here.
     * 
     */
    @InputImport(name="paths")
      private final @Nullable Input<List<String>> paths;

    public Input<List<String>> getPaths() {
        return this.paths == null ? Input.empty() : this.paths;
    }

    /**
     * In response to a matching path, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of routeAction or urlRedirect must be set. URL maps for external HTTP(S) load balancers support only the urlRewrite action within a path rule's routeAction.
     * 
     */
    @InputImport(name="routeAction")
      private final @Nullable Input<HttpRouteActionArgs> routeAction;

    public Input<HttpRouteActionArgs> getRouteAction() {
        return this.routeAction == null ? Input.empty() : this.routeAction;
    }

    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * When a path pattern is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="urlRedirect")
      private final @Nullable Input<HttpRedirectActionArgs> urlRedirect;

    public Input<HttpRedirectActionArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Input.empty() : this.urlRedirect;
    }

    public PathRuleArgs(
        @Nullable Input<List<String>> paths,
        @Nullable Input<HttpRouteActionArgs> routeAction,
        @Nullable Input<String> service,
        @Nullable Input<HttpRedirectActionArgs> urlRedirect) {
        this.paths = paths;
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private PathRuleArgs() {
        this.paths = Input.empty();
        this.routeAction = Input.empty();
        this.service = Input.empty();
        this.urlRedirect = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> paths;
        private @Nullable Input<HttpRouteActionArgs> routeAction;
        private @Nullable Input<String> service;
        private @Nullable Input<HttpRedirectActionArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(PathRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder paths(@Nullable Input<List<String>> paths) {
            this.paths = paths;
            return this;
        }

        public Builder paths(@Nullable List<String> paths) {
            this.paths = Input.ofNullable(paths);
            return this;
        }

        public Builder routeAction(@Nullable Input<HttpRouteActionArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder routeAction(@Nullable HttpRouteActionArgs routeAction) {
            this.routeAction = Input.ofNullable(routeAction);
            return this;
        }

        public Builder service(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder urlRedirect(@Nullable Input<HttpRedirectActionArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }

        public Builder urlRedirect(@Nullable HttpRedirectActionArgs urlRedirect) {
            this.urlRedirect = Input.ofNullable(urlRedirect);
            return this;
        }
        public PathRuleArgs build() {
            return new PathRuleArgs(paths, routeAction, service, urlRedirect);
        }
    }
}
