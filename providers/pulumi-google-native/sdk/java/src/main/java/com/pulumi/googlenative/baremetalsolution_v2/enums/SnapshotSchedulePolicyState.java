// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The state of the snapshot schedule policy.
     * 
     */
    @EnumType
    public enum SnapshotSchedulePolicyState {
        /**
         * The policy is in an unknown state.
         * 
         */
        StateUnspecified("STATE_UNSPECIFIED"),
        /**
         * The policy is been provisioned.
         * 
         */
        Provisioned("PROVISIONED");

        private final String value;

        SnapshotSchedulePolicyState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SnapshotSchedulePolicyState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
