// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ses;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ses.ConfigurationSetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::SES::ConfigurationSet.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ses:ConfigurationSet")
public class ConfigurationSet extends CustomResource {
    /**
     * The name of the configuration set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the configuration set.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationSet(String name) {
        this(name, ConfigurationSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationSet(String name, @Nullable ConfigurationSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationSet(String name, @Nullable ConfigurationSetArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:ses:ConfigurationSet", name, args == null ? ConfigurationSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationSet(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:ses:ConfigurationSet", name, null, makeResourceOptions(options, id));
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
    public static ConfigurationSet get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ConfigurationSet(name, id, options);
    }
}
