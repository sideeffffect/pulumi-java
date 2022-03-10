// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubAccountState extends io.pulumi.resources.ResourceArgs {

    public static final SubAccountState Empty = new SubAccountState();

    /**
     * The billing account id.
     * 
     */
    @InputImport(name="billingAccountId")
      private final @Nullable Input<String> billingAccountId;

    public Input<String> getBillingAccountId() {
        return this.billingAccountId == null ? Input.empty() : this.billingAccountId;
    }

    /**
     * If set to "RENAME_ON_DESTROY" the billing account display_name
     * will be changed to "Destroyed" along with a timestamp.  If set to "" this will not occur.
     * Default is "".
     * 
     */
    @InputImport(name="deletionPolicy")
      private final @Nullable Input<String> deletionPolicy;

    public Input<String> getDeletionPolicy() {
        return this.deletionPolicy == null ? Input.empty() : this.deletionPolicy;
    }

    /**
     * The display name of the billing account.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name of the master billing account that the subaccount
     * will be created under in the form `{billing_account_id}` or `billingAccounts/{billing_account_id}`.
     * 
     */
    @InputImport(name="masterBillingAccount")
      private final @Nullable Input<String> masterBillingAccount;

    public Input<String> getMasterBillingAccount() {
        return this.masterBillingAccount == null ? Input.empty() : this.masterBillingAccount;
    }

    /**
     * The resource name of the billing account in the form `billingAccounts/{billing_account_id}`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * `true` if the billing account is open, `false` if the billing account is closed.
     * 
     */
    @InputImport(name="open")
      private final @Nullable Input<Boolean> open;

    public Input<Boolean> getOpen() {
        return this.open == null ? Input.empty() : this.open;
    }

    public SubAccountState(
        @Nullable Input<String> billingAccountId,
        @Nullable Input<String> deletionPolicy,
        @Nullable Input<String> displayName,
        @Nullable Input<String> masterBillingAccount,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> open) {
        this.billingAccountId = billingAccountId;
        this.deletionPolicy = deletionPolicy;
        this.displayName = displayName;
        this.masterBillingAccount = masterBillingAccount;
        this.name = name;
        this.open = open;
    }

    private SubAccountState() {
        this.billingAccountId = Input.empty();
        this.deletionPolicy = Input.empty();
        this.displayName = Input.empty();
        this.masterBillingAccount = Input.empty();
        this.name = Input.empty();
        this.open = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> billingAccountId;
        private @Nullable Input<String> deletionPolicy;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> masterBillingAccount;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> open;

        public Builder() {
    	      // Empty
        }

        public Builder(SubAccountState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.deletionPolicy = defaults.deletionPolicy;
    	      this.displayName = defaults.displayName;
    	      this.masterBillingAccount = defaults.masterBillingAccount;
    	      this.name = defaults.name;
    	      this.open = defaults.open;
        }

        public Builder billingAccountId(@Nullable Input<String> billingAccountId) {
            this.billingAccountId = billingAccountId;
            return this;
        }

        public Builder billingAccountId(@Nullable String billingAccountId) {
            this.billingAccountId = Input.ofNullable(billingAccountId);
            return this;
        }

        public Builder deletionPolicy(@Nullable Input<String> deletionPolicy) {
            this.deletionPolicy = deletionPolicy;
            return this;
        }

        public Builder deletionPolicy(@Nullable String deletionPolicy) {
            this.deletionPolicy = Input.ofNullable(deletionPolicy);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder masterBillingAccount(@Nullable Input<String> masterBillingAccount) {
            this.masterBillingAccount = masterBillingAccount;
            return this;
        }

        public Builder masterBillingAccount(@Nullable String masterBillingAccount) {
            this.masterBillingAccount = Input.ofNullable(masterBillingAccount);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder open(@Nullable Input<Boolean> open) {
            this.open = open;
            return this;
        }

        public Builder open(@Nullable Boolean open) {
            this.open = Input.ofNullable(open);
            return this;
        }
        public SubAccountState build() {
            return new SubAccountState(billingAccountId, deletionPolicy, displayName, masterBillingAccount, name, open);
        }
    }
}
