// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The action to take when a rule match is found. Possible values are "ALLOW" or "DENY".
     * 
     */
    @EnumType
    public enum AuthorizationPolicyAction {
        /**
         * Default value.
         * 
         */
        ActionUnspecified("ACTION_UNSPECIFIED"),
        /**
         * Grant access.
         * 
         */
        Allow("ALLOW"),
        /**
         * Deny access. Deny rules should be avoided unless they are used to provide a default "deny all" fallback.
         * 
         */
        Deny("DENY");

        private final String value;

        AuthorizationPolicyAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AuthorizationPolicyAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
