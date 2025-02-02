// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cognitive.outputs;

import com.pulumi.azure.cognitive.outputs.AccountNetworkAclsVirtualNetworkRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AccountNetworkAcls {
    /**
     * @return The Default Action to use when no rules match from `ip_rules` / `virtual_network_rules`. Possible values are `Allow` and `Deny`.
     * 
     */
    private final String defaultAction;
    /**
     * @return One or more IP Addresses, or CIDR Blocks which should be able to access the Cognitive Account.
     * 
     */
    private final @Nullable List<String> ipRules;
    /**
     * @return A `virtual_network_rules` block as defined below.
     * 
     */
    private final @Nullable List<AccountNetworkAclsVirtualNetworkRule> virtualNetworkRules;

    @CustomType.Constructor
    private AccountNetworkAcls(
        @CustomType.Parameter("defaultAction") String defaultAction,
        @CustomType.Parameter("ipRules") @Nullable List<String> ipRules,
        @CustomType.Parameter("virtualNetworkRules") @Nullable List<AccountNetworkAclsVirtualNetworkRule> virtualNetworkRules) {
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * @return The Default Action to use when no rules match from `ip_rules` / `virtual_network_rules`. Possible values are `Allow` and `Deny`.
     * 
     */
    public String defaultAction() {
        return this.defaultAction;
    }
    /**
     * @return One or more IP Addresses, or CIDR Blocks which should be able to access the Cognitive Account.
     * 
     */
    public List<String> ipRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    /**
     * @return A `virtual_network_rules` block as defined below.
     * 
     */
    public List<AccountNetworkAclsVirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountNetworkAcls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultAction;
        private @Nullable List<String> ipRules;
        private @Nullable List<AccountNetworkAclsVirtualNetworkRule> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountNetworkAcls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder defaultAction(String defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }
        public Builder ipRules(@Nullable List<String> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(String... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder virtualNetworkRules(@Nullable List<AccountNetworkAclsVirtualNetworkRule> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(AccountNetworkAclsVirtualNetworkRule... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public AccountNetworkAcls build() {
            return new AccountNetworkAcls(defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
