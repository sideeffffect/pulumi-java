// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleUrlRedirectGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleGetArgs Empty = new URLMapPathMatcherRouteRuleGetArgs();

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<URLMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction;

    public Optional<Output<URLMapPathMatcherRouteRuleHeaderActionGetArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * The rules for determining a match.
     * Structure is documented below.
     * 
     */
    @Import(name="matchRules")
    private @Nullable Output<List<URLMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;

    public Optional<Output<List<URLMapPathMatcherRouteRuleMatchRuleGetArgs>>> matchRules() {
        return Optional.ofNullable(this.matchRules);
    }

    /**
     * For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="routeAction")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionGetArgs> routeAction;

    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionGetArgs>> routeAction() {
        return Optional.ofNullable(this.routeAction);
    }

    /**
     * The backend service or backend bucket link that should be matched by this test.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRedirect")
    private @Nullable Output<URLMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

    public Optional<Output<URLMapPathMatcherRouteRuleUrlRedirectGetArgs>> urlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    private URLMapPathMatcherRouteRuleGetArgs() {}

    private URLMapPathMatcherRouteRuleGetArgs(URLMapPathMatcherRouteRuleGetArgs $) {
        this.headerAction = $.headerAction;
        this.matchRules = $.matchRules;
        this.priority = $.priority;
        this.routeAction = $.routeAction;
        this.service = $.service;
        this.urlRedirect = $.urlRedirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherRouteRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherRouteRuleGetArgs $;

        public Builder() {
            $ = new URLMapPathMatcherRouteRuleGetArgs();
        }

        public Builder(URLMapPathMatcherRouteRuleGetArgs defaults) {
            $ = new URLMapPathMatcherRouteRuleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerAction(@Nullable Output<URLMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        public Builder headerAction(URLMapPathMatcherRouteRuleHeaderActionGetArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        public Builder matchRules(@Nullable Output<List<URLMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules) {
            $.matchRules = matchRules;
            return this;
        }

        public Builder matchRules(List<URLMapPathMatcherRouteRuleMatchRuleGetArgs> matchRules) {
            return matchRules(Output.of(matchRules));
        }

        public Builder matchRules(URLMapPathMatcherRouteRuleMatchRuleGetArgs... matchRules) {
            return matchRules(List.of(matchRules));
        }

        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder routeAction(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionGetArgs> routeAction) {
            $.routeAction = routeAction;
            return this;
        }

        public Builder routeAction(URLMapPathMatcherRouteRuleRouteActionGetArgs routeAction) {
            return routeAction(Output.of(routeAction));
        }

        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public Builder urlRedirect(@Nullable Output<URLMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
            $.urlRedirect = urlRedirect;
            return this;
        }

        public Builder urlRedirect(URLMapPathMatcherRouteRuleUrlRedirectGetArgs urlRedirect) {
            return urlRedirect(Output.of(urlRedirect));
        }

        public URLMapPathMatcherRouteRuleGetArgs build() {
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            return $;
        }
    }

}
