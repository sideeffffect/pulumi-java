// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Health Check Protocol
     * 
     */
    @EnumType
    public enum ServiceHealthCheckConfigurationProtocol {
        Tcp("TCP"),
        Http("HTTP");

        private final String value;

        ServiceHealthCheckConfigurationProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceHealthCheckConfigurationProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
