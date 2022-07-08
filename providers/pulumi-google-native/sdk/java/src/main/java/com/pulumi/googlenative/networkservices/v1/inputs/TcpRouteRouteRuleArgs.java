// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices.v1.inputs.TcpRouteRouteActionArgs;
import com.pulumi.googlenative.networkservices.v1.inputs.TcpRouteRouteMatchArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies how to match traffic and how to route traffic when traffic is matched.
 * 
 */
public final class TcpRouteRouteRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TcpRouteRouteRuleArgs Empty = new TcpRouteRouteRuleArgs();

    /**
     * The detailed rule defining how to route matched traffic.
     * 
     */
    @Import(name="action", required=true)
    private Output<TcpRouteRouteActionArgs> action;

    /**
     * @return The detailed rule defining how to route matched traffic.
     * 
     */
    public Output<TcpRouteRouteActionArgs> action() {
        return this.action;
    }

    /**
     * Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are &#34;OR&#34;ed for evaluation. If no routeMatch field is specified, this rule will unconditionally match traffic.
     * 
     */
    @Import(name="matches")
    private @Nullable Output<List<TcpRouteRouteMatchArgs>> matches;

    /**
     * @return Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are &#34;OR&#34;ed for evaluation. If no routeMatch field is specified, this rule will unconditionally match traffic.
     * 
     */
    public Optional<Output<List<TcpRouteRouteMatchArgs>>> matches() {
        return Optional.ofNullable(this.matches);
    }

    private TcpRouteRouteRuleArgs() {}

    private TcpRouteRouteRuleArgs(TcpRouteRouteRuleArgs $) {
        this.action = $.action;
        this.matches = $.matches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TcpRouteRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TcpRouteRouteRuleArgs $;

        public Builder() {
            $ = new TcpRouteRouteRuleArgs();
        }

        public Builder(TcpRouteRouteRuleArgs defaults) {
            $ = new TcpRouteRouteRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The detailed rule defining how to route matched traffic.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<TcpRouteRouteActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The detailed rule defining how to route matched traffic.
         * 
         * @return builder
         * 
         */
        public Builder action(TcpRouteRouteActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param matches Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are &#34;OR&#34;ed for evaluation. If no routeMatch field is specified, this rule will unconditionally match traffic.
         * 
         * @return builder
         * 
         */
        public Builder matches(@Nullable Output<List<TcpRouteRouteMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are &#34;OR&#34;ed for evaluation. If no routeMatch field is specified, this rule will unconditionally match traffic.
         * 
         * @return builder
         * 
         */
        public Builder matches(List<TcpRouteRouteMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are &#34;OR&#34;ed for evaluation. If no routeMatch field is specified, this rule will unconditionally match traffic.
         * 
         * @return builder
         * 
         */
        public Builder matches(TcpRouteRouteMatchArgs... matches) {
            return matches(List.of(matches));
        }

        public TcpRouteRouteRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            return $;
        }
    }

}
