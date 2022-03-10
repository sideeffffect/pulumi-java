// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementExcludedRule;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementManagedRuleGroupStatement {
    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    private final @Nullable List<WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRules;
    /**
     * The name of the managed rule group.
     * 
     */
    private final String name;
    /**
     * Narrows the scope of the statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement scopeDownStatement;
    /**
     * The name of the managed rule group vendor.
     * 
     */
    private final String vendorName;

    @OutputCustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatement(
        @OutputCustomType.Parameter("excludedRules") @Nullable List<WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRules,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("scopeDownStatement") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement scopeDownStatement,
        @OutputCustomType.Parameter("vendorName") String vendorName) {
        this.excludedRules = excludedRules;
        this.name = name;
        this.scopeDownStatement = scopeDownStatement;
        this.vendorName = vendorName;
    }

    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
    */
    public List<WebAclRuleStatementManagedRuleGroupStatementExcludedRule> getExcludedRules() {
        return this.excludedRules == null ? List.of() : this.excludedRules;
    }
    /**
     * The name of the managed rule group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Narrows the scope of the statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
     * 
    */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement> getScopeDownStatement() {
        return Optional.ofNullable(this.scopeDownStatement);
    }
    /**
     * The name of the managed rule group vendor.
     * 
    */
    public String getVendorName() {
        return this.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRules;
        private String name;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement scopeDownStatement;
        private String vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedRules = defaults.excludedRules;
    	      this.name = defaults.name;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder excludedRules(@Nullable List<WebAclRuleStatementManagedRuleGroupStatementExcludedRule> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder scopeDownStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatement scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        public Builder vendorName(String vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatement build() {
            return new WebAclRuleStatementManagedRuleGroupStatement(excludedRules, name, scopeDownStatement, vendorName);
        }
    }
}
