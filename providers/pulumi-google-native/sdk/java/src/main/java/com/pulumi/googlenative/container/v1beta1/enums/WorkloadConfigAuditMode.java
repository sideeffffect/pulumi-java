// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Sets which mode of auditing should be used for the cluster&#39;s workloads.
     * 
     */
    @EnumType
    public enum WorkloadConfigAuditMode {
        /**
         * Default value meaning that no mode has been specified.
         * 
         */
        ModeUnspecified("MODE_UNSPECIFIED"),
        /**
         * This disables Workload Configuration auditing on the cluster, meaning that nothing is surfaced.
         * 
         */
        Disabled("DISABLED"),
        /**
         * Applies the default set of policy auditing to a cluster&#39;s workloads.
         * 
         */
        Basic("BASIC"),
        /**
         * Surfaces configurations that are not in line with the Pod Security Standard Baseline policy.
         * 
         */
        Baseline("BASELINE"),
        /**
         * Surfaces configurations that are not in line with the Pod Security Standard Restricted policy.
         * 
         */
        Restricted("RESTRICTED");

        private final String value;

        WorkloadConfigAuditMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WorkloadConfigAuditMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
