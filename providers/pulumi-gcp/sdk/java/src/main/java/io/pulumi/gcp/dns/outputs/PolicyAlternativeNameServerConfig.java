// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dns.outputs.PolicyAlternativeNameServerConfigTargetNameServer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PolicyAlternativeNameServerConfig {
    /**
     * Sets an alternative name server for the associated networks. When specified,
     * all DNS queries are forwarded to a name server that you choose. Names such as .internal
     * are not available when an alternative name server is specified.
     * Structure is documented below.
     * 
     */
    private final List<PolicyAlternativeNameServerConfigTargetNameServer> targetNameServers;

    @OutputCustomType.Constructor
    private PolicyAlternativeNameServerConfig(@OutputCustomType.Parameter("targetNameServers") List<PolicyAlternativeNameServerConfigTargetNameServer> targetNameServers) {
        this.targetNameServers = targetNameServers;
    }

    /**
     * Sets an alternative name server for the associated networks. When specified,
     * all DNS queries are forwarded to a name server that you choose. Names such as .internal
     * are not available when an alternative name server is specified.
     * Structure is documented below.
     * 
    */
    public List<PolicyAlternativeNameServerConfigTargetNameServer> getTargetNameServers() {
        return this.targetNameServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<PolicyAlternativeNameServerConfigTargetNameServer> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder targetNameServers(List<PolicyAlternativeNameServerConfigTargetNameServer> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }
        public PolicyAlternativeNameServerConfig build() {
            return new PolicyAlternativeNameServerConfig(targetNameServers);
        }
    }
}
