// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution.v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Interconnect bandwidth. Set only when type is CLIENT.
     * 
     */
    @EnumType
    public enum NetworkConfigBandwidth {
        /**
         * Unspecified value.
         * 
         */
        BandwidthUnspecified("BANDWIDTH_UNSPECIFIED"),
        /**
         * 1 Gbps.
         * 
         */
        Bw1Gbps("BW_1_GBPS"),
        /**
         * 2 Gbps.
         * 
         */
        Bw2Gbps("BW_2_GBPS"),
        /**
         * 5 Gbps.
         * 
         */
        Bw5Gbps("BW_5_GBPS"),
        /**
         * 10 Gbps.
         * 
         */
        Bw10Gbps("BW_10_GBPS");

        private final String value;

        NetworkConfigBandwidth(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkConfigBandwidth[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
