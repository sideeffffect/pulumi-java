// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs;
import io.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberState;
import io.pulumi.gcp.runtimeconfig.outputs.ConfigIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/configs/{{config}} * {{project}}/{{config}} * {{config}} Any variables not passed in the import command will be taken from the provider configuration. Runtime Configurator config IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:runtimeconfig/configIamMember:ConfigIamMember editor "projects/{{project}}/configs/{{config}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:runtimeconfig/configIamMember:ConfigIamMember editor "projects/{{project}}/configs/{{config}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:runtimeconfig/configIamMember:ConfigIamMember editor projects/{{project}}/configs/{{config}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:runtimeconfig/configIamMember:ConfigIamMember")
public class ConfigIamMember extends io.pulumi.resources.CustomResource {
    @Export(name="condition", type=ConfigIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ ConfigIamMemberCondition> condition;

    public Output</* @Nullable */ ConfigIamMemberCondition> condition() {
        return this.condition;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="config", type=String.class, parameters={})
    private Output<String> config;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> config() {
        return this.config;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.runtimeconfig.ConfigIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.runtimeconfig.ConfigIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigIamMember(String name) {
        this(name, ConfigIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigIamMember(String name, ConfigIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigIamMember(String name, ConfigIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:runtimeconfig/configIamMember:ConfigIamMember", name, args == null ? ConfigIamMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigIamMember(String name, Output<String> id, @Nullable ConfigIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:runtimeconfig/configIamMember:ConfigIamMember", name, state, makeResourceOptions(options, id));
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
    public static ConfigIamMember get(String name, Output<String> id, @Nullable ConfigIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigIamMember(name, id, state, options);
    }
}
