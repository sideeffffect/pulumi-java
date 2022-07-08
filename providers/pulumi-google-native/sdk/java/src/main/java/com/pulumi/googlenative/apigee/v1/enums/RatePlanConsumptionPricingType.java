// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Pricing model used for consumption-based charges.
     * 
     */
    @EnumType
    public enum RatePlanConsumptionPricingType {
        /**
         * Pricing model not specified. This is the default.
         * 
         */
        ConsumptionPricingTypeUnspecified("CONSUMPTION_PRICING_TYPE_UNSPECIFIED"),
        /**
         * Fixed rate charged for each API call.
         * 
         */
        FixedPerUnit("FIXED_PER_UNIT"),
        /**
         * Variable rate charged for each API call based on price tiers. Example: * 1-100 calls cost $2 per call * 101-200 calls cost $1.50 per call * 201-300 calls cost $1 per call * Total price for 50 calls: 50 x $2 = $100 * Total price for 150 calls: 100 x $2 + 50 x $1.5 = $275 * Total price for 250 calls: 100 x $2 + 100 x $1.5 + 50 x $1 = $400. **Note**: Not supported by Apigee at this time.
         * 
         */
        Banded("BANDED"),
        /**
         * **Note**: Not supported by Apigee at this time.
         * 
         */
        Tiered("TIERED"),
        /**
         * **Note**: Not supported by Apigee at this time.
         * 
         */
        Stairstep("STAIRSTEP");

        private final String value;

        RatePlanConsumptionPricingType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RatePlanConsumptionPricingType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
