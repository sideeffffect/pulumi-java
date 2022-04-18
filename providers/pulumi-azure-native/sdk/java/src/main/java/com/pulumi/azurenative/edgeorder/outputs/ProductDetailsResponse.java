// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.azurenative.edgeorder.outputs.DeviceDetailsResponse;
import com.pulumi.azurenative.edgeorder.outputs.DisplayInfoResponse;
import com.pulumi.azurenative.edgeorder.outputs.HierarchyInformationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProductDetailsResponse {
    /**
     * Quantity of the product
     * 
     */
    private final Integer count;
    /**
     * list of device details
     * 
     */
    private final List<DeviceDetailsResponse> deviceDetails;
    /**
     * Display details of the product
     * 
     */
    private final @Nullable DisplayInfoResponse displayInfo;
    /**
     * Hierarchy of the product which uniquely identifies the product
     * 
     */
    private final HierarchyInformationResponse hierarchyInformation;
    /**
     * Double encryption status of the configuration. Read-only field.
     * 
     */
    private final String productDoubleEncryptionStatus;

    @CustomType.Constructor
    private ProductDetailsResponse(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("deviceDetails") List<DeviceDetailsResponse> deviceDetails,
        @CustomType.Parameter("displayInfo") @Nullable DisplayInfoResponse displayInfo,
        @CustomType.Parameter("hierarchyInformation") HierarchyInformationResponse hierarchyInformation,
        @CustomType.Parameter("productDoubleEncryptionStatus") String productDoubleEncryptionStatus) {
        this.count = count;
        this.deviceDetails = deviceDetails;
        this.displayInfo = displayInfo;
        this.hierarchyInformation = hierarchyInformation;
        this.productDoubleEncryptionStatus = productDoubleEncryptionStatus;
    }

    /**
     * Quantity of the product
     * 
    */
    public Integer count() {
        return this.count;
    }
    /**
     * list of device details
     * 
    */
    public List<DeviceDetailsResponse> deviceDetails() {
        return this.deviceDetails;
    }
    /**
     * Display details of the product
     * 
    */
    public Optional<DisplayInfoResponse> displayInfo() {
        return Optional.ofNullable(this.displayInfo);
    }
    /**
     * Hierarchy of the product which uniquely identifies the product
     * 
    */
    public HierarchyInformationResponse hierarchyInformation() {
        return this.hierarchyInformation;
    }
    /**
     * Double encryption status of the configuration. Read-only field.
     * 
    */
    public String productDoubleEncryptionStatus() {
        return this.productDoubleEncryptionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private List<DeviceDetailsResponse> deviceDetails;
        private @Nullable DisplayInfoResponse displayInfo;
        private HierarchyInformationResponse hierarchyInformation;
        private String productDoubleEncryptionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.deviceDetails = defaults.deviceDetails;
    	      this.displayInfo = defaults.displayInfo;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.productDoubleEncryptionStatus = defaults.productDoubleEncryptionStatus;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder deviceDetails(List<DeviceDetailsResponse> deviceDetails) {
            this.deviceDetails = Objects.requireNonNull(deviceDetails);
            return this;
        }
        public Builder deviceDetails(DeviceDetailsResponse... deviceDetails) {
            return deviceDetails(List.of(deviceDetails));
        }
        public Builder displayInfo(@Nullable DisplayInfoResponse displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public Builder hierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }
        public Builder productDoubleEncryptionStatus(String productDoubleEncryptionStatus) {
            this.productDoubleEncryptionStatus = Objects.requireNonNull(productDoubleEncryptionStatus);
            return this;
        }        public ProductDetailsResponse build() {
            return new ProductDetailsResponse(count, deviceDetails, displayInfo, hierarchyInformation, productDoubleEncryptionStatus);
        }
    }
}
