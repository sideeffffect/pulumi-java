// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBlobDataSetMappingResult {
    /**
     * Container that has the file path.
     * 
     */
    private final String containerName;
    /**
     * The id of the source data set.
     * 
     */
    private final String dataSetId;
    /**
     * Gets the status of the data set mapping.
     * 
     */
    private final String dataSetMappingStatus;
    /**
     * File path within the source data set
     * 
     */
    private final String filePath;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set mapping.
     * Expected value is 'Blob'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * File output type
     * 
     */
    private final @Nullable String outputType;
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    private final String provisioningState;
    /**
     * Resource group of storage account.
     * 
     */
    private final String resourceGroup;
    /**
     * Storage account name of the source data set.
     * 
     */
    private final String storageAccountName;
    /**
     * Subscription id of storage account.
     * 
     */
    private final String subscriptionId;
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

    @OutputCustomType.Constructor({"containerName","dataSetId","dataSetMappingStatus","filePath","id","kind","name","outputType","provisioningState","resourceGroup","storageAccountName","subscriptionId","systemData","type"})
    private GetBlobDataSetMappingResult(
        String containerName,
        String dataSetId,
        String dataSetMappingStatus,
        String filePath,
        String id,
        String kind,
        String name,
        @Nullable String outputType,
        String provisioningState,
        String resourceGroup,
        String storageAccountName,
        String subscriptionId,
        SystemDataResponse systemData,
        String type) {
        this.containerName = containerName;
        this.dataSetId = dataSetId;
        this.dataSetMappingStatus = dataSetMappingStatus;
        this.filePath = filePath;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.outputType = outputType;
        this.provisioningState = provisioningState;
        this.resourceGroup = resourceGroup;
        this.storageAccountName = storageAccountName;
        this.subscriptionId = subscriptionId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Container that has the file path.
     * 
    */
    public String getContainerName() {
        return this.containerName;
    }
    /**
     * The id of the source data set.
     * 
    */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
    */
    public String getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * File path within the source data set
     * 
    */
    public String getFilePath() {
        return this.filePath;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'Blob'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * File output type
     * 
    */
    public Optional<String> getOutputType() {
        return Optional.ofNullable(this.outputType);
    }
    /**
     * Provisioning state of the data set mapping.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource group of storage account.
     * 
    */
    public String getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set.
     * 
    */
    public String getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account.
     * 
    */
    public String getSubscriptionId() {
        return this.subscriptionId;
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

    public static Builder builder(GetBlobDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String dataSetId;
        private String dataSetMappingStatus;
        private String filePath;
        private String id;
        private String kind;
        private String name;
        private @Nullable String outputType;
        private String provisioningState;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.filePath = defaults.filePath;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.outputType = defaults.outputType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder setFilePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputType(@Nullable String outputType) {
            this.outputType = outputType;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetBlobDataSetMappingResult build() {
            return new GetBlobDataSetMappingResult(containerName, dataSetId, dataSetMappingStatus, filePath, id, kind, name, outputType, provisioningState, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
