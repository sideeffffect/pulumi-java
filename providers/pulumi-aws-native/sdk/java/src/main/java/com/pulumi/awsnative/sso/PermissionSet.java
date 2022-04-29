// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sso.PermissionSetArgs;
import com.pulumi.awsnative.sso.outputs.PermissionSetTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for SSO PermissionSet
 * 
 */
@ResourceType(type="aws-native:sso:PermissionSet")
public class PermissionSet extends CustomResource {
    /**
     * The permission set description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The permission set description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The inline policy to put in permission set.
     * 
     */
    @Export(name="inlinePolicy", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> inlinePolicy;

    /**
     * @return The inline policy to put in permission set.
     * 
     */
    public Output<Optional<Object>> inlinePolicy() {
        return Codegen.optional(this.inlinePolicy);
    }
    /**
     * The sso instance arn that the permission set is owned.
     * 
     */
    @Export(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The sso instance arn that the permission set is owned.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }
    @Export(name="managedPolicies", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> managedPolicies;

    public Output<Optional<List<String>>> managedPolicies() {
        return Codegen.optional(this.managedPolicies);
    }
    /**
     * The name you want to assign to this permission set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name you want to assign to this permission set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The permission set that the policy will be attached to
     * 
     */
    @Export(name="permissionSetArn", type=String.class, parameters={})
    private Output<String> permissionSetArn;

    /**
     * @return The permission set that the policy will be attached to
     * 
     */
    public Output<String> permissionSetArn() {
        return this.permissionSetArn;
    }
    /**
     * The relay state URL that redirect links to any service in the AWS Management Console.
     * 
     */
    @Export(name="relayStateType", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayStateType;

    /**
     * @return The relay state URL that redirect links to any service in the AWS Management Console.
     * 
     */
    public Output<Optional<String>> relayStateType() {
        return Codegen.optional(this.relayStateType);
    }
    /**
     * The length of time that a user can be signed in to an AWS account.
     * 
     */
    @Export(name="sessionDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> sessionDuration;

    /**
     * @return The length of time that a user can be signed in to an AWS account.
     * 
     */
    public Output<Optional<String>> sessionDuration() {
        return Codegen.optional(this.sessionDuration);
    }
    @Export(name="tags", type=List.class, parameters={PermissionSetTag.class})
    private Output</* @Nullable */ List<PermissionSetTag>> tags;

    public Output<Optional<List<PermissionSetTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PermissionSet(String name) {
        this(name, PermissionSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PermissionSet(String name, PermissionSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PermissionSet(String name, PermissionSetArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:sso:PermissionSet", name, args == null ? PermissionSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PermissionSet(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:sso:PermissionSet", name, null, makeResourceOptions(options, id));
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
    public static PermissionSet get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new PermissionSet(name, id, options);
    }
}
