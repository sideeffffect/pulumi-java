// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.operationalinsights.enums.BillingType;
import io.pulumi.azurenative.operationalinsights.inputs.ClusterSkuArgs;
import io.pulumi.azurenative.operationalinsights.inputs.IdentityArgs;
import io.pulumi.azurenative.operationalinsights.inputs.KeyVaultPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The cluster's billing type.
     * 
     */
    @InputImport(name="billingType")
      private final @Nullable Input<Either<String,BillingType>> billingType;

    public Input<Either<String,BillingType>> getBillingType() {
        return this.billingType == null ? Input.empty() : this.billingType;
    }

    /**
     * The name of the Log Analytics cluster.
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * The identity of the resource.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Sets whether the cluster will support availability zones. This can be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be modified after cluster creation. Default value is 'true' if region supports Availability Zones.
     * 
     */
    @InputImport(name="isAvailabilityZonesEnabled")
      private final @Nullable Input<Boolean> isAvailabilityZonesEnabled;

    public Input<Boolean> getIsAvailabilityZonesEnabled() {
        return this.isAvailabilityZonesEnabled == null ? Input.empty() : this.isAvailabilityZonesEnabled;
    }

    /**
     * Configures whether cluster will use double encryption. This Property can not be modified after cluster creation. Default value is 'true'
     * 
     */
    @InputImport(name="isDoubleEncryptionEnabled")
      private final @Nullable Input<Boolean> isDoubleEncryptionEnabled;

    public Input<Boolean> getIsDoubleEncryptionEnabled() {
        return this.isDoubleEncryptionEnabled == null ? Input.empty() : this.isDoubleEncryptionEnabled;
    }

    /**
     * The associated key properties.
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
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku properties.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<ClusterSkuArgs> sku;

    public Input<ClusterSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
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

    public ClusterArgs(
        @Nullable Input<Either<String,BillingType>> billingType,
        @Nullable Input<String> clusterName,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<Boolean> isAvailabilityZonesEnabled,
        @Nullable Input<Boolean> isDoubleEncryptionEnabled,
        @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<ClusterSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.billingType = billingType;
        this.clusterName = clusterName;
        this.identity = identity;
        this.isAvailabilityZonesEnabled = isAvailabilityZonesEnabled;
        this.isDoubleEncryptionEnabled = isDoubleEncryptionEnabled;
        this.keyVaultProperties = keyVaultProperties;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private ClusterArgs() {
        this.billingType = Input.empty();
        this.clusterName = Input.empty();
        this.identity = Input.empty();
        this.isAvailabilityZonesEnabled = Input.empty();
        this.isDoubleEncryptionEnabled = Input.empty();
        this.keyVaultProperties = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BillingType>> billingType;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<Boolean> isAvailabilityZonesEnabled;
        private @Nullable Input<Boolean> isDoubleEncryptionEnabled;
        private @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<ClusterSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.clusterName = defaults.clusterName;
    	      this.identity = defaults.identity;
    	      this.isAvailabilityZonesEnabled = defaults.isAvailabilityZonesEnabled;
    	      this.isDoubleEncryptionEnabled = defaults.isDoubleEncryptionEnabled;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder billingType(@Nullable Input<Either<String,BillingType>> billingType) {
            this.billingType = billingType;
            return this;
        }

        public Builder billingType(@Nullable Either<String,BillingType> billingType) {
            this.billingType = Input.ofNullable(billingType);
            return this;
        }

        public Builder clusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
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

        public Builder isAvailabilityZonesEnabled(@Nullable Input<Boolean> isAvailabilityZonesEnabled) {
            this.isAvailabilityZonesEnabled = isAvailabilityZonesEnabled;
            return this;
        }

        public Builder isAvailabilityZonesEnabled(@Nullable Boolean isAvailabilityZonesEnabled) {
            this.isAvailabilityZonesEnabled = Input.ofNullable(isAvailabilityZonesEnabled);
            return this;
        }

        public Builder isDoubleEncryptionEnabled(@Nullable Input<Boolean> isDoubleEncryptionEnabled) {
            this.isDoubleEncryptionEnabled = isDoubleEncryptionEnabled;
            return this;
        }

        public Builder isDoubleEncryptionEnabled(@Nullable Boolean isDoubleEncryptionEnabled) {
            this.isDoubleEncryptionEnabled = Input.ofNullable(isDoubleEncryptionEnabled);
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

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sku(@Nullable Input<ClusterSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable ClusterSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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
        public ClusterArgs build() {
            return new ClusterArgs(billingType, clusterName, identity, isAvailabilityZonesEnabled, isDoubleEncryptionEnabled, keyVaultProperties, location, resourceGroupName, sku, tags);
        }
    }
}
