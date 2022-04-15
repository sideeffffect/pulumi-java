// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.NatGatewayArgs;
import io.pulumi.aws.ec2.inputs.NatGatewayState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a VPC NAT Gateway.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * NAT Gateways can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/natGateway:NatGateway private_gw nat-05dba92075d71c408
 * ```
 * 
 */
@ResourceType(type="aws:ec2/natGateway:NatGateway")
public class NatGateway extends io.pulumi.resources.CustomResource {
    /**
     * The Allocation ID of the Elastic IP address for the gateway. Required for `connectivity_type` of `public`.
     * 
     */
    @Export(name="allocationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> allocationId;

    /**
     * @return The Allocation ID of the Elastic IP address for the gateway. Required for `connectivity_type` of `public`.
     * 
     */
    public Output</* @Nullable */ String> allocationId() {
        return this.allocationId;
    }
    /**
     * Connectivity type for the gateway. Valid values are `private` and `public`. Defaults to `public`.
     * 
     */
    @Export(name="connectivityType", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectivityType;

    /**
     * @return Connectivity type for the gateway. Valid values are `private` and `public`. Defaults to `public`.
     * 
     */
    public Output</* @Nullable */ String> connectivityType() {
        return this.connectivityType;
    }
    /**
     * The ENI ID of the network interface created by the NAT gateway.
     * 
     */
    @Export(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return The ENI ID of the network interface created by the NAT gateway.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The private IP address of the NAT Gateway.
     * 
     */
    @Export(name="privateIp", type=String.class, parameters={})
    private Output<String> privateIp;

    /**
     * @return The private IP address of the NAT Gateway.
     * 
     */
    public Output<String> privateIp() {
        return this.privateIp;
    }
    /**
     * The public IP address of the NAT Gateway.
     * 
     */
    @Export(name="publicIp", type=String.class, parameters={})
    private Output<String> publicIp;

    /**
     * @return The public IP address of the NAT Gateway.
     * 
     */
    public Output<String> publicIp() {
        return this.publicIp;
    }
    /**
     * The Subnet ID of the subnet in which to place the gateway.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The Subnet ID of the subnet in which to place the gateway.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatGateway(String name) {
        this(name, NatGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatGateway(String name, NatGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatGateway(String name, NatGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/natGateway:NatGateway", name, args == null ? NatGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NatGateway(String name, Output<String> id, @Nullable NatGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/natGateway:NatGateway", name, state, makeResourceOptions(options, id));
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
    public static NatGateway get(String name, Output<String> id, @Nullable NatGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NatGateway(name, id, state, options);
    }
}
