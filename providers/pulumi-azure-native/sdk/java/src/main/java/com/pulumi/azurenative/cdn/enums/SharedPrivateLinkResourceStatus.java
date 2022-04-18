// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Status of the shared private link resource. Can be Pending, Approved, Rejected, Disconnected, or Timeout.
     * 
     */
    @EnumType
    public enum SharedPrivateLinkResourceStatus {
        Pending("Pending"),
        Approved("Approved"),
        Rejected("Rejected"),
        Disconnected("Disconnected"),
        Timeout("Timeout");

        private final String value;

        SharedPrivateLinkResourceStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SharedPrivateLinkResourceStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
