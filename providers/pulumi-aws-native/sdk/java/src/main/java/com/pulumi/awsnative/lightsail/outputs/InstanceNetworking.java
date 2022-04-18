// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.outputs;

import com.pulumi.awsnative.lightsail.outputs.InstanceMonthlyTransfer;
import com.pulumi.awsnative.lightsail.outputs.InstancePort;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceNetworking {
    private final @Nullable InstanceMonthlyTransfer monthlyTransfer;
    /**
     * Ports to the Instance.
     * 
     */
    private final List<InstancePort> ports;

    @CustomType.Constructor
    private InstanceNetworking(
        @CustomType.Parameter("monthlyTransfer") @Nullable InstanceMonthlyTransfer monthlyTransfer,
        @CustomType.Parameter("ports") List<InstancePort> ports) {
        this.monthlyTransfer = monthlyTransfer;
        this.ports = ports;
    }

    public Optional<InstanceMonthlyTransfer> monthlyTransfer() {
        return Optional.ofNullable(this.monthlyTransfer);
    }
    /**
     * Ports to the Instance.
     * 
    */
    public List<InstancePort> ports() {
        return this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InstanceMonthlyTransfer monthlyTransfer;
        private List<InstancePort> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthlyTransfer = defaults.monthlyTransfer;
    	      this.ports = defaults.ports;
        }

        public Builder monthlyTransfer(@Nullable InstanceMonthlyTransfer monthlyTransfer) {
            this.monthlyTransfer = monthlyTransfer;
            return this;
        }
        public Builder ports(List<InstancePort> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(InstancePort... ports) {
            return ports(List.of(ports));
        }        public InstanceNetworking build() {
            return new InstanceNetworking(monthlyTransfer, ports);
        }
    }
}
