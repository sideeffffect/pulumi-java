// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement {
    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
    */
    public List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement(statements);
        }
    }
}
