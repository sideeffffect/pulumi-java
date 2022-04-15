// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetwork;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseInstanceSettingsIpConfiguration {
    /**
     * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-managed-services-default". If set, the instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://datatracker.ietf.org/doc/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
     * 
     */
    private final @Nullable String allocatedIpRange;
    private final @Nullable List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetwork> authorizedNetworks;
    /**
     * Whether this Cloud SQL instance should be assigned
     * a public IPV4 address. At least `ipv4_enabled` must be enabled or a
     * `private_network` must be configured.
     * 
     */
    private final @Nullable Boolean ipv4Enabled;
    /**
     * The VPC network from which the Cloud SQL
     * instance is accessible for private IP. For example, projects/myProject/global/networks/default.
     * Specifying a network enables private IP.
     * At least `ipv4_enabled` must be enabled or a `private_network` must be configured.
     * This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    private final @Nullable String privateNetwork;
    /**
     * Whether SSL connections over IP are enforced or not.
     * 
     */
    private final @Nullable Boolean requireSsl;

    @CustomType.Constructor
    private DatabaseInstanceSettingsIpConfiguration(
        @CustomType.Parameter("allocatedIpRange") @Nullable String allocatedIpRange,
        @CustomType.Parameter("authorizedNetworks") @Nullable List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetwork> authorizedNetworks,
        @CustomType.Parameter("ipv4Enabled") @Nullable Boolean ipv4Enabled,
        @CustomType.Parameter("privateNetwork") @Nullable String privateNetwork,
        @CustomType.Parameter("requireSsl") @Nullable Boolean requireSsl) {
        this.allocatedIpRange = allocatedIpRange;
        this.authorizedNetworks = authorizedNetworks;
        this.ipv4Enabled = ipv4Enabled;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    /**
     * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-managed-services-default". If set, the instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://datatracker.ietf.org/doc/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression a-z?.
     * 
    */
    public Optional<String> allocatedIpRange() {
        return Optional.ofNullable(this.allocatedIpRange);
    }
    public List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetwork> authorizedNetworks() {
        return this.authorizedNetworks == null ? List.of() : this.authorizedNetworks;
    }
    /**
     * Whether this Cloud SQL instance should be assigned
     * a public IPV4 address. At least `ipv4_enabled` must be enabled or a
     * `private_network` must be configured.
     * 
    */
    public Optional<Boolean> ipv4Enabled() {
        return Optional.ofNullable(this.ipv4Enabled);
    }
    /**
     * The VPC network from which the Cloud SQL
     * instance is accessible for private IP. For example, projects/myProject/global/networks/default.
     * Specifying a network enables private IP.
     * At least `ipv4_enabled` must be enabled or a `private_network` must be configured.
     * This setting can be updated, but it cannot be removed after it is set.
     * 
    */
    public Optional<String> privateNetwork() {
        return Optional.ofNullable(this.privateNetwork);
    }
    /**
     * Whether SSL connections over IP are enforced or not.
     * 
    */
    public Optional<Boolean> requireSsl() {
        return Optional.ofNullable(this.requireSsl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsIpConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allocatedIpRange;
        private @Nullable List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetwork> authorizedNetworks;
        private @Nullable Boolean ipv4Enabled;
        private @Nullable String privateNetwork;
        private @Nullable Boolean requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRange = defaults.allocatedIpRange;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder allocatedIpRange(@Nullable String allocatedIpRange) {
            this.allocatedIpRange = allocatedIpRange;
            return this;
        }
        public Builder authorizedNetworks(@Nullable List<DatabaseInstanceSettingsIpConfigurationAuthorizedNetwork> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }
        public Builder authorizedNetworks(DatabaseInstanceSettingsIpConfigurationAuthorizedNetwork... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        public Builder ipv4Enabled(@Nullable Boolean ipv4Enabled) {
            this.ipv4Enabled = ipv4Enabled;
            return this;
        }
        public Builder privateNetwork(@Nullable String privateNetwork) {
            this.privateNetwork = privateNetwork;
            return this;
        }
        public Builder requireSsl(@Nullable Boolean requireSsl) {
            this.requireSsl = requireSsl;
            return this;
        }        public DatabaseInstanceSettingsIpConfiguration build() {
            return new DatabaseInstanceSettingsIpConfiguration(allocatedIpRange, authorizedNetworks, ipv4Enabled, privateNetwork, requireSsl);
        }
    }
}
