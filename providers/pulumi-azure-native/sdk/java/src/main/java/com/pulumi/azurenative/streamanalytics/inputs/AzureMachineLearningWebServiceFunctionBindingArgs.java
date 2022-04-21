// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceInputsArgs;
import com.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceOutputColumnArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The binding to an Azure Machine Learning web service.
 * 
 */
public final class AzureMachineLearningWebServiceFunctionBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureMachineLearningWebServiceFunctionBindingArgs Empty = new AzureMachineLearningWebServiceFunctionBindingArgs();

    /**
     * The API key used to authenticate with Request-Response endpoint.
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS execute request. Default is 1000.
     * 
     */
    @Import(name="batchSize")
    private @Nullable Output<Integer> batchSize;

    public Optional<Output<Integer>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    /**
     * The Request-Response execute endpoint of the Azure Machine Learning web service. Find out more here: https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The inputs for the Azure Machine Learning web service endpoint.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<AzureMachineLearningWebServiceInputsArgs> inputs;

    public Optional<Output<AzureMachineLearningWebServiceInputsArgs>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
     */
    @Import(name="outputs")
    private @Nullable Output<List<AzureMachineLearningWebServiceOutputColumnArgs>> outputs;

    public Optional<Output<List<AzureMachineLearningWebServiceOutputColumnArgs>>> outputs() {
        return Optional.ofNullable(this.outputs);
    }

    /**
     * Indicates the function binding type.
     * Expected value is &#39;Microsoft.MachineLearning/WebService&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private AzureMachineLearningWebServiceFunctionBindingArgs() {}

    private AzureMachineLearningWebServiceFunctionBindingArgs(AzureMachineLearningWebServiceFunctionBindingArgs $) {
        this.apiKey = $.apiKey;
        this.batchSize = $.batchSize;
        this.endpoint = $.endpoint;
        this.inputs = $.inputs;
        this.outputs = $.outputs;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMachineLearningWebServiceFunctionBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMachineLearningWebServiceFunctionBindingArgs $;

        public Builder() {
            $ = new AzureMachineLearningWebServiceFunctionBindingArgs();
        }

        public Builder(AzureMachineLearningWebServiceFunctionBindingArgs defaults) {
            $ = new AzureMachineLearningWebServiceFunctionBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        public Builder batchSize(Integer batchSize) {
            return batchSize(Output.of(batchSize));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder inputs(@Nullable Output<AzureMachineLearningWebServiceInputsArgs> inputs) {
            $.inputs = inputs;
            return this;
        }

        public Builder inputs(AzureMachineLearningWebServiceInputsArgs inputs) {
            return inputs(Output.of(inputs));
        }

        public Builder outputs(@Nullable Output<List<AzureMachineLearningWebServiceOutputColumnArgs>> outputs) {
            $.outputs = outputs;
            return this;
        }

        public Builder outputs(List<AzureMachineLearningWebServiceOutputColumnArgs> outputs) {
            return outputs(Output.of(outputs));
        }

        public Builder outputs(AzureMachineLearningWebServiceOutputColumnArgs... outputs) {
            return outputs(List.of(outputs));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureMachineLearningWebServiceFunctionBindingArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
