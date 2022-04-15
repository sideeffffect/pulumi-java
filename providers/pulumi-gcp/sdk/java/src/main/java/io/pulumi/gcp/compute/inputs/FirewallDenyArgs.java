// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallDenyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallDenyArgs Empty = new FirewallDenyArgs();

    /**
     * An optional list of ports to which this rule applies. This field
     * is only applicable for UDP or TCP protocol. Each entry must be
     * either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     * Example inputs include: ["22"], ["80","443"], and
     * ["12345-12349"].
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<String>> ports;

    public Output<List<String>> ports() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    /**
     * The IP protocol to which this rule applies. The protocol type is
     * required when creating a firewall rule. This value can either be
     * one of the following well known protocol strings (tcp, udp,
     * icmp, esp, ah, sctp, ipip, all), or the IP protocol number.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    public FirewallDenyArgs(
        @Nullable Output<List<String>> ports,
        Output<String> protocol) {
        this.ports = ports;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private FirewallDenyArgs() {
        this.ports = Codegen.empty();
        this.protocol = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallDenyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> ports;
        private Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallDenyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
    	      this.protocol = defaults.protocol;
        }

        public Builder ports(@Nullable Output<List<String>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<String> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }
        public Builder protocol(Output<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }        public FirewallDenyArgs build() {
            return new FirewallDenyArgs(ports, protocol);
        }
    }
}
