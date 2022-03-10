// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionEndpointInput;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionMonitoringGroundTruthS3Input;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ModelQualityJobDefinitionModelQualityJobInput {
    private final ModelQualityJobDefinitionEndpointInput endpointInput;
    private final ModelQualityJobDefinitionMonitoringGroundTruthS3Input groundTruthS3Input;

    @OutputCustomType.Constructor
    private ModelQualityJobDefinitionModelQualityJobInput(
        @OutputCustomType.Parameter("endpointInput") ModelQualityJobDefinitionEndpointInput endpointInput,
        @OutputCustomType.Parameter("groundTruthS3Input") ModelQualityJobDefinitionMonitoringGroundTruthS3Input groundTruthS3Input) {
        this.endpointInput = endpointInput;
        this.groundTruthS3Input = groundTruthS3Input;
    }

    public ModelQualityJobDefinitionEndpointInput getEndpointInput() {
        return this.endpointInput;
    }
    public ModelQualityJobDefinitionMonitoringGroundTruthS3Input getGroundTruthS3Input() {
        return this.groundTruthS3Input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionModelQualityJobInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelQualityJobDefinitionEndpointInput endpointInput;
        private ModelQualityJobDefinitionMonitoringGroundTruthS3Input groundTruthS3Input;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionModelQualityJobInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
    	      this.groundTruthS3Input = defaults.groundTruthS3Input;
        }

        public Builder endpointInput(ModelQualityJobDefinitionEndpointInput endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }

        public Builder groundTruthS3Input(ModelQualityJobDefinitionMonitoringGroundTruthS3Input groundTruthS3Input) {
            this.groundTruthS3Input = Objects.requireNonNull(groundTruthS3Input);
            return this;
        }
        public ModelQualityJobDefinitionModelQualityJobInput build() {
            return new ModelQualityJobDefinitionModelQualityJobInput(endpointInput, groundTruthS3Input);
        }
    }
}
