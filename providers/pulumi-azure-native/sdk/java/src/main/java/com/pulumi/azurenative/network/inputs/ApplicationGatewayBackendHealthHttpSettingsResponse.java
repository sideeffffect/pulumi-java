// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationGatewayBackendHealthServerResponse;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayBackendHttpSettingsResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application gateway BackendHealthHttp settings.
 * 
 */
public final class ApplicationGatewayBackendHealthHttpSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayBackendHealthHttpSettingsResponse Empty = new ApplicationGatewayBackendHealthHttpSettingsResponse();

    /**
     * Reference to an ApplicationGatewayBackendHttpSettings resource.
     * 
     */
    @Import(name="backendHttpSettings")
      private final @Nullable ApplicationGatewayBackendHttpSettingsResponse backendHttpSettings;

    public Optional<ApplicationGatewayBackendHttpSettingsResponse> backendHttpSettings() {
        return this.backendHttpSettings == null ? Optional.empty() : Optional.ofNullable(this.backendHttpSettings);
    }

    /**
     * List of ApplicationGatewayBackendHealthServer resources.
     * 
     */
    @Import(name="servers")
      private final @Nullable List<ApplicationGatewayBackendHealthServerResponse> servers;

    public List<ApplicationGatewayBackendHealthServerResponse> servers() {
        return this.servers == null ? List.of() : this.servers;
    }

    public ApplicationGatewayBackendHealthHttpSettingsResponse(
        @Nullable ApplicationGatewayBackendHttpSettingsResponse backendHttpSettings,
        @Nullable List<ApplicationGatewayBackendHealthServerResponse> servers) {
        this.backendHttpSettings = backendHttpSettings;
        this.servers = servers;
    }

    private ApplicationGatewayBackendHealthHttpSettingsResponse() {
        this.backendHttpSettings = null;
        this.servers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendHealthHttpSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationGatewayBackendHttpSettingsResponse backendHttpSettings;
        private @Nullable List<ApplicationGatewayBackendHealthServerResponse> servers;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendHealthHttpSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendHttpSettings = defaults.backendHttpSettings;
    	      this.servers = defaults.servers;
        }

        public Builder backendHttpSettings(@Nullable ApplicationGatewayBackendHttpSettingsResponse backendHttpSettings) {
            this.backendHttpSettings = backendHttpSettings;
            return this;
        }
        public Builder servers(@Nullable List<ApplicationGatewayBackendHealthServerResponse> servers) {
            this.servers = servers;
            return this;
        }
        public Builder servers(ApplicationGatewayBackendHealthServerResponse... servers) {
            return servers(List.of(servers));
        }        public ApplicationGatewayBackendHealthHttpSettingsResponse build() {
            return new ApplicationGatewayBackendHealthHttpSettingsResponse(backendHttpSettings, servers);
        }
    }
}
