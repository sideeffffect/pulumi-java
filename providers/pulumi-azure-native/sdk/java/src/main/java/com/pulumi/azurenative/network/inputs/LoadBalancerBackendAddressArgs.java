// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Load balancer backend addresses.
 * 
 */
public final class LoadBalancerBackendAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerBackendAddressArgs Empty = new LoadBalancerBackendAddressArgs();

    /**
     * IP Address belonging to the referenced virtual network.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Reference to the frontend ip address configuration defined in regional loadbalancer.
     * 
     */
    @Import(name="loadBalancerFrontendIPConfiguration")
    private @Nullable Output<SubResourceArgs> loadBalancerFrontendIPConfiguration;

    public Optional<Output<SubResourceArgs>> loadBalancerFrontendIPConfiguration() {
        return Optional.ofNullable(this.loadBalancerFrontendIPConfiguration);
    }

    /**
     * Name of the backend address.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Reference to an existing subnet.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<SubResourceArgs> subnet;

    public Optional<Output<SubResourceArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * Reference to an existing virtual network.
     * 
     */
    @Import(name="virtualNetwork")
    private @Nullable Output<SubResourceArgs> virtualNetwork;

    public Optional<Output<SubResourceArgs>> virtualNetwork() {
        return Optional.ofNullable(this.virtualNetwork);
    }

    private LoadBalancerBackendAddressArgs() {}

    private LoadBalancerBackendAddressArgs(LoadBalancerBackendAddressArgs $) {
        this.ipAddress = $.ipAddress;
        this.loadBalancerFrontendIPConfiguration = $.loadBalancerFrontendIPConfiguration;
        this.name = $.name;
        this.subnet = $.subnet;
        this.virtualNetwork = $.virtualNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerBackendAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerBackendAddressArgs $;

        public Builder() {
            $ = new LoadBalancerBackendAddressArgs();
        }

        public Builder(LoadBalancerBackendAddressArgs defaults) {
            $ = new LoadBalancerBackendAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder loadBalancerFrontendIPConfiguration(@Nullable Output<SubResourceArgs> loadBalancerFrontendIPConfiguration) {
            $.loadBalancerFrontendIPConfiguration = loadBalancerFrontendIPConfiguration;
            return this;
        }

        public Builder loadBalancerFrontendIPConfiguration(SubResourceArgs loadBalancerFrontendIPConfiguration) {
            return loadBalancerFrontendIPConfiguration(Output.of(loadBalancerFrontendIPConfiguration));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder subnet(@Nullable Output<SubResourceArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder subnet(SubResourceArgs subnet) {
            return subnet(Output.of(subnet));
        }

        public Builder virtualNetwork(@Nullable Output<SubResourceArgs> virtualNetwork) {
            $.virtualNetwork = virtualNetwork;
            return this;
        }

        public Builder virtualNetwork(SubResourceArgs virtualNetwork) {
            return virtualNetwork(Output.of(virtualNetwork));
        }

        public LoadBalancerBackendAddressArgs build() {
            return $;
        }
    }

}
