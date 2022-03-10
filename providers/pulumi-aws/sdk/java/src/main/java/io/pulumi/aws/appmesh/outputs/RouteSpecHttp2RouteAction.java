// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttp2RouteActionWeightedTarget;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouteSpecHttp2RouteAction {
    /**
     * The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
     */
    private final List<RouteSpecHttp2RouteActionWeightedTarget> weightedTargets;

    @OutputCustomType.Constructor
    private RouteSpecHttp2RouteAction(@OutputCustomType.Parameter("weightedTargets") List<RouteSpecHttp2RouteActionWeightedTarget> weightedTargets) {
        this.weightedTargets = weightedTargets;
    }

    /**
     * The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
    */
    public List<RouteSpecHttp2RouteActionWeightedTarget> getWeightedTargets() {
        return this.weightedTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RouteSpecHttp2RouteActionWeightedTarget> weightedTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weightedTargets = defaults.weightedTargets;
        }

        public Builder weightedTargets(List<RouteSpecHttp2RouteActionWeightedTarget> weightedTargets) {
            this.weightedTargets = Objects.requireNonNull(weightedTargets);
            return this;
        }
        public RouteSpecHttp2RouteAction build() {
            return new RouteSpecHttp2RouteAction(weightedTargets);
        }
    }
}
