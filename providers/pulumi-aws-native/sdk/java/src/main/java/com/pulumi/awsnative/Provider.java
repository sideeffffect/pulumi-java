// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative;

import com.pulumi.awsnative.ProviderArgs;
import com.pulumi.awsnative.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResourceOptions;
import com.pulumi.resources.ProviderResource;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the AWS native package. By default, resources use package-wide configuration settings, however an explicit `Provider` instance may be created and passed during resource construction to achieve fine-grained programmatic control over provider settings. See the [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:aws-native")
public class Provider extends ProviderResource {
    /**
     * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * 
     */
    @Export(name="profile", type=String.class, parameters={})
    private Output</* @Nullable */ String> profile;

    /**
     * @return The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * 
     */
    public Output<Optional<String>> profile() {
        return Codegen.optional(this.profile);
    }
    /**
     * The region where AWS operations will take place. Examples are `us-east-1`, `us-west-2`, etc.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region where AWS operations will take place. Examples are `us-east-1`, `us-west-2`, etc.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The path to the shared credentials file. If not set this defaults to `~/.aws/credentials`.
     * 
     */
    @Export(name="sharedCredentialsFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedCredentialsFile;

    /**
     * @return The path to the shared credentials file. If not set this defaults to `~/.aws/credentials`.
     * 
     */
    public Output<Optional<String>> sharedCredentialsFile() {
        return Codegen.optional(this.sharedCredentialsFile);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, ProviderArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
