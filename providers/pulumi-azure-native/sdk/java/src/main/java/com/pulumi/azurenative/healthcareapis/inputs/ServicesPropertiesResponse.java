// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.azurenative.healthcareapis.inputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceAccessPolicyEntryResponse;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceAcrConfigurationInfoResponse;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceAuthenticationConfigurationInfoResponse;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceCorsConfigurationInfoResponse;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceCosmosDbConfigurationInfoResponse;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceExportConfigurationInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a service instance.
 * 
 */
public final class ServicesPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServicesPropertiesResponse Empty = new ServicesPropertiesResponse();

    /**
     * The access policies of the service instance.
     * 
     */
    @Import(name="accessPolicies")
    private @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies;

    public Optional<List<ServiceAccessPolicyEntryResponse>> accessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }

    /**
     * The azure container registry settings used for convert data operation of the service instance.
     * 
     */
    @Import(name="acrConfiguration")
    private @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration;

    public Optional<ServiceAcrConfigurationInfoResponse> acrConfiguration() {
        return Optional.ofNullable(this.acrConfiguration);
    }

    /**
     * The authentication configuration for the service instance.
     * 
     */
    @Import(name="authenticationConfiguration")
    private @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration;

    public Optional<ServiceAuthenticationConfigurationInfoResponse> authenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }

    /**
     * The settings for the CORS configuration of the service instance.
     * 
     */
    @Import(name="corsConfiguration")
    private @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration;

    public Optional<ServiceCorsConfigurationInfoResponse> corsConfiguration() {
        return Optional.ofNullable(this.corsConfiguration);
    }

    /**
     * The settings for the Cosmos DB database backing the service.
     * 
     */
    @Import(name="cosmosDbConfiguration")
    private @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration;

    public Optional<ServiceCosmosDbConfigurationInfoResponse> cosmosDbConfiguration() {
        return Optional.ofNullable(this.cosmosDbConfiguration);
    }

    /**
     * The settings for the export operation of the service instance.
     * 
     */
    @Import(name="exportConfiguration")
    private @Nullable ServiceExportConfigurationInfoResponse exportConfiguration;

    public Optional<ServiceExportConfigurationInfoResponse> exportConfiguration() {
        return Optional.ofNullable(this.exportConfiguration);
    }

    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    @Import(name="privateEndpointConnections")
    private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;

    public Optional<List<PrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return Optional.ofNullable(this.privateEndpointConnections);
    }

    /**
     * The provisioning state.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable String publicNetworkAccess;

    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    private ServicesPropertiesResponse() {}

    private ServicesPropertiesResponse(ServicesPropertiesResponse $) {
        this.accessPolicies = $.accessPolicies;
        this.acrConfiguration = $.acrConfiguration;
        this.authenticationConfiguration = $.authenticationConfiguration;
        this.corsConfiguration = $.corsConfiguration;
        this.cosmosDbConfiguration = $.cosmosDbConfiguration;
        this.exportConfiguration = $.exportConfiguration;
        this.privateEndpointConnections = $.privateEndpointConnections;
        this.provisioningState = $.provisioningState;
        this.publicNetworkAccess = $.publicNetworkAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicesPropertiesResponse $;

        public Builder() {
            $ = new ServicesPropertiesResponse();
        }

        public Builder(ServicesPropertiesResponse defaults) {
            $ = new ServicesPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder accessPolicies(@Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies) {
            $.accessPolicies = accessPolicies;
            return this;
        }

        public Builder accessPolicies(ServiceAccessPolicyEntryResponse... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }

        public Builder acrConfiguration(@Nullable ServiceAcrConfigurationInfoResponse acrConfiguration) {
            $.acrConfiguration = acrConfiguration;
            return this;
        }

        public Builder authenticationConfiguration(@Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration) {
            $.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder corsConfiguration(@Nullable ServiceCorsConfigurationInfoResponse corsConfiguration) {
            $.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder cosmosDbConfiguration(@Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration) {
            $.cosmosDbConfiguration = cosmosDbConfiguration;
            return this;
        }

        public Builder exportConfiguration(@Nullable ServiceExportConfigurationInfoResponse exportConfiguration) {
            $.exportConfiguration = exportConfiguration;
            return this;
        }

        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            $.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public ServicesPropertiesResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
