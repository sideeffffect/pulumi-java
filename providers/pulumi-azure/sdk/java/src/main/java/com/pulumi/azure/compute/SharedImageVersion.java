// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.SharedImageVersionArgs;
import com.pulumi.azure.compute.inputs.SharedImageVersionState;
import com.pulumi.azure.compute.outputs.SharedImageVersionTargetRegion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Version of a Shared Image within a Shared Image Gallery.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var existingImage = Output.of(ComputeFunctions.getImage(GetImageArgs.builder()
 *             .name(&#34;search-api&#34;)
 *             .resourceGroupName(&#34;packerimages&#34;)
 *             .build()));
 * 
 *         final var existingSharedImage = Output.of(ComputeFunctions.getSharedImage(GetSharedImageArgs.builder()
 *             .name(&#34;existing-image&#34;)
 *             .galleryName(&#34;existing_gallery&#34;)
 *             .resourceGroupName(&#34;existing-resources&#34;)
 *             .build()));
 * 
 *         var example = new SharedImageVersion(&#34;example&#34;, SharedImageVersionArgs.builder()        
 *             .galleryName(existingSharedImage.apply(getSharedImageResult -&gt; getSharedImageResult.getGalleryName()))
 *             .imageName(existingSharedImage.apply(getSharedImageResult -&gt; getSharedImageResult.getName()))
 *             .resourceGroupName(existingSharedImage.apply(getSharedImageResult -&gt; getSharedImageResult.getResourceGroupName()))
 *             .location(existingSharedImage.apply(getSharedImageResult -&gt; getSharedImageResult.getLocation()))
 *             .managedImageId(existingImage.apply(getImageResult -&gt; getImageResult.getId()))
 *             .targetRegions(SharedImageVersionTargetRegion.builder()
 *                 .name(existingSharedImage.apply(getSharedImageResult -&gt; getSharedImageResult.getLocation()))
 *                 .regionalReplicaCount(5)
 *                 .storageAccountType(&#34;Standard_LRS&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Shared Image Versions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/sharedImageVersion:SharedImageVersion version /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/galleries/gallery1/images/image1/versions/1.2.3
 * ```
 * 
 */
@ResourceType(type="azure:compute/sharedImageVersion:SharedImageVersion")
public class SharedImageVersion extends com.pulumi.resources.CustomResource {
    /**
     * Should this Image Version be excluded from the `latest` filter? If set to `true` this Image Version won&#39;t be returned for the `latest` version. Defaults to `false`.
     * 
     */
    @Export(name="excludeFromLatest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> excludeFromLatest;

    /**
     * @return Should this Image Version be excluded from the `latest` filter? If set to `true` this Image Version won&#39;t be returned for the `latest` version. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> excludeFromLatest() {
        return Codegen.optional(this.excludeFromLatest);
    }
    /**
     * The name of the Shared Image Gallery in which the Shared Image exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="galleryName", type=String.class, parameters={})
    private Output<String> galleryName;

    /**
     * @return The name of the Shared Image Gallery in which the Shared Image exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> galleryName() {
        return this.galleryName;
    }
    /**
     * The name of the Shared Image within the Shared Image Gallery in which this Version should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="imageName", type=String.class, parameters={})
    private Output<String> imageName;

    /**
     * @return The name of the Shared Image within the Shared Image Gallery in which this Version should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> imageName() {
        return this.imageName;
    }
    /**
     * The Azure Region in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The ID of the Managed Image or Virtual Machine ID which should be used for this Shared Image Version. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="managedImageId", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedImageId;

    /**
     * @return The ID of the Managed Image or Virtual Machine ID which should be used for this Shared Image Version. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> managedImageId() {
        return Codegen.optional(this.managedImageId);
    }
    /**
     * The version number for this Image Version, such as `1.0.0`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The version number for this Image Version, such as `1.0.0`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the OS disk snapshot which should be used for this Shared Image Version. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="osDiskSnapshotId", type=String.class, parameters={})
    private Output</* @Nullable */ String> osDiskSnapshotId;

    /**
     * @return The ID of the OS disk snapshot which should be used for this Shared Image Version. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> osDiskSnapshotId() {
        return Codegen.optional(this.osDiskSnapshotId);
    }
    /**
     * The name of the Resource Group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A collection of tags which should be applied to this resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A collection of tags which should be applied to this resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * One or more `target_region` blocks as documented below.
     * 
     */
    @Export(name="targetRegions", type=List.class, parameters={SharedImageVersionTargetRegion.class})
    private Output<List<SharedImageVersionTargetRegion>> targetRegions;

    /**
     * @return One or more `target_region` blocks as documented below.
     * 
     */
    public Output<List<SharedImageVersionTargetRegion>> targetRegions() {
        return this.targetRegions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedImageVersion(String name) {
        this(name, SharedImageVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedImageVersion(String name, SharedImageVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedImageVersion(String name, SharedImageVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/sharedImageVersion:SharedImageVersion", name, args == null ? SharedImageVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SharedImageVersion(String name, Output<String> id, @Nullable SharedImageVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/sharedImageVersion:SharedImageVersion", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SharedImageVersion get(String name, Output<String> id, @Nullable SharedImageVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedImageVersion(name, id, state, options);
    }
}
