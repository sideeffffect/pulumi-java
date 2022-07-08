// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DatasetAccessEntryTargetTypesItem {
        /**
         * Do not use. You must set a target type explicitly.
         * 
         */
        TargetTypeUnspecified("TARGET_TYPE_UNSPECIFIED"),
        /**
         * This entry applies to views in the dataset.
         * 
         */
        Views("VIEWS");

        private final String value;

        DatasetAccessEntryTargetTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatasetAccessEntryTargetTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
