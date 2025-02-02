// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets the authentication type.
     * 
     */
    @EnumType
    public enum ServiceBusAuthenticationType {
        NotSpecified("NotSpecified"),
        SharedAccessKey("SharedAccessKey");

        private final String value;

        ServiceBusAuthenticationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceBusAuthenticationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
