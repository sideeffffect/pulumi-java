// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Forest Trust Setting
 * 
 */
public final class ForestTrustResponse extends com.pulumi.resources.InvokeArgs {

    public static final ForestTrustResponse Empty = new ForestTrustResponse();

    /**
     * Friendly Name
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Remote Dns ips
     * 
     */
    @Import(name="remoteDnsIps")
    private @Nullable String remoteDnsIps;

    public Optional<String> remoteDnsIps() {
        return Optional.ofNullable(this.remoteDnsIps);
    }

    /**
     * Trust Direction
     * 
     */
    @Import(name="trustDirection")
    private @Nullable String trustDirection;

    public Optional<String> trustDirection() {
        return Optional.ofNullable(this.trustDirection);
    }

    /**
     * Trust Password
     * 
     */
    @Import(name="trustPassword")
    private @Nullable String trustPassword;

    public Optional<String> trustPassword() {
        return Optional.ofNullable(this.trustPassword);
    }

    /**
     * Trusted Domain FQDN
     * 
     */
    @Import(name="trustedDomainFqdn")
    private @Nullable String trustedDomainFqdn;

    public Optional<String> trustedDomainFqdn() {
        return Optional.ofNullable(this.trustedDomainFqdn);
    }

    private ForestTrustResponse() {}

    private ForestTrustResponse(ForestTrustResponse $) {
        this.friendlyName = $.friendlyName;
        this.remoteDnsIps = $.remoteDnsIps;
        this.trustDirection = $.trustDirection;
        this.trustPassword = $.trustPassword;
        this.trustedDomainFqdn = $.trustedDomainFqdn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForestTrustResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForestTrustResponse $;

        public Builder() {
            $ = new ForestTrustResponse();
        }

        public Builder(ForestTrustResponse defaults) {
            $ = new ForestTrustResponse(Objects.requireNonNull(defaults));
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        public Builder remoteDnsIps(@Nullable String remoteDnsIps) {
            $.remoteDnsIps = remoteDnsIps;
            return this;
        }

        public Builder trustDirection(@Nullable String trustDirection) {
            $.trustDirection = trustDirection;
            return this;
        }

        public Builder trustPassword(@Nullable String trustPassword) {
            $.trustPassword = trustPassword;
            return this;
        }

        public Builder trustedDomainFqdn(@Nullable String trustedDomainFqdn) {
            $.trustedDomainFqdn = trustedDomainFqdn;
            return this;
        }

        public ForestTrustResponse build() {
            return $;
        }
    }

}
