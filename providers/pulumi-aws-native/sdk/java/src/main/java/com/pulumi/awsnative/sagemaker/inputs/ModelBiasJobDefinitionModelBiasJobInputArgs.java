// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionEndpointInputArgs;
import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


/**
 * The inputs for a monitoring job.
 * 
 */
public final class ModelBiasJobDefinitionModelBiasJobInputArgs extends ResourceArgs {

    public static final ModelBiasJobDefinitionModelBiasJobInputArgs Empty = new ModelBiasJobDefinitionModelBiasJobInputArgs();

    @Import(name="endpointInput", required=true)
    private Output<ModelBiasJobDefinitionEndpointInputArgs> endpointInput;

    public Output<ModelBiasJobDefinitionEndpointInputArgs> endpointInput() {
        return this.endpointInput;
    }

    @Import(name="groundTruthS3Input", required=true)
    private Output<ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input;

    public Output<ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input() {
        return this.groundTruthS3Input;
    }

    private ModelBiasJobDefinitionModelBiasJobInputArgs() {}

    private ModelBiasJobDefinitionModelBiasJobInputArgs(ModelBiasJobDefinitionModelBiasJobInputArgs $) {
        this.endpointInput = $.endpointInput;
        this.groundTruthS3Input = $.groundTruthS3Input;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelBiasJobDefinitionModelBiasJobInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelBiasJobDefinitionModelBiasJobInputArgs $;

        public Builder() {
            $ = new ModelBiasJobDefinitionModelBiasJobInputArgs();
        }

        public Builder(ModelBiasJobDefinitionModelBiasJobInputArgs defaults) {
            $ = new ModelBiasJobDefinitionModelBiasJobInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointInput(Output<ModelBiasJobDefinitionEndpointInputArgs> endpointInput) {
            $.endpointInput = endpointInput;
            return this;
        }

        public Builder endpointInput(ModelBiasJobDefinitionEndpointInputArgs endpointInput) {
            return endpointInput(Output.of(endpointInput));
        }

        public Builder groundTruthS3Input(Output<ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input) {
            $.groundTruthS3Input = groundTruthS3Input;
            return this;
        }

        public Builder groundTruthS3Input(ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs groundTruthS3Input) {
            return groundTruthS3Input(Output.of(groundTruthS3Input));
        }

        public ModelBiasJobDefinitionModelBiasJobInputArgs build() {
            $.endpointInput = Objects.requireNonNull($.endpointInput, "expected parameter 'endpointInput' to be non-null");
            $.groundTruthS3Input = Objects.requireNonNull($.groundTruthS3Input, "expected parameter 'groundTruthS3Input' to be non-null");
            return $;
        }
    }

}
