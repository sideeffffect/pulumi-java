// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionS3OutputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


/**
 * The output object for a monitoring job.
 * 
 */
public final class ModelBiasJobDefinitionMonitoringOutputArgs extends ResourceArgs {

    public static final ModelBiasJobDefinitionMonitoringOutputArgs Empty = new ModelBiasJobDefinitionMonitoringOutputArgs();

    @Import(name="s3Output", required=true)
    private Output<ModelBiasJobDefinitionS3OutputArgs> s3Output;

    public Output<ModelBiasJobDefinitionS3OutputArgs> s3Output() {
        return this.s3Output;
    }

    private ModelBiasJobDefinitionMonitoringOutputArgs() {}

    private ModelBiasJobDefinitionMonitoringOutputArgs(ModelBiasJobDefinitionMonitoringOutputArgs $) {
        this.s3Output = $.s3Output;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelBiasJobDefinitionMonitoringOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelBiasJobDefinitionMonitoringOutputArgs $;

        public Builder() {
            $ = new ModelBiasJobDefinitionMonitoringOutputArgs();
        }

        public Builder(ModelBiasJobDefinitionMonitoringOutputArgs defaults) {
            $ = new ModelBiasJobDefinitionMonitoringOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder s3Output(Output<ModelBiasJobDefinitionS3OutputArgs> s3Output) {
            $.s3Output = s3Output;
            return this;
        }

        public Builder s3Output(ModelBiasJobDefinitionS3OutputArgs s3Output) {
            return s3Output(Output.of(s3Output));
        }

        public ModelBiasJobDefinitionMonitoringOutputArgs build() {
            $.s3Output = Objects.requireNonNull($.s3Output, "expected parameter 's3Output' to be non-null");
            return $;
        }
    }

}
