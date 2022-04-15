// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.imagebuilder.ImageArgs;
import io.pulumi.aws.imagebuilder.inputs.ImageState;
import io.pulumi.aws.imagebuilder.outputs.ImageImageTestsConfiguration;
import io.pulumi.aws.imagebuilder.outputs.ImageOutputResource;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Image Builder Image.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_imagebuilder_image` resources can be imported using the Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:imagebuilder/image:Image example arn:aws:imagebuilder:us-east-1:123456789012:image/example/1.0.0/1
 * ```
 * 
 */
@ResourceType(type="aws:imagebuilder/image:Image")
public class Image extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the image.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the image.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Date the image was created.
     * 
     */
    @Export(name="dateCreated", type=String.class, parameters={})
    private Output<String> dateCreated;

    /**
     * @return Date the image was created.
     * 
     */
    public Output<String> dateCreated() {
        return this.dateCreated;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    @Export(name="distributionConfigurationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> distributionConfigurationArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    public Output</* @Nullable */ String> distributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }
    /**
     * Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    @Export(name="enhancedImageMetadataEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enhancedImageMetadataEnabled;

    /**
     * @return Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> enhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    @Export(name="imageRecipeArn", type=String.class, parameters={})
    private Output<String> imageRecipeArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    public Output<String> imageRecipeArn() {
        return this.imageRecipeArn;
    }
    /**
     * Configuration block with image tests configuration. Detailed below.
     * 
     */
    @Export(name="imageTestsConfiguration", type=ImageImageTestsConfiguration.class, parameters={})
    private Output<ImageImageTestsConfiguration> imageTestsConfiguration;

    /**
     * @return Configuration block with image tests configuration. Detailed below.
     * 
     */
    public Output<ImageImageTestsConfiguration> imageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    @Export(name="infrastructureConfigurationArn", type=String.class, parameters={})
    private Output<String> infrastructureConfigurationArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    public Output<String> infrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * Name of the AMI.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the AMI.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Operating System version of the image.
     * 
     */
    @Export(name="osVersion", type=String.class, parameters={})
    private Output<String> osVersion;

    /**
     * @return Operating System version of the image.
     * 
     */
    public Output<String> osVersion() {
        return this.osVersion;
    }
    /**
     * List of objects with resources created by the image.
     * 
     */
    @Export(name="outputResources", type=List.class, parameters={ImageOutputResource.class})
    private Output<List<ImageOutputResource>> outputResources;

    /**
     * @return List of objects with resources created by the image.
     * 
     */
    public Output<List<ImageOutputResource>> outputResources() {
        return this.outputResources;
    }
    /**
     * Platform of the image.
     * 
     */
    @Export(name="platform", type=String.class, parameters={})
    private Output<String> platform;

    /**
     * @return Platform of the image.
     * 
     */
    public Output<String> platform() {
        return this.platform;
    }
    /**
     * Key-value map of resource tags for the Image Builder Image. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the Image Builder Image. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Version of the image.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Version of the image.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, ImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/image:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable ImageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/image:Image", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Image get(String name, Output<String> id, @Nullable ImageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}
