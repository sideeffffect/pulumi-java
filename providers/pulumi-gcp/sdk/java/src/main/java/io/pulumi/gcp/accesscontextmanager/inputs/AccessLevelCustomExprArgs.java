// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelCustomExprArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelCustomExprArgs Empty = new AccessLevelCustomExprArgs();

    /**
     * Description of the expression
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @InputImport(name="expression", required=true)
      private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    /**
     * String indicating the location of the expression for error reporting, e.g. a file name and a position in the file
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public AccessLevelCustomExprArgs(
        @Nullable Input<String> description,
        Input<String> expression,
        @Nullable Input<String> location,
        @Nullable Input<String> title) {
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.location = location;
        this.title = title;
    }

    private AccessLevelCustomExprArgs() {
        this.description = Input.empty();
        this.expression = Input.empty();
        this.location = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelCustomExprArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> expression;
        private @Nullable Input<String> location;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelCustomExprArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder expression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder expression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder title(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }
        public AccessLevelCustomExprArgs build() {
            return new AccessLevelCustomExprArgs(description, expression, location, title);
        }
    }
}
