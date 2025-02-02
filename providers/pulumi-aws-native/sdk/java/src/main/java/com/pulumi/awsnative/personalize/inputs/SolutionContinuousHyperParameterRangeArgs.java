// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Provides the name and range of a continuous hyperparameter.
 * 
 */
public final class SolutionContinuousHyperParameterRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SolutionContinuousHyperParameterRangeArgs Empty = new SolutionContinuousHyperParameterRangeArgs();

    /**
     * The maximum allowable value for the hyperparameter.
     * 
     */
    @Import(name="maxValue")
    private @Nullable Output<Double> maxValue;

    /**
     * @return The maximum allowable value for the hyperparameter.
     * 
     */
    public Optional<Output<Double>> maxValue() {
        return Optional.ofNullable(this.maxValue);
    }

    /**
     * The minimum allowable value for the hyperparameter.
     * 
     */
    @Import(name="minValue")
    private @Nullable Output<Double> minValue;

    /**
     * @return The minimum allowable value for the hyperparameter.
     * 
     */
    public Optional<Output<Double>> minValue() {
        return Optional.ofNullable(this.minValue);
    }

    /**
     * The name of the hyperparameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the hyperparameter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private SolutionContinuousHyperParameterRangeArgs() {}

    private SolutionContinuousHyperParameterRangeArgs(SolutionContinuousHyperParameterRangeArgs $) {
        this.maxValue = $.maxValue;
        this.minValue = $.minValue;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SolutionContinuousHyperParameterRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SolutionContinuousHyperParameterRangeArgs $;

        public Builder() {
            $ = new SolutionContinuousHyperParameterRangeArgs();
        }

        public Builder(SolutionContinuousHyperParameterRangeArgs defaults) {
            $ = new SolutionContinuousHyperParameterRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxValue The maximum allowable value for the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder maxValue(@Nullable Output<Double> maxValue) {
            $.maxValue = maxValue;
            return this;
        }

        /**
         * @param maxValue The maximum allowable value for the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder maxValue(Double maxValue) {
            return maxValue(Output.of(maxValue));
        }

        /**
         * @param minValue The minimum allowable value for the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder minValue(@Nullable Output<Double> minValue) {
            $.minValue = minValue;
            return this;
        }

        /**
         * @param minValue The minimum allowable value for the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder minValue(Double minValue) {
            return minValue(Output.of(minValue));
        }

        /**
         * @param name The name of the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SolutionContinuousHyperParameterRangeArgs build() {
            return $;
        }
    }

}
