// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.GetClusterResourceUsageExportConfigBigqueryDestination;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


public final class GetClusterResourceUsageExportConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterResourceUsageExportConfig Empty = new GetClusterResourceUsageExportConfig();

    @InputImport(name="bigqueryDestinations", required=true)
      private final List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations;

    public List<GetClusterResourceUsageExportConfigBigqueryDestination> getBigqueryDestinations() {
        return this.bigqueryDestinations;
    }

    @InputImport(name="enableNetworkEgressMetering", required=true)
      private final Boolean enableNetworkEgressMetering;

    public Boolean getEnableNetworkEgressMetering() {
        return this.enableNetworkEgressMetering;
    }

    @InputImport(name="enableResourceConsumptionMetering", required=true)
      private final Boolean enableResourceConsumptionMetering;

    public Boolean getEnableResourceConsumptionMetering() {
        return this.enableResourceConsumptionMetering;
    }

    public GetClusterResourceUsageExportConfig(
        List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations,
        Boolean enableNetworkEgressMetering,
        Boolean enableResourceConsumptionMetering) {
        this.bigqueryDestinations = Objects.requireNonNull(bigqueryDestinations, "expected parameter 'bigqueryDestinations' to be non-null");
        this.enableNetworkEgressMetering = Objects.requireNonNull(enableNetworkEgressMetering, "expected parameter 'enableNetworkEgressMetering' to be non-null");
        this.enableResourceConsumptionMetering = Objects.requireNonNull(enableResourceConsumptionMetering, "expected parameter 'enableResourceConsumptionMetering' to be non-null");
    }

    private GetClusterResourceUsageExportConfig() {
        this.bigqueryDestinations = List.of();
        this.enableNetworkEgressMetering = null;
        this.enableResourceConsumptionMetering = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResourceUsageExportConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations;
        private Boolean enableNetworkEgressMetering;
        private Boolean enableResourceConsumptionMetering;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResourceUsageExportConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestinations = defaults.bigqueryDestinations;
    	      this.enableNetworkEgressMetering = defaults.enableNetworkEgressMetering;
    	      this.enableResourceConsumptionMetering = defaults.enableResourceConsumptionMetering;
        }

        public Builder bigqueryDestinations(List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations) {
            this.bigqueryDestinations = Objects.requireNonNull(bigqueryDestinations);
            return this;
        }

        public Builder enableNetworkEgressMetering(Boolean enableNetworkEgressMetering) {
            this.enableNetworkEgressMetering = Objects.requireNonNull(enableNetworkEgressMetering);
            return this;
        }

        public Builder enableResourceConsumptionMetering(Boolean enableResourceConsumptionMetering) {
            this.enableResourceConsumptionMetering = Objects.requireNonNull(enableResourceConsumptionMetering);
            return this;
        }
        public GetClusterResourceUsageExportConfig build() {
            return new GetClusterResourceUsageExportConfig(bigqueryDestinations, enableNetworkEgressMetering, enableResourceConsumptionMetering);
        }
    }
}
