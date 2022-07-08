// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.NodeGroupAffinityResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.ReservationAffinityResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.ShieldedInstanceConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GceClusterConfigResponse {
    /**
     * @return Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    private final Boolean internalIpOnly;
    /**
     * @return The Compute Engine metadata entries to add to all instances (see Project and instance metadata (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    private final Map<String,String> metadata;
    /**
     * @return Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the &#34;default&#34; network of the project is used, if it exists. Cannot be a &#34;Custom Subnet Network&#34; (see Using Subnetworks (https://cloud.google.com/compute/docs/subnetworks) for more information).A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default projects/[project_id]/regions/global/default default
     * 
     */
    private final String networkUri;
    /**
     * @return Optional. Node Group Affinity for sole-tenant clusters.
     * 
     */
    private final NodeGroupAffinityResponse nodeGroupAffinity;
    /**
     * @return Optional. The type of IPv6 access for a cluster.
     * 
     */
    private final String privateIpv6GoogleAccess;
    /**
     * @return Optional. Reservation Affinity for consuming Zonal reservation.
     * 
     */
    private final ReservationAffinityResponse reservationAffinity;
    /**
     * @return Optional. The Dataproc service account (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/service-accounts#service_accounts_in_dataproc) (also see VM Data Plane identity (https://cloud.google.com/dataproc/docs/concepts/iam/dataproc-principals#vm_service_account_data_plane_identity)) used by Dataproc cluster VM instances to access Google Cloud Platform services.If not specified, the Compute Engine default service account (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: https://www.googleapis.com/auth/cloud.useraccounts.readonly https://www.googleapis.com/auth/devstorage.read_write https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults are also provided: https://www.googleapis.com/auth/bigquery https://www.googleapis.com/auth/bigtable.admin.table https://www.googleapis.com/auth/bigtable.data https://www.googleapis.com/auth/devstorage.full_control
     * 
     */
    private final List<String> serviceAccountScopes;
    /**
     * @return Optional. Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
     */
    private final ShieldedInstanceConfigResponse shieldedInstanceConfig;
    /**
     * @return Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0 projects/[project_id]/regions/us-east1/subnetworks/sub0 sub0
     * 
     */
    private final String subnetworkUri;
    /**
     * @return The Compute Engine tags to add to all instances (see Tagging instances (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    private final List<String> tags;
    /**
     * @return Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the &#34;global&#34; region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone] projects/[project_id]/zones/[zone] us-central1-f
     * 
     */
    private final String zoneUri;

    @CustomType.Constructor
    private GceClusterConfigResponse(
        @CustomType.Parameter("internalIpOnly") Boolean internalIpOnly,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("nodeGroupAffinity") NodeGroupAffinityResponse nodeGroupAffinity,
        @CustomType.Parameter("privateIpv6GoogleAccess") String privateIpv6GoogleAccess,
        @CustomType.Parameter("reservationAffinity") ReservationAffinityResponse reservationAffinity,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("serviceAccountScopes") List<String> serviceAccountScopes,
        @CustomType.Parameter("shieldedInstanceConfig") ShieldedInstanceConfigResponse shieldedInstanceConfig,
        @CustomType.Parameter("subnetworkUri") String subnetworkUri,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("zoneUri") String zoneUri) {
        this.internalIpOnly = internalIpOnly;
        this.metadata = metadata;
        this.networkUri = networkUri;
        this.nodeGroupAffinity = nodeGroupAffinity;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnetworkUri = subnetworkUri;
        this.tags = tags;
        this.zoneUri = zoneUri;
    }

    /**
     * @return Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    public Boolean internalIpOnly() {
        return this.internalIpOnly;
    }
    /**
     * @return The Compute Engine metadata entries to add to all instances (see Project and instance metadata (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the &#34;default&#34; network of the project is used, if it exists. Cannot be a &#34;Custom Subnet Network&#34; (see Using Subnetworks (https://cloud.google.com/compute/docs/subnetworks) for more information).A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default projects/[project_id]/regions/global/default default
     * 
     */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * @return Optional. Node Group Affinity for sole-tenant clusters.
     * 
     */
    public NodeGroupAffinityResponse nodeGroupAffinity() {
        return this.nodeGroupAffinity;
    }
    /**
     * @return Optional. The type of IPv6 access for a cluster.
     * 
     */
    public String privateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * @return Optional. Reservation Affinity for consuming Zonal reservation.
     * 
     */
    public ReservationAffinityResponse reservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * @return Optional. The Dataproc service account (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/service-accounts#service_accounts_in_dataproc) (also see VM Data Plane identity (https://cloud.google.com/dataproc/docs/concepts/iam/dataproc-principals#vm_service_account_data_plane_identity)) used by Dataproc cluster VM instances to access Google Cloud Platform services.If not specified, the Compute Engine default service account (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: https://www.googleapis.com/auth/cloud.useraccounts.readonly https://www.googleapis.com/auth/devstorage.read_write https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults are also provided: https://www.googleapis.com/auth/bigquery https://www.googleapis.com/auth/bigtable.admin.table https://www.googleapis.com/auth/bigtable.data https://www.googleapis.com/auth/devstorage.full_control
     * 
     */
    public List<String> serviceAccountScopes() {
        return this.serviceAccountScopes;
    }
    /**
     * @return Optional. Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
     */
    public ShieldedInstanceConfigResponse shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * @return Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0 projects/[project_id]/regions/us-east1/subnetworks/sub0 sub0
     * 
     */
    public String subnetworkUri() {
        return this.subnetworkUri;
    }
    /**
     * @return The Compute Engine tags to add to all instances (see Tagging instances (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the &#34;global&#34; region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone] projects/[project_id]/zones/[zone] us-central1-f
     * 
     */
    public String zoneUri() {
        return this.zoneUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GceClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean internalIpOnly;
        private Map<String,String> metadata;
        private String networkUri;
        private NodeGroupAffinityResponse nodeGroupAffinity;
        private String privateIpv6GoogleAccess;
        private ReservationAffinityResponse reservationAffinity;
        private String serviceAccount;
        private List<String> serviceAccountScopes;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private String subnetworkUri;
        private List<String> tags;
        private String zoneUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GceClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.metadata = defaults.metadata;
    	      this.networkUri = defaults.networkUri;
    	      this.nodeGroupAffinity = defaults.nodeGroupAffinity;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnetworkUri = defaults.subnetworkUri;
    	      this.tags = defaults.tags;
    	      this.zoneUri = defaults.zoneUri;
        }

        public Builder internalIpOnly(Boolean internalIpOnly) {
            this.internalIpOnly = Objects.requireNonNull(internalIpOnly);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder nodeGroupAffinity(NodeGroupAffinityResponse nodeGroupAffinity) {
            this.nodeGroupAffinity = Objects.requireNonNull(nodeGroupAffinity);
            return this;
        }
        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }
        public Builder reservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder serviceAccountScopes(List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Objects.requireNonNull(serviceAccountScopes);
            return this;
        }
        public Builder serviceAccountScopes(String... serviceAccountScopes) {
            return serviceAccountScopes(List.of(serviceAccountScopes));
        }
        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }
        public Builder subnetworkUri(String subnetworkUri) {
            this.subnetworkUri = Objects.requireNonNull(subnetworkUri);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder zoneUri(String zoneUri) {
            this.zoneUri = Objects.requireNonNull(zoneUri);
            return this;
        }        public GceClusterConfigResponse build() {
            return new GceClusterConfigResponse(internalIpOnly, metadata, networkUri, nodeGroupAffinity, privateIpv6GoogleAccess, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnetworkUri, tags, zoneUri);
        }
    }
}
