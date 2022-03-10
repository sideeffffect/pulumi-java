// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKustoDatabaseDataSetResult {
    /**
     * Unique id for identifying a data set resource
     * 
     */
    private final String dataSetId;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set.
     * Expected value is 'KustoDatabase'.
     * 
     */
    private final String kind;
    /**
     * Resource id of the kusto database.
     * 
     */
    private final String kustoDatabaseResourceId;
    /**
     * Location of the kusto cluster.
     * 
     */
    private final String location;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the kusto database data set.
     * 
     */
    private final String provisioningState;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetKustoDatabaseDataSetResult(
        @OutputCustomType.Parameter("dataSetId") String dataSetId,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("kustoDatabaseResourceId") String kustoDatabaseResourceId,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.dataSetId = dataSetId;
        this.id = id;
        this.kind = kind;
        this.kustoDatabaseResourceId = kustoDatabaseResourceId;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Unique id for identifying a data set resource
     * 
    */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set.
     * Expected value is 'KustoDatabase'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource id of the kusto database.
     * 
    */
    public String getKustoDatabaseResourceId() {
        return this.kustoDatabaseResourceId;
    }
    /**
     * Location of the kusto cluster.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the kusto database data set.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKustoDatabaseDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String id;
        private String kind;
        private String kustoDatabaseResourceId;
        private String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKustoDatabaseDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.kustoDatabaseResourceId = defaults.kustoDatabaseResourceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
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

        public Builder kustoDatabaseResourceId(String kustoDatabaseResourceId) {
            this.kustoDatabaseResourceId = Objects.requireNonNull(kustoDatabaseResourceId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
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

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetKustoDatabaseDataSetResult build() {
            return new GetKustoDatabaseDataSetResult(dataSetId, id, kind, kustoDatabaseResourceId, location, name, provisioningState, systemData, type);
        }
    }
}
