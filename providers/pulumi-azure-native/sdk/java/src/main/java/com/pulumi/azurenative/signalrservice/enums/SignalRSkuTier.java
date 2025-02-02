// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional tier of this particular SKU. &#39;Standard&#39; or &#39;Free&#39;.
     * 
     * `Basic` is deprecated, use `Standard` instead.
     * 
     */
    @EnumType
    public enum SignalRSkuTier {
        Free("Free"),
        Basic("Basic"),
        Standard("Standard"),
        Premium("Premium");

        private final String value;

        SignalRSkuTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SignalRSkuTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
