// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networkservices_v1beta1.GrpcRouteArgs;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GrpcRouteRouteRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new GrpcRoute in a given project and location.
 * 
 */
@ResourceType(type="google-native:networkservices/v1beta1:GrpcRoute")
public class GrpcRoute extends com.pulumi.resources.CustomResource {
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
     * Optional. Gateways defines a list of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
     * 
     */
    @Export(name="gateways", type=List.class, parameters={String.class})
    private Output<List<String>> gateways;

    /**
     * @return Optional. Gateways defines a list of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
     * 
     */
    public Output<List<String>> gateways() {
        return this.gateways;
    }
    /**
     * Service hostnames with an optional port for which this route describes traffic. Format: [:] Hostname is the fully qualified domain name of a network host. This matches the RFC 1123 definition of a hostname with 2 notable exceptions: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateway must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same route, it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;. If a port is specified, then gRPC clients must use the channel URI with the port to match this rule (i.e. &#34;xds:///service:123&#34;), otherwise they must supply the URI without a port (i.e. &#34;xds:///service&#34;).
     * 
     */
    @Export(name="hostnames", type=List.class, parameters={String.class})
    private Output<List<String>> hostnames;

    /**
     * @return Service hostnames with an optional port for which this route describes traffic. Format: [:] Hostname is the fully qualified domain name of a network host. This matches the RFC 1123 definition of a hostname with 2 notable exceptions: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateway must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same route, it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;. If a port is specified, then gRPC clients must use the channel URI with the port to match this rule (i.e. &#34;xds:///service:123&#34;), otherwise they must supply the URI without a port (i.e. &#34;xds:///service&#34;).
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }
    /**
     * Optional. Set of label tags associated with the GrpcRoute resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the GrpcRoute resource.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Optional. Meshes defines a list of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/`
     * 
     */
    @Export(name="meshes", type=List.class, parameters={String.class})
    private Output<List<String>> meshes;

    /**
     * @return Optional. Meshes defines a list of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/`
     * 
     */
    public Output<List<String>> meshes() {
        return this.meshes;
    }
    /**
     * Name of the GrpcRoute resource. It matches pattern `projects/*{@literal /}locations/global/grpcRoutes/`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the GrpcRoute resource. It matches pattern `projects/*{@literal /}locations/global/grpcRoutes/`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of detailed rules defining how to route traffic. Within a single GrpcRoute, the GrpcRoute.RouteAction associated with the first matching GrpcRoute.RouteRule will be executed. At least one rule must be supplied.
     * 
     */
    @Export(name="rules", type=List.class, parameters={GrpcRouteRouteRuleResponse.class})
    private Output<List<GrpcRouteRouteRuleResponse>> rules;

    /**
     * @return A list of detailed rules defining how to route traffic. Within a single GrpcRoute, the GrpcRoute.RouteAction associated with the first matching GrpcRoute.RouteRule will be executed. At least one rule must be supplied.
     * 
     */
    public Output<List<GrpcRouteRouteRuleResponse>> rules() {
        return this.rules;
    }
    /**
     * Server-defined URL of this resource
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL of this resource
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
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
    public GrpcRoute(String name) {
        this(name, GrpcRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrpcRoute(String name, GrpcRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrpcRoute(String name, GrpcRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkservices/v1beta1:GrpcRoute", name, args == null ? GrpcRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GrpcRoute(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networkservices/v1beta1:GrpcRoute", name, null, makeResourceOptions(options, id));
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
    public static GrpcRoute get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrpcRoute(name, id, options);
    }
}
