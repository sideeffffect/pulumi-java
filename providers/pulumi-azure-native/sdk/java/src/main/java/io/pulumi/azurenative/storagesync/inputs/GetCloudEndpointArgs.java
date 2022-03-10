// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCloudEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCloudEndpointArgs Empty = new GetCloudEndpointArgs();

    /**
     * Name of Cloud Endpoint object.
     * 
     */
    @InputImport(name="cloudEndpointName", required=true)
      private final String cloudEndpointName;

    public String getCloudEndpointName() {
        return this.cloudEndpointName;
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
     * Name of Storage Sync Service resource.
     * 
     */
    @InputImport(name="storageSyncServiceName", required=true)
      private final String storageSyncServiceName;

    public String getStorageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    /**
     * Name of Sync Group resource.
     * 
     */
    @InputImport(name="syncGroupName", required=true)
      private final String syncGroupName;

    public String getSyncGroupName() {
        return this.syncGroupName;
    }

    public GetCloudEndpointArgs(
        String cloudEndpointName,
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName) {
        this.cloudEndpointName = Objects.requireNonNull(cloudEndpointName, "expected parameter 'cloudEndpointName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
        this.syncGroupName = Objects.requireNonNull(syncGroupName, "expected parameter 'syncGroupName' to be non-null");
    }

    private GetCloudEndpointArgs() {
        this.cloudEndpointName = null;
        this.resourceGroupName = null;
        this.storageSyncServiceName = null;
        this.syncGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudEndpointName;
        private String resourceGroupName;
        private String storageSyncServiceName;
        private String syncGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudEndpointName = defaults.cloudEndpointName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageSyncServiceName = defaults.storageSyncServiceName;
    	      this.syncGroupName = defaults.syncGroupName;
        }

        public Builder cloudEndpointName(String cloudEndpointName) {
            this.cloudEndpointName = Objects.requireNonNull(cloudEndpointName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder storageSyncServiceName(String storageSyncServiceName) {
            this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName);
            return this;
        }

        public Builder syncGroupName(String syncGroupName) {
            this.syncGroupName = Objects.requireNonNull(syncGroupName);
            return this;
        }
        public GetCloudEndpointArgs build() {
            return new GetCloudEndpointArgs(cloudEndpointName, resourceGroupName, storageSyncServiceName, syncGroupName);
        }
    }
}
