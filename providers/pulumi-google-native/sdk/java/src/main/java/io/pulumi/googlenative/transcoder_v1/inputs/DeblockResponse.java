// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;


/**
 * Deblock preprocessing configuration.
 * 
 */
public final class DeblockResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeblockResponse Empty = new DeblockResponse();

    /**
     * Enable deblocker. The default is `false`.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
     * 
     */
    @InputImport(name="strength", required=true)
      private final Double strength;

    public Double getStrength() {
        return this.strength;
    }

    public DeblockResponse(
        Boolean enabled,
        Double strength) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.strength = Objects.requireNonNull(strength, "expected parameter 'strength' to be non-null");
    }

    private DeblockResponse() {
        this.enabled = null;
        this.strength = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeblockResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private Double strength;

        public Builder() {
    	      // Empty
        }

        public Builder(DeblockResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.strength = defaults.strength;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder strength(Double strength) {
            this.strength = Objects.requireNonNull(strength);
            return this;
        }
        public DeblockResponse build() {
            return new DeblockResponse(enabled, strength);
        }
    }
}
