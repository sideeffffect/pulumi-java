// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.InboundIpRuleResponse;
import io.pulumi.azurenative.eventgrid.outputs.JsonInputSchemaMappingResponse;
import io.pulumi.azurenative.eventgrid.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTopicResult {
    /**
     * Endpoint for the topic.
     * 
     */
    private final String endpoint;
    /**
     * Fully qualified identifier of the resource.
     * 
     */
    private final String id;
    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    private final @Nullable List<InboundIpRuleResponse> inboundIpRules;
    /**
     * This determines the format that Event Grid should expect for incoming events published to the topic.
     * 
     */
    private final @Nullable String inputSchema;
    /**
     * This enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema.
     * 
     */
    private final @Nullable JsonInputSchemaMappingResponse inputSchemaMapping;
    /**
     * Location of the resource.
     * 
     */
    private final String location;
    /**
     * Metric resource id for the topic.
     * 
     */
    private final String metricResourceId;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Provisioning state of the topic.
     * 
     */
    private final String provisioningState;
    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" />
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * The system metadata relating to Topic resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetTopicResult(
        @OutputCustomType.Parameter("endpoint") String endpoint,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("inboundIpRules") @Nullable List<InboundIpRuleResponse> inboundIpRules,
        @OutputCustomType.Parameter("inputSchema") @Nullable String inputSchema,
        @OutputCustomType.Parameter("inputSchemaMapping") @Nullable JsonInputSchemaMappingResponse inputSchemaMapping,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("metricResourceId") String metricResourceId,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.endpoint = endpoint;
        this.id = id;
        this.inboundIpRules = inboundIpRules;
        this.inputSchema = inputSchema;
        this.inputSchemaMapping = inputSchemaMapping;
        this.location = location;
        this.metricResourceId = metricResourceId;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Endpoint for the topic.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * Fully qualified identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
    */
    public List<InboundIpRuleResponse> getInboundIpRules() {
        return this.inboundIpRules == null ? List.of() : this.inboundIpRules;
    }
    /**
     * This determines the format that Event Grid should expect for incoming events published to the topic.
     * 
    */
    public Optional<String> getInputSchema() {
        return Optional.ofNullable(this.inputSchema);
    }
    /**
     * This enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema.
     * 
    */
    public Optional<JsonInputSchemaMappingResponse> getInputSchemaMapping() {
        return Optional.ofNullable(this.inputSchemaMapping);
    }
    /**
     * Location of the resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Metric resource id for the topic.
     * 
    */
    public String getMetricResourceId() {
        return this.metricResourceId;
    }
    /**
     * Name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Provisioning state of the topic.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" />
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * The system metadata relating to Topic resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String id;
        private @Nullable List<InboundIpRuleResponse> inboundIpRules;
        private @Nullable String inputSchema;
        private @Nullable JsonInputSchemaMappingResponse inputSchemaMapping;
        private String location;
        private String metricResourceId;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.inboundIpRules = defaults.inboundIpRules;
    	      this.inputSchema = defaults.inputSchema;
    	      this.inputSchemaMapping = defaults.inputSchemaMapping;
    	      this.location = defaults.location;
    	      this.metricResourceId = defaults.metricResourceId;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder inboundIpRules(@Nullable List<InboundIpRuleResponse> inboundIpRules) {
            this.inboundIpRules = inboundIpRules;
            return this;
        }

        public Builder inputSchema(@Nullable String inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }

        public Builder inputSchemaMapping(@Nullable JsonInputSchemaMappingResponse inputSchemaMapping) {
            this.inputSchemaMapping = inputSchemaMapping;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder metricResourceId(String metricResourceId) {
            this.metricResourceId = Objects.requireNonNull(metricResourceId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTopicResult build() {
            return new GetTopicResult(endpoint, id, inboundIpRules, inputSchema, inputSchemaMapping, location, metricResourceId, name, privateEndpointConnections, provisioningState, publicNetworkAccess, systemData, tags, type);
        }
    }
}
