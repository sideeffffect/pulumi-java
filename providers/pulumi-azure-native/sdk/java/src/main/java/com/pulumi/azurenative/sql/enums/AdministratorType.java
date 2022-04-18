// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the sever administrator.
     * 
     */
    @EnumType
    public enum AdministratorType {
        ActiveDirectory("ActiveDirectory");

        private final String value;

        AdministratorType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AdministratorType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
