// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sagemaker.ModelQualityJobDefinitionArgs;
import com.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionModelQualityAppSpecification;
import com.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionModelQualityBaselineConfig;
import com.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionModelQualityJobInput;
import com.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionMonitoringOutputConfig;
import com.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionMonitoringResources;
import com.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionNetworkConfig;
import com.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionStoppingCondition;
import com.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::ModelQualityJobDefinition
 * 
 */
@ResourceType(type="aws-native:sagemaker:ModelQualityJobDefinition")
public class ModelQualityJobDefinition extends com.pulumi.resources.CustomResource {
    /**
     * The time at which the job definition was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time at which the job definition was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @Export(name="jobDefinitionArn", type=String.class, parameters={})
    private Output<String> jobDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of job definition.
     * 
     */
    public Output<String> jobDefinitionArn() {
        return this.jobDefinitionArn;
    }
    @Export(name="jobDefinitionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> jobDefinitionName;

    public Output<Optional<String>> jobDefinitionName() {
        return Codegen.optional(this.jobDefinitionName);
    }
    @Export(name="jobResources", type=ModelQualityJobDefinitionMonitoringResources.class, parameters={})
    private Output<ModelQualityJobDefinitionMonitoringResources> jobResources;

    public Output<ModelQualityJobDefinitionMonitoringResources> jobResources() {
        return this.jobResources;
    }
    @Export(name="modelQualityAppSpecification", type=ModelQualityJobDefinitionModelQualityAppSpecification.class, parameters={})
    private Output<ModelQualityJobDefinitionModelQualityAppSpecification> modelQualityAppSpecification;

    public Output<ModelQualityJobDefinitionModelQualityAppSpecification> modelQualityAppSpecification() {
        return this.modelQualityAppSpecification;
    }
    @Export(name="modelQualityBaselineConfig", type=ModelQualityJobDefinitionModelQualityBaselineConfig.class, parameters={})
    private Output</* @Nullable */ ModelQualityJobDefinitionModelQualityBaselineConfig> modelQualityBaselineConfig;

    public Output<Optional<ModelQualityJobDefinitionModelQualityBaselineConfig>> modelQualityBaselineConfig() {
        return Codegen.optional(this.modelQualityBaselineConfig);
    }
    @Export(name="modelQualityJobInput", type=ModelQualityJobDefinitionModelQualityJobInput.class, parameters={})
    private Output<ModelQualityJobDefinitionModelQualityJobInput> modelQualityJobInput;

    public Output<ModelQualityJobDefinitionModelQualityJobInput> modelQualityJobInput() {
        return this.modelQualityJobInput;
    }
    @Export(name="modelQualityJobOutputConfig", type=ModelQualityJobDefinitionMonitoringOutputConfig.class, parameters={})
    private Output<ModelQualityJobDefinitionMonitoringOutputConfig> modelQualityJobOutputConfig;

    public Output<ModelQualityJobDefinitionMonitoringOutputConfig> modelQualityJobOutputConfig() {
        return this.modelQualityJobOutputConfig;
    }
    @Export(name="networkConfig", type=ModelQualityJobDefinitionNetworkConfig.class, parameters={})
    private Output</* @Nullable */ ModelQualityJobDefinitionNetworkConfig> networkConfig;

    public Output<Optional<ModelQualityJobDefinitionNetworkConfig>> networkConfig() {
        return Codegen.optional(this.networkConfig);
    }
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    @Export(name="stoppingCondition", type=ModelQualityJobDefinitionStoppingCondition.class, parameters={})
    private Output</* @Nullable */ ModelQualityJobDefinitionStoppingCondition> stoppingCondition;

    public Output<Optional<ModelQualityJobDefinitionStoppingCondition>> stoppingCondition() {
        return Codegen.optional(this.stoppingCondition);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ModelQualityJobDefinitionTag.class})
    private Output</* @Nullable */ List<ModelQualityJobDefinitionTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<ModelQualityJobDefinitionTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModelQualityJobDefinition(String name) {
        this(name, ModelQualityJobDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModelQualityJobDefinition(String name, ModelQualityJobDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModelQualityJobDefinition(String name, ModelQualityJobDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelQualityJobDefinition", name, args == null ? ModelQualityJobDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ModelQualityJobDefinition(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelQualityJobDefinition", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ModelQualityJobDefinition get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ModelQualityJobDefinition(name, id, options);
    }
}
