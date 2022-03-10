// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
     * 
     */
    @InputImport(name="exactMatch")
      private final @Nullable Input<String> exactMatch;

    public Input<String> getExactMatch() {
        return this.exactMatch == null ? Input.empty() : this.exactMatch;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
     * 
     */
    @InputImport(name="presentMatch")
      private final @Nullable Input<Boolean> presentMatch;

    public Input<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Input.empty() : this.presentMatch;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs(
        @Nullable Input<String> exactMatch,
        Input<String> name,
        @Nullable Input<Boolean> presentMatch) {
        this.exactMatch = exactMatch;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.presentMatch = presentMatch;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs() {
        this.exactMatch = Input.empty();
        this.name = Input.empty();
        this.presentMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> exactMatch;
        private Input<String> name;
        private @Nullable Input<Boolean> presentMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.name = defaults.name;
    	      this.presentMatch = defaults.presentMatch;
        }

        public Builder exactMatch(@Nullable Input<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder exactMatch(@Nullable String exactMatch) {
            this.exactMatch = Input.ofNullable(exactMatch);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder presentMatch(@Nullable Input<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder presentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Input.ofNullable(presentMatch);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs(exactMatch, name, presentMatch);
        }
    }
}
