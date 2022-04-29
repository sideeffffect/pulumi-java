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


public final class FhirStoreIamPolicyState extends ResourceArgs {

    public static final FhirStoreIamPolicyState Empty = new FhirStoreIamPolicyState();

    /**
     * (Computed) The etag of the FHIR store&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the FHIR store&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="fhirStoreId")
    private @Nullable Output<String> fhirStoreId;

    /**
     * @return The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    public Optional<Output<String>> fhirStoreId() {
        return Optional.ofNullable(this.fhirStoreId);
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

    private FhirStoreIamPolicyState() {}

    private FhirStoreIamPolicyState(FhirStoreIamPolicyState $) {
        this.etag = $.etag;
        this.fhirStoreId = $.fhirStoreId;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FhirStoreIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirStoreIamPolicyState $;

        public Builder() {
            $ = new FhirStoreIamPolicyState();
        }

        public Builder(FhirStoreIamPolicyState defaults) {
            $ = new FhirStoreIamPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag (Computed) The etag of the FHIR store&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the FHIR store&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param fhirStoreId The FHIR store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
         * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder fhirStoreId(@Nullable Output<String> fhirStoreId) {
            $.fhirStoreId = fhirStoreId;
            return this;
        }

        /**
         * @param fhirStoreId The FHIR store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
         * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder fhirStoreId(String fhirStoreId) {
            return fhirStoreId(Output.of(fhirStoreId));
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

        public FhirStoreIamPolicyState build() {
            return $;
        }
    }

}
