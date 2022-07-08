// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplianceClusterResponse {
    /**
     * @return Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * 
     */
    private final String resourceLink;

    @CustomType.Constructor
    private ApplianceClusterResponse(@CustomType.Parameter("resourceLink") String resourceLink) {
        this.resourceLink = resourceLink;
    }

    /**
     * @return Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * 
     */
    public String resourceLink() {
        return this.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplianceClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }        public ApplianceClusterResponse build() {
            return new ApplianceClusterResponse(resourceLink);
        }
    }
}
