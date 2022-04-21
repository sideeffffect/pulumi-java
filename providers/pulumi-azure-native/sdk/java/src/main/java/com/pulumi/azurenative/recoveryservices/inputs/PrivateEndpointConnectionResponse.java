// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.PrivateEndpointResponse;
import com.pulumi.azurenative.recoveryservices.inputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private Endpoint Connection Response Properties
 * 
 */
public final class PrivateEndpointConnectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionResponse Empty = new PrivateEndpointConnectionResponse();

    /**
     * Gets or sets private endpoint associated with the private endpoint connection
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable PrivateEndpointResponse privateEndpoint;

    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Gets or sets private link service connection state
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Gets or sets provisioning state of the private endpoint connection
     * 
     */
    @Import(name="provisioningState")
    private @Nullable String provisioningState;

    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    private PrivateEndpointConnectionResponse() {}

    private PrivateEndpointConnectionResponse(PrivateEndpointConnectionResponse $) {
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionResponse $;

        public Builder() {
            $ = new PrivateEndpointConnectionResponse();
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
            $ = new PrivateEndpointConnectionResponse(Objects.requireNonNull(defaults));
        }

        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public PrivateEndpointConnectionResponse build() {
            return $;
        }
    }

}
