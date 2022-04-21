// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Purchase plan configuration for platform image.
 * 
 */
public final class PlatformImagePurchasePlanResponse extends com.pulumi.resources.InvokeArgs {

    public static final PlatformImagePurchasePlanResponse Empty = new PlatformImagePurchasePlanResponse();

    /**
     * Name of the purchase plan.
     * 
     */
    @Import(name="planName", required=true)
    private String planName;

    public String planName() {
        return this.planName;
    }

    /**
     * Product of the purchase plan.
     * 
     */
    @Import(name="planProduct", required=true)
    private String planProduct;

    public String planProduct() {
        return this.planProduct;
    }

    /**
     * Publisher of the purchase plan.
     * 
     */
    @Import(name="planPublisher", required=true)
    private String planPublisher;

    public String planPublisher() {
        return this.planPublisher;
    }

    private PlatformImagePurchasePlanResponse() {}

    private PlatformImagePurchasePlanResponse(PlatformImagePurchasePlanResponse $) {
        this.planName = $.planName;
        this.planProduct = $.planProduct;
        this.planPublisher = $.planPublisher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlatformImagePurchasePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlatformImagePurchasePlanResponse $;

        public Builder() {
            $ = new PlatformImagePurchasePlanResponse();
        }

        public Builder(PlatformImagePurchasePlanResponse defaults) {
            $ = new PlatformImagePurchasePlanResponse(Objects.requireNonNull(defaults));
        }

        public Builder planName(String planName) {
            $.planName = planName;
            return this;
        }

        public Builder planProduct(String planProduct) {
            $.planProduct = planProduct;
            return this;
        }

        public Builder planPublisher(String planPublisher) {
            $.planPublisher = planPublisher;
            return this;
        }

        public PlatformImagePurchasePlanResponse build() {
            $.planName = Objects.requireNonNull($.planName, "expected parameter 'planName' to be non-null");
            $.planProduct = Objects.requireNonNull($.planProduct, "expected parameter 'planProduct' to be non-null");
            $.planPublisher = Objects.requireNonNull($.planPublisher, "expected parameter 'planPublisher' to be non-null");
            return $;
        }
    }

}
