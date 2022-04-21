// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs Empty = new FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs();

    /**
     * Target number of concurrent requests.
     * 
     */
    @Import(name="targetConcurrentRequests")
    private @Nullable Output<Double> targetConcurrentRequests;

    public Optional<Output<Double>> targetConcurrentRequests() {
        return Optional.ofNullable(this.targetConcurrentRequests);
    }

    /**
     * Target requests per second.
     * 
     */
    @Import(name="targetRequestCountPerSecond")
    private @Nullable Output<String> targetRequestCountPerSecond;

    public Optional<Output<String>> targetRequestCountPerSecond() {
        return Optional.ofNullable(this.targetRequestCountPerSecond);
    }

    private FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs() {}

    private FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs(FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs $) {
        this.targetConcurrentRequests = $.targetConcurrentRequests;
        this.targetRequestCountPerSecond = $.targetRequestCountPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs $;

        public Builder() {
            $ = new FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs();
        }

        public Builder(FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs defaults) {
            $ = new FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder targetConcurrentRequests(@Nullable Output<Double> targetConcurrentRequests) {
            $.targetConcurrentRequests = targetConcurrentRequests;
            return this;
        }

        public Builder targetConcurrentRequests(Double targetConcurrentRequests) {
            return targetConcurrentRequests(Output.of(targetConcurrentRequests));
        }

        public Builder targetRequestCountPerSecond(@Nullable Output<String> targetRequestCountPerSecond) {
            $.targetRequestCountPerSecond = targetRequestCountPerSecond;
            return this;
        }

        public Builder targetRequestCountPerSecond(String targetRequestCountPerSecond) {
            return targetRequestCountPerSecond(Output.of(targetRequestCountPerSecond));
        }

        public FlexibleAppVersionAutomaticScalingRequestUtilizationGetArgs build() {
            return $;
        }
    }

}
