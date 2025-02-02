// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Used for time-dependent conditions. Example: Want to have rule applied for week long sale.
 * 
 */
public final class GoogleCloudRetailV2betaConditionTimeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaConditionTimeRangeArgs Empty = new GoogleCloudRetailV2betaConditionTimeRangeArgs();

    /**
     * End of time range. Range is inclusive.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return End of time range. Range is inclusive.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Start of time range. Range is inclusive.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Start of time range. Range is inclusive.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private GoogleCloudRetailV2betaConditionTimeRangeArgs() {}

    private GoogleCloudRetailV2betaConditionTimeRangeArgs(GoogleCloudRetailV2betaConditionTimeRangeArgs $) {
        this.endTime = $.endTime;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaConditionTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaConditionTimeRangeArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaConditionTimeRangeArgs();
        }

        public Builder(GoogleCloudRetailV2betaConditionTimeRangeArgs defaults) {
            $ = new GoogleCloudRetailV2betaConditionTimeRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTime End of time range. Range is inclusive.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime End of time range. Range is inclusive.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startTime Start of time range. Range is inclusive.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Start of time range. Range is inclusive.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public GoogleCloudRetailV2betaConditionTimeRangeArgs build() {
            return $;
        }
    }

}
