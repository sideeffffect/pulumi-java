// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A set of Confidential Instance options.
 * 
 */
public final class ConfidentialInstanceConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfidentialInstanceConfigResponse Empty = new ConfidentialInstanceConfigResponse();

    /**
     * Defines whether the instance should have confidential compute enabled.
     * 
     */
    @Import(name="enableConfidentialCompute", required=true)
      private final Boolean enableConfidentialCompute;

    public Boolean enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public ConfidentialInstanceConfigResponse(Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
    }

    private ConfidentialInstanceConfigResponse() {
        this.enableConfidentialCompute = null;
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
