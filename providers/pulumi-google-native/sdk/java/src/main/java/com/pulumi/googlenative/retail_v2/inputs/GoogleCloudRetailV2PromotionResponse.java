// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Promotion information.
 * 
 */
public final class GoogleCloudRetailV2PromotionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2PromotionResponse Empty = new GoogleCloudRetailV2PromotionResponse();

    /**
     * ID of the promotion. For example, "free gift". The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
     * 
     */
    @Import(name="promotionId", required=true)
      private final String promotionId;

    public String promotionId() {
        return this.promotionId;
    }

    public GoogleCloudRetailV2PromotionResponse(String promotionId) {
        this.promotionId = Objects.requireNonNull(promotionId, "expected parameter 'promotionId' to be non-null");
    }

    private GoogleCloudRetailV2PromotionResponse() {
        this.promotionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2PromotionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String promotionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2PromotionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.promotionId = defaults.promotionId;
        }

        public Builder promotionId(String promotionId) {
            this.promotionId = Objects.requireNonNull(promotionId);
            return this;
        }        public GoogleCloudRetailV2PromotionResponse build() {
            return new GoogleCloudRetailV2PromotionResponse(promotionId);
        }
    }
}
