// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEventHubDataConnectionResult {
    /**
     * The event hub messages compression type
     * 
     */
    private final @Nullable String compression;
    /**
     * The event hub consumer group.
     * 
     */
    private final String consumerGroup;
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    private final @Nullable String dataFormat;
    /**
     * The resource ID of the event hub to be used to create a data connection.
     * 
     */
    private final String eventHubResourceId;
    /**
     * System properties of the event hub
     * 
     */
    private final @Nullable List<String> eventSystemProperties;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'EventHub'.
     * 
     */
    private final String kind;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    private final @Nullable String mappingRuleName;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    private final @Nullable String tableName;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"compression","consumerGroup","dataFormat","eventHubResourceId","eventSystemProperties","id","kind","location","mappingRuleName","name","provisioningState","systemData","tableName","type"})
    private GetEventHubDataConnectionResult(
        @Nullable String compression,
        String consumerGroup,
        @Nullable String dataFormat,
        String eventHubResourceId,
        @Nullable List<String> eventSystemProperties,
        String id,
        String kind,
        @Nullable String location,
        @Nullable String mappingRuleName,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable String tableName,
        String type) {
        this.compression = compression;
        this.consumerGroup = consumerGroup;
        this.dataFormat = dataFormat;
        this.eventHubResourceId = eventHubResourceId;
        this.eventSystemProperties = eventSystemProperties;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tableName = tableName;
        this.type = type;
    }

    /**
     * The event hub messages compression type
     * 
    */
    public Optional<String> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * The event hub consumer group.
     * 
    */
    public String getConsumerGroup() {
        return this.consumerGroup;
    }
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
    */
    public Optional<String> getDataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }
    /**
     * The resource ID of the event hub to be used to create a data connection.
     * 
    */
    public String getEventHubResourceId() {
        return this.eventHubResourceId;
    }
    /**
     * System properties of the event hub
     * 
    */
    public List<String> getEventSystemProperties() {
        return this.eventSystemProperties == null ? List.of() : this.eventSystemProperties;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'EventHub'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
    */
    public Optional<String> getMappingRuleName() {
        return Optional.ofNullable(this.mappingRuleName);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
    */
    public Optional<String> getTableName() {
        return Optional.ofNullable(this.tableName);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventHubDataConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compression;
        private String consumerGroup;
        private @Nullable String dataFormat;
        private String eventHubResourceId;
        private @Nullable List<String> eventSystemProperties;
        private String id;
        private String kind;
        private @Nullable String location;
        private @Nullable String mappingRuleName;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventHubDataConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataFormat = defaults.dataFormat;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.eventSystemProperties = defaults.eventSystemProperties;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }

        public Builder setConsumerGroup(String consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }

        public Builder setDataFormat(@Nullable String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder setEventHubResourceId(String eventHubResourceId) {
            this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
            return this;
        }

        public Builder setEventSystemProperties(@Nullable List<String> eventSystemProperties) {
            this.eventSystemProperties = eventSystemProperties;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetEventHubDataConnectionResult build() {
            return new GetEventHubDataConnectionResult(compression, consumerGroup, dataFormat, eventHubResourceId, eventSystemProperties, id, kind, location, mappingRuleName, name, provisioningState, systemData, tableName, type);
        }
    }
}
