// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.quantum.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Provisioning status field
     * 
     */
    @EnumType
    public enum Status {
        Succeeded("Succeeded"),
        Launching("Launching"),
        Updating("Updating"),
        Deleting("Deleting"),
        Deleted("Deleted"),
        Failed("Failed");

        private final String value;

        Status(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Status[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
