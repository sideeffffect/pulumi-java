// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The scope of networks allowed to be associated with the firewall policy. This field can be either GLOBAL_VPC_NETWORK or REGIONAL_VPC_NETWORK. A firewall policy with the VPC scope set to GLOBAL_VPC_NETWORK is allowed to be attached only to global networks. When the VPC scope is set to REGIONAL_VPC_NETWORK the firewall policy is allowed to be attached only to regional networks in the same scope as the firewall policy. Note: if not specified then GLOBAL_VPC_NETWORK will be used.
     * 
     */
    @EnumType
    public enum NetworkFirewallPolicyVpcNetworkScope {
        /**
         * The firewall policy is allowed to be attached only to global networks.
         * 
         */
        GlobalVpcNetwork("GLOBAL_VPC_NETWORK"),
        /**
         * The firewall policy is allowed to be attached only to regional networks in the same scope as the firewall policy. This option is applicable only to regional firewall policies.
         * 
         */
        RegionalVpcNetwork("REGIONAL_VPC_NETWORK");

        private final String value;

        NetworkFirewallPolicyVpcNetworkScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkFirewallPolicyVpcNetworkScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
