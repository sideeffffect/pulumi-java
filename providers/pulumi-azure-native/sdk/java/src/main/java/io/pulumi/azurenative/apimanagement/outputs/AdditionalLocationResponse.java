// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.ApiManagementServiceSkuPropertiesResponse;
import io.pulumi.azurenative.apimanagement.outputs.VirtualNetworkConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AdditionalLocationResponse {
    /**
     * Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
     * 
     */
    private final @Nullable Boolean disableGateway;
    /**
     * Gateway URL of the API Management service in the Region.
     * 
     */
    private final String gatewayRegionalUrl;
    /**
     * The location name of the additional region among Azure Data center regions.
     * 
     */
    private final String location;
    /**
     * Private Static Load Balanced IP addresses of the API Management service which is deployed in an Internal Virtual Network in a particular additional location. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    private final List<String> privateIPAddresses;
    /**
     * Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    private final List<String> publicIPAddresses;
    /**
     * SKU properties of the API Management service.
     * 
     */
    private final ApiManagementServiceSkuPropertiesResponse sku;
    /**
     * Virtual network configuration for the location.
     * 
     */
    private final @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"disableGateway","gatewayRegionalUrl","location","privateIPAddresses","publicIPAddresses","sku","virtualNetworkConfiguration","zones"})
    private AdditionalLocationResponse(
        @Nullable Boolean disableGateway,
        String gatewayRegionalUrl,
        String location,
        List<String> privateIPAddresses,
        List<String> publicIPAddresses,
        ApiManagementServiceSkuPropertiesResponse sku,
        @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration,
        @Nullable List<String> zones) {
        this.disableGateway = disableGateway;
        this.gatewayRegionalUrl = gatewayRegionalUrl;
        this.location = location;
        this.privateIPAddresses = privateIPAddresses;
        this.publicIPAddresses = publicIPAddresses;
        this.sku = sku;
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        this.zones = zones;
    }

    /**
     * Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
     * 
    */
    public Optional<Boolean> getDisableGateway() {
        return Optional.ofNullable(this.disableGateway);
    }
    /**
     * Gateway URL of the API Management service in the Region.
     * 
    */
    public String getGatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }
    /**
     * The location name of the additional region among Azure Data center regions.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Private Static Load Balanced IP addresses of the API Management service which is deployed in an Internal Virtual Network in a particular additional location. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
    */
    public List<String> getPrivateIPAddresses() {
        return this.privateIPAddresses;
    }
    /**
     * Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
    */
    public List<String> getPublicIPAddresses() {
        return this.publicIPAddresses;
    }
    /**
     * SKU properties of the API Management service.
     * 
    */
    public ApiManagementServiceSkuPropertiesResponse getSku() {
        return this.sku;
    }
    /**
     * Virtual network configuration for the location.
     * 
    */
    public Optional<VirtualNetworkConfigurationResponse> getVirtualNetworkConfiguration() {
        return Optional.ofNullable(this.virtualNetworkConfiguration);
    }
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableGateway;
        private String gatewayRegionalUrl;
        private String location;
        private List<String> privateIPAddresses;
        private List<String> publicIPAddresses;
        private ApiManagementServiceSkuPropertiesResponse sku;
        private @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableGateway = defaults.disableGateway;
    	      this.gatewayRegionalUrl = defaults.gatewayRegionalUrl;
    	      this.location = defaults.location;
    	      this.privateIPAddresses = defaults.privateIPAddresses;
    	      this.publicIPAddresses = defaults.publicIPAddresses;
    	      this.sku = defaults.sku;
    	      this.virtualNetworkConfiguration = defaults.virtualNetworkConfiguration;
    	      this.zones = defaults.zones;
        }

        public Builder setDisableGateway(@Nullable Boolean disableGateway) {
            this.disableGateway = disableGateway;
            return this;
        }

        public Builder setGatewayRegionalUrl(String gatewayRegionalUrl) {
            this.gatewayRegionalUrl = Objects.requireNonNull(gatewayRegionalUrl);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setPrivateIPAddresses(List<String> privateIPAddresses) {
            this.privateIPAddresses = Objects.requireNonNull(privateIPAddresses);
            return this;
        }

        public Builder setPublicIPAddresses(List<String> publicIPAddresses) {
            this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
            return this;
        }

        public Builder setSku(ApiManagementServiceSkuPropertiesResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setVirtualNetworkConfiguration(@Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public AdditionalLocationResponse build() {
            return new AdditionalLocationResponse(disableGateway, gatewayRegionalUrl, location, privateIPAddresses, publicIPAddresses, sku, virtualNetworkConfiguration, zones);
        }
    }
}
