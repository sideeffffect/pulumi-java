// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AddressSpaceResponse;
import com.pulumi.azurenative.network.inputs.RoutingConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * P2SConnectionConfiguration Resource.
 * 
 */
public final class P2SConnectionConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final P2SConnectionConfigurationResponse Empty = new P2SConnectionConfigurationResponse();

    /**
     * Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
     * 
     */
    @Import(name="enableInternetSecurity")
    private @Nullable Boolean enableInternetSecurity;

    public Optional<Boolean> enableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the P2SConnectionConfiguration resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @Import(name="routingConfiguration")
    private @Nullable RoutingConfigurationResponse routingConfiguration;

    public Optional<RoutingConfigurationResponse> routingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }

    /**
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    @Import(name="vpnClientAddressPool")
    private @Nullable AddressSpaceResponse vpnClientAddressPool;

    public Optional<AddressSpaceResponse> vpnClientAddressPool() {
        return Optional.ofNullable(this.vpnClientAddressPool);
    }

    private P2SConnectionConfigurationResponse() {}

    private P2SConnectionConfigurationResponse(P2SConnectionConfigurationResponse $) {
        this.enableInternetSecurity = $.enableInternetSecurity;
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.routingConfiguration = $.routingConfiguration;
        this.vpnClientAddressPool = $.vpnClientAddressPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(P2SConnectionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private P2SConnectionConfigurationResponse $;

        public Builder() {
            $ = new P2SConnectionConfigurationResponse();
        }

        public Builder(P2SConnectionConfigurationResponse defaults) {
            $ = new P2SConnectionConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder enableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            $.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder routingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            $.routingConfiguration = routingConfiguration;
            return this;
        }

        public Builder vpnClientAddressPool(@Nullable AddressSpaceResponse vpnClientAddressPool) {
            $.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }

        public P2SConnectionConfigurationResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
