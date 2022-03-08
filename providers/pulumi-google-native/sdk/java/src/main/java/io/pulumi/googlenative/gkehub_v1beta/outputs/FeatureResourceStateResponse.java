// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FeatureResourceStateResponse {
    /**
     * The current state of the Feature resource in the Hub API.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"state"})
    private FeatureResourceStateResponse(String state) {
        this.state = state;
    }

    /**
     * The current state of the Feature resource in the Hub API.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureResourceStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureResourceStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public FeatureResourceStateResponse build() {
            return new FeatureResourceStateResponse(state);
        }
    }
}
