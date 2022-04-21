// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.SubscriptionStateOverrideActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs Empty = new ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs();

    @Import(name="softDeleteTTL")
    private @Nullable Output<String> softDeleteTTL;

    public Optional<Output<String>> softDeleteTTL() {
        return Optional.ofNullable(this.softDeleteTTL);
    }

    @Import(name="subscriptionStateOverrideActions")
    private @Nullable Output<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions;

    public Optional<Output<List<SubscriptionStateOverrideActionArgs>>> subscriptionStateOverrideActions() {
        return Optional.ofNullable(this.subscriptionStateOverrideActions);
    }

    private ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs() {}

    private ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs(ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs $) {
        this.softDeleteTTL = $.softDeleteTTL;
        this.subscriptionStateOverrideActions = $.subscriptionStateOverrideActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs $;

        public Builder() {
            $ = new ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs();
        }

        public Builder(ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs defaults) {
            $ = new ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder softDeleteTTL(@Nullable Output<String> softDeleteTTL) {
            $.softDeleteTTL = softDeleteTTL;
            return this;
        }

        public Builder softDeleteTTL(String softDeleteTTL) {
            return softDeleteTTL(Output.of(softDeleteTTL));
        }

        public Builder subscriptionStateOverrideActions(@Nullable Output<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions) {
            $.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
            return this;
        }

        public Builder subscriptionStateOverrideActions(List<SubscriptionStateOverrideActionArgs> subscriptionStateOverrideActions) {
            return subscriptionStateOverrideActions(Output.of(subscriptionStateOverrideActions));
        }

        public Builder subscriptionStateOverrideActions(SubscriptionStateOverrideActionArgs... subscriptionStateOverrideActions) {
            return subscriptionStateOverrideActions(List.of(subscriptionStateOverrideActions));
        }

        public ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs build() {
            return $;
        }
    }

}
