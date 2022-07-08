// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigeeregistry.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigeeregistry.v1.DeploymentArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * CreateApiDeployment creates a specified deployment.
 * 
 */
@ResourceType(type="google-native:apigeeregistry/v1:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * Text briefly describing how to access the endpoint. Changes to this value will not affect the revision.
     * 
     */
    @Export(name="accessGuidance", type=String.class, parameters={})
    private Output<String> accessGuidance;

    /**
     * @return Text briefly describing how to access the endpoint. Changes to this value will not affect the revision.
     * 
     */
    public Output<String> accessGuidance() {
        return this.accessGuidance;
    }
    /**
     * Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * Required. The ID to use for the deployment, which will become the final component of the deployment&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
     * 
     */
    @Export(name="apiDeploymentId", type=String.class, parameters={})
    private Output<String> apiDeploymentId;

    /**
     * @return Required. The ID to use for the deployment, which will become the final component of the deployment&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
     * 
     */
    public Output<String> apiDeploymentId() {
        return this.apiDeploymentId;
    }
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The full resource name (including revision id) of the spec of the API being served by the deployment. Changes to this value will update the revision. Format: apis/{api}/deployments/{deployment}
     * 
     */
    @Export(name="apiSpecRevision", type=String.class, parameters={})
    private Output<String> apiSpecRevision;

    /**
     * @return The full resource name (including revision id) of the spec of the API being served by the deployment. Changes to this value will update the revision. Format: apis/{api}/deployments/{deployment}
     * 
     */
    public Output<String> apiSpecRevision() {
        return this.apiSpecRevision;
    }
    /**
     * Creation timestamp; when the deployment resource was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation timestamp; when the deployment resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A detailed description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A detailed description.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Human-meaningful name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-meaningful name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The address where the deployment is serving. Changes to this value will update the revision.
     * 
     */
    @Export(name="endpointUri", type=String.class, parameters={})
    private Output<String> endpointUri;

    /**
     * @return The address where the deployment is serving. Changes to this value will update the revision.
     * 
     */
    public Output<String> endpointUri() {
        return this.endpointUri;
    }
    /**
     * The address of the external channel of the API (e.g. the Developer Portal). Changes to this value will not affect the revision.
     * 
     */
    @Export(name="externalChannelUri", type=String.class, parameters={})
    private Output<String> externalChannelUri;

    /**
     * @return The address of the external channel of the API (e.g. the Developer Portal). Changes to this value will not affect the revision.
     * 
     */
    public Output<String> externalChannelUri() {
        return this.externalChannelUri;
    }
    /**
     * Text briefly identifying the intended audience of the API. Changes to this value will not affect the revision.
     * 
     */
    @Export(name="intendedAudience", type=String.class, parameters={})
    private Output<String> intendedAudience;

    /**
     * @return Text briefly identifying the intended audience of the API. Changes to this value will not affect the revision.
     * 
     */
    public Output<String> intendedAudience() {
        return this.intendedAudience;
    }
    /**
     * Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with &#34;apigeeregistry.googleapis.com/&#34; and cannot be changed.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with &#34;apigeeregistry.googleapis.com/&#34; and cannot be changed.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Revision creation timestamp; when the represented revision was created.
     * 
     */
    @Export(name="revisionCreateTime", type=String.class, parameters={})
    private Output<String> revisionCreateTime;

    /**
     * @return Revision creation timestamp; when the represented revision was created.
     * 
     */
    public Output<String> revisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * Immutable. The revision ID of the deployment. A new revision is committed whenever the deployment contents are changed. The format is an 8-character hexadecimal string.
     * 
     */
    @Export(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    /**
     * @return Immutable. The revision ID of the deployment. A new revision is committed whenever the deployment contents are changed. The format is an 8-character hexadecimal string.
     * 
     */
    public Output<String> revisionId() {
        return this.revisionId;
    }
    /**
     * Last update timestamp: when the represented revision was last modified.
     * 
     */
    @Export(name="revisionUpdateTime", type=String.class, parameters={})
    private Output<String> revisionUpdateTime;

    /**
     * @return Last update timestamp: when the represented revision was last modified.
     * 
     */
    public Output<String> revisionUpdateTime() {
        return this.revisionUpdateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigeeregistry/v1:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigeeregistry/v1:Deployment", name, null, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}
