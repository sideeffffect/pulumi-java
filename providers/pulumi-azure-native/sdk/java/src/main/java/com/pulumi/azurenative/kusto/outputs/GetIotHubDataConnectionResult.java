// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIotHubDataConnectionResult {
    /**
     * The iot hub consumer group.
     * 
     */
    private final String consumerGroup;
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    private final @Nullable String dataFormat;
    /**
     * System properties of the iot hub
     * 
     */
    private final @Nullable List<String> eventSystemProperties;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The resource ID of the Iot hub to be used to create a data connection.
     * 
     */
    private final String iotHubResourceId;
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'IotHub'.
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
     * The name of the share access policy
     * 
     */
    private final String sharedAccessPolicyName;
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

    @CustomType.Constructor
    private GetIotHubDataConnectionResult(
        @CustomType.Parameter("consumerGroup") String consumerGroup,
        @CustomType.Parameter("dataFormat") @Nullable String dataFormat,
        @CustomType.Parameter("eventSystemProperties") @Nullable List<String> eventSystemProperties,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("iotHubResourceId") String iotHubResourceId,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("mappingRuleName") @Nullable String mappingRuleName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sharedAccessPolicyName") String sharedAccessPolicyName,
        @CustomType.Parameter("tableName") @Nullable String tableName,
        @CustomType.Parameter("type") String type) {
        this.consumerGroup = consumerGroup;
        this.dataFormat = dataFormat;
        this.eventSystemProperties = eventSystemProperties;
        this.id = id;
        this.iotHubResourceId = iotHubResourceId;
        this.kind = kind;
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.tableName = tableName;
        this.type = type;
    }

    /**
     * The iot hub consumer group.
     * 
    */
    public String consumerGroup() {
        return this.consumerGroup;
    }
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
    */
    public Optional<String> dataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }
    /**
     * System properties of the iot hub
     * 
    */
    public List<String> eventSystemProperties() {
        return this.eventSystemProperties == null ? List.of() : this.eventSystemProperties;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The resource ID of the Iot hub to be used to create a data connection.
     * 
    */
    public String iotHubResourceId() {
        return this.iotHubResourceId;
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'IotHub'.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
    */
    public Optional<String> mappingRuleName() {
        return Optional.ofNullable(this.mappingRuleName);
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the share access policy
     * 
    */
    public String sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
    */
    public Optional<String> tableName() {
        return Optional.ofNullable(this.tableName);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotHubDataConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumerGroup;
        private @Nullable String dataFormat;
        private @Nullable List<String> eventSystemProperties;
        private String id;
        private String iotHubResourceId;
        private String kind;
        private @Nullable String location;
        private @Nullable String mappingRuleName;
        private String name;
        private String provisioningState;
        private String sharedAccessPolicyName;
        private @Nullable String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotHubDataConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataFormat = defaults.dataFormat;
    	      this.eventSystemProperties = defaults.eventSystemProperties;
    	      this.id = defaults.id;
    	      this.iotHubResourceId = defaults.iotHubResourceId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder consumerGroup(String consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }
        public Builder dataFormat(@Nullable String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Builder eventSystemProperties(@Nullable List<String> eventSystemProperties) {
            this.eventSystemProperties = eventSystemProperties;
            return this;
        }
        public Builder eventSystemProperties(String... eventSystemProperties) {
            return eventSystemProperties(List.of(eventSystemProperties));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder iotHubResourceId(String iotHubResourceId) {
            this.iotHubResourceId = Objects.requireNonNull(iotHubResourceId);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder mappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sharedAccessPolicyName(String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Objects.requireNonNull(sharedAccessPolicyName);
            return this;
        }
        public Builder tableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIotHubDataConnectionResult build() {
            return new GetIotHubDataConnectionResult(consumerGroup, dataFormat, eventSystemProperties, id, iotHubResourceId, kind, location, mappingRuleName, name, provisioningState, sharedAccessPolicyName, tableName, type);
        }
    }
}
