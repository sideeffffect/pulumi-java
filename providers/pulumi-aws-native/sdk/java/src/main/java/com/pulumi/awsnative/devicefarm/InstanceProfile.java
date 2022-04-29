// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.devicefarm.InstanceProfileArgs;
import com.pulumi.awsnative.devicefarm.outputs.InstanceProfileTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * AWS::DeviceFarm::InstanceProfile creates a new Device Farm Instance Profile
 * 
 */
@ResourceType(type="aws-native:devicefarm:InstanceProfile")
public class InstanceProfile extends CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="excludeAppPackagesFromCleanup", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> excludeAppPackagesFromCleanup;

    public Output<Optional<List<String>>> excludeAppPackagesFromCleanup() {
        return Codegen.optional(this.excludeAppPackagesFromCleanup);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="packageCleanup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> packageCleanup;

    public Output<Optional<Boolean>> packageCleanup() {
        return Codegen.optional(this.packageCleanup);
    }
    @Export(name="rebootAfterUse", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> rebootAfterUse;

    public Output<Optional<Boolean>> rebootAfterUse() {
        return Codegen.optional(this.rebootAfterUse);
    }
    @Export(name="tags", type=List.class, parameters={InstanceProfileTag.class})
    private Output</* @Nullable */ List<InstanceProfileTag>> tags;

    public Output<Optional<List<InstanceProfileTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceProfile(String name) {
        this(name, InstanceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:devicefarm:InstanceProfile", name, args == null ? InstanceProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceProfile(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:devicefarm:InstanceProfile", name, null, makeResourceOptions(options, id));
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
    public static InstanceProfile get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new InstanceProfile(name, id, options);
    }
}
