// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInterfaceState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceState Empty = new NetworkInterfaceState();

    /**
     * ARN of the network interface.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Configuration block to define the attachment of the ENI. See below.
     * 
     */
    @Import(name="attachments")
    private @Nullable Output<List<NetworkInterfaceAttachmentGetArgs>> attachments;

    public Optional<Output<List<NetworkInterfaceAttachmentGetArgs>>> attachments() {
        return Optional.ofNullable(this.attachments);
    }

    /**
     * Description for the network interface.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Type of network interface to create. Set to `efa` for Elastic Fabric Adapter. Changing `interface_type` will cause the resource to be destroyed and re-created.
     * 
     */
    @Import(name="interfaceType")
    private @Nullable Output<String> interfaceType;

    public Optional<Output<String>> interfaceType() {
        return Optional.ofNullable(this.interfaceType);
    }

    /**
     * Number of IPv4 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @Import(name="ipv4PrefixCount")
    private @Nullable Output<Integer> ipv4PrefixCount;

    public Optional<Output<Integer>> ipv4PrefixCount() {
        return Optional.ofNullable(this.ipv4PrefixCount);
    }

    /**
     * One or more IPv4 prefixes assigned to the network interface.
     * 
     */
    @Import(name="ipv4Prefixes")
    private @Nullable Output<List<String>> ipv4Prefixes;

    public Optional<Output<List<String>>> ipv4Prefixes() {
        return Optional.ofNullable(this.ipv4Prefixes);
    }

    /**
     * Number of IPv6 addresses to assign to a network interface. You can&#39;t use this option if specifying specific `ipv6_addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
     * 
     */
    @Import(name="ipv6AddressCount")
    private @Nullable Output<Integer> ipv6AddressCount;

    public Optional<Output<Integer>> ipv6AddressCount() {
        return Optional.ofNullable(this.ipv6AddressCount);
    }

    @Import(name="ipv6AddressListEnabled")
    private @Nullable Output<Boolean> ipv6AddressListEnabled;

    public Optional<Output<Boolean>> ipv6AddressListEnabled() {
        return Optional.ofNullable(this.ipv6AddressListEnabled);
    }

    /**
     * List of private IPs to assign to the ENI in sequential order.
     * 
     */
    @Import(name="ipv6AddressLists")
    private @Nullable Output<List<String>> ipv6AddressLists;

    public Optional<Output<List<String>>> ipv6AddressLists() {
        return Optional.ofNullable(this.ipv6AddressLists);
    }

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Addresses are assigned without regard to order. You can&#39;t use this option if you&#39;re specifying `ipv6_address_count`.
     * 
     */
    @Import(name="ipv6Addresses")
    private @Nullable Output<List<String>> ipv6Addresses;

    public Optional<Output<List<String>>> ipv6Addresses() {
        return Optional.ofNullable(this.ipv6Addresses);
    }

    /**
     * Number of IPv6 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @Import(name="ipv6PrefixCount")
    private @Nullable Output<Integer> ipv6PrefixCount;

    public Optional<Output<Integer>> ipv6PrefixCount() {
        return Optional.ofNullable(this.ipv6PrefixCount);
    }

    /**
     * One or more IPv6 prefixes assigned to the network interface.
     * 
     */
    @Import(name="ipv6Prefixes")
    private @Nullable Output<List<String>> ipv6Prefixes;

    public Optional<Output<List<String>>> ipv6Prefixes() {
        return Optional.ofNullable(this.ipv6Prefixes);
    }

    /**
     * MAC address of the network interface.
     * 
     */
    @Import(name="macAddress")
    private @Nullable Output<String> macAddress;

    public Optional<Output<String>> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }

    @Import(name="outpostArn")
    private @Nullable Output<String> outpostArn;

    public Optional<Output<String>> outpostArn() {
        return Optional.ofNullable(this.outpostArn);
    }

    /**
     * AWS account ID of the owner of the network interface.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * Private DNS name of the network interface (IPv4).
     * 
     */
    @Import(name="privateDnsName")
    private @Nullable Output<String> privateDnsName;

    public Optional<Output<String>> privateDnsName() {
        return Optional.ofNullable(this.privateDnsName);
    }

    @Import(name="privateIp")
    private @Nullable Output<String> privateIp;

    public Optional<Output<String>> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }

    @Import(name="privateIpListEnabled")
    private @Nullable Output<Boolean> privateIpListEnabled;

    public Optional<Output<Boolean>> privateIpListEnabled() {
        return Optional.ofNullable(this.privateIpListEnabled);
    }

    /**
     * List of private IPs to assign to the ENI in sequential order. Requires setting `private_ip_list_enable` to `true`.
     * 
     */
    @Import(name="privateIpLists")
    private @Nullable Output<List<String>> privateIpLists;

    public Optional<Output<List<String>>> privateIpLists() {
        return Optional.ofNullable(this.privateIpLists);
    }

    /**
     * List of private IPs to assign to the ENI without regard to order.
     * 
     */
    @Import(name="privateIps")
    private @Nullable Output<List<String>> privateIps;

    public Optional<Output<List<String>>> privateIps() {
        return Optional.ofNullable(this.privateIps);
    }

    /**
     * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + `private_ips_count`, as a primary private IP will be assiged to an ENI by default.
     * 
     */
    @Import(name="privateIpsCount")
    private @Nullable Output<Integer> privateIpsCount;

    public Optional<Output<Integer>> privateIpsCount() {
        return Optional.ofNullable(this.privateIpsCount);
    }

    /**
     * List of security group IDs to assign to the ENI.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * Whether to enable source destination checking for the ENI. Default true.
     * 
     */
    @Import(name="sourceDestCheck")
    private @Nullable Output<Boolean> sourceDestCheck;

    public Optional<Output<Boolean>> sourceDestCheck() {
        return Optional.ofNullable(this.sourceDestCheck);
    }

    /**
     * Subnet ID to create the ENI in.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private NetworkInterfaceState() {}

    private NetworkInterfaceState(NetworkInterfaceState $) {
        this.arn = $.arn;
        this.attachments = $.attachments;
        this.description = $.description;
        this.interfaceType = $.interfaceType;
        this.ipv4PrefixCount = $.ipv4PrefixCount;
        this.ipv4Prefixes = $.ipv4Prefixes;
        this.ipv6AddressCount = $.ipv6AddressCount;
        this.ipv6AddressListEnabled = $.ipv6AddressListEnabled;
        this.ipv6AddressLists = $.ipv6AddressLists;
        this.ipv6Addresses = $.ipv6Addresses;
        this.ipv6PrefixCount = $.ipv6PrefixCount;
        this.ipv6Prefixes = $.ipv6Prefixes;
        this.macAddress = $.macAddress;
        this.outpostArn = $.outpostArn;
        this.ownerId = $.ownerId;
        this.privateDnsName = $.privateDnsName;
        this.privateIp = $.privateIp;
        this.privateIpListEnabled = $.privateIpListEnabled;
        this.privateIpLists = $.privateIpLists;
        this.privateIps = $.privateIps;
        this.privateIpsCount = $.privateIpsCount;
        this.securityGroups = $.securityGroups;
        this.sourceDestCheck = $.sourceDestCheck;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceState $;

        public Builder() {
            $ = new NetworkInterfaceState();
        }

        public Builder(NetworkInterfaceState defaults) {
            $ = new NetworkInterfaceState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder attachments(@Nullable Output<List<NetworkInterfaceAttachmentGetArgs>> attachments) {
            $.attachments = attachments;
            return this;
        }

        public Builder attachments(List<NetworkInterfaceAttachmentGetArgs> attachments) {
            return attachments(Output.of(attachments));
        }

        public Builder attachments(NetworkInterfaceAttachmentGetArgs... attachments) {
            return attachments(List.of(attachments));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder interfaceType(@Nullable Output<String> interfaceType) {
            $.interfaceType = interfaceType;
            return this;
        }

        public Builder interfaceType(String interfaceType) {
            return interfaceType(Output.of(interfaceType));
        }

        public Builder ipv4PrefixCount(@Nullable Output<Integer> ipv4PrefixCount) {
            $.ipv4PrefixCount = ipv4PrefixCount;
            return this;
        }

        public Builder ipv4PrefixCount(Integer ipv4PrefixCount) {
            return ipv4PrefixCount(Output.of(ipv4PrefixCount));
        }

        public Builder ipv4Prefixes(@Nullable Output<List<String>> ipv4Prefixes) {
            $.ipv4Prefixes = ipv4Prefixes;
            return this;
        }

        public Builder ipv4Prefixes(List<String> ipv4Prefixes) {
            return ipv4Prefixes(Output.of(ipv4Prefixes));
        }

        public Builder ipv4Prefixes(String... ipv4Prefixes) {
            return ipv4Prefixes(List.of(ipv4Prefixes));
        }

        public Builder ipv6AddressCount(@Nullable Output<Integer> ipv6AddressCount) {
            $.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            return ipv6AddressCount(Output.of(ipv6AddressCount));
        }

        public Builder ipv6AddressListEnabled(@Nullable Output<Boolean> ipv6AddressListEnabled) {
            $.ipv6AddressListEnabled = ipv6AddressListEnabled;
            return this;
        }

        public Builder ipv6AddressListEnabled(Boolean ipv6AddressListEnabled) {
            return ipv6AddressListEnabled(Output.of(ipv6AddressListEnabled));
        }

        public Builder ipv6AddressLists(@Nullable Output<List<String>> ipv6AddressLists) {
            $.ipv6AddressLists = ipv6AddressLists;
            return this;
        }

        public Builder ipv6AddressLists(List<String> ipv6AddressLists) {
            return ipv6AddressLists(Output.of(ipv6AddressLists));
        }

        public Builder ipv6AddressLists(String... ipv6AddressLists) {
            return ipv6AddressLists(List.of(ipv6AddressLists));
        }

        public Builder ipv6Addresses(@Nullable Output<List<String>> ipv6Addresses) {
            $.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder ipv6Addresses(List<String> ipv6Addresses) {
            return ipv6Addresses(Output.of(ipv6Addresses));
        }

        public Builder ipv6Addresses(String... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }

        public Builder ipv6PrefixCount(@Nullable Output<Integer> ipv6PrefixCount) {
            $.ipv6PrefixCount = ipv6PrefixCount;
            return this;
        }

        public Builder ipv6PrefixCount(Integer ipv6PrefixCount) {
            return ipv6PrefixCount(Output.of(ipv6PrefixCount));
        }

        public Builder ipv6Prefixes(@Nullable Output<List<String>> ipv6Prefixes) {
            $.ipv6Prefixes = ipv6Prefixes;
            return this;
        }

        public Builder ipv6Prefixes(List<String> ipv6Prefixes) {
            return ipv6Prefixes(Output.of(ipv6Prefixes));
        }

        public Builder ipv6Prefixes(String... ipv6Prefixes) {
            return ipv6Prefixes(List.of(ipv6Prefixes));
        }

        public Builder macAddress(@Nullable Output<String> macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        public Builder macAddress(String macAddress) {
            return macAddress(Output.of(macAddress));
        }

        public Builder outpostArn(@Nullable Output<String> outpostArn) {
            $.outpostArn = outpostArn;
            return this;
        }

        public Builder outpostArn(String outpostArn) {
            return outpostArn(Output.of(outpostArn));
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        public Builder privateDnsName(@Nullable Output<String> privateDnsName) {
            $.privateDnsName = privateDnsName;
            return this;
        }

        public Builder privateDnsName(String privateDnsName) {
            return privateDnsName(Output.of(privateDnsName));
        }

        public Builder privateIp(@Nullable Output<String> privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        public Builder privateIp(String privateIp) {
            return privateIp(Output.of(privateIp));
        }

        public Builder privateIpListEnabled(@Nullable Output<Boolean> privateIpListEnabled) {
            $.privateIpListEnabled = privateIpListEnabled;
            return this;
        }

        public Builder privateIpListEnabled(Boolean privateIpListEnabled) {
            return privateIpListEnabled(Output.of(privateIpListEnabled));
        }

        public Builder privateIpLists(@Nullable Output<List<String>> privateIpLists) {
            $.privateIpLists = privateIpLists;
            return this;
        }

        public Builder privateIpLists(List<String> privateIpLists) {
            return privateIpLists(Output.of(privateIpLists));
        }

        public Builder privateIpLists(String... privateIpLists) {
            return privateIpLists(List.of(privateIpLists));
        }

        public Builder privateIps(@Nullable Output<List<String>> privateIps) {
            $.privateIps = privateIps;
            return this;
        }

        public Builder privateIps(List<String> privateIps) {
            return privateIps(Output.of(privateIps));
        }

        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }

        public Builder privateIpsCount(@Nullable Output<Integer> privateIpsCount) {
            $.privateIpsCount = privateIpsCount;
            return this;
        }

        public Builder privateIpsCount(Integer privateIpsCount) {
            return privateIpsCount(Output.of(privateIpsCount));
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        public Builder sourceDestCheck(@Nullable Output<Boolean> sourceDestCheck) {
            $.sourceDestCheck = sourceDestCheck;
            return this;
        }

        public Builder sourceDestCheck(Boolean sourceDestCheck) {
            return sourceDestCheck(Output.of(sourceDestCheck));
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public NetworkInterfaceState build() {
            return $;
        }
    }

}
