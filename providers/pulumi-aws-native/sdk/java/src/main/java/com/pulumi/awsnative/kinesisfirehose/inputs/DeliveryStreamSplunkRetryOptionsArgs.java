// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamSplunkRetryOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamSplunkRetryOptionsArgs Empty = new DeliveryStreamSplunkRetryOptionsArgs();

    @Import(name="durationInSeconds")
    private @Nullable Output<Integer> durationInSeconds;

    public Optional<Output<Integer>> durationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }

    private DeliveryStreamSplunkRetryOptionsArgs() {}

    private DeliveryStreamSplunkRetryOptionsArgs(DeliveryStreamSplunkRetryOptionsArgs $) {
        this.durationInSeconds = $.durationInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamSplunkRetryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamSplunkRetryOptionsArgs $;

        public Builder() {
            $ = new DeliveryStreamSplunkRetryOptionsArgs();
        }

        public Builder(DeliveryStreamSplunkRetryOptionsArgs defaults) {
            $ = new DeliveryStreamSplunkRetryOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder durationInSeconds(@Nullable Output<Integer> durationInSeconds) {
            $.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder durationInSeconds(Integer durationInSeconds) {
            return durationInSeconds(Output.of(durationInSeconds));
        }

        public DeliveryStreamSplunkRetryOptionsArgs build() {
            return $;
        }
    }

}
