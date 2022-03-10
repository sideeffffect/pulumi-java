// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EndpointsResponse {
    /**
     * Endpoint for the HCX Cloud Manager
     * 
     */
    private final String hcxCloudManager;
    /**
     * Endpoint for the NSX-T Data Center manager
     * 
     */
    private final String nsxtManager;
    /**
     * Endpoint for Virtual Center Server Appliance
     * 
     */
    private final String vcsa;

    @OutputCustomType.Constructor
    private EndpointsResponse(
        @OutputCustomType.Parameter("hcxCloudManager") String hcxCloudManager,
        @OutputCustomType.Parameter("nsxtManager") String nsxtManager,
        @OutputCustomType.Parameter("vcsa") String vcsa) {
        this.hcxCloudManager = hcxCloudManager;
        this.nsxtManager = nsxtManager;
        this.vcsa = vcsa;
    }

    /**
     * Endpoint for the HCX Cloud Manager
     * 
    */
    public String getHcxCloudManager() {
        return this.hcxCloudManager;
    }
    /**
     * Endpoint for the NSX-T Data Center manager
     * 
    */
    public String getNsxtManager() {
        return this.nsxtManager;
    }
    /**
     * Endpoint for Virtual Center Server Appliance
     * 
    */
    public String getVcsa() {
        return this.vcsa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hcxCloudManager;
        private String nsxtManager;
        private String vcsa;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hcxCloudManager = defaults.hcxCloudManager;
    	      this.nsxtManager = defaults.nsxtManager;
    	      this.vcsa = defaults.vcsa;
        }

        public Builder hcxCloudManager(String hcxCloudManager) {
            this.hcxCloudManager = Objects.requireNonNull(hcxCloudManager);
            return this;
        }

        public Builder nsxtManager(String nsxtManager) {
            this.nsxtManager = Objects.requireNonNull(nsxtManager);
            return this;
        }

        public Builder vcsa(String vcsa) {
            this.vcsa = Objects.requireNonNull(vcsa);
            return this;
        }
        public EndpointsResponse build() {
            return new EndpointsResponse(hcxCloudManager, nsxtManager, vcsa);
        }
    }
}
