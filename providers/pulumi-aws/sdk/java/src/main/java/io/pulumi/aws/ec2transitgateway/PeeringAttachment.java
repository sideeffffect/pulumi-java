// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2transitgateway.PeeringAttachmentArgs;
import io.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Transit Gateway Peering Attachment.
 * For examples of custom route table association and propagation, see the [EC2 Transit Gateway Networking Examples Guide](https://docs.aws.amazon.com/vpc/latest/tgw/TGW_Scenarios.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway_peering_attachment` can be imported by using the EC2 Transit Gateway Attachment identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/peeringAttachment:PeeringAttachment example tgw-attach-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/peeringAttachment:PeeringAttachment")
public class PeeringAttachment extends io.pulumi.resources.CustomResource {
    /**
     * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
     * 
     */
    @Export(name="peerAccountId", type=String.class, parameters={})
    private Output<String> peerAccountId;

    /**
     * @return Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
     * 
     */
    public Output<String> peerAccountId() {
        return this.peerAccountId;
    }
    /**
     * Region of EC2 Transit Gateway to peer with.
     * 
     */
    @Export(name="peerRegion", type=String.class, parameters={})
    private Output<String> peerRegion;

    /**
     * @return Region of EC2 Transit Gateway to peer with.
     * 
     */
    public Output<String> peerRegion() {
        return this.peerRegion;
    }
    /**
     * Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    @Export(name="peerTransitGatewayId", type=String.class, parameters={})
    private Output<String> peerTransitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    public Output<String> peerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Export(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway.
     * 
     */
    public Output<String> transitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PeeringAttachment(String name) {
        this(name, PeeringAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PeeringAttachment(String name, PeeringAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PeeringAttachment(String name, PeeringAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/peeringAttachment:PeeringAttachment", name, args == null ? PeeringAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PeeringAttachment(String name, Output<String> id, @Nullable PeeringAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/peeringAttachment:PeeringAttachment", name, state, makeResourceOptions(options, id));
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
    public static PeeringAttachment get(String name, Output<String> id, @Nullable PeeringAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PeeringAttachment(name, id, state, options);
    }
}
