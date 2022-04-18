// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureADMetricsPropertiesFormatResponse {
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private AzureADMetricsPropertiesFormatResponse(@CustomType.Parameter("provisioningState") String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * The provisioning state of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureADMetricsPropertiesFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureADMetricsPropertiesFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public AzureADMetricsPropertiesFormatResponse build() {
            return new AzureADMetricsPropertiesFormatResponse(provisioningState);
        }
    }
}
