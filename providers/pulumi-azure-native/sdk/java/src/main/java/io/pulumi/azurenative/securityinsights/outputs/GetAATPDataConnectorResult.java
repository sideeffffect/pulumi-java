// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.AlertsDataTypeOfDataConnectorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAATPDataConnectorResult {
    /**
     * The available data types for the connector.
     * 
     */
    private final @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes;
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * The kind of the data connector
     * Expected value is 'AzureAdvancedThreatProtection'.
     * 
     */
    private final String kind;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * The tenant id to connect to, and get the data from.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetAATPDataConnectorResult(
        @OutputCustomType.Parameter("dataTypes") @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes,
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("tenantId") @Nullable String tenantId,
        @OutputCustomType.Parameter("type") String type) {
        this.dataTypes = dataTypes;
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The available data types for the connector.
     * 
    */
    public Optional<AlertsDataTypeOfDataConnectorResponse> getDataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }
    /**
     * Etag of the azure resource
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of the data connector
     * Expected value is 'AzureAdvancedThreatProtection'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The tenant id to connect to, and get the data from.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAATPDataConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String name;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAATPDataConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTypes = defaults.dataTypes;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder dataTypes(@Nullable AlertsDataTypeOfDataConnectorResponse dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAATPDataConnectorResult build() {
            return new GetAATPDataConnectorResult(dataTypes, etag, id, kind, name, tenantId, type);
        }
    }
}
