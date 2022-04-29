// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.stepfunctions;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.stepfunctions.ActivityArgs;
import com.pulumi.awsnative.stepfunctions.outputs.ActivityTagsEntry;
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
 * Resource schema for Activity
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:stepfunctions:Activity")
public class Activity extends CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="tags", type=List.class, parameters={ActivityTagsEntry.class})
    private Output</* @Nullable */ List<ActivityTagsEntry>> tags;

    public Output<Optional<List<ActivityTagsEntry>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Activity(String name) {
        this(name, ActivityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Activity(String name, @Nullable ActivityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Activity(String name, @Nullable ActivityArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:stepfunctions:Activity", name, args == null ? ActivityArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Activity(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:stepfunctions:Activity", name, null, makeResourceOptions(options, id));
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
    public static Activity get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Activity(name, id, options);
    }
}
