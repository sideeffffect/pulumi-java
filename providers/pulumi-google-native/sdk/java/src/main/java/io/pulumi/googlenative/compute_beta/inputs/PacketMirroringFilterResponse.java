// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PacketMirroringFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final PacketMirroringFilterResponse Empty = new PacketMirroringFilterResponse();

    /**
     * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    @InputImport(name="cidrRanges", required=true)
      private final List<String> cidrRanges;

    public List<String> getCidrRanges() {
        return this.cidrRanges;
    }

    /**
     * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
     * 
     */
    @InputImport(name="direction", required=true)
      private final String direction;

    public String getDirection() {
        return this.direction;
    }

    /**
     * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    @InputImport(name="ipProtocols", required=true)
      private final List<String> ipProtocols;

    public List<String> getIpProtocols() {
        return this.ipProtocols;
    }

    public PacketMirroringFilterResponse(
        List<String> cidrRanges,
        String direction,
        List<String> ipProtocols) {
        this.cidrRanges = Objects.requireNonNull(cidrRanges, "expected parameter 'cidrRanges' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.ipProtocols = Objects.requireNonNull(ipProtocols, "expected parameter 'ipProtocols' to be non-null");
    }

    private PacketMirroringFilterResponse() {
        this.cidrRanges = List.of();
        this.direction = null;
        this.ipProtocols = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> cidrRanges;
        private String direction;
        private List<String> ipProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrRanges = defaults.cidrRanges;
    	      this.direction = defaults.direction;
    	      this.ipProtocols = defaults.ipProtocols;
        }

        public Builder cidrRanges(List<String> cidrRanges) {
            this.cidrRanges = Objects.requireNonNull(cidrRanges);
            return this;
        }

        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder ipProtocols(List<String> ipProtocols) {
            this.ipProtocols = Objects.requireNonNull(ipProtocols);
            return this;
        }
        public PacketMirroringFilterResponse build() {
            return new PacketMirroringFilterResponse(cidrRanges, direction, ipProtocols);
        }
    }
}
