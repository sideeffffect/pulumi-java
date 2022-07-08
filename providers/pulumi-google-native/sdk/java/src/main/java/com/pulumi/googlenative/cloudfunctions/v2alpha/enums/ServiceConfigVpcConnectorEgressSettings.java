// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v2alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    @EnumType
    public enum ServiceConfigVpcConnectorEgressSettings {
        /**
         * Unspecified.
         * 
         */
        VpcConnectorEgressSettingsUnspecified("VPC_CONNECTOR_EGRESS_SETTINGS_UNSPECIFIED"),
        /**
         * Use the VPC Access Connector only for private IP space from RFC1918.
         * 
         */
        PrivateRangesOnly("PRIVATE_RANGES_ONLY"),
        /**
         * Force the use of VPC Access Connector for all egress traffic from the function.
         * 
         */
        AllTraffic("ALL_TRAFFIC");

        private final String value;

        ServiceConfigVpcConnectorEgressSettings(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceConfigVpcConnectorEgressSettings[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
