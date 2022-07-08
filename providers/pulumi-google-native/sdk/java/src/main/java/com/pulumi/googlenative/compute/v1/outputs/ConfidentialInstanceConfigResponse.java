// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ConfidentialInstanceConfigResponse {
    /**
     * @return Defines whether the instance should have confidential compute enabled.
     * 
     */
    private final Boolean enableConfidentialCompute;

    @CustomType.Constructor
    private ConfidentialInstanceConfigResponse(@CustomType.Parameter("enableConfidentialCompute") Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = enableConfidentialCompute;
    }

    /**
     * @return Defines whether the instance should have confidential compute enabled.
     * 
     */
    public Boolean enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfidentialInstanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfidentialInstanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }        public ConfidentialInstanceConfigResponse build() {
            return new ConfidentialInstanceConfigResponse(enableConfidentialCompute);
        }
    }
}
