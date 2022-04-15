// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InstancePublicPortsPortInfo {
    /**
     * Set of CIDR blocks.
     * 
     */
    private final @Nullable List<String> cidrs;
    /**
     * First port in a range of open ports on an instance.
     * 
     */
    private final Integer fromPort;
    /**
     * IP protocol name. Valid values are `tcp`, `all`, `udp`, and `icmp`.
     * 
     */
    private final String protocol;
    /**
     * Last port in a range of open ports on an instance.
     * 
     */
    private final Integer toPort;

    @CustomType.Constructor
    private InstancePublicPortsPortInfo(
        @CustomType.Parameter("cidrs") @Nullable List<String> cidrs,
        @CustomType.Parameter("fromPort") Integer fromPort,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("toPort") Integer toPort) {
        this.cidrs = cidrs;
        this.fromPort = fromPort;
        this.protocol = protocol;
        this.toPort = toPort;
    }

    /**
     * Set of CIDR blocks.
     * 
    */
    public List<String> cidrs() {
        return this.cidrs == null ? List.of() : this.cidrs;
    }
    /**
     * First port in a range of open ports on an instance.
     * 
    */
    public Integer fromPort() {
        return this.fromPort;
    }
    /**
     * IP protocol name. Valid values are `tcp`, `all`, `udp`, and `icmp`.
     * 
    */
    public String protocol() {
        return this.protocol;
    }
    /**
     * Last port in a range of open ports on an instance.
     * 
    */
    public Integer toPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePublicPortsPortInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cidrs;
        private Integer fromPort;
        private String protocol;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePublicPortsPortInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
    	      this.fromPort = defaults.fromPort;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder cidrs(@Nullable List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public Builder cidrs(String... cidrs) {
            return cidrs(List.of(cidrs));
        }
        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }        public InstancePublicPortsPortInfo build() {
            return new InstancePublicPortsPortInfo(cidrs, fromPort, protocol, toPort);
        }
    }
}
