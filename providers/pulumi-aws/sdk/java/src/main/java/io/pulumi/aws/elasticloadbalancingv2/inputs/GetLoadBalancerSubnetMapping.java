// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerSubnetMapping extends io.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerSubnetMapping Empty = new GetLoadBalancerSubnetMapping();

    @Import(name="allocationId", required=true)
      private final String allocationId;

    public String allocationId() {
        return this.allocationId;
    }

    @Import(name="ipv6Address", required=true)
      private final String ipv6Address;

    public String ipv6Address() {
        return this.ipv6Address;
    }

    @Import(name="outpostId", required=true)
      private final String outpostId;

    public String outpostId() {
        return this.outpostId;
    }

    @Import(name="privateIpv4Address", required=true)
      private final String privateIpv4Address;

    public String privateIpv4Address() {
        return this.privateIpv4Address;
    }

    @Import(name="subnetId", required=true)
      private final String subnetId;

    public String subnetId() {
        return this.subnetId;
    }

    public GetLoadBalancerSubnetMapping(
        String allocationId,
        String ipv6Address,
        String outpostId,
        String privateIpv4Address,
        String subnetId) {
        this.allocationId = Objects.requireNonNull(allocationId, "expected parameter 'allocationId' to be non-null");
        this.ipv6Address = Objects.requireNonNull(ipv6Address, "expected parameter 'ipv6Address' to be non-null");
        this.outpostId = Objects.requireNonNull(outpostId, "expected parameter 'outpostId' to be non-null");
        this.privateIpv4Address = Objects.requireNonNull(privateIpv4Address, "expected parameter 'privateIpv4Address' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private GetLoadBalancerSubnetMapping() {
        this.allocationId = null;
        this.ipv6Address = null;
        this.outpostId = null;
        this.privateIpv4Address = null;
        this.subnetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerSubnetMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationId;
        private String ipv6Address;
        private String outpostId;
        private String privateIpv4Address;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerSubnetMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.outpostId = defaults.outpostId;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        public Builder outpostId(String outpostId) {
            this.outpostId = Objects.requireNonNull(outpostId);
            return this;
        }
        public Builder privateIpv4Address(String privateIpv4Address) {
            this.privateIpv4Address = Objects.requireNonNull(privateIpv4Address);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public GetLoadBalancerSubnetMapping build() {
            return new GetLoadBalancerSubnetMapping(allocationId, ipv6Address, outpostId, privateIpv4Address, subnetId);
        }
    }
}
