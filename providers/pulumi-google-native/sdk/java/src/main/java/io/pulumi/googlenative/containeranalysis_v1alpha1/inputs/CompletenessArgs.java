// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Indicates that the builder claims certain fields in this message to be complete.
 * 
 */
public final class CompletenessArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompletenessArgs Empty = new CompletenessArgs();

    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
     */
    @InputImport(name="arguments")
      private final @Nullable Input<Boolean> arguments;

    public Input<Boolean> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<Boolean> environment;

    public Input<Boolean> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic".
     * 
     */
    @InputImport(name="materials")
      private final @Nullable Input<Boolean> materials;

    public Input<Boolean> getMaterials() {
        return this.materials == null ? Input.empty() : this.materials;
    }

    public CompletenessArgs(
        @Nullable Input<Boolean> arguments,
        @Nullable Input<Boolean> environment,
        @Nullable Input<Boolean> materials) {
        this.arguments = arguments;
        this.environment = environment;
        this.materials = materials;
    }

    private CompletenessArgs() {
        this.arguments = Input.empty();
        this.environment = Input.empty();
        this.materials = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompletenessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> arguments;
        private @Nullable Input<Boolean> environment;
        private @Nullable Input<Boolean> materials;

        public Builder() {
    	      // Empty
        }

        public Builder(CompletenessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
        }

        public Builder arguments(@Nullable Input<Boolean> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder arguments(@Nullable Boolean arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder environment(@Nullable Input<Boolean> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable Boolean environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder materials(@Nullable Input<Boolean> materials) {
            this.materials = materials;
            return this;
        }

        public Builder materials(@Nullable Boolean materials) {
            this.materials = Input.ofNullable(materials);
            return this;
        }
        public CompletenessArgs build() {
            return new CompletenessArgs(arguments, environment, materials);
        }
    }
}
