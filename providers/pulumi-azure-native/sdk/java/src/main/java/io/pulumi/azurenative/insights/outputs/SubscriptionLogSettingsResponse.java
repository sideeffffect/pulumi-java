// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubscriptionLogSettingsResponse {
    /**
     * Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    private final @Nullable String category;
    /**
     * a value indicating whether this log is enabled.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor
    private SubscriptionLogSettingsResponse(
        @OutputCustomType.Parameter("category") @Nullable String category,
        @OutputCustomType.Parameter("enabled") Boolean enabled) {
        this.category = category;
        this.enabled = enabled;
    }

    /**
     * Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
    */
    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    /**
     * a value indicating whether this log is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionLogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionLogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
        }

        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public SubscriptionLogSettingsResponse build() {
            return new SubscriptionLogSettingsResponse(category, enabled);
        }
    }
}
