// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum GooglePrivacyDlpV2CloudStorageOptionsSampleMethod {
        SampleMethodUnspecified("SAMPLE_METHOD_UNSPECIFIED"),
        /**
         * Scan from the top (default).
         * 
         */
        Top("TOP"),
        /**
         * For each file larger than bytes_limit_per_file, randomly pick the offset to start scanning. The scanned bytes are contiguous.
         * 
         */
        RandomStart("RANDOM_START");

        private final String value;

        GooglePrivacyDlpV2CloudStorageOptionsSampleMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GooglePrivacyDlpV2CloudStorageOptionsSampleMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
