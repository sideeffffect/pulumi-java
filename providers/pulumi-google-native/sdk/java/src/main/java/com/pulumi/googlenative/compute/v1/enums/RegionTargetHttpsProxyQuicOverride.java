// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn&#39;t use QUIC. - If the quic-override flag is not specified, NONE is implied.
     * 
     */
    @EnumType
    public enum RegionTargetHttpsProxyQuicOverride {
        /**
         * The load balancer will not attempt to negotiate QUIC with clients.
         * 
         */
        Disable("DISABLE"),
        /**
         * The load balancer will attempt to negotiate QUIC with clients.
         * 
         */
        Enable("ENABLE"),
        /**
         * No overrides to the default QUIC policy. This option is implicit if no QUIC override has been specified in the request.
         * 
         */
        None("NONE");

        private final String value;

        RegionTargetHttpsProxyQuicOverride(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionTargetHttpsProxyQuicOverride[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
