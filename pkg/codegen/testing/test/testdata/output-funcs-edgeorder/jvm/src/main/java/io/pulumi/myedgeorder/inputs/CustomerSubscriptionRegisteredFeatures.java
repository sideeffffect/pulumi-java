// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents subscription registered features
 * 
 */
public final class CustomerSubscriptionRegisteredFeatures extends io.pulumi.resources.InvokeArgs {

    public static final CustomerSubscriptionRegisteredFeatures Empty = new CustomerSubscriptionRegisteredFeatures();

    /**
     * Name of subscription registered feature
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * State of subscription registered feature
     * 
     */
    @InputImport(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public CustomerSubscriptionRegisteredFeatures(
        @Nullable String name,
        @Nullable String state) {
        this.name = name;
        this.state = state;
    }

    private CustomerSubscriptionRegisteredFeatures() {
        this.name = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerSubscriptionRegisteredFeatures defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerSubscriptionRegisteredFeatures defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public CustomerSubscriptionRegisteredFeatures build() {
            return new CustomerSubscriptionRegisteredFeatures(name, state);
        }
    }
}
