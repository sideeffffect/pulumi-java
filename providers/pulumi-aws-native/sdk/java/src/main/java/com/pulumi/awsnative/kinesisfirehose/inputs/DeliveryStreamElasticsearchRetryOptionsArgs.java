// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamElasticsearchRetryOptionsArgs extends ResourceArgs {

    public static final DeliveryStreamElasticsearchRetryOptionsArgs Empty = new DeliveryStreamElasticsearchRetryOptionsArgs();

    @Import(name="durationInSeconds")
    private @Nullable Output<Integer> durationInSeconds;

    public Optional<Output<Integer>> durationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }

    private DeliveryStreamElasticsearchRetryOptionsArgs() {}

    private DeliveryStreamElasticsearchRetryOptionsArgs(DeliveryStreamElasticsearchRetryOptionsArgs $) {
        this.durationInSeconds = $.durationInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamElasticsearchRetryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamElasticsearchRetryOptionsArgs $;

        public Builder() {
            $ = new DeliveryStreamElasticsearchRetryOptionsArgs();
        }

        public Builder(DeliveryStreamElasticsearchRetryOptionsArgs defaults) {
            $ = new DeliveryStreamElasticsearchRetryOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder durationInSeconds(@Nullable Output<Integer> durationInSeconds) {
            $.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder durationInSeconds(Integer durationInSeconds) {
            return durationInSeconds(Output.of(durationInSeconds));
        }

        public DeliveryStreamElasticsearchRetryOptionsArgs build() {
            return $;
        }
    }

}
