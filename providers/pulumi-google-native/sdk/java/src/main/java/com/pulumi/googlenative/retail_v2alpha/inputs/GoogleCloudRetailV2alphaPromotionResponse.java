// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Promotion information.
 * 
 */
public final class GoogleCloudRetailV2alphaPromotionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaPromotionResponse Empty = new GoogleCloudRetailV2alphaPromotionResponse();

    /**
     * ID of the promotion. For example, &#34;free gift&#34;. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
     * 
     */
    @Import(name="promotionId", required=true)
    private String promotionId;

    public String promotionId() {
        return this.promotionId;
    }

    private GoogleCloudRetailV2alphaPromotionResponse() {}

    private GoogleCloudRetailV2alphaPromotionResponse(GoogleCloudRetailV2alphaPromotionResponse $) {
        this.promotionId = $.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaPromotionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaPromotionResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaPromotionResponse();
        }

        public Builder(GoogleCloudRetailV2alphaPromotionResponse defaults) {
            $ = new GoogleCloudRetailV2alphaPromotionResponse(Objects.requireNonNull(defaults));
        }

        public Builder promotionId(String promotionId) {
            $.promotionId = promotionId;
            return this;
        }

        public GoogleCloudRetailV2alphaPromotionResponse build() {
            $.promotionId = Objects.requireNonNull($.promotionId, "expected parameter 'promotionId' to be non-null");
            return $;
        }
    }

}
