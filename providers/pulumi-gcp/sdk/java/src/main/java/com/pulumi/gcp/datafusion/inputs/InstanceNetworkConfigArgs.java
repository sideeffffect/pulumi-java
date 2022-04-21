// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datafusion.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkConfigArgs Empty = new InstanceNetworkConfigArgs();

    /**
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the Data Fusion instance network.
     * 
     */
    @Import(name="ipAllocation", required=true)
    private Output<String> ipAllocation;

    public Output<String> ipAllocation() {
        return this.ipAllocation;
    }

    /**
     * Name of the network in the project with which the tenant project
     * will be peered for executing pipelines. In case of shared VPC where the network resides in another host
     * project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    public Output<String> network() {
        return this.network;
    }

    private InstanceNetworkConfigArgs() {}

    private InstanceNetworkConfigArgs(InstanceNetworkConfigArgs $) {
        this.ipAllocation = $.ipAllocation;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceNetworkConfigArgs $;

        public Builder() {
            $ = new InstanceNetworkConfigArgs();
        }

        public Builder(InstanceNetworkConfigArgs defaults) {
            $ = new InstanceNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAllocation(Output<String> ipAllocation) {
            $.ipAllocation = ipAllocation;
            return this;
        }

        public Builder ipAllocation(String ipAllocation) {
            return ipAllocation(Output.of(ipAllocation));
        }

        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public InstanceNetworkConfigArgs build() {
            $.ipAllocation = Objects.requireNonNull($.ipAllocation, "expected parameter 'ipAllocation' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}
