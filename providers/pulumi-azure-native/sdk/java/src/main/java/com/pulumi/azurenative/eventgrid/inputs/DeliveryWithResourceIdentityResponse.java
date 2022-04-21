// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.azurenative.eventgrid.inputs.AzureFunctionEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.inputs.EventHubEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.inputs.EventSubscriptionIdentityResponse;
import com.pulumi.azurenative.eventgrid.inputs.HybridConnectionEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.inputs.ServiceBusQueueEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.inputs.ServiceBusTopicEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.inputs.StorageQueueEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.inputs.WebHookEventSubscriptionDestinationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the delivery for an event subscription with resource identity.
 * 
 */
public final class DeliveryWithResourceIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryWithResourceIdentityResponse Empty = new DeliveryWithResourceIdentityResponse();

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Import(name="destination")
    private @Nullable Object destination;

    public Optional<Object> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * The identity to use when delivering events.
     * 
     */
    @Import(name="identity")
    private @Nullable EventSubscriptionIdentityResponse identity;

    public Optional<EventSubscriptionIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }

    private DeliveryWithResourceIdentityResponse() {}

    private DeliveryWithResourceIdentityResponse(DeliveryWithResourceIdentityResponse $) {
        this.destination = $.destination;
        this.identity = $.identity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryWithResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryWithResourceIdentityResponse $;

        public Builder() {
            $ = new DeliveryWithResourceIdentityResponse();
        }

        public Builder(DeliveryWithResourceIdentityResponse defaults) {
            $ = new DeliveryWithResourceIdentityResponse(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable Object destination) {
            $.destination = destination;
            return this;
        }

        public Builder identity(@Nullable EventSubscriptionIdentityResponse identity) {
            $.identity = identity;
            return this;
        }

        public DeliveryWithResourceIdentityResponse build() {
            return $;
        }
    }

}
