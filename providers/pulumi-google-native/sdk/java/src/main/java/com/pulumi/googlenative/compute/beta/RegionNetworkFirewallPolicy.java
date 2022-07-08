// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute.beta.RegionNetworkFirewallPolicyArgs;
import com.pulumi.googlenative.compute.beta.outputs.FirewallPolicyAssociationResponse;
import com.pulumi.googlenative.compute.beta.outputs.FirewallPolicyRuleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new network firewall policy in the specified project and region.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:compute/beta:RegionNetworkFirewallPolicy")
public class RegionNetworkFirewallPolicy extends com.pulumi.resources.CustomResource {
    /**
     * A list of associations that belong to this firewall policy.
     * 
     */
    @Export(name="associations", type=List.class, parameters={FirewallPolicyAssociationResponse.class})
    private Output<List<FirewallPolicyAssociationResponse>> associations;

    /**
     * @return A list of associations that belong to this firewall policy.
     * 
     */
    public Output<List<FirewallPolicyAssociationResponse>> associations() {
        return this.associations;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     * @deprecated
     * Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Deprecated /* Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parent of the firewall policy.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the firewall policy.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    @Export(name="ruleTupleCount", type=Integer.class, parameters={})
    private Output<Integer> ruleTupleCount;

    /**
     * @return Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    public Output<Integer> ruleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a firewall policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    @Export(name="rules", type=List.class, parameters={FirewallPolicyRuleResponse.class})
    private Output<List<FirewallPolicyRuleResponse>> rules;

    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a firewall policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    public Output<List<FirewallPolicyRuleResponse>> rules() {
        return this.rules;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionNetworkFirewallPolicy(String name) {
        this(name, RegionNetworkFirewallPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionNetworkFirewallPolicy(String name, RegionNetworkFirewallPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionNetworkFirewallPolicy(String name, RegionNetworkFirewallPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:RegionNetworkFirewallPolicy", name, args == null ? RegionNetworkFirewallPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionNetworkFirewallPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:RegionNetworkFirewallPolicy", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionNetworkFirewallPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionNetworkFirewallPolicy(name, id, options);
    }
}
