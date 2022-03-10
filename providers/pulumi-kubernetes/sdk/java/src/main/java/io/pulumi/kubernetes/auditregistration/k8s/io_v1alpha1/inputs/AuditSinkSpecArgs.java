// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.inputs.PolicyArgs;
import io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.inputs.WebhookArgs;
import java.util.Objects;


/**
 * AuditSinkSpec holds the spec for the audit sink
 * 
 */
public final class AuditSinkSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuditSinkSpecArgs Empty = new AuditSinkSpecArgs();

    /**
     * Policy defines the policy for selecting which events should be sent to the webhook required
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<PolicyArgs> policy;

    public Input<PolicyArgs> getPolicy() {
        return this.policy;
    }

    /**
     * Webhook to send events required
     * 
     */
    @InputImport(name="webhook", required=true)
      private final Input<WebhookArgs> webhook;

    public Input<WebhookArgs> getWebhook() {
        return this.webhook;
    }

    public AuditSinkSpecArgs(
        Input<PolicyArgs> policy,
        Input<WebhookArgs> webhook) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.webhook = Objects.requireNonNull(webhook, "expected parameter 'webhook' to be non-null");
    }

    private AuditSinkSpecArgs() {
        this.policy = Input.empty();
        this.webhook = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditSinkSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PolicyArgs> policy;
        private Input<WebhookArgs> webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditSinkSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.webhook = defaults.webhook;
        }

        public Builder policy(Input<PolicyArgs> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder policy(PolicyArgs policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }

        public Builder webhook(Input<WebhookArgs> webhook) {
            this.webhook = Objects.requireNonNull(webhook);
            return this;
        }

        public Builder webhook(WebhookArgs webhook) {
            this.webhook = Input.of(Objects.requireNonNull(webhook));
            return this;
        }
        public AuditSinkSpecArgs build() {
            return new AuditSinkSpecArgs(policy, webhook);
        }
    }
}
