// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsentStoreIamPolicyState extends ResourceArgs {

    public static final ConsentStoreIamPolicyState Empty = new ConsentStoreIamPolicyState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="consentStoreId")
    private @Nullable Output<String> consentStoreId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Optional<Output<String>> consentStoreId() {
        return Optional.ofNullable(this.consentStoreId);
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    private ConsentStoreIamPolicyState() {}

    private ConsentStoreIamPolicyState(ConsentStoreIamPolicyState $) {
        this.consentStoreId = $.consentStoreId;
        this.dataset = $.dataset;
        this.etag = $.etag;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsentStoreIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsentStoreIamPolicyState $;

        public Builder() {
            $ = new ConsentStoreIamPolicyState();
        }

        public Builder(ConsentStoreIamPolicyState defaults) {
            $ = new ConsentStoreIamPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param consentStoreId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(@Nullable Output<String> consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        /**
         * @param consentStoreId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(String consentStoreId) {
            return consentStoreId(Output.of(consentStoreId));
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public ConsentStoreIamPolicyState build() {
            return $;
        }
    }

}
