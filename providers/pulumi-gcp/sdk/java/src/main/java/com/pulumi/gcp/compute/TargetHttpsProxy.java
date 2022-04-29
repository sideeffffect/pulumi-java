// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.TargetHttpsProxyArgs;
import com.pulumi.gcp.compute.inputs.TargetHttpsProxyState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a TargetHttpsProxy resource, which is used by one or more
 * global forwarding rule to route incoming HTTPS requests to a URL map.
 * 
 * To get more information about TargetHttpsProxy, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/targetHttpsProxies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * TargetHttpsProxy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetHttpsProxy:TargetHttpsProxy default projects/{{project}}/global/targetHttpsProxies/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetHttpsProxy:TargetHttpsProxy default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetHttpsProxy:TargetHttpsProxy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/targetHttpsProxy:TargetHttpsProxy")
public class TargetHttpsProxy extends CustomResource {
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
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Export(name="proxyBind", type=Boolean.class, parameters={})
    private Output<Boolean> proxyBind;

    /**
     * @return This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public Output<Boolean> proxyBind() {
        return this.proxyBind;
    }
    /**
     * The unique identifier for the resource.
     * 
     */
    @Export(name="proxyId", type=Integer.class, parameters={})
    private Output<Integer> proxyId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> proxyId() {
        return this.proxyId;
    }
    /**
     * Specifies the QUIC override policy for this resource. This determines
     * whether the load balancer will attempt to negotiate QUIC with clients
     * or not. Can specify one of NONE, ENABLE, or DISABLE. If NONE is
     * specified, uses the QUIC policy with no user overrides, which is
     * equivalent to DISABLE.
     * Default value is `NONE`.
     * Possible values are `NONE`, `ENABLE`, and `DISABLE`.
     * 
     */
    @Export(name="quicOverride", type=String.class, parameters={})
    private Output</* @Nullable */ String> quicOverride;

    /**
     * @return Specifies the QUIC override policy for this resource. This determines
     * whether the load balancer will attempt to negotiate QUIC with clients
     * or not. Can specify one of NONE, ENABLE, or DISABLE. If NONE is
     * specified, uses the QUIC policy with no user overrides, which is
     * equivalent to DISABLE.
     * Default value is `NONE`.
     * Possible values are `NONE`, `ENABLE`, and `DISABLE`.
     * 
     */
    public Output<Optional<String>> quicOverride() {
        return Codegen.optional(this.quicOverride);
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one SSL
     * certificate must be specified.
     * 
     */
    @Export(name="sslCertificates", type=List.class, parameters={String.class})
    private Output<List<String>> sslCertificates;

    /**
     * @return A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one SSL
     * certificate must be specified.
     * 
     */
    public Output<List<String>> sslCertificates() {
        return this.sslCertificates;
    }
    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
     * resource will not have any SSL policy configured.
     * 
     */
    @Export(name="sslPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslPolicy;

    /**
     * @return A reference to the SslPolicy resource that will be associated with
     * the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
     * resource will not have any SSL policy configured.
     * 
     */
    public Output<Optional<String>> sslPolicy() {
        return Codegen.optional(this.sslPolicy);
    }
    /**
     * A reference to the UrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    @Export(name="urlMap", type=String.class, parameters={})
    private Output<String> urlMap;

    /**
     * @return A reference to the UrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    public Output<String> urlMap() {
        return this.urlMap;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetHttpsProxy(String name) {
        this(name, TargetHttpsProxyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetHttpsProxy(String name, TargetHttpsProxyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetHttpsProxy(String name, TargetHttpsProxyArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:compute/targetHttpsProxy:TargetHttpsProxy", name, args == null ? TargetHttpsProxyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TargetHttpsProxy(String name, Output<String> id, @Nullable TargetHttpsProxyState state, @Nullable CustomResourceOptions options) {
        super("gcp:compute/targetHttpsProxy:TargetHttpsProxy", name, state, makeResourceOptions(options, id));
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
    public static TargetHttpsProxy get(String name, Output<String> id, @Nullable TargetHttpsProxyState state, @Nullable CustomResourceOptions options) {
        return new TargetHttpsProxy(name, id, state, options);
    }
}
