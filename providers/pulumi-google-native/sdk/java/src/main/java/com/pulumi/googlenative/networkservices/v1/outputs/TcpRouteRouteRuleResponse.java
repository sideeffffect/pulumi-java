// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices.v1.outputs.TcpRouteRouteActionResponse;
import com.pulumi.googlenative.networkservices.v1.outputs.TcpRouteRouteMatchResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TcpRouteRouteRuleResponse {
    /**
     * @return The detailed rule defining how to route matched traffic.
     * 
     */
    private final TcpRouteRouteActionResponse action;
    /**
     * @return Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are &#34;OR&#34;ed for evaluation. If no routeMatch field is specified, this rule will unconditionally match traffic.
     * 
     */
    private final List<TcpRouteRouteMatchResponse> matches;

    @CustomType.Constructor
    private TcpRouteRouteRuleResponse(
        @CustomType.Parameter("action") TcpRouteRouteActionResponse action,
        @CustomType.Parameter("matches") List<TcpRouteRouteMatchResponse> matches) {
        this.action = action;
        this.matches = matches;
    }

    /**
     * @return The detailed rule defining how to route matched traffic.
     * 
     */
    public TcpRouteRouteActionResponse action() {
        return this.action;
    }
    /**
     * @return Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are &#34;OR&#34;ed for evaluation. If no routeMatch field is specified, this rule will unconditionally match traffic.
     * 
     */
    public List<TcpRouteRouteMatchResponse> matches() {
        return this.matches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TcpRouteRouteRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TcpRouteRouteActionResponse action;
        private List<TcpRouteRouteMatchResponse> matches;

        public Builder() {
    	      // Empty
        }

        public Builder(TcpRouteRouteRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.matches = defaults.matches;
        }

        public Builder action(TcpRouteRouteActionResponse action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder matches(List<TcpRouteRouteMatchResponse> matches) {
            this.matches = Objects.requireNonNull(matches);
            return this;
        }
        public Builder matches(TcpRouteRouteMatchResponse... matches) {
            return matches(List.of(matches));
        }        public TcpRouteRouteRuleResponse build() {
            return new TcpRouteRouteRuleResponse(action, matches);
        }
    }
}
