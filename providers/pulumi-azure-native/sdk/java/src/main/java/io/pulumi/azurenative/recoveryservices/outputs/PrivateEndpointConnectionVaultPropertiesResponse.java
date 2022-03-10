// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.VaultPrivateEndpointConnectionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivateEndpointConnectionVaultPropertiesResponse {
    /**
     * Format of id subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.[Service]/{resource}/{resourceName}/privateEndpointConnections/{connectionName}.
     * 
     */
    private final String id;
    /**
     * Private Endpoint Connection Response Properties.
     * 
     */
    private final VaultPrivateEndpointConnectionResponse properties;

    @OutputCustomType.Constructor
    private PrivateEndpointConnectionVaultPropertiesResponse(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("properties") VaultPrivateEndpointConnectionResponse properties) {
        this.id = id;
        this.properties = properties;
    }

    /**
     * Format of id subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.[Service]/{resource}/{resourceName}/privateEndpointConnections/{connectionName}.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Private Endpoint Connection Response Properties.
     * 
    */
    public VaultPrivateEndpointConnectionResponse getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private VaultPrivateEndpointConnectionResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder properties(VaultPrivateEndpointConnectionResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public PrivateEndpointConnectionVaultPropertiesResponse build() {
            return new PrivateEndpointConnectionVaultPropertiesResponse(id, properties);
        }
    }
}
