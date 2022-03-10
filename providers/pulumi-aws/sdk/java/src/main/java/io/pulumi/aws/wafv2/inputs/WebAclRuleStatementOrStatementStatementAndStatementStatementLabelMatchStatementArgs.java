// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs Empty = new WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs();

    /**
     * The string to match against.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    @InputImport(name="scope", required=true)
      private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    public WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs(
        Input<String> key,
        Input<String> scope) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs() {
        this.key = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder scope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementLabelMatchStatementArgs(key, scope);
        }
    }
}
