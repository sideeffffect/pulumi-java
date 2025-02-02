// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Reason for provisioning failures.
     * 
     */
    @EnumType
    public enum ProvisioningIssueReason {
        ReasonUnspecified("REASON_UNSPECIFIED"),
        /**
         * Certificate provisioning failed due to an issue with one or more of the domains on the certificate. For details of which domains failed, consult the `authorization_attempt_info` field.
         * 
         */
        AuthorizationIssue("AUTHORIZATION_ISSUE"),
        /**
         * Exceeded Certificate Authority quotas or internal rate limits of the system. Provisioning may take longer to complete.
         * 
         */
        RateLimited("RATE_LIMITED");

        private final String value;

        ProvisioningIssueReason(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProvisioningIssueReason[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
