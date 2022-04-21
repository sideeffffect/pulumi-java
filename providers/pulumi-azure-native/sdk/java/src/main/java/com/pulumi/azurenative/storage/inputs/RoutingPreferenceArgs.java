// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.RoutingChoice;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Routing preference defines the type of network, either microsoft or internet routing to be used to deliver the user data, the default option is microsoft routing
 * 
 */
public final class RoutingPreferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutingPreferenceArgs Empty = new RoutingPreferenceArgs();

    /**
     * A boolean flag which indicates whether internet routing storage endpoints are to be published
     * 
     */
    @Import(name="publishInternetEndpoints")
    private @Nullable Output<Boolean> publishInternetEndpoints;

    public Optional<Output<Boolean>> publishInternetEndpoints() {
        return Optional.ofNullable(this.publishInternetEndpoints);
    }

    /**
     * A boolean flag which indicates whether microsoft routing storage endpoints are to be published
     * 
     */
    @Import(name="publishMicrosoftEndpoints")
    private @Nullable Output<Boolean> publishMicrosoftEndpoints;

    public Optional<Output<Boolean>> publishMicrosoftEndpoints() {
        return Optional.ofNullable(this.publishMicrosoftEndpoints);
    }

    /**
     * Routing Choice defines the kind of network routing opted by the user.
     * 
     */
    @Import(name="routingChoice")
    private @Nullable Output<Either<String,RoutingChoice>> routingChoice;

    public Optional<Output<Either<String,RoutingChoice>>> routingChoice() {
        return Optional.ofNullable(this.routingChoice);
    }

    private RoutingPreferenceArgs() {}

    private RoutingPreferenceArgs(RoutingPreferenceArgs $) {
        this.publishInternetEndpoints = $.publishInternetEndpoints;
        this.publishMicrosoftEndpoints = $.publishMicrosoftEndpoints;
        this.routingChoice = $.routingChoice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingPreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingPreferenceArgs $;

        public Builder() {
            $ = new RoutingPreferenceArgs();
        }

        public Builder(RoutingPreferenceArgs defaults) {
            $ = new RoutingPreferenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder publishInternetEndpoints(@Nullable Output<Boolean> publishInternetEndpoints) {
            $.publishInternetEndpoints = publishInternetEndpoints;
            return this;
        }

        public Builder publishInternetEndpoints(Boolean publishInternetEndpoints) {
            return publishInternetEndpoints(Output.of(publishInternetEndpoints));
        }

        public Builder publishMicrosoftEndpoints(@Nullable Output<Boolean> publishMicrosoftEndpoints) {
            $.publishMicrosoftEndpoints = publishMicrosoftEndpoints;
            return this;
        }

        public Builder publishMicrosoftEndpoints(Boolean publishMicrosoftEndpoints) {
            return publishMicrosoftEndpoints(Output.of(publishMicrosoftEndpoints));
        }

        public Builder routingChoice(@Nullable Output<Either<String,RoutingChoice>> routingChoice) {
            $.routingChoice = routingChoice;
            return this;
        }

        public Builder routingChoice(Either<String,RoutingChoice> routingChoice) {
            return routingChoice(Output.of(routingChoice));
        }

        public RoutingPreferenceArgs build() {
            return $;
        }
    }

}
