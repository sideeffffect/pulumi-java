// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProductArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductArgs Empty = new GetProductArgs();

    /**
     * Name of the product.
     * 
     */
    @Import(name="productName", required=true)
      private final String productName;

    public String productName() {
        return this.productName;
    }

    /**
     * Name of the Azure Stack registration.
     * 
     */
    @Import(name="registrationName", required=true)
      private final String registrationName;

    public String registrationName() {
        return this.registrationName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroup", required=true)
      private final String resourceGroup;

    public String resourceGroup() {
        return this.resourceGroup;
    }

    public GetProductArgs(
        String productName,
        String registrationName,
        String resourceGroup) {
        this.productName = Objects.requireNonNull(productName, "expected parameter 'productName' to be non-null");
        this.registrationName = Objects.requireNonNull(registrationName, "expected parameter 'registrationName' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
    }

    private GetProductArgs() {
        this.productName = null;
        this.registrationName = null;
        this.resourceGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String productName;
        private String registrationName;
        private String resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productName = defaults.productName;
    	      this.registrationName = defaults.registrationName;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder productName(String productName) {
            this.productName = Objects.requireNonNull(productName);
            return this;
        }
        public Builder registrationName(String registrationName) {
            this.registrationName = Objects.requireNonNull(registrationName);
            return this;
        }
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }        public GetProductArgs build() {
            return new GetProductArgs(productName, registrationName, resourceGroup);
        }
    }
}
