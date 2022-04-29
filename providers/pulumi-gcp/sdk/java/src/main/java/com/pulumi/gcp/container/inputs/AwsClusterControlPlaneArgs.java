// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneAwsServicesAuthenticationArgs;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneConfigEncryptionArgs;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneDatabaseEncryptionArgs;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneMainVolumeArgs;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneProxyConfigArgs;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneRootVolumeArgs;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneSshConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsClusterControlPlaneArgs extends ResourceArgs {

    public static final AwsClusterControlPlaneArgs Empty = new AwsClusterControlPlaneArgs();

    /**
     * Required. Authentication configuration for management of AWS resources.
     * 
     */
    @Import(name="awsServicesAuthentication", required=true)
    private Output<AwsClusterControlPlaneAwsServicesAuthenticationArgs> awsServicesAuthentication;

    /**
     * @return Required. Authentication configuration for management of AWS resources.
     * 
     */
    public Output<AwsClusterControlPlaneAwsServicesAuthenticationArgs> awsServicesAuthentication() {
        return this.awsServicesAuthentication;
    }

    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    @Import(name="configEncryption", required=true)
    private Output<AwsClusterControlPlaneConfigEncryptionArgs> configEncryption;

    /**
     * @return Required. The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    public Output<AwsClusterControlPlaneConfigEncryptionArgs> configEncryption() {
        return this.configEncryption;
    }

    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    @Import(name="databaseEncryption", required=true)
    private Output<AwsClusterControlPlaneDatabaseEncryptionArgs> databaseEncryption;

    /**
     * @return Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    public Output<AwsClusterControlPlaneDatabaseEncryptionArgs> databaseEncryption() {
        return this.databaseEncryption;
    }

    /**
     * Required. The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
     */
    @Import(name="iamInstanceProfile", required=true)
    private Output<String> iamInstanceProfile;

    /**
     * @return Required. The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
     */
    public Output<String> iamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    @Import(name="mainVolume")
    private @Nullable Output<AwsClusterControlPlaneMainVolumeArgs> mainVolume;

    /**
     * @return Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    public Optional<Output<AwsClusterControlPlaneMainVolumeArgs>> mainVolume() {
        return Optional.ofNullable(this.mainVolume);
    }

    /**
     * Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    @Import(name="proxyConfig")
    private @Nullable Output<AwsClusterControlPlaneProxyConfigArgs> proxyConfig;

    /**
     * @return Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    public Optional<Output<AwsClusterControlPlaneProxyConfigArgs>> proxyConfig() {
        return Optional.ofNullable(this.proxyConfig);
    }

    /**
     * Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    @Import(name="rootVolume")
    private @Nullable Output<AwsClusterControlPlaneRootVolumeArgs> rootVolume;

    /**
     * @return Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    public Optional<Output<AwsClusterControlPlaneRootVolumeArgs>> rootVolume() {
        return Optional.ofNullable(this.rootVolume);
    }

    /**
     * Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    @Import(name="sshConfig")
    private @Nullable Output<AwsClusterControlPlaneSshConfigArgs> sshConfig;

    /**
     * @return Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    public Optional<Output<AwsClusterControlPlaneSshConfigArgs>> sshConfig() {
        return Optional.ofNullable(this.sshConfig);
    }

    /**
     * Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private AwsClusterControlPlaneArgs() {}

    private AwsClusterControlPlaneArgs(AwsClusterControlPlaneArgs $) {
        this.awsServicesAuthentication = $.awsServicesAuthentication;
        this.configEncryption = $.configEncryption;
        this.databaseEncryption = $.databaseEncryption;
        this.iamInstanceProfile = $.iamInstanceProfile;
        this.instanceType = $.instanceType;
        this.mainVolume = $.mainVolume;
        this.proxyConfig = $.proxyConfig;
        this.rootVolume = $.rootVolume;
        this.securityGroupIds = $.securityGroupIds;
        this.sshConfig = $.sshConfig;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsClusterControlPlaneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsClusterControlPlaneArgs $;

        public Builder() {
            $ = new AwsClusterControlPlaneArgs();
        }

        public Builder(AwsClusterControlPlaneArgs defaults) {
            $ = new AwsClusterControlPlaneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsServicesAuthentication Required. Authentication configuration for management of AWS resources.
         * 
         * @return builder
         * 
         */
        public Builder awsServicesAuthentication(Output<AwsClusterControlPlaneAwsServicesAuthenticationArgs> awsServicesAuthentication) {
            $.awsServicesAuthentication = awsServicesAuthentication;
            return this;
        }

        /**
         * @param awsServicesAuthentication Required. Authentication configuration for management of AWS resources.
         * 
         * @return builder
         * 
         */
        public Builder awsServicesAuthentication(AwsClusterControlPlaneAwsServicesAuthenticationArgs awsServicesAuthentication) {
            return awsServicesAuthentication(Output.of(awsServicesAuthentication));
        }

        /**
         * @param configEncryption Required. The ARN of the AWS KMS key used to encrypt cluster configuration.
         * 
         * @return builder
         * 
         */
        public Builder configEncryption(Output<AwsClusterControlPlaneConfigEncryptionArgs> configEncryption) {
            $.configEncryption = configEncryption;
            return this;
        }

        /**
         * @param configEncryption Required. The ARN of the AWS KMS key used to encrypt cluster configuration.
         * 
         * @return builder
         * 
         */
        public Builder configEncryption(AwsClusterControlPlaneConfigEncryptionArgs configEncryption) {
            return configEncryption(Output.of(configEncryption));
        }

        /**
         * @param databaseEncryption Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
         * 
         * @return builder
         * 
         */
        public Builder databaseEncryption(Output<AwsClusterControlPlaneDatabaseEncryptionArgs> databaseEncryption) {
            $.databaseEncryption = databaseEncryption;
            return this;
        }

        /**
         * @param databaseEncryption Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
         * 
         * @return builder
         * 
         */
        public Builder databaseEncryption(AwsClusterControlPlaneDatabaseEncryptionArgs databaseEncryption) {
            return databaseEncryption(Output.of(databaseEncryption));
        }

        /**
         * @param iamInstanceProfile Required. The name of the AWS IAM instance pofile to assign to each control plane replica.
         * 
         * @return builder
         * 
         */
        public Builder iamInstanceProfile(Output<String> iamInstanceProfile) {
            $.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        /**
         * @param iamInstanceProfile Required. The name of the AWS IAM instance pofile to assign to each control plane replica.
         * 
         * @return builder
         * 
         */
        public Builder iamInstanceProfile(String iamInstanceProfile) {
            return iamInstanceProfile(Output.of(iamInstanceProfile));
        }

        /**
         * @param instanceType Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param mainVolume Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
         * 
         * @return builder
         * 
         */
        public Builder mainVolume(@Nullable Output<AwsClusterControlPlaneMainVolumeArgs> mainVolume) {
            $.mainVolume = mainVolume;
            return this;
        }

        /**
         * @param mainVolume Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
         * 
         * @return builder
         * 
         */
        public Builder mainVolume(AwsClusterControlPlaneMainVolumeArgs mainVolume) {
            return mainVolume(Output.of(mainVolume));
        }

        /**
         * @param proxyConfig Proxy configuration for outbound HTTP(S) traffic.
         * 
         * @return builder
         * 
         */
        public Builder proxyConfig(@Nullable Output<AwsClusterControlPlaneProxyConfigArgs> proxyConfig) {
            $.proxyConfig = proxyConfig;
            return this;
        }

        /**
         * @param proxyConfig Proxy configuration for outbound HTTP(S) traffic.
         * 
         * @return builder
         * 
         */
        public Builder proxyConfig(AwsClusterControlPlaneProxyConfigArgs proxyConfig) {
            return proxyConfig(Output.of(proxyConfig));
        }

        /**
         * @param rootVolume Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
         * 
         * @return builder
         * 
         */
        public Builder rootVolume(@Nullable Output<AwsClusterControlPlaneRootVolumeArgs> rootVolume) {
            $.rootVolume = rootVolume;
            return this;
        }

        /**
         * @param rootVolume Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
         * 
         * @return builder
         * 
         */
        public Builder rootVolume(AwsClusterControlPlaneRootVolumeArgs rootVolume) {
            return rootVolume(Output.of(rootVolume));
        }

        /**
         * @param securityGroupIds Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param sshConfig Optional. SSH configuration for how to access the underlying control plane machines.
         * 
         * @return builder
         * 
         */
        public Builder sshConfig(@Nullable Output<AwsClusterControlPlaneSshConfigArgs> sshConfig) {
            $.sshConfig = sshConfig;
            return this;
        }

        /**
         * @param sshConfig Optional. SSH configuration for how to access the underlying control plane machines.
         * 
         * @return builder
         * 
         */
        public Builder sshConfig(AwsClusterControlPlaneSshConfigArgs sshConfig) {
            return sshConfig(Output.of(sshConfig));
        }

        /**
         * @param subnetIds Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param version Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public AwsClusterControlPlaneArgs build() {
            $.awsServicesAuthentication = Objects.requireNonNull($.awsServicesAuthentication, "expected parameter 'awsServicesAuthentication' to be non-null");
            $.configEncryption = Objects.requireNonNull($.configEncryption, "expected parameter 'configEncryption' to be non-null");
            $.databaseEncryption = Objects.requireNonNull($.databaseEncryption, "expected parameter 'databaseEncryption' to be non-null");
            $.iamInstanceProfile = Objects.requireNonNull($.iamInstanceProfile, "expected parameter 'iamInstanceProfile' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
