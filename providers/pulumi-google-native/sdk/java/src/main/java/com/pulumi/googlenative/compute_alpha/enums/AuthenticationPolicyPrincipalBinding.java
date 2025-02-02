// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Define whether peer or origin identity should be used for principal. Default value is USE_PEER. If peer (or origin) identity is not available, either because peer/origin authentication is not defined, or failed, principal will be left unset. In other words, binding rule does not affect the decision to accept or reject request. This field can be set to one of the following: USE_PEER: Principal will be set to the identity from peer authentication. USE_ORIGIN: Principal will be set to the identity from origin authentication.
     * 
     */
    @EnumType
    public enum AuthenticationPolicyPrincipalBinding {
        Invalid("INVALID"),
        /**
         * Principal will be set to the identity from origin authentication.
         * 
         */
        UseOrigin("USE_ORIGIN"),
        /**
         * Principal will be set to the identity from peer authentication.
         * 
         */
        UsePeer("USE_PEER");

        private final String value;

        AuthenticationPolicyPrincipalBinding(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AuthenticationPolicyPrincipalBinding[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
