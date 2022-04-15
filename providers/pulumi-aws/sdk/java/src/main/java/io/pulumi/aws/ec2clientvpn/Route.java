// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2clientvpn;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2clientvpn.RouteArgs;
import io.pulumi.aws.ec2clientvpn.inputs.RouteState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides additional routes for AWS Client VPN endpoints. For more information on usage, please see the
 * [AWS Client VPN Administrator's Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS Client VPN routes can be imported using the endpoint ID, target subnet ID, and destination CIDR block. All values are separated by a `,`.
 * 
 * ```sh
 *  $ pulumi import aws:ec2clientvpn/route:Route example cvpn-endpoint-1234567890abcdef,subnet-9876543210fedcba,10.1.0.0/24
 * ```
 * 
 */
@ResourceType(type="aws:ec2clientvpn/route:Route")
public class Route extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @Export(name="clientVpnEndpointId", type=String.class, parameters={})
    private Output<String> clientVpnEndpointId;

    /**
     * @return The ID of the Client VPN endpoint.
     * 
     */
    public Output<String> clientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }
    /**
     * A brief description of the authorization rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A brief description of the authorization rule.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The IPv4 address range, in CIDR notation, of the route destination.
     * 
     */
    @Export(name="destinationCidrBlock", type=String.class, parameters={})
    private Output<String> destinationCidrBlock;

    /**
     * @return The IPv4 address range, in CIDR notation, of the route destination.
     * 
     */
    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    /**
     * Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
     * 
     */
    @Export(name="origin", type=String.class, parameters={})
    private Output<String> origin;

    /**
     * @return Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     * 
     */
    @Export(name="targetVpcSubnetId", type=String.class, parameters={})
    private Output<String> targetVpcSubnetId;

    /**
     * @return The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     * 
     */
    public Output<String> targetVpcSubnetId() {
        return this.targetVpcSubnetId;
    }
    /**
     * The type of the route.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the route.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/route:Route", name, state, makeResourceOptions(options, id));
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
    public static Route get(String name, Output<String> id, @Nullable RouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, state, options);
    }
}
