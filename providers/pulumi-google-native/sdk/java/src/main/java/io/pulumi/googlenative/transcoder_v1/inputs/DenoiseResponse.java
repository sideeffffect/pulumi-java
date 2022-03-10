// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Denoise preprocessing configuration.
 * 
 */
public final class DenoiseResponse extends io.pulumi.resources.InvokeArgs {

    public static final DenoiseResponse Empty = new DenoiseResponse();

    /**
     * Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother the image. 0 is no denoising. The default is 0.
     * 
     */
    @InputImport(name="strength", required=true)
      private final Double strength;

    public Double getStrength() {
        return this.strength;
    }

    /**
     * Set the denoiser mode. The default is `standard`. Supported denoiser modes: - `standard` - `grain`
     * 
     */
    @InputImport(name="tune", required=true)
      private final String tune;

    public String getTune() {
        return this.tune;
    }

    public DenoiseResponse(
        Double strength,
        String tune) {
        this.strength = Objects.requireNonNull(strength, "expected parameter 'strength' to be non-null");
        this.tune = Objects.requireNonNull(tune, "expected parameter 'tune' to be non-null");
    }

    private DenoiseResponse() {
        this.strength = null;
        this.tune = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DenoiseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double strength;
        private String tune;

        public Builder() {
    	      // Empty
        }

        public Builder(DenoiseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.strength = defaults.strength;
    	      this.tune = defaults.tune;
        }

        public Builder strength(Double strength) {
            this.strength = Objects.requireNonNull(strength);
            return this;
        }

        public Builder tune(String tune) {
            this.tune = Objects.requireNonNull(tune);
            return this;
        }
        public DenoiseResponse build() {
            return new DenoiseResponse(strength, tune);
        }
    }
}
