// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Guest OS nic customization
 * 
 */
public final class GuestOSNICCustomizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestOSNICCustomizationArgs Empty = new GuestOSNICCustomizationArgs();

    /**
     * IP address allocation method
     * 
     */
    @InputImport(name="allocation")
      private final @Nullable Input<String> allocation;

    public Input<String> getAllocation() {
        return this.allocation == null ? Input.empty() : this.allocation;
    }

    /**
     * List of dns servers to use
     * 
     */
    @InputImport(name="dnsServers")
      private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    /**
     * Gateway addresses assigned to nic
     * 
     */
    @InputImport(name="gateway")
      private final @Nullable Input<List<String>> gateway;

    public Input<List<String>> getGateway() {
        return this.gateway == null ? Input.empty() : this.gateway;
    }

    /**
     * Static ip address for nic
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * Network mask for nic
     * 
     */
    @InputImport(name="mask")
      private final @Nullable Input<String> mask;

    public Input<String> getMask() {
        return this.mask == null ? Input.empty() : this.mask;
    }

    /**
     * primary WINS server for Windows
     * 
     */
    @InputImport(name="primaryWinsServer")
      private final @Nullable Input<String> primaryWinsServer;

    public Input<String> getPrimaryWinsServer() {
        return this.primaryWinsServer == null ? Input.empty() : this.primaryWinsServer;
    }

    /**
     * secondary WINS server for Windows
     * 
     */
    @InputImport(name="secondaryWinsServer")
      private final @Nullable Input<String> secondaryWinsServer;

    public Input<String> getSecondaryWinsServer() {
        return this.secondaryWinsServer == null ? Input.empty() : this.secondaryWinsServer;
    }

    public GuestOSNICCustomizationArgs(
        @Nullable Input<String> allocation,
        @Nullable Input<List<String>> dnsServers,
        @Nullable Input<List<String>> gateway,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> mask,
        @Nullable Input<String> primaryWinsServer,
        @Nullable Input<String> secondaryWinsServer) {
        this.allocation = allocation;
        this.dnsServers = dnsServers;
        this.gateway = gateway;
        this.ipAddress = ipAddress;
        this.mask = mask;
        this.primaryWinsServer = primaryWinsServer;
        this.secondaryWinsServer = secondaryWinsServer;
    }

    private GuestOSNICCustomizationArgs() {
        this.allocation = Input.empty();
        this.dnsServers = Input.empty();
        this.gateway = Input.empty();
        this.ipAddress = Input.empty();
        this.mask = Input.empty();
        this.primaryWinsServer = Input.empty();
        this.secondaryWinsServer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOSNICCustomizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allocation;
        private @Nullable Input<List<String>> dnsServers;
        private @Nullable Input<List<String>> gateway;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> mask;
        private @Nullable Input<String> primaryWinsServer;
        private @Nullable Input<String> secondaryWinsServer;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOSNICCustomizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocation = defaults.allocation;
    	      this.dnsServers = defaults.dnsServers;
    	      this.gateway = defaults.gateway;
    	      this.ipAddress = defaults.ipAddress;
    	      this.mask = defaults.mask;
    	      this.primaryWinsServer = defaults.primaryWinsServer;
    	      this.secondaryWinsServer = defaults.secondaryWinsServer;
        }

        public Builder allocation(@Nullable Input<String> allocation) {
            this.allocation = allocation;
            return this;
        }

        public Builder allocation(@Nullable String allocation) {
            this.allocation = Input.ofNullable(allocation);
            return this;
        }

        public Builder dnsServers(@Nullable Input<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }

        public Builder gateway(@Nullable Input<List<String>> gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder gateway(@Nullable List<String> gateway) {
            this.gateway = Input.ofNullable(gateway);
            return this;
        }

        public Builder ipAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder mask(@Nullable Input<String> mask) {
            this.mask = mask;
            return this;
        }

        public Builder mask(@Nullable String mask) {
            this.mask = Input.ofNullable(mask);
            return this;
        }

        public Builder primaryWinsServer(@Nullable Input<String> primaryWinsServer) {
            this.primaryWinsServer = primaryWinsServer;
            return this;
        }

        public Builder primaryWinsServer(@Nullable String primaryWinsServer) {
            this.primaryWinsServer = Input.ofNullable(primaryWinsServer);
            return this;
        }

        public Builder secondaryWinsServer(@Nullable Input<String> secondaryWinsServer) {
            this.secondaryWinsServer = secondaryWinsServer;
            return this;
        }

        public Builder secondaryWinsServer(@Nullable String secondaryWinsServer) {
            this.secondaryWinsServer = Input.ofNullable(secondaryWinsServer);
            return this;
        }
        public GuestOSNICCustomizationArgs build() {
            return new GuestOSNICCustomizationArgs(allocation, dnsServers, gateway, ipAddress, mask, primaryWinsServer, secondaryWinsServer);
        }
    }
}
