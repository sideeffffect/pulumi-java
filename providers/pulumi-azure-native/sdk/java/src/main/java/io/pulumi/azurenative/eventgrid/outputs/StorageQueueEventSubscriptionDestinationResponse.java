// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageQueueEventSubscriptionDestinationResponse {
    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'StorageQueue'.
     * 
     */
    private final String endpointType;
    /**
     * The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
     */
    private final @Nullable String queueName;
    /**
     * The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
     */
    private final @Nullable String resourceId;

    @OutputCustomType.Constructor({"endpointType","queueName","resourceId"})
    private StorageQueueEventSubscriptionDestinationResponse(
        String endpointType,
        @Nullable String queueName,
        @Nullable String resourceId) {
        this.endpointType = endpointType;
        this.queueName = queueName;
        this.resourceId = resourceId;
    }

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'StorageQueue'.
     * 
    */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
    */
    public Optional<String> getQueueName() {
        return Optional.ofNullable(this.queueName);
    }
    /**
     * The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageQueueEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String queueName;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageQueueEventSubscriptionDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.queueName = defaults.queueName;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public StorageQueueEventSubscriptionDestinationResponse build() {
            return new StorageQueueEventSubscriptionDestinationResponse(endpointType, queueName, resourceId);
        }
    }
}
