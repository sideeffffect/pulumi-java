// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.azurenative.hybridnetwork.enums.VMSwitchType;
import com.pulumi.azurenative.hybridnetwork.inputs.NetworkInterfaceIPConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network interface properties.
 * 
 */
public final class NetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * A list of IP configurations of the network interface.
     * 
     */
    @Import(name="ipConfigurations")
      private final @Nullable Output<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations;

    public Output<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations() {
        return this.ipConfigurations == null ? Codegen.empty() : this.ipConfigurations;
    }

    /**
     * The MAC address of the network interface.
     * 
     */
    @Import(name="macAddress")
      private final @Nullable Output<String> macAddress;

    public Output<String> macAddress() {
        return this.macAddress == null ? Codegen.empty() : this.macAddress;
    }

    /**
     * The name of the network interface.
     * 
     */
    @Import(name="networkInterfaceName")
      private final @Nullable Output<String> networkInterfaceName;

    public Output<String> networkInterfaceName() {
        return this.networkInterfaceName == null ? Codegen.empty() : this.networkInterfaceName;
    }

    /**
     * The type of the VM switch.
     * 
     */
    @Import(name="vmSwitchType")
      private final @Nullable Output<Either<String,VMSwitchType>> vmSwitchType;

    public Output<Either<String,VMSwitchType>> vmSwitchType() {
        return this.vmSwitchType == null ? Codegen.empty() : this.vmSwitchType;
    }

    public NetworkInterfaceArgs(
        @Nullable Output<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations,
        @Nullable Output<String> macAddress,
        @Nullable Output<String> networkInterfaceName,
        @Nullable Output<Either<String,VMSwitchType>> vmSwitchType) {
        this.ipConfigurations = ipConfigurations;
        this.macAddress = macAddress;
        this.networkInterfaceName = networkInterfaceName;
        this.vmSwitchType = vmSwitchType;
    }

    private NetworkInterfaceArgs() {
        this.ipConfigurations = Codegen.empty();
        this.macAddress = Codegen.empty();
        this.networkInterfaceName = Codegen.empty();
        this.vmSwitchType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations;
        private @Nullable Output<String> macAddress;
        private @Nullable Output<String> networkInterfaceName;
        private @Nullable Output<Either<String,VMSwitchType>> vmSwitchType;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.macAddress = defaults.macAddress;
    	      this.networkInterfaceName = defaults.networkInterfaceName;
    	      this.vmSwitchType = defaults.vmSwitchType;
        }

        public Builder ipConfigurations(@Nullable Output<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(@Nullable List<NetworkInterfaceIPConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Codegen.ofNullable(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(NetworkInterfaceIPConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder macAddress(@Nullable Output<String> macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public Builder macAddress(@Nullable String macAddress) {
            this.macAddress = Codegen.ofNullable(macAddress);
            return this;
        }
        public Builder networkInterfaceName(@Nullable Output<String> networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public Builder networkInterfaceName(@Nullable String networkInterfaceName) {
            this.networkInterfaceName = Codegen.ofNullable(networkInterfaceName);
            return this;
        }
        public Builder vmSwitchType(@Nullable Output<Either<String,VMSwitchType>> vmSwitchType) {
            this.vmSwitchType = vmSwitchType;
            return this;
        }
        public Builder vmSwitchType(@Nullable Either<String,VMSwitchType> vmSwitchType) {
            this.vmSwitchType = Codegen.ofNullable(vmSwitchType);
            return this;
        }        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(ipConfigurations, macAddress, networkInterfaceName, vmSwitchType);
        }
    }
}
