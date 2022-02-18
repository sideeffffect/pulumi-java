// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.example.ResourceInputArgs;
import io.pulumi.example.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="example::ResourceInput")
public class ResourceInput extends io.pulumi.resources.CustomResource {
    @OutputExport(name="bar", type=String.class, parameters={})
    private Output</* @Nullable */ String> bar;

    public Output</* @Nullable */ String> getBar() {
        return this.bar;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceInput(String name, @Nullable ResourceInputArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::ResourceInput", name, args == null ? ResourceInputArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceInput(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::ResourceInput", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResourceInput get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceInput(name, id, options);
    }
}
