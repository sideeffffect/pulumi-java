// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Serving status of this application.
     * 
     */
    @EnumType
    public enum AppServingStatus {
        /**
         * Serving status is unspecified.
         * 
         */
        Unspecified("UNSPECIFIED"),
        /**
         * Application is serving.
         * 
         */
        Serving("SERVING"),
        /**
         * Application has been disabled by the user.
         * 
         */
        UserDisabled("USER_DISABLED"),
        /**
         * Application has been disabled by the system.
         * 
         */
        SystemDisabled("SYSTEM_DISABLED");

        private final String value;

        AppServingStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AppServingStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
