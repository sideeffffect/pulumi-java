// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ExperimentMetricGoalObjectDesiredChange {
        Increase("INCREASE"),
        Decrease("DECREASE");

        private final String value;

        ExperimentMetricGoalObjectDesiredChange(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExperimentMetricGoalObjectDesiredChange[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
