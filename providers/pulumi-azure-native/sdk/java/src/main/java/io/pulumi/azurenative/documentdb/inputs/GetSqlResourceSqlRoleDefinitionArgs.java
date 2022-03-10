// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlRoleDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlResourceSqlRoleDefinitionArgs Empty = new GetSqlResourceSqlRoleDefinitionArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The GUID for the Role Definition.
     * 
     */
    @InputImport(name="roleDefinitionId", required=true)
      private final String roleDefinitionId;

    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public GetSqlResourceSqlRoleDefinitionArgs(
        String accountName,
        String resourceGroupName,
        String roleDefinitionId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
    }

    private GetSqlResourceSqlRoleDefinitionArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.roleDefinitionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlResourceSqlRoleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlResourceSqlRoleDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public GetSqlResourceSqlRoleDefinitionArgs build() {
            return new GetSqlResourceSqlRoleDefinitionArgs(accountName, resourceGroupName, roleDefinitionId);
        }
    }
}
