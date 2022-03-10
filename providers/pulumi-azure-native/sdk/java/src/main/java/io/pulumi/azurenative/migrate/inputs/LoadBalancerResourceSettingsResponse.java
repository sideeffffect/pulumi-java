// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.LBBackendAddressPoolResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.LBFrontendIPConfigurationResourceSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the load balancer resource settings.
 * 
 */
public final class LoadBalancerResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerResourceSettingsResponse Empty = new LoadBalancerResourceSettingsResponse();

    /**
     * Gets or sets the backend address pools of the load balancer.
     * 
     */
    @InputImport(name="backendAddressPools")
      private final @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools;

    public List<LBBackendAddressPoolResourceSettingsResponse> getBackendAddressPools() {
        return this.backendAddressPools == null ? List.of() : this.backendAddressPools;
    }

    /**
     * Gets or sets the frontend IP configurations of the load balancer.
     * 
     */
    @InputImport(name="frontendIPConfigurations")
      private final @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations;

    public List<LBFrontendIPConfigurationResourceSettingsResponse> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations == null ? List.of() : this.frontendIPConfigurations;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/loadBalancers'.
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets load balancer sku (Basic/Standard).
     * 
     */
    @InputImport(name="sku")
      private final @Nullable String sku;

    public Optional<String> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @InputImport(name="targetResourceName", required=true)
      private final String targetResourceName;

    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
     *  precedence only if frontend IP configurations settings are not present.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable String zones;

    public Optional<String> getZones() {
        return this.zones == null ? Optional.empty() : Optional.ofNullable(this.zones);
    }

    public LoadBalancerResourceSettingsResponse(
        @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools,
        @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations,
        String resourceType,
        @Nullable String sku,
        String targetResourceName,
        @Nullable String zones) {
        this.backendAddressPools = backendAddressPools;
        this.frontendIPConfigurations = frontendIPConfigurations;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.sku = sku;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
        this.zones = zones;
    }

    private LoadBalancerResourceSettingsResponse() {
        this.backendAddressPools = List.of();
        this.frontendIPConfigurations = List.of();
        this.resourceType = null;
        this.sku = null;
        this.targetResourceName = null;
        this.zones = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools;
        private @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations;
        private String resourceType;
        private @Nullable String sku;
        private String targetResourceName;
        private @Nullable String zones;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPools = defaults.backendAddressPools;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.zones = defaults.zones;
        }

        public Builder backendAddressPools(@Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools) {
            this.backendAddressPools = backendAddressPools;
            return this;
        }

        public Builder frontendIPConfigurations(@Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder zones(@Nullable String zones) {
            this.zones = zones;
            return this;
        }
        public LoadBalancerResourceSettingsResponse build() {
            return new LoadBalancerResourceSettingsResponse(backendAddressPools, frontendIPConfigurations, resourceType, sku, targetResourceName, zones);
        }
    }
}
