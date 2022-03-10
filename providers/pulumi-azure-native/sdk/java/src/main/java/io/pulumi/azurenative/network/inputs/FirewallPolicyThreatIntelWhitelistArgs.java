// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ThreatIntel Whitelist for Firewall Policy.
 * 
 */
public final class FirewallPolicyThreatIntelWhitelistArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyThreatIntelWhitelistArgs Empty = new FirewallPolicyThreatIntelWhitelistArgs();

    /**
     * List of FQDNs for the ThreatIntel Whitelist.
     * 
     */
    @InputImport(name="fqdns")
      private final @Nullable Input<List<String>> fqdns;

    public Input<List<String>> getFqdns() {
        return this.fqdns == null ? Input.empty() : this.fqdns;
    }

    /**
     * List of IP addresses for the ThreatIntel Whitelist.
     * 
     */
    @InputImport(name="ipAddresses")
      private final @Nullable Input<List<String>> ipAddresses;

    public Input<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Input.empty() : this.ipAddresses;
    }

    public FirewallPolicyThreatIntelWhitelistArgs(
        @Nullable Input<List<String>> fqdns,
        @Nullable Input<List<String>> ipAddresses) {
        this.fqdns = fqdns;
        this.ipAddresses = ipAddresses;
    }

    private FirewallPolicyThreatIntelWhitelistArgs() {
        this.fqdns = Input.empty();
        this.ipAddresses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyThreatIntelWhitelistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> fqdns;
        private @Nullable Input<List<String>> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyThreatIntelWhitelistArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdns = defaults.fqdns;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder fqdns(@Nullable Input<List<String>> fqdns) {
            this.fqdns = fqdns;
            return this;
        }

        public Builder fqdns(@Nullable List<String> fqdns) {
            this.fqdns = Input.ofNullable(fqdns);
            return this;
        }

        public Builder ipAddresses(@Nullable Input<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Input.ofNullable(ipAddresses);
            return this;
        }
        public FirewallPolicyThreatIntelWhitelistArgs build() {
            return new FirewallPolicyThreatIntelWhitelistArgs(fqdns, ipAddresses);
        }
    }
}
