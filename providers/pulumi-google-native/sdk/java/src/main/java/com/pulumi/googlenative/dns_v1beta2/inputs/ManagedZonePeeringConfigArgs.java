// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1beta2.inputs.ManagedZonePeeringConfigTargetNetworkArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZonePeeringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigArgs Empty = new ManagedZonePeeringConfigArgs();

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The network with which to peer.
     * 
     */
    @Import(name="targetNetwork")
    private @Nullable Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork;

    public Optional<Output<ManagedZonePeeringConfigTargetNetworkArgs>> targetNetwork() {
        return Optional.ofNullable(this.targetNetwork);
    }

    private ManagedZonePeeringConfigArgs() {}

    private ManagedZonePeeringConfigArgs(ManagedZonePeeringConfigArgs $) {
        this.kind = $.kind;
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

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder targetNetwork(@Nullable Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork) {
            $.targetNetwork = targetNetwork;
            return this;
        }

        public Builder targetNetwork(ManagedZonePeeringConfigTargetNetworkArgs targetNetwork) {
            return targetNetwork(Output.of(targetNetwork));
        }

        public ManagedZonePeeringConfigArgs build() {
            return $;
        }
    }

}
