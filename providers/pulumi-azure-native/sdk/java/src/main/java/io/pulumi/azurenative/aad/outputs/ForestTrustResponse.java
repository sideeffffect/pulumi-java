// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ForestTrustResponse {
    /**
     * Friendly Name
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * Remote Dns ips
     * 
     */
    private final @Nullable String remoteDnsIps;
    /**
     * Trust Direction
     * 
     */
    private final @Nullable String trustDirection;
    /**
     * Trust Password
     * 
     */
    private final @Nullable String trustPassword;
    /**
     * Trusted Domain FQDN
     * 
     */
    private final @Nullable String trustedDomainFqdn;

    @OutputCustomType.Constructor
    private ForestTrustResponse(
        @OutputCustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @OutputCustomType.Parameter("remoteDnsIps") @Nullable String remoteDnsIps,
        @OutputCustomType.Parameter("trustDirection") @Nullable String trustDirection,
        @OutputCustomType.Parameter("trustPassword") @Nullable String trustPassword,
        @OutputCustomType.Parameter("trustedDomainFqdn") @Nullable String trustedDomainFqdn) {
        this.friendlyName = friendlyName;
        this.remoteDnsIps = remoteDnsIps;
        this.trustDirection = trustDirection;
        this.trustPassword = trustPassword;
        this.trustedDomainFqdn = trustedDomainFqdn;
    }

    /**
     * Friendly Name
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * Remote Dns ips
     * 
    */
    public Optional<String> getRemoteDnsIps() {
        return Optional.ofNullable(this.remoteDnsIps);
    }
    /**
     * Trust Direction
     * 
    */
    public Optional<String> getTrustDirection() {
        return Optional.ofNullable(this.trustDirection);
    }
    /**
     * Trust Password
     * 
    */
    public Optional<String> getTrustPassword() {
        return Optional.ofNullable(this.trustPassword);
    }
    /**
     * Trusted Domain FQDN
     * 
    */
    public Optional<String> getTrustedDomainFqdn() {
        return Optional.ofNullable(this.trustedDomainFqdn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForestTrustResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String friendlyName;
        private @Nullable String remoteDnsIps;
        private @Nullable String trustDirection;
        private @Nullable String trustPassword;
        private @Nullable String trustedDomainFqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(ForestTrustResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.friendlyName = defaults.friendlyName;
    	      this.remoteDnsIps = defaults.remoteDnsIps;
    	      this.trustDirection = defaults.trustDirection;
    	      this.trustPassword = defaults.trustPassword;
    	      this.trustedDomainFqdn = defaults.trustedDomainFqdn;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder remoteDnsIps(@Nullable String remoteDnsIps) {
            this.remoteDnsIps = remoteDnsIps;
            return this;
        }

        public Builder trustDirection(@Nullable String trustDirection) {
            this.trustDirection = trustDirection;
            return this;
        }

        public Builder trustPassword(@Nullable String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }

        public Builder trustedDomainFqdn(@Nullable String trustedDomainFqdn) {
            this.trustedDomainFqdn = trustedDomainFqdn;
            return this;
        }
        public ForestTrustResponse build() {
            return new ForestTrustResponse(friendlyName, remoteDnsIps, trustDirection, trustPassword, trustedDomainFqdn);
        }
    }
}
