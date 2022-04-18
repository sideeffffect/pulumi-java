// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.azurenative.sql.outputs.PrivateEndpointConnectionPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServerPrivateEndpointConnectionResponse {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Private endpoint connection properties
     * 
     */
    private final PrivateEndpointConnectionPropertiesResponse properties;

    @CustomType.Constructor
    private ServerPrivateEndpointConnectionResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("properties") PrivateEndpointConnectionPropertiesResponse properties) {
        this.id = id;
        this.properties = properties;
    }

    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Private endpoint connection properties
     * 
    */
    public PrivateEndpointConnectionPropertiesResponse properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private PrivateEndpointConnectionPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder properties(PrivateEndpointConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public ServerPrivateEndpointConnectionResponse build() {
            return new ServerPrivateEndpointConnectionResponse(id, properties);
        }
    }
}
