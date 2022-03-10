// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IpAddressResponse {
    /**
     * Specifies the IP address of the network interface.
     * 
     */
    private final @Nullable String ipAddress;

    @OutputCustomType.Constructor
    private IpAddressResponse(@OutputCustomType.Parameter("ipAddress") @Nullable String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Specifies the IP address of the network interface.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public IpAddressResponse build() {
            return new IpAddressResponse(ipAddress);
        }
    }
}
