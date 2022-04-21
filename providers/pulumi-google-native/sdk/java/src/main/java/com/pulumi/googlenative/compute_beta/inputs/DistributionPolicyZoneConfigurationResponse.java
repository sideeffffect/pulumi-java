// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DistributionPolicyZoneConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DistributionPolicyZoneConfigurationResponse Empty = new DistributionPolicyZoneConfigurationResponse();

    /**
     * The URL of the zone. The zone must exist in the region where the managed instance group is located.
     * 
     */
    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private DistributionPolicyZoneConfigurationResponse() {}

    private DistributionPolicyZoneConfigurationResponse(DistributionPolicyZoneConfigurationResponse $) {
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionPolicyZoneConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionPolicyZoneConfigurationResponse $;

        public Builder() {
            $ = new DistributionPolicyZoneConfigurationResponse();
        }

        public Builder(DistributionPolicyZoneConfigurationResponse defaults) {
            $ = new DistributionPolicyZoneConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public DistributionPolicyZoneConfigurationResponse build() {
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
