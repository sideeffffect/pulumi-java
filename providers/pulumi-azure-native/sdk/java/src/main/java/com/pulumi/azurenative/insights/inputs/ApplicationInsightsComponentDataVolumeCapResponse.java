// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Application Insights component daily data volume cap
 * 
 */
public final class ApplicationInsightsComponentDataVolumeCapResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationInsightsComponentDataVolumeCapResponse Empty = new ApplicationInsightsComponentDataVolumeCapResponse();

    /**
     * Daily data volume cap in GB.
     * 
     */
    @Import(name="cap")
      private final @Nullable Double cap;

    public Optional<Double> cap() {
        return this.cap == null ? Optional.empty() : Optional.ofNullable(this.cap);
    }

    /**
     * Maximum daily data volume cap that the user can set for this component.
     * 
     */
    @Import(name="maxHistoryCap", required=true)
      private final Double maxHistoryCap;

    public Double maxHistoryCap() {
        return this.maxHistoryCap;
    }

    /**
     * Daily data volume cap UTC reset hour.
     * 
     */
    @Import(name="resetTime", required=true)
      private final Integer resetTime;

    public Integer resetTime() {
        return this.resetTime;
    }

    /**
     * Do not send a notification email when the daily data volume cap is met.
     * 
     */
    @Import(name="stopSendNotificationWhenHitCap")
      private final @Nullable Boolean stopSendNotificationWhenHitCap;

    public Optional<Boolean> stopSendNotificationWhenHitCap() {
        return this.stopSendNotificationWhenHitCap == null ? Optional.empty() : Optional.ofNullable(this.stopSendNotificationWhenHitCap);
    }

    /**
     * Reserved, not used for now.
     * 
     */
    @Import(name="stopSendNotificationWhenHitThreshold")
      private final @Nullable Boolean stopSendNotificationWhenHitThreshold;

    public Optional<Boolean> stopSendNotificationWhenHitThreshold() {
        return this.stopSendNotificationWhenHitThreshold == null ? Optional.empty() : Optional.ofNullable(this.stopSendNotificationWhenHitThreshold);
    }

    /**
     * Reserved, not used for now.
     * 
     */
    @Import(name="warningThreshold")
      private final @Nullable Integer warningThreshold;

    public Optional<Integer> warningThreshold() {
        return this.warningThreshold == null ? Optional.empty() : Optional.ofNullable(this.warningThreshold);
    }

    public ApplicationInsightsComponentDataVolumeCapResponse(
        @Nullable Double cap,
        Double maxHistoryCap,
        Integer resetTime,
        @Nullable Boolean stopSendNotificationWhenHitCap,
        @Nullable Boolean stopSendNotificationWhenHitThreshold,
        @Nullable Integer warningThreshold) {
        this.cap = cap;
        this.maxHistoryCap = Objects.requireNonNull(maxHistoryCap, "expected parameter 'maxHistoryCap' to be non-null");
        this.resetTime = Objects.requireNonNull(resetTime, "expected parameter 'resetTime' to be non-null");
        this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
        this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
        this.warningThreshold = warningThreshold;
    }

    private ApplicationInsightsComponentDataVolumeCapResponse() {
        this.cap = null;
        this.maxHistoryCap = null;
        this.resetTime = null;
        this.stopSendNotificationWhenHitCap = null;
        this.stopSendNotificationWhenHitThreshold = null;
        this.warningThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentDataVolumeCapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cap;
        private Double maxHistoryCap;
        private Integer resetTime;
        private @Nullable Boolean stopSendNotificationWhenHitCap;
        private @Nullable Boolean stopSendNotificationWhenHitThreshold;
        private @Nullable Integer warningThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInsightsComponentDataVolumeCapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cap = defaults.cap;
    	      this.maxHistoryCap = defaults.maxHistoryCap;
    	      this.resetTime = defaults.resetTime;
    	      this.stopSendNotificationWhenHitCap = defaults.stopSendNotificationWhenHitCap;
    	      this.stopSendNotificationWhenHitThreshold = defaults.stopSendNotificationWhenHitThreshold;
    	      this.warningThreshold = defaults.warningThreshold;
        }

        public Builder cap(@Nullable Double cap) {
            this.cap = cap;
            return this;
        }
        public Builder maxHistoryCap(Double maxHistoryCap) {
            this.maxHistoryCap = Objects.requireNonNull(maxHistoryCap);
            return this;
        }
        public Builder resetTime(Integer resetTime) {
            this.resetTime = Objects.requireNonNull(resetTime);
            return this;
        }
        public Builder stopSendNotificationWhenHitCap(@Nullable Boolean stopSendNotificationWhenHitCap) {
            this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
            return this;
        }
        public Builder stopSendNotificationWhenHitThreshold(@Nullable Boolean stopSendNotificationWhenHitThreshold) {
            this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
            return this;
        }
        public Builder warningThreshold(@Nullable Integer warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }        public ApplicationInsightsComponentDataVolumeCapResponse build() {
            return new ApplicationInsightsComponentDataVolumeCapResponse(cap, maxHistoryCap, resetTime, stopSendNotificationWhenHitCap, stopSendNotificationWhenHitThreshold, warningThreshold);
        }
    }
}
