// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpokeLinkedRouterApplianceInstancesInstance {
    /**
     * The IP address on the VM to use for peering.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The URI of the virtual machine resource
     * 
     */
    private final @Nullable String virtualMachine;

    @CustomType.Constructor
    private SpokeLinkedRouterApplianceInstancesInstance(
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("virtualMachine") @Nullable String virtualMachine) {
        this.ipAddress = ipAddress;
        this.virtualMachine = virtualMachine;
    }

    /**
     * The IP address on the VM to use for peering.
     * 
    */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The URI of the virtual machine resource
     * 
    */
    public Optional<String> virtualMachine() {
        return Optional.ofNullable(this.virtualMachine);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedRouterApplianceInstancesInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable String virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedRouterApplianceInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder virtualMachine(@Nullable String virtualMachine) {
            this.virtualMachine = virtualMachine;
            return this;
        }        public SpokeLinkedRouterApplianceInstancesInstance build() {
            return new SpokeLinkedRouterApplianceInstancesInstance(ipAddress, virtualMachine);
        }
    }
}
