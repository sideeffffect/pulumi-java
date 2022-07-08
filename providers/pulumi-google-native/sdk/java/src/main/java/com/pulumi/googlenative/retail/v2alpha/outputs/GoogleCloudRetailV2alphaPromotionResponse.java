// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2alphaPromotionResponse {
    /**
     * @return Promotion identifier, which is the final component of name. For example, this field is &#34;free_gift&#34;, if name is `projects/*{@literal /}locations/global/catalogs/default_catalog/promotions/free_gift`. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Corresponds to Google Merchant Center property [promotion_id](https://support.google.com/merchants/answer/7050148).
     * 
     */
    private final String promotionId;

    @CustomType.Constructor
    private GoogleCloudRetailV2alphaPromotionResponse(@CustomType.Parameter("promotionId") String promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * @return Promotion identifier, which is the final component of name. For example, this field is &#34;free_gift&#34;, if name is `projects/*{@literal /}locations/global/catalogs/default_catalog/promotions/free_gift`. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Corresponds to Google Merchant Center property [promotion_id](https://support.google.com/merchants/answer/7050148).
     * 
     */
    public String promotionId() {
        return this.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaPromotionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String promotionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaPromotionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.promotionId = defaults.promotionId;
        }

        public Builder promotionId(String promotionId) {
            this.promotionId = Objects.requireNonNull(promotionId);
            return this;
        }        public GoogleCloudRetailV2alphaPromotionResponse build() {
            return new GoogleCloudRetailV2alphaPromotionResponse(promotionId);
        }
    }
}
