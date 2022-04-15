// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2.inputs;

import io.pulumi.aws.cloudhsmv2.inputs.ClusterClusterCertificateGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * The list of cluster certificates.
     * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
     * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
     * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
     * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
     * 
     */
    @Import(name="clusterCertificates")
      private final @Nullable Output<List<ClusterClusterCertificateGetArgs>> clusterCertificates;

    public Output<List<ClusterClusterCertificateGetArgs>> clusterCertificates() {
        return this.clusterCertificates == null ? Codegen.empty() : this.clusterCertificates;
    }

    /**
     * The id of the CloudHSM cluster.
     * 
     */
    @Import(name="clusterId")
      private final @Nullable Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId == null ? Codegen.empty() : this.clusterId;
    }

    /**
     * The state of the CloudHSM cluster.
     * 
     */
    @Import(name="clusterState")
      private final @Nullable Output<String> clusterState;

    public Output<String> clusterState() {
        return this.clusterState == null ? Codegen.empty() : this.clusterState;
    }

    /**
     * The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
     * 
     */
    @Import(name="hsmType")
      private final @Nullable Output<String> hsmType;

    public Output<String> hsmType() {
        return this.hsmType == null ? Codegen.empty() : this.hsmType;
    }

    /**
     * The ID of the security group associated with the CloudHSM cluster.
     * 
     */
    @Import(name="securityGroupId")
      private final @Nullable Output<String> securityGroupId;

    public Output<String> securityGroupId() {
        return this.securityGroupId == null ? Codegen.empty() : this.securityGroupId;
    }

    /**
     * The id of Cloud HSM v2 cluster backup to be restored.
     * 
     */
    @Import(name="sourceBackupIdentifier")
      private final @Nullable Output<String> sourceBackupIdentifier;

    public Output<String> sourceBackupIdentifier() {
        return this.sourceBackupIdentifier == null ? Codegen.empty() : this.sourceBackupIdentifier;
    }

    /**
     * The IDs of subnets in which cluster will operate.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The id of the VPC that the CloudHSM cluster resides in.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public ClusterState(
        @Nullable Output<List<ClusterClusterCertificateGetArgs>> clusterCertificates,
        @Nullable Output<String> clusterId,
        @Nullable Output<String> clusterState,
        @Nullable Output<String> hsmType,
        @Nullable Output<String> securityGroupId,
        @Nullable Output<String> sourceBackupIdentifier,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpcId) {
        this.clusterCertificates = clusterCertificates;
        this.clusterId = clusterId;
        this.clusterState = clusterState;
        this.hsmType = hsmType;
        this.securityGroupId = securityGroupId;
        this.sourceBackupIdentifier = sourceBackupIdentifier;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcId = vpcId;
    }

    private ClusterState() {
        this.clusterCertificates = Codegen.empty();
        this.clusterId = Codegen.empty();
        this.clusterState = Codegen.empty();
        this.hsmType = Codegen.empty();
        this.securityGroupId = Codegen.empty();
        this.sourceBackupIdentifier = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ClusterClusterCertificateGetArgs>> clusterCertificates;
        private @Nullable Output<String> clusterId;
        private @Nullable Output<String> clusterState;
        private @Nullable Output<String> hsmType;
        private @Nullable Output<String> securityGroupId;
        private @Nullable Output<String> sourceBackupIdentifier;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterCertificates = defaults.clusterCertificates;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
    	      this.hsmType = defaults.hsmType;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.sourceBackupIdentifier = defaults.sourceBackupIdentifier;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder clusterCertificates(@Nullable Output<List<ClusterClusterCertificateGetArgs>> clusterCertificates) {
            this.clusterCertificates = clusterCertificates;
            return this;
        }
        public Builder clusterCertificates(@Nullable List<ClusterClusterCertificateGetArgs> clusterCertificates) {
            this.clusterCertificates = Codegen.ofNullable(clusterCertificates);
            return this;
        }
        public Builder clusterCertificates(ClusterClusterCertificateGetArgs... clusterCertificates) {
            return clusterCertificates(List.of(clusterCertificates));
        }
        public Builder clusterId(@Nullable Output<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = Codegen.ofNullable(clusterId);
            return this;
        }
        public Builder clusterState(@Nullable Output<String> clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public Builder clusterState(@Nullable String clusterState) {
            this.clusterState = Codegen.ofNullable(clusterState);
            return this;
        }
        public Builder hsmType(@Nullable Output<String> hsmType) {
            this.hsmType = hsmType;
            return this;
        }
        public Builder hsmType(@Nullable String hsmType) {
            this.hsmType = Codegen.ofNullable(hsmType);
            return this;
        }
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public Builder securityGroupId(@Nullable String securityGroupId) {
            this.securityGroupId = Codegen.ofNullable(securityGroupId);
            return this;
        }
        public Builder sourceBackupIdentifier(@Nullable Output<String> sourceBackupIdentifier) {
            this.sourceBackupIdentifier = sourceBackupIdentifier;
            return this;
        }
        public Builder sourceBackupIdentifier(@Nullable String sourceBackupIdentifier) {
            this.sourceBackupIdentifier = Codegen.ofNullable(sourceBackupIdentifier);
            return this;
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public ClusterState build() {
            return new ClusterState(clusterCertificates, clusterId, clusterState, hsmType, securityGroupId, sourceBackupIdentifier, subnetIds, tags, tagsAll, vpcId);
        }
    }
}
