// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether to allow session affinity on this host. Valid options are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @EnumType
    public enum SessionAffinityEnabledState {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        SessionAffinityEnabledState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SessionAffinityEnabledState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
