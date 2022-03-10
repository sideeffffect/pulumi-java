// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventHubOutputDataSourceResponse {
    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String eventHubName;
    /**
     * The key/column that is used to determine to which partition to send event data.
     * 
     */
    private final @Nullable String partitionKey;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String serviceBusNamespace;
    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyKey;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyName;
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private EventHubOutputDataSourceResponse(
        @OutputCustomType.Parameter("eventHubName") @Nullable String eventHubName,
        @OutputCustomType.Parameter("partitionKey") @Nullable String partitionKey,
        @OutputCustomType.Parameter("serviceBusNamespace") @Nullable String serviceBusNamespace,
        @OutputCustomType.Parameter("sharedAccessPolicyKey") @Nullable String sharedAccessPolicyKey,
        @OutputCustomType.Parameter("sharedAccessPolicyName") @Nullable String sharedAccessPolicyName,
        @OutputCustomType.Parameter("type") String type) {
        this.eventHubName = eventHubName;
        this.partitionKey = partitionKey;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = type;
    }

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getEventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }
    /**
     * The key/column that is used to determine to which partition to send event data.
     * 
    */
    public Optional<String> getPartitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getServiceBusNamespace() {
        return Optional.ofNullable(this.serviceBusNamespace);
    }
    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getSharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getSharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventHubName;
        private @Nullable String partitionKey;
        private @Nullable String serviceBusNamespace;
        private @Nullable String sharedAccessPolicyKey;
        private @Nullable String sharedAccessPolicyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubName = defaults.eventHubName;
    	      this.partitionKey = defaults.partitionKey;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder sharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder sharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EventHubOutputDataSourceResponse build() {
            return new EventHubOutputDataSourceResponse(eventHubName, partitionKey, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
