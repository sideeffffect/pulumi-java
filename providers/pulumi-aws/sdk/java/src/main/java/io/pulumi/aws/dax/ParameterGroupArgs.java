// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dax;

import io.pulumi.aws.dax.inputs.ParameterGroupParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterGroupArgs Empty = new ParameterGroupArgs();

    /**
     * A description of the parameter group.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the parameter group.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parameters of the parameter group.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<ParameterGroupParameterArgs>> parameters;

    public Input<List<ParameterGroupParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public ParameterGroupArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<ParameterGroupParameterArgs>> parameters) {
        this.description = description;
        this.name = name;
        this.parameters = parameters;
    }

    private ParameterGroupArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ParameterGroupParameterArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder parameters(@Nullable Input<List<ParameterGroupParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<ParameterGroupParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }
        public ParameterGroupArgs build() {
            return new ParameterGroupArgs(description, name, parameters);
        }
    }
}
