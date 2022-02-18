// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.example.ToyStoreArgs;
import io.pulumi.example.Utilities;
import io.pulumi.example.outputs.Chew;
import io.pulumi.example.outputs.Laser;
import io.pulumi.example.outputs.Toy;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="example::ToyStore")
public class ToyStore extends io.pulumi.resources.CustomResource {
    @OutputExport(name="chew", type=Chew.class, parameters={})
    private Output</* @Nullable */ Chew> chew;

    public Output</* @Nullable */ Chew> getChew() {
        return this.chew;
    }
    @OutputExport(name="laser", type=Laser.class, parameters={})
    private Output</* @Nullable */ Laser> laser;

    public Output</* @Nullable */ Laser> getLaser() {
        return this.laser;
    }
    @OutputExport(name="stuff", type=List.class, parameters={Toy.class})
    private Output</* @Nullable */ List<Toy>> stuff;

    public Output</* @Nullable */ List<Toy>> getStuff() {
        return this.stuff;
    }
    @OutputExport(name="wanted", type=List.class, parameters={Toy.class})
    private Output</* @Nullable */ List<Toy>> wanted;

    public Output</* @Nullable */ List<Toy>> getWanted() {
        return this.wanted;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ToyStore(String name, @Nullable ToyStoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::ToyStore", name, args == null ? ToyStoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ToyStore(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::ToyStore", name, null, makeResourceOptions(options, id));
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
    public static ToyStore get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ToyStore(name, id, options);
    }
}
