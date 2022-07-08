// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.HttpFaultAbortResponse;
import com.pulumi.googlenative.compute.beta.outputs.HttpFaultDelayResponse;
import java.util.Objects;

@CustomType
public final class HttpFaultInjectionResponse {
    /**
     * @return The specification for how client requests are aborted as part of fault injection.
     * 
     */
    private final HttpFaultAbortResponse abort;
    /**
     * @return The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * 
     */
    private final HttpFaultDelayResponse delay;

    @CustomType.Constructor
    private HttpFaultInjectionResponse(
        @CustomType.Parameter("abort") HttpFaultAbortResponse abort,
        @CustomType.Parameter("delay") HttpFaultDelayResponse delay) {
        this.abort = abort;
        this.delay = delay;
    }

    /**
     * @return The specification for how client requests are aborted as part of fault injection.
     * 
     */
    public HttpFaultAbortResponse abort() {
        return this.abort;
    }
    /**
     * @return The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * 
     */
    public HttpFaultDelayResponse delay() {
        return this.delay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultInjectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpFaultAbortResponse abort;
        private HttpFaultDelayResponse delay;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultInjectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(HttpFaultAbortResponse abort) {
            this.abort = Objects.requireNonNull(abort);
            return this;
        }
        public Builder delay(HttpFaultDelayResponse delay) {
            this.delay = Objects.requireNonNull(delay);
            return this;
        }        public HttpFaultInjectionResponse build() {
            return new HttpFaultInjectionResponse(abort, delay);
        }
    }
}
