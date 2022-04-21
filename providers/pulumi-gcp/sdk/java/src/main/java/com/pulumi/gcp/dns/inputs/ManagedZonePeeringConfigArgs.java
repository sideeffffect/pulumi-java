// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigTargetNetworkArgs;
import java.util.Objects;


public final class ManagedZonePeeringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigArgs Empty = new ManagedZonePeeringConfigArgs();

    /**
     * The network with which to peer.
     * Structure is documented below.
     * 
     */
    @Import(name="targetNetwork", required=true)
    private Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork;

    public Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork() {
        return this.targetNetwork;
    }

    private ManagedZonePeeringConfigArgs() {}

    private ManagedZonePeeringConfigArgs(ManagedZonePeeringConfigArgs $) {
        this.targetNetwork = $.targetNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZonePeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZonePeeringConfigArgs $;

        public Builder() {
            $ = new ManagedZonePeeringConfigArgs();
        }

        public Builder(ManagedZonePeeringConfigArgs defaults) {
            $ = new ManagedZonePeeringConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder targetNetwork(Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork) {
            $.targetNetwork = targetNetwork;
            return this;
        }

        public Builder targetNetwork(ManagedZonePeeringConfigTargetNetworkArgs targetNetwork) {
            return targetNetwork(Output.of(targetNetwork));
        }

        public ManagedZonePeeringConfigArgs build() {
            $.targetNetwork = Objects.requireNonNull($.targetNetwork, "expected parameter 'targetNetwork' to be non-null");
            return $;
        }
    }

}
