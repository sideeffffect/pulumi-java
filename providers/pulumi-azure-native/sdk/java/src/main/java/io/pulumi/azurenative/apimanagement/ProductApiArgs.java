// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProductApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProductApiArgs Empty = new ProductApiArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @InputImport(name="apiId")
      private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="productId", required=true)
      private final Input<String> productId;

    public Input<String> getProductId() {
        return this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public ProductApiArgs(
        @Nullable Input<String> apiId,
        Input<String> productId,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.apiId = apiId;
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ProductApiArgs() {
        this.apiId = Input.empty();
        this.productId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private Input<String> productId;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.productId = defaults.productId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder apiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder apiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder productId(Input<String> productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder productId(String productId) {
            this.productId = Input.of(Objects.requireNonNull(productId));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serviceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public ProductApiArgs build() {
            return new ProductApiArgs(apiId, productId, resourceGroupName, serviceName);
        }
    }
}
