// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAccessConfigArgs;
import com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAliasIpRangeArgs;
import com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceIpv6AccessConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceArgs extends ResourceArgs {

    public static final InstanceNetworkInterfaceArgs Empty = new InstanceNetworkInterfaceArgs();

    /**
     * Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet. If omitted, ssh will not
     * work unless this provider can send traffic to the instance&#39;s network (e.g. via
     * tunnel or because it is running on another cloud instance on that network).
     * This block can be repeated multiple times. Structure documented below.
     * 
     */
    @Import(name="accessConfigs")
    private @Nullable Output<List<InstanceNetworkInterfaceAccessConfigArgs>> accessConfigs;

    /**
     * @return Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet. If omitted, ssh will not
     * work unless this provider can send traffic to the instance&#39;s network (e.g. via
     * tunnel or because it is running on another cloud instance on that network).
     * This block can be repeated multiple times. Structure documented below.
     * 
     */
    public Optional<Output<List<InstanceNetworkInterfaceAccessConfigArgs>>> accessConfigs() {
        return Optional.ofNullable(this.accessConfigs);
    }

    /**
     * An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
     */
    @Import(name="aliasIpRanges")
    private @Nullable Output<List<InstanceNetworkInterfaceAliasIpRangeArgs>> aliasIpRanges;

    /**
     * @return An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
     */
    public Optional<Output<List<InstanceNetworkInterfaceAliasIpRangeArgs>>> aliasIpRanges() {
        return Optional.ofNullable(this.aliasIpRanges);
    }

    /**
     * An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * 
     */
    @Import(name="ipv6AccessConfigs")
    private @Nullable Output<List<InstanceNetworkInterfaceIpv6AccessConfigArgs>> ipv6AccessConfigs;

    /**
     * @return An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * 
     */
    public Optional<Output<List<InstanceNetworkInterfaceIpv6AccessConfigArgs>>> ipv6AccessConfigs() {
        return Optional.ofNullable(this.ipv6AccessConfigs);
    }

    /**
     * One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet.
     * This field is always inherited from its subnetwork.
     * 
     */
    @Import(name="ipv6AccessType")
    private @Nullable Output<String> ipv6AccessType;

    /**
     * @return One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet.
     * This field is always inherited from its subnetwork.
     * 
     */
    public Optional<Output<String>> ipv6AccessType() {
        return Optional.ofNullable(this.ipv6AccessType);
    }

    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name or self_link of the network to attach this interface to.
     * Either `network` or `subnetwork` must be provided. If network isn&#39;t provided it will
     * be inferred from the subnetwork.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The name or self_link of the network to attach this interface to.
     * Either `network` or `subnetwork` must be provided. If network isn&#39;t provided it will
     * be inferred from the subnetwork.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
     */
    @Import(name="networkIp")
    private @Nullable Output<String> networkIp;

    /**
     * @return The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
     */
    public Optional<Output<String>> networkIp() {
        return Optional.ofNullable(this.networkIp);
    }

    /**
     * The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
     * 
     */
    @Import(name="nicType")
    private @Nullable Output<String> nicType;

    /**
     * @return The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
     * 
     */
    public Optional<Output<String>> nicType() {
        return Optional.ofNullable(this.nicType);
    }

    /**
     * The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
     */
    @Import(name="queueCount")
    private @Nullable Output<Integer> queueCount;

    /**
     * @return The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
     */
    public Optional<Output<Integer>> queueCount() {
        return Optional.ofNullable(this.queueCount);
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
     * 
     */
    @Import(name="stackType")
    private @Nullable Output<String> stackType;

    /**
     * @return The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
     * 
     */
    public Optional<Output<String>> stackType() {
        return Optional.ofNullable(this.stackType);
    }

    /**
     * The name or self_link of the subnetwork to attach this
     * interface to. Either `network` or `subnetwork` must be provided. If network isn&#39;t provided
     * it will be inferred from the subnetwork. The subnetwork must exist in the same region this
     * instance will be created in. If the network resource is in
     * [legacy](https://cloud.google.com/vpc/docs/legacy) mode, do not specify this field. If the
     * network is in auto subnet mode, specifying the subnetwork is optional. If the network is
     * in custom subnet mode, specifying the subnetwork is required.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The name or self_link of the subnetwork to attach this
     * interface to. Either `network` or `subnetwork` must be provided. If network isn&#39;t provided
     * it will be inferred from the subnetwork. The subnetwork must exist in the same region this
     * instance will be created in. If the network resource is in
     * [legacy](https://cloud.google.com/vpc/docs/legacy) mode, do not specify this field. If the
     * network is in auto subnet mode, specifying the subnetwork is optional. If the network is
     * in custom subnet mode, specifying the subnetwork is required.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * The project in which the subnetwork belongs.
     * If the `subnetwork` is a self_link, this field is ignored in favor of the project
     * defined in the subnetwork self_link. If the `subnetwork` is a name and this
     * field is not provided, the provider project is used.
     * 
     */
    @Import(name="subnetworkProject")
    private @Nullable Output<String> subnetworkProject;

    /**
     * @return The project in which the subnetwork belongs.
     * If the `subnetwork` is a self_link, this field is ignored in favor of the project
     * defined in the subnetwork self_link. If the `subnetwork` is a name and this
     * field is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> subnetworkProject() {
        return Optional.ofNullable(this.subnetworkProject);
    }

    private InstanceNetworkInterfaceArgs() {}

    private InstanceNetworkInterfaceArgs(InstanceNetworkInterfaceArgs $) {
        this.accessConfigs = $.accessConfigs;
        this.aliasIpRanges = $.aliasIpRanges;
        this.ipv6AccessConfigs = $.ipv6AccessConfigs;
        this.ipv6AccessType = $.ipv6AccessType;
        this.name = $.name;
        this.network = $.network;
        this.networkIp = $.networkIp;
        this.nicType = $.nicType;
        this.queueCount = $.queueCount;
        this.stackType = $.stackType;
        this.subnetwork = $.subnetwork;
        this.subnetworkProject = $.subnetworkProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceNetworkInterfaceArgs $;

        public Builder() {
            $ = new InstanceNetworkInterfaceArgs();
        }

        public Builder(InstanceNetworkInterfaceArgs defaults) {
            $ = new InstanceNetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessConfigs Access configurations, i.e. IPs via which this
         * instance can be accessed via the Internet. Omit to ensure that the instance
         * is not accessible from the Internet. If omitted, ssh will not
         * work unless this provider can send traffic to the instance&#39;s network (e.g. via
         * tunnel or because it is running on another cloud instance on that network).
         * This block can be repeated multiple times. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(@Nullable Output<List<InstanceNetworkInterfaceAccessConfigArgs>> accessConfigs) {
            $.accessConfigs = accessConfigs;
            return this;
        }

        /**
         * @param accessConfigs Access configurations, i.e. IPs via which this
         * instance can be accessed via the Internet. Omit to ensure that the instance
         * is not accessible from the Internet. If omitted, ssh will not
         * work unless this provider can send traffic to the instance&#39;s network (e.g. via
         * tunnel or because it is running on another cloud instance on that network).
         * This block can be repeated multiple times. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(List<InstanceNetworkInterfaceAccessConfigArgs> accessConfigs) {
            return accessConfigs(Output.of(accessConfigs));
        }

        /**
         * @param accessConfigs Access configurations, i.e. IPs via which this
         * instance can be accessed via the Internet. Omit to ensure that the instance
         * is not accessible from the Internet. If omitted, ssh will not
         * work unless this provider can send traffic to the instance&#39;s network (e.g. via
         * tunnel or because it is running on another cloud instance on that network).
         * This block can be repeated multiple times. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(InstanceNetworkInterfaceAccessConfigArgs... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }

        /**
         * @param aliasIpRanges An
         * array of alias IP ranges for this network interface. Can only be specified for network
         * interfaces on subnet-mode networks. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(@Nullable Output<List<InstanceNetworkInterfaceAliasIpRangeArgs>> aliasIpRanges) {
            $.aliasIpRanges = aliasIpRanges;
            return this;
        }

        /**
         * @param aliasIpRanges An
         * array of alias IP ranges for this network interface. Can only be specified for network
         * interfaces on subnet-mode networks. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(List<InstanceNetworkInterfaceAliasIpRangeArgs> aliasIpRanges) {
            return aliasIpRanges(Output.of(aliasIpRanges));
        }

        /**
         * @param aliasIpRanges An
         * array of alias IP ranges for this network interface. Can only be specified for network
         * interfaces on subnet-mode networks. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(InstanceNetworkInterfaceAliasIpRangeArgs... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface.
         * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
         * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(@Nullable Output<List<InstanceNetworkInterfaceIpv6AccessConfigArgs>> ipv6AccessConfigs) {
            $.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface.
         * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
         * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(List<InstanceNetworkInterfaceIpv6AccessConfigArgs> ipv6AccessConfigs) {
            return ipv6AccessConfigs(Output.of(ipv6AccessConfigs));
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface.
         * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
         * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(InstanceNetworkInterfaceIpv6AccessConfigArgs... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }

        /**
         * @param ipv6AccessType One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet.
         * This field is always inherited from its subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessType(@Nullable Output<String> ipv6AccessType) {
            $.ipv6AccessType = ipv6AccessType;
            return this;
        }

        /**
         * @param ipv6AccessType One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet.
         * This field is always inherited from its subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessType(String ipv6AccessType) {
            return ipv6AccessType(Output.of(ipv6AccessType));
        }

        /**
         * @param name A unique name for the resource, required by GCE.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by GCE.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The name or self_link of the network to attach this interface to.
         * Either `network` or `subnetwork` must be provided. If network isn&#39;t provided it will
         * be inferred from the subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The name or self_link of the network to attach this interface to.
         * Either `network` or `subnetwork` must be provided. If network isn&#39;t provided it will
         * be inferred from the subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param networkIp The private IP address to assign to the instance. If
         * empty, the address will be automatically assigned.
         * 
         * @return builder
         * 
         */
        public Builder networkIp(@Nullable Output<String> networkIp) {
            $.networkIp = networkIp;
            return this;
        }

        /**
         * @param networkIp The private IP address to assign to the instance. If
         * empty, the address will be automatically assigned.
         * 
         * @return builder
         * 
         */
        public Builder networkIp(String networkIp) {
            return networkIp(Output.of(networkIp));
        }

        /**
         * @param nicType The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
         * 
         * @return builder
         * 
         */
        public Builder nicType(@Nullable Output<String> nicType) {
            $.nicType = nicType;
            return this;
        }

        /**
         * @param nicType The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
         * 
         * @return builder
         * 
         */
        public Builder nicType(String nicType) {
            return nicType(Output.of(nicType));
        }

        /**
         * @param queueCount The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
         * 
         * @return builder
         * 
         */
        public Builder queueCount(@Nullable Output<Integer> queueCount) {
            $.queueCount = queueCount;
            return this;
        }

        /**
         * @param queueCount The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
         * 
         * @return builder
         * 
         */
        public Builder queueCount(Integer queueCount) {
            return queueCount(Output.of(queueCount));
        }

        /**
         * @param stackType The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
         * 
         * @return builder
         * 
         */
        public Builder stackType(@Nullable Output<String> stackType) {
            $.stackType = stackType;
            return this;
        }

        /**
         * @param stackType The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
         * 
         * @return builder
         * 
         */
        public Builder stackType(String stackType) {
            return stackType(Output.of(stackType));
        }

        /**
         * @param subnetwork The name or self_link of the subnetwork to attach this
         * interface to. Either `network` or `subnetwork` must be provided. If network isn&#39;t provided
         * it will be inferred from the subnetwork. The subnetwork must exist in the same region this
         * instance will be created in. If the network resource is in
         * [legacy](https://cloud.google.com/vpc/docs/legacy) mode, do not specify this field. If the
         * network is in auto subnet mode, specifying the subnetwork is optional. If the network is
         * in custom subnet mode, specifying the subnetwork is required.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The name or self_link of the subnetwork to attach this
         * interface to. Either `network` or `subnetwork` must be provided. If network isn&#39;t provided
         * it will be inferred from the subnetwork. The subnetwork must exist in the same region this
         * instance will be created in. If the network resource is in
         * [legacy](https://cloud.google.com/vpc/docs/legacy) mode, do not specify this field. If the
         * network is in auto subnet mode, specifying the subnetwork is optional. If the network is
         * in custom subnet mode, specifying the subnetwork is required.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param subnetworkProject The project in which the subnetwork belongs.
         * If the `subnetwork` is a self_link, this field is ignored in favor of the project
         * defined in the subnetwork self_link. If the `subnetwork` is a name and this
         * field is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkProject(@Nullable Output<String> subnetworkProject) {
            $.subnetworkProject = subnetworkProject;
            return this;
        }

        /**
         * @param subnetworkProject The project in which the subnetwork belongs.
         * If the `subnetwork` is a self_link, this field is ignored in favor of the project
         * defined in the subnetwork self_link. If the `subnetwork` is a name and this
         * field is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkProject(String subnetworkProject) {
            return subnetworkProject(Output.of(subnetworkProject));
        }

        public InstanceNetworkInterfaceArgs build() {
            return $;
        }
    }

}
