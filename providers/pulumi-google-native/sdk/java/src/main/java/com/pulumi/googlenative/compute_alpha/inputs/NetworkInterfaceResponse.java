// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.AccessConfigResponse;
import com.pulumi.googlenative.compute_alpha.inputs.AliasIpRangeResponse;
import com.pulumi.googlenative.compute_alpha.inputs.NetworkInterfaceSubInterfaceResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A network interface resource attached to an instance.
 * 
 */
public final class NetworkInterfaceResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceResponse Empty = new NetworkInterfaceResponse();

    /**
     * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
     */
    @Import(name="accessConfigs", required=true)
      private final List<AccessConfigResponse> accessConfigs;

    public List<AccessConfigResponse> accessConfigs() {
        return this.accessConfigs;
    }

    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
     */
    @Import(name="aliasIpRanges", required=true)
      private final List<AliasIpRangeResponse> aliasIpRanges;

    public List<AliasIpRangeResponse> aliasIpRanges() {
        return this.aliasIpRanges;
    }

    /**
     * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface. The request will fail with error 400 Bad Request if the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
     * 
     */
    @Import(name="fingerprint", required=true)
      private final String fingerprint;

    public String fingerprint() {
        return this.fingerprint;
    }

    /**
     * The prefix length of the primary internal IPv6 range.
     * 
     */
    @Import(name="internalIpv6PrefixLength", required=true)
      private final Integer internalIpv6PrefixLength;

    public Integer internalIpv6PrefixLength() {
        return this.internalIpv6PrefixLength;
    }

    /**
     * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    @Import(name="ipv6AccessConfigs", required=true)
      private final List<AccessConfigResponse> ipv6AccessConfigs;

    public List<AccessConfigResponse> ipv6AccessConfigs() {
        return this.ipv6AccessConfigs;
    }

    /**
     * One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork. Valid only if stackType is IPV4_IPV6.
     * 
     */
    @Import(name="ipv6AccessType", required=true)
      private final String ipv6AccessType;

    public String ipv6AccessType() {
        return this.ipv6AccessType;
    }

    /**
     * An IPv6 internal network address for this network interface.
     * 
     */
    @Import(name="ipv6Address", required=true)
      private final String ipv6Address;

    public String ipv6Address() {
        return this.ipv6Address;
    }

    /**
     * Type of the resource. Always compute#networkInterface for network interfaces.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The name of the network interface, which is generated by the server. For network devices, these are eth0, eth1, etc.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn't have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
     */
    @Import(name="network", required=true)
      private final String network;

    public String network() {
        return this.network;
    }

    /**
     * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
     */
    @Import(name="networkIP", required=true)
      private final String networkIP;

    public String networkIP() {
        return this.networkIP;
    }

    /**
     * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @Import(name="nicType", required=true)
      private final String nicType;

    public String nicType() {
        return this.nicType;
    }

    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It'll be empty if not specified by the users.
     * 
     */
    @Import(name="queueCount", required=true)
      private final Integer queueCount;

    public Integer queueCount() {
        return this.queueCount;
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    @Import(name="stackType", required=true)
      private final String stackType;

    public String stackType() {
        return this.stackType;
    }

    /**
     * SubInterfaces help enable L2 communication for the instance over subnetworks that support L2. Every network interface will get a default untagged (vlan not specified) subinterface. Users can specify additional tagged subinterfaces which are sub-fields to the Network Interface.
     * 
     */
    @Import(name="subinterfaces", required=true)
      private final List<NetworkInterfaceSubInterfaceResponse> subinterfaces;

    public List<NetworkInterfaceSubInterfaceResponse> subinterfaces() {
        return this.subinterfaces;
    }

    /**
     * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    @Import(name="subnetwork", required=true)
      private final String subnetwork;

    public String subnetwork() {
        return this.subnetwork;
    }

    public NetworkInterfaceResponse(
        List<AccessConfigResponse> accessConfigs,
        List<AliasIpRangeResponse> aliasIpRanges,
        String fingerprint,
        Integer internalIpv6PrefixLength,
        List<AccessConfigResponse> ipv6AccessConfigs,
        String ipv6AccessType,
        String ipv6Address,
        String kind,
        String name,
        String network,
        String networkIP,
        String nicType,
        Integer queueCount,
        String stackType,
        List<NetworkInterfaceSubInterfaceResponse> subinterfaces,
        String subnetwork) {
        this.accessConfigs = Objects.requireNonNull(accessConfigs, "expected parameter 'accessConfigs' to be non-null");
        this.aliasIpRanges = Objects.requireNonNull(aliasIpRanges, "expected parameter 'aliasIpRanges' to be non-null");
        this.fingerprint = Objects.requireNonNull(fingerprint, "expected parameter 'fingerprint' to be non-null");
        this.internalIpv6PrefixLength = Objects.requireNonNull(internalIpv6PrefixLength, "expected parameter 'internalIpv6PrefixLength' to be non-null");
        this.ipv6AccessConfigs = Objects.requireNonNull(ipv6AccessConfigs, "expected parameter 'ipv6AccessConfigs' to be non-null");
        this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType, "expected parameter 'ipv6AccessType' to be non-null");
        this.ipv6Address = Objects.requireNonNull(ipv6Address, "expected parameter 'ipv6Address' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.networkIP = Objects.requireNonNull(networkIP, "expected parameter 'networkIP' to be non-null");
        this.nicType = Objects.requireNonNull(nicType, "expected parameter 'nicType' to be non-null");
        this.queueCount = Objects.requireNonNull(queueCount, "expected parameter 'queueCount' to be non-null");
        this.stackType = Objects.requireNonNull(stackType, "expected parameter 'stackType' to be non-null");
        this.subinterfaces = Objects.requireNonNull(subinterfaces, "expected parameter 'subinterfaces' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private NetworkInterfaceResponse() {
        this.accessConfigs = List.of();
        this.aliasIpRanges = List.of();
        this.fingerprint = null;
        this.internalIpv6PrefixLength = null;
        this.ipv6AccessConfigs = List.of();
        this.ipv6AccessType = null;
        this.ipv6Address = null;
        this.kind = null;
        this.name = null;
        this.network = null;
        this.networkIP = null;
        this.nicType = null;
        this.queueCount = null;
        this.stackType = null;
        this.subinterfaces = List.of();
        this.subnetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AccessConfigResponse> accessConfigs;
        private List<AliasIpRangeResponse> aliasIpRanges;
        private String fingerprint;
        private Integer internalIpv6PrefixLength;
        private List<AccessConfigResponse> ipv6AccessConfigs;
        private String ipv6AccessType;
        private String ipv6Address;
        private String kind;
        private String name;
        private String network;
        private String networkIP;
        private String nicType;
        private Integer queueCount;
        private String stackType;
        private List<NetworkInterfaceSubInterfaceResponse> subinterfaces;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.fingerprint = defaults.fingerprint;
    	      this.internalIpv6PrefixLength = defaults.internalIpv6PrefixLength;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIP = defaults.networkIP;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subinterfaces = defaults.subinterfaces;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder accessConfigs(List<AccessConfigResponse> accessConfigs) {
            this.accessConfigs = Objects.requireNonNull(accessConfigs);
            return this;
        }
        public Builder accessConfigs(AccessConfigResponse... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }
        public Builder aliasIpRanges(List<AliasIpRangeResponse> aliasIpRanges) {
            this.aliasIpRanges = Objects.requireNonNull(aliasIpRanges);
            return this;
        }
        public Builder aliasIpRanges(AliasIpRangeResponse... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder internalIpv6PrefixLength(Integer internalIpv6PrefixLength) {
            this.internalIpv6PrefixLength = Objects.requireNonNull(internalIpv6PrefixLength);
            return this;
        }
        public Builder ipv6AccessConfigs(List<AccessConfigResponse> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Objects.requireNonNull(ipv6AccessConfigs);
            return this;
        }
        public Builder ipv6AccessConfigs(AccessConfigResponse... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }
        public Builder ipv6AccessType(String ipv6AccessType) {
            this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
            return this;
        }
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkIP(String networkIP) {
            this.networkIP = Objects.requireNonNull(networkIP);
            return this;
        }
        public Builder nicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }
        public Builder queueCount(Integer queueCount) {
            this.queueCount = Objects.requireNonNull(queueCount);
            return this;
        }
        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }
        public Builder subinterfaces(List<NetworkInterfaceSubInterfaceResponse> subinterfaces) {
            this.subinterfaces = Objects.requireNonNull(subinterfaces);
            return this;
        }
        public Builder subinterfaces(NetworkInterfaceSubInterfaceResponse... subinterfaces) {
            return subinterfaces(List.of(subinterfaces));
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(accessConfigs, aliasIpRanges, fingerprint, internalIpv6PrefixLength, ipv6AccessConfigs, ipv6AccessType, ipv6Address, kind, name, network, networkIP, nicType, queueCount, stackType, subinterfaces, subnetwork);
        }
    }
}
