// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectAttachmentBandwidth;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectAttachmentEdgeAvailabilityDomain;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectAttachmentEncryption;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectAttachmentStackType;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectAttachmentType;
import com.pulumi.googlenative.compute_alpha.inputs.InterconnectAttachmentPartnerMetadataArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectAttachmentArgs Empty = new InterconnectAttachmentArgs();

    /**
     * Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.
     * 
     */
    @Import(name="adminEnabled")
    private @Nullable Output<Boolean> adminEnabled;

    public Optional<Output<Boolean>> adminEnabled() {
        return Optional.ofNullable(this.adminEnabled);
    }

    /**
     * Provisioned bandwidth capacity for the interconnect attachment. For attachments of type DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner that is operating the interconnect must set the bandwidth. Output only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: - BPS_50M: 50 Mbit/s - BPS_100M: 100 Mbit/s - BPS_200M: 200 Mbit/s - BPS_300M: 300 Mbit/s - BPS_400M: 400 Mbit/s - BPS_500M: 500 Mbit/s - BPS_1G: 1 Gbit/s - BPS_2G: 2 Gbit/s - BPS_5G: 5 Gbit/s - BPS_10G: 10 Gbit/s - BPS_20G: 20 Gbit/s - BPS_50G: 50 Gbit/s
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<InterconnectAttachmentBandwidth> bandwidth;

    public Optional<Output<InterconnectAttachmentBandwidth>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * Up to 16 candidate prefixes that control the allocation of cloudRouterIpv6Address and customerRouterIpv6Address for this attachment. Each prefix must be in the Global Unique Address (GUA) space. It is highly recommended that it be in a range owned by the requestor. A GUA in a range owned by Google will cause the request to fail. Google will select an available prefix from the supplied candidates or fail the request. If not supplied, a /125 from a Google-owned GUA block will be selected.
     * 
     */
    @Import(name="candidateIpv6Subnets")
    private @Nullable Output<List<String>> candidateIpv6Subnets;

    public Optional<Output<List<String>>> candidateIpv6Subnets() {
        return Optional.ofNullable(this.candidateIpv6Subnets);
    }

    /**
     * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress and customerRouterIpAddress for this attachment. All prefixes must be within link-local address space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to select an unused /29 from the supplied candidate prefix(es). The request will fail if all possible /29s are in use on Google&#39;s edge. If not supplied, Google will randomly select an unused /29 from all of link-local space.
     * 
     */
    @Import(name="candidateSubnets")
    private @Nullable Output<List<String>> candidateSubnets;

    public Optional<Output<List<String>>> candidateSubnets() {
        return Optional.ofNullable(this.candidateSubnets);
    }

    /**
     * If supplied, the interface id (index within the subnet) to be used for the cloud router address. The id must be in the range of 1 to 6. If a subnet mask is supplied, it must be /125, and the subnet should either be 0 or match the selected subnet.
     * 
     */
    @Import(name="cloudRouterIpv6InterfaceId")
    private @Nullable Output<String> cloudRouterIpv6InterfaceId;

    public Optional<Output<String>> cloudRouterIpv6InterfaceId() {
        return Optional.ofNullable(this.cloudRouterIpv6InterfaceId);
    }

    /**
     * If supplied, the interface id (index within the subnet) to be used for the customer router address. The id must be in the range of 1 to 6. If a subnet mask is supplied, it must be /125, and the subnet should either be 0 or match the selected subnet.
     * 
     */
    @Import(name="customerRouterIpv6InterfaceId")
    private @Nullable Output<String> customerRouterIpv6InterfaceId;

    public Optional<Output<String>> customerRouterIpv6InterfaceId() {
        return Optional.ofNullable(this.customerRouterIpv6InterfaceId);
    }

    /**
     * [Output only for types PARTNER and DEDICATED. Not present for PARTNER_PROVIDER.] Dataplane version for this InterconnectAttachment. This field is only present for Dataplane version 2 and higher. Absence of this field in the API output indicates that the Dataplane is version 1.
     * 
     */
    @Import(name="dataplaneVersion")
    private @Nullable Output<Integer> dataplaneVersion;

    public Optional<Output<Integer>> dataplaneVersion() {
        return Optional.ofNullable(this.dataplaneVersion);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Desired availability domain for the attachment. Only available for type PARTNER, at creation time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY - AVAILABILITY_DOMAIN_1 - AVAILABILITY_DOMAIN_2 For improved reliability, customers should configure a pair of attachments, one per availability domain. The selected availability domain will be provided to the Partner via the pairing key, so that the provisioned circuit will lie in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
     * 
     */
    @Import(name="edgeAvailabilityDomain")
    private @Nullable Output<InterconnectAttachmentEdgeAvailabilityDomain> edgeAvailabilityDomain;

    public Optional<Output<InterconnectAttachmentEdgeAvailabilityDomain>> edgeAvailabilityDomain() {
        return Optional.ofNullable(this.edgeAvailabilityDomain);
    }

    /**
     * Indicates the user-supplied encryption option of this VLAN attachment (interconnectAttachment). Can only be specified at attachment creation for PARTNER or DEDICATED attachments. Possible values are: - NONE - This is the default value, which means that the VLAN attachment carries unencrypted traffic. VMs are able to send traffic to, or receive traffic from, such a VLAN attachment. - IPSEC - The VLAN attachment carries only encrypted traffic that is encrypted by an IPsec device, such as an HA VPN gateway or third-party IPsec VPN. VMs cannot directly send traffic to, or receive traffic from, such a VLAN attachment. To use *IPsec-encrypted Cloud Interconnect*, the VLAN attachment must be created with this option. Not currently available publicly.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<InterconnectAttachmentEncryption> encryption;

    public Optional<Output<InterconnectAttachmentEncryption>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * URL of the underlying Interconnect object that this attachment&#39;s traffic will traverse through.
     * 
     */
    @Import(name="interconnect")
    private @Nullable Output<String> interconnect;

    public Optional<Output<String>> interconnect() {
        return Optional.ofNullable(this.interconnect);
    }

    /**
     * A list of URLs of addresses that have been reserved for the VLAN attachment. Used only for the VLAN attachment that has the encryption option as IPSEC. The addresses must be regional internal IP address ranges. When creating an HA VPN gateway over the VLAN attachment, if the attachment is configured to use a regional internal IP address, then the VPN gateway&#39;s IP address is allocated from the IP address range specified here. For example, if the HA VPN gateway&#39;s interface 0 is paired to this VLAN attachment, then a regional internal IP address for the VPN gateway interface 0 will be allocated from the IP address specified for this VLAN attachment. If this field is not specified when creating the VLAN attachment, then later on when creating an HA VPN gateway on this VLAN attachment, the HA VPN gateway&#39;s IP address is allocated from the regional external IP address pool. Not currently available publicly.
     * 
     */
    @Import(name="ipsecInternalAddresses")
    private @Nullable Output<List<String>> ipsecInternalAddresses;

    public Optional<Output<List<String>>> ipsecInternalAddresses() {
        return Optional.ofNullable(this.ipsecInternalAddresses);
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Maximum Transmission Unit (MTU), in bytes, of packets passing through this interconnect attachment. Only 1440 and 1500 are allowed. If not specified, the value will default to 1440.
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to initiate provisioning with a selected partner. Of the form &#34;XXXXX/region/domain&#34;
     * 
     */
    @Import(name="pairingKey")
    private @Nullable Output<String> pairingKey;

    public Optional<Output<String>> pairingKey() {
        return Optional.ofNullable(this.pairingKey);
    }

    /**
     * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available for DEDICATED.
     * 
     */
    @Import(name="partnerAsn")
    private @Nullable Output<String> partnerAsn;

    public Optional<Output<String>> partnerAsn() {
        return Optional.ofNullable(this.partnerAsn);
    }

    /**
     * Informational metadata about Partner attachments from Partners to display to customers. Output only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.
     * 
     */
    @Import(name="partnerMetadata")
    private @Nullable Output<InterconnectAttachmentPartnerMetadataArgs> partnerMetadata;

    public Optional<Output<InterconnectAttachmentPartnerMetadataArgs>> partnerMetadata() {
        return Optional.ofNullable(this.partnerMetadata);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region as this InterconnectAttachment. The InterconnectAttachment will automatically connect the Interconnect to the network &amp; region within which the Cloud Router is configured.
     * 
     */
    @Import(name="router")
    private @Nullable Output<String> router;

    public Optional<Output<String>> router() {
        return Optional.ofNullable(this.router);
    }

    /**
     * The stack type for this interconnect attachment to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at interconnect attachments creation and update interconnect attachment operations.
     * 
     */
    @Import(name="stackType")
    private @Nullable Output<InterconnectAttachmentStackType> stackType;

    public Optional<Output<InterconnectAttachmentStackType>> stackType() {
        return Optional.ofNullable(this.stackType);
    }

    /**
     * The type of interconnect attachment this is, which can take one of the following values: - DEDICATED: an attachment to a Dedicated Interconnect. - PARTNER: an attachment to a Partner Interconnect, created by the customer. - PARTNER_PROVIDER: an attachment to a Partner Interconnect, created by the partner.
     * 
     */
    @Import(name="type")
    private @Nullable Output<InterconnectAttachmentType> type;

    public Optional<Output<InterconnectAttachmentType>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="validateOnly")
    private @Nullable Output<String> validateOnly;

    public Optional<Output<String>> validateOnly() {
        return Optional.ofNullable(this.validateOnly);
    }

    /**
     * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation time.
     * 
     */
    @Import(name="vlanTag8021q")
    private @Nullable Output<Integer> vlanTag8021q;

    public Optional<Output<Integer>> vlanTag8021q() {
        return Optional.ofNullable(this.vlanTag8021q);
    }

    private InterconnectAttachmentArgs() {}

    private InterconnectAttachmentArgs(InterconnectAttachmentArgs $) {
        this.adminEnabled = $.adminEnabled;
        this.bandwidth = $.bandwidth;
        this.candidateIpv6Subnets = $.candidateIpv6Subnets;
        this.candidateSubnets = $.candidateSubnets;
        this.cloudRouterIpv6InterfaceId = $.cloudRouterIpv6InterfaceId;
        this.customerRouterIpv6InterfaceId = $.customerRouterIpv6InterfaceId;
        this.dataplaneVersion = $.dataplaneVersion;
        this.description = $.description;
        this.edgeAvailabilityDomain = $.edgeAvailabilityDomain;
        this.encryption = $.encryption;
        this.interconnect = $.interconnect;
        this.ipsecInternalAddresses = $.ipsecInternalAddresses;
        this.labels = $.labels;
        this.mtu = $.mtu;
        this.name = $.name;
        this.pairingKey = $.pairingKey;
        this.partnerAsn = $.partnerAsn;
        this.partnerMetadata = $.partnerMetadata;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.router = $.router;
        this.stackType = $.stackType;
        this.type = $.type;
        this.validateOnly = $.validateOnly;
        this.vlanTag8021q = $.vlanTag8021q;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectAttachmentArgs $;

        public Builder() {
            $ = new InterconnectAttachmentArgs();
        }

        public Builder(InterconnectAttachmentArgs defaults) {
            $ = new InterconnectAttachmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder adminEnabled(@Nullable Output<Boolean> adminEnabled) {
            $.adminEnabled = adminEnabled;
            return this;
        }

        public Builder adminEnabled(Boolean adminEnabled) {
            return adminEnabled(Output.of(adminEnabled));
        }

        public Builder bandwidth(@Nullable Output<InterconnectAttachmentBandwidth> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        public Builder bandwidth(InterconnectAttachmentBandwidth bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        public Builder candidateIpv6Subnets(@Nullable Output<List<String>> candidateIpv6Subnets) {
            $.candidateIpv6Subnets = candidateIpv6Subnets;
            return this;
        }

        public Builder candidateIpv6Subnets(List<String> candidateIpv6Subnets) {
            return candidateIpv6Subnets(Output.of(candidateIpv6Subnets));
        }

        public Builder candidateIpv6Subnets(String... candidateIpv6Subnets) {
            return candidateIpv6Subnets(List.of(candidateIpv6Subnets));
        }

        public Builder candidateSubnets(@Nullable Output<List<String>> candidateSubnets) {
            $.candidateSubnets = candidateSubnets;
            return this;
        }

        public Builder candidateSubnets(List<String> candidateSubnets) {
            return candidateSubnets(Output.of(candidateSubnets));
        }

        public Builder candidateSubnets(String... candidateSubnets) {
            return candidateSubnets(List.of(candidateSubnets));
        }

        public Builder cloudRouterIpv6InterfaceId(@Nullable Output<String> cloudRouterIpv6InterfaceId) {
            $.cloudRouterIpv6InterfaceId = cloudRouterIpv6InterfaceId;
            return this;
        }

        public Builder cloudRouterIpv6InterfaceId(String cloudRouterIpv6InterfaceId) {
            return cloudRouterIpv6InterfaceId(Output.of(cloudRouterIpv6InterfaceId));
        }

        public Builder customerRouterIpv6InterfaceId(@Nullable Output<String> customerRouterIpv6InterfaceId) {
            $.customerRouterIpv6InterfaceId = customerRouterIpv6InterfaceId;
            return this;
        }

        public Builder customerRouterIpv6InterfaceId(String customerRouterIpv6InterfaceId) {
            return customerRouterIpv6InterfaceId(Output.of(customerRouterIpv6InterfaceId));
        }

        public Builder dataplaneVersion(@Nullable Output<Integer> dataplaneVersion) {
            $.dataplaneVersion = dataplaneVersion;
            return this;
        }

        public Builder dataplaneVersion(Integer dataplaneVersion) {
            return dataplaneVersion(Output.of(dataplaneVersion));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder edgeAvailabilityDomain(@Nullable Output<InterconnectAttachmentEdgeAvailabilityDomain> edgeAvailabilityDomain) {
            $.edgeAvailabilityDomain = edgeAvailabilityDomain;
            return this;
        }

        public Builder edgeAvailabilityDomain(InterconnectAttachmentEdgeAvailabilityDomain edgeAvailabilityDomain) {
            return edgeAvailabilityDomain(Output.of(edgeAvailabilityDomain));
        }

        public Builder encryption(@Nullable Output<InterconnectAttachmentEncryption> encryption) {
            $.encryption = encryption;
            return this;
        }

        public Builder encryption(InterconnectAttachmentEncryption encryption) {
            return encryption(Output.of(encryption));
        }

        public Builder interconnect(@Nullable Output<String> interconnect) {
            $.interconnect = interconnect;
            return this;
        }

        public Builder interconnect(String interconnect) {
            return interconnect(Output.of(interconnect));
        }

        public Builder ipsecInternalAddresses(@Nullable Output<List<String>> ipsecInternalAddresses) {
            $.ipsecInternalAddresses = ipsecInternalAddresses;
            return this;
        }

        public Builder ipsecInternalAddresses(List<String> ipsecInternalAddresses) {
            return ipsecInternalAddresses(Output.of(ipsecInternalAddresses));
        }

        public Builder ipsecInternalAddresses(String... ipsecInternalAddresses) {
            return ipsecInternalAddresses(List.of(ipsecInternalAddresses));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder pairingKey(@Nullable Output<String> pairingKey) {
            $.pairingKey = pairingKey;
            return this;
        }

        public Builder pairingKey(String pairingKey) {
            return pairingKey(Output.of(pairingKey));
        }

        public Builder partnerAsn(@Nullable Output<String> partnerAsn) {
            $.partnerAsn = partnerAsn;
            return this;
        }

        public Builder partnerAsn(String partnerAsn) {
            return partnerAsn(Output.of(partnerAsn));
        }

        public Builder partnerMetadata(@Nullable Output<InterconnectAttachmentPartnerMetadataArgs> partnerMetadata) {
            $.partnerMetadata = partnerMetadata;
            return this;
        }

        public Builder partnerMetadata(InterconnectAttachmentPartnerMetadataArgs partnerMetadata) {
            return partnerMetadata(Output.of(partnerMetadata));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder router(@Nullable Output<String> router) {
            $.router = router;
            return this;
        }

        public Builder router(String router) {
            return router(Output.of(router));
        }

        public Builder stackType(@Nullable Output<InterconnectAttachmentStackType> stackType) {
            $.stackType = stackType;
            return this;
        }

        public Builder stackType(InterconnectAttachmentStackType stackType) {
            return stackType(Output.of(stackType));
        }

        public Builder type(@Nullable Output<InterconnectAttachmentType> type) {
            $.type = type;
            return this;
        }

        public Builder type(InterconnectAttachmentType type) {
            return type(Output.of(type));
        }

        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            $.validateOnly = validateOnly;
            return this;
        }

        public Builder validateOnly(String validateOnly) {
            return validateOnly(Output.of(validateOnly));
        }

        public Builder vlanTag8021q(@Nullable Output<Integer> vlanTag8021q) {
            $.vlanTag8021q = vlanTag8021q;
            return this;
        }

        public Builder vlanTag8021q(Integer vlanTag8021q) {
            return vlanTag8021q(Output.of(vlanTag8021q));
        }

        public InterconnectAttachmentArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
