// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Routing preference defines the type of network, either microsoft or internet routing to be used to deliver the user data, the default option is microsoft routing
 * 
 */
public final class RoutingPreferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RoutingPreferenceResponse Empty = new RoutingPreferenceResponse();

    /**
     * A boolean flag which indicates whether internet routing storage endpoints are to be published
     * 
     */
    @InputImport(name="publishInternetEndpoints")
      private final @Nullable Boolean publishInternetEndpoints;

    public Optional<Boolean> getPublishInternetEndpoints() {
        return this.publishInternetEndpoints == null ? Optional.empty() : Optional.ofNullable(this.publishInternetEndpoints);
    }

    /**
     * A boolean flag which indicates whether microsoft routing storage endpoints are to be published
     * 
     */
    @InputImport(name="publishMicrosoftEndpoints")
      private final @Nullable Boolean publishMicrosoftEndpoints;

    public Optional<Boolean> getPublishMicrosoftEndpoints() {
        return this.publishMicrosoftEndpoints == null ? Optional.empty() : Optional.ofNullable(this.publishMicrosoftEndpoints);
    }

    /**
     * Routing Choice defines the kind of network routing opted by the user.
     * 
     */
    @InputImport(name="routingChoice")
      private final @Nullable String routingChoice;

    public Optional<String> getRoutingChoice() {
        return this.routingChoice == null ? Optional.empty() : Optional.ofNullable(this.routingChoice);
    }

    public RoutingPreferenceResponse(
        @Nullable Boolean publishInternetEndpoints,
        @Nullable Boolean publishMicrosoftEndpoints,
        @Nullable String routingChoice) {
        this.publishInternetEndpoints = publishInternetEndpoints;
        this.publishMicrosoftEndpoints = publishMicrosoftEndpoints;
        this.routingChoice = routingChoice;
    }

    private RoutingPreferenceResponse() {
        this.publishInternetEndpoints = null;
        this.publishMicrosoftEndpoints = null;
        this.routingChoice = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingPreferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean publishInternetEndpoints;
        private @Nullable Boolean publishMicrosoftEndpoints;
        private @Nullable String routingChoice;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingPreferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishInternetEndpoints = defaults.publishInternetEndpoints;
    	      this.publishMicrosoftEndpoints = defaults.publishMicrosoftEndpoints;
    	      this.routingChoice = defaults.routingChoice;
        }

        public Builder publishInternetEndpoints(@Nullable Boolean publishInternetEndpoints) {
            this.publishInternetEndpoints = publishInternetEndpoints;
            return this;
        }

        public Builder publishMicrosoftEndpoints(@Nullable Boolean publishMicrosoftEndpoints) {
            this.publishMicrosoftEndpoints = publishMicrosoftEndpoints;
            return this;
        }

        public Builder routingChoice(@Nullable String routingChoice) {
            this.routingChoice = routingChoice;
            return this;
        }
        public RoutingPreferenceResponse build() {
            return new RoutingPreferenceResponse(publishInternetEndpoints, publishMicrosoftEndpoints, routingChoice);
        }
    }
}
