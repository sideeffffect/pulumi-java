// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.ApiManagementServiceSkuPropertiesResponse;
import com.pulumi.azurenative.apimanagement.inputs.VirtualNetworkConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of an additional API Management resource location.
 * 
 */
public final class AdditionalLocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AdditionalLocationResponse Empty = new AdditionalLocationResponse();

    /**
     * Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
     * 
     */
    @Import(name="disableGateway")
      private final @Nullable Boolean disableGateway;

    public Optional<Boolean> disableGateway() {
        return this.disableGateway == null ? Optional.empty() : Optional.ofNullable(this.disableGateway);
    }

    /**
     * Gateway URL of the API Management service in the Region.
     * 
     */
    @Import(name="gatewayRegionalUrl", required=true)
      private final String gatewayRegionalUrl;

    public String gatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }

    /**
     * The location name of the additional region among Azure Data center regions.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    /**
     * Private Static Load Balanced IP addresses of the API Management service which is deployed in an Internal Virtual Network in a particular additional location. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    @Import(name="privateIPAddresses", required=true)
      private final List<String> privateIPAddresses;

    public List<String> privateIPAddresses() {
        return this.privateIPAddresses;
    }

    /**
     * Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    @Import(name="publicIPAddresses", required=true)
      private final List<String> publicIPAddresses;

    public List<String> publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * SKU properties of the API Management service.
     * 
     */
    @Import(name="sku", required=true)
      private final ApiManagementServiceSkuPropertiesResponse sku;

    public ApiManagementServiceSkuPropertiesResponse sku() {
        return this.sku;
    }

    /**
     * Virtual network configuration for the location.
     * 
     */
    @Import(name="virtualNetworkConfiguration")
      private final @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;

    public Optional<VirtualNetworkConfigurationResponse> virtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration == null ? Optional.empty() : Optional.ofNullable(this.virtualNetworkConfiguration);
    }

    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @Import(name="zones")
      private final @Nullable List<String> zones;

    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public AdditionalLocationResponse(
        @Nullable Boolean disableGateway,
        String gatewayRegionalUrl,
        String location,
        List<String> privateIPAddresses,
        List<String> publicIPAddresses,
        ApiManagementServiceSkuPropertiesResponse sku,
        @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration,
        @Nullable List<String> zones) {
        this.disableGateway = disableGateway == null ? false : disableGateway;
        this.gatewayRegionalUrl = Objects.requireNonNull(gatewayRegionalUrl, "expected parameter 'gatewayRegionalUrl' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.privateIPAddresses = Objects.requireNonNull(privateIPAddresses, "expected parameter 'privateIPAddresses' to be non-null");
        this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses, "expected parameter 'publicIPAddresses' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        this.zones = zones;
    }

    private AdditionalLocationResponse() {
        this.disableGateway = null;
        this.gatewayRegionalUrl = null;
        this.location = null;
        this.privateIPAddresses = List.of();
        this.publicIPAddresses = List.of();
        this.sku = null;
        this.virtualNetworkConfiguration = null;
        this.zones = List.of();
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

        public Builder disableGateway(@Nullable Boolean disableGateway) {
            this.disableGateway = disableGateway;
            return this;
        }
        public Builder gatewayRegionalUrl(String gatewayRegionalUrl) {
            this.gatewayRegionalUrl = Objects.requireNonNull(gatewayRegionalUrl);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder privateIPAddresses(List<String> privateIPAddresses) {
            this.privateIPAddresses = Objects.requireNonNull(privateIPAddresses);
            return this;
        }
        public Builder privateIPAddresses(String... privateIPAddresses) {
            return privateIPAddresses(List.of(privateIPAddresses));
        }
        public Builder publicIPAddresses(List<String> publicIPAddresses) {
            this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
            return this;
        }
        public Builder publicIPAddresses(String... publicIPAddresses) {
            return publicIPAddresses(List.of(publicIPAddresses));
        }
        public Builder sku(ApiManagementServiceSkuPropertiesResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder virtualNetworkConfiguration(@Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public AdditionalLocationResponse build() {
            return new AdditionalLocationResponse(disableGateway, gatewayRegionalUrl, location, privateIPAddresses, publicIPAddresses, sku, virtualNetworkConfiguration, zones);
        }
    }
}
