// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutIdleArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutPerRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteTimeoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteTimeoutArgs Empty = new RouteSpecHttpRouteTimeoutArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @InputImport(name="idle")
      private final @Nullable Input<RouteSpecHttpRouteTimeoutIdleArgs> idle;

    public Input<RouteSpecHttpRouteTimeoutIdleArgs> getIdle() {
        return this.idle == null ? Input.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @InputImport(name="perRequest")
      private final @Nullable Input<RouteSpecHttpRouteTimeoutPerRequestArgs> perRequest;

    public Input<RouteSpecHttpRouteTimeoutPerRequestArgs> getPerRequest() {
        return this.perRequest == null ? Input.empty() : this.perRequest;
    }

    public RouteSpecHttpRouteTimeoutArgs(
        @Nullable Input<RouteSpecHttpRouteTimeoutIdleArgs> idle,
        @Nullable Input<RouteSpecHttpRouteTimeoutPerRequestArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private RouteSpecHttpRouteTimeoutArgs() {
        this.idle = Input.empty();
        this.perRequest = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteTimeoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RouteSpecHttpRouteTimeoutIdleArgs> idle;
        private @Nullable Input<RouteSpecHttpRouteTimeoutPerRequestArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteTimeoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable Input<RouteSpecHttpRouteTimeoutIdleArgs> idle) {
            this.idle = idle;
            return this;
        }

        public Builder idle(@Nullable RouteSpecHttpRouteTimeoutIdleArgs idle) {
            this.idle = Input.ofNullable(idle);
            return this;
        }

        public Builder perRequest(@Nullable Input<RouteSpecHttpRouteTimeoutPerRequestArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }

        public Builder perRequest(@Nullable RouteSpecHttpRouteTimeoutPerRequestArgs perRequest) {
            this.perRequest = Input.ofNullable(perRequest);
            return this;
        }
        public RouteSpecHttpRouteTimeoutArgs build() {
            return new RouteSpecHttpRouteTimeoutArgs(idle, perRequest);
        }
    }
}
