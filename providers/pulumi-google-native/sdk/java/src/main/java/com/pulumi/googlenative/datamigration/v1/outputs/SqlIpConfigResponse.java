// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datamigration.v1.outputs.SqlAclEntryResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SqlIpConfigResponse {
    /**
     * @return The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as &#39;slash&#39; notation (e.g. `192.168.100.0/24`).
     * 
     */
    private final List<SqlAclEntryResponse> authorizedNetworks;
    /**
     * @return Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    private final Boolean enableIpv4;
    /**
     * @return The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    private final String privateNetwork;
    /**
     * @return Whether SSL connections over IP should be enforced or not.
     * 
     */
    private final Boolean requireSsl;

    @CustomType.Constructor
    private SqlIpConfigResponse(
        @CustomType.Parameter("authorizedNetworks") List<SqlAclEntryResponse> authorizedNetworks,
        @CustomType.Parameter("enableIpv4") Boolean enableIpv4,
        @CustomType.Parameter("privateNetwork") String privateNetwork,
        @CustomType.Parameter("requireSsl") Boolean requireSsl) {
        this.authorizedNetworks = authorizedNetworks;
        this.enableIpv4 = enableIpv4;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    /**
     * @return The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as &#39;slash&#39; notation (e.g. `192.168.100.0/24`).
     * 
     */
    public List<SqlAclEntryResponse> authorizedNetworks() {
        return this.authorizedNetworks;
    }
    /**
     * @return Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    public Boolean enableIpv4() {
        return this.enableIpv4;
    }
    /**
     * @return The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    public String privateNetwork() {
        return this.privateNetwork;
    }
    /**
     * @return Whether SSL connections over IP should be enforced or not.
     * 
     */
    public Boolean requireSsl() {
        return this.requireSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlIpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SqlAclEntryResponse> authorizedNetworks;
        private Boolean enableIpv4;
        private String privateNetwork;
        private Boolean requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlIpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.enableIpv4 = defaults.enableIpv4;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder authorizedNetworks(List<SqlAclEntryResponse> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(SqlAclEntryResponse... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        public Builder enableIpv4(Boolean enableIpv4) {
            this.enableIpv4 = Objects.requireNonNull(enableIpv4);
            return this;
        }
        public Builder privateNetwork(String privateNetwork) {
            this.privateNetwork = Objects.requireNonNull(privateNetwork);
            return this;
        }
        public Builder requireSsl(Boolean requireSsl) {
            this.requireSsl = Objects.requireNonNull(requireSsl);
            return this;
        }        public SqlIpConfigResponse build() {
            return new SqlIpConfigResponse(authorizedNetworks, enableIpv4, privateNetwork, requireSsl);
        }
    }
}
