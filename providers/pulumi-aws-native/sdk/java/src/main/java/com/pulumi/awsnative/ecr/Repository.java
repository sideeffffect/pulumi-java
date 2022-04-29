// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ecr.RepositoryArgs;
import com.pulumi.awsnative.ecr.enums.RepositoryImageTagMutability;
import com.pulumi.awsnative.ecr.outputs.RepositoryEncryptionConfiguration;
import com.pulumi.awsnative.ecr.outputs.RepositoryImageScanningConfiguration;
import com.pulumi.awsnative.ecr.outputs.RepositoryLifecyclePolicy;
import com.pulumi.awsnative.ecr.outputs.RepositoryTag;
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
 * The AWS::ECR::Repository resource specifies an Amazon Elastic Container Registry (Amazon ECR) repository, where users can push and pull Docker images. For more information, see https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ecr:Repository")
public class Repository extends CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="encryptionConfiguration", type=RepositoryEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ RepositoryEncryptionConfiguration> encryptionConfiguration;

    public Output<Optional<RepositoryEncryptionConfiguration>> encryptionConfiguration() {
        return Codegen.optional(this.encryptionConfiguration);
    }
    @Export(name="imageScanningConfiguration", type=RepositoryImageScanningConfiguration.class, parameters={})
    private Output</* @Nullable */ RepositoryImageScanningConfiguration> imageScanningConfiguration;

    public Output<Optional<RepositoryImageScanningConfiguration>> imageScanningConfiguration() {
        return Codegen.optional(this.imageScanningConfiguration);
    }
    /**
     * The image tag mutability setting for the repository.
     * 
     */
    @Export(name="imageTagMutability", type=RepositoryImageTagMutability.class, parameters={})
    private Output</* @Nullable */ RepositoryImageTagMutability> imageTagMutability;

    /**
     * @return The image tag mutability setting for the repository.
     * 
     */
    public Output<Optional<RepositoryImageTagMutability>> imageTagMutability() {
        return Codegen.optional(this.imageTagMutability);
    }
    @Export(name="lifecyclePolicy", type=RepositoryLifecyclePolicy.class, parameters={})
    private Output</* @Nullable */ RepositoryLifecyclePolicy> lifecyclePolicy;

    public Output<Optional<RepositoryLifecyclePolicy>> lifecyclePolicy() {
        return Codegen.optional(this.lifecyclePolicy);
    }
    /**
     * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app). If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the repository name. For more information, see https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html.
     * 
     */
    @Export(name="repositoryName", type=String.class, parameters={})
    private Output</* @Nullable */ String> repositoryName;

    /**
     * @return The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app). If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the repository name. For more information, see https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html.
     * 
     */
    public Output<Optional<String>> repositoryName() {
        return Codegen.optional(this.repositoryName);
    }
    /**
     * The JSON repository policy text to apply to the repository. For more information, see https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html in the Amazon Elastic Container Registry User Guide.
     * 
     */
    @Export(name="repositoryPolicyText", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> repositoryPolicyText;

    /**
     * @return The JSON repository policy text to apply to the repository. For more information, see https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html in the Amazon Elastic Container Registry User Guide.
     * 
     */
    public Output<Optional<Object>> repositoryPolicyText() {
        return Codegen.optional(this.repositoryPolicyText);
    }
    @Export(name="repositoryUri", type=String.class, parameters={})
    private Output<String> repositoryUri;

    public Output<String> repositoryUri() {
        return this.repositoryUri;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={RepositoryTag.class})
    private Output</* @Nullable */ List<RepositoryTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<RepositoryTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Repository(String name) {
        this(name, RepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Repository(String name, @Nullable RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, @Nullable RepositoryArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:ecr:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:ecr:Repository", name, null, makeResourceOptions(options, id));
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
    public static Repository get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Repository(name, id, options);
    }
}
