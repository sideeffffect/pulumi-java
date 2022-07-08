// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A confidence interval is a range of possible values for the experiment objective you are trying to measure.
 * 
 */
public final class GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs Empty = new GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs();

    /**
     * The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval.
     * 
     */
    @Import(name="confidenceLevel")
    private @Nullable Output<Double> confidenceLevel;

    /**
     * @return The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval.
     * 
     */
    public Optional<Output<Double>> confidenceLevel() {
        return Optional.ofNullable(this.confidenceLevel);
    }

    /**
     * Lower bound of the interval.
     * 
     */
    @Import(name="lowerBound")
    private @Nullable Output<Double> lowerBound;

    /**
     * @return Lower bound of the interval.
     * 
     */
    public Optional<Output<Double>> lowerBound() {
        return Optional.ofNullable(this.lowerBound);
    }

    /**
     * The percent change between an experiment metric&#39;s value and the value for its control.
     * 
     */
    @Import(name="ratio")
    private @Nullable Output<Double> ratio;

    /**
     * @return The percent change between an experiment metric&#39;s value and the value for its control.
     * 
     */
    public Optional<Output<Double>> ratio() {
        return Optional.ofNullable(this.ratio);
    }

    /**
     * Upper bound of the interval.
     * 
     */
    @Import(name="upperBound")
    private @Nullable Output<Double> upperBound;

    /**
     * @return Upper bound of the interval.
     * 
     */
    public Optional<Output<Double>> upperBound() {
        return Optional.ofNullable(this.upperBound);
    }

    private GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs() {}

    private GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs $) {
        this.confidenceLevel = $.confidenceLevel;
        this.lowerBound = $.lowerBound;
        this.ratio = $.ratio;
        this.upperBound = $.upperBound;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param confidenceLevel The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval.
         * 
         * @return builder
         * 
         */
        public Builder confidenceLevel(@Nullable Output<Double> confidenceLevel) {
            $.confidenceLevel = confidenceLevel;
            return this;
        }

        /**
         * @param confidenceLevel The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval.
         * 
         * @return builder
         * 
         */
        public Builder confidenceLevel(Double confidenceLevel) {
            return confidenceLevel(Output.of(confidenceLevel));
        }

        /**
         * @param lowerBound Lower bound of the interval.
         * 
         * @return builder
         * 
         */
        public Builder lowerBound(@Nullable Output<Double> lowerBound) {
            $.lowerBound = lowerBound;
            return this;
        }

        /**
         * @param lowerBound Lower bound of the interval.
         * 
         * @return builder
         * 
         */
        public Builder lowerBound(Double lowerBound) {
            return lowerBound(Output.of(lowerBound));
        }

        /**
         * @param ratio The percent change between an experiment metric&#39;s value and the value for its control.
         * 
         * @return builder
         * 
         */
        public Builder ratio(@Nullable Output<Double> ratio) {
            $.ratio = ratio;
            return this;
        }

        /**
         * @param ratio The percent change between an experiment metric&#39;s value and the value for its control.
         * 
         * @return builder
         * 
         */
        public Builder ratio(Double ratio) {
            return ratio(Output.of(ratio));
        }

        /**
         * @param upperBound Upper bound of the interval.
         * 
         * @return builder
         * 
         */
        public Builder upperBound(@Nullable Output<Double> upperBound) {
            $.upperBound = upperBound;
            return this;
        }

        /**
         * @param upperBound Upper bound of the interval.
         * 
         * @return builder
         * 
         */
        public Builder upperBound(Double upperBound) {
            return upperBound(Output.of(upperBound));
        }

        public GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs build() {
            return $;
        }
    }

}
