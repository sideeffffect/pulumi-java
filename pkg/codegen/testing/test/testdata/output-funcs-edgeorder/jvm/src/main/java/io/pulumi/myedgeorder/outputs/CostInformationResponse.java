// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.myedgeorder.outputs.BillingMeterDetailsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CostInformationResponse {
    /**
     * Default url to display billing information
     * 
     */
    private final String billingInfoUrl;
    /**
     * Details on the various billing aspects for the product system.
     * 
     */
    private final List<BillingMeterDetailsResponse> billingMeterDetails;

    @OutputCustomType.Constructor({"billingInfoUrl","billingMeterDetails"})
    private CostInformationResponse(
        String billingInfoUrl,
        List<BillingMeterDetailsResponse> billingMeterDetails) {
        this.billingInfoUrl = Objects.requireNonNull(billingInfoUrl);
        this.billingMeterDetails = Objects.requireNonNull(billingMeterDetails);
    }

    /**
     * Default url to display billing information
     * 
     */
    public String getBillingInfoUrl() {
        return this.billingInfoUrl;
    }
    /**
     * Details on the various billing aspects for the product system.
     * 
     */
    public List<BillingMeterDetailsResponse> getBillingMeterDetails() {
        return this.billingMeterDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingInfoUrl;
        private List<BillingMeterDetailsResponse> billingMeterDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(CostInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingInfoUrl = defaults.billingInfoUrl;
    	      this.billingMeterDetails = defaults.billingMeterDetails;
        }

        public Builder setBillingInfoUrl(String billingInfoUrl) {
            this.billingInfoUrl = Objects.requireNonNull(billingInfoUrl);
            return this;
        }

        public Builder setBillingMeterDetails(List<BillingMeterDetailsResponse> billingMeterDetails) {
            this.billingMeterDetails = Objects.requireNonNull(billingMeterDetails);
            return this;
        }

        public CostInformationResponse build() {
            return new CostInformationResponse(billingInfoUrl, billingMeterDetails);
        }
    }
}
