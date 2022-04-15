// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBillingAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBillingAccountArgs Empty = new GetBillingAccountArgs();

    /**
     * The name of the billing account in the form `{billing_account_id}` or `billingAccounts/{billing_account_id}`.
     * 
     */
    @Import(name="billingAccount")
      private final @Nullable String billingAccount;

    public Optional<String> billingAccount() {
        return this.billingAccount == null ? Optional.empty() : Optional.ofNullable(this.billingAccount);
    }

    /**
     * The display name of the billing account.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * `true` if the billing account is open, `false` if the billing account is closed.
     * 
     */
    @Import(name="open")
      private final @Nullable Boolean open;

    public Optional<Boolean> open() {
        return this.open == null ? Optional.empty() : Optional.ofNullable(this.open);
    }

    public GetBillingAccountArgs(
        @Nullable String billingAccount,
        @Nullable String displayName,
        @Nullable Boolean open) {
        this.billingAccount = billingAccount;
        this.displayName = displayName;
        this.open = open;
    }

    private GetBillingAccountArgs() {
        this.billingAccount = null;
        this.displayName = null;
        this.open = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String billingAccount;
        private @Nullable String displayName;
        private @Nullable Boolean open;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccount = defaults.billingAccount;
    	      this.displayName = defaults.displayName;
    	      this.open = defaults.open;
        }

        public Builder billingAccount(@Nullable String billingAccount) {
            this.billingAccount = billingAccount;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder open(@Nullable Boolean open) {
            this.open = open;
            return this;
        }        public GetBillingAccountArgs build() {
            return new GetBillingAccountArgs(billingAccount, displayName, open);
        }
    }
}
