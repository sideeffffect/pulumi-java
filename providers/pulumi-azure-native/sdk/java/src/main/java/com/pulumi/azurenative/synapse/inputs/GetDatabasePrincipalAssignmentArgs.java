// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabasePrincipalAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasePrincipalAssignmentArgs Empty = new GetDatabasePrincipalAssignmentArgs();

    /**
     * The name of the database in the Kusto pool.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
    private String kustoPoolName;

    public String kustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * The name of the Kusto principalAssignment.
     * 
     */
    @Import(name="principalAssignmentName", required=true)
    private String principalAssignmentName;

    public String principalAssignmentName() {
        return this.principalAssignmentName;
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
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetDatabasePrincipalAssignmentArgs() {}

    private GetDatabasePrincipalAssignmentArgs(GetDatabasePrincipalAssignmentArgs $) {
        this.databaseName = $.databaseName;
        this.kustoPoolName = $.kustoPoolName;
        this.principalAssignmentName = $.principalAssignmentName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasePrincipalAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasePrincipalAssignmentArgs $;

        public Builder() {
            $ = new GetDatabasePrincipalAssignmentArgs();
        }

        public Builder(GetDatabasePrincipalAssignmentArgs defaults) {
            $ = new GetDatabasePrincipalAssignmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder kustoPoolName(String kustoPoolName) {
            $.kustoPoolName = kustoPoolName;
            return this;
        }

        public Builder principalAssignmentName(String principalAssignmentName) {
            $.principalAssignmentName = principalAssignmentName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetDatabasePrincipalAssignmentArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.kustoPoolName = Objects.requireNonNull($.kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
            $.principalAssignmentName = Objects.requireNonNull($.principalAssignmentName, "expected parameter 'principalAssignmentName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
