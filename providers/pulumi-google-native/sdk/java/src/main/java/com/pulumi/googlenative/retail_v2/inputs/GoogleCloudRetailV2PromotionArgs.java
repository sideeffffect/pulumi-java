// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Promotion information.
 * 
 */
public final class GoogleCloudRetailV2PromotionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2PromotionArgs Empty = new GoogleCloudRetailV2PromotionArgs();

    /**
     * ID of the promotion. For example, &#34;free gift&#34;. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
     * 
     */
    @Import(name="promotionId")
    private @Nullable Output<String> promotionId;

    public Optional<Output<String>> promotionId() {
        return Optional.ofNullable(this.promotionId);
    }

    private GoogleCloudRetailV2PromotionArgs() {}

    private GoogleCloudRetailV2PromotionArgs(GoogleCloudRetailV2PromotionArgs $) {
        this.promotionId = $.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2PromotionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2PromotionArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2PromotionArgs();
        }

        public Builder(GoogleCloudRetailV2PromotionArgs defaults) {
            $ = new GoogleCloudRetailV2PromotionArgs(Objects.requireNonNull(defaults));
        }

        public Builder promotionId(@Nullable Output<String> promotionId) {
            $.promotionId = promotionId;
            return this;
        }

        public Builder promotionId(String promotionId) {
            return promotionId(Output.of(promotionId));
        }

        public GoogleCloudRetailV2PromotionArgs build() {
            return $;
        }
    }

}
