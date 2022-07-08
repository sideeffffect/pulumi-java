// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datastream.v1alpha1.PrivateConnectionArgs;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.ErrorResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.VpcPeeringConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this method to create a private connectivity configuration.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datastream/v1alpha1:PrivateConnection")
public class PrivateConnection extends com.pulumi.resources.CustomResource {
    /**
     * The create time of the resource.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The create time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * In case of error, the details of the error in a user-friendly format.
     * 
     */
    @Export(name="error", type=ErrorResponse.class, parameters={})
    private Output<ErrorResponse> error;

    /**
     * @return In case of error, the details of the error in a user-friendly format.
     * 
     */
    public Output<ErrorResponse> error() {
        return this.error;
    }
    /**
     * Labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels.
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
     * The resource&#39;s name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Required. The private connectivity identifier.
     * 
     */
    @Export(name="privateConnectionId", type=String.class, parameters={})
    private Output<String> privateConnectionId;

    /**
     * @return Required. The private connectivity identifier.
     * 
     */
    public Output<String> privateConnectionId() {
        return this.privateConnectionId;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * The state of the Private Connection.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the Private Connection.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The update time of the resource.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update time of the resource.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * VPC Peering Config
     * 
     */
    @Export(name="vpcPeeringConfig", type=VpcPeeringConfigResponse.class, parameters={})
    private Output<VpcPeeringConfigResponse> vpcPeeringConfig;

    /**
     * @return VPC Peering Config
     * 
     */
    public Output<VpcPeeringConfigResponse> vpcPeeringConfig() {
        return this.vpcPeeringConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateConnection(String name) {
        this(name, PrivateConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateConnection(String name, PrivateConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateConnection(String name, PrivateConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:PrivateConnection", name, args == null ? PrivateConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:PrivateConnection", name, null, makeResourceOptions(options, id));
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
    public static PrivateConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateConnection(name, id, options);
    }
}
