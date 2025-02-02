// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlServerInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlServerInstanceArgs Empty = new GetSqlServerInstanceArgs();

    /**
     * The name of the Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Azure resource group
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of SQL Server Instance
     * 
     */
    @Import(name="sqlServerInstanceName", required=true)
    private Output<String> sqlServerInstanceName;

    /**
     * @return Name of SQL Server Instance
     * 
     */
    public Output<String> sqlServerInstanceName() {
        return this.sqlServerInstanceName;
    }

    private GetSqlServerInstanceArgs() {}

    private GetSqlServerInstanceArgs(GetSqlServerInstanceArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.sqlServerInstanceName = $.sqlServerInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlServerInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlServerInstanceArgs $;

        public Builder() {
            $ = new GetSqlServerInstanceArgs();
        }

        public Builder(GetSqlServerInstanceArgs defaults) {
            $ = new GetSqlServerInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sqlServerInstanceName Name of SQL Server Instance
         * 
         * @return builder
         * 
         */
        public Builder sqlServerInstanceName(Output<String> sqlServerInstanceName) {
            $.sqlServerInstanceName = sqlServerInstanceName;
            return this;
        }

        /**
         * @param sqlServerInstanceName Name of SQL Server Instance
         * 
         * @return builder
         * 
         */
        public Builder sqlServerInstanceName(String sqlServerInstanceName) {
            return sqlServerInstanceName(Output.of(sqlServerInstanceName));
        }

        public GetSqlServerInstanceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sqlServerInstanceName = Objects.requireNonNull($.sqlServerInstanceName, "expected parameter 'sqlServerInstanceName' to be non-null");
            return $;
        }
    }

}
