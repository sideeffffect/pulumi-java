// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.mediapackage.PackagingConfigurationArgs;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationCmafPackage;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationDashPackage;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationHlsPackage;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationMssPackage;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::MediaPackage::PackagingConfiguration
 * 
 */
@ResourceType(type="aws-native:mediapackage:PackagingConfiguration")
public class PackagingConfiguration extends CustomResource {
    /**
     * The ARN of the PackagingConfiguration.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the PackagingConfiguration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A CMAF packaging configuration.
     * 
     */
    @Export(name="cmafPackage", type=PackagingConfigurationCmafPackage.class, parameters={})
    private Output</* @Nullable */ PackagingConfigurationCmafPackage> cmafPackage;

    /**
     * @return A CMAF packaging configuration.
     * 
     */
    public Output<Optional<PackagingConfigurationCmafPackage>> cmafPackage() {
        return Codegen.optional(this.cmafPackage);
    }
    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
     */
    @Export(name="dashPackage", type=PackagingConfigurationDashPackage.class, parameters={})
    private Output</* @Nullable */ PackagingConfigurationDashPackage> dashPackage;

    /**
     * @return A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
     */
    public Output<Optional<PackagingConfigurationDashPackage>> dashPackage() {
        return Codegen.optional(this.dashPackage);
    }
    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     * 
     */
    @Export(name="hlsPackage", type=PackagingConfigurationHlsPackage.class, parameters={})
    private Output</* @Nullable */ PackagingConfigurationHlsPackage> hlsPackage;

    /**
     * @return An HTTP Live Streaming (HLS) packaging configuration.
     * 
     */
    public Output<Optional<PackagingConfigurationHlsPackage>> hlsPackage() {
        return Codegen.optional(this.hlsPackage);
    }
    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
     */
    @Export(name="mssPackage", type=PackagingConfigurationMssPackage.class, parameters={})
    private Output</* @Nullable */ PackagingConfigurationMssPackage> mssPackage;

    /**
     * @return A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
     */
    public Output<Optional<PackagingConfigurationMssPackage>> mssPackage() {
        return Codegen.optional(this.mssPackage);
    }
    /**
     * The ID of a PackagingGroup.
     * 
     */
    @Export(name="packagingGroupId", type=String.class, parameters={})
    private Output<String> packagingGroupId;

    /**
     * @return The ID of a PackagingGroup.
     * 
     */
    public Output<String> packagingGroupId() {
        return this.packagingGroupId;
    }
    /**
     * A collection of tags associated with a resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={PackagingConfigurationTag.class})
    private Output</* @Nullable */ List<PackagingConfigurationTag>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Output<Optional<List<PackagingConfigurationTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PackagingConfiguration(String name) {
        this(name, PackagingConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PackagingConfiguration(String name, PackagingConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PackagingConfiguration(String name, PackagingConfigurationArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:mediapackage:PackagingConfiguration", name, args == null ? PackagingConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PackagingConfiguration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:mediapackage:PackagingConfiguration", name, null, makeResourceOptions(options, id));
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
    public static PackagingConfiguration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new PackagingConfiguration(name, id, options);
    }
}
