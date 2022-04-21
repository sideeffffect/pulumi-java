// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ADLSGen2FolderDataSetMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ADLSGen2FolderDataSetMappingArgs Empty = new ADLSGen2FolderDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The id of the source data set.
     * 
     */
    @Import(name="dataSetId", required=true)
    private Output<String> dataSetId;

    public Output<String> dataSetId() {
        return this.dataSetId;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @Import(name="dataSetMappingName")
    private @Nullable Output<String> dataSetMappingName;

    public Optional<Output<String>> dataSetMappingName() {
        return Optional.ofNullable(this.dataSetMappingName);
    }

    /**
     * File system to which the folder belongs.
     * 
     */
    @Import(name="fileSystem", required=true)
    private Output<String> fileSystem;

    public Output<String> fileSystem() {
        return this.fileSystem;
    }

    /**
     * Folder path within the file system.
     * 
     */
    @Import(name="folderPath", required=true)
    private Output<String> folderPath;

    public Output<String> folderPath() {
        return this.folderPath;
    }

    /**
     * Kind of data set mapping.
     * Expected value is &#39;AdlsGen2Folder&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource group of storage account.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private Output<String> resourceGroup;

    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
    private Output<String> shareSubscriptionName;

    public Output<String> shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Storage account name of the source data set.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Subscription id of storage account.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private ADLSGen2FolderDataSetMappingArgs() {}

    private ADLSGen2FolderDataSetMappingArgs(ADLSGen2FolderDataSetMappingArgs $) {
        this.accountName = $.accountName;
        this.dataSetId = $.dataSetId;
        this.dataSetMappingName = $.dataSetMappingName;
        this.fileSystem = $.fileSystem;
        this.folderPath = $.folderPath;
        this.kind = $.kind;
        this.resourceGroup = $.resourceGroup;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
        this.storageAccountName = $.storageAccountName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ADLSGen2FolderDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ADLSGen2FolderDataSetMappingArgs $;

        public Builder() {
            $ = new ADLSGen2FolderDataSetMappingArgs();
        }

        public Builder(ADLSGen2FolderDataSetMappingArgs defaults) {
            $ = new ADLSGen2FolderDataSetMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder dataSetId(Output<String> dataSetId) {
            $.dataSetId = dataSetId;
            return this;
        }

        public Builder dataSetId(String dataSetId) {
            return dataSetId(Output.of(dataSetId));
        }

        public Builder dataSetMappingName(@Nullable Output<String> dataSetMappingName) {
            $.dataSetMappingName = dataSetMappingName;
            return this;
        }

        public Builder dataSetMappingName(String dataSetMappingName) {
            return dataSetMappingName(Output.of(dataSetMappingName));
        }

        public Builder fileSystem(Output<String> fileSystem) {
            $.fileSystem = fileSystem;
            return this;
        }

        public Builder fileSystem(String fileSystem) {
            return fileSystem(Output.of(fileSystem));
        }

        public Builder folderPath(Output<String> folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        public Builder folderPath(String folderPath) {
            return folderPath(Output.of(folderPath));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder resourceGroup(Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder shareSubscriptionName(Output<String> shareSubscriptionName) {
            $.shareSubscriptionName = shareSubscriptionName;
            return this;
        }

        public Builder shareSubscriptionName(String shareSubscriptionName) {
            return shareSubscriptionName(Output.of(shareSubscriptionName));
        }

        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public ADLSGen2FolderDataSetMappingArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataSetId = Objects.requireNonNull($.dataSetId, "expected parameter 'dataSetId' to be non-null");
            $.fileSystem = Objects.requireNonNull($.fileSystem, "expected parameter 'fileSystem' to be non-null");
            $.folderPath = Objects.requireNonNull($.folderPath, "expected parameter 'folderPath' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
