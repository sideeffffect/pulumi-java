// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionEnvironmentGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionEnvironmentGetArgs Empty = new FunctionEnvironmentGetArgs();

    /**
     * Map of environment variables that are accessible from the function code during execution.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<Map<String,String>> variables;

    public Optional<Output<Map<String,String>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private FunctionEnvironmentGetArgs() {}

    private FunctionEnvironmentGetArgs(FunctionEnvironmentGetArgs $) {
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionEnvironmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionEnvironmentGetArgs $;

        public Builder() {
            $ = new FunctionEnvironmentGetArgs();
        }

        public Builder(FunctionEnvironmentGetArgs defaults) {
            $ = new FunctionEnvironmentGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder variables(@Nullable Output<Map<String,String>> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(Map<String,String> variables) {
            return variables(Output.of(variables));
        }

        public FunctionEnvironmentGetArgs build() {
            return $;
        }
    }

}
