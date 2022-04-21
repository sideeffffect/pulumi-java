// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.ProxyServerPropertiesResponse;
import com.pulumi.azurenative.security.inputs.ServicePrincipalPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for hybrid compute management
 * 
 */
public final class HybridComputeSettingsPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final HybridComputeSettingsPropertiesResponse Empty = new HybridComputeSettingsPropertiesResponse();

    /**
     * Whether or not to automatically install Azure Arc (hybrid compute) agents on machines
     * 
     */
    @Import(name="autoProvision", required=true)
    private String autoProvision;

    public String autoProvision() {
        return this.autoProvision;
    }

    /**
     * State of the service principal and its secret
     * 
     */
    @Import(name="hybridComputeProvisioningState", required=true)
    private String hybridComputeProvisioningState;

    public String hybridComputeProvisioningState() {
        return this.hybridComputeProvisioningState;
    }

    /**
     * For a non-Azure machine that is not connected directly to the internet, specify a proxy server that the non-Azure machine can use.
     * 
     */
    @Import(name="proxyServer")
    private @Nullable ProxyServerPropertiesResponse proxyServer;

    public Optional<ProxyServerPropertiesResponse> proxyServer() {
        return Optional.ofNullable(this.proxyServer);
    }

    /**
     * The location where the metadata of machines will be stored
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The name of the resource group where Arc (Hybrid Compute) connectors are connected.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable String resourceGroupName;

    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * An object to access resources that are secured by an Azure AD tenant.
     * 
     */
    @Import(name="servicePrincipal")
    private @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

    public Optional<ServicePrincipalPropertiesResponse> servicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    private HybridComputeSettingsPropertiesResponse() {}

    private HybridComputeSettingsPropertiesResponse(HybridComputeSettingsPropertiesResponse $) {
        this.autoProvision = $.autoProvision;
        this.hybridComputeProvisioningState = $.hybridComputeProvisioningState;
        this.proxyServer = $.proxyServer;
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
        this.servicePrincipal = $.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridComputeSettingsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridComputeSettingsPropertiesResponse $;

        public Builder() {
            $ = new HybridComputeSettingsPropertiesResponse();
        }

        public Builder(HybridComputeSettingsPropertiesResponse defaults) {
            $ = new HybridComputeSettingsPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder autoProvision(String autoProvision) {
            $.autoProvision = autoProvision;
            return this;
        }

        public Builder hybridComputeProvisioningState(String hybridComputeProvisioningState) {
            $.hybridComputeProvisioningState = hybridComputeProvisioningState;
            return this;
        }

        public Builder proxyServer(@Nullable ProxyServerPropertiesResponse proxyServer) {
            $.proxyServer = proxyServer;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder servicePrincipal(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
            $.servicePrincipal = servicePrincipal;
            return this;
        }

        public HybridComputeSettingsPropertiesResponse build() {
            $.autoProvision = Objects.requireNonNull($.autoProvision, "expected parameter 'autoProvision' to be non-null");
            $.hybridComputeProvisioningState = Objects.requireNonNull($.hybridComputeProvisioningState, "expected parameter 'hybridComputeProvisioningState' to be non-null");
            return $;
        }
    }

}
