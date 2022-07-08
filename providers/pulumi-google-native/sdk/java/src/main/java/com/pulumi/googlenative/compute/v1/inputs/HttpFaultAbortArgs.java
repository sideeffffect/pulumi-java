// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification for how requests are aborted as part of fault injection.
 * 
 */
public final class HttpFaultAbortArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpFaultAbortArgs Empty = new HttpFaultAbortArgs();

    /**
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * 
     */
    @Import(name="httpStatus")
    private @Nullable Output<Integer> httpStatus;

    /**
     * @return The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * 
     */
    public Optional<Output<Integer>> httpStatus() {
        return Optional.ofNullable(this.httpStatus);
    }

    /**
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
    private @Nullable Output<Double> percentage;

    /**
     * @return The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    public Optional<Output<Double>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    private HttpFaultAbortArgs() {}

    private HttpFaultAbortArgs(HttpFaultAbortArgs $) {
        this.httpStatus = $.httpStatus;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpFaultAbortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpFaultAbortArgs $;

        public Builder() {
            $ = new HttpFaultAbortArgs();
        }

        public Builder(HttpFaultAbortArgs defaults) {
            $ = new HttpFaultAbortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpStatus The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
         * 
         * @return builder
         * 
         */
        public Builder httpStatus(@Nullable Output<Integer> httpStatus) {
            $.httpStatus = httpStatus;
            return this;
        }

        /**
         * @param httpStatus The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
         * 
         * @return builder
         * 
         */
        public Builder httpStatus(Integer httpStatus) {
            return httpStatus(Output.of(httpStatus));
        }

        /**
         * @param percentage The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder percentage(@Nullable Output<Double> percentage) {
            $.percentage = percentage;
            return this;
        }

        /**
         * @param percentage The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder percentage(Double percentage) {
            return percentage(Output.of(percentage));
        }

        public HttpFaultAbortArgs build() {
            return $;
        }
    }

}
