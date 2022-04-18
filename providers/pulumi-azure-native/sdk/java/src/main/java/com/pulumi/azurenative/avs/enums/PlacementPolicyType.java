// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * placement policy type
     * 
     */
    @EnumType
    public enum PlacementPolicyType {
        VmVm("VmVm"),
        VmHost("VmHost");

        private final String value;

        PlacementPolicyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PlacementPolicyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
