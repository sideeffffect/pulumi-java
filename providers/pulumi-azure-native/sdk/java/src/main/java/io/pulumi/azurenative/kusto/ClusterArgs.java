// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.EngineType;
import io.pulumi.azurenative.kusto.inputs.AzureSkuArgs;
import io.pulumi.azurenative.kusto.inputs.IdentityArgs;
import io.pulumi.azurenative.kusto.inputs.KeyVaultPropertiesArgs;
import io.pulumi.azurenative.kusto.inputs.OptimizedAutoscaleArgs;
import io.pulumi.azurenative.kusto.inputs.TrustedExternalTenantArgs;
import io.pulumi.azurenative.kusto.inputs.VirtualNetworkConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * A boolean value that indicates if the cluster's disks are encrypted.
     * 
     */
    @InputImport(name="enableDiskEncryption")
      private final @Nullable Input<Boolean> enableDiskEncryption;

    public Input<Boolean> getEnableDiskEncryption() {
        return this.enableDiskEncryption == null ? Input.empty() : this.enableDiskEncryption;
    }

    /**
     * A boolean value that indicates if double encryption is enabled.
     * 
     */
    @InputImport(name="enableDoubleEncryption")
      private final @Nullable Input<Boolean> enableDoubleEncryption;

    public Input<Boolean> getEnableDoubleEncryption() {
        return this.enableDoubleEncryption == null ? Input.empty() : this.enableDoubleEncryption;
    }

    /**
     * A boolean value that indicates if the purge operations are enabled.
     * 
     */
    @InputImport(name="enablePurge")
      private final @Nullable Input<Boolean> enablePurge;

    public Input<Boolean> getEnablePurge() {
        return this.enablePurge == null ? Input.empty() : this.enablePurge;
    }

    /**
     * A boolean value that indicates if the streaming ingest is enabled.
     * 
     */
    @InputImport(name="enableStreamingIngest")
      private final @Nullable Input<Boolean> enableStreamingIngest;

    public Input<Boolean> getEnableStreamingIngest() {
        return this.enableStreamingIngest == null ? Input.empty() : this.enableStreamingIngest;
    }

    /**
     * The engine type
     * 
     */
    @InputImport(name="engineType")
      private final @Nullable Input<Either<String,EngineType>> engineType;

    public Input<Either<String,EngineType>> getEngineType() {
        return this.engineType == null ? Input.empty() : this.engineType;
    }

    /**
     * The identity of the cluster, if configured.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * KeyVault properties for the cluster encryption.
     * 
     */
    @InputImport(name="keyVaultProperties")
      private final @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;

    public Input<KeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Input.empty() : this.keyVaultProperties;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optimized auto scale definition.
     * 
     */
    @InputImport(name="optimizedAutoscale")
      private final @Nullable Input<OptimizedAutoscaleArgs> optimizedAutoscale;

    public Input<OptimizedAutoscaleArgs> getOptimizedAutoscale() {
        return this.optimizedAutoscale == null ? Input.empty() : this.optimizedAutoscale;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the cluster.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<AzureSkuArgs> sku;

    public Input<AzureSkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The cluster's external tenants.
     * 
     */
    @InputImport(name="trustedExternalTenants")
      private final @Nullable Input<List<TrustedExternalTenantArgs>> trustedExternalTenants;

    public Input<List<TrustedExternalTenantArgs>> getTrustedExternalTenants() {
        return this.trustedExternalTenants == null ? Input.empty() : this.trustedExternalTenants;
    }

    /**
     * Virtual network definition.
     * 
     */
    @InputImport(name="virtualNetworkConfiguration")
      private final @Nullable Input<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration;

    public Input<VirtualNetworkConfigurationArgs> getVirtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration == null ? Input.empty() : this.virtualNetworkConfiguration;
    }

    /**
     * The availability zones of the cluster.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public ClusterArgs(
        @Nullable Input<String> clusterName,
        @Nullable Input<Boolean> enableDiskEncryption,
        @Nullable Input<Boolean> enableDoubleEncryption,
        @Nullable Input<Boolean> enablePurge,
        @Nullable Input<Boolean> enableStreamingIngest,
        @Nullable Input<Either<String,EngineType>> engineType,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties,
        @Nullable Input<String> location,
        @Nullable Input<OptimizedAutoscaleArgs> optimizedAutoscale,
        Input<String> resourceGroupName,
        Input<AzureSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<TrustedExternalTenantArgs>> trustedExternalTenants,
        @Nullable Input<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration,
        @Nullable Input<List<String>> zones) {
        this.clusterName = clusterName;
        this.enableDiskEncryption = enableDiskEncryption == null ? Input.ofNullable(false) : enableDiskEncryption;
        this.enableDoubleEncryption = enableDoubleEncryption == null ? Input.ofNullable(false) : enableDoubleEncryption;
        this.enablePurge = enablePurge == null ? Input.ofNullable(false) : enablePurge;
        this.enableStreamingIngest = enableStreamingIngest == null ? Input.ofNullable(false) : enableStreamingIngest;
        this.engineType = engineType == null ? Input.ofLeft("V3") : engineType;
        this.identity = identity;
        this.keyVaultProperties = keyVaultProperties;
        this.location = location;
        this.optimizedAutoscale = optimizedAutoscale;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
        this.trustedExternalTenants = trustedExternalTenants;
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        this.zones = zones;
    }

    private ClusterArgs() {
        this.clusterName = Input.empty();
        this.enableDiskEncryption = Input.empty();
        this.enableDoubleEncryption = Input.empty();
        this.enablePurge = Input.empty();
        this.enableStreamingIngest = Input.empty();
        this.engineType = Input.empty();
        this.identity = Input.empty();
        this.keyVaultProperties = Input.empty();
        this.location = Input.empty();
        this.optimizedAutoscale = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.trustedExternalTenants = Input.empty();
        this.virtualNetworkConfiguration = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterName;
        private @Nullable Input<Boolean> enableDiskEncryption;
        private @Nullable Input<Boolean> enableDoubleEncryption;
        private @Nullable Input<Boolean> enablePurge;
        private @Nullable Input<Boolean> enableStreamingIngest;
        private @Nullable Input<Either<String,EngineType>> engineType;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;
        private @Nullable Input<String> location;
        private @Nullable Input<OptimizedAutoscaleArgs> optimizedAutoscale;
        private Input<String> resourceGroupName;
        private Input<AzureSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<TrustedExternalTenantArgs>> trustedExternalTenants;
        private @Nullable Input<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.enableDiskEncryption = defaults.enableDiskEncryption;
    	      this.enableDoubleEncryption = defaults.enableDoubleEncryption;
    	      this.enablePurge = defaults.enablePurge;
    	      this.enableStreamingIngest = defaults.enableStreamingIngest;
    	      this.engineType = defaults.engineType;
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.location = defaults.location;
    	      this.optimizedAutoscale = defaults.optimizedAutoscale;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.trustedExternalTenants = defaults.trustedExternalTenants;
    	      this.virtualNetworkConfiguration = defaults.virtualNetworkConfiguration;
    	      this.zones = defaults.zones;
        }

        public Builder clusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder enableDiskEncryption(@Nullable Input<Boolean> enableDiskEncryption) {
            this.enableDiskEncryption = enableDiskEncryption;
            return this;
        }

        public Builder enableDiskEncryption(@Nullable Boolean enableDiskEncryption) {
            this.enableDiskEncryption = Input.ofNullable(enableDiskEncryption);
            return this;
        }

        public Builder enableDoubleEncryption(@Nullable Input<Boolean> enableDoubleEncryption) {
            this.enableDoubleEncryption = enableDoubleEncryption;
            return this;
        }

        public Builder enableDoubleEncryption(@Nullable Boolean enableDoubleEncryption) {
            this.enableDoubleEncryption = Input.ofNullable(enableDoubleEncryption);
            return this;
        }

        public Builder enablePurge(@Nullable Input<Boolean> enablePurge) {
            this.enablePurge = enablePurge;
            return this;
        }

        public Builder enablePurge(@Nullable Boolean enablePurge) {
            this.enablePurge = Input.ofNullable(enablePurge);
            return this;
        }

        public Builder enableStreamingIngest(@Nullable Input<Boolean> enableStreamingIngest) {
            this.enableStreamingIngest = enableStreamingIngest;
            return this;
        }

        public Builder enableStreamingIngest(@Nullable Boolean enableStreamingIngest) {
            this.enableStreamingIngest = Input.ofNullable(enableStreamingIngest);
            return this;
        }

        public Builder engineType(@Nullable Input<Either<String,EngineType>> engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder engineType(@Nullable Either<String,EngineType> engineType) {
            this.engineType = Input.ofNullable(engineType);
            return this;
        }

        public Builder identity(@Nullable Input<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable IdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder keyVaultProperties(@Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Input.ofNullable(keyVaultProperties);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder optimizedAutoscale(@Nullable Input<OptimizedAutoscaleArgs> optimizedAutoscale) {
            this.optimizedAutoscale = optimizedAutoscale;
            return this;
        }

        public Builder optimizedAutoscale(@Nullable OptimizedAutoscaleArgs optimizedAutoscale) {
            this.optimizedAutoscale = Input.ofNullable(optimizedAutoscale);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sku(Input<AzureSkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder sku(AzureSkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder trustedExternalTenants(@Nullable Input<List<TrustedExternalTenantArgs>> trustedExternalTenants) {
            this.trustedExternalTenants = trustedExternalTenants;
            return this;
        }

        public Builder trustedExternalTenants(@Nullable List<TrustedExternalTenantArgs> trustedExternalTenants) {
            this.trustedExternalTenants = Input.ofNullable(trustedExternalTenants);
            return this;
        }

        public Builder virtualNetworkConfiguration(@Nullable Input<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }

        public Builder virtualNetworkConfiguration(@Nullable VirtualNetworkConfigurationArgs virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = Input.ofNullable(virtualNetworkConfiguration);
            return this;
        }

        public Builder zones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public ClusterArgs build() {
            return new ClusterArgs(clusterName, enableDiskEncryption, enableDoubleEncryption, enablePurge, enableStreamingIngest, engineType, identity, keyVaultProperties, location, optimizedAutoscale, resourceGroupName, sku, tags, trustedExternalTenants, virtualNetworkConfiguration, zones);
        }
    }
}
