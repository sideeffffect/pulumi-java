// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.AclEntryResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class IpConfigurationResponse {
    /**
     * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-managed-services-default". If set, the instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?.`
     * 
     */
    private final String allocatedIpRange;
    /**
     * The list of external networks that are allowed to connect to the instance using the IP. In 'CIDR' notation, also known as 'slash' notation (for example: `157.197.200.0/24`).
     * 
     */
    private final List<AclEntryResponse> authorizedNetworks;
    /**
     * Whether the instance is assigned a public IP address or not.
     * 
     */
    private final Boolean ipv4Enabled;
    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    private final String privateNetwork;
    /**
     * Whether SSL connections over IP are enforced or not.
     * 
     */
    private final Boolean requireSsl;

    @CustomType.Constructor
    private IpConfigurationResponse(
        @CustomType.Parameter("allocatedIpRange") String allocatedIpRange,
        @CustomType.Parameter("authorizedNetworks") List<AclEntryResponse> authorizedNetworks,
        @CustomType.Parameter("ipv4Enabled") Boolean ipv4Enabled,
        @CustomType.Parameter("privateNetwork") String privateNetwork,
        @CustomType.Parameter("requireSsl") Boolean requireSsl) {
        this.allocatedIpRange = allocatedIpRange;
        this.authorizedNetworks = authorizedNetworks;
        this.ipv4Enabled = ipv4Enabled;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    /**
     * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-managed-services-default". If set, the instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?.`
     * 
    */
    public String allocatedIpRange() {
        return this.allocatedIpRange;
    }
    /**
     * The list of external networks that are allowed to connect to the instance using the IP. In 'CIDR' notation, also known as 'slash' notation (for example: `157.197.200.0/24`).
     * 
    */
    public List<AclEntryResponse> authorizedNetworks() {
        return this.authorizedNetworks;
    }
    /**
     * Whether the instance is assigned a public IP address or not.
     * 
    */
    public Boolean ipv4Enabled() {
        return this.ipv4Enabled;
    }
    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
    */
    public String privateNetwork() {
        return this.privateNetwork;
    }
    /**
     * Whether SSL connections over IP are enforced or not.
     * 
    */
    public Boolean requireSsl() {
        return this.requireSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocatedIpRange;
        private List<AclEntryResponse> authorizedNetworks;
        private Boolean ipv4Enabled;
        private String privateNetwork;
        private Boolean requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(IpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRange = defaults.allocatedIpRange;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder allocatedIpRange(String allocatedIpRange) {
            this.allocatedIpRange = Objects.requireNonNull(allocatedIpRange);
            return this;
        }
        public Builder authorizedNetworks(List<AclEntryResponse> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(AclEntryResponse... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        public Builder ipv4Enabled(Boolean ipv4Enabled) {
            this.ipv4Enabled = Objects.requireNonNull(ipv4Enabled);
            return this;
        }
        public Builder privateNetwork(String privateNetwork) {
            this.privateNetwork = Objects.requireNonNull(privateNetwork);
            return this;
        }
        public Builder requireSsl(Boolean requireSsl) {
            this.requireSsl = Objects.requireNonNull(requireSsl);
            return this;
        }        public IpConfigurationResponse build() {
            return new IpConfigurationResponse(allocatedIpRange, authorizedNetworks, ipv4Enabled, privateNetwork, requireSsl);
        }
    }
}
