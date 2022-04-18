// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class Uint128Response {
    private final String high;
    private final String low;

    @CustomType.Constructor
    private Uint128Response(
        @CustomType.Parameter("high") String high,
        @CustomType.Parameter("low") String low) {
        this.high = high;
        this.low = low;
    }

    public String high() {
        return this.high;
    }
    public String low() {
        return this.low;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Uint128Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String high;
        private String low;

        public Builder() {
    	      // Empty
        }

        public Builder(Uint128Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.high = defaults.high;
    	      this.low = defaults.low;
        }

        public Builder high(String high) {
            this.high = Objects.requireNonNull(high);
            return this;
        }
        public Builder low(String low) {
            this.low = Objects.requireNonNull(low);
            return this;
        }        public Uint128Response build() {
            return new Uint128Response(high, low);
        }
    }
}
