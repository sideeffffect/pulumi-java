// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebACLOrStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLOrStatementArgs Empty = new WebACLOrStatementArgs();

    @InputImport(name="statements", required=true)
      private final Input<List<WebACLStatementArgs>> statements;

    public Input<List<WebACLStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebACLOrStatementArgs(Input<List<WebACLStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebACLOrStatementArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebACLStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLOrStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Input<List<WebACLStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder statements(List<WebACLStatementArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebACLOrStatementArgs build() {
            return new WebACLOrStatementArgs(statements);
        }
    }
}
