// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouteResponse {
    /**
     * The path for the route.
     * 
     */
    private final String path;
    /**
     * The port for the route.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private RouteResponse(
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("port") Integer port) {
        this.path = path;
        this.port = port;
    }

    /**
     * The path for the route.
     * 
    */
    public String path() {
        return this.path;
    }
    /**
     * The port for the route.
     * 
    */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.port = defaults.port;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public RouteResponse build() {
            return new RouteResponse(path, port);
        }
    }
}
