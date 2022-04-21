// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBlobFolderDataSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBlobFolderDataSetArgs Empty = new GetBlobFolderDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName", required=true)
    private String dataSetName;

    public String dataSetName() {
        return this.dataSetName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
    private String shareName;

    public String shareName() {
        return this.shareName;
    }

    private GetBlobFolderDataSetArgs() {}

    private GetBlobFolderDataSetArgs(GetBlobFolderDataSetArgs $) {
        this.accountName = $.accountName;
        this.dataSetName = $.dataSetName;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBlobFolderDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBlobFolderDataSetArgs $;

        public Builder() {
            $ = new GetBlobFolderDataSetArgs();
        }

        public Builder(GetBlobFolderDataSetArgs defaults) {
            $ = new GetBlobFolderDataSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder dataSetName(String dataSetName) {
            $.dataSetName = dataSetName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder shareName(String shareName) {
            $.shareName = shareName;
            return this;
        }

        public GetBlobFolderDataSetArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataSetName = Objects.requireNonNull($.dataSetName, "expected parameter 'dataSetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            return $;
        }
    }

}
