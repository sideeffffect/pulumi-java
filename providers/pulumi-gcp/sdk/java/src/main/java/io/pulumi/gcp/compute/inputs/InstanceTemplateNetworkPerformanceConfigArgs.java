// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InstanceTemplateNetworkPerformanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateNetworkPerformanceConfigArgs Empty = new InstanceTemplateNetworkPerformanceConfigArgs();

    /**
     * The egress bandwidth tier to enable. Possible values: TIER_1, DEFAULT
     * 
     */
    @InputImport(name="totalEgressBandwidthTier", required=true)
      private final Input<String> totalEgressBandwidthTier;

    public Input<String> getTotalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public InstanceTemplateNetworkPerformanceConfigArgs(Input<String> totalEgressBandwidthTier) {
        this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier, "expected parameter 'totalEgressBandwidthTier' to be non-null");
    }

    private InstanceTemplateNetworkPerformanceConfigArgs() {
        this.totalEgressBandwidthTier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkPerformanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkPerformanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder totalEgressBandwidthTier(Input<String> totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }

        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Input.of(Objects.requireNonNull(totalEgressBandwidthTier));
            return this;
        }
        public InstanceTemplateNetworkPerformanceConfigArgs build() {
            return new InstanceTemplateNetworkPerformanceConfigArgs(totalEgressBandwidthTier);
        }
    }
}
