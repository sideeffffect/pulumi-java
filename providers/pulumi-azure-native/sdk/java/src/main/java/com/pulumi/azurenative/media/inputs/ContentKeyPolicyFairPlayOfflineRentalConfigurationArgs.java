// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs Empty = new ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs();

    /**
     * Playback duration
     * 
     */
    @Import(name="playbackDurationSeconds", required=true)
    private Output<Double> playbackDurationSeconds;

    /**
     * @return Playback duration
     * 
     */
    public Output<Double> playbackDurationSeconds() {
        return this.playbackDurationSeconds;
    }

    /**
     * Storage duration
     * 
     */
    @Import(name="storageDurationSeconds", required=true)
    private Output<Double> storageDurationSeconds;

    /**
     * @return Storage duration
     * 
     */
    public Output<Double> storageDurationSeconds() {
        return this.storageDurationSeconds;
    }

    private ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs() {}

    private ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs(ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs $) {
        this.playbackDurationSeconds = $.playbackDurationSeconds;
        this.storageDurationSeconds = $.storageDurationSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs $;

        public Builder() {
            $ = new ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs();
        }

        public Builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs defaults) {
            $ = new ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param playbackDurationSeconds Playback duration
         * 
         * @return builder
         * 
         */
        public Builder playbackDurationSeconds(Output<Double> playbackDurationSeconds) {
            $.playbackDurationSeconds = playbackDurationSeconds;
            return this;
        }

        /**
         * @param playbackDurationSeconds Playback duration
         * 
         * @return builder
         * 
         */
        public Builder playbackDurationSeconds(Double playbackDurationSeconds) {
            return playbackDurationSeconds(Output.of(playbackDurationSeconds));
        }

        /**
         * @param storageDurationSeconds Storage duration
         * 
         * @return builder
         * 
         */
        public Builder storageDurationSeconds(Output<Double> storageDurationSeconds) {
            $.storageDurationSeconds = storageDurationSeconds;
            return this;
        }

        /**
         * @param storageDurationSeconds Storage duration
         * 
         * @return builder
         * 
         */
        public Builder storageDurationSeconds(Double storageDurationSeconds) {
            return storageDurationSeconds(Output.of(storageDurationSeconds));
        }

        public ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs build() {
            $.playbackDurationSeconds = Objects.requireNonNull($.playbackDurationSeconds, "expected parameter 'playbackDurationSeconds' to be non-null");
            $.storageDurationSeconds = Objects.requireNonNull($.storageDurationSeconds, "expected parameter 'storageDurationSeconds' to be non-null");
            return $;
        }
    }

}
