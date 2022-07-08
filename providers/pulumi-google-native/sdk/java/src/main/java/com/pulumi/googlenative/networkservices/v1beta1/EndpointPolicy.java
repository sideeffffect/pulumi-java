// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networkservices.v1beta1.EndpointPolicyArgs;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.EndpointMatcherResponse;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.TrafficPortSelectorResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new EndpointPolicy in a given project and location.
 * 
 */
@ResourceType(type="google-native:networkservices/v1beta1:EndpointPolicy")
public class EndpointPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
     */
    @Export(name="authorizationPolicy", type=String.class, parameters={})
    private Output<String> authorizationPolicy;

    /**
     * @return Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
     */
    public Output<String> authorizationPolicy() {
        return this.authorizationPolicy;
    }
    /**
     * Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
     */
    @Export(name="clientTlsPolicy", type=String.class, parameters={})
    private Output<String> clientTlsPolicy;

    /**
     * @return Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
     */
    public Output<String> clientTlsPolicy() {
        return this.clientTlsPolicy;
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A matcher that selects endpoints to which the policies should be applied.
     * 
     */
    @Export(name="endpointMatcher", type=EndpointMatcherResponse.class, parameters={})
    private Output<EndpointMatcherResponse> endpointMatcher;

    /**
     * @return A matcher that selects endpoints to which the policies should be applied.
     * 
     */
    public Output<EndpointMatcherResponse> endpointMatcher() {
        return this.endpointMatcher;
    }
    /**
     * Required. Short name of the EndpointPolicy resource to be created. E.g. &#34;CustomECS&#34;.
     * 
     */
    @Export(name="endpointPolicyId", type=String.class, parameters={})
    private Output<String> endpointPolicyId;

    /**
     * @return Required. Short name of the EndpointPolicy resource to be created. E.g. &#34;CustomECS&#34;.
     * 
     */
    public Output<String> endpointPolicyId() {
        return this.endpointPolicyId;
    }
    /**
     * Optional. Set of label tags associated with the EndpointPolicy resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the EndpointPolicy resource.
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
     * Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
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
     * Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
     */
    @Export(name="serverTlsPolicy", type=String.class, parameters={})
    private Output<String> serverTlsPolicy;

    /**
     * @return Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
     */
    public Output<String> serverTlsPolicy() {
        return this.serverTlsPolicy;
    }
    /**
     * Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
     */
    @Export(name="trafficPortSelector", type=TrafficPortSelectorResponse.class, parameters={})
    private Output<TrafficPortSelectorResponse> trafficPortSelector;

    /**
     * @return Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
     */
    public Output<TrafficPortSelectorResponse> trafficPortSelector() {
        return this.trafficPortSelector;
    }
    /**
     * The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The timestamp when the resource was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EndpointPolicy(String name) {
        this(name, EndpointPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EndpointPolicy(String name, EndpointPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EndpointPolicy(String name, EndpointPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkservices/v1beta1:EndpointPolicy", name, args == null ? EndpointPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EndpointPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkservices/v1beta1:EndpointPolicy", name, null, makeResourceOptions(options, id));
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
    public static EndpointPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EndpointPolicy(name, id, options);
    }
}
