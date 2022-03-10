// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointAccessNetworkInterface {
    /**
     * The Availability Zone.
     * 
     */
    private final @Nullable String availabilityZone;
    /**
     * The network interface identifier.
     * 
     */
    private final @Nullable String networkInterfaceId;
    /**
     * The IPv4 address of the network interface within the subnet.
     * 
     */
    private final @Nullable String privateIpAddress;
    /**
     * The subnet identifier.
     * 
     */
    private final @Nullable String subnetId;

    @OutputCustomType.Constructor
    private EndpointAccessNetworkInterface(
        @OutputCustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @OutputCustomType.Parameter("networkInterfaceId") @Nullable String networkInterfaceId,
        @OutputCustomType.Parameter("privateIpAddress") @Nullable String privateIpAddress,
        @OutputCustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.availabilityZone = availabilityZone;
        this.networkInterfaceId = networkInterfaceId;
        this.privateIpAddress = privateIpAddress;
        this.subnetId = subnetId;
    }

    /**
     * The Availability Zone.
     * 
    */
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * The network interface identifier.
     * 
    */
    public Optional<String> getNetworkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }
    /**
     * The IPv4 address of the network interface within the subnet.
     * 
    */
    public Optional<String> getPrivateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * The subnet identifier.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAccessNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable String networkInterfaceId;
        private @Nullable String privateIpAddress;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAccessNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public EndpointAccessNetworkInterface build() {
            return new EndpointAccessNetworkInterface(availabilityZone, networkInterfaceId, privateIpAddress, subnetId);
        }
    }
}
