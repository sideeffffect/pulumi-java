// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ChartOptionsResponse {
    /**
     * The chart mode.
     * 
     */
    private final String mode;

    @CustomType.Constructor
    private ChartOptionsResponse(@CustomType.Parameter("mode") String mode) {
        this.mode = mode;
    }

    /**
     * The chart mode.
     * 
    */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChartOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ChartOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }        public ChartOptionsResponse build() {
            return new ChartOptionsResponse(mode);
        }
    }
}
