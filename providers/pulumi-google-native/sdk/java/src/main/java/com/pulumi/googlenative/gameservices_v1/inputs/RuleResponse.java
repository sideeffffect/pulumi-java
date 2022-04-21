// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1.inputs.ConditionResponse;
import com.pulumi.googlenative.gameservices_v1.inputs.LogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A rule to be applied in a Policy.
 * 
 */
public final class RuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuleResponse Empty = new RuleResponse();

    /**
     * Required
     * 
     */
    @Import(name="action", required=true)
    private String action;

    public String action() {
        return this.action;
    }

    /**
     * Additional restrictions that must be met. All conditions must pass for the rule to match.
     * 
     */
    @Import(name="conditions", required=true)
    private List<ConditionResponse> conditions;

    public List<ConditionResponse> conditions() {
        return this.conditions;
    }

    /**
     * Human-readable description of the rule.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * If one or more &#39;in&#39; clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
     * 
     */
    @Import(name="in", required=true)
    private List<String> in;

    public List<String> in() {
        return this.in;
    }

    /**
     * The config returned to callers of CheckPolicy for any entries that match the LOG action.
     * 
     */
    @Import(name="logConfig", required=true)
    private List<LogConfigResponse> logConfig;

    public List<LogConfigResponse> logConfig() {
        return this.logConfig;
    }

    /**
     * If one or more &#39;not_in&#39; clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at in the Local IAM documentation (see go/local-iam#features).
     * 
     */
    @Import(name="notIn", required=true)
    private List<String> notIn;

    public List<String> notIn() {
        return this.notIn;
    }

    /**
     * A permission is a string of form &#39;..&#39; (e.g., &#39;storage.buckets.list&#39;). A value of &#39;*&#39; matches all permissions, and a verb part of &#39;*&#39; (e.g., &#39;storage.buckets.*&#39;) matches all verbs.
     * 
     */
    @Import(name="permissions", required=true)
    private List<String> permissions;

    public List<String> permissions() {
        return this.permissions;
    }

    private RuleResponse() {}

    private RuleResponse(RuleResponse $) {
        this.action = $.action;
        this.conditions = $.conditions;
        this.description = $.description;
        this.in = $.in;
        this.logConfig = $.logConfig;
        this.notIn = $.notIn;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleResponse $;

        public Builder() {
            $ = new RuleResponse();
        }

        public Builder(RuleResponse defaults) {
            $ = new RuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder action(String action) {
            $.action = action;
            return this;
        }

        public Builder conditions(List<ConditionResponse> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder in(List<String> in) {
            $.in = in;
            return this;
        }

        public Builder in(String... in) {
            return in(List.of(in));
        }

        public Builder logConfig(List<LogConfigResponse> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(LogConfigResponse... logConfig) {
            return logConfig(List.of(logConfig));
        }

        public Builder notIn(List<String> notIn) {
            $.notIn = notIn;
            return this;
        }

        public Builder notIn(String... notIn) {
            return notIn(List.of(notIn));
        }

        public Builder permissions(List<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public RuleResponse build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.in = Objects.requireNonNull($.in, "expected parameter 'in' to be non-null");
            $.logConfig = Objects.requireNonNull($.logConfig, "expected parameter 'logConfig' to be non-null");
            $.notIn = Objects.requireNonNull($.notIn, "expected parameter 'notIn' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            return $;
        }
    }

}
