// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleHttpHeaderActionResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleMatcherResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleRateLimitOptionsResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleResponse {
    /**
     * @return The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    private final String action;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private final String direction;
    /**
     * @return Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules. This field may only be specified when the versioned_expr is set to FIREWALL.
     * 
     */
    private final Boolean enableLogging;
    /**
     * @return Optional, additional actions that are performed on headers.
     * 
     */
    private final SecurityPolicyRuleHttpHeaderActionResponse headerAction;
    /**
     * @return [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
     */
    private final String kind;
    /**
     * @return A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    private final SecurityPolicyRuleMatcherResponse match;
    /**
     * @return If set to true, the specified action is not enforced.
     * 
     */
    private final Boolean preview;
    /**
     * @return An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    private final Integer priority;
    /**
     * @return Must be specified if the action is &#34;rate_based_ban&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * 
     */
    private final SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;
    /**
     * @return Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    private final SecurityPolicyRuleRedirectOptionsResponse redirectOptions;
    /**
     * @return Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
     * 
     */
    private final String ruleNumber;
    /**
     * @return Calculation of the complexity of a single firewall security policy rule.
     * 
     */
    private final Integer ruleTupleCount;
    /**
     * @return A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private final List<String> targetResources;
    /**
     * @return A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    private final List<String> targetServiceAccounts;

    @CustomType.Constructor
    private SecurityPolicyRuleResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("enableLogging") Boolean enableLogging,
        @CustomType.Parameter("headerAction") SecurityPolicyRuleHttpHeaderActionResponse headerAction,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("match") SecurityPolicyRuleMatcherResponse match,
        @CustomType.Parameter("preview") Boolean preview,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("rateLimitOptions") SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions,
        @CustomType.Parameter("redirectOptions") SecurityPolicyRuleRedirectOptionsResponse redirectOptions,
        @CustomType.Parameter("ruleNumber") String ruleNumber,
        @CustomType.Parameter("ruleTupleCount") Integer ruleTupleCount,
        @CustomType.Parameter("targetResources") List<String> targetResources,
        @CustomType.Parameter("targetServiceAccounts") List<String> targetServiceAccounts) {
        this.action = action;
        this.description = description;
        this.direction = direction;
        this.enableLogging = enableLogging;
        this.headerAction = headerAction;
        this.kind = kind;
        this.match = match;
        this.preview = preview;
        this.priority = priority;
        this.rateLimitOptions = rateLimitOptions;
        this.redirectOptions = redirectOptions;
        this.ruleNumber = ruleNumber;
        this.ruleTupleCount = ruleTupleCount;
        this.targetResources = targetResources;
        this.targetServiceAccounts = targetServiceAccounts;
    }

    /**
     * @return The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules. This field may only be specified when the versioned_expr is set to FIREWALL.
     * 
     */
    public Boolean enableLogging() {
        return this.enableLogging;
    }
    /**
     * @return Optional, additional actions that are performed on headers.
     * 
     */
    public SecurityPolicyRuleHttpHeaderActionResponse headerAction() {
        return this.headerAction;
    }
    /**
     * @return [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    public SecurityPolicyRuleMatcherResponse match() {
        return this.match;
    }
    /**
     * @return If set to true, the specified action is not enforced.
     * 
     */
    public Boolean preview() {
        return this.preview;
    }
    /**
     * @return An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Must be specified if the action is &#34;rate_based_ban&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * 
     */
    public SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions() {
        return this.rateLimitOptions;
    }
    /**
     * @return Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    public SecurityPolicyRuleRedirectOptionsResponse redirectOptions() {
        return this.redirectOptions;
    }
    /**
     * @return Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
     * 
     */
    public String ruleNumber() {
        return this.ruleNumber;
    }
    /**
     * @return Calculation of the complexity of a single firewall security policy rule.
     * 
     */
    public Integer ruleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * @return A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    public List<String> targetResources() {
        return this.targetResources;
    }
    /**
     * @return A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    public List<String> targetServiceAccounts() {
        return this.targetServiceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String description;
        private String direction;
        private Boolean enableLogging;
        private SecurityPolicyRuleHttpHeaderActionResponse headerAction;
        private String kind;
        private SecurityPolicyRuleMatcherResponse match;
        private Boolean preview;
        private Integer priority;
        private SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;
        private SecurityPolicyRuleRedirectOptionsResponse redirectOptions;
        private String ruleNumber;
        private Integer ruleTupleCount;
        private List<String> targetResources;
        private List<String> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.enableLogging = defaults.enableLogging;
    	      this.headerAction = defaults.headerAction;
    	      this.kind = defaults.kind;
    	      this.match = defaults.match;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.rateLimitOptions = defaults.rateLimitOptions;
    	      this.redirectOptions = defaults.redirectOptions;
    	      this.ruleNumber = defaults.ruleNumber;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.targetResources = defaults.targetResources;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder enableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }
        public Builder headerAction(SecurityPolicyRuleHttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder match(SecurityPolicyRuleMatcherResponse match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder preview(Boolean preview) {
            this.preview = Objects.requireNonNull(preview);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder rateLimitOptions(SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions) {
            this.rateLimitOptions = Objects.requireNonNull(rateLimitOptions);
            return this;
        }
        public Builder redirectOptions(SecurityPolicyRuleRedirectOptionsResponse redirectOptions) {
            this.redirectOptions = Objects.requireNonNull(redirectOptions);
            return this;
        }
        public Builder ruleNumber(String ruleNumber) {
            this.ruleNumber = Objects.requireNonNull(ruleNumber);
            return this;
        }
        public Builder ruleTupleCount(Integer ruleTupleCount) {
            this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
            return this;
        }
        public Builder targetResources(List<String> targetResources) {
            this.targetResources = Objects.requireNonNull(targetResources);
            return this;
        }
        public Builder targetResources(String... targetResources) {
            return targetResources(List.of(targetResources));
        }
        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
            return this;
        }
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }        public SecurityPolicyRuleResponse build() {
            return new SecurityPolicyRuleResponse(action, description, direction, enableLogging, headerAction, kind, match, preview, priority, rateLimitOptions, redirectOptions, ruleNumber, ruleTupleCount, targetResources, targetServiceAccounts);
        }
    }
}
