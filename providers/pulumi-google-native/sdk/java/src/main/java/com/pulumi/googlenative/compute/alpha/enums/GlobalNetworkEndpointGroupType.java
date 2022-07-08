// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    @EnumType
    public enum GlobalNetworkEndpointGroupType {
        /**
         * The network endpoint group is a backend of a load balancer.
         * 
         */
        LoadBalancing("LOAD_BALANCING");

        private final String value;

        GlobalNetworkEndpointGroupType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GlobalNetworkEndpointGroupType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
