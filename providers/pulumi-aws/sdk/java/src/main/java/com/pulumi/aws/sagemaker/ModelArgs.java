// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.sagemaker.inputs.ModelContainerArgs;
import com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs;
import com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs;
import com.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
     * 
     */
    @Import(name="containers")
    private @Nullable Output<List<ModelContainerArgs>> containers;

    public Optional<Output<List<ModelContainerArgs>>> containers() {
        return Optional.ofNullable(this.containers);
    }

    /**
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * 
     */
    @Import(name="enableNetworkIsolation")
    private @Nullable Output<Boolean> enableNetworkIsolation;

    public Optional<Output<Boolean>> enableNetworkIsolation() {
        return Optional.ofNullable(this.enableNetworkIsolation);
    }

    /**
     * A role that SageMaker can assume to access model artifacts and docker images for deployment.
     * 
     */
    @Import(name="executionRoleArn", required=true)
    private Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
     * 
     */
    @Import(name="inferenceExecutionConfig")
    private @Nullable Output<ModelInferenceExecutionConfigArgs> inferenceExecutionConfig;

    public Optional<Output<ModelInferenceExecutionConfigArgs>> inferenceExecutionConfig() {
        return Optional.ofNullable(this.inferenceExecutionConfig);
    }

    /**
     * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * 
     */
    @Import(name="primaryContainer")
    private @Nullable Output<ModelPrimaryContainerArgs> primaryContainer;

    public Optional<Output<ModelPrimaryContainerArgs>> primaryContainer() {
        return Optional.ofNullable(this.primaryContainer);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
     * 
     */
    @Import(name="vpcConfig")
    private @Nullable Output<ModelVpcConfigArgs> vpcConfig;

    public Optional<Output<ModelVpcConfigArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    private ModelArgs() {}

    private ModelArgs(ModelArgs $) {
        this.containers = $.containers;
        this.enableNetworkIsolation = $.enableNetworkIsolation;
        this.executionRoleArn = $.executionRoleArn;
        this.inferenceExecutionConfig = $.inferenceExecutionConfig;
        this.name = $.name;
        this.primaryContainer = $.primaryContainer;
        this.tags = $.tags;
        this.vpcConfig = $.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelArgs $;

        public Builder() {
            $ = new ModelArgs();
        }

        public Builder(ModelArgs defaults) {
            $ = new ModelArgs(Objects.requireNonNull(defaults));
        }

        public Builder containers(@Nullable Output<List<ModelContainerArgs>> containers) {
            $.containers = containers;
            return this;
        }

        public Builder containers(List<ModelContainerArgs> containers) {
            return containers(Output.of(containers));
        }

        public Builder containers(ModelContainerArgs... containers) {
            return containers(List.of(containers));
        }

        public Builder enableNetworkIsolation(@Nullable Output<Boolean> enableNetworkIsolation) {
            $.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        public Builder enableNetworkIsolation(Boolean enableNetworkIsolation) {
            return enableNetworkIsolation(Output.of(enableNetworkIsolation));
        }

        public Builder executionRoleArn(Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        public Builder inferenceExecutionConfig(@Nullable Output<ModelInferenceExecutionConfigArgs> inferenceExecutionConfig) {
            $.inferenceExecutionConfig = inferenceExecutionConfig;
            return this;
        }

        public Builder inferenceExecutionConfig(ModelInferenceExecutionConfigArgs inferenceExecutionConfig) {
            return inferenceExecutionConfig(Output.of(inferenceExecutionConfig));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder primaryContainer(@Nullable Output<ModelPrimaryContainerArgs> primaryContainer) {
            $.primaryContainer = primaryContainer;
            return this;
        }

        public Builder primaryContainer(ModelPrimaryContainerArgs primaryContainer) {
            return primaryContainer(Output.of(primaryContainer));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder vpcConfig(@Nullable Output<ModelVpcConfigArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(ModelVpcConfigArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        public ModelArgs build() {
            $.executionRoleArn = Objects.requireNonNull($.executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
            return $;
        }
    }

}
