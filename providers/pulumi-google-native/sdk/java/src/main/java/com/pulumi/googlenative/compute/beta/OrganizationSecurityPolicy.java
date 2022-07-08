// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute.beta.OrganizationSecurityPolicyArgs;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyAdaptiveProtectionConfigResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyAdvancedOptionsConfigResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyAssociationResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyDdosProtectionConfigResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRecaptchaOptionsConfigResponse;
import com.pulumi.googlenative.compute.beta.outputs.SecurityPolicyRuleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new policy in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:OrganizationSecurityPolicy")
public class OrganizationSecurityPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="adaptiveProtectionConfig", type=SecurityPolicyAdaptiveProtectionConfigResponse.class, parameters={})
    private Output<SecurityPolicyAdaptiveProtectionConfigResponse> adaptiveProtectionConfig;

    public Output<SecurityPolicyAdaptiveProtectionConfigResponse> adaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig;
    }
    @Export(name="advancedOptionsConfig", type=SecurityPolicyAdvancedOptionsConfigResponse.class, parameters={})
    private Output<SecurityPolicyAdvancedOptionsConfigResponse> advancedOptionsConfig;

    public Output<SecurityPolicyAdvancedOptionsConfigResponse> advancedOptionsConfig() {
        return this.advancedOptionsConfig;
    }
    /**
     * A list of associations that belong to this policy.
     * 
     */
    @Export(name="associations", type=List.class, parameters={SecurityPolicyAssociationResponse.class})
    private Output<List<SecurityPolicyAssociationResponse>> associations;

    /**
     * @return A list of associations that belong to this policy.
     * 
     */
    public Output<List<SecurityPolicyAssociationResponse>> associations() {
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
    @Export(name="ddosProtectionConfig", type=SecurityPolicyDdosProtectionConfigResponse.class, parameters={})
    private Output<SecurityPolicyDdosProtectionConfigResponse> ddosProtectionConfig;

    public Output<SecurityPolicyDdosProtectionConfigResponse> ddosProtectionConfig() {
        return this.ddosProtectionConfig;
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
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this security policy, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this security policy, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parent of the security policy.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the security policy.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Parent ID for this request. The ID can be either be &#34;folders/[FOLDER_ID]&#34; if the parent is a folder or &#34;organizations/[ORGANIZATION_ID]&#34; if the parent is an organization.
     * 
     */
    @Export(name="parentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> parentId;

    /**
     * @return Parent ID for this request. The ID can be either be &#34;folders/[FOLDER_ID]&#34; if the parent is a folder or &#34;organizations/[ORGANIZATION_ID]&#34; if the parent is an organization.
     * 
     */
    public Output<Optional<String>> parentId() {
        return Codegen.optional(this.parentId);
    }
    @Export(name="recaptchaOptionsConfig", type=SecurityPolicyRecaptchaOptionsConfigResponse.class, parameters={})
    private Output<SecurityPolicyRecaptchaOptionsConfigResponse> recaptchaOptionsConfig;

    public Output<SecurityPolicyRecaptchaOptionsConfigResponse> recaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig;
    }
    /**
     * URL of the region where the regional security policy resides. This field is not applicable to global security policies.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the regional security policy resides. This field is not applicable to global security policies.
     * 
     */
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
     * Total count of all security policy rule tuples. A security policy can not exceed a set number of tuples.
     * 
     */
    @Export(name="ruleTupleCount", type=Integer.class, parameters={})
    private Output<Integer> ruleTupleCount;

    /**
     * @return Total count of all security policy rule tuples. A security policy can not exceed a set number of tuples.
     * 
     */
    public Output<Integer> ruleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    @Export(name="rules", type=List.class, parameters={SecurityPolicyRuleResponse.class})
    private Output<List<SecurityPolicyRuleResponse>> rules;

    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    public Output<List<SecurityPolicyRuleResponse>> rules() {
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
     * The type indicates the intended use of the security policy. - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache. - CLOUD_ARMOR_INTERNAL_SERVICE: Cloud Armor internal service policies can be configured to filter HTTP requests targeting services managed by Traffic Director in a service mesh. They filter requests before the request is served from the application. This field can be set only at resource creation time.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type indicates the intended use of the security policy. - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache. - CLOUD_ARMOR_INTERNAL_SERVICE: Cloud Armor internal service policies can be configured to filter HTTP requests targeting services managed by Traffic Director in a service mesh. They filter requests before the request is served from the application. This field can be set only at resource creation time.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationSecurityPolicy(String name) {
        this(name, OrganizationSecurityPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationSecurityPolicy(String name, @Nullable OrganizationSecurityPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationSecurityPolicy(String name, @Nullable OrganizationSecurityPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:OrganizationSecurityPolicy", name, args == null ? OrganizationSecurityPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationSecurityPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:OrganizationSecurityPolicy", name, null, makeResourceOptions(options, id));
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
    public static OrganizationSecurityPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationSecurityPolicy(name, id, options);
    }
}
