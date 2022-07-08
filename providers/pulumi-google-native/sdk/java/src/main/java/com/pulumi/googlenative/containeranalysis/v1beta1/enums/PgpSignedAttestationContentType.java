// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    @EnumType
    public enum PgpSignedAttestationContentType {
        /**
         * `ContentType` is not set.
         * 
         */
        ContentTypeUnspecified("CONTENT_TYPE_UNSPECIFIED"),
        /**
         * Atomic format attestation signature. See https://github.com/containers/image/blob/8a5d2f82a6e3263290c8e0276c3e0f64e77723e7/docs/atomic-signature.md The payload extracted from `signature` is a JSON blob conforming to the linked schema.
         * 
         */
        SimpleSigningJson("SIMPLE_SIGNING_JSON");

        private final String value;

        PgpSignedAttestationContentType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PgpSignedAttestationContentType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
