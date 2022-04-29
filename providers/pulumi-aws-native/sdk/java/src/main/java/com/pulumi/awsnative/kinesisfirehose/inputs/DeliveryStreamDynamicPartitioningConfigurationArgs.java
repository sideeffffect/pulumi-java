// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamRetryOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamDynamicPartitioningConfigurationArgs extends ResourceArgs {

    public static final DeliveryStreamDynamicPartitioningConfigurationArgs Empty = new DeliveryStreamDynamicPartitioningConfigurationArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="retryOptions")
    private @Nullable Output<DeliveryStreamRetryOptionsArgs> retryOptions;

    public Optional<Output<DeliveryStreamRetryOptionsArgs>> retryOptions() {
        return Optional.ofNullable(this.retryOptions);
    }

    private DeliveryStreamDynamicPartitioningConfigurationArgs() {}

    private DeliveryStreamDynamicPartitioningConfigurationArgs(DeliveryStreamDynamicPartitioningConfigurationArgs $) {
        this.enabled = $.enabled;
        this.retryOptions = $.retryOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamDynamicPartitioningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamDynamicPartitioningConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamDynamicPartitioningConfigurationArgs();
        }

        public Builder(DeliveryStreamDynamicPartitioningConfigurationArgs defaults) {
            $ = new DeliveryStreamDynamicPartitioningConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder retryOptions(@Nullable Output<DeliveryStreamRetryOptionsArgs> retryOptions) {
            $.retryOptions = retryOptions;
            return this;
        }

        public Builder retryOptions(DeliveryStreamRetryOptionsArgs retryOptions) {
            return retryOptions(Output.of(retryOptions));
        }

        public DeliveryStreamDynamicPartitioningConfigurationArgs build() {
            return $;
        }
    }

}
