// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A function&#39;s environment variable settings.
 * 
 */
public final class FunctionEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionEnvironmentArgs Empty = new FunctionEnvironmentArgs();

    /**
     * Environment variable key-value pairs.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<Object> variables;

    public Optional<Output<Object>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private FunctionEnvironmentArgs() {}

    private FunctionEnvironmentArgs(FunctionEnvironmentArgs $) {
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionEnvironmentArgs $;

        public Builder() {
            $ = new FunctionEnvironmentArgs();
        }

        public Builder(FunctionEnvironmentArgs defaults) {
            $ = new FunctionEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder variables(@Nullable Output<Object> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(Object variables) {
            return variables(Output.of(variables));
        }

        public FunctionEnvironmentArgs build() {
            return $;
        }
    }

}
