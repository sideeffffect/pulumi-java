// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionEnvironmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionEnvironmentGetArgs Empty = new FunctionEnvironmentGetArgs();

    /**
     * Map of environment variables that are accessible from the function code during execution.
     * 
     */
    @Import(name="variables")
      private final @Nullable Output<Map<String,String>> variables;

    public Output<Map<String,String>> variables() {
        return this.variables == null ? Codegen.empty() : this.variables;
    }

    public FunctionEnvironmentGetArgs(@Nullable Output<Map<String,String>> variables) {
        this.variables = variables;
    }

    private FunctionEnvironmentGetArgs() {
        this.variables = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEnvironmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEnvironmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variables = defaults.variables;
        }

        public Builder variables(@Nullable Output<Map<String,String>> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(@Nullable Map<String,String> variables) {
            this.variables = Codegen.ofNullable(variables);
            return this;
        }        public FunctionEnvironmentGetArgs build() {
            return new FunctionEnvironmentGetArgs(variables);
        }
    }
}
