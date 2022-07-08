// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution.v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Export permissions.
     * 
     */
    @EnumType
    public enum NfsExportPermissions {
        /**
         * Unspecified value.
         * 
         */
        PermissionsUnspecified("PERMISSIONS_UNSPECIFIED"),
        /**
         * Read-only permission.
         * 
         */
        ReadOnly("READ_ONLY"),
        /**
         * Read-write permission.
         * 
         */
        ReadWrite("READ_WRITE");

        private final String value;

        NfsExportPermissions(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NfsExportPermissions[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
