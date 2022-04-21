// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.VaultPrivateEndpointConnectionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information to be stored in Vault properties as an element of privateEndpointConnections List.
 * 
 */
public final class PrivateEndpointConnectionVaultPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionVaultPropertiesResponse Empty = new PrivateEndpointConnectionVaultPropertiesResponse();

    /**
     * Format of id subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.[Service]/{resource}/{resourceName}/privateEndpointConnections/{connectionName}.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Private Endpoint Connection Response Properties.
     * 
     */
    @Import(name="properties", required=true)
    private VaultPrivateEndpointConnectionResponse properties;

    public VaultPrivateEndpointConnectionResponse properties() {
        return this.properties;
    }

    private PrivateEndpointConnectionVaultPropertiesResponse() {}

    private PrivateEndpointConnectionVaultPropertiesResponse(PrivateEndpointConnectionVaultPropertiesResponse $) {
        this.id = $.id;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionVaultPropertiesResponse $;

        public Builder() {
            $ = new PrivateEndpointConnectionVaultPropertiesResponse();
        }

        public Builder(PrivateEndpointConnectionVaultPropertiesResponse defaults) {
            $ = new PrivateEndpointConnectionVaultPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder properties(VaultPrivateEndpointConnectionResponse properties) {
            $.properties = properties;
            return this;
        }

        public PrivateEndpointConnectionVaultPropertiesResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            return $;
        }
    }

}
