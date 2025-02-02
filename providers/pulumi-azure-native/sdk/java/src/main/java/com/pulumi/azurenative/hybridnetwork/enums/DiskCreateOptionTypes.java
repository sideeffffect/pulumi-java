// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how the virtual machine should be created.
     * 
     */
    @EnumType
    public enum DiskCreateOptionTypes {
        Unknown("Unknown"),
        Empty("Empty");

        private final String value;

        DiskCreateOptionTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiskCreateOptionTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
