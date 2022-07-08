// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments. Defined in CVSS v3, CVSS v2
     * 
     */
    @EnumType
    public enum CVSSAttackVector {
        /**
         * Defined in CVSS v3, CVSS v2
         * 
         */
        AttackVectorUnspecified("ATTACK_VECTOR_UNSPECIFIED"),
        /**
         * Defined in CVSS v3, CVSS v2
         * 
         */
        AttackVectorNetwork("ATTACK_VECTOR_NETWORK"),
        /**
         * Defined in CVSS v3, CVSS v2
         * 
         */
        AttackVectorAdjacent("ATTACK_VECTOR_ADJACENT"),
        /**
         * Defined in CVSS v3, CVSS v2
         * 
         */
        AttackVectorLocal("ATTACK_VECTOR_LOCAL"),
        /**
         * Defined in CVSS v3
         * 
         */
        AttackVectorPhysical("ATTACK_VECTOR_PHYSICAL");

        private final String value;

        CVSSAttackVector(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CVSSAttackVector[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
