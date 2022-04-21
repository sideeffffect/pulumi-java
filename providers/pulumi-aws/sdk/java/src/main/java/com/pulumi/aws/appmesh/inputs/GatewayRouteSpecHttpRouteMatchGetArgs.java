// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteMatchGetArgs Empty = new GatewayRouteSpecHttpRouteMatchGetArgs();

    /**
     * Specifies the path to match requests with. This parameter must always start with `/`, which by itself matches all requests to the virtual service name.
     * 
     */
    @Import(name="prefix", required=true)
    private Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }

    private GatewayRouteSpecHttpRouteMatchGetArgs() {}

    private GatewayRouteSpecHttpRouteMatchGetArgs(GatewayRouteSpecHttpRouteMatchGetArgs $) {
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecHttpRouteMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttpRouteMatchGetArgs $;

        public Builder() {
            $ = new GatewayRouteSpecHttpRouteMatchGetArgs();
        }

        public Builder(GatewayRouteSpecHttpRouteMatchGetArgs defaults) {
            $ = new GatewayRouteSpecHttpRouteMatchGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public GatewayRouteSpecHttpRouteMatchGetArgs build() {
            $.prefix = Objects.requireNonNull($.prefix, "expected parameter 'prefix' to be non-null");
            return $;
        }
    }

}
