// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;


/**
 * The available logging options for the load balancer traffic served by this backend service.
 * 
 */
public final class BackendServiceLogConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackendServiceLogConfigResponse Empty = new BackendServiceLogConfigResponse();

    /**
     * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
     * 
     */
    @Import(name="enable", required=true)
    private Boolean enable;

    public Boolean enable() {
        return this.enable;
    }

    /**
     * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
     * 
     */
    @Import(name="sampleRate", required=true)
    private Double sampleRate;

    public Double sampleRate() {
        return this.sampleRate;
    }

    private BackendServiceLogConfigResponse() {}

    private BackendServiceLogConfigResponse(BackendServiceLogConfigResponse $) {
        this.enable = $.enable;
        this.sampleRate = $.sampleRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceLogConfigResponse $;

        public Builder() {
            $ = new BackendServiceLogConfigResponse();
        }

        public Builder(BackendServiceLogConfigResponse defaults) {
            $ = new BackendServiceLogConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder enable(Boolean enable) {
            $.enable = enable;
            return this;
        }

        public Builder sampleRate(Double sampleRate) {
            $.sampleRate = sampleRate;
            return this;
        }

        public BackendServiceLogConfigResponse build() {
            $.enable = Objects.requireNonNull($.enable, "expected parameter 'enable' to be non-null");
            $.sampleRate = Objects.requireNonNull($.sampleRate, "expected parameter 'sampleRate' to be non-null");
            return $;
        }
    }

}
