// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.awsnative.databrew.outputs.RecipeParameterMap;
import com.pulumi.awsnative.databrew.outputs.RecipeParameters;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecipeAction {
    /**
     * @return Step action operation
     * 
     */
    private final String operation;
    private final @Nullable Either<RecipeParameters,RecipeParameterMap> parameters;

    @CustomType.Constructor
    private RecipeAction(
        @CustomType.Parameter("operation") String operation,
        @CustomType.Parameter("parameters") @Nullable Either<RecipeParameters,RecipeParameterMap> parameters) {
        this.operation = operation;
        this.parameters = parameters;
    }

    /**
     * @return Step action operation
     * 
     */
    public String operation() {
        return this.operation;
    }
    public Optional<Either<RecipeParameters,RecipeParameterMap>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operation;
        private @Nullable Either<RecipeParameters,RecipeParameterMap> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.parameters = defaults.parameters;
        }

        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        public Builder parameters(@Nullable Either<RecipeParameters,RecipeParameterMap> parameters) {
            this.parameters = parameters;
            return this;
        }        public RecipeAction build() {
            return new RecipeAction(operation, parameters);
        }
    }
}
