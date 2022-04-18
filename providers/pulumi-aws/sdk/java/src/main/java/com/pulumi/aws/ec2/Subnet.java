// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.SubnetArgs;
import com.pulumi.aws.ec2.inputs.SubnetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an VPC subnet resource.
 * 
 * > **NOTE:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), subnets associated with Lambda Functions can take up to 45 minutes to successfully delete.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Subnets can be imported using the `subnet id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/subnet:Subnet public_subnet subnet-9d4a7b6c
 * ```
 * 
 */
@ResourceType(type="aws:ec2/subnet:Subnet")
public class Subnet extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the subnet.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the subnet.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specify true to indicate
     * that network interfaces created in the specified subnet should be
     * assigned an IPv6 address. Default is `false`
     * 
     */
    @Export(name="assignIpv6AddressOnCreation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> assignIpv6AddressOnCreation;

    /**
     * @return Specify true to indicate
     * that network interfaces created in the specified subnet should be
     * assigned an IPv6 address. Default is `false`
     * 
     */
    public Output</* @Nullable */ Boolean> assignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }
    /**
     * AZ for the subnet.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return AZ for the subnet.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * AZ ID of the subnet. This argument is not supported in all regions or partitions. If necessary, use `availability_zone` instead.
     * 
     */
    @Export(name="availabilityZoneId", type=String.class, parameters={})
    private Output<String> availabilityZoneId;

    /**
     * @return AZ ID of the subnet. This argument is not supported in all regions or partitions. If necessary, use `availability_zone` instead.
     * 
     */
    public Output<String> availabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * The IPv4 CIDR block for the subnet.
     * 
     */
    @Export(name="cidrBlock", type=String.class, parameters={})
    private Output</* @Nullable */ String> cidrBlock;

    /**
     * @return The IPv4 CIDR block for the subnet.
     * 
     */
    public Output</* @Nullable */ String> cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The customer owned IPv4 address pool. Typically used with the `map_customer_owned_ip_on_launch` argument. The `outpost_arn` argument must be specified when configured.
     * 
     */
    @Export(name="customerOwnedIpv4Pool", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerOwnedIpv4Pool;

    /**
     * @return The customer owned IPv4 address pool. Typically used with the `map_customer_owned_ip_on_launch` argument. The `outpost_arn` argument must be specified when configured.
     * 
     */
    public Output</* @Nullable */ String> customerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    /**
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic IPv6 addresses for IPv4-only destinations. Default: `false`.
     * 
     */
    @Export(name="enableDns64", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDns64;

    /**
     * @return Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic IPv6 addresses for IPv4-only destinations. Default: `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> enableDns64() {
        return this.enableDns64;
    }
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records. Default: `false`.
     * 
     */
    @Export(name="enableResourceNameDnsARecordOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableResourceNameDnsARecordOnLaunch;

    /**
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS A records. Default: `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> enableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch;
    }
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records. Default: `false`.
     * 
     */
    @Export(name="enableResourceNameDnsAaaaRecordOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableResourceNameDnsAaaaRecordOnLaunch;

    /**
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records. Default: `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> enableResourceNameDnsAaaaRecordOnLaunch() {
        return this.enableResourceNameDnsAaaaRecordOnLaunch;
    }
    /**
     * The IPv6 network range for the subnet,
     * in CIDR notation. The subnet size must use a /64 prefix length.
     * 
     */
    @Export(name="ipv6CidrBlock", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv6CidrBlock;

    /**
     * @return The IPv6 network range for the subnet,
     * in CIDR notation. The subnet size must use a /64 prefix length.
     * 
     */
    public Output</* @Nullable */ String> ipv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * The association ID for the IPv6 CIDR block.
     * 
     */
    @Export(name="ipv6CidrBlockAssociationId", type=String.class, parameters={})
    private Output<String> ipv6CidrBlockAssociationId;

    /**
     * @return The association ID for the IPv6 CIDR block.
     * 
     */
    public Output<String> ipv6CidrBlockAssociationId() {
        return this.ipv6CidrBlockAssociationId;
    }
    /**
     * Indicates whether to create an IPv6-only subnet. Default: `false`.
     * 
     */
    @Export(name="ipv6Native", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ipv6Native;

    /**
     * @return Indicates whether to create an IPv6-only subnet. Default: `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> ipv6Native() {
        return this.ipv6Native;
    }
    /**
     * Specify `true` to indicate that network interfaces created in the subnet should be assigned a customer owned IP address. The `customer_owned_ipv4_pool` and `outpost_arn` arguments must be specified when set to `true`. Default is `false`.
     * 
     */
    @Export(name="mapCustomerOwnedIpOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> mapCustomerOwnedIpOnLaunch;

    /**
     * @return Specify `true` to indicate that network interfaces created in the subnet should be assigned a customer owned IP address. The `customer_owned_ipv4_pool` and `outpost_arn` arguments must be specified when set to `true`. Default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> mapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }
    /**
     * Specify true to indicate
     * that instances launched into the subnet should be assigned
     * a public IP address. Default is `false`.
     * 
     */
    @Export(name="mapPublicIpOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> mapPublicIpOnLaunch;

    /**
     * @return Specify true to indicate
     * that instances launched into the subnet should be assigned
     * a public IP address. Default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> mapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }
    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    @Export(name="outpostArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> outpostArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    public Output</* @Nullable */ String> outpostArn() {
        return this.outpostArn;
    }
    /**
     * The ID of the AWS account that owns the subnet.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the subnet.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The type of hostnames to assign to instances in the subnet at launch. For IPv4-only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6-only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID. Valid values: `ip-name`, `resource-name`.
     * 
     */
    @Export(name="privateDnsHostnameTypeOnLaunch", type=String.class, parameters={})
    private Output<String> privateDnsHostnameTypeOnLaunch;

    /**
     * @return The type of hostnames to assign to instances in the subnet at launch. For IPv4-only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6-only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID. Valid values: `ip-name`, `resource-name`.
     * 
     */
    public Output<String> privateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch;
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
     * The VPC ID.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC ID.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subnet(String name) {
        this(name, SubnetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subnet(String name, SubnetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subnet(String name, SubnetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/subnet:Subnet", name, args == null ? SubnetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subnet(String name, Output<String> id, @Nullable SubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/subnet:Subnet", name, state, makeResourceOptions(options, id));
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
    public static Subnet get(String name, Output<String> id, @Nullable SubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subnet(name, id, state, options);
    }
}
