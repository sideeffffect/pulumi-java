// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcState extends io.pulumi.resources.ResourceArgs {

    public static final VpcState Empty = new VpcState();

    /**
     * Amazon Resource Name (ARN) of VPC
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or the size of the CIDR block. Default is `false`. Conflicts with `ipv6_ipam_pool_id`
     * 
     */
    @InputImport(name="assignGeneratedIpv6CidrBlock")
      private final @Nullable Input<Boolean> assignGeneratedIpv6CidrBlock;

    public Input<Boolean> getAssignGeneratedIpv6CidrBlock() {
        return this.assignGeneratedIpv6CidrBlock == null ? Input.empty() : this.assignGeneratedIpv6CidrBlock;
    }

    /**
     * The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
     * 
     */
    @InputImport(name="cidrBlock")
      private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * The ID of the network ACL created by default on VPC creation
     * 
     */
    @InputImport(name="defaultNetworkAclId")
      private final @Nullable Input<String> defaultNetworkAclId;

    public Input<String> getDefaultNetworkAclId() {
        return this.defaultNetworkAclId == null ? Input.empty() : this.defaultNetworkAclId;
    }

    /**
     * The ID of the route table created by default on VPC creation
     * 
     */
    @InputImport(name="defaultRouteTableId")
      private final @Nullable Input<String> defaultRouteTableId;

    public Input<String> getDefaultRouteTableId() {
        return this.defaultRouteTableId == null ? Input.empty() : this.defaultRouteTableId;
    }

    /**
     * The ID of the security group created by default on VPC creation
     * 
     */
    @InputImport(name="defaultSecurityGroupId")
      private final @Nullable Input<String> defaultSecurityGroupId;

    public Input<String> getDefaultSecurityGroupId() {
        return this.defaultSecurityGroupId == null ? Input.empty() : this.defaultSecurityGroupId;
    }

    @InputImport(name="dhcpOptionsId")
      private final @Nullable Input<String> dhcpOptionsId;

    public Input<String> getDhcpOptionsId() {
        return this.dhcpOptionsId == null ? Input.empty() : this.dhcpOptionsId;
    }

    /**
     * A boolean flag to enable/disable ClassicLink
     * for the VPC. Only valid in regions and accounts that support EC2 Classic.
     * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
     * 
     */
    @InputImport(name="enableClassiclink")
      private final @Nullable Input<Boolean> enableClassiclink;

    public Input<Boolean> getEnableClassiclink() {
        return this.enableClassiclink == null ? Input.empty() : this.enableClassiclink;
    }

    /**
     * A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
     * Only valid in regions and accounts that support EC2 Classic.
     * 
     */
    @InputImport(name="enableClassiclinkDnsSupport")
      private final @Nullable Input<Boolean> enableClassiclinkDnsSupport;

    public Input<Boolean> getEnableClassiclinkDnsSupport() {
        return this.enableClassiclinkDnsSupport == null ? Input.empty() : this.enableClassiclinkDnsSupport;
    }

    /**
     * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
     * 
     */
    @InputImport(name="enableDnsHostnames")
      private final @Nullable Input<Boolean> enableDnsHostnames;

    public Input<Boolean> getEnableDnsHostnames() {
        return this.enableDnsHostnames == null ? Input.empty() : this.enableDnsHostnames;
    }

    /**
     * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
     * 
     */
    @InputImport(name="enableDnsSupport")
      private final @Nullable Input<Boolean> enableDnsSupport;

    public Input<Boolean> getEnableDnsSupport() {
        return this.enableDnsSupport == null ? Input.empty() : this.enableDnsSupport;
    }

    /**
     * A tenancy option for instances launched into the VPC. Default is `default`, which makes your instances shared on the host. Using either of the other options (`dedicated` or `host`) costs at least $2/hr.
     * 
     */
    @InputImport(name="instanceTenancy")
      private final @Nullable Input<String> instanceTenancy;

    public Input<String> getInstanceTenancy() {
        return this.instanceTenancy == null ? Input.empty() : this.instanceTenancy;
    }

    /**
     * The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
     * 
     */
    @InputImport(name="ipv4IpamPoolId")
      private final @Nullable Input<String> ipv4IpamPoolId;

    public Input<String> getIpv4IpamPoolId() {
        return this.ipv4IpamPoolId == null ? Input.empty() : this.ipv4IpamPoolId;
    }

    /**
     * The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
     * 
     */
    @InputImport(name="ipv4NetmaskLength")
      private final @Nullable Input<Integer> ipv4NetmaskLength;

    public Input<Integer> getIpv4NetmaskLength() {
        return this.ipv4NetmaskLength == null ? Input.empty() : this.ipv4NetmaskLength;
    }

    /**
     * The association ID for the IPv6 CIDR block.
     * * ipv6_cidr_block_network_border_group - The Network Border Group Zone name
     * 
     */
    @InputImport(name="ipv6AssociationId")
      private final @Nullable Input<String> ipv6AssociationId;

    public Input<String> getIpv6AssociationId() {
        return this.ipv6AssociationId == null ? Input.empty() : this.ipv6AssociationId;
    }

    /**
     * IPv6 CIDR block to request from an IPAM Pool. Can be set explicitly or derived from IPAM using `ipv6_netmask_length`.
     * 
     */
    @InputImport(name="ipv6CidrBlock")
      private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

    /**
     * By default when an IPv6 CIDR is assigned to a VPC a default ipv6_cidr_block_network_border_group will be set to the region of the VPC. This can be changed to restrict advertisement of public addresses to specific Network Border Groups such as LocalZones.
     * 
     */
    @InputImport(name="ipv6CidrBlockNetworkBorderGroup")
      private final @Nullable Input<String> ipv6CidrBlockNetworkBorderGroup;

    public Input<String> getIpv6CidrBlockNetworkBorderGroup() {
        return this.ipv6CidrBlockNetworkBorderGroup == null ? Input.empty() : this.ipv6CidrBlockNetworkBorderGroup;
    }

    /**
     * IPAM Pool ID for a IPv6 pool. Conflicts with `assign_generated_ipv6_cidr_block`.
     * 
     */
    @InputImport(name="ipv6IpamPoolId")
      private final @Nullable Input<String> ipv6IpamPoolId;

    public Input<String> getIpv6IpamPoolId() {
        return this.ipv6IpamPoolId == null ? Input.empty() : this.ipv6IpamPoolId;
    }

    /**
     * Netmask length to request from IPAM Pool. Conflicts with `ipv6_cidr_block`. This can be omitted if IPAM pool as a `allocation_default_netmask_length` set. Valid values: `56`.
     * 
     */
    @InputImport(name="ipv6NetmaskLength")
      private final @Nullable Input<Integer> ipv6NetmaskLength;

    public Input<Integer> getIpv6NetmaskLength() {
        return this.ipv6NetmaskLength == null ? Input.empty() : this.ipv6NetmaskLength;
    }

    /**
     * The ID of the main route table associated with
     * this VPC. Note that you can change a VPC's main route table by using an
     * `aws.ec2.MainRouteTableAssociation`.
     * 
     */
    @InputImport(name="mainRouteTableId")
      private final @Nullable Input<String> mainRouteTableId;

    public Input<String> getMainRouteTableId() {
        return this.mainRouteTableId == null ? Input.empty() : this.mainRouteTableId;
    }

    /**
     * The ID of the AWS account that owns the VPC.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public VpcState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> assignGeneratedIpv6CidrBlock,
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> defaultNetworkAclId,
        @Nullable Input<String> defaultRouteTableId,
        @Nullable Input<String> defaultSecurityGroupId,
        @Nullable Input<String> dhcpOptionsId,
        @Nullable Input<Boolean> enableClassiclink,
        @Nullable Input<Boolean> enableClassiclinkDnsSupport,
        @Nullable Input<Boolean> enableDnsHostnames,
        @Nullable Input<Boolean> enableDnsSupport,
        @Nullable Input<String> instanceTenancy,
        @Nullable Input<String> ipv4IpamPoolId,
        @Nullable Input<Integer> ipv4NetmaskLength,
        @Nullable Input<String> ipv6AssociationId,
        @Nullable Input<String> ipv6CidrBlock,
        @Nullable Input<String> ipv6CidrBlockNetworkBorderGroup,
        @Nullable Input<String> ipv6IpamPoolId,
        @Nullable Input<Integer> ipv6NetmaskLength,
        @Nullable Input<String> mainRouteTableId,
        @Nullable Input<String> ownerId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.assignGeneratedIpv6CidrBlock = assignGeneratedIpv6CidrBlock;
        this.cidrBlock = cidrBlock;
        this.defaultNetworkAclId = defaultNetworkAclId;
        this.defaultRouteTableId = defaultRouteTableId;
        this.defaultSecurityGroupId = defaultSecurityGroupId;
        this.dhcpOptionsId = dhcpOptionsId;
        this.enableClassiclink = enableClassiclink;
        this.enableClassiclinkDnsSupport = enableClassiclinkDnsSupport;
        this.enableDnsHostnames = enableDnsHostnames;
        this.enableDnsSupport = enableDnsSupport;
        this.instanceTenancy = instanceTenancy;
        this.ipv4IpamPoolId = ipv4IpamPoolId;
        this.ipv4NetmaskLength = ipv4NetmaskLength;
        this.ipv6AssociationId = ipv6AssociationId;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
        this.ipv6IpamPoolId = ipv6IpamPoolId;
        this.ipv6NetmaskLength = ipv6NetmaskLength;
        this.mainRouteTableId = mainRouteTableId;
        this.ownerId = ownerId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VpcState() {
        this.arn = Input.empty();
        this.assignGeneratedIpv6CidrBlock = Input.empty();
        this.cidrBlock = Input.empty();
        this.defaultNetworkAclId = Input.empty();
        this.defaultRouteTableId = Input.empty();
        this.defaultSecurityGroupId = Input.empty();
        this.dhcpOptionsId = Input.empty();
        this.enableClassiclink = Input.empty();
        this.enableClassiclinkDnsSupport = Input.empty();
        this.enableDnsHostnames = Input.empty();
        this.enableDnsSupport = Input.empty();
        this.instanceTenancy = Input.empty();
        this.ipv4IpamPoolId = Input.empty();
        this.ipv4NetmaskLength = Input.empty();
        this.ipv6AssociationId = Input.empty();
        this.ipv6CidrBlock = Input.empty();
        this.ipv6CidrBlockNetworkBorderGroup = Input.empty();
        this.ipv6IpamPoolId = Input.empty();
        this.ipv6NetmaskLength = Input.empty();
        this.mainRouteTableId = Input.empty();
        this.ownerId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> assignGeneratedIpv6CidrBlock;
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> defaultNetworkAclId;
        private @Nullable Input<String> defaultRouteTableId;
        private @Nullable Input<String> defaultSecurityGroupId;
        private @Nullable Input<String> dhcpOptionsId;
        private @Nullable Input<Boolean> enableClassiclink;
        private @Nullable Input<Boolean> enableClassiclinkDnsSupport;
        private @Nullable Input<Boolean> enableDnsHostnames;
        private @Nullable Input<Boolean> enableDnsSupport;
        private @Nullable Input<String> instanceTenancy;
        private @Nullable Input<String> ipv4IpamPoolId;
        private @Nullable Input<Integer> ipv4NetmaskLength;
        private @Nullable Input<String> ipv6AssociationId;
        private @Nullable Input<String> ipv6CidrBlock;
        private @Nullable Input<String> ipv6CidrBlockNetworkBorderGroup;
        private @Nullable Input<String> ipv6IpamPoolId;
        private @Nullable Input<Integer> ipv6NetmaskLength;
        private @Nullable Input<String> mainRouteTableId;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assignGeneratedIpv6CidrBlock = defaults.assignGeneratedIpv6CidrBlock;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.defaultNetworkAclId = defaults.defaultNetworkAclId;
    	      this.defaultRouteTableId = defaults.defaultRouteTableId;
    	      this.defaultSecurityGroupId = defaults.defaultSecurityGroupId;
    	      this.dhcpOptionsId = defaults.dhcpOptionsId;
    	      this.enableClassiclink = defaults.enableClassiclink;
    	      this.enableClassiclinkDnsSupport = defaults.enableClassiclinkDnsSupport;
    	      this.enableDnsHostnames = defaults.enableDnsHostnames;
    	      this.enableDnsSupport = defaults.enableDnsSupport;
    	      this.instanceTenancy = defaults.instanceTenancy;
    	      this.ipv4IpamPoolId = defaults.ipv4IpamPoolId;
    	      this.ipv4NetmaskLength = defaults.ipv4NetmaskLength;
    	      this.ipv6AssociationId = defaults.ipv6AssociationId;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6CidrBlockNetworkBorderGroup = defaults.ipv6CidrBlockNetworkBorderGroup;
    	      this.ipv6IpamPoolId = defaults.ipv6IpamPoolId;
    	      this.ipv6NetmaskLength = defaults.ipv6NetmaskLength;
    	      this.mainRouteTableId = defaults.mainRouteTableId;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder assignGeneratedIpv6CidrBlock(@Nullable Input<Boolean> assignGeneratedIpv6CidrBlock) {
            this.assignGeneratedIpv6CidrBlock = assignGeneratedIpv6CidrBlock;
            return this;
        }

        public Builder assignGeneratedIpv6CidrBlock(@Nullable Boolean assignGeneratedIpv6CidrBlock) {
            this.assignGeneratedIpv6CidrBlock = Input.ofNullable(assignGeneratedIpv6CidrBlock);
            return this;
        }

        public Builder cidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder defaultNetworkAclId(@Nullable Input<String> defaultNetworkAclId) {
            this.defaultNetworkAclId = defaultNetworkAclId;
            return this;
        }

        public Builder defaultNetworkAclId(@Nullable String defaultNetworkAclId) {
            this.defaultNetworkAclId = Input.ofNullable(defaultNetworkAclId);
            return this;
        }

        public Builder defaultRouteTableId(@Nullable Input<String> defaultRouteTableId) {
            this.defaultRouteTableId = defaultRouteTableId;
            return this;
        }

        public Builder defaultRouteTableId(@Nullable String defaultRouteTableId) {
            this.defaultRouteTableId = Input.ofNullable(defaultRouteTableId);
            return this;
        }

        public Builder defaultSecurityGroupId(@Nullable Input<String> defaultSecurityGroupId) {
            this.defaultSecurityGroupId = defaultSecurityGroupId;
            return this;
        }

        public Builder defaultSecurityGroupId(@Nullable String defaultSecurityGroupId) {
            this.defaultSecurityGroupId = Input.ofNullable(defaultSecurityGroupId);
            return this;
        }

        public Builder dhcpOptionsId(@Nullable Input<String> dhcpOptionsId) {
            this.dhcpOptionsId = dhcpOptionsId;
            return this;
        }

        public Builder dhcpOptionsId(@Nullable String dhcpOptionsId) {
            this.dhcpOptionsId = Input.ofNullable(dhcpOptionsId);
            return this;
        }

        public Builder enableClassiclink(@Nullable Input<Boolean> enableClassiclink) {
            this.enableClassiclink = enableClassiclink;
            return this;
        }

        public Builder enableClassiclink(@Nullable Boolean enableClassiclink) {
            this.enableClassiclink = Input.ofNullable(enableClassiclink);
            return this;
        }

        public Builder enableClassiclinkDnsSupport(@Nullable Input<Boolean> enableClassiclinkDnsSupport) {
            this.enableClassiclinkDnsSupport = enableClassiclinkDnsSupport;
            return this;
        }

        public Builder enableClassiclinkDnsSupport(@Nullable Boolean enableClassiclinkDnsSupport) {
            this.enableClassiclinkDnsSupport = Input.ofNullable(enableClassiclinkDnsSupport);
            return this;
        }

        public Builder enableDnsHostnames(@Nullable Input<Boolean> enableDnsHostnames) {
            this.enableDnsHostnames = enableDnsHostnames;
            return this;
        }

        public Builder enableDnsHostnames(@Nullable Boolean enableDnsHostnames) {
            this.enableDnsHostnames = Input.ofNullable(enableDnsHostnames);
            return this;
        }

        public Builder enableDnsSupport(@Nullable Input<Boolean> enableDnsSupport) {
            this.enableDnsSupport = enableDnsSupport;
            return this;
        }

        public Builder enableDnsSupport(@Nullable Boolean enableDnsSupport) {
            this.enableDnsSupport = Input.ofNullable(enableDnsSupport);
            return this;
        }

        public Builder instanceTenancy(@Nullable Input<String> instanceTenancy) {
            this.instanceTenancy = instanceTenancy;
            return this;
        }

        public Builder instanceTenancy(@Nullable String instanceTenancy) {
            this.instanceTenancy = Input.ofNullable(instanceTenancy);
            return this;
        }

        public Builder ipv4IpamPoolId(@Nullable Input<String> ipv4IpamPoolId) {
            this.ipv4IpamPoolId = ipv4IpamPoolId;
            return this;
        }

        public Builder ipv4IpamPoolId(@Nullable String ipv4IpamPoolId) {
            this.ipv4IpamPoolId = Input.ofNullable(ipv4IpamPoolId);
            return this;
        }

        public Builder ipv4NetmaskLength(@Nullable Input<Integer> ipv4NetmaskLength) {
            this.ipv4NetmaskLength = ipv4NetmaskLength;
            return this;
        }

        public Builder ipv4NetmaskLength(@Nullable Integer ipv4NetmaskLength) {
            this.ipv4NetmaskLength = Input.ofNullable(ipv4NetmaskLength);
            return this;
        }

        public Builder ipv6AssociationId(@Nullable Input<String> ipv6AssociationId) {
            this.ipv6AssociationId = ipv6AssociationId;
            return this;
        }

        public Builder ipv6AssociationId(@Nullable String ipv6AssociationId) {
            this.ipv6AssociationId = Input.ofNullable(ipv6AssociationId);
            return this;
        }

        public Builder ipv6CidrBlock(@Nullable Input<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Input.ofNullable(ipv6CidrBlock);
            return this;
        }

        public Builder ipv6CidrBlockNetworkBorderGroup(@Nullable Input<String> ipv6CidrBlockNetworkBorderGroup) {
            this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
            return this;
        }

        public Builder ipv6CidrBlockNetworkBorderGroup(@Nullable String ipv6CidrBlockNetworkBorderGroup) {
            this.ipv6CidrBlockNetworkBorderGroup = Input.ofNullable(ipv6CidrBlockNetworkBorderGroup);
            return this;
        }

        public Builder ipv6IpamPoolId(@Nullable Input<String> ipv6IpamPoolId) {
            this.ipv6IpamPoolId = ipv6IpamPoolId;
            return this;
        }

        public Builder ipv6IpamPoolId(@Nullable String ipv6IpamPoolId) {
            this.ipv6IpamPoolId = Input.ofNullable(ipv6IpamPoolId);
            return this;
        }

        public Builder ipv6NetmaskLength(@Nullable Input<Integer> ipv6NetmaskLength) {
            this.ipv6NetmaskLength = ipv6NetmaskLength;
            return this;
        }

        public Builder ipv6NetmaskLength(@Nullable Integer ipv6NetmaskLength) {
            this.ipv6NetmaskLength = Input.ofNullable(ipv6NetmaskLength);
            return this;
        }

        public Builder mainRouteTableId(@Nullable Input<String> mainRouteTableId) {
            this.mainRouteTableId = mainRouteTableId;
            return this;
        }

        public Builder mainRouteTableId(@Nullable String mainRouteTableId) {
            this.mainRouteTableId = Input.ofNullable(mainRouteTableId);
            return this;
        }

        public Builder ownerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public VpcState build() {
            return new VpcState(arn, assignGeneratedIpv6CidrBlock, cidrBlock, defaultNetworkAclId, defaultRouteTableId, defaultSecurityGroupId, dhcpOptionsId, enableClassiclink, enableClassiclinkDnsSupport, enableDnsHostnames, enableDnsSupport, instanceTenancy, ipv4IpamPoolId, ipv4NetmaskLength, ipv6AssociationId, ipv6CidrBlock, ipv6CidrBlockNetworkBorderGroup, ipv6IpamPoolId, ipv6NetmaskLength, mainRouteTableId, ownerId, tags, tagsAll);
        }
    }
}
