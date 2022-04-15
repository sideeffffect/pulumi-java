// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssoadmin.PermissionSetArgs;
import io.pulumi.aws.ssoadmin.inputs.PermissionSetState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Single Sign-On (SSO) Permission Set resource
 * 
 * > **NOTE:** Updating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
 * 
 * ## Import
 * 
 * SSO Permission Sets can be imported using the `arn` and `instance_arn` separated by a comma (`,`) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssoadmin/permissionSet:PermissionSet example arn:aws:sso:::permissionSet/ssoins-2938j0x8920sbj72/ps-80383020jr9302rk,arn:aws:sso:::instance/ssoins-2938j0x8920sbj72
 * ```
 * 
 */
@ResourceType(type="aws:ssoadmin/permissionSet:PermissionSet")
public class PermissionSet extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date the Permission Set was created in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The date the Permission Set was created in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * The description of the Permission Set.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Permission Set.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Export(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }
    /**
     * The name of the Permission Set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Permission Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The relay state URL used to redirect users within the application during the federation authentication process.
     * 
     */
    @Export(name="relayState", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayState;

    /**
     * @return The relay state URL used to redirect users within the application during the federation authentication process.
     * 
     */
    public Output</* @Nullable */ String> relayState() {
        return this.relayState;
    }
    /**
     * The length of time that the application user sessions are valid in the ISO-8601 standard. Default: `PT1H`.
     * 
     */
    @Export(name="sessionDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> sessionDuration;

    /**
     * @return The length of time that the application user sessions are valid in the ISO-8601 standard. Default: `PT1H`.
     * 
     */
    public Output</* @Nullable */ String> sessionDuration() {
        return this.sessionDuration;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
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
    public PermissionSet(String name, PermissionSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/permissionSet:PermissionSet", name, args == null ? PermissionSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PermissionSet(String name, Output<String> id, @Nullable PermissionSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/permissionSet:PermissionSet", name, state, makeResourceOptions(options, id));
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
    public static PermissionSet get(String name, Output<String> id, @Nullable PermissionSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PermissionSet(name, id, state, options);
    }
}
