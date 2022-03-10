// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for node pool-level network config.
 * 
 */
public final class NodeNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeNetworkConfigArgs Empty = new NodeNetworkConfigArgs();

    /**
     * Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @InputImport(name="createPodRange")
      private final @Nullable Input<Boolean> createPodRange;

    public Input<Boolean> getCreatePodRange() {
        return this.createPodRange == null ? Input.empty() : this.createPodRange;
    }

    /**
     * The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @InputImport(name="podIpv4CidrBlock")
      private final @Nullable Input<String> podIpv4CidrBlock;

    public Input<String> getPodIpv4CidrBlock() {
        return this.podIpv4CidrBlock == null ? Input.empty() : this.podIpv4CidrBlock;
    }

    /**
     * The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
     * 
     */
    @InputImport(name="podRange")
      private final @Nullable Input<String> podRange;

    public Input<String> getPodRange() {
        return this.podRange == null ? Input.empty() : this.podRange;
    }

    public NodeNetworkConfigArgs(
        @Nullable Input<Boolean> createPodRange,
        @Nullable Input<String> podIpv4CidrBlock,
        @Nullable Input<String> podRange) {
        this.createPodRange = createPodRange;
        this.podIpv4CidrBlock = podIpv4CidrBlock;
        this.podRange = podRange;
    }

    private NodeNetworkConfigArgs() {
        this.createPodRange = Input.empty();
        this.podIpv4CidrBlock = Input.empty();
        this.podRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> createPodRange;
        private @Nullable Input<String> podIpv4CidrBlock;
        private @Nullable Input<String> podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder createPodRange(@Nullable Input<Boolean> createPodRange) {
            this.createPodRange = createPodRange;
            return this;
        }

        public Builder createPodRange(@Nullable Boolean createPodRange) {
            this.createPodRange = Input.ofNullable(createPodRange);
            return this;
        }

        public Builder podIpv4CidrBlock(@Nullable Input<String> podIpv4CidrBlock) {
            this.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }

        public Builder podIpv4CidrBlock(@Nullable String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = Input.ofNullable(podIpv4CidrBlock);
            return this;
        }

        public Builder podRange(@Nullable Input<String> podRange) {
            this.podRange = podRange;
            return this;
        }

        public Builder podRange(@Nullable String podRange) {
            this.podRange = Input.ofNullable(podRange);
            return this;
        }
        public NodeNetworkConfigArgs build() {
            return new NodeNetworkConfigArgs(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}
