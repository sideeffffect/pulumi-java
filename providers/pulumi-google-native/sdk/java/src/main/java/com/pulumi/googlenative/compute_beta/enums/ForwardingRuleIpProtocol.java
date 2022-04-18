// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The IP protocol to which this rule applies. For protocol forwarding, valid options are TCP, UDP, ESP, AH, SCTP, ICMP and L3_DEFAULT. The valid IP protocols are different for different load balancing products as described in [Load balancing features](https://cloud.google.com/load-balancing/docs/features#protocols_from_the_load_balancer_to_the_backends).
     * 
     */
    @EnumType
    public enum ForwardingRuleIpProtocol {
        Ah("AH"),
        Esp("ESP"),
        Icmp("ICMP"),
        L3Default("L3_DEFAULT"),
        Sctp("SCTP"),
        Tcp("TCP"),
        Udp("UDP");

        private final String value;

        ForwardingRuleIpProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ForwardingRuleIpProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
