// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteConfigResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes the hostname properties for http routing.
 * 
 */
public final class HttpHostConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpHostConfigResponse Empty = new HttpHostConfigResponse();

    /**
     * http hostname config name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
     * 
     */
    @InputImport(name="routes", required=true)
      private final List<HttpRouteConfigResponse> routes;

    public List<HttpRouteConfigResponse> getRoutes() {
        return this.routes;
    }

    public HttpHostConfigResponse(
        String name,
        List<HttpRouteConfigResponse> routes) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routes = Objects.requireNonNull(routes, "expected parameter 'routes' to be non-null");
    }

    private HttpHostConfigResponse() {
        this.name = null;
        this.routes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHostConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<HttpRouteConfigResponse> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHostConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.routes = defaults.routes;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder routes(List<HttpRouteConfigResponse> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        public HttpHostConfigResponse build() {
            return new HttpHostConfigResponse(name, routes);
        }
    }
}
