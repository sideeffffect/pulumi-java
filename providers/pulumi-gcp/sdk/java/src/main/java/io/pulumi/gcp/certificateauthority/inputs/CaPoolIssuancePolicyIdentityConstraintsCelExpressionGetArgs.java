// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs Empty = new CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs();

    /**
     * Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @Import(name="expression", required=true)
      private final Output<String> expression;

    public Output<String> expression() {
        return this.expression;
    }

    /**
     * String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> title() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    public CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs(
        @Nullable Output<String> description,
        Output<String> expression,
        @Nullable Output<String> location,
        @Nullable Output<String> title) {
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.location = location;
        this.title = title;
    }

    private CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs() {
        this.description = Codegen.empty();
        this.expression = Codegen.empty();
        this.location = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> expression;
        private @Nullable Output<String> location;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder expression(Output<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Output.of(Objects.requireNonNull(expression));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }        public CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs build() {
            return new CaPoolIssuancePolicyIdentityConstraintsCelExpressionGetArgs(description, expression, location, title);
        }
    }
}
