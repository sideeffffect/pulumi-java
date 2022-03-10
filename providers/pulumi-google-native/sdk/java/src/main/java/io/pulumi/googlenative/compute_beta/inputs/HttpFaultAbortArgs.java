// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification for how requests are aborted as part of fault injection.
 * 
 */
public final class HttpFaultAbortArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpFaultAbortArgs Empty = new HttpFaultAbortArgs();

    /**
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * 
     */
    @InputImport(name="httpStatus")
      private final @Nullable Input<Integer> httpStatus;

    public Input<Integer> getHttpStatus() {
        return this.httpStatus == null ? Input.empty() : this.httpStatus;
    }

    /**
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    @InputImport(name="percentage")
      private final @Nullable Input<Double> percentage;

    public Input<Double> getPercentage() {
        return this.percentage == null ? Input.empty() : this.percentage;
    }

    public HttpFaultAbortArgs(
        @Nullable Input<Integer> httpStatus,
        @Nullable Input<Double> percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    private HttpFaultAbortArgs() {
        this.httpStatus = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultAbortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> httpStatus;
        private @Nullable Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultAbortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder httpStatus(@Nullable Input<Integer> httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public Builder httpStatus(@Nullable Integer httpStatus) {
            this.httpStatus = Input.ofNullable(httpStatus);
            return this;
        }

        public Builder percentage(@Nullable Input<Double> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder percentage(@Nullable Double percentage) {
            this.percentage = Input.ofNullable(percentage);
            return this;
        }
        public HttpFaultAbortArgs build() {
            return new HttpFaultAbortArgs(httpStatus, percentage);
        }
    }
}
