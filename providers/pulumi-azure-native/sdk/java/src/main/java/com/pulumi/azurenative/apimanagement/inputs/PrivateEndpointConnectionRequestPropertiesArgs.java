// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The connection state of the private endpoint connection.
 * 
 */
public final class PrivateEndpointConnectionRequestPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionRequestPropertiesArgs Empty = new PrivateEndpointConnectionRequestPropertiesArgs();

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Optional<Output<PrivateLinkServiceConnectionStateArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    private PrivateEndpointConnectionRequestPropertiesArgs() {}

    private PrivateEndpointConnectionRequestPropertiesArgs(PrivateEndpointConnectionRequestPropertiesArgs $) {
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionRequestPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionRequestPropertiesArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionRequestPropertiesArgs();
        }

        public Builder(PrivateEndpointConnectionRequestPropertiesArgs defaults) {
            $ = new PrivateEndpointConnectionRequestPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder privateLinkServiceConnectionState(@Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        public PrivateEndpointConnectionRequestPropertiesArgs build() {
            return $;
        }
    }

}
