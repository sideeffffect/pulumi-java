// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The stack type for this interconnect attachment to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at interconnect attachments creation and update interconnect attachment operations.
     * 
     */
    @EnumType
    public enum InterconnectAttachmentStackType {
        /**
         * The interconnect attachment can have both IPv4 and IPv6 addresses.
         * 
         */
        Ipv4Ipv6("IPV4_IPV6"),
        /**
         * The interconnect attachment will only be assigned IPv4 addresses.
         * 
         */
        Ipv4Only("IPV4_ONLY");

        private final String value;

        InterconnectAttachmentStackType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InterconnectAttachmentStackType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
