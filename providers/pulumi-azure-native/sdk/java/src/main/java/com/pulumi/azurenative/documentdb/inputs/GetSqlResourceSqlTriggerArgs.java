// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlResourceSqlTriggerArgs Empty = new GetSqlResourceSqlTriggerArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB container name.
     * 
     */
    @Import(name="containerName", required=true)
    private String containerName;

    public String containerName() {
        return this.containerName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Cosmos DB trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
    private String triggerName;

    public String triggerName() {
        return this.triggerName;
    }

    private GetSqlResourceSqlTriggerArgs() {}

    private GetSqlResourceSqlTriggerArgs(GetSqlResourceSqlTriggerArgs $) {
        this.accountName = $.accountName;
        this.containerName = $.containerName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.triggerName = $.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlResourceSqlTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlResourceSqlTriggerArgs $;

        public Builder() {
            $ = new GetSqlResourceSqlTriggerArgs();
        }

        public Builder(GetSqlResourceSqlTriggerArgs defaults) {
            $ = new GetSqlResourceSqlTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder triggerName(String triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        public GetSqlResourceSqlTriggerArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            return $;
        }
    }

}
