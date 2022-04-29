// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiteTopicReservationConfigArgs extends ResourceArgs {

    public static final LiteTopicReservationConfigArgs Empty = new LiteTopicReservationConfigArgs();

    /**
     * The Reservation to use for this topic&#39;s throughput capacity.
     * 
     */
    @Import(name="throughputReservation")
    private @Nullable Output<String> throughputReservation;

    /**
     * @return The Reservation to use for this topic&#39;s throughput capacity.
     * 
     */
    public Optional<Output<String>> throughputReservation() {
        return Optional.ofNullable(this.throughputReservation);
    }

    private LiteTopicReservationConfigArgs() {}

    private LiteTopicReservationConfigArgs(LiteTopicReservationConfigArgs $) {
        this.throughputReservation = $.throughputReservation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiteTopicReservationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiteTopicReservationConfigArgs $;

        public Builder() {
            $ = new LiteTopicReservationConfigArgs();
        }

        public Builder(LiteTopicReservationConfigArgs defaults) {
            $ = new LiteTopicReservationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param throughputReservation The Reservation to use for this topic&#39;s throughput capacity.
         * 
         * @return builder
         * 
         */
        public Builder throughputReservation(@Nullable Output<String> throughputReservation) {
            $.throughputReservation = throughputReservation;
            return this;
        }

        /**
         * @param throughputReservation The Reservation to use for this topic&#39;s throughput capacity.
         * 
         * @return builder
         * 
         */
        public Builder throughputReservation(String throughputReservation) {
            return throughputReservation(Output.of(throughputReservation));
        }

        public LiteTopicReservationConfigArgs build() {
            return $;
        }
    }

}
