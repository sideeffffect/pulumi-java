// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The concurrency control mode to use for this database.
     * 
     */
    @EnumType
    public enum DatabaseConcurrencyMode {
        /**
         * Not used.
         * 
         */
        ConcurrencyModeUnspecified("CONCURRENCY_MODE_UNSPECIFIED"),
        /**
         * Use optimistic concurrency control by default. This mode is available for Cloud Firestore databases.
         * 
         */
        Optimistic("OPTIMISTIC"),
        /**
         * Use pessimistic concurrency control by default. This mode is available for Cloud Firestore databases. This is the default setting for Cloud Firestore.
         * 
         */
        Pessimistic("PESSIMISTIC"),
        /**
         * Use optimistic concurrency control with entity groups by default. This is the only available mode for Cloud Datastore. This mode is also available for Cloud Firestore with Datastore Mode but is not recommended.
         * 
         */
        OptimisticWithEntityGroups("OPTIMISTIC_WITH_ENTITY_GROUPS");

        private final String value;

        DatabaseConcurrencyMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabaseConcurrencyMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
