// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEventHubDataConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventHubDataConnectionArgs Empty = new GetEventHubDataConnectionArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the data connection.
     * 
     */
    @InputImport(name="dataConnectionName", required=true)
      private final String dataConnectionName;

    public String getDataConnectionName() {
        return this.dataConnectionName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @InputImport(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetEventHubDataConnectionArgs(
        String clusterName,
        String dataConnectionName,
        String databaseName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.dataConnectionName = Objects.requireNonNull(dataConnectionName, "expected parameter 'dataConnectionName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEventHubDataConnectionArgs() {
        this.clusterName = null;
        this.dataConnectionName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventHubDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String dataConnectionName;
        private String databaseName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventHubDataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder dataConnectionName(String dataConnectionName) {
            this.dataConnectionName = Objects.requireNonNull(dataConnectionName);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetEventHubDataConnectionArgs build() {
            return new GetEventHubDataConnectionArgs(clusterName, dataConnectionName, databaseName, resourceGroupName);
        }
    }
}
