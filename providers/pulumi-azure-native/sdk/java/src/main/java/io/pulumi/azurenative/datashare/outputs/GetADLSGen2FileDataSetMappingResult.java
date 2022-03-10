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
public final class GetADLSGen2FileDataSetMappingResult {
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
     * File path within the file system.
     * 
     */
    private final String filePath;
    /**
     * File system to which the file belongs.
     * 
     */
    private final String fileSystem;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set mapping.
     * Expected value is 'AdlsGen2File'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Type of output file
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

    @OutputCustomType.Constructor
    private GetADLSGen2FileDataSetMappingResult(
        @OutputCustomType.Parameter("dataSetId") String dataSetId,
        @OutputCustomType.Parameter("dataSetMappingStatus") String dataSetMappingStatus,
        @OutputCustomType.Parameter("filePath") String filePath,
        @OutputCustomType.Parameter("fileSystem") String fileSystem,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("outputType") @Nullable String outputType,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("resourceGroup") String resourceGroup,
        @OutputCustomType.Parameter("storageAccountName") String storageAccountName,
        @OutputCustomType.Parameter("subscriptionId") String subscriptionId,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.dataSetId = dataSetId;
        this.dataSetMappingStatus = dataSetMappingStatus;
        this.filePath = filePath;
        this.fileSystem = fileSystem;
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
     * File path within the file system.
     * 
    */
    public String getFilePath() {
        return this.filePath;
    }
    /**
     * File system to which the file belongs.
     * 
    */
    public String getFileSystem() {
        return this.fileSystem;
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
     * Expected value is 'AdlsGen2File'.
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
     * Type of output file
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

    public static Builder builder(GetADLSGen2FileDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String dataSetMappingStatus;
        private String filePath;
        private String fileSystem;
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

        public Builder(GetADLSGen2FileDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.filePath = defaults.filePath;
    	      this.fileSystem = defaults.fileSystem;
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

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder dataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder filePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder fileSystem(String fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
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

        public Builder outputType(@Nullable String outputType) {
            this.outputType = outputType;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
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
        public GetADLSGen2FileDataSetMappingResult build() {
            return new GetADLSGen2FileDataSetMappingResult(dataSetId, dataSetMappingStatus, filePath, fileSystem, id, kind, name, outputType, provisioningState, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
