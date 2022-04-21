// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.inputs.ServiceAwsVpcConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkConfigurationArgs Empty = new ServiceNetworkConfigurationArgs();

    @Import(name="awsvpcConfiguration")
    private @Nullable Output<ServiceAwsVpcConfigurationArgs> awsvpcConfiguration;

    public Optional<Output<ServiceAwsVpcConfigurationArgs>> awsvpcConfiguration() {
        return Optional.ofNullable(this.awsvpcConfiguration);
    }

    private ServiceNetworkConfigurationArgs() {}

    private ServiceNetworkConfigurationArgs(ServiceNetworkConfigurationArgs $) {
        this.awsvpcConfiguration = $.awsvpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNetworkConfigurationArgs $;

        public Builder() {
            $ = new ServiceNetworkConfigurationArgs();
        }

        public Builder(ServiceNetworkConfigurationArgs defaults) {
            $ = new ServiceNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsvpcConfiguration(@Nullable Output<ServiceAwsVpcConfigurationArgs> awsvpcConfiguration) {
            $.awsvpcConfiguration = awsvpcConfiguration;
            return this;
        }

        public Builder awsvpcConfiguration(ServiceAwsVpcConfigurationArgs awsvpcConfiguration) {
            return awsvpcConfiguration(Output.of(awsvpcConfiguration));
        }

        public ServiceNetworkConfigurationArgs build() {
            return $;
        }
    }

}
