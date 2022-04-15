// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicIAMMemberConditionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicIAMMemberConditionGetArgs Empty = new TopicIAMMemberConditionGetArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="expression", required=true)
      private final Output<String> expression;

    public Output<String> expression() {
        return this.expression;
    }

    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> title() {
        return this.title;
    }

    public TopicIAMMemberConditionGetArgs(
        @Nullable Output<String> description,
        Output<String> expression,
        Output<String> title) {
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private TopicIAMMemberConditionGetArgs() {
        this.description = Codegen.empty();
        this.expression = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicIAMMemberConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> expression;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicIAMMemberConditionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
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
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }        public TopicIAMMemberConditionGetArgs build() {
            return new TopicIAMMemberConditionGetArgs(description, expression, title);
        }
    }
}
