// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamElasticsearchRetryOptions extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamElasticsearchRetryOptions Empty = new DeliveryStreamElasticsearchRetryOptions();

    @InputImport(name="durationInSeconds")
      private final @Nullable Integer durationInSeconds;

    public Optional<Integer> getDurationInSeconds() {
        return this.durationInSeconds == null ? Optional.empty() : Optional.ofNullable(this.durationInSeconds);
    }

    public DeliveryStreamElasticsearchRetryOptions(@Nullable Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    private DeliveryStreamElasticsearchRetryOptions() {
        this.durationInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamElasticsearchRetryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer durationInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamElasticsearchRetryOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
        }

        public Builder durationInSeconds(@Nullable Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }
        public DeliveryStreamElasticsearchRetryOptions build() {
            return new DeliveryStreamElasticsearchRetryOptions(durationInSeconds);
        }
    }
}
