// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="billingAccountId")
      private final @Nullable Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId == null ? Codegen.empty() : this.billingAccountId;
    }

    /**
     * If set to "RENAME_ON_DESTROY" the billing account display_name
     * will be changed to "Destroyed" along with a timestamp.  If set to "" this will not occur.
     * Default is "".
     * 
     */
    @Import(name="deletionPolicy")
      private final @Nullable Output<String> deletionPolicy;

    public Output<String> deletionPolicy() {
        return this.deletionPolicy == null ? Codegen.empty() : this.deletionPolicy;
    }

    /**
     * The display name of the billing account.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The name of the master billing account that the subaccount
     * will be created under in the form `{billing_account_id}` or `billingAccounts/{billing_account_id}`.
     * 
     */
    @Import(name="masterBillingAccount")
      private final @Nullable Output<String> masterBillingAccount;

    public Output<String> masterBillingAccount() {
        return this.masterBillingAccount == null ? Codegen.empty() : this.masterBillingAccount;
    }

    /**
     * The resource name of the billing account in the form `billingAccounts/{billing_account_id}`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * `true` if the billing account is open, `false` if the billing account is closed.
     * 
     */
    @Import(name="open")
      private final @Nullable Output<Boolean> open;

    public Output<Boolean> open() {
        return this.open == null ? Codegen.empty() : this.open;
    }

    public SubAccountState(
        @Nullable Output<String> billingAccountId,
        @Nullable Output<String> deletionPolicy,
        @Nullable Output<String> displayName,
        @Nullable Output<String> masterBillingAccount,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> open) {
        this.billingAccountId = billingAccountId;
        this.deletionPolicy = deletionPolicy;
        this.displayName = displayName;
        this.masterBillingAccount = masterBillingAccount;
        this.name = name;
        this.open = open;
    }

    private SubAccountState() {
        this.billingAccountId = Codegen.empty();
        this.deletionPolicy = Codegen.empty();
        this.displayName = Codegen.empty();
        this.masterBillingAccount = Codegen.empty();
        this.name = Codegen.empty();
        this.open = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> billingAccountId;
        private @Nullable Output<String> deletionPolicy;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> masterBillingAccount;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> open;

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

        public Builder billingAccountId(@Nullable Output<String> billingAccountId) {
            this.billingAccountId = billingAccountId;
            return this;
        }
        public Builder billingAccountId(@Nullable String billingAccountId) {
            this.billingAccountId = Codegen.ofNullable(billingAccountId);
            return this;
        }
        public Builder deletionPolicy(@Nullable Output<String> deletionPolicy) {
            this.deletionPolicy = deletionPolicy;
            return this;
        }
        public Builder deletionPolicy(@Nullable String deletionPolicy) {
            this.deletionPolicy = Codegen.ofNullable(deletionPolicy);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder masterBillingAccount(@Nullable Output<String> masterBillingAccount) {
            this.masterBillingAccount = masterBillingAccount;
            return this;
        }
        public Builder masterBillingAccount(@Nullable String masterBillingAccount) {
            this.masterBillingAccount = Codegen.ofNullable(masterBillingAccount);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder open(@Nullable Output<Boolean> open) {
            this.open = open;
            return this;
        }
        public Builder open(@Nullable Boolean open) {
            this.open = Codegen.ofNullable(open);
            return this;
        }        public SubAccountState build() {
            return new SubAccountState(billingAccountId, deletionPolicy, displayName, masterBillingAccount, name, open);
        }
    }
}
