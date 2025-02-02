// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.auditmanager.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of the specified assessment.
     * 
     */
    @EnumType
    public enum AssessmentStatus {
        Active("ACTIVE"),
        Inactive("INACTIVE");

        private final String value;

        AssessmentStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AssessmentStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
