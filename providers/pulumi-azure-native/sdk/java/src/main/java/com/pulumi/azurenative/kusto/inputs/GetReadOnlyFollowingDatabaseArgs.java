// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReadOnlyFollowingDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReadOnlyFollowingDatabaseArgs Empty = new GetReadOnlyFollowingDatabaseArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetReadOnlyFollowingDatabaseArgs() {}

    private GetReadOnlyFollowingDatabaseArgs(GetReadOnlyFollowingDatabaseArgs $) {
        this.clusterName = $.clusterName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReadOnlyFollowingDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReadOnlyFollowingDatabaseArgs $;

        public Builder() {
            $ = new GetReadOnlyFollowingDatabaseArgs();
        }

        public Builder(GetReadOnlyFollowingDatabaseArgs defaults) {
            $ = new GetReadOnlyFollowingDatabaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
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

        public GetReadOnlyFollowingDatabaseArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
