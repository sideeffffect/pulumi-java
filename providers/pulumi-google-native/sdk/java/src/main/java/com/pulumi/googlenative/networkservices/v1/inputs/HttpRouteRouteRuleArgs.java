// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices.v1.inputs.HttpRouteRouteActionArgs;
import com.pulumi.googlenative.networkservices.v1.inputs.HttpRouteRouteMatchArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies how to match traffic and how to route traffic when traffic is matched.
 * 
 */
public final class HttpRouteRouteRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteRouteRuleArgs Empty = new HttpRouteRouteRuleArgs();

    /**
     * The detailed rule defining how to route matched traffic.
     * 
     */
    @Import(name="action")
    private @Nullable Output<HttpRouteRouteActionArgs> action;

    /**
     * @return The detailed rule defining how to route matched traffic.
     * 
     */
    public Optional<Output<HttpRouteRouteActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic. If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
     * 
     */
    @Import(name="matches")
    private @Nullable Output<List<HttpRouteRouteMatchArgs>> matches;

    /**
     * @return A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic. If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
     * 
     */
    public Optional<Output<List<HttpRouteRouteMatchArgs>>> matches() {
        return Optional.ofNullable(this.matches);
    }

    private HttpRouteRouteRuleArgs() {}

    private HttpRouteRouteRuleArgs(HttpRouteRouteRuleArgs $) {
        this.action = $.action;
        this.matches = $.matches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteRouteRuleArgs $;

        public Builder() {
            $ = new HttpRouteRouteRuleArgs();
        }

        public Builder(HttpRouteRouteRuleArgs defaults) {
            $ = new HttpRouteRouteRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The detailed rule defining how to route matched traffic.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<HttpRouteRouteActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The detailed rule defining how to route matched traffic.
         * 
         * @return builder
         * 
         */
        public Builder action(HttpRouteRouteActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param matches A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic. If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
         * 
         * @return builder
         * 
         */
        public Builder matches(@Nullable Output<List<HttpRouteRouteMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic. If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
         * 
         * @return builder
         * 
         */
        public Builder matches(List<HttpRouteRouteMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic. If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
         * 
         * @return builder
         * 
         */
        public Builder matches(HttpRouteRouteMatchArgs... matches) {
            return matches(List.of(matches));
        }

        public HttpRouteRouteRuleArgs build() {
            return $;
        }
    }

}
