// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.marketplace.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateStoreCollectionOfferArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateStoreCollectionOfferArgs Empty = new GetPrivateStoreCollectionOfferArgs();

    /**
     * The collection ID
     * 
     */
    @Import(name="collectionId", required=true)
    private String collectionId;

    public String collectionId() {
        return this.collectionId;
    }

    /**
     * The offer ID to update or delete
     * 
     */
    @Import(name="offerId", required=true)
    private String offerId;

    public String offerId() {
        return this.offerId;
    }

    /**
     * The store ID - must use the tenant ID
     * 
     */
    @Import(name="privateStoreId", required=true)
    private String privateStoreId;

    public String privateStoreId() {
        return this.privateStoreId;
    }

    private GetPrivateStoreCollectionOfferArgs() {}

    private GetPrivateStoreCollectionOfferArgs(GetPrivateStoreCollectionOfferArgs $) {
        this.collectionId = $.collectionId;
        this.offerId = $.offerId;
        this.privateStoreId = $.privateStoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateStoreCollectionOfferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateStoreCollectionOfferArgs $;

        public Builder() {
            $ = new GetPrivateStoreCollectionOfferArgs();
        }

        public Builder(GetPrivateStoreCollectionOfferArgs defaults) {
            $ = new GetPrivateStoreCollectionOfferArgs(Objects.requireNonNull(defaults));
        }

        public Builder collectionId(String collectionId) {
            $.collectionId = collectionId;
            return this;
        }

        public Builder offerId(String offerId) {
            $.offerId = offerId;
            return this;
        }

        public Builder privateStoreId(String privateStoreId) {
            $.privateStoreId = privateStoreId;
            return this;
        }

        public GetPrivateStoreCollectionOfferArgs build() {
            $.collectionId = Objects.requireNonNull($.collectionId, "expected parameter 'collectionId' to be non-null");
            $.offerId = Objects.requireNonNull($.offerId, "expected parameter 'offerId' to be non-null");
            $.privateStoreId = Objects.requireNonNull($.privateStoreId, "expected parameter 'privateStoreId' to be non-null");
            return $;
        }
    }

}
