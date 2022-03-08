// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageBlobDeadLetterDestinationResponse {
    /**
     * The name of the Storage blob container that is the destination of the deadletter events
     * 
     */
    private final @Nullable String blobContainerName;
    /**
     * Type of the endpoint for the dead letter destination
     * Expected value is 'StorageBlob'.
     * 
     */
    private final String endpointType;
    /**
     * The Azure Resource ID of the storage account that is the destination of the deadletter events
     * 
     */
    private final @Nullable String resourceId;

    @OutputCustomType.Constructor({"blobContainerName","endpointType","resourceId"})
    private StorageBlobDeadLetterDestinationResponse(
        @Nullable String blobContainerName,
        String endpointType,
        @Nullable String resourceId) {
        this.blobContainerName = blobContainerName;
        this.endpointType = endpointType;
        this.resourceId = resourceId;
    }

    /**
     * The name of the Storage blob container that is the destination of the deadletter events
     * 
    */
    public Optional<String> getBlobContainerName() {
        return Optional.ofNullable(this.blobContainerName);
    }
    /**
     * Type of the endpoint for the dead letter destination
     * Expected value is 'StorageBlob'.
     * 
    */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The Azure Resource ID of the storage account that is the destination of the deadletter events
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageBlobDeadLetterDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobContainerName;
        private String endpointType;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageBlobDeadLetterDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobContainerName = defaults.blobContainerName;
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setBlobContainerName(@Nullable String blobContainerName) {
            this.blobContainerName = blobContainerName;
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public StorageBlobDeadLetterDestinationResponse build() {
            return new StorageBlobDeadLetterDestinationResponse(blobContainerName, endpointType, resourceId);
        }
    }
}
