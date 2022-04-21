// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetADLSGen2FileDataSetMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetADLSGen2FileDataSetMappingArgs Empty = new GetADLSGen2FileDataSetMappingArgs();

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
     * The name of the dataSetMapping.
     * 
     */
    @Import(name="dataSetMappingName", required=true)
    private String dataSetMappingName;

    public String dataSetMappingName() {
        return this.dataSetMappingName;
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
     * The name of the shareSubscription.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
    private String shareSubscriptionName;

    public String shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    private GetADLSGen2FileDataSetMappingArgs() {}

    private GetADLSGen2FileDataSetMappingArgs(GetADLSGen2FileDataSetMappingArgs $) {
        this.accountName = $.accountName;
        this.dataSetMappingName = $.dataSetMappingName;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetADLSGen2FileDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetADLSGen2FileDataSetMappingArgs $;

        public Builder() {
            $ = new GetADLSGen2FileDataSetMappingArgs();
        }

        public Builder(GetADLSGen2FileDataSetMappingArgs defaults) {
            $ = new GetADLSGen2FileDataSetMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder dataSetMappingName(String dataSetMappingName) {
            $.dataSetMappingName = dataSetMappingName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder shareSubscriptionName(String shareSubscriptionName) {
            $.shareSubscriptionName = shareSubscriptionName;
            return this;
        }

        public GetADLSGen2FileDataSetMappingArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataSetMappingName = Objects.requireNonNull($.dataSetMappingName, "expected parameter 'dataSetMappingName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            return $;
        }
    }

}
