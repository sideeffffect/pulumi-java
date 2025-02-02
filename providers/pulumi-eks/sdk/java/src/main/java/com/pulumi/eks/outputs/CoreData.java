// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks.outputs;

import com.pulumi.aws.Provider;
import com.pulumi.aws.ec2.SecurityGroup;
import com.pulumi.aws.eks.Cluster;
import com.pulumi.aws.eks.FargateProfile;
import com.pulumi.aws.eks.outputs.ClusterEncryptionConfig;
import com.pulumi.aws.iam.OpenIdConnectProvider;
import com.pulumi.aws.iam.Role;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.eks.VpcCni;
import com.pulumi.eks.outputs.ClusterNodeGroupOptions;
import com.pulumi.kubernetes.core_v1.ConfigMap;
import com.pulumi.kubernetes.storage.k8s.io_v1.StorageClass;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CoreData {
    private final @Nullable Provider awsProvider;
    private final Cluster cluster;
    private final SecurityGroup clusterSecurityGroup;
    private final @Nullable ConfigMap eksNodeAccess;
    private final @Nullable ClusterEncryptionConfig encryptionConfig;
    private final String endpoint;
    private final @Nullable FargateProfile fargateProfile;
    private final List<Role> instanceRoles;
    private final @Nullable Object kubeconfig;
    private final ClusterNodeGroupOptions nodeGroupOptions;
    private final @Nullable Map<String,String> nodeSecurityGroupTags;
    private final @Nullable OpenIdConnectProvider oidcProvider;
    private final @Nullable List<String> privateSubnetIds;
    private final com.pulumi.kubernetes.Provider provider;
    private final @Nullable List<String> publicSubnetIds;
    private final @Nullable Map<String,StorageClass> storageClasses;
    private final List<String> subnetIds;
    private final @Nullable Map<String,String> tags;
    private final @Nullable VpcCni vpcCni;
    private final String vpcId;

    @CustomType.Constructor
    private CoreData(
        @CustomType.Parameter("awsProvider") @Nullable Provider awsProvider,
        @CustomType.Parameter("cluster") Cluster cluster,
        @CustomType.Parameter("clusterSecurityGroup") SecurityGroup clusterSecurityGroup,
        @CustomType.Parameter("eksNodeAccess") @Nullable ConfigMap eksNodeAccess,
        @CustomType.Parameter("encryptionConfig") @Nullable ClusterEncryptionConfig encryptionConfig,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("fargateProfile") @Nullable FargateProfile fargateProfile,
        @CustomType.Parameter("instanceRoles") List<Role> instanceRoles,
        @CustomType.Parameter("kubeconfig") @Nullable Object kubeconfig,
        @CustomType.Parameter("nodeGroupOptions") ClusterNodeGroupOptions nodeGroupOptions,
        @CustomType.Parameter("nodeSecurityGroupTags") @Nullable Map<String,String> nodeSecurityGroupTags,
        @CustomType.Parameter("oidcProvider") @Nullable OpenIdConnectProvider oidcProvider,
        @CustomType.Parameter("privateSubnetIds") @Nullable List<String> privateSubnetIds,
        @CustomType.Parameter("provider") com.pulumi.kubernetes.Provider provider,
        @CustomType.Parameter("publicSubnetIds") @Nullable List<String> publicSubnetIds,
        @CustomType.Parameter("storageClasses") @Nullable Map<String,StorageClass> storageClasses,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("vpcCni") @Nullable VpcCni vpcCni,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.awsProvider = awsProvider;
        this.cluster = cluster;
        this.clusterSecurityGroup = clusterSecurityGroup;
        this.eksNodeAccess = eksNodeAccess;
        this.encryptionConfig = encryptionConfig;
        this.endpoint = endpoint;
        this.fargateProfile = fargateProfile;
        this.instanceRoles = instanceRoles;
        this.kubeconfig = kubeconfig;
        this.nodeGroupOptions = nodeGroupOptions;
        this.nodeSecurityGroupTags = nodeSecurityGroupTags;
        this.oidcProvider = oidcProvider;
        this.privateSubnetIds = privateSubnetIds;
        this.provider = provider;
        this.publicSubnetIds = publicSubnetIds;
        this.storageClasses = storageClasses;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.vpcCni = vpcCni;
        this.vpcId = vpcId;
    }

    public Optional<Provider> awsProvider() {
        return Optional.ofNullable(this.awsProvider);
    }
    public Cluster cluster() {
        return this.cluster;
    }
    public SecurityGroup clusterSecurityGroup() {
        return this.clusterSecurityGroup;
    }
    public Optional<ConfigMap> eksNodeAccess() {
        return Optional.ofNullable(this.eksNodeAccess);
    }
    public Optional<ClusterEncryptionConfig> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }
    public String endpoint() {
        return this.endpoint;
    }
    public Optional<FargateProfile> fargateProfile() {
        return Optional.ofNullable(this.fargateProfile);
    }
    public List<Role> instanceRoles() {
        return this.instanceRoles;
    }
    public Optional<Object> kubeconfig() {
        return Optional.ofNullable(this.kubeconfig);
    }
    public ClusterNodeGroupOptions nodeGroupOptions() {
        return this.nodeGroupOptions;
    }
    public Map<String,String> nodeSecurityGroupTags() {
        return this.nodeSecurityGroupTags == null ? Map.of() : this.nodeSecurityGroupTags;
    }
    public Optional<OpenIdConnectProvider> oidcProvider() {
        return Optional.ofNullable(this.oidcProvider);
    }
    public List<String> privateSubnetIds() {
        return this.privateSubnetIds == null ? List.of() : this.privateSubnetIds;
    }
    public com.pulumi.kubernetes.Provider provider() {
        return this.provider;
    }
    public List<String> publicSubnetIds() {
        return this.publicSubnetIds == null ? List.of() : this.publicSubnetIds;
    }
    public Map<String,StorageClass> storageClasses() {
        return this.storageClasses == null ? Map.of() : this.storageClasses;
    }
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<VpcCni> vpcCni() {
        return Optional.ofNullable(this.vpcCni);
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CoreData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Provider awsProvider;
        private Cluster cluster;
        private SecurityGroup clusterSecurityGroup;
        private @Nullable ConfigMap eksNodeAccess;
        private @Nullable ClusterEncryptionConfig encryptionConfig;
        private String endpoint;
        private @Nullable FargateProfile fargateProfile;
        private List<Role> instanceRoles;
        private @Nullable Object kubeconfig;
        private ClusterNodeGroupOptions nodeGroupOptions;
        private @Nullable Map<String,String> nodeSecurityGroupTags;
        private @Nullable OpenIdConnectProvider oidcProvider;
        private @Nullable List<String> privateSubnetIds;
        private com.pulumi.kubernetes.Provider provider;
        private @Nullable List<String> publicSubnetIds;
        private @Nullable Map<String,StorageClass> storageClasses;
        private List<String> subnetIds;
        private @Nullable Map<String,String> tags;
        private @Nullable VpcCni vpcCni;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(CoreData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsProvider = defaults.awsProvider;
    	      this.cluster = defaults.cluster;
    	      this.clusterSecurityGroup = defaults.clusterSecurityGroup;
    	      this.eksNodeAccess = defaults.eksNodeAccess;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpoint = defaults.endpoint;
    	      this.fargateProfile = defaults.fargateProfile;
    	      this.instanceRoles = defaults.instanceRoles;
    	      this.kubeconfig = defaults.kubeconfig;
    	      this.nodeGroupOptions = defaults.nodeGroupOptions;
    	      this.nodeSecurityGroupTags = defaults.nodeSecurityGroupTags;
    	      this.oidcProvider = defaults.oidcProvider;
    	      this.privateSubnetIds = defaults.privateSubnetIds;
    	      this.provider = defaults.provider;
    	      this.publicSubnetIds = defaults.publicSubnetIds;
    	      this.storageClasses = defaults.storageClasses;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.vpcCni = defaults.vpcCni;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder awsProvider(@Nullable Provider awsProvider) {
            this.awsProvider = awsProvider;
            return this;
        }
        public Builder cluster(Cluster cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder clusterSecurityGroup(SecurityGroup clusterSecurityGroup) {
            this.clusterSecurityGroup = Objects.requireNonNull(clusterSecurityGroup);
            return this;
        }
        public Builder eksNodeAccess(@Nullable ConfigMap eksNodeAccess) {
            this.eksNodeAccess = eksNodeAccess;
            return this;
        }
        public Builder encryptionConfig(@Nullable ClusterEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder fargateProfile(@Nullable FargateProfile fargateProfile) {
            this.fargateProfile = fargateProfile;
            return this;
        }
        public Builder instanceRoles(List<Role> instanceRoles) {
            this.instanceRoles = Objects.requireNonNull(instanceRoles);
            return this;
        }
        public Builder instanceRoles(Role... instanceRoles) {
            return instanceRoles(List.of(instanceRoles));
        }
        public Builder kubeconfig(@Nullable Object kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }
        public Builder nodeGroupOptions(ClusterNodeGroupOptions nodeGroupOptions) {
            this.nodeGroupOptions = Objects.requireNonNull(nodeGroupOptions);
            return this;
        }
        public Builder nodeSecurityGroupTags(@Nullable Map<String,String> nodeSecurityGroupTags) {
            this.nodeSecurityGroupTags = nodeSecurityGroupTags;
            return this;
        }
        public Builder oidcProvider(@Nullable OpenIdConnectProvider oidcProvider) {
            this.oidcProvider = oidcProvider;
            return this;
        }
        public Builder privateSubnetIds(@Nullable List<String> privateSubnetIds) {
            this.privateSubnetIds = privateSubnetIds;
            return this;
        }
        public Builder privateSubnetIds(String... privateSubnetIds) {
            return privateSubnetIds(List.of(privateSubnetIds));
        }
        public Builder provider(com.pulumi.kubernetes.Provider provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder publicSubnetIds(@Nullable List<String> publicSubnetIds) {
            this.publicSubnetIds = publicSubnetIds;
            return this;
        }
        public Builder publicSubnetIds(String... publicSubnetIds) {
            return publicSubnetIds(List.of(publicSubnetIds));
        }
        public Builder storageClasses(@Nullable Map<String,StorageClass> storageClasses) {
            this.storageClasses = storageClasses;
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder vpcCni(@Nullable VpcCni vpcCni) {
            this.vpcCni = vpcCni;
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public CoreData build() {
            return new CoreData(awsProvider, cluster, clusterSecurityGroup, eksNodeAccess, encryptionConfig, endpoint, fargateProfile, instanceRoles, kubeconfig, nodeGroupOptions, nodeSecurityGroupTags, oidcProvider, privateSubnetIds, provider, publicSubnetIds, storageClasses, subnetIds, tags, vpcCni, vpcId);
        }
    }
}
