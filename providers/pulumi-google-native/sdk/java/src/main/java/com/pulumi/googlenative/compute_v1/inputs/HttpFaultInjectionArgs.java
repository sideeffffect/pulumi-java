// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.inputs.HttpFaultAbortArgs;
import com.pulumi.googlenative.compute_v1.inputs.HttpFaultDelayArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by the load balancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
 * 
 */
public final class HttpFaultInjectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpFaultInjectionArgs Empty = new HttpFaultInjectionArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * 
     */
    @Import(name="abort")
      private final @Nullable Output<HttpFaultAbortArgs> abort;

    public Output<HttpFaultAbortArgs> abort() {
        return this.abort == null ? Codegen.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * 
     */
    @Import(name="delay")
      private final @Nullable Output<HttpFaultDelayArgs> delay;

    public Output<HttpFaultDelayArgs> delay() {
        return this.delay == null ? Codegen.empty() : this.delay;
    }

    public HttpFaultInjectionArgs(
        @Nullable Output<HttpFaultAbortArgs> abort,
        @Nullable Output<HttpFaultDelayArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private HttpFaultInjectionArgs() {
        this.abort = Codegen.empty();
        this.delay = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultInjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HttpFaultAbortArgs> abort;
        private @Nullable Output<HttpFaultDelayArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultInjectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable Output<HttpFaultAbortArgs> abort) {
            this.abort = abort;
            return this;
        }
        public Builder abort(@Nullable HttpFaultAbortArgs abort) {
            this.abort = Codegen.ofNullable(abort);
            return this;
        }
        public Builder delay(@Nullable Output<HttpFaultDelayArgs> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable HttpFaultDelayArgs delay) {
            this.delay = Codegen.ofNullable(delay);
            return this;
        }        public HttpFaultInjectionArgs build() {
            return new HttpFaultInjectionArgs(abort, delay);
        }
    }
}
