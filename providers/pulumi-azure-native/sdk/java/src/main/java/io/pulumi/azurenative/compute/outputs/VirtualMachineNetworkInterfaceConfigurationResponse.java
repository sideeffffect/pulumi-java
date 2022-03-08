// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineNetworkInterfaceIPConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineNetworkInterfaceConfigurationResponse {
    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    private final @Nullable String deleteOption;
    /**
     * The dns settings to be applied on the network interfaces.
     * 
     */
    private final @Nullable VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse dnsSettings;
    private final @Nullable SubResourceResponse dscpConfiguration;
    /**
     * Specifies whether the network interface is accelerated networking-enabled.
     * 
     */
    private final @Nullable Boolean enableAcceleratedNetworking;
    /**
     * Specifies whether the network interface is FPGA networking-enabled.
     * 
     */
    private final @Nullable Boolean enableFpga;
    /**
     * Whether IP forwarding enabled on this NIC.
     * 
     */
    private final @Nullable Boolean enableIPForwarding;
    /**
     * Specifies the IP configurations of the network interface.
     * 
     */
    private final List<VirtualMachineNetworkInterfaceIPConfigurationResponse> ipConfigurations;
    /**
     * The network interface configuration name.
     * 
     */
    private final String name;
    /**
     * The network security group.
     * 
     */
    private final @Nullable SubResourceResponse networkSecurityGroup;
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    private final @Nullable Boolean primary;

    @OutputCustomType.Constructor({"deleteOption","dnsSettings","dscpConfiguration","enableAcceleratedNetworking","enableFpga","enableIPForwarding","ipConfigurations","name","networkSecurityGroup","primary"})
    private VirtualMachineNetworkInterfaceConfigurationResponse(
        @Nullable String deleteOption,
        @Nullable VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse dnsSettings,
        @Nullable SubResourceResponse dscpConfiguration,
        @Nullable Boolean enableAcceleratedNetworking,
        @Nullable Boolean enableFpga,
        @Nullable Boolean enableIPForwarding,
        List<VirtualMachineNetworkInterfaceIPConfigurationResponse> ipConfigurations,
        String name,
        @Nullable SubResourceResponse networkSecurityGroup,
        @Nullable Boolean primary) {
        this.deleteOption = deleteOption;
        this.dnsSettings = dnsSettings;
        this.dscpConfiguration = dscpConfiguration;
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        this.enableFpga = enableFpga;
        this.enableIPForwarding = enableIPForwarding;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
        this.networkSecurityGroup = networkSecurityGroup;
        this.primary = primary;
    }

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
    */
    public Optional<String> getDeleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }
    /**
     * The dns settings to be applied on the network interfaces.
     * 
    */
    public Optional<VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse> getDnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    public Optional<SubResourceResponse> getDscpConfiguration() {
        return Optional.ofNullable(this.dscpConfiguration);
    }
    /**
     * Specifies whether the network interface is accelerated networking-enabled.
     * 
    */
    public Optional<Boolean> getEnableAcceleratedNetworking() {
        return Optional.ofNullable(this.enableAcceleratedNetworking);
    }
    /**
     * Specifies whether the network interface is FPGA networking-enabled.
     * 
    */
    public Optional<Boolean> getEnableFpga() {
        return Optional.ofNullable(this.enableFpga);
    }
    /**
     * Whether IP forwarding enabled on this NIC.
     * 
    */
    public Optional<Boolean> getEnableIPForwarding() {
        return Optional.ofNullable(this.enableIPForwarding);
    }
    /**
     * Specifies the IP configurations of the network interface.
     * 
    */
    public List<VirtualMachineNetworkInterfaceIPConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * The network interface configuration name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The network security group.
     * 
    */
    public Optional<SubResourceResponse> getNetworkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
    */
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineNetworkInterfaceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteOption;
        private @Nullable VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse dnsSettings;
        private @Nullable SubResourceResponse dscpConfiguration;
        private @Nullable Boolean enableAcceleratedNetworking;
        private @Nullable Boolean enableFpga;
        private @Nullable Boolean enableIPForwarding;
        private List<VirtualMachineNetworkInterfaceIPConfigurationResponse> ipConfigurations;
        private String name;
        private @Nullable SubResourceResponse networkSecurityGroup;
        private @Nullable Boolean primary;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineNetworkInterfaceConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.dscpConfiguration = defaults.dscpConfiguration;
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.enableFpga = defaults.enableFpga;
    	      this.enableIPForwarding = defaults.enableIPForwarding;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
    	      this.primary = defaults.primary;
        }

        public Builder setDeleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder setDnsSettings(@Nullable VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setDscpConfiguration(@Nullable SubResourceResponse dscpConfiguration) {
            this.dscpConfiguration = dscpConfiguration;
            return this;
        }

        public Builder setEnableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }

        public Builder setEnableFpga(@Nullable Boolean enableFpga) {
            this.enableFpga = enableFpga;
            return this;
        }

        public Builder setEnableIPForwarding(@Nullable Boolean enableIPForwarding) {
            this.enableIPForwarding = enableIPForwarding;
            return this;
        }

        public Builder setIpConfigurations(List<VirtualMachineNetworkInterfaceIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkSecurityGroup(@Nullable SubResourceResponse networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        public VirtualMachineNetworkInterfaceConfigurationResponse build() {
            return new VirtualMachineNetworkInterfaceConfigurationResponse(deleteOption, dnsSettings, dscpConfiguration, enableAcceleratedNetworking, enableFpga, enableIPForwarding, ipConfigurations, name, networkSecurityGroup, primary);
        }
    }
}
