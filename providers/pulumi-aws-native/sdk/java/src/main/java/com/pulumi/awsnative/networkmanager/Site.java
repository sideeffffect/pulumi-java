// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.networkmanager.SiteArgs;
import com.pulumi.awsnative.networkmanager.outputs.SiteLocation;
import com.pulumi.awsnative.networkmanager.outputs.SiteTag;
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
 * The AWS::NetworkManager::Site type describes a site.
 * 
 */
@ResourceType(type="aws-native:networkmanager:Site")
public class Site extends CustomResource {
    /**
     * The description of the site.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the site.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the global network.
     * 
     */
    @Export(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The location of the site.
     * 
     */
    @Export(name="location", type=SiteLocation.class, parameters={})
    private Output</* @Nullable */ SiteLocation> location;

    /**
     * @return The location of the site.
     * 
     */
    public Output<Optional<SiteLocation>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The Amazon Resource Name (ARN) of the site.
     * 
     */
    @Export(name="siteArn", type=String.class, parameters={})
    private Output<String> siteArn;

    /**
     * @return The Amazon Resource Name (ARN) of the site.
     * 
     */
    public Output<String> siteArn() {
        return this.siteArn;
    }
    /**
     * The ID of the site.
     * 
     */
    @Export(name="siteId", type=String.class, parameters={})
    private Output<String> siteId;

    /**
     * @return The ID of the site.
     * 
     */
    public Output<String> siteId() {
        return this.siteId;
    }
    /**
     * The tags for the site.
     * 
     */
    @Export(name="tags", type=List.class, parameters={SiteTag.class})
    private Output</* @Nullable */ List<SiteTag>> tags;

    /**
     * @return The tags for the site.
     * 
     */
    public Output<Optional<List<SiteTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Site(String name) {
        this(name, SiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Site(String name, SiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Site(String name, SiteArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:networkmanager:Site", name, args == null ? SiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Site(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:networkmanager:Site", name, null, makeResourceOptions(options, id));
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
    public static Site get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Site(name, id, options);
    }
}
