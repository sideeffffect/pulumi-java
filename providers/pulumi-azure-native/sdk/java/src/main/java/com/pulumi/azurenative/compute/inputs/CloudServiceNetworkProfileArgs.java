// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.LoadBalancerConfigurationArgs;
import com.pulumi.azurenative.compute.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network Profile for the cloud service.
 * 
 */
public final class CloudServiceNetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudServiceNetworkProfileArgs Empty = new CloudServiceNetworkProfileArgs();

    /**
     * List of Load balancer configurations. Cloud service can have up to two load balancer configurations, corresponding to a Public Load Balancer and an Internal Load Balancer.
     * 
     */
    @Import(name="loadBalancerConfigurations")
    private @Nullable Output<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations;

    public Optional<Output<List<LoadBalancerConfigurationArgs>>> loadBalancerConfigurations() {
        return Optional.ofNullable(this.loadBalancerConfigurations);
    }

    /**
     * The id reference of the cloud service containing the target IP with which the subject cloud service can perform a swap. This property cannot be updated once it is set. The swappable cloud service referred by this id must be present otherwise an error will be thrown.
     * 
     */
    @Import(name="swappableCloudService")
    private @Nullable Output<SubResourceArgs> swappableCloudService;

    public Optional<Output<SubResourceArgs>> swappableCloudService() {
        return Optional.ofNullable(this.swappableCloudService);
    }

    private CloudServiceNetworkProfileArgs() {}

    private CloudServiceNetworkProfileArgs(CloudServiceNetworkProfileArgs $) {
        this.loadBalancerConfigurations = $.loadBalancerConfigurations;
        this.swappableCloudService = $.swappableCloudService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudServiceNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudServiceNetworkProfileArgs $;

        public Builder() {
            $ = new CloudServiceNetworkProfileArgs();
        }

        public Builder(CloudServiceNetworkProfileArgs defaults) {
            $ = new CloudServiceNetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder loadBalancerConfigurations(@Nullable Output<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations) {
            $.loadBalancerConfigurations = loadBalancerConfigurations;
            return this;
        }

        public Builder loadBalancerConfigurations(List<LoadBalancerConfigurationArgs> loadBalancerConfigurations) {
            return loadBalancerConfigurations(Output.of(loadBalancerConfigurations));
        }

        public Builder loadBalancerConfigurations(LoadBalancerConfigurationArgs... loadBalancerConfigurations) {
            return loadBalancerConfigurations(List.of(loadBalancerConfigurations));
        }

        public Builder swappableCloudService(@Nullable Output<SubResourceArgs> swappableCloudService) {
            $.swappableCloudService = swappableCloudService;
            return this;
        }

        public Builder swappableCloudService(SubResourceArgs swappableCloudService) {
            return swappableCloudService(Output.of(swappableCloudService));
        }

        public CloudServiceNetworkProfileArgs build() {
            return $;
        }
    }

}
