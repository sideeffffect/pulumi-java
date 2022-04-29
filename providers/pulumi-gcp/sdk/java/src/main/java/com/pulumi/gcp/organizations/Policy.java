// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.PolicyArgs;
import com.pulumi.gcp.organizations.inputs.PolicyState;
import com.pulumi.gcp.organizations.outputs.PolicyBooleanPolicy;
import com.pulumi.gcp.organizations.outputs.PolicyListPolicy;
import com.pulumi.gcp.organizations.outputs.PolicyRestorePolicy;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows management of Organization Policies for a Google Cloud Organization.
 * 
 * &gt; **Warning:** This resource has been superseded by `gcp.orgpolicy.Policy`. `gcp.orgpolicy.Policy` uses Organization Policy API V2 instead of Cloud Resource Manager API V1 and it supports additional features such as tags and conditions.
 * 
 * To get more information about Organization Policies, see:
 * 
 * * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v1/organizations/setOrgPolicy)
 * * How-to Guides
 *     * [Introduction to the Organization Policy Service](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Organization Policies can be imported using the `org_id` and the `constraint`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/policy:Policy services_policy 123456789/constraints/serviceuser.services
 * ```
 * 
 *  It is all right if the constraint contains a slash, as in the example above.
 * 
 */
@ResourceType(type="gcp:organizations/policy:Policy")
public class Policy extends CustomResource {
    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * 
     */
    @Export(name="booleanPolicy", type=PolicyBooleanPolicy.class, parameters={})
    private Output</* @Nullable */ PolicyBooleanPolicy> booleanPolicy;

    /**
     * @return A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * 
     */
    public Output<Optional<PolicyBooleanPolicy>> booleanPolicy() {
        return Codegen.optional(this.booleanPolicy);
    }
    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @Export(name="constraint", type=String.class, parameters={})
    private Output<String> constraint;

    /**
     * @return The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    public Output<String> constraint() {
        return this.constraint;
    }
    /**
     * (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    @Export(name="listPolicy", type=PolicyListPolicy.class, parameters={})
    private Output</* @Nullable */ PolicyListPolicy> listPolicy;

    /**
     * @return A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    public Output<Optional<PolicyListPolicy>> listPolicy() {
        return Codegen.optional(this.listPolicy);
    }
    /**
     * The numeric ID of the organization to set the policy for.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The numeric ID of the organization to set the policy for.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    @Export(name="restorePolicy", type=PolicyRestorePolicy.class, parameters={})
    private Output</* @Nullable */ PolicyRestorePolicy> restorePolicy;

    /**
     * @return A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    public Output<Optional<PolicyRestorePolicy>> restorePolicy() {
        return Codegen.optional(this.restorePolicy);
    }
    /**
     * (Computed) The timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds, representing when the variable was last updated. Example: &#34;2016-10-09T12:33:37.578138407Z&#34;.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return (Computed) The timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds, representing when the variable was last updated. Example: &#34;2016-10-09T12:33:37.578138407Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Version of the Policy. Default version is 0.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return Version of the Policy. Default version is 0.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:organizations/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable PolicyState state, @Nullable CustomResourceOptions options) {
        super("gcp:organizations/policy:Policy", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Policy get(String name, Output<String> id, @Nullable PolicyState state, @Nullable CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}
