// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.emr.SecurityConfigurationArgs;
import io.pulumi.aws.emr.inputs.SecurityConfigurationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS EMR Security Configurations
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EMR Security Configurations can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:emr/securityConfiguration:SecurityConfiguration sc example-sc-name
 * ```
 * 
 */
@ResourceType(type="aws:emr/securityConfiguration:SecurityConfiguration")
public class SecurityConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * A JSON formatted Security Configuration
     * 
     */
    @Export(name="configuration", type=String.class, parameters={})
    private Output<String> configuration;

    /**
     * @return A JSON formatted Security Configuration
     * 
     */
    public Output<String> configuration() {
        return this.configuration;
    }
    /**
     * Date the Security Configuration was created
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return Date the Security Configuration was created
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The name of the EMR Security Configuration. By default generated by this provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the EMR Security Configuration. By default generated by this provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public Output</* @Nullable */ String> namePrefix() {
        return this.namePrefix;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityConfiguration(String name) {
        this(name, SecurityConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityConfiguration(String name, SecurityConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityConfiguration(String name, SecurityConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/securityConfiguration:SecurityConfiguration", name, args == null ? SecurityConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityConfiguration(String name, Output<String> id, @Nullable SecurityConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/securityConfiguration:SecurityConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SecurityConfiguration get(String name, Output<String> id, @Nullable SecurityConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityConfiguration(name, id, state, options);
    }
}
