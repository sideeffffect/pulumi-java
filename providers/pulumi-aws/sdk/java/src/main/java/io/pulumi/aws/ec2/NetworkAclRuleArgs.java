// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkAclRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkAclRuleArgs Empty = new NetworkAclRuleArgs();

    /**
     * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
     * 
     */
    @InputImport(name="cidrBlock")
      private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
     * 
     */
    @InputImport(name="egress")
      private final @Nullable Input<Boolean> egress;

    public Input<Boolean> getEgress() {
        return this.egress == null ? Input.empty() : this.egress;
    }

    /**
     * The from port to match.
     * 
     */
    @InputImport(name="fromPort")
      private final @Nullable Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort == null ? Input.empty() : this.fromPort;
    }

    /**
     * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    @InputImport(name="icmpCode")
      private final @Nullable Input<String> icmpCode;

    public Input<String> getIcmpCode() {
        return this.icmpCode == null ? Input.empty() : this.icmpCode;
    }

    /**
     * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    @InputImport(name="icmpType")
      private final @Nullable Input<String> icmpType;

    public Input<String> getIcmpType() {
        return this.icmpType == null ? Input.empty() : this.icmpType;
    }

    /**
     * The IPv6 CIDR block to allow or deny.
     * 
     */
    @InputImport(name="ipv6CidrBlock")
      private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

    /**
     * The ID of the network ACL.
     * 
     */
    @InputImport(name="networkAclId", required=true)
      private final Input<String> networkAclId;

    public Input<String> getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * The protocol. A value of -1 means all protocols.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    /**
     * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
     * 
     */
    @InputImport(name="ruleAction", required=true)
      private final Input<String> ruleAction;

    public Input<String> getRuleAction() {
        return this.ruleAction;
    }

    /**
     * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
     * 
     */
    @InputImport(name="ruleNumber", required=true)
      private final Input<Integer> ruleNumber;

    public Input<Integer> getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * The to port to match.
     * 
     */
    @InputImport(name="toPort")
      private final @Nullable Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort == null ? Input.empty() : this.toPort;
    }

    public NetworkAclRuleArgs(
        @Nullable Input<String> cidrBlock,
        @Nullable Input<Boolean> egress,
        @Nullable Input<Integer> fromPort,
        @Nullable Input<String> icmpCode,
        @Nullable Input<String> icmpType,
        @Nullable Input<String> ipv6CidrBlock,
        Input<String> networkAclId,
        Input<String> protocol,
        Input<String> ruleAction,
        Input<Integer> ruleNumber,
        @Nullable Input<Integer> toPort) {
        this.cidrBlock = cidrBlock;
        this.egress = egress;
        this.fromPort = fromPort;
        this.icmpCode = icmpCode;
        this.icmpType = icmpType;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.networkAclId = Objects.requireNonNull(networkAclId, "expected parameter 'networkAclId' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.ruleAction = Objects.requireNonNull(ruleAction, "expected parameter 'ruleAction' to be non-null");
        this.ruleNumber = Objects.requireNonNull(ruleNumber, "expected parameter 'ruleNumber' to be non-null");
        this.toPort = toPort;
    }

    private NetworkAclRuleArgs() {
        this.cidrBlock = Input.empty();
        this.egress = Input.empty();
        this.fromPort = Input.empty();
        this.icmpCode = Input.empty();
        this.icmpType = Input.empty();
        this.ipv6CidrBlock = Input.empty();
        this.networkAclId = Input.empty();
        this.protocol = Input.empty();
        this.ruleAction = Input.empty();
        this.ruleNumber = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAclRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<Boolean> egress;
        private @Nullable Input<Integer> fromPort;
        private @Nullable Input<String> icmpCode;
        private @Nullable Input<String> icmpType;
        private @Nullable Input<String> ipv6CidrBlock;
        private Input<String> networkAclId;
        private Input<String> protocol;
        private Input<String> ruleAction;
        private Input<Integer> ruleNumber;
        private @Nullable Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkAclRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.egress = defaults.egress;
    	      this.fromPort = defaults.fromPort;
    	      this.icmpCode = defaults.icmpCode;
    	      this.icmpType = defaults.icmpType;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.networkAclId = defaults.networkAclId;
    	      this.protocol = defaults.protocol;
    	      this.ruleAction = defaults.ruleAction;
    	      this.ruleNumber = defaults.ruleNumber;
    	      this.toPort = defaults.toPort;
        }

        public Builder cidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder egress(@Nullable Input<Boolean> egress) {
            this.egress = egress;
            return this;
        }

        public Builder egress(@Nullable Boolean egress) {
            this.egress = Input.ofNullable(egress);
            return this;
        }

        public Builder fromPort(@Nullable Input<Integer> fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        public Builder fromPort(@Nullable Integer fromPort) {
            this.fromPort = Input.ofNullable(fromPort);
            return this;
        }

        public Builder icmpCode(@Nullable Input<String> icmpCode) {
            this.icmpCode = icmpCode;
            return this;
        }

        public Builder icmpCode(@Nullable String icmpCode) {
            this.icmpCode = Input.ofNullable(icmpCode);
            return this;
        }

        public Builder icmpType(@Nullable Input<String> icmpType) {
            this.icmpType = icmpType;
            return this;
        }

        public Builder icmpType(@Nullable String icmpType) {
            this.icmpType = Input.ofNullable(icmpType);
            return this;
        }

        public Builder ipv6CidrBlock(@Nullable Input<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Input.ofNullable(ipv6CidrBlock);
            return this;
        }

        public Builder networkAclId(Input<String> networkAclId) {
            this.networkAclId = Objects.requireNonNull(networkAclId);
            return this;
        }

        public Builder networkAclId(String networkAclId) {
            this.networkAclId = Input.of(Objects.requireNonNull(networkAclId));
            return this;
        }

        public Builder protocol(Input<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder ruleAction(Input<String> ruleAction) {
            this.ruleAction = Objects.requireNonNull(ruleAction);
            return this;
        }

        public Builder ruleAction(String ruleAction) {
            this.ruleAction = Input.of(Objects.requireNonNull(ruleAction));
            return this;
        }

        public Builder ruleNumber(Input<Integer> ruleNumber) {
            this.ruleNumber = Objects.requireNonNull(ruleNumber);
            return this;
        }

        public Builder ruleNumber(Integer ruleNumber) {
            this.ruleNumber = Input.of(Objects.requireNonNull(ruleNumber));
            return this;
        }

        public Builder toPort(@Nullable Input<Integer> toPort) {
            this.toPort = toPort;
            return this;
        }

        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = Input.ofNullable(toPort);
            return this;
        }
        public NetworkAclRuleArgs build() {
            return new NetworkAclRuleArgs(cidrBlock, egress, fromPort, icmpCode, icmpType, ipv6CidrBlock, networkAclId, protocol, ruleAction, ruleNumber, toPort);
        }
    }
}
