// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationScopeResponse {
    /**
     * The resources scope description.
     * 
     */
    private final @Nullable String description;
    /**
     * The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
     */
    private final @Nullable String scopePath;

    @CustomType.Constructor
    private AutomationScopeResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("scopePath") @Nullable String scopePath) {
        this.description = description;
        this.scopePath = scopePath;
    }

    /**
     * The resources scope description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
    */
    public Optional<String> scopePath() {
        return Optional.ofNullable(this.scopePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String scopePath;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.scopePath = defaults.scopePath;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder scopePath(@Nullable String scopePath) {
            this.scopePath = scopePath;
            return this;
        }        public AutomationScopeResponse build() {
            return new AutomationScopeResponse(description, scopePath);
        }
    }
}
