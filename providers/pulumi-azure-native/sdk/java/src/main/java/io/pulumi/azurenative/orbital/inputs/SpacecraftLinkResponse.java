// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Spacecraft Link
 * 
 */
public final class SpacecraftLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final SpacecraftLinkResponse Empty = new SpacecraftLinkResponse();

    /**
     * Bandwidth in MHz
     * 
     */
    @InputImport(name="bandwidthMHz", required=true)
      private final Double bandwidthMHz;

    public Double getBandwidthMHz() {
        return this.bandwidthMHz;
    }

    /**
     * Center Frequency in MHz
     * 
     */
    @InputImport(name="centerFrequencyMHz", required=true)
      private final Double centerFrequencyMHz;

    public Double getCenterFrequencyMHz() {
        return this.centerFrequencyMHz;
    }

    /**
     * Direction (uplink or downlink)
     * 
     */
    @InputImport(name="direction", required=true)
      private final String direction;

    public String getDirection() {
        return this.direction;
    }

    /**
     * polarization. eg (RHCP, LHCP)
     * 
     */
    @InputImport(name="polarization", required=true)
      private final String polarization;

    public String getPolarization() {
        return this.polarization;
    }

    public SpacecraftLinkResponse(
        Double bandwidthMHz,
        Double centerFrequencyMHz,
        String direction,
        String polarization) {
        this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz, "expected parameter 'bandwidthMHz' to be non-null");
        this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz, "expected parameter 'centerFrequencyMHz' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.polarization = Objects.requireNonNull(polarization, "expected parameter 'polarization' to be non-null");
    }

    private SpacecraftLinkResponse() {
        this.bandwidthMHz = null;
        this.centerFrequencyMHz = null;
        this.direction = null;
        this.polarization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpacecraftLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double bandwidthMHz;
        private Double centerFrequencyMHz;
        private String direction;
        private String polarization;

        public Builder() {
    	      // Empty
        }

        public Builder(SpacecraftLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthMHz = defaults.bandwidthMHz;
    	      this.centerFrequencyMHz = defaults.centerFrequencyMHz;
    	      this.direction = defaults.direction;
    	      this.polarization = defaults.polarization;
        }

        public Builder bandwidthMHz(Double bandwidthMHz) {
            this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz);
            return this;
        }

        public Builder centerFrequencyMHz(Double centerFrequencyMHz) {
            this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz);
            return this;
        }

        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder polarization(String polarization) {
            this.polarization = Objects.requireNonNull(polarization);
            return this;
        }
        public SpacecraftLinkResponse build() {
            return new SpacecraftLinkResponse(bandwidthMHz, centerFrequencyMHz, direction, polarization);
        }
    }
}
