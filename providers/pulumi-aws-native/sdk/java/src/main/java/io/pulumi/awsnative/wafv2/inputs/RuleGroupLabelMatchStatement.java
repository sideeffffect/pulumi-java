// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupLabelMatchScope;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupLabelMatchStatement extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupLabelMatchStatement Empty = new RuleGroupLabelMatchStatement();

    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    @InputImport(name="scope", required=true)
      private final RuleGroupLabelMatchScope scope;

    public RuleGroupLabelMatchScope getScope() {
        return this.scope;
    }

    public RuleGroupLabelMatchStatement(
        String key,
        RuleGroupLabelMatchScope scope) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RuleGroupLabelMatchStatement() {
        this.key = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupLabelMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private RuleGroupLabelMatchScope scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupLabelMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder scope(RuleGroupLabelMatchScope scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public RuleGroupLabelMatchStatement build() {
            return new RuleGroupLabelMatchStatement(key, scope);
        }
    }
}
