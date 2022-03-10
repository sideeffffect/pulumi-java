// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PackageShippingDetailsResponse {
    /**
     * Name of the carrier.
     * 
     */
    private final String carrierName;
    /**
     * Tracking Id of shipment.
     * 
     */
    private final String trackingId;
    /**
     * Url where shipment can be tracked.
     * 
     */
    private final String trackingUrl;

    @OutputCustomType.Constructor
    private PackageShippingDetailsResponse(
        @OutputCustomType.Parameter("carrierName") String carrierName,
        @OutputCustomType.Parameter("trackingId") String trackingId,
        @OutputCustomType.Parameter("trackingUrl") String trackingUrl) {
        this.carrierName = carrierName;
        this.trackingId = trackingId;
        this.trackingUrl = trackingUrl;
    }

    /**
     * Name of the carrier.
     * 
    */
    public String getCarrierName() {
        return this.carrierName;
    }
    /**
     * Tracking Id of shipment.
     * 
    */
    public String getTrackingId() {
        return this.trackingId;
    }
    /**
     * Url where shipment can be tracked.
     * 
    */
    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageShippingDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierName;
        private String trackingId;
        private String trackingUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageShippingDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.trackingId = defaults.trackingId;
    	      this.trackingUrl = defaults.trackingUrl;
        }

        public Builder carrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }

        public Builder trackingId(String trackingId) {
            this.trackingId = Objects.requireNonNull(trackingId);
            return this;
        }

        public Builder trackingUrl(String trackingUrl) {
            this.trackingUrl = Objects.requireNonNull(trackingUrl);
            return this;
        }
        public PackageShippingDetailsResponse build() {
            return new PackageShippingDetailsResponse(carrierName, trackingId, trackingUrl);
        }
    }
}
