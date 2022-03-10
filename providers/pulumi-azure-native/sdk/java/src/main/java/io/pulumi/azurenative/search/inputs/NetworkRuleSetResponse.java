// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.inputs.IpRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network specific rules that determine how the Azure Cognitive Search service may be reached.
 * 
 */
public final class NetworkRuleSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkRuleSetResponse Empty = new NetworkRuleSetResponse();

    /**
     * A list of IP restriction rules that defines the inbound network(s) with allowing access to the search service endpoint. At the meantime, all other public IP networks are blocked by the firewall. These restriction rules are applied only when the 'publicNetworkAccess' of the search service is 'enabled'; otherwise, traffic over public interface is not allowed even with any public IP rules, and private endpoint connections would be the exclusive access method.
     * 
     */
    @InputImport(name="ipRules")
      private final @Nullable List<IpRuleResponse> ipRules;

    public List<IpRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }

    public NetworkRuleSetResponse(@Nullable List<IpRuleResponse> ipRules) {
        this.ipRules = ipRules;
    }

    private NetworkRuleSetResponse() {
        this.ipRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IpRuleResponse> ipRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRules = defaults.ipRules;
        }

        public Builder ipRules(@Nullable List<IpRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(ipRules);
        }
    }
}
