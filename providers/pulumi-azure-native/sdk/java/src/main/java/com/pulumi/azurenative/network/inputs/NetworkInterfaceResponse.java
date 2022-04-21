// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ExtendedLocationResponse;
import com.pulumi.azurenative.network.inputs.NetworkInterfaceDnsSettingsResponse;
import com.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationResponse;
import com.pulumi.azurenative.network.inputs.NetworkInterfaceTapConfigurationResponse;
import com.pulumi.azurenative.network.inputs.NetworkSecurityGroupResponse;
import com.pulumi.azurenative.network.inputs.PrivateEndpointResponse;
import com.pulumi.azurenative.network.inputs.PrivateLinkServiceResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A network interface in a resource group.
 * 
 */
public final class NetworkInterfaceResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceResponse Empty = new NetworkInterfaceResponse();

    /**
     * The DNS settings in network interface.
     * 
     */
    @Import(name="dnsSettings")
    private @Nullable NetworkInterfaceDnsSettingsResponse dnsSettings;

    public Optional<NetworkInterfaceDnsSettingsResponse> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }

    /**
     * A reference to the dscp configuration to which the network interface is linked.
     * 
     */
    @Import(name="dscpConfiguration", required=true)
    private SubResourceResponse dscpConfiguration;

    public SubResourceResponse dscpConfiguration() {
        return this.dscpConfiguration;
    }

    /**
     * If the network interface is accelerated networking enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworking")
    private @Nullable Boolean enableAcceleratedNetworking;

    public Optional<Boolean> enableAcceleratedNetworking() {
        return Optional.ofNullable(this.enableAcceleratedNetworking);
    }

    /**
     * Indicates whether IP forwarding is enabled on this network interface.
     * 
     */
    @Import(name="enableIPForwarding")
    private @Nullable Boolean enableIPForwarding;

    public Optional<Boolean> enableIPForwarding() {
        return Optional.ofNullable(this.enableIPForwarding);
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
     * The extended location of the network interface.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable ExtendedLocationResponse extendedLocation;

    public Optional<ExtendedLocationResponse> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * A list of references to linked BareMetal resources.
     * 
     */
    @Import(name="hostedWorkloads", required=true)
    private List<String> hostedWorkloads;

    public List<String> hostedWorkloads() {
        return this.hostedWorkloads;
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
     * A list of IPConfigurations of the network interface.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations;

    public Optional<List<NetworkInterfaceIPConfigurationResponse>> ipConfigurations() {
        return Optional.ofNullable(this.ipConfigurations);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The MAC address of the network interface.
     * 
     */
    @Import(name="macAddress", required=true)
    private String macAddress;

    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Migration phase of Network Interface resource.
     * 
     */
    @Import(name="migrationPhase")
    private @Nullable String migrationPhase;

    public Optional<String> migrationPhase() {
        return Optional.ofNullable(this.migrationPhase);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The reference to the NetworkSecurityGroup resource.
     * 
     */
    @Import(name="networkSecurityGroup")
    private @Nullable NetworkSecurityGroupResponse networkSecurityGroup;

    public Optional<NetworkSecurityGroupResponse> networkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }

    /**
     * Type of Network Interface resource.
     * 
     */
    @Import(name="nicType")
    private @Nullable String nicType;

    public Optional<String> nicType() {
        return Optional.ofNullable(this.nicType);
    }

    /**
     * Whether this is a primary network interface on a virtual machine.
     * 
     */
    @Import(name="primary", required=true)
    private Boolean primary;

    public Boolean primary() {
        return this.primary;
    }

    /**
     * A reference to the private endpoint to which the network interface is linked.
     * 
     */
    @Import(name="privateEndpoint", required=true)
    private PrivateEndpointResponse privateEndpoint;

    public PrivateEndpointResponse privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Privatelinkservice of the network interface resource.
     * 
     */
    @Import(name="privateLinkService")
    private @Nullable PrivateLinkServiceResponse privateLinkService;

    public Optional<PrivateLinkServiceResponse> privateLinkService() {
        return Optional.ofNullable(this.privateLinkService);
    }

    /**
     * The provisioning state of the network interface resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The resource GUID property of the network interface resource.
     * 
     */
    @Import(name="resourceGuid", required=true)
    private String resourceGuid;

    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A list of TapConfigurations of the network interface.
     * 
     */
    @Import(name="tapConfigurations", required=true)
    private List<NetworkInterfaceTapConfigurationResponse> tapConfigurations;

    public List<NetworkInterfaceTapConfigurationResponse> tapConfigurations() {
        return this.tapConfigurations;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The reference to a virtual machine.
     * 
     */
    @Import(name="virtualMachine", required=true)
    private SubResourceResponse virtualMachine;

    public SubResourceResponse virtualMachine() {
        return this.virtualMachine;
    }

    private NetworkInterfaceResponse() {}

    private NetworkInterfaceResponse(NetworkInterfaceResponse $) {
        this.dnsSettings = $.dnsSettings;
        this.dscpConfiguration = $.dscpConfiguration;
        this.enableAcceleratedNetworking = $.enableAcceleratedNetworking;
        this.enableIPForwarding = $.enableIPForwarding;
        this.etag = $.etag;
        this.extendedLocation = $.extendedLocation;
        this.hostedWorkloads = $.hostedWorkloads;
        this.id = $.id;
        this.ipConfigurations = $.ipConfigurations;
        this.location = $.location;
        this.macAddress = $.macAddress;
        this.migrationPhase = $.migrationPhase;
        this.name = $.name;
        this.networkSecurityGroup = $.networkSecurityGroup;
        this.nicType = $.nicType;
        this.primary = $.primary;
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkService = $.privateLinkService;
        this.provisioningState = $.provisioningState;
        this.resourceGuid = $.resourceGuid;
        this.tags = $.tags;
        this.tapConfigurations = $.tapConfigurations;
        this.type = $.type;
        this.virtualMachine = $.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceResponse $;

        public Builder() {
            $ = new NetworkInterfaceResponse();
        }

        public Builder(NetworkInterfaceResponse defaults) {
            $ = new NetworkInterfaceResponse(Objects.requireNonNull(defaults));
        }

        public Builder dnsSettings(@Nullable NetworkInterfaceDnsSettingsResponse dnsSettings) {
            $.dnsSettings = dnsSettings;
            return this;
        }

        public Builder dscpConfiguration(SubResourceResponse dscpConfiguration) {
            $.dscpConfiguration = dscpConfiguration;
            return this;
        }

        public Builder enableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            $.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }

        public Builder enableIPForwarding(@Nullable Boolean enableIPForwarding) {
            $.enableIPForwarding = enableIPForwarding;
            return this;
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        public Builder hostedWorkloads(List<String> hostedWorkloads) {
            $.hostedWorkloads = hostedWorkloads;
            return this;
        }

        public Builder hostedWorkloads(String... hostedWorkloads) {
            return hostedWorkloads(List.of(hostedWorkloads));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder ipConfigurations(@Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder ipConfigurations(NetworkInterfaceIPConfigurationResponse... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        public Builder macAddress(String macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        public Builder migrationPhase(@Nullable String migrationPhase) {
            $.migrationPhase = migrationPhase;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder networkSecurityGroup(@Nullable NetworkSecurityGroupResponse networkSecurityGroup) {
            $.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder nicType(@Nullable String nicType) {
            $.nicType = nicType;
            return this;
        }

        public Builder primary(Boolean primary) {
            $.primary = primary;
            return this;
        }

        public Builder privateEndpoint(PrivateEndpointResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkService(@Nullable PrivateLinkServiceResponse privateLinkService) {
            $.privateLinkService = privateLinkService;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder resourceGuid(String resourceGuid) {
            $.resourceGuid = resourceGuid;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tapConfigurations(List<NetworkInterfaceTapConfigurationResponse> tapConfigurations) {
            $.tapConfigurations = tapConfigurations;
            return this;
        }

        public Builder tapConfigurations(NetworkInterfaceTapConfigurationResponse... tapConfigurations) {
            return tapConfigurations(List.of(tapConfigurations));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder virtualMachine(SubResourceResponse virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        public NetworkInterfaceResponse build() {
            $.dscpConfiguration = Objects.requireNonNull($.dscpConfiguration, "expected parameter 'dscpConfiguration' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.hostedWorkloads = Objects.requireNonNull($.hostedWorkloads, "expected parameter 'hostedWorkloads' to be non-null");
            $.macAddress = Objects.requireNonNull($.macAddress, "expected parameter 'macAddress' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.primary = Objects.requireNonNull($.primary, "expected parameter 'primary' to be non-null");
            $.privateEndpoint = Objects.requireNonNull($.privateEndpoint, "expected parameter 'privateEndpoint' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.resourceGuid = Objects.requireNonNull($.resourceGuid, "expected parameter 'resourceGuid' to be non-null");
            $.tapConfigurations = Objects.requireNonNull($.tapConfigurations, "expected parameter 'tapConfigurations' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.virtualMachine = Objects.requireNonNull($.virtualMachine, "expected parameter 'virtualMachine' to be non-null");
            return $;
        }
    }

}
