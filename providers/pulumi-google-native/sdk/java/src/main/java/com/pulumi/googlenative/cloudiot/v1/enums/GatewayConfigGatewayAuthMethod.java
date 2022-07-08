// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates how to authorize and/or authenticate devices to access the gateway.
     * 
     */
    @EnumType
    public enum GatewayConfigGatewayAuthMethod {
        /**
         * No authentication/authorization method specified. No devices are allowed to access the gateway.
         * 
         */
        GatewayAuthMethodUnspecified("GATEWAY_AUTH_METHOD_UNSPECIFIED"),
        /**
         * The device is authenticated through the gateway association only. Device credentials are ignored even if provided.
         * 
         */
        AssociationOnly("ASSOCIATION_ONLY"),
        /**
         * The device is authenticated through its own credentials. Gateway association is not checked.
         * 
         */
        DeviceAuthTokenOnly("DEVICE_AUTH_TOKEN_ONLY"),
        /**
         * The device is authenticated through both device credentials and gateway association. The device must be bound to the gateway and must provide its own credentials.
         * 
         */
        AssociationAndDeviceAuthToken("ASSOCIATION_AND_DEVICE_AUTH_TOKEN");

        private final String value;

        GatewayConfigGatewayAuthMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GatewayConfigGatewayAuthMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
