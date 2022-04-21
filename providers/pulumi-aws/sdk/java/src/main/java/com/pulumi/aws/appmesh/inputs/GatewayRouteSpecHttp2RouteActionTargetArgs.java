// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteActionTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteActionTargetArgs Empty = new GatewayRouteSpecHttp2RouteActionTargetArgs();

    /**
     * The virtual service gateway route target.
     * 
     */
    @Import(name="virtualService", required=true)
    private Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> virtualService;

    public Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> virtualService() {
        return this.virtualService;
    }

    private GatewayRouteSpecHttp2RouteActionTargetArgs() {}

    private GatewayRouteSpecHttp2RouteActionTargetArgs(GatewayRouteSpecHttp2RouteActionTargetArgs $) {
        this.virtualService = $.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecHttp2RouteActionTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttp2RouteActionTargetArgs $;

        public Builder() {
            $ = new GatewayRouteSpecHttp2RouteActionTargetArgs();
        }

        public Builder(GatewayRouteSpecHttp2RouteActionTargetArgs defaults) {
            $ = new GatewayRouteSpecHttp2RouteActionTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder virtualService(Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs> virtualService) {
            $.virtualService = virtualService;
            return this;
        }

        public Builder virtualService(GatewayRouteSpecHttp2RouteActionTargetVirtualServiceArgs virtualService) {
            return virtualService(Output.of(virtualService));
        }

        public GatewayRouteSpecHttp2RouteActionTargetArgs build() {
            $.virtualService = Objects.requireNonNull($.virtualService, "expected parameter 'virtualService' to be non-null");
            return $;
        }
    }

}
