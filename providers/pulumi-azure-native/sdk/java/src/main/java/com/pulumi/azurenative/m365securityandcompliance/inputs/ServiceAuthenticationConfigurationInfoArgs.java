// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication configuration information
 * 
 */
public final class ServiceAuthenticationConfigurationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAuthenticationConfigurationInfoArgs Empty = new ServiceAuthenticationConfigurationInfoArgs();

    /**
     * The audience url for the service
     * 
     */
    @Import(name="audience")
    private @Nullable Output<String> audience;

    public Optional<Output<String>> audience() {
        return Optional.ofNullable(this.audience);
    }

    /**
     * The authority url for the service
     * 
     */
    @Import(name="authority")
    private @Nullable Output<String> authority;

    public Optional<Output<String>> authority() {
        return Optional.ofNullable(this.authority);
    }

    /**
     * If the SMART on FHIR proxy is enabled
     * 
     */
    @Import(name="smartProxyEnabled")
    private @Nullable Output<Boolean> smartProxyEnabled;

    public Optional<Output<Boolean>> smartProxyEnabled() {
        return Optional.ofNullable(this.smartProxyEnabled);
    }

    private ServiceAuthenticationConfigurationInfoArgs() {}

    private ServiceAuthenticationConfigurationInfoArgs(ServiceAuthenticationConfigurationInfoArgs $) {
        this.audience = $.audience;
        this.authority = $.authority;
        this.smartProxyEnabled = $.smartProxyEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAuthenticationConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAuthenticationConfigurationInfoArgs $;

        public Builder() {
            $ = new ServiceAuthenticationConfigurationInfoArgs();
        }

        public Builder(ServiceAuthenticationConfigurationInfoArgs defaults) {
            $ = new ServiceAuthenticationConfigurationInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder audience(@Nullable Output<String> audience) {
            $.audience = audience;
            return this;
        }

        public Builder audience(String audience) {
            return audience(Output.of(audience));
        }

        public Builder authority(@Nullable Output<String> authority) {
            $.authority = authority;
            return this;
        }

        public Builder authority(String authority) {
            return authority(Output.of(authority));
        }

        public Builder smartProxyEnabled(@Nullable Output<Boolean> smartProxyEnabled) {
            $.smartProxyEnabled = smartProxyEnabled;
            return this;
        }

        public Builder smartProxyEnabled(Boolean smartProxyEnabled) {
            return smartProxyEnabled(Output.of(smartProxyEnabled));
        }

        public ServiceAuthenticationConfigurationInfoArgs build() {
            return $;
        }
    }

}
