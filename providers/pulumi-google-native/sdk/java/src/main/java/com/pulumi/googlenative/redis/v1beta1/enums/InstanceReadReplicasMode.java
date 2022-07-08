// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED.
     * 
     */
    @EnumType
    public enum InstanceReadReplicasMode {
        /**
         * If not set, Memorystore Redis backend will default to READ_REPLICAS_DISABLED.
         * 
         */
        ReadReplicasModeUnspecified("READ_REPLICAS_MODE_UNSPECIFIED"),
        /**
         * If disabled, read endpoint will not be provided and the instance cannot scale up or down the number of replicas.
         * 
         */
        ReadReplicasDisabled("READ_REPLICAS_DISABLED"),
        /**
         * If enabled, read endpoint will be provided and the instance can scale up and down the number of replicas. Not valid for basic tier.
         * 
         */
        ReadReplicasEnabled("READ_REPLICAS_ENABLED");

        private final String value;

        InstanceReadReplicasMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceReadReplicasMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
