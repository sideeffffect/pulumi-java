// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAclRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclRuleArgs Empty = new NetworkAclRuleArgs();

    /**
     * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
     * 
     */
    @Import(name="egress")
    private @Nullable Output<Boolean> egress;

    public Optional<Output<Boolean>> egress() {
        return Optional.ofNullable(this.egress);
    }

    /**
     * The from port to match.
     * 
     */
    @Import(name="fromPort")
    private @Nullable Output<Integer> fromPort;

    public Optional<Output<Integer>> fromPort() {
        return Optional.ofNullable(this.fromPort);
    }

    /**
     * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    @Import(name="icmpCode")
    private @Nullable Output<String> icmpCode;

    public Optional<Output<String>> icmpCode() {
        return Optional.ofNullable(this.icmpCode);
    }

    /**
     * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    @Import(name="icmpType")
    private @Nullable Output<String> icmpType;

    public Optional<Output<String>> icmpType() {
        return Optional.ofNullable(this.icmpType);
    }

    /**
     * The IPv6 CIDR block to allow or deny.
     * 
     */
    @Import(name="ipv6CidrBlock")
    private @Nullable Output<String> ipv6CidrBlock;

    public Optional<Output<String>> ipv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }

    /**
     * The ID of the network ACL.
     * 
     */
    @Import(name="networkAclId", required=true)
    private Output<String> networkAclId;

    public Output<String> networkAclId() {
        return this.networkAclId;
    }

    /**
     * The protocol. A value of -1 means all protocols.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
     * 
     */
    @Import(name="ruleAction", required=true)
    private Output<String> ruleAction;

    public Output<String> ruleAction() {
        return this.ruleAction;
    }

    /**
     * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
     * 
     */
    @Import(name="ruleNumber", required=true)
    private Output<Integer> ruleNumber;

    public Output<Integer> ruleNumber() {
        return this.ruleNumber;
    }

    /**
     * The to port to match.
     * 
     */
    @Import(name="toPort")
    private @Nullable Output<Integer> toPort;

    public Optional<Output<Integer>> toPort() {
        return Optional.ofNullable(this.toPort);
    }

    private NetworkAclRuleArgs() {}

    private NetworkAclRuleArgs(NetworkAclRuleArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.egress = $.egress;
        this.fromPort = $.fromPort;
        this.icmpCode = $.icmpCode;
        this.icmpType = $.icmpType;
        this.ipv6CidrBlock = $.ipv6CidrBlock;
        this.networkAclId = $.networkAclId;
        this.protocol = $.protocol;
        this.ruleAction = $.ruleAction;
        this.ruleNumber = $.ruleNumber;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclRuleArgs $;

        public Builder() {
            $ = new NetworkAclRuleArgs();
        }

        public Builder(NetworkAclRuleArgs defaults) {
            $ = new NetworkAclRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        public Builder egress(@Nullable Output<Boolean> egress) {
            $.egress = egress;
            return this;
        }

        public Builder egress(Boolean egress) {
            return egress(Output.of(egress));
        }

        public Builder fromPort(@Nullable Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        public Builder icmpCode(@Nullable Output<String> icmpCode) {
            $.icmpCode = icmpCode;
            return this;
        }

        public Builder icmpCode(String icmpCode) {
            return icmpCode(Output.of(icmpCode));
        }

        public Builder icmpType(@Nullable Output<String> icmpType) {
            $.icmpType = icmpType;
            return this;
        }

        public Builder icmpType(String icmpType) {
            return icmpType(Output.of(icmpType));
        }

        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            $.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            return ipv6CidrBlock(Output.of(ipv6CidrBlock));
        }

        public Builder networkAclId(Output<String> networkAclId) {
            $.networkAclId = networkAclId;
            return this;
        }

        public Builder networkAclId(String networkAclId) {
            return networkAclId(Output.of(networkAclId));
        }

        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder ruleAction(Output<String> ruleAction) {
            $.ruleAction = ruleAction;
            return this;
        }

        public Builder ruleAction(String ruleAction) {
            return ruleAction(Output.of(ruleAction));
        }

        public Builder ruleNumber(Output<Integer> ruleNumber) {
            $.ruleNumber = ruleNumber;
            return this;
        }

        public Builder ruleNumber(Integer ruleNumber) {
            return ruleNumber(Output.of(ruleNumber));
        }

        public Builder toPort(@Nullable Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public NetworkAclRuleArgs build() {
            $.networkAclId = Objects.requireNonNull($.networkAclId, "expected parameter 'networkAclId' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.ruleAction = Objects.requireNonNull($.ruleAction, "expected parameter 'ruleAction' to be non-null");
            $.ruleNumber = Objects.requireNonNull($.ruleNumber, "expected parameter 'ruleNumber' to be non-null");
            return $;
        }
    }

}
