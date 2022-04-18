// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The data type of the parameter.
     * 
     */
    @EnumType
    public enum ParameterType {
        String("String"),
        Array("Array"),
        Object("Object"),
        Boolean("Boolean"),
        Integer("Integer"),
        Float("Float"),
        DateTime("DateTime");

        private final String value;

        ParameterType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ParameterType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
