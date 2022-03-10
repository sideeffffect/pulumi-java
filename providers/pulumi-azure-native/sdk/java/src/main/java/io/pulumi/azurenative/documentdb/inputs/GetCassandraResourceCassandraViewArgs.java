// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCassandraResourceCassandraViewArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCassandraResourceCassandraViewArgs Empty = new GetCassandraResourceCassandraViewArgs();

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
     * Cosmos DB keyspace name.
     * 
     */
    @InputImport(name="keyspaceName", required=true)
      private final String keyspaceName;

    public String getKeyspaceName() {
        return this.keyspaceName;
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
     * Cosmos DB view name.
     * 
     */
    @InputImport(name="viewName", required=true)
      private final String viewName;

    public String getViewName() {
        return this.viewName;
    }

    public GetCassandraResourceCassandraViewArgs(
        String accountName,
        String keyspaceName,
        String resourceGroupName,
        String viewName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.keyspaceName = Objects.requireNonNull(keyspaceName, "expected parameter 'keyspaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.viewName = Objects.requireNonNull(viewName, "expected parameter 'viewName' to be non-null");
    }

    private GetCassandraResourceCassandraViewArgs() {
        this.accountName = null;
        this.keyspaceName = null;
        this.resourceGroupName = null;
        this.viewName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCassandraResourceCassandraViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String keyspaceName;
        private String resourceGroupName;
        private String viewName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCassandraResourceCassandraViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.keyspaceName = defaults.keyspaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.viewName = defaults.viewName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder keyspaceName(String keyspaceName) {
            this.keyspaceName = Objects.requireNonNull(keyspaceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder viewName(String viewName) {
            this.viewName = Objects.requireNonNull(viewName);
            return this;
        }
        public GetCassandraResourceCassandraViewArgs build() {
            return new GetCassandraResourceCassandraViewArgs(accountName, keyspaceName, resourceGroupName, viewName);
        }
    }
}
