// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.AwsNodePoolConfigConfigEncryptionArgs;
import com.pulumi.gcp.container.inputs.AwsNodePoolConfigRootVolumeArgs;
import com.pulumi.gcp.container.inputs.AwsNodePoolConfigSshConfigArgs;
import com.pulumi.gcp.container.inputs.AwsNodePoolConfigTaintArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsNodePoolConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigArgs Empty = new AwsNodePoolConfigArgs();

    /**
     * Required. The ARN of the AWS KMS key used to encrypt node pool configuration.
     * 
     */
    @Import(name="configEncryption", required=true)
    private Output<AwsNodePoolConfigConfigEncryptionArgs> configEncryption;

    public Output<AwsNodePoolConfigConfigEncryptionArgs> configEncryption() {
        return this.configEncryption;
    }

    /**
     * Required. The name of the AWS IAM role assigned to nodes in the pool.
     * 
     */
    @Import(name="iamInstanceProfile", required=true)
    private Output<String> iamInstanceProfile;

    public Output<String> iamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Optional. The initial labels assigned to nodes of this node pool. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Optional. Template for the root volume provisioned for node pool nodes. Volumes will be provisioned in the availability zone assigned to the node pool subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    @Import(name="rootVolume")
    private @Nullable Output<AwsNodePoolConfigRootVolumeArgs> rootVolume;

    public Optional<Output<AwsNodePoolConfigRootVolumeArgs>> rootVolume() {
        return Optional.ofNullable(this.rootVolume);
    }

    /**
     * Optional. The IDs of additional security groups to add to nodes in this pool. The manager will automatically create security groups with minimum rules needed for a functioning cluster.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * Optional. The SSH configuration.
     * 
     */
    @Import(name="sshConfig")
    private @Nullable Output<AwsNodePoolConfigSshConfigArgs> sshConfig;

    public Optional<Output<AwsNodePoolConfigSshConfigArgs>> sshConfig() {
        return Optional.ofNullable(this.sshConfig);
    }

    /**
     * Optional. Key/value metadata to assign to each underlying AWS resource. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Optional. The initial taints assigned to nodes of this node pool.
     * 
     */
    @Import(name="taints")
    private @Nullable Output<List<AwsNodePoolConfigTaintArgs>> taints;

    public Optional<Output<List<AwsNodePoolConfigTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    private AwsNodePoolConfigArgs() {}

    private AwsNodePoolConfigArgs(AwsNodePoolConfigArgs $) {
        this.configEncryption = $.configEncryption;
        this.iamInstanceProfile = $.iamInstanceProfile;
        this.instanceType = $.instanceType;
        this.labels = $.labels;
        this.rootVolume = $.rootVolume;
        this.securityGroupIds = $.securityGroupIds;
        this.sshConfig = $.sshConfig;
        this.tags = $.tags;
        this.taints = $.taints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsNodePoolConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsNodePoolConfigArgs $;

        public Builder() {
            $ = new AwsNodePoolConfigArgs();
        }

        public Builder(AwsNodePoolConfigArgs defaults) {
            $ = new AwsNodePoolConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder configEncryption(Output<AwsNodePoolConfigConfigEncryptionArgs> configEncryption) {
            $.configEncryption = configEncryption;
            return this;
        }

        public Builder configEncryption(AwsNodePoolConfigConfigEncryptionArgs configEncryption) {
            return configEncryption(Output.of(configEncryption));
        }

        public Builder iamInstanceProfile(Output<String> iamInstanceProfile) {
            $.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        public Builder iamInstanceProfile(String iamInstanceProfile) {
            return iamInstanceProfile(Output.of(iamInstanceProfile));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder rootVolume(@Nullable Output<AwsNodePoolConfigRootVolumeArgs> rootVolume) {
            $.rootVolume = rootVolume;
            return this;
        }

        public Builder rootVolume(AwsNodePoolConfigRootVolumeArgs rootVolume) {
            return rootVolume(Output.of(rootVolume));
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        public Builder sshConfig(@Nullable Output<AwsNodePoolConfigSshConfigArgs> sshConfig) {
            $.sshConfig = sshConfig;
            return this;
        }

        public Builder sshConfig(AwsNodePoolConfigSshConfigArgs sshConfig) {
            return sshConfig(Output.of(sshConfig));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder taints(@Nullable Output<List<AwsNodePoolConfigTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        public Builder taints(List<AwsNodePoolConfigTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        public Builder taints(AwsNodePoolConfigTaintArgs... taints) {
            return taints(List.of(taints));
        }

        public AwsNodePoolConfigArgs build() {
            $.configEncryption = Objects.requireNonNull($.configEncryption, "expected parameter 'configEncryption' to be non-null");
            $.iamInstanceProfile = Objects.requireNonNull($.iamInstanceProfile, "expected parameter 'iamInstanceProfile' to be non-null");
            return $;
        }
    }

}
