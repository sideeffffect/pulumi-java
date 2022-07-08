// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of replication this instance uses. This can be either `ASYNCHRONOUS` or `SYNCHRONOUS`. (Deprecated) This property was only applicable to First Generation instances.
     * 
     */
    @EnumType
    public enum SettingsReplicationType {
        /**
         * This is an unknown replication type for a Cloud SQL instance.
         * 
         */
        SqlReplicationTypeUnspecified("SQL_REPLICATION_TYPE_UNSPECIFIED"),
        /**
         * The synchronous replication mode for First Generation instances. It is the default value.
         * 
         */
        Synchronous("SYNCHRONOUS"),
        /**
         * The asynchronous replication mode for First Generation instances. It provides a slight performance gain, but if an outage occurs while this option is set to asynchronous, you can lose up to a few seconds of updates to your data.
         * 
         */
        Asynchronous("ASYNCHRONOUS");

        private final String value;

        SettingsReplicationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SettingsReplicationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
