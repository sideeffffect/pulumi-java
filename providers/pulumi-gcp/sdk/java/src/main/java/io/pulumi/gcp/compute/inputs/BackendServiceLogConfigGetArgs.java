// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceLogConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceLogConfigGetArgs Empty = new BackendServiceLogConfigGetArgs();

    /**
     * Whether to enable logging for the load balancer traffic served by this backend service.
     * 
     */
    @InputImport(name="enable")
      private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * This field can only be specified if logging is enabled for this backend service. The value of
     * the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer
     * where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported.
     * The default value is 1.0.
     * 
     */
    @InputImport(name="sampleRate")
      private final @Nullable Input<Double> sampleRate;

    public Input<Double> getSampleRate() {
        return this.sampleRate == null ? Input.empty() : this.sampleRate;
    }

    public BackendServiceLogConfigGetArgs(
        @Nullable Input<Boolean> enable,
        @Nullable Input<Double> sampleRate) {
        this.enable = enable;
        this.sampleRate = sampleRate;
    }

    private BackendServiceLogConfigGetArgs() {
        this.enable = Input.empty();
        this.sampleRate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<Double> sampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceLogConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.sampleRate = defaults.sampleRate;
        }

        public Builder enable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder enable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder sampleRate(@Nullable Input<Double> sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public Builder sampleRate(@Nullable Double sampleRate) {
            this.sampleRate = Input.ofNullable(sampleRate);
            return this;
        }
        public BackendServiceLogConfigGetArgs build() {
            return new BackendServiceLogConfigGetArgs(enable, sampleRate);
        }
    }
}
