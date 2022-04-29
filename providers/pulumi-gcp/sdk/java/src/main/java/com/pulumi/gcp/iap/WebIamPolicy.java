// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.iap.WebIamPolicyArgs;
import com.pulumi.gcp.iap.inputs.WebIamPolicyState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Identity-Aware Proxy Web. Each of these resources serves a different use case:
 * 
 * * `gcp.iap.WebIamPolicy`: Authoritative. Sets the IAM policy for the web and replaces any existing policy already attached.
 * * `gcp.iap.WebIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the web are preserved.
 * * `gcp.iap.WebIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the web are preserved.
 * 
 * &gt; **Note:** `gcp.iap.WebIamPolicy` **cannot** be used in conjunction with `gcp.iap.WebIamBinding` and `gcp.iap.WebIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.iap.WebIamBinding` resources **can be** used in conjunction with `gcp.iap.WebIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_iap\_web\_iam\_policy
 * 
 * With IAM Conditions:
 * ## google\_iap\_web\_iam\_binding
 * 
 * With IAM Conditions:
 * ## google\_iap\_web\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms* projects/{{project}}/iap_web * {{project}} Any variables not passed in the import command will be taken from the provider configuration. Identity-Aware Proxy web IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webIamPolicy:WebIamPolicy editor &#34;projects/{{project}}/iap_web roles/iap.httpsResourceAccessor user:jane@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webIamPolicy:WebIamPolicy editor &#34;projects/{{project}}/iap_web roles/iap.httpsResourceAccessor&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webIamPolicy:WebIamPolicy editor projects/{{project}}/iap_web
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:iap/webIamPolicy:WebIamPolicy")
public class WebIamPolicy extends CustomResource {
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
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebIamPolicy(String name) {
        this(name, WebIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebIamPolicy(String name, WebIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebIamPolicy(String name, WebIamPolicyArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:iap/webIamPolicy:WebIamPolicy", name, args == null ? WebIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebIamPolicy(String name, Output<String> id, @Nullable WebIamPolicyState state, @Nullable CustomResourceOptions options) {
        super("gcp:iap/webIamPolicy:WebIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static WebIamPolicy get(String name, Output<String> id, @Nullable WebIamPolicyState state, @Nullable CustomResourceOptions options) {
        return new WebIamPolicy(name, id, state, options);
    }
}
