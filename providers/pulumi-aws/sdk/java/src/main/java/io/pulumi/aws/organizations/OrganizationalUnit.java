// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.organizations.OrganizationalUnitArgs;
import io.pulumi.aws.organizations.inputs.OrganizationalUnitState;
import io.pulumi.aws.organizations.outputs.OrganizationalUnitAccount;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an organizational unit.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS Organizations Organizational Units can be imported by using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:organizations/organizationalUnit:OrganizationalUnit example ou-1234567
 * ```
 * 
 */
@ResourceType(type="aws:organizations/organizationalUnit:OrganizationalUnit")
public class OrganizationalUnit extends io.pulumi.resources.CustomResource {
    /**
     * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
     * 
     */
    @Export(name="accounts", type=List.class, parameters={OrganizationalUnitAccount.class})
    private Output<List<OrganizationalUnitAccount>> accounts;

    /**
     * @return List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
     * 
     */
    public Output<List<OrganizationalUnitAccount>> accounts() {
        return this.accounts;
    }
    /**
     * ARN of the organizational unit
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the organizational unit
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name for the organizational unit
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the organizational unit
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ID of the parent organizational unit, which may be the root
     * 
     */
    @Export(name="parentId", type=String.class, parameters={})
    private Output<String> parentId;

    /**
     * @return ID of the parent organizational unit, which may be the root
     * 
     */
    public Output<String> parentId() {
        return this.parentId;
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
    public OrganizationalUnit(String name) {
        this(name, OrganizationalUnitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationalUnit(String name, OrganizationalUnitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationalUnit(String name, OrganizationalUnitArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:organizations/organizationalUnit:OrganizationalUnit", name, args == null ? OrganizationalUnitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationalUnit(String name, Output<String> id, @Nullable OrganizationalUnitState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:organizations/organizationalUnit:OrganizationalUnit", name, state, makeResourceOptions(options, id));
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
    public static OrganizationalUnit get(String name, Output<String> id, @Nullable OrganizationalUnitState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationalUnit(name, id, state, options);
    }
}
