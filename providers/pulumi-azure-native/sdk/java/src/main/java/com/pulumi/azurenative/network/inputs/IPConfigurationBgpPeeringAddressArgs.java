// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of IPConfigurationBgpPeeringAddress.
 * 
 */
public final class IPConfigurationBgpPeeringAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPConfigurationBgpPeeringAddressArgs Empty = new IPConfigurationBgpPeeringAddressArgs();

    /**
     * The list of custom BGP peering addresses which belong to IP configuration.
     * 
     */
    @Import(name="customBgpIpAddresses")
    private @Nullable Output<List<String>> customBgpIpAddresses;

    public Optional<Output<List<String>>> customBgpIpAddresses() {
        return Optional.ofNullable(this.customBgpIpAddresses);
    }

    /**
     * The ID of IP configuration which belongs to gateway.
     * 
     */
    @Import(name="ipconfigurationId")
    private @Nullable Output<String> ipconfigurationId;

    public Optional<Output<String>> ipconfigurationId() {
        return Optional.ofNullable(this.ipconfigurationId);
    }

    private IPConfigurationBgpPeeringAddressArgs() {}

    private IPConfigurationBgpPeeringAddressArgs(IPConfigurationBgpPeeringAddressArgs $) {
        this.customBgpIpAddresses = $.customBgpIpAddresses;
        this.ipconfigurationId = $.ipconfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPConfigurationBgpPeeringAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPConfigurationBgpPeeringAddressArgs $;

        public Builder() {
            $ = new IPConfigurationBgpPeeringAddressArgs();
        }

        public Builder(IPConfigurationBgpPeeringAddressArgs defaults) {
            $ = new IPConfigurationBgpPeeringAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder customBgpIpAddresses(@Nullable Output<List<String>> customBgpIpAddresses) {
            $.customBgpIpAddresses = customBgpIpAddresses;
            return this;
        }

        public Builder customBgpIpAddresses(List<String> customBgpIpAddresses) {
            return customBgpIpAddresses(Output.of(customBgpIpAddresses));
        }

        public Builder customBgpIpAddresses(String... customBgpIpAddresses) {
            return customBgpIpAddresses(List.of(customBgpIpAddresses));
        }

        public Builder ipconfigurationId(@Nullable Output<String> ipconfigurationId) {
            $.ipconfigurationId = ipconfigurationId;
            return this;
        }

        public Builder ipconfigurationId(String ipconfigurationId) {
            return ipconfigurationId(Output.of(ipconfigurationId));
        }

        public IPConfigurationBgpPeeringAddressArgs build() {
            return $;
        }
    }

}
