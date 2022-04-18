// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3outposts;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3outposts.EndpointArgs;
import com.pulumi.aws.s3outposts.inputs.EndpointState;
import com.pulumi.aws.s3outposts.outputs.EndpointNetworkInterface;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Outposts Endpoint.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * S3 Outposts Endpoints can be imported using Amazon Resource Name (ARN), EC2 Security Group identifier, and EC2 Subnet identifier, separated by commas (`,`) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3outposts/endpoint:Endpoint example arn:aws:s3-outposts:us-east-1:123456789012:outpost/op-12345678/endpoint/0123456789abcdef,sg-12345678,subnet-12345678
 * ```
 * 
 */
@ResourceType(type="aws:s3outposts/endpoint:Endpoint")
public class Endpoint extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the endpoint.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the endpoint.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * VPC CIDR block of the endpoint.
     * 
     */
    @Export(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    /**
     * @return VPC CIDR block of the endpoint.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * UTC creation time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return UTC creation time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * Set of nested attributes for associated Elastic Network Interfaces (ENIs).
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={EndpointNetworkInterface.class})
    private Output<List<EndpointNetworkInterface>> networkInterfaces;

    /**
     * @return Set of nested attributes for associated Elastic Network Interfaces (ENIs).
     * 
     */
    public Output<List<EndpointNetworkInterface>> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Identifier of the Outpost to contain this endpoint.
     * 
     */
    @Export(name="outpostId", type=String.class, parameters={})
    private Output<String> outpostId;

    /**
     * @return Identifier of the Outpost to contain this endpoint.
     * 
     */
    public Output<String> outpostId() {
        return this.outpostId;
    }
    /**
     * Identifier of the EC2 Security Group.
     * 
     */
    @Export(name="securityGroupId", type=String.class, parameters={})
    private Output<String> securityGroupId;

    /**
     * @return Identifier of the EC2 Security Group.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * Identifier of the EC2 Subnet.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return Identifier of the EC2 Subnet.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3outposts/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3outposts/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}
