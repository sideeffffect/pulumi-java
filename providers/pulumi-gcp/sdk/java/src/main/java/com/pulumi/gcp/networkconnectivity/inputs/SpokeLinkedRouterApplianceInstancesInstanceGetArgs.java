// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpokeLinkedRouterApplianceInstancesInstanceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpokeLinkedRouterApplianceInstancesInstanceGetArgs Empty = new SpokeLinkedRouterApplianceInstancesInstanceGetArgs();

    /**
     * The IP address on the VM to use for peering.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The URI of the virtual machine resource
     * 
     */
    @Import(name="virtualMachine")
    private @Nullable Output<String> virtualMachine;

    public Optional<Output<String>> virtualMachine() {
        return Optional.ofNullable(this.virtualMachine);
    }

    private SpokeLinkedRouterApplianceInstancesInstanceGetArgs() {}

    private SpokeLinkedRouterApplianceInstancesInstanceGetArgs(SpokeLinkedRouterApplianceInstancesInstanceGetArgs $) {
        this.ipAddress = $.ipAddress;
        this.virtualMachine = $.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpokeLinkedRouterApplianceInstancesInstanceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpokeLinkedRouterApplianceInstancesInstanceGetArgs $;

        public Builder() {
            $ = new SpokeLinkedRouterApplianceInstancesInstanceGetArgs();
        }

        public Builder(SpokeLinkedRouterApplianceInstancesInstanceGetArgs defaults) {
            $ = new SpokeLinkedRouterApplianceInstancesInstanceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder virtualMachine(@Nullable Output<String> virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        public Builder virtualMachine(String virtualMachine) {
            return virtualMachine(Output.of(virtualMachine));
        }

        public SpokeLinkedRouterApplianceInstancesInstanceGetArgs build() {
            return $;
        }
    }

}
