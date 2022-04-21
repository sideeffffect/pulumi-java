// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A floating point interval.
 * 
 */
public final class GoogleCloudRetailV2alphaIntervalArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaIntervalArgs Empty = new GoogleCloudRetailV2alphaIntervalArgs();

    /**
     * Exclusive upper bound.
     * 
     */
    @Import(name="exclusiveMaximum")
    private @Nullable Output<Double> exclusiveMaximum;

    public Optional<Output<Double>> exclusiveMaximum() {
        return Optional.ofNullable(this.exclusiveMaximum);
    }

    /**
     * Exclusive lower bound.
     * 
     */
    @Import(name="exclusiveMinimum")
    private @Nullable Output<Double> exclusiveMinimum;

    public Optional<Output<Double>> exclusiveMinimum() {
        return Optional.ofNullable(this.exclusiveMinimum);
    }

    /**
     * Inclusive upper bound.
     * 
     */
    @Import(name="maximum")
    private @Nullable Output<Double> maximum;

    public Optional<Output<Double>> maximum() {
        return Optional.ofNullable(this.maximum);
    }

    /**
     * Inclusive lower bound.
     * 
     */
    @Import(name="minimum")
    private @Nullable Output<Double> minimum;

    public Optional<Output<Double>> minimum() {
        return Optional.ofNullable(this.minimum);
    }

    private GoogleCloudRetailV2alphaIntervalArgs() {}

    private GoogleCloudRetailV2alphaIntervalArgs(GoogleCloudRetailV2alphaIntervalArgs $) {
        this.exclusiveMaximum = $.exclusiveMaximum;
        this.exclusiveMinimum = $.exclusiveMinimum;
        this.maximum = $.maximum;
        this.minimum = $.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaIntervalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaIntervalArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaIntervalArgs();
        }

        public Builder(GoogleCloudRetailV2alphaIntervalArgs defaults) {
            $ = new GoogleCloudRetailV2alphaIntervalArgs(Objects.requireNonNull(defaults));
        }

        public Builder exclusiveMaximum(@Nullable Output<Double> exclusiveMaximum) {
            $.exclusiveMaximum = exclusiveMaximum;
            return this;
        }

        public Builder exclusiveMaximum(Double exclusiveMaximum) {
            return exclusiveMaximum(Output.of(exclusiveMaximum));
        }

        public Builder exclusiveMinimum(@Nullable Output<Double> exclusiveMinimum) {
            $.exclusiveMinimum = exclusiveMinimum;
            return this;
        }

        public Builder exclusiveMinimum(Double exclusiveMinimum) {
            return exclusiveMinimum(Output.of(exclusiveMinimum));
        }

        public Builder maximum(@Nullable Output<Double> maximum) {
            $.maximum = maximum;
            return this;
        }

        public Builder maximum(Double maximum) {
            return maximum(Output.of(maximum));
        }

        public Builder minimum(@Nullable Output<Double> minimum) {
            $.minimum = minimum;
            return this;
        }

        public Builder minimum(Double minimum) {
            return minimum(Output.of(minimum));
        }

        public GoogleCloudRetailV2alphaIntervalArgs build() {
            return $;
        }
    }

}
