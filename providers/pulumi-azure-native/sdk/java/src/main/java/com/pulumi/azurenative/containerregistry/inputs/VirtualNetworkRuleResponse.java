// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual network rule.
 * 
 */
public final class VirtualNetworkRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkRuleResponse Empty = new VirtualNetworkRuleResponse();

    /**
     * The action of virtual network rule.
     * 
     */
    @Import(name="action")
      private final @Nullable String action;

    public Optional<String> action() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    @Import(name="virtualNetworkResourceId", required=true)
      private final String virtualNetworkResourceId;

    public String virtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public VirtualNetworkRuleResponse(
        @Nullable String action,
        String virtualNetworkResourceId) {
        this.action = action == null ? "Allow" : action;
        this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId, "expected parameter 'virtualNetworkResourceId' to be non-null");
    }

    private VirtualNetworkRuleResponse() {
        this.action = null;
        this.virtualNetworkResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder virtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(action, virtualNetworkResourceId);
        }
    }
}
