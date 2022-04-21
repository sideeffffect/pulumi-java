// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks;

import com.pulumi.awsnative.eks.inputs.ClusterEncryptionConfigArgs;
import com.pulumi.awsnative.eks.inputs.ClusterKubernetesNetworkConfigArgs;
import com.pulumi.awsnative.eks.inputs.ClusterLoggingArgs;
import com.pulumi.awsnative.eks.inputs.ClusterResourcesVpcConfigArgs;
import com.pulumi.awsnative.eks.inputs.ClusterTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    @Import(name="encryptionConfig")
    private @Nullable Output<List<ClusterEncryptionConfigArgs>> encryptionConfig;

    public Optional<Output<List<ClusterEncryptionConfigArgs>>> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }

    @Import(name="kubernetesNetworkConfig")
    private @Nullable Output<ClusterKubernetesNetworkConfigArgs> kubernetesNetworkConfig;

    public Optional<Output<ClusterKubernetesNetworkConfigArgs>> kubernetesNetworkConfig() {
        return Optional.ofNullable(this.kubernetesNetworkConfig);
    }

    @Import(name="logging")
    private @Nullable Output<ClusterLoggingArgs> logging;

    public Optional<Output<ClusterLoggingArgs>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * The unique name to give to your cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="resourcesVpcConfig", required=true)
    private Output<ClusterResourcesVpcConfigArgs> resourcesVpcConfig;

    public Output<ClusterResourcesVpcConfigArgs> resourcesVpcConfig() {
        return this.resourcesVpcConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ClusterTagArgs>> tags;

    public Optional<Output<List<ClusterTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The desired Kubernetes version for your cluster. If you don&#39;t specify a value here, the latest version available in Amazon EKS is used.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.encryptionConfig = $.encryptionConfig;
        this.kubernetesNetworkConfig = $.kubernetesNetworkConfig;
        this.logging = $.logging;
        this.name = $.name;
        this.resourcesVpcConfig = $.resourcesVpcConfig;
        this.roleArn = $.roleArn;
        this.tags = $.tags;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder encryptionConfig(@Nullable Output<List<ClusterEncryptionConfigArgs>> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder encryptionConfig(List<ClusterEncryptionConfigArgs> encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        public Builder encryptionConfig(ClusterEncryptionConfigArgs... encryptionConfig) {
            return encryptionConfig(List.of(encryptionConfig));
        }

        public Builder kubernetesNetworkConfig(@Nullable Output<ClusterKubernetesNetworkConfigArgs> kubernetesNetworkConfig) {
            $.kubernetesNetworkConfig = kubernetesNetworkConfig;
            return this;
        }

        public Builder kubernetesNetworkConfig(ClusterKubernetesNetworkConfigArgs kubernetesNetworkConfig) {
            return kubernetesNetworkConfig(Output.of(kubernetesNetworkConfig));
        }

        public Builder logging(@Nullable Output<ClusterLoggingArgs> logging) {
            $.logging = logging;
            return this;
        }

        public Builder logging(ClusterLoggingArgs logging) {
            return logging(Output.of(logging));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourcesVpcConfig(Output<ClusterResourcesVpcConfigArgs> resourcesVpcConfig) {
            $.resourcesVpcConfig = resourcesVpcConfig;
            return this;
        }

        public Builder resourcesVpcConfig(ClusterResourcesVpcConfigArgs resourcesVpcConfig) {
            return resourcesVpcConfig(Output.of(resourcesVpcConfig));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder tags(@Nullable Output<List<ClusterTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ClusterTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ClusterTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ClusterArgs build() {
            $.resourcesVpcConfig = Objects.requireNonNull($.resourcesVpcConfig, "expected parameter 'resourcesVpcConfig' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
