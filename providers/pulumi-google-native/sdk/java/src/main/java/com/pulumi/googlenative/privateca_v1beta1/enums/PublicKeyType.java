// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The type of public key. If specified, it must match the public key used for the`key` field.
     * 
     */
    @EnumType
    public enum PublicKeyType {
        /**
         * Default unspecified value.
         * 
         */
        KeyTypeUnspecified("KEY_TYPE_UNSPECIFIED"),
        /**
         * A PEM-encoded PKCS#1/RFC 3447 RSAPublicKey structure, or an RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing the former.
         * 
         */
        PemRsaKey("PEM_RSA_KEY"),
        /**
         * An RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing a PEM-encoded compressed NIST P-256/secp256r1/prime256v1 or P-384 key.
         * 
         */
        PemEcKey("PEM_EC_KEY");

        private final String value;

        PublicKeyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublicKeyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
