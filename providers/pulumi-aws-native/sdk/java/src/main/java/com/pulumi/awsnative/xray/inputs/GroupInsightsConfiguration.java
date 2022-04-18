// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.xray.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupInsightsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GroupInsightsConfiguration Empty = new GroupInsightsConfiguration();

    /**
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * 
     */
    @Import(name="insightsEnabled")
      private final @Nullable Boolean insightsEnabled;

    public Optional<Boolean> insightsEnabled() {
        return this.insightsEnabled == null ? Optional.empty() : Optional.ofNullable(this.insightsEnabled);
    }

    /**
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.
     * 
     */
    @Import(name="notificationsEnabled")
      private final @Nullable Boolean notificationsEnabled;

    public Optional<Boolean> notificationsEnabled() {
        return this.notificationsEnabled == null ? Optional.empty() : Optional.ofNullable(this.notificationsEnabled);
    }

    public GroupInsightsConfiguration(
        @Nullable Boolean insightsEnabled,
        @Nullable Boolean notificationsEnabled) {
        this.insightsEnabled = insightsEnabled;
        this.notificationsEnabled = notificationsEnabled;
    }

    private GroupInsightsConfiguration() {
        this.insightsEnabled = null;
        this.notificationsEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInsightsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean insightsEnabled;
        private @Nullable Boolean notificationsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInsightsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insightsEnabled = defaults.insightsEnabled;
    	      this.notificationsEnabled = defaults.notificationsEnabled;
        }

        public Builder insightsEnabled(@Nullable Boolean insightsEnabled) {
            this.insightsEnabled = insightsEnabled;
            return this;
        }
        public Builder notificationsEnabled(@Nullable Boolean notificationsEnabled) {
            this.notificationsEnabled = notificationsEnabled;
            return this;
        }        public GroupInsightsConfiguration build() {
            return new GroupInsightsConfiguration(insightsEnabled, notificationsEnabled);
        }
    }
}
