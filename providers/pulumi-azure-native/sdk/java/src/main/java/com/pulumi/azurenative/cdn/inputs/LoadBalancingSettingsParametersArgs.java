// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Round-Robin load balancing settings for a backend pool
 * 
 */
public final class LoadBalancingSettingsParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancingSettingsParametersArgs Empty = new LoadBalancingSettingsParametersArgs();

    /**
     * The additional latency in milliseconds for probes to fall into the lowest latency bucket
     * 
     */
    @Import(name="additionalLatencyInMilliseconds")
    private @Nullable Output<Integer> additionalLatencyInMilliseconds;

    public Optional<Output<Integer>> additionalLatencyInMilliseconds() {
        return Optional.ofNullable(this.additionalLatencyInMilliseconds);
    }

    /**
     * The number of samples to consider for load balancing decisions
     * 
     */
    @Import(name="sampleSize")
    private @Nullable Output<Integer> sampleSize;

    public Optional<Output<Integer>> sampleSize() {
        return Optional.ofNullable(this.sampleSize);
    }

    /**
     * The number of samples within the sample period that must succeed
     * 
     */
    @Import(name="successfulSamplesRequired")
    private @Nullable Output<Integer> successfulSamplesRequired;

    public Optional<Output<Integer>> successfulSamplesRequired() {
        return Optional.ofNullable(this.successfulSamplesRequired);
    }

    private LoadBalancingSettingsParametersArgs() {}

    private LoadBalancingSettingsParametersArgs(LoadBalancingSettingsParametersArgs $) {
        this.additionalLatencyInMilliseconds = $.additionalLatencyInMilliseconds;
        this.sampleSize = $.sampleSize;
        this.successfulSamplesRequired = $.successfulSamplesRequired;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancingSettingsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancingSettingsParametersArgs $;

        public Builder() {
            $ = new LoadBalancingSettingsParametersArgs();
        }

        public Builder(LoadBalancingSettingsParametersArgs defaults) {
            $ = new LoadBalancingSettingsParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalLatencyInMilliseconds(@Nullable Output<Integer> additionalLatencyInMilliseconds) {
            $.additionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
            return this;
        }

        public Builder additionalLatencyInMilliseconds(Integer additionalLatencyInMilliseconds) {
            return additionalLatencyInMilliseconds(Output.of(additionalLatencyInMilliseconds));
        }

        public Builder sampleSize(@Nullable Output<Integer> sampleSize) {
            $.sampleSize = sampleSize;
            return this;
        }

        public Builder sampleSize(Integer sampleSize) {
            return sampleSize(Output.of(sampleSize));
        }

        public Builder successfulSamplesRequired(@Nullable Output<Integer> successfulSamplesRequired) {
            $.successfulSamplesRequired = successfulSamplesRequired;
            return this;
        }

        public Builder successfulSamplesRequired(Integer successfulSamplesRequired) {
            return successfulSamplesRequired(Output.of(successfulSamplesRequired));
        }

        public LoadBalancingSettingsParametersArgs build() {
            return $;
        }
    }

}
