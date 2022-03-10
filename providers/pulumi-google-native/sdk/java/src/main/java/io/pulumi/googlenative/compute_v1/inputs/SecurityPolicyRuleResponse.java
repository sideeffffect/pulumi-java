// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleHttpHeaderActionResponse;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleMatcherResponse;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRateLimitOptionsResponse;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny).
 * 
 */
public final class SecurityPolicyRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleResponse Empty = new SecurityPolicyRuleResponse();

    /**
     * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    @InputImport(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Optional, additional actions that are performed on headers.
     * 
     */
    @InputImport(name="headerAction", required=true)
      private final SecurityPolicyRuleHttpHeaderActionResponse headerAction;

    public SecurityPolicyRuleHttpHeaderActionResponse getHeaderAction() {
        return this.headerAction;
    }

    /**
     * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
     */
    @InputImport(name="match", required=true)
      private final SecurityPolicyRuleMatcherResponse match;

    public SecurityPolicyRuleMatcherResponse getMatch() {
        return this.match;
    }

    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    @InputImport(name="preview", required=true)
      private final Boolean preview;

    public Boolean getPreview() {
        return this.preview;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any other actions.
     * 
     */
    @InputImport(name="rateLimitOptions", required=true)
      private final SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;

    public SecurityPolicyRuleRateLimitOptionsResponse getRateLimitOptions() {
        return this.rateLimitOptions;
    }

    /**
     * Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    @InputImport(name="redirectOptions", required=true)
      private final SecurityPolicyRuleRedirectOptionsResponse redirectOptions;

    public SecurityPolicyRuleRedirectOptionsResponse getRedirectOptions() {
        return this.redirectOptions;
    }

    public SecurityPolicyRuleResponse(
        String action,
        String description,
        SecurityPolicyRuleHttpHeaderActionResponse headerAction,
        String kind,
        SecurityPolicyRuleMatcherResponse match,
        Boolean preview,
        Integer priority,
        SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions,
        SecurityPolicyRuleRedirectOptionsResponse redirectOptions) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.headerAction = Objects.requireNonNull(headerAction, "expected parameter 'headerAction' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.preview = Objects.requireNonNull(preview, "expected parameter 'preview' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.rateLimitOptions = Objects.requireNonNull(rateLimitOptions, "expected parameter 'rateLimitOptions' to be non-null");
        this.redirectOptions = Objects.requireNonNull(redirectOptions, "expected parameter 'redirectOptions' to be non-null");
    }

    private SecurityPolicyRuleResponse() {
        this.action = null;
        this.description = null;
        this.headerAction = null;
        this.kind = null;
        this.match = null;
        this.preview = null;
        this.priority = null;
        this.rateLimitOptions = null;
        this.redirectOptions = null;
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
        private SecurityPolicyRuleHttpHeaderActionResponse headerAction;
        private String kind;
        private SecurityPolicyRuleMatcherResponse match;
        private Boolean preview;
        private Integer priority;
        private SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;
        private SecurityPolicyRuleRedirectOptionsResponse redirectOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.kind = defaults.kind;
    	      this.match = defaults.match;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.rateLimitOptions = defaults.rateLimitOptions;
    	      this.redirectOptions = defaults.redirectOptions;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
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
        public SecurityPolicyRuleResponse build() {
            return new SecurityPolicyRuleResponse(action, description, headerAction, kind, match, preview, priority, rateLimitOptions, redirectOptions);
        }
    }
}
