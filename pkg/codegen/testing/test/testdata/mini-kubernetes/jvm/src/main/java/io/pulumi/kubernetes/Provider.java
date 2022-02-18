// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.ProviderArgs;
import io.pulumi.kubernetes.Utilities;
import javax.annotation.Nullable;

/**
 * The provider type for the kubernetes package.
 * 
 */
@ResourceType(type="pulumi:providers:kubernetes")
public class Provider extends io.pulumi.resources.ProviderResource {
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
