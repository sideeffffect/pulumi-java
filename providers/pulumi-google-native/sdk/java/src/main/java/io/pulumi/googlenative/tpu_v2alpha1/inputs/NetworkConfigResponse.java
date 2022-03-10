// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Network related configurations.
 * 
 */
public final class NetworkConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkConfigResponse Empty = new NetworkConfigResponse();

    /**
     * Allows the TPU node to send and receive packets with non-matching destination or source IPs. This is required if you plan to use the TPU workers to forward routes.
     * 
     */
    @InputImport(name="canIpForward", required=true)
      private final Boolean canIpForward;

    public Boolean getCanIpForward() {
        return this.canIpForward;
    }

    /**
     * Indicates that external IP addresses would be associated with the TPU workers. If set to false, the specified subnetwork or network should have Private Google Access enabled.
     * 
     */
    @InputImport(name="enableExternalIps", required=true)
      private final Boolean enableExternalIps;

    public Boolean getEnableExternalIps() {
        return this.enableExternalIps;
    }

    /**
     * The name of the network for the TPU node. It must be a preexisting Google Compute Engine network. If none is provided, "default" will be used.
     * 
     */
    @InputImport(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    /**
     * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine subnetwork. If none is provided, "default" will be used.
     * 
     */
    @InputImport(name="subnetwork", required=true)
      private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    public NetworkConfigResponse(
        Boolean canIpForward,
        Boolean enableExternalIps,
        String network,
        String subnetwork) {
        this.canIpForward = Objects.requireNonNull(canIpForward, "expected parameter 'canIpForward' to be non-null");
        this.enableExternalIps = Objects.requireNonNull(enableExternalIps, "expected parameter 'enableExternalIps' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private NetworkConfigResponse() {
        this.canIpForward = null;
        this.enableExternalIps = null;
        this.network = null;
        this.subnetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canIpForward;
        private Boolean enableExternalIps;
        private String network;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.enableExternalIps = defaults.enableExternalIps;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder canIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }

        public Builder enableExternalIps(Boolean enableExternalIps) {
            this.enableExternalIps = Objects.requireNonNull(enableExternalIps);
            return this;
        }

        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(canIpForward, enableExternalIps, network, subnetwork);
        }
    }
}
