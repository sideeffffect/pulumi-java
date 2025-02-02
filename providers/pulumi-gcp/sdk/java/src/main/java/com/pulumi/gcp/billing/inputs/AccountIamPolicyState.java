// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountIamPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final AccountIamPolicyState Empty = new AccountIamPolicyState();

    /**
     * The billing account id.
     * 
     */
    @Import(name="billingAccountId")
    private @Nullable Output<String> billingAccountId;

    /**
     * @return The billing account id.
     * 
     */
    public Optional<Output<String>> billingAccountId() {
        return Optional.ofNullable(this.billingAccountId);
    }

    /**
     * (Computed) The etag of the billing account&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the billing account&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    /**
     * @return The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    private AccountIamPolicyState() {}

    private AccountIamPolicyState(AccountIamPolicyState $) {
        this.billingAccountId = $.billingAccountId;
        this.etag = $.etag;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountIamPolicyState $;

        public Builder() {
            $ = new AccountIamPolicyState();
        }

        public Builder(AccountIamPolicyState defaults) {
            $ = new AccountIamPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountId The billing account id.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(@Nullable Output<String> billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        /**
         * @param billingAccountId The billing account id.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(String billingAccountId) {
            return billingAccountId(Output.of(billingAccountId));
        }

        /**
         * @param etag (Computed) The etag of the billing account&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the billing account&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param policyData The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public AccountIamPolicyState build() {
            return $;
        }
    }

}
