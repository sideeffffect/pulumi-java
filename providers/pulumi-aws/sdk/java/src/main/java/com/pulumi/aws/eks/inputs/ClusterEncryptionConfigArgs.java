// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.aws.eks.inputs.ClusterEncryptionConfigProviderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClusterEncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionConfigArgs Empty = new ClusterEncryptionConfigArgs();

    /**
     * Configuration block with provider for encryption. Detailed below.
     * 
     */
    @Import(name="provider", required=true)
    private Output<ClusterEncryptionConfigProviderArgs> provider;

    public Output<ClusterEncryptionConfigProviderArgs> provider() {
        return this.provider;
    }

    /**
     * List of strings with resources to be encrypted. Valid values: `secrets`.
     * 
     */
    @Import(name="resources", required=true)
    private Output<List<String>> resources;

    public Output<List<String>> resources() {
        return this.resources;
    }

    private ClusterEncryptionConfigArgs() {}

    private ClusterEncryptionConfigArgs(ClusterEncryptionConfigArgs $) {
        this.provider = $.provider;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEncryptionConfigArgs $;

        public Builder() {
            $ = new ClusterEncryptionConfigArgs();
        }

        public Builder(ClusterEncryptionConfigArgs defaults) {
            $ = new ClusterEncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder provider(Output<ClusterEncryptionConfigProviderArgs> provider) {
            $.provider = provider;
            return this;
        }

        public Builder provider(ClusterEncryptionConfigProviderArgs provider) {
            return provider(Output.of(provider));
        }

        public Builder resources(Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public ClusterEncryptionConfigArgs build() {
            $.provider = Objects.requireNonNull($.provider, "expected parameter 'provider' to be non-null");
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            return $;
        }
    }

}
