// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.awsnative.lightsail.inputs.InstanceMonthlyTransferArgs;
import com.pulumi.awsnative.lightsail.inputs.InstancePortArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Networking of the Instance.
 * 
 */
public final class InstanceNetworkingArgs extends ResourceArgs {

    public static final InstanceNetworkingArgs Empty = new InstanceNetworkingArgs();

    @Import(name="monthlyTransfer")
    private @Nullable Output<InstanceMonthlyTransferArgs> monthlyTransfer;

    public Optional<Output<InstanceMonthlyTransferArgs>> monthlyTransfer() {
        return Optional.ofNullable(this.monthlyTransfer);
    }

    /**
     * Ports to the Instance.
     * 
     */
    @Import(name="ports", required=true)
    private Output<List<InstancePortArgs>> ports;

    /**
     * @return Ports to the Instance.
     * 
     */
    public Output<List<InstancePortArgs>> ports() {
        return this.ports;
    }

    private InstanceNetworkingArgs() {}

    private InstanceNetworkingArgs(InstanceNetworkingArgs $) {
        this.monthlyTransfer = $.monthlyTransfer;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceNetworkingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceNetworkingArgs $;

        public Builder() {
            $ = new InstanceNetworkingArgs();
        }

        public Builder(InstanceNetworkingArgs defaults) {
            $ = new InstanceNetworkingArgs(Objects.requireNonNull(defaults));
        }

        public Builder monthlyTransfer(@Nullable Output<InstanceMonthlyTransferArgs> monthlyTransfer) {
            $.monthlyTransfer = monthlyTransfer;
            return this;
        }

        public Builder monthlyTransfer(InstanceMonthlyTransferArgs monthlyTransfer) {
            return monthlyTransfer(Output.of(monthlyTransfer));
        }

        /**
         * @param ports Ports to the Instance.
         * 
         * @return builder
         * 
         */
        public Builder ports(Output<List<InstancePortArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports Ports to the Instance.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<InstancePortArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports Ports to the Instance.
         * 
         * @return builder
         * 
         */
        public Builder ports(InstancePortArgs... ports) {
            return ports(List.of(ports));
        }

        public InstanceNetworkingArgs build() {
            $.ports = Objects.requireNonNull($.ports, "expected parameter 'ports' to be non-null");
            return $;
        }
    }

}
