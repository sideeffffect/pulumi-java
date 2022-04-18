// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProductArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductArgs Empty = new GetProductArgs();

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="productId", required=true)
      private final String productId;

    public String productId() {
        return this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    public GetProductArgs(
        String productId,
        String resourceGroupName,
        String serviceName) {
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetProductArgs() {
        this.productId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String productId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productId = defaults.productId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetProductArgs build() {
            return new GetProductArgs(productId, resourceGroupName, serviceName);
        }
    }
}
