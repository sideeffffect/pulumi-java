// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of this network, either Client or Private.
     * 
     */
    @EnumType
    public enum NetworkConfigType {
        /**
         * Unspecified value.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Client network, that is a network peered to a GCP VPC.
         * 
         */
        Client("CLIENT"),
        /**
         * Private network, that is a network local to the BMS POD.
         * 
         */
        Private("PRIVATE");

        private final String value;

        NetworkConfigType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkConfigType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
