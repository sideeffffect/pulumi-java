// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleArgs Empty = new RegionUrlMapPathMatcherRouteRuleArgs();

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleHeaderActionArgs> headerAction;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleHeaderActionArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * The rules for determining a match.
     * Structure is documented below.
     * 
     */
    @Import(name="matchRules")
    private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs>> matchRules;

    public Optional<Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs>>> matchRules() {
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
     * In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="routeAction")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionArgs> routeAction;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionArgs>> routeAction() {
        return Optional.ofNullable(this.routeAction);
    }

    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRedirect")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs> urlRedirect;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs>> urlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    private RegionUrlMapPathMatcherRouteRuleArgs() {}

    private RegionUrlMapPathMatcherRouteRuleArgs(RegionUrlMapPathMatcherRouteRuleArgs $) {
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
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerAction(@Nullable Output<RegionUrlMapPathMatcherRouteRuleHeaderActionArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        public Builder headerAction(RegionUrlMapPathMatcherRouteRuleHeaderActionArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        public Builder matchRules(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs>> matchRules) {
            $.matchRules = matchRules;
            return this;
        }

        public Builder matchRules(List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs> matchRules) {
            return matchRules(Output.of(matchRules));
        }

        public Builder matchRules(RegionUrlMapPathMatcherRouteRuleMatchRuleArgs... matchRules) {
            return matchRules(List.of(matchRules));
        }

        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder routeAction(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionArgs> routeAction) {
            $.routeAction = routeAction;
            return this;
        }

        public Builder routeAction(RegionUrlMapPathMatcherRouteRuleRouteActionArgs routeAction) {
            return routeAction(Output.of(routeAction));
        }

        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public Builder urlRedirect(@Nullable Output<RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs> urlRedirect) {
            $.urlRedirect = urlRedirect;
            return this;
        }

        public Builder urlRedirect(RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs urlRedirect) {
            return urlRedirect(Output.of(urlRedirect));
        }

        public RegionUrlMapPathMatcherRouteRuleArgs build() {
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            return $;
        }
    }

}
