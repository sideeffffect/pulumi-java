// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum NetworkConfigModesItem {
        /**
         * Internet protocol not set.
         * 
         */
        AddressModeUnspecified("ADDRESS_MODE_UNSPECIFIED"),
        /**
         * Use the IPv4 internet protocol.
         * 
         */
        ModeIpv4("MODE_IPV4");

        private final String value;

        NetworkConfigModesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkConfigModesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
