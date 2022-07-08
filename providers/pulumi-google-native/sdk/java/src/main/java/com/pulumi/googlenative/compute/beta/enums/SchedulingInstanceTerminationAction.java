// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the termination action for the instance.
     * 
     */
    @EnumType
    public enum SchedulingInstanceTerminationAction {
        /**
         * Delete the VM.
         * 
         */
        Delete("DELETE"),
        /**
         * Default value. This value is unused.
         * 
         */
        InstanceTerminationActionUnspecified("INSTANCE_TERMINATION_ACTION_UNSPECIFIED"),
        /**
         * Stop the VM without storing in-memory content. default action.
         * 
         */
        Stop("STOP");

        private final String value;

        SchedulingInstanceTerminationAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SchedulingInstanceTerminationAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
