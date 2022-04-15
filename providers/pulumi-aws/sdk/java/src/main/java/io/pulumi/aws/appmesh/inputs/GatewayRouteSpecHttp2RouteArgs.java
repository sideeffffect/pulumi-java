// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionArgs;
import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteMatchArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteArgs Empty = new GatewayRouteSpecHttp2RouteArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
      private final Output<GatewayRouteSpecHttp2RouteActionArgs> action;

    public Output<GatewayRouteSpecHttp2RouteActionArgs> action() {
        return this.action;
    }

    /**
     * The criteria for determining a request match.
     * 
     */
    @Import(name="match", required=true)
      private final Output<GatewayRouteSpecHttp2RouteMatchArgs> match;

    public Output<GatewayRouteSpecHttp2RouteMatchArgs> match() {
        return this.match;
    }

    public GatewayRouteSpecHttp2RouteArgs(
        Output<GatewayRouteSpecHttp2RouteActionArgs> action,
        Output<GatewayRouteSpecHttp2RouteMatchArgs> match) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private GatewayRouteSpecHttp2RouteArgs() {
        this.action = Codegen.empty();
        this.match = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecHttp2RouteActionArgs> action;
        private Output<GatewayRouteSpecHttp2RouteMatchArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
        }

        public Builder action(Output<GatewayRouteSpecHttp2RouteActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(GatewayRouteSpecHttp2RouteActionArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder match(Output<GatewayRouteSpecHttp2RouteMatchArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(GatewayRouteSpecHttp2RouteMatchArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }        public GatewayRouteSpecHttp2RouteArgs build() {
            return new GatewayRouteSpecHttp2RouteArgs(action, match);
        }
    }
}
