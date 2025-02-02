// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceTypeRegistrationPropertiesResponseResourceMovePolicy {
    private final @Nullable Boolean crossResourceGroupMoveEnabled;
    private final @Nullable Boolean crossSubscriptionMoveEnabled;
    private final @Nullable Boolean validationRequired;

    @CustomType.Constructor
    private ResourceTypeRegistrationPropertiesResponseResourceMovePolicy(
        @CustomType.Parameter("crossResourceGroupMoveEnabled") @Nullable Boolean crossResourceGroupMoveEnabled,
        @CustomType.Parameter("crossSubscriptionMoveEnabled") @Nullable Boolean crossSubscriptionMoveEnabled,
        @CustomType.Parameter("validationRequired") @Nullable Boolean validationRequired) {
        this.crossResourceGroupMoveEnabled = crossResourceGroupMoveEnabled;
        this.crossSubscriptionMoveEnabled = crossSubscriptionMoveEnabled;
        this.validationRequired = validationRequired;
    }

    public Optional<Boolean> crossResourceGroupMoveEnabled() {
        return Optional.ofNullable(this.crossResourceGroupMoveEnabled);
    }
    public Optional<Boolean> crossSubscriptionMoveEnabled() {
        return Optional.ofNullable(this.crossSubscriptionMoveEnabled);
    }
    public Optional<Boolean> validationRequired() {
        return Optional.ofNullable(this.validationRequired);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseResourceMovePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crossResourceGroupMoveEnabled;
        private @Nullable Boolean crossSubscriptionMoveEnabled;
        private @Nullable Boolean validationRequired;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseResourceMovePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossResourceGroupMoveEnabled = defaults.crossResourceGroupMoveEnabled;
    	      this.crossSubscriptionMoveEnabled = defaults.crossSubscriptionMoveEnabled;
    	      this.validationRequired = defaults.validationRequired;
        }

        public Builder crossResourceGroupMoveEnabled(@Nullable Boolean crossResourceGroupMoveEnabled) {
            this.crossResourceGroupMoveEnabled = crossResourceGroupMoveEnabled;
            return this;
        }
        public Builder crossSubscriptionMoveEnabled(@Nullable Boolean crossSubscriptionMoveEnabled) {
            this.crossSubscriptionMoveEnabled = crossSubscriptionMoveEnabled;
            return this;
        }
        public Builder validationRequired(@Nullable Boolean validationRequired) {
            this.validationRequired = validationRequired;
            return this;
        }        public ResourceTypeRegistrationPropertiesResponseResourceMovePolicy build() {
            return new ResourceTypeRegistrationPropertiesResponseResourceMovePolicy(crossResourceGroupMoveEnabled, crossSubscriptionMoveEnabled, validationRequired);
        }
    }
}
