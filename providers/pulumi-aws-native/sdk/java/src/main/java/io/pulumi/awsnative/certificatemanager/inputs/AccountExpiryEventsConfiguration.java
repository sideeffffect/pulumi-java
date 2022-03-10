// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.certificatemanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountExpiryEventsConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final AccountExpiryEventsConfiguration Empty = new AccountExpiryEventsConfiguration();

    @InputImport(name="daysBeforeExpiry")
      private final @Nullable Integer daysBeforeExpiry;

    public Optional<Integer> getDaysBeforeExpiry() {
        return this.daysBeforeExpiry == null ? Optional.empty() : Optional.ofNullable(this.daysBeforeExpiry);
    }

    public AccountExpiryEventsConfiguration(@Nullable Integer daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
    }

    private AccountExpiryEventsConfiguration() {
        this.daysBeforeExpiry = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountExpiryEventsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer daysBeforeExpiry;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountExpiryEventsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysBeforeExpiry = defaults.daysBeforeExpiry;
        }

        public Builder daysBeforeExpiry(@Nullable Integer daysBeforeExpiry) {
            this.daysBeforeExpiry = daysBeforeExpiry;
            return this;
        }
        public AccountExpiryEventsConfiguration build() {
            return new AccountExpiryEventsConfiguration(daysBeforeExpiry);
        }
    }
}
