// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendServiceCircuitBreakersConnectTimeout {
    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations
     * less than one second are represented with a 0 `seconds` field and a positive
     * `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    private final @Nullable Integer nanos;
    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000
     * inclusive.
     * 
     */
    private final Integer seconds;

    @CustomType.Constructor
    private BackendServiceCircuitBreakersConnectTimeout(
        @CustomType.Parameter("nanos") @Nullable Integer nanos,
        @CustomType.Parameter("seconds") Integer seconds) {
        this.nanos = nanos;
        this.seconds = seconds;
    }

    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations
     * less than one second are represented with a 0 `seconds` field and a positive
     * `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
    */
    public Optional<Integer> nanos() {
        return Optional.ofNullable(this.nanos);
    }
    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000
     * inclusive.
     * 
    */
    public Integer seconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCircuitBreakersConnectTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer nanos;
        private Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCircuitBreakersConnectTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder seconds(Integer seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }        public BackendServiceCircuitBreakersConnectTimeout build() {
            return new BackendServiceCircuitBreakersConnectTimeout(nanos, seconds);
        }
    }
}
