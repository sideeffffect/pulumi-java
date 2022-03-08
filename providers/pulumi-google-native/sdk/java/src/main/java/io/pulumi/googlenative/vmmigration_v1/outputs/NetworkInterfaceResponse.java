// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkInterfaceResponse {
    /**
     * The external IP to define in the NIC.
     * 
     */
    private final String externalIp;
    /**
     * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
     * 
     */
    private final String internalIp;
    /**
     * The network to connect the NIC to.
     * 
     */
    private final String network;
    /**
     * The subnetwork to connect the NIC to.
     * 
     */
    private final String subnetwork;

    @OutputCustomType.Constructor({"externalIp","internalIp","network","subnetwork"})
    private NetworkInterfaceResponse(
        String externalIp,
        String internalIp,
        String network,
        String subnetwork) {
        this.externalIp = externalIp;
        this.internalIp = internalIp;
        this.network = network;
        this.subnetwork = subnetwork;
    }

    /**
     * The external IP to define in the NIC.
     * 
    */
    public String getExternalIp() {
        return this.externalIp;
    }
    /**
     * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
     * 
    */
    public String getInternalIp() {
        return this.internalIp;
    }
    /**
     * The network to connect the NIC to.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * The subnetwork to connect the NIC to.
     * 
    */
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIp;
        private String internalIp;
        private String network;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIp = defaults.externalIp;
    	      this.internalIp = defaults.internalIp;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setExternalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }

        public Builder setInternalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(externalIp, internalIp, network, subnetwork);
        }
    }
}
