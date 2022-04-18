// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DevicePolicyAllowedEncryptionStatusesItem {
        /**
         * The encryption status of the device is not specified or not known.
         * 
         */
        EncryptionUnspecified("ENCRYPTION_UNSPECIFIED"),
        /**
         * The device does not support encryption.
         * 
         */
        EncryptionUnsupported("ENCRYPTION_UNSUPPORTED"),
        /**
         * The device supports encryption, but is currently unencrypted.
         * 
         */
        Unencrypted("UNENCRYPTED"),
        /**
         * The device is encrypted.
         * 
         */
        Encrypted("ENCRYPTED");

        private final String value;

        DevicePolicyAllowedEncryptionStatusesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DevicePolicyAllowedEncryptionStatusesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
