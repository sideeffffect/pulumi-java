// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies an exponential sequence of buckets that have a width that is proportional to the value of the lower bound. Each bucket represents a constant relative uncertainty on a specific value in the bucket.There are num_finite_buckets + 2 (= N) buckets. Bucket i has the following boundaries:Upper bound (0 &lt;= i &lt; N-1): scale * (growth_factor ^ i). Lower bound (1 &lt;= i &lt; N): scale * (growth_factor ^ (i - 1)).
 * 
 */
public final class ExponentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExponentialArgs Empty = new ExponentialArgs();

    /**
     * Must be greater than 1.
     * 
     */
    @Import(name="growthFactor")
    private @Nullable Output<Double> growthFactor;

    /**
     * @return Must be greater than 1.
     * 
     */
    public Optional<Output<Double>> growthFactor() {
        return Optional.ofNullable(this.growthFactor);
    }

    /**
     * Must be greater than 0.
     * 
     */
    @Import(name="numFiniteBuckets")
    private @Nullable Output<Integer> numFiniteBuckets;

    /**
     * @return Must be greater than 0.
     * 
     */
    public Optional<Output<Integer>> numFiniteBuckets() {
        return Optional.ofNullable(this.numFiniteBuckets);
    }

    /**
     * Must be greater than 0.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<Double> scale;

    /**
     * @return Must be greater than 0.
     * 
     */
    public Optional<Output<Double>> scale() {
        return Optional.ofNullable(this.scale);
    }

    private ExponentialArgs() {}

    private ExponentialArgs(ExponentialArgs $) {
        this.growthFactor = $.growthFactor;
        this.numFiniteBuckets = $.numFiniteBuckets;
        this.scale = $.scale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExponentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExponentialArgs $;

        public Builder() {
            $ = new ExponentialArgs();
        }

        public Builder(ExponentialArgs defaults) {
            $ = new ExponentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param growthFactor Must be greater than 1.
         * 
         * @return builder
         * 
         */
        public Builder growthFactor(@Nullable Output<Double> growthFactor) {
            $.growthFactor = growthFactor;
            return this;
        }

        /**
         * @param growthFactor Must be greater than 1.
         * 
         * @return builder
         * 
         */
        public Builder growthFactor(Double growthFactor) {
            return growthFactor(Output.of(growthFactor));
        }

        /**
         * @param numFiniteBuckets Must be greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder numFiniteBuckets(@Nullable Output<Integer> numFiniteBuckets) {
            $.numFiniteBuckets = numFiniteBuckets;
            return this;
        }

        /**
         * @param numFiniteBuckets Must be greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder numFiniteBuckets(Integer numFiniteBuckets) {
            return numFiniteBuckets(Output.of(numFiniteBuckets));
        }

        /**
         * @param scale Must be greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder scale(@Nullable Output<Double> scale) {
            $.scale = scale;
            return this;
        }

        /**
         * @param scale Must be greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder scale(Double scale) {
            return scale(Output.of(scale));
        }

        public ExponentialArgs build() {
            return $;
        }
    }

}
