// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ADLSGen2FileSystemDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ADLSGen2FileSystemDataSetArgs Empty = new ADLSGen2FileSystemDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @InputImport(name="dataSetName")
      private final @Nullable Input<String> dataSetName;

    public Input<String> getDataSetName() {
        return this.dataSetName == null ? Input.empty() : this.dataSetName;
    }

    /**
     * The file system name.
     * 
     */
    @InputImport(name="fileSystem", required=true)
      private final Input<String> fileSystem;

    public Input<String> getFileSystem() {
        return this.fileSystem;
    }

    /**
     * Kind of data set.
     * Expected value is 'AdlsGen2FileSystem'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Resource group of storage account
     * 
     */
    @InputImport(name="resourceGroup", required=true)
      private final Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to add the data set to.
     * 
     */
    @InputImport(name="shareName", required=true)
      private final Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName;
    }

    /**
     * Storage account name of the source data set
     * 
     */
    @InputImport(name="storageAccountName", required=true)
      private final Input<String> storageAccountName;

    public Input<String> getStorageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Subscription id of storage account
     * 
     */
    @InputImport(name="subscriptionId", required=true)
      private final Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    public ADLSGen2FileSystemDataSetArgs(
        Input<String> accountName,
        @Nullable Input<String> dataSetName,
        Input<String> fileSystem,
        Input<String> kind,
        Input<String> resourceGroup,
        Input<String> resourceGroupName,
        Input<String> shareName,
        Input<String> storageAccountName,
        Input<String> subscriptionId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.fileSystem = Objects.requireNonNull(fileSystem, "expected parameter 'fileSystem' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private ADLSGen2FileSystemDataSetArgs() {
        this.accountName = Input.empty();
        this.dataSetName = Input.empty();
        this.fileSystem = Input.empty();
        this.kind = Input.empty();
        this.resourceGroup = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareName = Input.empty();
        this.storageAccountName = Input.empty();
        this.subscriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ADLSGen2FileSystemDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> dataSetName;
        private Input<String> fileSystem;
        private Input<String> kind;
        private Input<String> resourceGroup;
        private Input<String> resourceGroupName;
        private Input<String> shareName;
        private Input<String> storageAccountName;
        private Input<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ADLSGen2FileSystemDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.fileSystem = defaults.fileSystem;
    	      this.kind = defaults.kind;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder accountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder dataSetName(@Nullable Input<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }

        public Builder dataSetName(@Nullable String dataSetName) {
            this.dataSetName = Input.ofNullable(dataSetName);
            return this;
        }

        public Builder fileSystem(Input<String> fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
            return this;
        }

        public Builder fileSystem(String fileSystem) {
            this.fileSystem = Input.of(Objects.requireNonNull(fileSystem));
            return this;
        }

        public Builder kind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder resourceGroup(Input<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Input.of(Objects.requireNonNull(resourceGroup));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder shareName(Input<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder shareName(String shareName) {
            this.shareName = Input.of(Objects.requireNonNull(shareName));
            return this;
        }

        public Builder storageAccountName(Input<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Input.of(Objects.requireNonNull(storageAccountName));
            return this;
        }

        public Builder subscriptionId(Input<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Input.of(Objects.requireNonNull(subscriptionId));
            return this;
        }
        public ADLSGen2FileSystemDataSetArgs build() {
            return new ADLSGen2FileSystemDataSetArgs(accountName, dataSetName, fileSystem, kind, resourceGroup, resourceGroupName, shareName, storageAccountName, subscriptionId);
        }
    }
}
