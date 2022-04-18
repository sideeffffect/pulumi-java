// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NetworkPerformanceConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkPerformanceConfigResponse Empty = new NetworkPerformanceConfigResponse();

    @Import(name="totalEgressBandwidthTier", required=true)
      private final String totalEgressBandwidthTier;

    public String totalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public NetworkPerformanceConfigResponse(String totalEgressBandwidthTier) {
        this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier, "expected parameter 'totalEgressBandwidthTier' to be non-null");
    }

    private NetworkPerformanceConfigResponse() {
        this.totalEgressBandwidthTier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPerformanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPerformanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }        public NetworkPerformanceConfigResponse build() {
            return new NetworkPerformanceConfigResponse(totalEgressBandwidthTier);
        }
    }
}
