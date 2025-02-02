// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Operator used to aggregate metric values
     * 
     */
    @EnumType
    public enum AnomalyDetectorMetricAggregationFunction {
        Avg("AVG"),
        Sum("SUM");

        private final String value;

        AnomalyDetectorMetricAggregationFunction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AnomalyDetectorMetricAggregationFunction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
