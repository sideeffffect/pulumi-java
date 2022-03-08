// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.sql.outputs.GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDatabaseInstanceSettingIpConfiguration {
    private final String allocatedIpRange;
    private final List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks;
    private final Boolean ipv4Enabled;
    private final String privateNetwork;
    private final Boolean requireSsl;

    @OutputCustomType.Constructor({"allocatedIpRange","authorizedNetworks","ipv4Enabled","privateNetwork","requireSsl"})
    private GetDatabaseInstanceSettingIpConfiguration(
        String allocatedIpRange,
        List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks,
        Boolean ipv4Enabled,
        String privateNetwork,
        Boolean requireSsl) {
        this.allocatedIpRange = allocatedIpRange;
        this.authorizedNetworks = authorizedNetworks;
        this.ipv4Enabled = ipv4Enabled;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    public String getAllocatedIpRange() {
        return this.allocatedIpRange;
    }
    public List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> getAuthorizedNetworks() {
        return this.authorizedNetworks;
    }
    public Boolean getIpv4Enabled() {
        return this.ipv4Enabled;
    }
    public String getPrivateNetwork() {
        return this.privateNetwork;
    }
    public Boolean getRequireSsl() {
        return this.requireSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingIpConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocatedIpRange;
        private List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks;
        private Boolean ipv4Enabled;
        private String privateNetwork;
        private Boolean requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRange = defaults.allocatedIpRange;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder setAllocatedIpRange(String allocatedIpRange) {
            this.allocatedIpRange = Objects.requireNonNull(allocatedIpRange);
            return this;
        }

        public Builder setAuthorizedNetworks(List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }

        public Builder setIpv4Enabled(Boolean ipv4Enabled) {
            this.ipv4Enabled = Objects.requireNonNull(ipv4Enabled);
            return this;
        }

        public Builder setPrivateNetwork(String privateNetwork) {
            this.privateNetwork = Objects.requireNonNull(privateNetwork);
            return this;
        }

        public Builder setRequireSsl(Boolean requireSsl) {
            this.requireSsl = Objects.requireNonNull(requireSsl);
            return this;
        }
        public GetDatabaseInstanceSettingIpConfiguration build() {
            return new GetDatabaseInstanceSettingIpConfiguration(allocatedIpRange, authorizedNetworks, ipv4Enabled, privateNetwork, requireSsl);
        }
    }
}
