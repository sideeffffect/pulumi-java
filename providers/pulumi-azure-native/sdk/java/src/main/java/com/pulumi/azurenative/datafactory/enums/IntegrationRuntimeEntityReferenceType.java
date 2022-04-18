// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of this referenced entity.
     * 
     */
    @EnumType
    public enum IntegrationRuntimeEntityReferenceType {
        IntegrationRuntimeReference("IntegrationRuntimeReference"),
        LinkedServiceReference("LinkedServiceReference");

        private final String value;

        IntegrationRuntimeEntityReferenceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IntegrationRuntimeEntityReferenceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
