// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
     */
    @EnumType
    public enum ServiceDatabaseType {
        /**
         * The DATABASE_TYPE is not set.
         * 
         */
        DatabaseTypeUnspecified("DATABASE_TYPE_UNSPECIFIED"),
        /**
         * MySQL is used to persist the metastore data.
         * 
         */
        Mysql("MYSQL"),
        /**
         * Spanner is used to persist the metastore data.
         * 
         */
        Spanner("SPANNER");

        private final String value;

        ServiceDatabaseType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceDatabaseType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
