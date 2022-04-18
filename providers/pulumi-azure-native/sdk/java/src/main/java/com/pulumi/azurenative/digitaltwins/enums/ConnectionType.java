// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of time series connection resource.
     * 
     */
    @EnumType
    public enum ConnectionType {
        AzureDataExplorer("AzureDataExplorer");

        private final String value;

        ConnectionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
