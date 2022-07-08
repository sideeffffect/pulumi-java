// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The type of network connectivity used by the AppConnection.
     * 
     */
    @EnumType
    public enum AppConnectionType {
        /**
         * Default value. This value is unused.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * TCP Proxy based BeyondCorp AppConnection. API will default to this if unset.
         * 
         */
        TcpProxy("TCP_PROXY");

        private final String value;

        AppConnectionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AppConnectionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
