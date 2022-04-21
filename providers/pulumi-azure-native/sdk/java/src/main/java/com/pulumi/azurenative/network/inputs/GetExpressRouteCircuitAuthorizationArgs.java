// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRouteCircuitAuthorizationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExpressRouteCircuitAuthorizationArgs Empty = new GetExpressRouteCircuitAuthorizationArgs();

    /**
     * The name of the authorization.
     * 
     */
    @Import(name="authorizationName", required=true)
    private String authorizationName;

    public String authorizationName() {
        return this.authorizationName;
    }

    /**
     * The name of the express route circuit.
     * 
     */
    @Import(name="circuitName", required=true)
    private String circuitName;

    public String circuitName() {
        return this.circuitName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetExpressRouteCircuitAuthorizationArgs() {}

    private GetExpressRouteCircuitAuthorizationArgs(GetExpressRouteCircuitAuthorizationArgs $) {
        this.authorizationName = $.authorizationName;
        this.circuitName = $.circuitName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExpressRouteCircuitAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExpressRouteCircuitAuthorizationArgs $;

        public Builder() {
            $ = new GetExpressRouteCircuitAuthorizationArgs();
        }

        public Builder(GetExpressRouteCircuitAuthorizationArgs defaults) {
            $ = new GetExpressRouteCircuitAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationName(String authorizationName) {
            $.authorizationName = authorizationName;
            return this;
        }

        public Builder circuitName(String circuitName) {
            $.circuitName = circuitName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetExpressRouteCircuitAuthorizationArgs build() {
            $.authorizationName = Objects.requireNonNull($.authorizationName, "expected parameter 'authorizationName' to be non-null");
            $.circuitName = Objects.requireNonNull($.circuitName, "expected parameter 'circuitName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
