// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs();

    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs(name);
        }
    }
}
