// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.changeanalysis.inputs;

import com.pulumi.azurenative.changeanalysis.inputs.AzureMonitorWorkspacePropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings of change notification configuration for a subscription.
 * 
 */
public final class NotificationSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final NotificationSettingsResponse Empty = new NotificationSettingsResponse();

    /**
     * The state of notifications feature.
     * 
     */
    @Import(name="activationState")
      private final @Nullable String activationState;

    public Optional<String> activationState() {
        return this.activationState == null ? Optional.empty() : Optional.ofNullable(this.activationState);
    }

    /**
     * Configuration properties of an Azure Monitor workspace that receives change notifications.
     * 
     */
    @Import(name="azureMonitorWorkspaceProperties")
      private final @Nullable AzureMonitorWorkspacePropertiesResponse azureMonitorWorkspaceProperties;

    public Optional<AzureMonitorWorkspacePropertiesResponse> azureMonitorWorkspaceProperties() {
        return this.azureMonitorWorkspaceProperties == null ? Optional.empty() : Optional.ofNullable(this.azureMonitorWorkspaceProperties);
    }

    public NotificationSettingsResponse(
        @Nullable String activationState,
        @Nullable AzureMonitorWorkspacePropertiesResponse azureMonitorWorkspaceProperties) {
        this.activationState = activationState;
        this.azureMonitorWorkspaceProperties = azureMonitorWorkspaceProperties;
    }

    private NotificationSettingsResponse() {
        this.activationState = null;
        this.azureMonitorWorkspaceProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activationState;
        private @Nullable AzureMonitorWorkspacePropertiesResponse azureMonitorWorkspaceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationState = defaults.activationState;
    	      this.azureMonitorWorkspaceProperties = defaults.azureMonitorWorkspaceProperties;
        }

        public Builder activationState(@Nullable String activationState) {
            this.activationState = activationState;
            return this;
        }
        public Builder azureMonitorWorkspaceProperties(@Nullable AzureMonitorWorkspacePropertiesResponse azureMonitorWorkspaceProperties) {
            this.azureMonitorWorkspaceProperties = azureMonitorWorkspaceProperties;
            return this;
        }        public NotificationSettingsResponse build() {
            return new NotificationSettingsResponse(activationState, azureMonitorWorkspaceProperties);
        }
    }
}
