// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.speech.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.speech.v1.CustomClassArgs;
import com.pulumi.googlenative.speech.v1.outputs.ClassItemResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create a custom class.
 * 
 */
@ResourceType(type="google-native:speech/v1:CustomClass")
public class CustomClass extends com.pulumi.resources.CustomResource {
    /**
     * If this custom class is a resource, the custom_class_id is the resource id of the CustomClass. Case sensitive.
     * 
     */
    @Export(name="customClassId", type=String.class, parameters={})
    private Output<String> customClassId;

    /**
     * @return If this custom class is a resource, the custom_class_id is the resource id of the CustomClass. Case sensitive.
     * 
     */
    public Output<String> customClassId() {
        return this.customClassId;
    }
    /**
     * A collection of class items.
     * 
     */
    @Export(name="items", type=List.class, parameters={ClassItemResponse.class})
    private Output<List<ClassItemResponse>> items;

    /**
     * @return A collection of class items.
     * 
     */
    public Output<List<ClassItemResponse>> items() {
        return this.items;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the custom class.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the custom class.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomClass(String name) {
        this(name, CustomClassArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomClass(String name, CustomClassArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomClass(String name, CustomClassArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:speech/v1:CustomClass", name, args == null ? CustomClassArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomClass(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:speech/v1:CustomClass", name, null, makeResourceOptions(options, id));
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
    public static CustomClass get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomClass(name, id, options);
    }
}
