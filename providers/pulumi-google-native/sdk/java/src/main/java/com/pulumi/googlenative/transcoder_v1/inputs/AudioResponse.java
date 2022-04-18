// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;


/**
 * Audio preprocessing configuration.
 * 
 */
public final class AudioResponse extends com.pulumi.resources.InvokeArgs {

    public static final AudioResponse Empty = new AudioResponse();

    /**
     * Enable boosting high frequency components. The default is `false`.
     * 
     */
    @Import(name="highBoost", required=true)
      private final Boolean highBoost;

    public Boolean highBoost() {
        return this.highBoost;
    }

    /**
     * Enable boosting low frequency components. The default is `false`.
     * 
     */
    @Import(name="lowBoost", required=true)
      private final Boolean lowBoost;

    public Boolean lowBoost() {
        return this.lowBoost;
    }

    /**
     * Specify audio loudness normalization in loudness units relative to full scale (LUFS). Enter a value between -24 and 0 (the default), where: * -24 is the Advanced Television Systems Committee (ATSC A/85) standard * -23 is the EU R128 broadcast standard * -19 is the prior standard for online mono audio * -18 is the ReplayGain standard * -16 is the prior standard for stereo audio * -14 is the new online audio standard recommended by Spotify, as well as Amazon Echo * 0 disables normalization
     * 
     */
    @Import(name="lufs", required=true)
      private final Double lufs;

    public Double lufs() {
        return this.lufs;
    }

    public AudioResponse(
        Boolean highBoost,
        Boolean lowBoost,
        Double lufs) {
        this.highBoost = Objects.requireNonNull(highBoost, "expected parameter 'highBoost' to be non-null");
        this.lowBoost = Objects.requireNonNull(lowBoost, "expected parameter 'lowBoost' to be non-null");
        this.lufs = Objects.requireNonNull(lufs, "expected parameter 'lufs' to be non-null");
    }

    private AudioResponse() {
        this.highBoost = null;
        this.lowBoost = null;
        this.lufs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean highBoost;
        private Boolean lowBoost;
        private Double lufs;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.highBoost = defaults.highBoost;
    	      this.lowBoost = defaults.lowBoost;
    	      this.lufs = defaults.lufs;
        }

        public Builder highBoost(Boolean highBoost) {
            this.highBoost = Objects.requireNonNull(highBoost);
            return this;
        }
        public Builder lowBoost(Boolean lowBoost) {
            this.lowBoost = Objects.requireNonNull(lowBoost);
            return this;
        }
        public Builder lufs(Double lufs) {
            this.lufs = Objects.requireNonNull(lufs);
            return this;
        }        public AudioResponse build() {
            return new AudioResponse(highBoost, lowBoost, lufs);
        }
    }
}
