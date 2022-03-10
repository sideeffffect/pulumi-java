// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.SubscriptionStateOverrideActionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications {
    private final @Nullable String softDeleteTTL;
    private final @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions;

    @OutputCustomType.Constructor
    private ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications(
        @OutputCustomType.Parameter("softDeleteTTL") @Nullable String softDeleteTTL,
        @OutputCustomType.Parameter("subscriptionStateOverrideActions") @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions) {
        this.softDeleteTTL = softDeleteTTL;
        this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
    }

    public Optional<String> getSoftDeleteTTL() {
        return Optional.ofNullable(this.softDeleteTTL);
    }
    public List<SubscriptionStateOverrideActionResponse> getSubscriptionStateOverrideActions() {
        return this.subscriptionStateOverrideActions == null ? List.of() : this.subscriptionStateOverrideActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String softDeleteTTL;
        private @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.softDeleteTTL = defaults.softDeleteTTL;
    	      this.subscriptionStateOverrideActions = defaults.subscriptionStateOverrideActions;
        }

        public Builder softDeleteTTL(@Nullable String softDeleteTTL) {
            this.softDeleteTTL = softDeleteTTL;
            return this;
        }

        public Builder subscriptionStateOverrideActions(@Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions) {
            this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
            return this;
        }
        public ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications build() {
            return new ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications(softDeleteTTL, subscriptionStateOverrideActions);
        }
    }
}
