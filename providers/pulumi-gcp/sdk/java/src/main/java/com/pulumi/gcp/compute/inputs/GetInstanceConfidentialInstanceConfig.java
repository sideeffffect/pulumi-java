// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetInstanceConfidentialInstanceConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceConfidentialInstanceConfig Empty = new GetInstanceConfidentialInstanceConfig();

    @Import(name="enableConfidentialCompute", required=true)
      private final Boolean enableConfidentialCompute;

    public Boolean enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public GetInstanceConfidentialInstanceConfig(Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
    }

    private GetInstanceConfidentialInstanceConfig() {
        this.enableConfidentialCompute = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceConfidentialInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceConfidentialInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }        public GetInstanceConfidentialInstanceConfig build() {
            return new GetInstanceConfidentialInstanceConfig(enableConfidentialCompute);
        }
    }
}
