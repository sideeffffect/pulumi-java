// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConsentStoreIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreIamPolicyArgs Empty = new ConsentStoreIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="consentStoreId", required=true)
      private final Input<String> consentStoreId;

    public Input<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="dataset", required=true)
      private final Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
      private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    public ConsentStoreIamPolicyArgs(
        Input<String> consentStoreId,
        Input<String> dataset,
        Input<String> policyData) {
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private ConsentStoreIamPolicyArgs() {
        this.consentStoreId = Input.empty();
        this.dataset = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> consentStoreId;
        private Input<String> dataset;
        private Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.dataset = defaults.dataset;
    	      this.policyData = defaults.policyData;
        }

        public Builder consentStoreId(Input<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Input.of(Objects.requireNonNull(consentStoreId));
            return this;
        }

        public Builder dataset(Input<String> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder dataset(String dataset) {
            this.dataset = Input.of(Objects.requireNonNull(dataset));
            return this;
        }

        public Builder policyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder policyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }
        public ConsentStoreIamPolicyArgs build() {
            return new ConsentStoreIamPolicyArgs(consentStoreId, dataset, policyData);
        }
    }
}
