// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sagemaker.PipelineArgs;
import com.pulumi.awsnative.sagemaker.outputs.ParallelismConfigurationProperties;
import com.pulumi.awsnative.sagemaker.outputs.PipelineTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::Pipeline
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:sagemaker:Pipeline")
public class Pipeline extends CustomResource {
    @Export(name="parallelismConfiguration", type=ParallelismConfigurationProperties.class, parameters={})
    private Output</* @Nullable */ ParallelismConfigurationProperties> parallelismConfiguration;

    public Output<Optional<ParallelismConfigurationProperties>> parallelismConfiguration() {
        return Codegen.optional(this.parallelismConfiguration);
    }
    @Export(name="pipelineDefinition", type=Object.class, parameters={})
    private Output<Object> pipelineDefinition;

    public Output<Object> pipelineDefinition() {
        return this.pipelineDefinition;
    }
    /**
     * The description of the Pipeline.
     * 
     */
    @Export(name="pipelineDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> pipelineDescription;

    /**
     * @return The description of the Pipeline.
     * 
     */
    public Output<Optional<String>> pipelineDescription() {
        return Codegen.optional(this.pipelineDescription);
    }
    /**
     * The display name of the Pipeline.
     * 
     */
    @Export(name="pipelineDisplayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> pipelineDisplayName;

    /**
     * @return The display name of the Pipeline.
     * 
     */
    public Output<Optional<String>> pipelineDisplayName() {
        return Codegen.optional(this.pipelineDisplayName);
    }
    /**
     * The name of the Pipeline.
     * 
     */
    @Export(name="pipelineName", type=String.class, parameters={})
    private Output<String> pipelineName;

    /**
     * @return The name of the Pipeline.
     * 
     */
    public Output<String> pipelineName() {
        return this.pipelineName;
    }
    /**
     * Role Arn
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return Role Arn
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    @Export(name="tags", type=List.class, parameters={PipelineTag.class})
    private Output</* @Nullable */ List<PipelineTag>> tags;

    public Output<Optional<List<PipelineTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:sagemaker:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:sagemaker:Pipeline", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Pipeline get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Pipeline(name, id, options);
    }
}
