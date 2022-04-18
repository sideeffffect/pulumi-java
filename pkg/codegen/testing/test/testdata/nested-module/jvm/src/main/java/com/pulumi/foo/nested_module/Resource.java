// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.foo.nested_module;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.foo.Utilities;
import com.pulumi.foo.nested_module.ResourceArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="foo:nested/module:Resource")
public class Resource extends com.pulumi.resources.CustomResource {
    @Export(name="bar", type=String.class, parameters={})
    private Output</* @Nullable */ String> bar;

    public Output</* @Nullable */ String> bar() {
        return this.bar;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Resource(String name) {
        this(name, ResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Resource(String name, @Nullable ResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resource(String name, @Nullable ResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("foo:nested/module:Resource", name, args == null ? ResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Resource(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("foo:nested/module:Resource", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "bar"
            ))
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
    public static Resource get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Resource(name, id, options);
    }
}
