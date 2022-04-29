// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.NetworkEndpointArgs;
import com.pulumi.gcp.compute.inputs.NetworkEndpointState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A Network endpoint represents a IP address and port combination that is
 * part of a specific network endpoint group (NEG). NEGs are zonal
 * collections of these endpoints for GCP resources within a
 * single subnet. **NOTE**: Network endpoints cannot be created outside of a
 * network endpoint group.
 * 
 * To get more information about NetworkEndpoint, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/networkEndpointGroups)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/negs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * NetworkEndpoint can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkEndpoint:NetworkEndpoint default projects/{{project}}/zones/{{zone}}/networkEndpointGroups/{{network_endpoint_group}}/{{instance}}/{{ip_address}}/{{port}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkEndpoint:NetworkEndpoint default {{project}}/{{zone}}/{{network_endpoint_group}}/{{instance}}/{{ip_address}}/{{port}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkEndpoint:NetworkEndpoint default {{zone}}/{{network_endpoint_group}}/{{instance}}/{{ip_address}}/{{port}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkEndpoint:NetworkEndpoint default {{network_endpoint_group}}/{{instance}}/{{ip_address}}/{{port}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/networkEndpoint:NetworkEndpoint")
public class NetworkEndpoint extends CustomResource {
    /**
     * The name for a specific VM instance that the IP address belongs to.
     * This is required for network endpoints of type GCE_VM_IP_PORT.
     * The instance must be in the same zone of network endpoint group.
     * 
     */
    @Export(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name for a specific VM instance that the IP address belongs to.
     * This is required for network endpoints of type GCE_VM_IP_PORT.
     * The instance must be in the same zone of network endpoint group.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }
    /**
     * IPv4 address of network endpoint. The IP address must belong
     * to a VM in GCE (either the primary IP or as part of an aliased IP
     * range).
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return IPv4 address of network endpoint. The IP address must belong
     * to a VM in GCE (either the primary IP or as part of an aliased IP
     * range).
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * The network endpoint group this endpoint is part of.
     * 
     */
    @Export(name="networkEndpointGroup", type=String.class, parameters={})
    private Output<String> networkEndpointGroup;

    /**
     * @return The network endpoint group this endpoint is part of.
     * 
     */
    public Output<String> networkEndpointGroup() {
        return this.networkEndpointGroup;
    }
    /**
     * Port number of network endpoint.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return Port number of network endpoint.
     * 
     */
    public Output<Integer> port() {
        return this.port;
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
     * Zone where the containing network endpoint group is located.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return Zone where the containing network endpoint group is located.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkEndpoint(String name) {
        this(name, NetworkEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkEndpoint(String name, NetworkEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkEndpoint(String name, NetworkEndpointArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:compute/networkEndpoint:NetworkEndpoint", name, args == null ? NetworkEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkEndpoint(String name, Output<String> id, @Nullable NetworkEndpointState state, @Nullable CustomResourceOptions options) {
        super("gcp:compute/networkEndpoint:NetworkEndpoint", name, state, makeResourceOptions(options, id));
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
    public static NetworkEndpoint get(String name, Output<String> id, @Nullable NetworkEndpointState state, @Nullable CustomResourceOptions options) {
        return new NetworkEndpoint(name, id, state, options);
    }
}
