// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CaPoolIamMemberCondition {
    private final @Nullable String description;
    private final String expression;
    private final String title;

    @OutputCustomType.Constructor({"description","expression","title"})
    private CaPoolIamMemberCondition(
        @Nullable String description,
        String expression,
        String title) {
        this.description = description;
        this.expression = expression;
        this.title = title;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getExpression() {
        return this.expression;
    }
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIamMemberCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIamMemberCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public CaPoolIamMemberCondition build() {
            return new CaPoolIamMemberCondition(description, expression, title);
        }
    }
}
