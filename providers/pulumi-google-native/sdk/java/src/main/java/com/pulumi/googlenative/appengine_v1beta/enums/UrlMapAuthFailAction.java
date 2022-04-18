// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    @EnumType
    public enum UrlMapAuthFailAction {
        /**
         * Not specified. AUTH_FAIL_ACTION_REDIRECT is assumed.
         * 
         */
        AuthFailActionUnspecified("AUTH_FAIL_ACTION_UNSPECIFIED"),
        /**
         * Redirects user to "accounts.google.com". The user is redirected back to the application URL after signing in or creating an account.
         * 
         */
        AuthFailActionRedirect("AUTH_FAIL_ACTION_REDIRECT"),
        /**
         * Rejects request with a 401 HTTP status code and an error message.
         * 
         */
        AuthFailActionUnauthorized("AUTH_FAIL_ACTION_UNAUTHORIZED");

        private final String value;

        UrlMapAuthFailAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UrlMapAuthFailAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
