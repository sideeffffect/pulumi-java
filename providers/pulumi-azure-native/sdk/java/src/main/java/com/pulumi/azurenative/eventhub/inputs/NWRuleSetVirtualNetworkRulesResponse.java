// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.azurenative.eventhub.inputs.SubnetResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of VirtualNetworkRules - NetworkRules resource.
 * 
 */
public final class NWRuleSetVirtualNetworkRulesResponse extends com.pulumi.resources.InvokeArgs {

    public static final NWRuleSetVirtualNetworkRulesResponse Empty = new NWRuleSetVirtualNetworkRulesResponse();

    /**
     * Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    @Import(name="ignoreMissingVnetServiceEndpoint")
      private final @Nullable Boolean ignoreMissingVnetServiceEndpoint;

    public Optional<Boolean> ignoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint == null ? Optional.empty() : Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    /**
     * Subnet properties
     * 
     */
    @Import(name="subnet")
      private final @Nullable SubnetResponse subnet;

    public Optional<SubnetResponse> subnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public NWRuleSetVirtualNetworkRulesResponse(
        @Nullable Boolean ignoreMissingVnetServiceEndpoint,
        @Nullable SubnetResponse subnet) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.subnet = subnet;
    }

    private NWRuleSetVirtualNetworkRulesResponse() {
        this.ignoreMissingVnetServiceEndpoint = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NWRuleSetVirtualNetworkRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ignoreMissingVnetServiceEndpoint;
        private @Nullable SubnetResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NWRuleSetVirtualNetworkRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.subnet = defaults.subnet;
        }

        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }
        public Builder subnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }        public NWRuleSetVirtualNetworkRulesResponse build() {
            return new NWRuleSetVirtualNetworkRulesResponse(ignoreMissingVnetServiceEndpoint, subnet);
        }
    }
}
