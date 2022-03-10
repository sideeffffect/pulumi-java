// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class NetworkInterfaceInstanceIpv6Address extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceInstanceIpv6Address Empty = new NetworkInterfaceInstanceIpv6Address();

    @InputImport(name="ipv6Address", required=true)
      private final String ipv6Address;

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public NetworkInterfaceInstanceIpv6Address(String ipv6Address) {
        this.ipv6Address = Objects.requireNonNull(ipv6Address, "expected parameter 'ipv6Address' to be non-null");
    }

    private NetworkInterfaceInstanceIpv6Address() {
        this.ipv6Address = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceInstanceIpv6Address defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipv6Address;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceInstanceIpv6Address defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6Address = defaults.ipv6Address;
        }

        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        public NetworkInterfaceInstanceIpv6Address build() {
            return new NetworkInterfaceInstanceIpv6Address(ipv6Address);
        }
    }
}
