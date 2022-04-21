// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamElasticsearchRetryOptions extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamElasticsearchRetryOptions Empty = new DeliveryStreamElasticsearchRetryOptions();

    @Import(name="durationInSeconds")
    private @Nullable Integer durationInSeconds;

    public Optional<Integer> durationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }

    private DeliveryStreamElasticsearchRetryOptions() {}

    private DeliveryStreamElasticsearchRetryOptions(DeliveryStreamElasticsearchRetryOptions $) {
        this.durationInSeconds = $.durationInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamElasticsearchRetryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamElasticsearchRetryOptions $;

        public Builder() {
            $ = new DeliveryStreamElasticsearchRetryOptions();
        }

        public Builder(DeliveryStreamElasticsearchRetryOptions defaults) {
            $ = new DeliveryStreamElasticsearchRetryOptions(Objects.requireNonNull(defaults));
        }

        public Builder durationInSeconds(@Nullable Integer durationInSeconds) {
            $.durationInSeconds = durationInSeconds;
            return this;
        }

        public DeliveryStreamElasticsearchRetryOptions build() {
            return $;
        }
    }

}
