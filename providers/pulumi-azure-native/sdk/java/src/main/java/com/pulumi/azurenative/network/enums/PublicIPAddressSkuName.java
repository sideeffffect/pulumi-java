// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Name of a public IP address SKU.
     * 
     */
    @EnumType
    public enum PublicIPAddressSkuName {
        Basic("Basic"),
        Standard("Standard");

        private final String value;

        PublicIPAddressSkuName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublicIPAddressSkuName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
