// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.azurenative.eventhub.outputs.CaptureDescriptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEventHubResult {
    /**
     * Properties of capture description
     * 
     */
    private final @Nullable CaptureDescriptionResponse captureDescription;
    /**
     * Exact time the Event Hub was created.
     * 
     */
    private final String createdAt;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Number of days to retain the events for this Event Hub, value should be 1 to 7 days
     * 
     */
    private final @Nullable Double messageRetentionInDays;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     * 
     */
    private final @Nullable Double partitionCount;
    /**
     * Current number of shards on the Event Hub.
     * 
     */
    private final List<String> partitionIds;
    /**
     * Enumerates the possible values for the status of the Event Hub.
     * 
     */
    private final @Nullable String status;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The exact time the message was updated.
     * 
     */
    private final String updatedAt;

    @OutputCustomType.Constructor({"captureDescription","createdAt","id","messageRetentionInDays","name","partitionCount","partitionIds","status","type","updatedAt"})
    private GetEventHubResult(
        @Nullable CaptureDescriptionResponse captureDescription,
        String createdAt,
        String id,
        @Nullable Double messageRetentionInDays,
        String name,
        @Nullable Double partitionCount,
        List<String> partitionIds,
        @Nullable String status,
        String type,
        String updatedAt) {
        this.captureDescription = captureDescription;
        this.createdAt = createdAt;
        this.id = id;
        this.messageRetentionInDays = messageRetentionInDays;
        this.name = name;
        this.partitionCount = partitionCount;
        this.partitionIds = partitionIds;
        this.status = status;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    /**
     * Properties of capture description
     * 
    */
    public Optional<CaptureDescriptionResponse> getCaptureDescription() {
        return Optional.ofNullable(this.captureDescription);
    }
    /**
     * Exact time the Event Hub was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Number of days to retain the events for this Event Hub, value should be 1 to 7 days
     * 
    */
    public Optional<Double> getMessageRetentionInDays() {
        return Optional.ofNullable(this.messageRetentionInDays);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     * 
    */
    public Optional<Double> getPartitionCount() {
        return Optional.ofNullable(this.partitionCount);
    }
    /**
     * Current number of shards on the Event Hub.
     * 
    */
    public List<String> getPartitionIds() {
        return this.partitionIds;
    }
    /**
     * Enumerates the possible values for the status of the Event Hub.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The exact time the message was updated.
     * 
    */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventHubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CaptureDescriptionResponse captureDescription;
        private String createdAt;
        private String id;
        private @Nullable Double messageRetentionInDays;
        private String name;
        private @Nullable Double partitionCount;
        private List<String> partitionIds;
        private @Nullable String status;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captureDescription = defaults.captureDescription;
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.messageRetentionInDays = defaults.messageRetentionInDays;
    	      this.name = defaults.name;
    	      this.partitionCount = defaults.partitionCount;
    	      this.partitionIds = defaults.partitionIds;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder setCaptureDescription(@Nullable CaptureDescriptionResponse captureDescription) {
            this.captureDescription = captureDescription;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMessageRetentionInDays(@Nullable Double messageRetentionInDays) {
            this.messageRetentionInDays = messageRetentionInDays;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartitionCount(@Nullable Double partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        public Builder setPartitionIds(List<String> partitionIds) {
            this.partitionIds = Objects.requireNonNull(partitionIds);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public GetEventHubResult build() {
            return new GetEventHubResult(captureDescription, createdAt, id, messageRetentionInDays, name, partitionCount, partitionIds, status, type, updatedAt);
        }
    }
}
