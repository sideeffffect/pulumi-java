// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;


public final class GetBackendServiceLogConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetBackendServiceLogConfig Empty = new GetBackendServiceLogConfig();

    @InputImport(name="enable", required=true)
      private final Boolean enable;

    public Boolean getEnable() {
        return this.enable;
    }

    @InputImport(name="sampleRate", required=true)
      private final Double sampleRate;

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public GetBackendServiceLogConfig(
        Boolean enable,
        Double sampleRate) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.sampleRate = Objects.requireNonNull(sampleRate, "expected parameter 'sampleRate' to be non-null");
    }

    private GetBackendServiceLogConfig() {
        this.enable = null;
        this.sampleRate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private Double sampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.sampleRate = defaults.sampleRate;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder sampleRate(Double sampleRate) {
            this.sampleRate = Objects.requireNonNull(sampleRate);
            return this;
        }
        public GetBackendServiceLogConfig build() {
            return new GetBackendServiceLogConfig(enable, sampleRate);
        }
    }
}
