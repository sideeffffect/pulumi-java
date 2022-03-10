// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FleetEc2InboundPermission {
    /**
     * Starting value for a range of allowed port numbers.
     * 
     */
    private final Integer fromPort;
    /**
     * Range of allowed IP addresses expressed in CIDR notationE.g., `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
     * 
     */
    private final String ipRange;
    /**
     * Network communication protocol used by the fleetE.g., `TCP` or `UDP`
     * 
     */
    private final String protocol;
    /**
     * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `from_port`.
     * 
     */
    private final Integer toPort;

    @OutputCustomType.Constructor
    private FleetEc2InboundPermission(
        @OutputCustomType.Parameter("fromPort") Integer fromPort,
        @OutputCustomType.Parameter("ipRange") String ipRange,
        @OutputCustomType.Parameter("protocol") String protocol,
        @OutputCustomType.Parameter("toPort") Integer toPort) {
        this.fromPort = fromPort;
        this.ipRange = ipRange;
        this.protocol = protocol;
        this.toPort = toPort;
    }

    /**
     * Starting value for a range of allowed port numbers.
     * 
    */
    public Integer getFromPort() {
        return this.fromPort;
    }
    /**
     * Range of allowed IP addresses expressed in CIDR notationE.g., `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
     * 
    */
    public String getIpRange() {
        return this.ipRange;
    }
    /**
     * Network communication protocol used by the fleetE.g., `TCP` or `UDP`
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `from_port`.
     * 
    */
    public Integer getToPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetEc2InboundPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private String ipRange;
        private String protocol;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetEc2InboundPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.ipRange = defaults.ipRange;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public FleetEc2InboundPermission build() {
            return new FleetEc2InboundPermission(fromPort, ipRange, protocol, toPort);
        }
    }
}
