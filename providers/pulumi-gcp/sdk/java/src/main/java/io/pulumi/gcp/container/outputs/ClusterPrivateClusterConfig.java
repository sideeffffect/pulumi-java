// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.container.outputs.ClusterPrivateClusterConfigMasterGlobalAccessConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterPrivateClusterConfig {
    /**
     * When `true`, the cluster's private
     * endpoint is used as the cluster endpoint and access through the public endpoint
     * is disabled. When `false`, either endpoint can be used. This field only applies
     * to private clusters, when `enable_private_nodes` is `true`.
     * 
     */
    private final Boolean enablePrivateEndpoint;
    /**
     * Enables the private cluster feature,
     * creating a private endpoint on the cluster. In a private cluster, nodes only
     * have RFC 1918 private addresses and communicate with the master's private
     * endpoint via private networking.
     * 
     */
    private final @Nullable Boolean enablePrivateNodes;
    /**
     * Controls cluster master global
     * access settings. If unset, the provider will no longer manage this field and will
     * not modify the previously-set value. Structure is documented below.
     * 
     */
    private final @Nullable ClusterPrivateClusterConfigMasterGlobalAccessConfig masterGlobalAccessConfig;
    /**
     * The IP range in CIDR notation to use for
     * the hosted master network. This range will be used for assigning private IP
     * addresses to the cluster master(s) and the ILB VIP. This range must not overlap
     * with any other ranges in use within the cluster's network, and it must be a /28
     * subnet. See [Private Cluster Limitations](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters#req_res_lim)
     * for more details. This field only applies to private clusters, when
     * `enable_private_nodes` is `true`.
     * 
     */
    private final @Nullable String masterIpv4CidrBlock;
    /**
     * The name of the peering between this cluster and the Google owned VPC.
     * 
     */
    private final @Nullable String peeringName;
    /**
     * The internal IP address of this cluster's master endpoint.
     * 
     */
    private final @Nullable String privateEndpoint;
    /**
     * The external IP address of this cluster's master endpoint.
     * 
     */
    private final @Nullable String publicEndpoint;

    @CustomType.Constructor
    private ClusterPrivateClusterConfig(
        @CustomType.Parameter("enablePrivateEndpoint") Boolean enablePrivateEndpoint,
        @CustomType.Parameter("enablePrivateNodes") @Nullable Boolean enablePrivateNodes,
        @CustomType.Parameter("masterGlobalAccessConfig") @Nullable ClusterPrivateClusterConfigMasterGlobalAccessConfig masterGlobalAccessConfig,
        @CustomType.Parameter("masterIpv4CidrBlock") @Nullable String masterIpv4CidrBlock,
        @CustomType.Parameter("peeringName") @Nullable String peeringName,
        @CustomType.Parameter("privateEndpoint") @Nullable String privateEndpoint,
        @CustomType.Parameter("publicEndpoint") @Nullable String publicEndpoint) {
        this.enablePrivateEndpoint = enablePrivateEndpoint;
        this.enablePrivateNodes = enablePrivateNodes;
        this.masterGlobalAccessConfig = masterGlobalAccessConfig;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
        this.peeringName = peeringName;
        this.privateEndpoint = privateEndpoint;
        this.publicEndpoint = publicEndpoint;
    }

    /**
     * When `true`, the cluster's private
     * endpoint is used as the cluster endpoint and access through the public endpoint
     * is disabled. When `false`, either endpoint can be used. This field only applies
     * to private clusters, when `enable_private_nodes` is `true`.
     * 
    */
    public Boolean enablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }
    /**
     * Enables the private cluster feature,
     * creating a private endpoint on the cluster. In a private cluster, nodes only
     * have RFC 1918 private addresses and communicate with the master's private
     * endpoint via private networking.
     * 
    */
    public Optional<Boolean> enablePrivateNodes() {
        return Optional.ofNullable(this.enablePrivateNodes);
    }
    /**
     * Controls cluster master global
     * access settings. If unset, the provider will no longer manage this field and will
     * not modify the previously-set value. Structure is documented below.
     * 
    */
    public Optional<ClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfig() {
        return Optional.ofNullable(this.masterGlobalAccessConfig);
    }
    /**
     * The IP range in CIDR notation to use for
     * the hosted master network. This range will be used for assigning private IP
     * addresses to the cluster master(s) and the ILB VIP. This range must not overlap
     * with any other ranges in use within the cluster's network, and it must be a /28
     * subnet. See [Private Cluster Limitations](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters#req_res_lim)
     * for more details. This field only applies to private clusters, when
     * `enable_private_nodes` is `true`.
     * 
    */
    public Optional<String> masterIpv4CidrBlock() {
        return Optional.ofNullable(this.masterIpv4CidrBlock);
    }
    /**
     * The name of the peering between this cluster and the Google owned VPC.
     * 
    */
    public Optional<String> peeringName() {
        return Optional.ofNullable(this.peeringName);
    }
    /**
     * The internal IP address of this cluster's master endpoint.
     * 
    */
    public Optional<String> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * The external IP address of this cluster's master endpoint.
     * 
    */
    public Optional<String> publicEndpoint() {
        return Optional.ofNullable(this.publicEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterPrivateClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enablePrivateEndpoint;
        private @Nullable Boolean enablePrivateNodes;
        private @Nullable ClusterPrivateClusterConfigMasterGlobalAccessConfig masterGlobalAccessConfig;
        private @Nullable String masterIpv4CidrBlock;
        private @Nullable String peeringName;
        private @Nullable String privateEndpoint;
        private @Nullable String publicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterPrivateClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfig = defaults.masterGlobalAccessConfig;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.peeringName = defaults.peeringName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        public Builder enablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }
        public Builder enablePrivateNodes(@Nullable Boolean enablePrivateNodes) {
            this.enablePrivateNodes = enablePrivateNodes;
            return this;
        }
        public Builder masterGlobalAccessConfig(@Nullable ClusterPrivateClusterConfigMasterGlobalAccessConfig masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = masterGlobalAccessConfig;
            return this;
        }
        public Builder masterIpv4CidrBlock(@Nullable String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }
        public Builder peeringName(@Nullable String peeringName) {
            this.peeringName = peeringName;
            return this;
        }
        public Builder privateEndpoint(@Nullable String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder publicEndpoint(@Nullable String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }        public ClusterPrivateClusterConfig build() {
            return new ClusterPrivateClusterConfig(enablePrivateEndpoint, enablePrivateNodes, masterGlobalAccessConfig, masterIpv4CidrBlock, peeringName, privateEndpoint, publicEndpoint);
        }
    }
}
