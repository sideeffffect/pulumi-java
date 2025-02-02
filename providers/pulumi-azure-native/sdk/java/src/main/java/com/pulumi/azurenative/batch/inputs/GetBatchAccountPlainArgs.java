// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBatchAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBatchAccountPlainArgs Empty = new GetBatchAccountPlainArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the Batch account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the Batch account.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetBatchAccountPlainArgs() {}

    private GetBatchAccountPlainArgs(GetBatchAccountPlainArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBatchAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBatchAccountPlainArgs $;

        public Builder() {
            $ = new GetBatchAccountPlainArgs();
        }

        public Builder(GetBatchAccountPlainArgs defaults) {
            $ = new GetBatchAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetBatchAccountPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
