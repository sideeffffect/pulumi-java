// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationInsightsComponentDataVolumeCapResponse {
    /**
     * Daily data volume cap in GB.
     * 
     */
    private final @Nullable Double cap;
    /**
     * Maximum daily data volume cap that the user can set for this component.
     * 
     */
    private final Double maxHistoryCap;
    /**
     * Daily data volume cap UTC reset hour.
     * 
     */
    private final Integer resetTime;
    /**
     * Do not send a notification email when the daily data volume cap is met.
     * 
     */
    private final @Nullable Boolean stopSendNotificationWhenHitCap;
    /**
     * Reserved, not used for now.
     * 
     */
    private final @Nullable Boolean stopSendNotificationWhenHitThreshold;
    /**
     * Reserved, not used for now.
     * 
     */
    private final @Nullable Integer warningThreshold;

    @CustomType.Constructor
    private ApplicationInsightsComponentDataVolumeCapResponse(
        @CustomType.Parameter("cap") @Nullable Double cap,
        @CustomType.Parameter("maxHistoryCap") Double maxHistoryCap,
        @CustomType.Parameter("resetTime") Integer resetTime,
        @CustomType.Parameter("stopSendNotificationWhenHitCap") @Nullable Boolean stopSendNotificationWhenHitCap,
        @CustomType.Parameter("stopSendNotificationWhenHitThreshold") @Nullable Boolean stopSendNotificationWhenHitThreshold,
        @CustomType.Parameter("warningThreshold") @Nullable Integer warningThreshold) {
        this.cap = cap;
        this.maxHistoryCap = maxHistoryCap;
        this.resetTime = resetTime;
        this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
        this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
        this.warningThreshold = warningThreshold;
    }

    /**
     * Daily data volume cap in GB.
     * 
    */
    public Optional<Double> cap() {
        return Optional.ofNullable(this.cap);
    }
    /**
     * Maximum daily data volume cap that the user can set for this component.
     * 
    */
    public Double maxHistoryCap() {
        return this.maxHistoryCap;
    }
    /**
     * Daily data volume cap UTC reset hour.
     * 
    */
    public Integer resetTime() {
        return this.resetTime;
    }
    /**
     * Do not send a notification email when the daily data volume cap is met.
     * 
    */
    public Optional<Boolean> stopSendNotificationWhenHitCap() {
        return Optional.ofNullable(this.stopSendNotificationWhenHitCap);
    }
    /**
     * Reserved, not used for now.
     * 
    */
    public Optional<Boolean> stopSendNotificationWhenHitThreshold() {
        return Optional.ofNullable(this.stopSendNotificationWhenHitThreshold);
    }
    /**
     * Reserved, not used for now.
     * 
    */
    public Optional<Integer> warningThreshold() {
        return Optional.ofNullable(this.warningThreshold);
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
