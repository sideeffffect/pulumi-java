// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.outputs;

import io.pulumi.azurenative.orbital.outputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AvailableContactsResponse {
    /**
     * Azimuth of the antenna at the end of the contact in decimal degrees.
     * 
     */
    private final Double endAzimuthDegrees;
    /**
     * Spacecraft elevation above the horizon at contact end.
     * 
     */
    private final Double endElevationDegrees;
    /**
     * Name of Azure Ground Station.
     * 
     */
    private final String groundStationName;
    /**
     * Maximum elevation of the antenna during the contact in decimal degrees.
     * 
     */
    private final Double maximumElevationDegrees;
    /**
     * Time to lost receiving a signal.
     * 
     */
    private final String rxEndTime;
    /**
     * Earliest time to receive a signal.
     * 
     */
    private final String rxStartTime;
    /**
     * The reference to the spacecraft resource.
     * 
     */
    private final @Nullable ResourceReferenceResponse spacecraft;
    /**
     * Azimuth of the antenna at the start of the contact in decimal degrees.
     * 
     */
    private final Double startAzimuthDegrees;
    /**
     * Spacecraft elevation above the horizon at contact start.
     * 
     */
    private final Double startElevationDegrees;
    /**
     * Time at which antenna transmit will be disabled.
     * 
     */
    private final String txEndTime;
    /**
     * Time at which antenna transmit will be enabled.
     * 
     */
    private final String txStartTime;

    @OutputCustomType.Constructor
    private AvailableContactsResponse(
        @OutputCustomType.Parameter("endAzimuthDegrees") Double endAzimuthDegrees,
        @OutputCustomType.Parameter("endElevationDegrees") Double endElevationDegrees,
        @OutputCustomType.Parameter("groundStationName") String groundStationName,
        @OutputCustomType.Parameter("maximumElevationDegrees") Double maximumElevationDegrees,
        @OutputCustomType.Parameter("rxEndTime") String rxEndTime,
        @OutputCustomType.Parameter("rxStartTime") String rxStartTime,
        @OutputCustomType.Parameter("spacecraft") @Nullable ResourceReferenceResponse spacecraft,
        @OutputCustomType.Parameter("startAzimuthDegrees") Double startAzimuthDegrees,
        @OutputCustomType.Parameter("startElevationDegrees") Double startElevationDegrees,
        @OutputCustomType.Parameter("txEndTime") String txEndTime,
        @OutputCustomType.Parameter("txStartTime") String txStartTime) {
        this.endAzimuthDegrees = endAzimuthDegrees;
        this.endElevationDegrees = endElevationDegrees;
        this.groundStationName = groundStationName;
        this.maximumElevationDegrees = maximumElevationDegrees;
        this.rxEndTime = rxEndTime;
        this.rxStartTime = rxStartTime;
        this.spacecraft = spacecraft;
        this.startAzimuthDegrees = startAzimuthDegrees;
        this.startElevationDegrees = startElevationDegrees;
        this.txEndTime = txEndTime;
        this.txStartTime = txStartTime;
    }

    /**
     * Azimuth of the antenna at the end of the contact in decimal degrees.
     * 
    */
    public Double getEndAzimuthDegrees() {
        return this.endAzimuthDegrees;
    }
    /**
     * Spacecraft elevation above the horizon at contact end.
     * 
    */
    public Double getEndElevationDegrees() {
        return this.endElevationDegrees;
    }
    /**
     * Name of Azure Ground Station.
     * 
    */
    public String getGroundStationName() {
        return this.groundStationName;
    }
    /**
     * Maximum elevation of the antenna during the contact in decimal degrees.
     * 
    */
    public Double getMaximumElevationDegrees() {
        return this.maximumElevationDegrees;
    }
    /**
     * Time to lost receiving a signal.
     * 
    */
    public String getRxEndTime() {
        return this.rxEndTime;
    }
    /**
     * Earliest time to receive a signal.
     * 
    */
    public String getRxStartTime() {
        return this.rxStartTime;
    }
    /**
     * The reference to the spacecraft resource.
     * 
    */
    public Optional<ResourceReferenceResponse> getSpacecraft() {
        return Optional.ofNullable(this.spacecraft);
    }
    /**
     * Azimuth of the antenna at the start of the contact in decimal degrees.
     * 
    */
    public Double getStartAzimuthDegrees() {
        return this.startAzimuthDegrees;
    }
    /**
     * Spacecraft elevation above the horizon at contact start.
     * 
    */
    public Double getStartElevationDegrees() {
        return this.startElevationDegrees;
    }
    /**
     * Time at which antenna transmit will be disabled.
     * 
    */
    public String getTxEndTime() {
        return this.txEndTime;
    }
    /**
     * Time at which antenna transmit will be enabled.
     * 
    */
    public String getTxStartTime() {
        return this.txStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailableContactsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double endAzimuthDegrees;
        private Double endElevationDegrees;
        private String groundStationName;
        private Double maximumElevationDegrees;
        private String rxEndTime;
        private String rxStartTime;
        private @Nullable ResourceReferenceResponse spacecraft;
        private Double startAzimuthDegrees;
        private Double startElevationDegrees;
        private String txEndTime;
        private String txStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailableContactsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endAzimuthDegrees = defaults.endAzimuthDegrees;
    	      this.endElevationDegrees = defaults.endElevationDegrees;
    	      this.groundStationName = defaults.groundStationName;
    	      this.maximumElevationDegrees = defaults.maximumElevationDegrees;
    	      this.rxEndTime = defaults.rxEndTime;
    	      this.rxStartTime = defaults.rxStartTime;
    	      this.spacecraft = defaults.spacecraft;
    	      this.startAzimuthDegrees = defaults.startAzimuthDegrees;
    	      this.startElevationDegrees = defaults.startElevationDegrees;
    	      this.txEndTime = defaults.txEndTime;
    	      this.txStartTime = defaults.txStartTime;
        }

        public Builder endAzimuthDegrees(Double endAzimuthDegrees) {
            this.endAzimuthDegrees = Objects.requireNonNull(endAzimuthDegrees);
            return this;
        }

        public Builder endElevationDegrees(Double endElevationDegrees) {
            this.endElevationDegrees = Objects.requireNonNull(endElevationDegrees);
            return this;
        }

        public Builder groundStationName(String groundStationName) {
            this.groundStationName = Objects.requireNonNull(groundStationName);
            return this;
        }

        public Builder maximumElevationDegrees(Double maximumElevationDegrees) {
            this.maximumElevationDegrees = Objects.requireNonNull(maximumElevationDegrees);
            return this;
        }

        public Builder rxEndTime(String rxEndTime) {
            this.rxEndTime = Objects.requireNonNull(rxEndTime);
            return this;
        }

        public Builder rxStartTime(String rxStartTime) {
            this.rxStartTime = Objects.requireNonNull(rxStartTime);
            return this;
        }

        public Builder spacecraft(@Nullable ResourceReferenceResponse spacecraft) {
            this.spacecraft = spacecraft;
            return this;
        }

        public Builder startAzimuthDegrees(Double startAzimuthDegrees) {
            this.startAzimuthDegrees = Objects.requireNonNull(startAzimuthDegrees);
            return this;
        }

        public Builder startElevationDegrees(Double startElevationDegrees) {
            this.startElevationDegrees = Objects.requireNonNull(startElevationDegrees);
            return this;
        }

        public Builder txEndTime(String txEndTime) {
            this.txEndTime = Objects.requireNonNull(txEndTime);
            return this;
        }

        public Builder txStartTime(String txStartTime) {
            this.txStartTime = Objects.requireNonNull(txStartTime);
            return this;
        }
        public AvailableContactsResponse build() {
            return new AvailableContactsResponse(endAzimuthDegrees, endElevationDegrees, groundStationName, maximumElevationDegrees, rxEndTime, rxStartTime, spacecraft, startAzimuthDegrees, startElevationDegrees, txEndTime, txStartTime);
        }
    }
}
