// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutIdleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecTcpRouteTimeoutGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecTcpRouteTimeoutGetArgs Empty = new RouteSpecTcpRouteTimeoutGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
    private @Nullable Output<RouteSpecTcpRouteTimeoutIdleGetArgs> idle;

    public Optional<Output<RouteSpecTcpRouteTimeoutIdleGetArgs>> idle() {
        return Optional.ofNullable(this.idle);
    }

    private RouteSpecTcpRouteTimeoutGetArgs() {}

    private RouteSpecTcpRouteTimeoutGetArgs(RouteSpecTcpRouteTimeoutGetArgs $) {
        this.idle = $.idle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecTcpRouteTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecTcpRouteTimeoutGetArgs $;

        public Builder() {
            $ = new RouteSpecTcpRouteTimeoutGetArgs();
        }

        public Builder(RouteSpecTcpRouteTimeoutGetArgs defaults) {
            $ = new RouteSpecTcpRouteTimeoutGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder idle(@Nullable Output<RouteSpecTcpRouteTimeoutIdleGetArgs> idle) {
            $.idle = idle;
            return this;
        }

        public Builder idle(RouteSpecTcpRouteTimeoutIdleGetArgs idle) {
            return idle(Output.of(idle));
        }

        public RouteSpecTcpRouteTimeoutGetArgs build() {
            return $;
        }
    }

}
