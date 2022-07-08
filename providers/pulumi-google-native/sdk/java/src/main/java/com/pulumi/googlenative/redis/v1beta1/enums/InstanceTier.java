// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The service tier of the instance.
     * 
     */
    @EnumType
    public enum InstanceTier {
        /**
         * Not set.
         * 
         */
        TierUnspecified("TIER_UNSPECIFIED"),
        /**
         * BASIC tier: standalone instance
         * 
         */
        Basic("BASIC"),
        /**
         * STANDARD_HA tier: highly available primary/replica instances
         * 
         */
        StandardHa("STANDARD_HA");

        private final String value;

        InstanceTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
