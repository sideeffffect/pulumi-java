// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.NicIPAddressSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NicIPSettingsResponse {
    /**
     * Gets or sets the nic allocation method.
     * 
     */
    private final @Nullable String allocationMethod;
    /**
     * Gets or sets the dns servers.
     * 
     */
    private final @Nullable List<String> dnsServers;
    /**
     * Gets or sets the gateway.
     * 
     */
    private final @Nullable List<String> gateway;
    /**
     * Gets or sets the ip address for the nic.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * Gets or sets the IP address information being reported for this NIC. This contains the same IPv4 information above plus IPV6 information.
     * 
     */
    private final List<NicIPAddressSettingsResponse> ipAddressInfo;
    /**
     * Gets or sets the primary server.
     * 
     */
    private final String primaryWinsServer;
    /**
     * Gets or sets the secondary server.
     * 
     */
    private final String secondaryWinsServer;
    /**
     * Gets or sets the mask.
     * 
     */
    private final @Nullable String subnetMask;

    @OutputCustomType.Constructor({"allocationMethod","dnsServers","gateway","ipAddress","ipAddressInfo","primaryWinsServer","secondaryWinsServer","subnetMask"})
    private NicIPSettingsResponse(
        @Nullable String allocationMethod,
        @Nullable List<String> dnsServers,
        @Nullable List<String> gateway,
        @Nullable String ipAddress,
        List<NicIPAddressSettingsResponse> ipAddressInfo,
        String primaryWinsServer,
        String secondaryWinsServer,
        @Nullable String subnetMask) {
        this.allocationMethod = allocationMethod;
        this.dnsServers = dnsServers;
        this.gateway = gateway;
        this.ipAddress = ipAddress;
        this.ipAddressInfo = ipAddressInfo;
        this.primaryWinsServer = primaryWinsServer;
        this.secondaryWinsServer = secondaryWinsServer;
        this.subnetMask = subnetMask;
    }

    /**
     * Gets or sets the nic allocation method.
     * 
    */
    public Optional<String> getAllocationMethod() {
        return Optional.ofNullable(this.allocationMethod);
    }
    /**
     * Gets or sets the dns servers.
     * 
    */
    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }
    /**
     * Gets or sets the gateway.
     * 
    */
    public List<String> getGateway() {
        return this.gateway == null ? List.of() : this.gateway;
    }
    /**
     * Gets or sets the ip address for the nic.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * Gets or sets the IP address information being reported for this NIC. This contains the same IPv4 information above plus IPV6 information.
     * 
    */
    public List<NicIPAddressSettingsResponse> getIpAddressInfo() {
        return this.ipAddressInfo;
    }
    /**
     * Gets or sets the primary server.
     * 
    */
    public String getPrimaryWinsServer() {
        return this.primaryWinsServer;
    }
    /**
     * Gets or sets the secondary server.
     * 
    */
    public String getSecondaryWinsServer() {
        return this.secondaryWinsServer;
    }
    /**
     * Gets or sets the mask.
     * 
    */
    public Optional<String> getSubnetMask() {
        return Optional.ofNullable(this.subnetMask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NicIPSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allocationMethod;
        private @Nullable List<String> dnsServers;
        private @Nullable List<String> gateway;
        private @Nullable String ipAddress;
        private List<NicIPAddressSettingsResponse> ipAddressInfo;
        private String primaryWinsServer;
        private String secondaryWinsServer;
        private @Nullable String subnetMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NicIPSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationMethod = defaults.allocationMethod;
    	      this.dnsServers = defaults.dnsServers;
    	      this.gateway = defaults.gateway;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAddressInfo = defaults.ipAddressInfo;
    	      this.primaryWinsServer = defaults.primaryWinsServer;
    	      this.secondaryWinsServer = defaults.secondaryWinsServer;
    	      this.subnetMask = defaults.subnetMask;
        }

        public Builder setAllocationMethod(@Nullable String allocationMethod) {
            this.allocationMethod = allocationMethod;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setGateway(@Nullable List<String> gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddressInfo(List<NicIPAddressSettingsResponse> ipAddressInfo) {
            this.ipAddressInfo = Objects.requireNonNull(ipAddressInfo);
            return this;
        }

        public Builder setPrimaryWinsServer(String primaryWinsServer) {
            this.primaryWinsServer = Objects.requireNonNull(primaryWinsServer);
            return this;
        }

        public Builder setSecondaryWinsServer(String secondaryWinsServer) {
            this.secondaryWinsServer = Objects.requireNonNull(secondaryWinsServer);
            return this;
        }

        public Builder setSubnetMask(@Nullable String subnetMask) {
            this.subnetMask = subnetMask;
            return this;
        }
        public NicIPSettingsResponse build() {
            return new NicIPSettingsResponse(allocationMethod, dnsServers, gateway, ipAddress, ipAddressInfo, primaryWinsServer, secondaryWinsServer, subnetMask);
        }
    }
}
