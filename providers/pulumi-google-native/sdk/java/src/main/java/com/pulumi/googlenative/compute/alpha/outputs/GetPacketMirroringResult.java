// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.PacketMirroringFilterResponse;
import com.pulumi.googlenative.compute.alpha.outputs.PacketMirroringForwardingRuleInfoResponse;
import com.pulumi.googlenative.compute.alpha.outputs.PacketMirroringMirroredResourceInfoResponse;
import com.pulumi.googlenative.compute.alpha.outputs.PacketMirroringNetworkInfoResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPacketMirroringResult {
    /**
     * @return The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    private final PacketMirroringForwardingRuleInfoResponse collectorIlb;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    private final String enable;
    /**
     * @return Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    private final PacketMirroringFilterResponse filter;
    /**
     * @return Type of the resource. Always compute#packetMirroring for packet mirrorings.
     * 
     */
    private final String kind;
    /**
     * @return PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    private final PacketMirroringMirroredResourceInfoResponse mirroredResources;
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    private final PacketMirroringNetworkInfoResponse network;
    /**
     * @return The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    private final Integer priority;
    /**
     * @return URI of the region where the packetMirroring resides.
     * 
     */
    private final String region;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;

    @CustomType.Constructor
    private GetPacketMirroringResult(
        @CustomType.Parameter("collectorIlb") PacketMirroringForwardingRuleInfoResponse collectorIlb,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enable") String enable,
        @CustomType.Parameter("filter") PacketMirroringFilterResponse filter,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("mirroredResources") PacketMirroringMirroredResourceInfoResponse mirroredResources,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") PacketMirroringNetworkInfoResponse network,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId) {
        this.collectorIlb = collectorIlb;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.enable = enable;
        this.filter = filter;
        this.kind = kind;
        this.mirroredResources = mirroredResources;
        this.name = name;
        this.network = network;
        this.priority = priority;
        this.region = region;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
    }

    /**
     * @return The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    public PacketMirroringForwardingRuleInfoResponse collectorIlb() {
        return this.collectorIlb;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    public String enable() {
        return this.enable;
    }
    /**
     * @return Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    public PacketMirroringFilterResponse filter() {
        return this.filter;
    }
    /**
     * @return Type of the resource. Always compute#packetMirroring for packet mirrorings.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    public PacketMirroringMirroredResourceInfoResponse mirroredResources() {
        return this.mirroredResources;
    }
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    public PacketMirroringNetworkInfoResponse network() {
        return this.network;
    }
    /**
     * @return The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return URI of the region where the packetMirroring resides.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPacketMirroringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringForwardingRuleInfoResponse collectorIlb;
        private String creationTimestamp;
        private String description;
        private String enable;
        private PacketMirroringFilterResponse filter;
        private String kind;
        private PacketMirroringMirroredResourceInfoResponse mirroredResources;
        private String name;
        private PacketMirroringNetworkInfoResponse network;
        private Integer priority;
        private String region;
        private String selfLink;
        private String selfLinkWithId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPacketMirroringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectorIlb = defaults.collectorIlb;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
    	      this.kind = defaults.kind;
    	      this.mirroredResources = defaults.mirroredResources;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
        }

        public Builder collectorIlb(PacketMirroringForwardingRuleInfoResponse collectorIlb) {
            this.collectorIlb = Objects.requireNonNull(collectorIlb);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enable(String enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder filter(PacketMirroringFilterResponse filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder mirroredResources(PacketMirroringMirroredResourceInfoResponse mirroredResources) {
            this.mirroredResources = Objects.requireNonNull(mirroredResources);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(PacketMirroringNetworkInfoResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }        public GetPacketMirroringResult build() {
            return new GetPacketMirroringResult(collectorIlb, creationTimestamp, description, enable, filter, kind, mirroredResources, name, network, priority, region, selfLink, selfLinkWithId);
        }
    }
}
