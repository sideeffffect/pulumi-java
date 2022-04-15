// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RouterInterfaceArgs;
import io.pulumi.gcp.compute.inputs.RouterInterfaceState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Cloud Router interface. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/cloudrouter)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/routers).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Router interfaces can be imported using the `region`, `router`, and `name`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerInterface:RouterInterface foobar us-central1/router-1/interface-1
 * ```
 * 
 */
@ResourceType(type="gcp:compute/routerInterface:RouterInterface")
public class RouterInterface extends io.pulumi.resources.CustomResource {
    /**
     * The name or resource link to the
     * VLAN interconnect for this interface. Changing this forces a new interface to
     * be created. Only one of `vpn_tunnel` and `interconnect_attachment` can be
     * specified.
     * 
     */
    @Export(name="interconnectAttachment", type=String.class, parameters={})
    private Output</* @Nullable */ String> interconnectAttachment;

    /**
     * @return The name or resource link to the
     * VLAN interconnect for this interface. Changing this forces a new interface to
     * be created. Only one of `vpn_tunnel` and `interconnect_attachment` can be
     * specified.
     * 
     */
    public Output</* @Nullable */ String> interconnectAttachment() {
        return this.interconnectAttachment;
    }
    /**
     * IP address and range of the interface. The IP range must be
     * in the RFC3927 link-local IP space. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="ipRange", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipRange;

    /**
     * @return IP address and range of the interface. The IP range must be
     * in the RFC3927 link-local IP space. Changing this forces a new interface to be created.
     * 
     */
    public Output</* @Nullable */ String> ipRange() {
        return this.ipRange;
    }
    /**
     * A unique name for the interface, required by GCE. Changing
     * this forces a new interface to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the interface, required by GCE. Changing
     * this forces a new interface to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which this interface's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which this interface's router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new interface to be created.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region this interface's router sits in. If not specified,
     * the project region will be used. Changing this forces a new interface to be
     * created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region this interface's router sits in. If not specified,
     * the project region will be used. Changing this forces a new interface to be
     * created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The name of the router this interface will be attached to.
     * Changing this forces a new interface to be created.
     * 
     */
    @Export(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return The name of the router this interface will be attached to.
     * Changing this forces a new interface to be created.
     * 
     */
    public Output<String> router() {
        return this.router;
    }
    /**
     * The name or resource link to the VPN tunnel this
     * interface will be linked to. Changing this forces a new interface to be created. Only
     * one of `vpn_tunnel` and `interconnect_attachment` can be specified.
     * 
     */
    @Export(name="vpnTunnel", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnTunnel;

    /**
     * @return The name or resource link to the VPN tunnel this
     * interface will be linked to. Changing this forces a new interface to be created. Only
     * one of `vpn_tunnel` and `interconnect_attachment` can be specified.
     * 
     */
    public Output</* @Nullable */ String> vpnTunnel() {
        return this.vpnTunnel;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterInterface(String name) {
        this(name, RouterInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterInterface(String name, RouterInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterInterface(String name, RouterInterfaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerInterface:RouterInterface", name, args == null ? RouterInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouterInterface(String name, Output<String> id, @Nullable RouterInterfaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerInterface:RouterInterface", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static RouterInterface get(String name, Output<String> id, @Nullable RouterInterfaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouterInterface(name, id, state, options);
    }
}
