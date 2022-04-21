// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the threshold for declaring a test successful.
 * 
 */
public final class ConnectionMonitorSuccessThresholdResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorSuccessThresholdResponse Empty = new ConnectionMonitorSuccessThresholdResponse();

    /**
     * The maximum percentage of failed checks permitted for a test to evaluate as successful.
     * 
     */
    @Import(name="checksFailedPercent")
    private @Nullable Integer checksFailedPercent;

    public Optional<Integer> checksFailedPercent() {
        return Optional.ofNullable(this.checksFailedPercent);
    }

    /**
     * The maximum round-trip time in milliseconds permitted for a test to evaluate as successful.
     * 
     */
    @Import(name="roundTripTimeMs")
    private @Nullable Double roundTripTimeMs;

    public Optional<Double> roundTripTimeMs() {
        return Optional.ofNullable(this.roundTripTimeMs);
    }

    private ConnectionMonitorSuccessThresholdResponse() {}

    private ConnectionMonitorSuccessThresholdResponse(ConnectionMonitorSuccessThresholdResponse $) {
        this.checksFailedPercent = $.checksFailedPercent;
        this.roundTripTimeMs = $.roundTripTimeMs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorSuccessThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorSuccessThresholdResponse $;

        public Builder() {
            $ = new ConnectionMonitorSuccessThresholdResponse();
        }

        public Builder(ConnectionMonitorSuccessThresholdResponse defaults) {
            $ = new ConnectionMonitorSuccessThresholdResponse(Objects.requireNonNull(defaults));
        }

        public Builder checksFailedPercent(@Nullable Integer checksFailedPercent) {
            $.checksFailedPercent = checksFailedPercent;
            return this;
        }

        public Builder roundTripTimeMs(@Nullable Double roundTripTimeMs) {
            $.roundTripTimeMs = roundTripTimeMs;
            return this;
        }

        public ConnectionMonitorSuccessThresholdResponse build() {
            return $;
        }
    }

}
