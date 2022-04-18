// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The online availability of the Product. Default to Availability.IN_STOCK. Corresponding properties: Google Merchant Center property [availability](https://support.google.com/merchants/answer/6324448). Schema.org property [Offer.availability](https://schema.org/availability).
     * 
     */
    @EnumType
    public enum ProductAvailability {
        /**
         * Default product availability. Default to Availability.IN_STOCK if unset.
         * 
         */
        AvailabilityUnspecified("AVAILABILITY_UNSPECIFIED"),
        /**
         * Product in stock.
         * 
         */
        InStock("IN_STOCK"),
        /**
         * Product out of stock.
         * 
         */
        OutOfStock("OUT_OF_STOCK"),
        /**
         * Product that is in pre-order state.
         * 
         */
        Preorder("PREORDER"),
        /**
         * Product that is back-ordered (i.e. temporarily out of stock).
         * 
         */
        Backorder("BACKORDER");

        private final String value;

        ProductAvailability(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProductAvailability[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
