// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyRuleArgs Empty = new OrganizationSecurityPolicyRuleArgs();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either
     * &#34;allow&#34;, &#34;deny&#34; or &#34;goto_next&#34;.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    public Output<String> action() {
        return this.action;
    }

    /**
     * A description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The direction in which this rule applies. If unspecified an INGRESS rule is created.
     * Possible values are `INGRESS` and `EGRESS`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Denotes whether to enable logging for a particular rule.
     * If logging is enabled, logs will be exported to the
     * configured export destination in Stackdriver.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * Structure is documented below.
     * 
     */
    @Import(name="match", required=true)
    private Output<OrganizationSecurityPolicyRuleMatchArgs> match;

    public Output<OrganizationSecurityPolicyRuleMatchArgs> match() {
        return this.match;
    }

    /**
     * The ID of the OrganizationSecurityPolicy this rule applies to.
     * 
     */
    @Import(name="policyId", required=true)
    private Output<String> policyId;

    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    @Import(name="preview")
    private @Nullable Output<Boolean> preview;

    public Optional<Output<Boolean>> preview() {
        return Optional.ofNullable(this.preview);
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a value
     * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
     * highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * A list of network resource URLs to which this rule applies.
     * This field allows you to control which network&#39;s VMs get
     * this rule. If this field is left blank, all VMs
     * within the organization will receive the rule.
     * 
     */
    @Import(name="targetResources")
    private @Nullable Output<List<String>> targetResources;

    public Optional<Output<List<String>>> targetResources() {
        return Optional.ofNullable(this.targetResources);
    }

    /**
     * A list of service accounts indicating the sets of
     * instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts")
    private @Nullable Output<List<String>> targetServiceAccounts;

    public Optional<Output<List<String>>> targetServiceAccounts() {
        return Optional.ofNullable(this.targetServiceAccounts);
    }

    private OrganizationSecurityPolicyRuleArgs() {}

    private OrganizationSecurityPolicyRuleArgs(OrganizationSecurityPolicyRuleArgs $) {
        this.action = $.action;
        this.description = $.description;
        this.direction = $.direction;
        this.enableLogging = $.enableLogging;
        this.match = $.match;
        this.policyId = $.policyId;
        this.preview = $.preview;
        this.priority = $.priority;
        this.targetResources = $.targetResources;
        this.targetServiceAccounts = $.targetServiceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationSecurityPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationSecurityPolicyRuleArgs $;

        public Builder() {
            $ = new OrganizationSecurityPolicyRuleArgs();
        }

        public Builder(OrganizationSecurityPolicyRuleArgs defaults) {
            $ = new OrganizationSecurityPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        public Builder match(Output<OrganizationSecurityPolicyRuleMatchArgs> match) {
            $.match = match;
            return this;
        }

        public Builder match(OrganizationSecurityPolicyRuleMatchArgs match) {
            return match(Output.of(match));
        }

        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public Builder preview(@Nullable Output<Boolean> preview) {
            $.preview = preview;
            return this;
        }

        public Builder preview(Boolean preview) {
            return preview(Output.of(preview));
        }

        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder targetResources(@Nullable Output<List<String>> targetResources) {
            $.targetResources = targetResources;
            return this;
        }

        public Builder targetResources(List<String> targetResources) {
            return targetResources(Output.of(targetResources));
        }

        public Builder targetResources(String... targetResources) {
            return targetResources(List.of(targetResources));
        }

        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            $.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            return targetServiceAccounts(Output.of(targetServiceAccounts));
        }

        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }

        public OrganizationSecurityPolicyRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            return $;
        }
    }

}
