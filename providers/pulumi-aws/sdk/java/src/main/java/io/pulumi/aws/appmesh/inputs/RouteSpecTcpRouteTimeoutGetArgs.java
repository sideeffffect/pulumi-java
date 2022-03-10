// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutIdleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecTcpRouteTimeoutGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecTcpRouteTimeoutGetArgs Empty = new RouteSpecTcpRouteTimeoutGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @InputImport(name="idle")
      private final @Nullable Input<RouteSpecTcpRouteTimeoutIdleGetArgs> idle;

    public Input<RouteSpecTcpRouteTimeoutIdleGetArgs> getIdle() {
        return this.idle == null ? Input.empty() : this.idle;
    }

    public RouteSpecTcpRouteTimeoutGetArgs(@Nullable Input<RouteSpecTcpRouteTimeoutIdleGetArgs> idle) {
        this.idle = idle;
    }

    private RouteSpecTcpRouteTimeoutGetArgs() {
        this.idle = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RouteSpecTcpRouteTimeoutIdleGetArgs> idle;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteTimeoutGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
        }

        public Builder idle(@Nullable Input<RouteSpecTcpRouteTimeoutIdleGetArgs> idle) {
            this.idle = idle;
            return this;
        }

        public Builder idle(@Nullable RouteSpecTcpRouteTimeoutIdleGetArgs idle) {
            this.idle = Input.ofNullable(idle);
            return this;
        }
        public RouteSpecTcpRouteTimeoutGetArgs build() {
            return new RouteSpecTcpRouteTimeoutGetArgs(idle);
        }
    }
}
