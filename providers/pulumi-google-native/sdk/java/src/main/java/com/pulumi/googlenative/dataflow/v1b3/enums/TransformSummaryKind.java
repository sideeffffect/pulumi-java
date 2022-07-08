// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of transform.
     * 
     */
    @EnumType
    public enum TransformSummaryKind {
        /**
         * Unrecognized transform type.
         * 
         */
        UnknownKind("UNKNOWN_KIND"),
        /**
         * ParDo transform.
         * 
         */
        ParDoKind("PAR_DO_KIND"),
        /**
         * Group By Key transform.
         * 
         */
        GroupByKeyKind("GROUP_BY_KEY_KIND"),
        /**
         * Flatten transform.
         * 
         */
        FlattenKind("FLATTEN_KIND"),
        /**
         * Read transform.
         * 
         */
        ReadKind("READ_KIND"),
        /**
         * Write transform.
         * 
         */
        WriteKind("WRITE_KIND"),
        /**
         * Constructs from a constant value, such as with Create.of.
         * 
         */
        ConstantKind("CONSTANT_KIND"),
        /**
         * Creates a Singleton view of a collection.
         * 
         */
        SingletonKind("SINGLETON_KIND"),
        /**
         * Opening or closing a shuffle session, often as part of a GroupByKey.
         * 
         */
        ShuffleKind("SHUFFLE_KIND");

        private final String value;

        TransformSummaryKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TransformSummaryKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
