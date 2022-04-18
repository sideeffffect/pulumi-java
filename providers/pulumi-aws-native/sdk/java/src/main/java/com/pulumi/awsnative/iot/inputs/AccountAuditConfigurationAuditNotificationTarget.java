// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountAuditConfigurationAuditNotificationTarget extends com.pulumi.resources.InvokeArgs {

    public static final AccountAuditConfigurationAuditNotificationTarget Empty = new AccountAuditConfigurationAuditNotificationTarget();

    /**
     * True if notifications to the target are enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * The ARN of the role that grants permission to send notifications to the target.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable String roleArn;

    public Optional<String> roleArn() {
        return this.roleArn == null ? Optional.empty() : Optional.ofNullable(this.roleArn);
    }

    /**
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     * 
     */
    @Import(name="targetArn")
      private final @Nullable String targetArn;

    public Optional<String> targetArn() {
        return this.targetArn == null ? Optional.empty() : Optional.ofNullable(this.targetArn);
    }

    public AccountAuditConfigurationAuditNotificationTarget(
        @Nullable Boolean enabled,
        @Nullable String roleArn,
        @Nullable String targetArn) {
        this.enabled = enabled;
        this.roleArn = roleArn;
        this.targetArn = targetArn;
    }

    private AccountAuditConfigurationAuditNotificationTarget() {
        this.enabled = null;
        this.roleArn = null;
        this.targetArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationAuditNotificationTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String roleArn;
        private @Nullable String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationAuditNotificationTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = targetArn;
            return this;
        }        public AccountAuditConfigurationAuditNotificationTarget build() {
            return new AccountAuditConfigurationAuditNotificationTarget(enabled, roleArn, targetArn);
        }
    }
}
