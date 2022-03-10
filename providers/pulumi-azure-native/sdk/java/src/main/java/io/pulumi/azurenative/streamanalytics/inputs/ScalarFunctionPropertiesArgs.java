// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceFunctionBindingArgs;
import io.pulumi.azurenative.streamanalytics.inputs.FunctionInputArgs;
import io.pulumi.azurenative.streamanalytics.inputs.FunctionOutputArgs;
import io.pulumi.azurenative.streamanalytics.inputs.JavaScriptFunctionBindingArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that are associated with a scalar function.
 * 
 */
public final class ScalarFunctionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalarFunctionPropertiesArgs Empty = new ScalarFunctionPropertiesArgs();

    /**
     * The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     * 
     */
    @InputImport(name="binding")
      private final @Nullable Input<Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs>> binding;

    public Input<Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs>> getBinding() {
        return this.binding == null ? Input.empty() : this.binding;
    }

    /**
     * A list of inputs describing the parameters of the function.
     * 
     */
    @InputImport(name="inputs")
      private final @Nullable Input<List<FunctionInputArgs>> inputs;

    public Input<List<FunctionInputArgs>> getInputs() {
        return this.inputs == null ? Input.empty() : this.inputs;
    }

    /**
     * The output of the function.
     * 
     */
    @InputImport(name="output")
      private final @Nullable Input<FunctionOutputArgs> output;

    public Input<FunctionOutputArgs> getOutput() {
        return this.output == null ? Input.empty() : this.output;
    }

    /**
     * Indicates the type of function.
     * Expected value is 'Scalar'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ScalarFunctionPropertiesArgs(
        @Nullable Input<Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs>> binding,
        @Nullable Input<List<FunctionInputArgs>> inputs,
        @Nullable Input<FunctionOutputArgs> output,
        Input<String> type) {
        this.binding = binding;
        this.inputs = inputs;
        this.output = output;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ScalarFunctionPropertiesArgs() {
        this.binding = Input.empty();
        this.inputs = Input.empty();
        this.output = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalarFunctionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs>> binding;
        private @Nullable Input<List<FunctionInputArgs>> inputs;
        private @Nullable Input<FunctionOutputArgs> output;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalarFunctionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binding = defaults.binding;
    	      this.inputs = defaults.inputs;
    	      this.output = defaults.output;
    	      this.type = defaults.type;
        }

        public Builder binding(@Nullable Input<Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs>> binding) {
            this.binding = binding;
            return this;
        }

        public Builder binding(@Nullable Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs> binding) {
            this.binding = Input.ofNullable(binding);
            return this;
        }

        public Builder inputs(@Nullable Input<List<FunctionInputArgs>> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder inputs(@Nullable List<FunctionInputArgs> inputs) {
            this.inputs = Input.ofNullable(inputs);
            return this;
        }

        public Builder output(@Nullable Input<FunctionOutputArgs> output) {
            this.output = output;
            return this;
        }

        public Builder output(@Nullable FunctionOutputArgs output) {
            this.output = Input.ofNullable(output);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ScalarFunctionPropertiesArgs build() {
            return new ScalarFunctionPropertiesArgs(binding, inputs, output, type);
        }
    }
}
