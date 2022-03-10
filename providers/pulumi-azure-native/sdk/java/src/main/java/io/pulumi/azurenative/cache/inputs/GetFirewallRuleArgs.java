// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFirewallRuleArgs Empty = new GetFirewallRuleArgs();

    /**
     * The name of the Redis cache.
     * 
     */
    @InputImport(name="cacheName", required=true)
      private final String cacheName;

    public String getCacheName() {
        return this.cacheName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the firewall rule.
     * 
     */
    @InputImport(name="ruleName", required=true)
      private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    public GetFirewallRuleArgs(
        String cacheName,
        String resourceGroupName,
        String ruleName) {
        this.cacheName = Objects.requireNonNull(cacheName, "expected parameter 'cacheName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
    }

    private GetFirewallRuleArgs() {
        this.cacheName = null;
        this.resourceGroupName = null;
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheName;
        private String resourceGroupName;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheName = defaults.cacheName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder cacheName(String cacheName) {
            this.cacheName = Objects.requireNonNull(cacheName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder ruleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }
        public GetFirewallRuleArgs build() {
            return new GetFirewallRuleArgs(cacheName, resourceGroupName, ruleName);
        }
    }
}
