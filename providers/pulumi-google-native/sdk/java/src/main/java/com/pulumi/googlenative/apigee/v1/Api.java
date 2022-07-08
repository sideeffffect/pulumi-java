// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee.v1.ApiArgs;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1EntityMetadataResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates an API proxy. The API proxy created will not be accessible at runtime until it is deployed to an environment. Create a new API proxy by setting the `name` query parameter to the name of the API proxy. Import an API proxy configuration bundle stored in zip format on your local machine to your organization by doing the following: * Set the `name` query parameter to the name of the API proxy. * Set the `action` query parameter to `import`. * Set the `Content-Type` header to `multipart/form-data`. * Pass as a file the name of API proxy configuration bundle stored in zip format on your local machine using the `file` form field. **Note**: To validate the API proxy configuration bundle only without importing it, set the `action` query parameter to `validate`. When importing an API proxy configuration bundle, if the API proxy does not exist, it will be created. If the API proxy exists, then a new revision is created. Invalid API proxy configurations are rejected, and a list of validation errors is returned to the client.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Api")
public class Api extends com.pulumi.resources.CustomResource {
    /**
     * Action to perform when importing an API proxy configuration bundle. Set this parameter to one of the following values: * `import` to import the API proxy configuration bundle. * `validate` to validate the API proxy configuration bundle without importing it.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output</* @Nullable */ String> action;

    /**
     * @return Action to perform when importing an API proxy configuration bundle. Set this parameter to one of the following values: * `import` to import the API proxy configuration bundle. * `validate` to validate the API proxy configuration bundle without importing it.
     * 
     */
    public Output<Optional<String>> action() {
        return Codegen.optional(this.action);
    }
    /**
     * The type of the API proxy.
     * 
     */
    @Export(name="apiProxyType", type=String.class, parameters={})
    private Output<String> apiProxyType;

    /**
     * @return The type of the API proxy.
     * 
     */
    public Output<String> apiProxyType() {
        return this.apiProxyType;
    }
    /**
     * User labels applied to this API Proxy.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User labels applied to this API Proxy.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The id of the most recently created revision for this api proxy.
     * 
     */
    @Export(name="latestRevisionId", type=String.class, parameters={})
    private Output<String> latestRevisionId;

    /**
     * @return The id of the most recently created revision for this api proxy.
     * 
     */
    public Output<String> latestRevisionId() {
        return this.latestRevisionId;
    }
    /**
     * Metadata describing the API proxy.
     * 
     */
    @Export(name="metaData", type=GoogleCloudApigeeV1EntityMetadataResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1EntityMetadataResponse> metaData;

    /**
     * @return Metadata describing the API proxy.
     * 
     */
    public Output<GoogleCloudApigeeV1EntityMetadataResponse> metaData() {
        return this.metaData;
    }
    /**
     * Name of the API proxy. Restrict the characters used to: A-Za-z0-9._-
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the API proxy. Restrict the characters used to: A-Za-z0-9._-
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Whether this proxy is read-only. A read-only proxy cannot have new revisions created through calls to CreateApiProxyRevision. A proxy is read-only if it was generated by an archive.
     * 
     */
    @Export(name="readOnly", type=Boolean.class, parameters={})
    private Output<Boolean> readOnly;

    /**
     * @return Whether this proxy is read-only. A read-only proxy cannot have new revisions created through calls to CreateApiProxyRevision. A proxy is read-only if it was generated by an archive.
     * 
     */
    public Output<Boolean> readOnly() {
        return this.readOnly;
    }
    /**
     * List of revisions defined for the API proxy.
     * 
     */
    @Export(name="revision", type=List.class, parameters={String.class})
    private Output<List<String>> revision;

    /**
     * @return List of revisions defined for the API proxy.
     * 
     */
    public Output<List<String>> revision() {
        return this.revision;
    }
    /**
     * Ignored. All uploads are validated regardless of the value of this field. Maintained for compatibility with Apigee Edge API.
     * 
     */
    @Export(name="validate", type=String.class, parameters={})
    private Output</* @Nullable */ String> validate;

    /**
     * @return Ignored. All uploads are validated regardless of the value of this field. Maintained for compatibility with Apigee Edge API.
     * 
     */
    public Output<Optional<String>> validate() {
        return Codegen.optional(this.validate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Api(String name) {
        this(name, ApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Api(String name, ApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Api(String name, ApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Api", name, args == null ? ApiArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Api(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Api", name, null, makeResourceOptions(options, id));
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
    public static Api get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Api(name, id, options);
    }
}
