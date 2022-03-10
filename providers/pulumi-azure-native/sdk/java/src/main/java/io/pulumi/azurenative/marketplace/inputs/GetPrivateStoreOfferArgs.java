// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateStoreOfferArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateStoreOfferArgs Empty = new GetPrivateStoreOfferArgs();

    /**
     * The offer ID to update or delete
     * 
     */
    @InputImport(name="offerId", required=true)
      private final String offerId;

    public String getOfferId() {
        return this.offerId;
    }

    /**
     * The store ID - must use the tenant ID
     * 
     */
    @InputImport(name="privateStoreId", required=true)
      private final String privateStoreId;

    public String getPrivateStoreId() {
        return this.privateStoreId;
    }

    public GetPrivateStoreOfferArgs(
        String offerId,
        String privateStoreId) {
        this.offerId = Objects.requireNonNull(offerId, "expected parameter 'offerId' to be non-null");
        this.privateStoreId = Objects.requireNonNull(privateStoreId, "expected parameter 'privateStoreId' to be non-null");
    }

    private GetPrivateStoreOfferArgs() {
        this.offerId = null;
        this.privateStoreId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateStoreOfferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String offerId;
        private String privateStoreId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateStoreOfferArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offerId = defaults.offerId;
    	      this.privateStoreId = defaults.privateStoreId;
        }

        public Builder offerId(String offerId) {
            this.offerId = Objects.requireNonNull(offerId);
            return this;
        }

        public Builder privateStoreId(String privateStoreId) {
            this.privateStoreId = Objects.requireNonNull(privateStoreId);
            return this;
        }
        public GetPrivateStoreOfferArgs build() {
            return new GetPrivateStoreOfferArgs(offerId, privateStoreId);
        }
    }
}
