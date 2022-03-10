// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMongoDBResourceMongoUserDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMongoDBResourceMongoUserDefinitionArgs Empty = new GetMongoDBResourceMongoUserDefinitionArgs();

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
     * The ID for the User Definition {dbName.userName}.
     * 
     */
    @InputImport(name="mongoUserDefinitionId", required=true)
      private final String mongoUserDefinitionId;

    public String getMongoUserDefinitionId() {
        return this.mongoUserDefinitionId;
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

    public GetMongoDBResourceMongoUserDefinitionArgs(
        String accountName,
        String mongoUserDefinitionId,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.mongoUserDefinitionId = Objects.requireNonNull(mongoUserDefinitionId, "expected parameter 'mongoUserDefinitionId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMongoDBResourceMongoUserDefinitionArgs() {
        this.accountName = null;
        this.mongoUserDefinitionId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMongoDBResourceMongoUserDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String mongoUserDefinitionId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMongoDBResourceMongoUserDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.mongoUserDefinitionId = defaults.mongoUserDefinitionId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder mongoUserDefinitionId(String mongoUserDefinitionId) {
            this.mongoUserDefinitionId = Objects.requireNonNull(mongoUserDefinitionId);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetMongoDBResourceMongoUserDefinitionArgs build() {
            return new GetMongoDBResourceMongoUserDefinitionArgs(accountName, mongoUserDefinitionId, resourceGroupName);
        }
    }
}
