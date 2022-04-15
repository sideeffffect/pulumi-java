// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs Empty = new RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs();

    /**
     * The string to match against.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    public RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs(
        Output<String> key,
        Output<String> scope) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs() {
        this.key = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }        public RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs build() {
            return new RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs(key, scope);
        }
    }
}
