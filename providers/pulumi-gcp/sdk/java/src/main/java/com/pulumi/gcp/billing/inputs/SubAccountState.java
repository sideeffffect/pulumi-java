// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubAccountState extends com.pulumi.resources.ResourceArgs {

    public static final SubAccountState Empty = new SubAccountState();

    /**
     * The billing account id.
     * 
     */
    @Import(name="billingAccountId")
    private @Nullable Output<String> billingAccountId;

    public Optional<Output<String>> billingAccountId() {
        return Optional.ofNullable(this.billingAccountId);
    }

    /**
     * If set to &#34;RENAME_ON_DESTROY&#34; the billing account display_name
     * will be changed to &#34;Destroyed&#34; along with a timestamp.  If set to &#34;&#34; this will not occur.
     * Default is &#34;&#34;.
     * 
     */
    @Import(name="deletionPolicy")
    private @Nullable Output<String> deletionPolicy;

    public Optional<Output<String>> deletionPolicy() {
        return Optional.ofNullable(this.deletionPolicy);
    }

    /**
     * The display name of the billing account.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the master billing account that the subaccount
     * will be created under in the form `{billing_account_id}` or `billingAccounts/{billing_account_id}`.
     * 
     */
    @Import(name="masterBillingAccount")
    private @Nullable Output<String> masterBillingAccount;

    public Optional<Output<String>> masterBillingAccount() {
        return Optional.ofNullable(this.masterBillingAccount);
    }

    /**
     * The resource name of the billing account in the form `billingAccounts/{billing_account_id}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `true` if the billing account is open, `false` if the billing account is closed.
     * 
     */
    @Import(name="open")
    private @Nullable Output<Boolean> open;

    public Optional<Output<Boolean>> open() {
        return Optional.ofNullable(this.open);
    }

    private SubAccountState() {}

    private SubAccountState(SubAccountState $) {
        this.billingAccountId = $.billingAccountId;
        this.deletionPolicy = $.deletionPolicy;
        this.displayName = $.displayName;
        this.masterBillingAccount = $.masterBillingAccount;
        this.name = $.name;
        this.open = $.open;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubAccountState $;

        public Builder() {
            $ = new SubAccountState();
        }

        public Builder(SubAccountState defaults) {
            $ = new SubAccountState(Objects.requireNonNull(defaults));
        }

        public Builder billingAccountId(@Nullable Output<String> billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        public Builder billingAccountId(String billingAccountId) {
            return billingAccountId(Output.of(billingAccountId));
        }

        public Builder deletionPolicy(@Nullable Output<String> deletionPolicy) {
            $.deletionPolicy = deletionPolicy;
            return this;
        }

        public Builder deletionPolicy(String deletionPolicy) {
            return deletionPolicy(Output.of(deletionPolicy));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder masterBillingAccount(@Nullable Output<String> masterBillingAccount) {
            $.masterBillingAccount = masterBillingAccount;
            return this;
        }

        public Builder masterBillingAccount(String masterBillingAccount) {
            return masterBillingAccount(Output.of(masterBillingAccount));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder open(@Nullable Output<Boolean> open) {
            $.open = open;
            return this;
        }

        public Builder open(Boolean open) {
            return open(Output.of(open));
        }

        public SubAccountState build() {
            return $;
        }
    }

}
