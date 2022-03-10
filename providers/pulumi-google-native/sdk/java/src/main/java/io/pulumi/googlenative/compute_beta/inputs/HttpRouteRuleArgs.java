// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.HttpFilterConfigArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpHeaderActionArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpRedirectActionArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpRouteActionArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpRouteRuleMatchArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The HttpRouteRule setting specifies how to match an HTTP request and the corresponding routing action that load balancing proxies perform.
 * 
 */
public final class HttpRouteRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRouteRuleArgs Empty = new HttpRouteRuleArgs();

    /**
     * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="headerAction")
      private final @Nullable Input<HttpHeaderActionArgs> headerAction;

    public Input<HttpHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    /**
     * Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="httpFilterConfigs")
      private final @Nullable Input<List<HttpFilterConfigArgs>> httpFilterConfigs;

    public Input<List<HttpFilterConfigArgs>> getHttpFilterConfigs() {
        return this.httpFilterConfigs == null ? Input.empty() : this.httpFilterConfigs;
    }

    /**
     * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="httpFilterMetadata")
      private final @Nullable Input<List<HttpFilterConfigArgs>> httpFilterMetadata;

    public Input<List<HttpFilterConfigArgs>> getHttpFilterMetadata() {
        return this.httpFilterMetadata == null ? Input.empty() : this.httpFilterMetadata;
    }

    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * 
     */
    @InputImport(name="matchRules")
      private final @Nullable Input<List<HttpRouteRuleMatchArgs>> matchRules;

    public Input<List<HttpRouteRuleMatchArgs>> getMatchRules() {
        return this.matchRules == null ? Input.empty() : this.matchRules;
    }

    /**
     * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
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
     * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="urlRedirect")
      private final @Nullable Input<HttpRedirectActionArgs> urlRedirect;

    public Input<HttpRedirectActionArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Input.empty() : this.urlRedirect;
    }

    public HttpRouteRuleArgs(
        @Nullable Input<String> description,
        @Nullable Input<HttpHeaderActionArgs> headerAction,
        @Nullable Input<List<HttpFilterConfigArgs>> httpFilterConfigs,
        @Nullable Input<List<HttpFilterConfigArgs>> httpFilterMetadata,
        @Nullable Input<List<HttpRouteRuleMatchArgs>> matchRules,
        @Nullable Input<Integer> priority,
        @Nullable Input<HttpRouteActionArgs> routeAction,
        @Nullable Input<String> service,
        @Nullable Input<HttpRedirectActionArgs> urlRedirect) {
        this.description = description;
        this.headerAction = headerAction;
        this.httpFilterConfigs = httpFilterConfigs;
        this.httpFilterMetadata = httpFilterMetadata;
        this.matchRules = matchRules;
        this.priority = priority;
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private HttpRouteRuleArgs() {
        this.description = Input.empty();
        this.headerAction = Input.empty();
        this.httpFilterConfigs = Input.empty();
        this.httpFilterMetadata = Input.empty();
        this.matchRules = Input.empty();
        this.priority = Input.empty();
        this.routeAction = Input.empty();
        this.service = Input.empty();
        this.urlRedirect = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<HttpHeaderActionArgs> headerAction;
        private @Nullable Input<List<HttpFilterConfigArgs>> httpFilterConfigs;
        private @Nullable Input<List<HttpFilterConfigArgs>> httpFilterMetadata;
        private @Nullable Input<List<HttpRouteRuleMatchArgs>> matchRules;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<HttpRouteActionArgs> routeAction;
        private @Nullable Input<String> service;
        private @Nullable Input<HttpRedirectActionArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.httpFilterConfigs = defaults.httpFilterConfigs;
    	      this.httpFilterMetadata = defaults.httpFilterMetadata;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder headerAction(@Nullable Input<HttpHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder headerAction(@Nullable HttpHeaderActionArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder httpFilterConfigs(@Nullable Input<List<HttpFilterConfigArgs>> httpFilterConfigs) {
            this.httpFilterConfigs = httpFilterConfigs;
            return this;
        }

        public Builder httpFilterConfigs(@Nullable List<HttpFilterConfigArgs> httpFilterConfigs) {
            this.httpFilterConfigs = Input.ofNullable(httpFilterConfigs);
            return this;
        }

        public Builder httpFilterMetadata(@Nullable Input<List<HttpFilterConfigArgs>> httpFilterMetadata) {
            this.httpFilterMetadata = httpFilterMetadata;
            return this;
        }

        public Builder httpFilterMetadata(@Nullable List<HttpFilterConfigArgs> httpFilterMetadata) {
            this.httpFilterMetadata = Input.ofNullable(httpFilterMetadata);
            return this;
        }

        public Builder matchRules(@Nullable Input<List<HttpRouteRuleMatchArgs>> matchRules) {
            this.matchRules = matchRules;
            return this;
        }

        public Builder matchRules(@Nullable List<HttpRouteRuleMatchArgs> matchRules) {
            this.matchRules = Input.ofNullable(matchRules);
            return this;
        }

        public Builder priority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
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
        public HttpRouteRuleArgs build() {
            return new HttpRouteRuleArgs(description, headerAction, httpFilterConfigs, httpFilterMetadata, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}
