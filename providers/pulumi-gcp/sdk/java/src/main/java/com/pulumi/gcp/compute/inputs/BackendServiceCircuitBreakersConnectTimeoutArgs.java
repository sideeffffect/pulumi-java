// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceCircuitBreakersConnectTimeoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceCircuitBreakersConnectTimeoutArgs Empty = new BackendServiceCircuitBreakersConnectTimeoutArgs();

    /**
     * Span of time that&#39;s a fraction of a second at nanosecond resolution. Durations
     * less than one second are represented with a 0 `seconds` field and a positive
     * `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @Import(name="nanos")
    private @Nullable Output<Integer> nanos;

    public Optional<Output<Integer>> nanos() {
        return Optional.ofNullable(this.nanos);
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000
     * inclusive.
     * 
     */
    @Import(name="seconds", required=true)
    private Output<Integer> seconds;

    public Output<Integer> seconds() {
        return this.seconds;
    }

    private BackendServiceCircuitBreakersConnectTimeoutArgs() {}

    private BackendServiceCircuitBreakersConnectTimeoutArgs(BackendServiceCircuitBreakersConnectTimeoutArgs $) {
        this.nanos = $.nanos;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceCircuitBreakersConnectTimeoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceCircuitBreakersConnectTimeoutArgs $;

        public Builder() {
            $ = new BackendServiceCircuitBreakersConnectTimeoutArgs();
        }

        public Builder(BackendServiceCircuitBreakersConnectTimeoutArgs defaults) {
            $ = new BackendServiceCircuitBreakersConnectTimeoutArgs(Objects.requireNonNull(defaults));
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            $.nanos = nanos;
            return this;
        }

        public Builder nanos(Integer nanos) {
            return nanos(Output.of(nanos));
        }

        public Builder seconds(Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public BackendServiceCircuitBreakersConnectTimeoutArgs build() {
            $.seconds = Objects.requireNonNull($.seconds, "expected parameter 'seconds' to be non-null");
            return $;
        }
    }

}
