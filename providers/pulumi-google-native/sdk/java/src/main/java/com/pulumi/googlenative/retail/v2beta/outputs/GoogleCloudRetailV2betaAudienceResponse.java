// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaAudienceResponse {
    /**
     * @return The age groups of the audience. Strongly encouraged to use the standard values: &#34;newborn&#34; (up to 3 months old), &#34;infant&#34; (3–12 months old), &#34;toddler&#34; (1–5 years old), &#34;kids&#34; (5–13 years old), &#34;adult&#34; (typically teens or older). At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [age_group](https://support.google.com/merchants/answer/6324463). Schema.org property [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
     * 
     */
    private final List<String> ageGroups;
    /**
     * @return The genders of the audience. Strongly encouraged to use the standard values: &#34;male&#34;, &#34;female&#34;, &#34;unisex&#34;. At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [gender](https://support.google.com/merchants/answer/6324479). Schema.org property [Product.audience.suggestedGender](https://schema.org/suggestedGender).
     * 
     */
    private final List<String> genders;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaAudienceResponse(
        @CustomType.Parameter("ageGroups") List<String> ageGroups,
        @CustomType.Parameter("genders") List<String> genders) {
        this.ageGroups = ageGroups;
        this.genders = genders;
    }

    /**
     * @return The age groups of the audience. Strongly encouraged to use the standard values: &#34;newborn&#34; (up to 3 months old), &#34;infant&#34; (3–12 months old), &#34;toddler&#34; (1–5 years old), &#34;kids&#34; (5–13 years old), &#34;adult&#34; (typically teens or older). At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [age_group](https://support.google.com/merchants/answer/6324463). Schema.org property [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
     * 
     */
    public List<String> ageGroups() {
        return this.ageGroups;
    }
    /**
     * @return The genders of the audience. Strongly encouraged to use the standard values: &#34;male&#34;, &#34;female&#34;, &#34;unisex&#34;. At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [gender](https://support.google.com/merchants/answer/6324479). Schema.org property [Product.audience.suggestedGender](https://schema.org/suggestedGender).
     * 
     */
    public List<String> genders() {
        return this.genders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaAudienceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ageGroups;
        private List<String> genders;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaAudienceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ageGroups = defaults.ageGroups;
    	      this.genders = defaults.genders;
        }

        public Builder ageGroups(List<String> ageGroups) {
            this.ageGroups = Objects.requireNonNull(ageGroups);
            return this;
        }
        public Builder ageGroups(String... ageGroups) {
            return ageGroups(List.of(ageGroups));
        }
        public Builder genders(List<String> genders) {
            this.genders = Objects.requireNonNull(genders);
            return this;
        }
        public Builder genders(String... genders) {
            return genders(List.of(genders));
        }        public GoogleCloudRetailV2betaAudienceResponse build() {
            return new GoogleCloudRetailV2betaAudienceResponse(ageGroups, genders);
        }
    }
}
