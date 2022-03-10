// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.ErrorDetailResponse;
import io.pulumi.azurenative.edgeorder.outputs.ForwardShippingDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.PreferencesResponse;
import io.pulumi.azurenative.edgeorder.outputs.ProductDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.ResourceProviderDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.ReverseShippingDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.StageDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrderItemDetailsResponse {
    /**
     * Cancellation reason.
     * 
     */
    private final String cancellationReason;
    /**
     * Describes whether the order item is cancellable or not.
     * 
     */
    private final String cancellationStatus;
    /**
     * Current Order item Status
     * 
     */
    private final StageDetailsResponse currentStage;
    /**
     * Describes whether the order item is deletable or not.
     * 
     */
    private final String deletionStatus;
    /**
     * Top level error for the job.
     * 
     */
    private final ErrorDetailResponse error;
    /**
     * Forward Package Shipping details
     * 
     */
    private final ForwardShippingDetailsResponse forwardShippingDetails;
    /**
     * Parent RP details - this returns only the first or default parent RP from the entire list
     * 
     */
    private final ResourceProviderDetailsResponse managementRpDetails;
    /**
     * List of parent RP details supported for configuration.
     * 
     */
    private final List<ResourceProviderDetailsResponse> managementRpDetailsList;
    /**
     * Additional notification email list
     * 
     */
    private final @Nullable List<String> notificationEmailList;
    /**
     * Order item status history
     * 
     */
    private final List<StageDetailsResponse> orderItemStageHistory;
    /**
     * Order item type.
     * 
     */
    private final String orderItemType;
    /**
     * Customer notification Preferences
     * 
     */
    private final @Nullable PreferencesResponse preferences;
    /**
     * Unique identifier for configuration.
     * 
     */
    private final ProductDetailsResponse productDetails;
    /**
     * Return reason.
     * 
     */
    private final String returnReason;
    /**
     * Describes whether the order item is returnable or not.
     * 
     */
    private final String returnStatus;
    /**
     * Reverse Package Shipping details
     * 
     */
    private final ReverseShippingDetailsResponse reverseShippingDetails;

    @OutputCustomType.Constructor
    private OrderItemDetailsResponse(
        @OutputCustomType.Parameter("cancellationReason") String cancellationReason,
        @OutputCustomType.Parameter("cancellationStatus") String cancellationStatus,
        @OutputCustomType.Parameter("currentStage") StageDetailsResponse currentStage,
        @OutputCustomType.Parameter("deletionStatus") String deletionStatus,
        @OutputCustomType.Parameter("error") ErrorDetailResponse error,
        @OutputCustomType.Parameter("forwardShippingDetails") ForwardShippingDetailsResponse forwardShippingDetails,
        @OutputCustomType.Parameter("managementRpDetails") ResourceProviderDetailsResponse managementRpDetails,
        @OutputCustomType.Parameter("managementRpDetailsList") List<ResourceProviderDetailsResponse> managementRpDetailsList,
        @OutputCustomType.Parameter("notificationEmailList") @Nullable List<String> notificationEmailList,
        @OutputCustomType.Parameter("orderItemStageHistory") List<StageDetailsResponse> orderItemStageHistory,
        @OutputCustomType.Parameter("orderItemType") String orderItemType,
        @OutputCustomType.Parameter("preferences") @Nullable PreferencesResponse preferences,
        @OutputCustomType.Parameter("productDetails") ProductDetailsResponse productDetails,
        @OutputCustomType.Parameter("returnReason") String returnReason,
        @OutputCustomType.Parameter("returnStatus") String returnStatus,
        @OutputCustomType.Parameter("reverseShippingDetails") ReverseShippingDetailsResponse reverseShippingDetails) {
        this.cancellationReason = cancellationReason;
        this.cancellationStatus = cancellationStatus;
        this.currentStage = currentStage;
        this.deletionStatus = deletionStatus;
        this.error = error;
        this.forwardShippingDetails = forwardShippingDetails;
        this.managementRpDetails = managementRpDetails;
        this.managementRpDetailsList = managementRpDetailsList;
        this.notificationEmailList = notificationEmailList;
        this.orderItemStageHistory = orderItemStageHistory;
        this.orderItemType = orderItemType;
        this.preferences = preferences;
        this.productDetails = productDetails;
        this.returnReason = returnReason;
        this.returnStatus = returnStatus;
        this.reverseShippingDetails = reverseShippingDetails;
    }

    /**
     * Cancellation reason.
     * 
    */
    public String getCancellationReason() {
        return this.cancellationReason;
    }
    /**
     * Describes whether the order item is cancellable or not.
     * 
    */
    public String getCancellationStatus() {
        return this.cancellationStatus;
    }
    /**
     * Current Order item Status
     * 
    */
    public StageDetailsResponse getCurrentStage() {
        return this.currentStage;
    }
    /**
     * Describes whether the order item is deletable or not.
     * 
    */
    public String getDeletionStatus() {
        return this.deletionStatus;
    }
    /**
     * Top level error for the job.
     * 
    */
    public ErrorDetailResponse getError() {
        return this.error;
    }
    /**
     * Forward Package Shipping details
     * 
    */
    public ForwardShippingDetailsResponse getForwardShippingDetails() {
        return this.forwardShippingDetails;
    }
    /**
     * Parent RP details - this returns only the first or default parent RP from the entire list
     * 
    */
    public ResourceProviderDetailsResponse getManagementRpDetails() {
        return this.managementRpDetails;
    }
    /**
     * List of parent RP details supported for configuration.
     * 
    */
    public List<ResourceProviderDetailsResponse> getManagementRpDetailsList() {
        return this.managementRpDetailsList;
    }
    /**
     * Additional notification email list
     * 
    */
    public List<String> getNotificationEmailList() {
        return this.notificationEmailList == null ? List.of() : this.notificationEmailList;
    }
    /**
     * Order item status history
     * 
    */
    public List<StageDetailsResponse> getOrderItemStageHistory() {
        return this.orderItemStageHistory;
    }
    /**
     * Order item type.
     * 
    */
    public String getOrderItemType() {
        return this.orderItemType;
    }
    /**
     * Customer notification Preferences
     * 
    */
    public Optional<PreferencesResponse> getPreferences() {
        return Optional.ofNullable(this.preferences);
    }
    /**
     * Unique identifier for configuration.
     * 
    */
    public ProductDetailsResponse getProductDetails() {
        return this.productDetails;
    }
    /**
     * Return reason.
     * 
    */
    public String getReturnReason() {
        return this.returnReason;
    }
    /**
     * Describes whether the order item is returnable or not.
     * 
    */
    public String getReturnStatus() {
        return this.returnStatus;
    }
    /**
     * Reverse Package Shipping details
     * 
    */
    public ReverseShippingDetailsResponse getReverseShippingDetails() {
        return this.reverseShippingDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderItemDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cancellationReason;
        private String cancellationStatus;
        private StageDetailsResponse currentStage;
        private String deletionStatus;
        private ErrorDetailResponse error;
        private ForwardShippingDetailsResponse forwardShippingDetails;
        private ResourceProviderDetailsResponse managementRpDetails;
        private List<ResourceProviderDetailsResponse> managementRpDetailsList;
        private @Nullable List<String> notificationEmailList;
        private List<StageDetailsResponse> orderItemStageHistory;
        private String orderItemType;
        private @Nullable PreferencesResponse preferences;
        private ProductDetailsResponse productDetails;
        private String returnReason;
        private String returnStatus;
        private ReverseShippingDetailsResponse reverseShippingDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderItemDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cancellationReason = defaults.cancellationReason;
    	      this.cancellationStatus = defaults.cancellationStatus;
    	      this.currentStage = defaults.currentStage;
    	      this.deletionStatus = defaults.deletionStatus;
    	      this.error = defaults.error;
    	      this.forwardShippingDetails = defaults.forwardShippingDetails;
    	      this.managementRpDetails = defaults.managementRpDetails;
    	      this.managementRpDetailsList = defaults.managementRpDetailsList;
    	      this.notificationEmailList = defaults.notificationEmailList;
    	      this.orderItemStageHistory = defaults.orderItemStageHistory;
    	      this.orderItemType = defaults.orderItemType;
    	      this.preferences = defaults.preferences;
    	      this.productDetails = defaults.productDetails;
    	      this.returnReason = defaults.returnReason;
    	      this.returnStatus = defaults.returnStatus;
    	      this.reverseShippingDetails = defaults.reverseShippingDetails;
        }

        public Builder cancellationReason(String cancellationReason) {
            this.cancellationReason = Objects.requireNonNull(cancellationReason);
            return this;
        }

        public Builder cancellationStatus(String cancellationStatus) {
            this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
            return this;
        }

        public Builder currentStage(StageDetailsResponse currentStage) {
            this.currentStage = Objects.requireNonNull(currentStage);
            return this;
        }

        public Builder deletionStatus(String deletionStatus) {
            this.deletionStatus = Objects.requireNonNull(deletionStatus);
            return this;
        }

        public Builder error(ErrorDetailResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder forwardShippingDetails(ForwardShippingDetailsResponse forwardShippingDetails) {
            this.forwardShippingDetails = Objects.requireNonNull(forwardShippingDetails);
            return this;
        }

        public Builder managementRpDetails(ResourceProviderDetailsResponse managementRpDetails) {
            this.managementRpDetails = Objects.requireNonNull(managementRpDetails);
            return this;
        }

        public Builder managementRpDetailsList(List<ResourceProviderDetailsResponse> managementRpDetailsList) {
            this.managementRpDetailsList = Objects.requireNonNull(managementRpDetailsList);
            return this;
        }

        public Builder notificationEmailList(@Nullable List<String> notificationEmailList) {
            this.notificationEmailList = notificationEmailList;
            return this;
        }

        public Builder orderItemStageHistory(List<StageDetailsResponse> orderItemStageHistory) {
            this.orderItemStageHistory = Objects.requireNonNull(orderItemStageHistory);
            return this;
        }

        public Builder orderItemType(String orderItemType) {
            this.orderItemType = Objects.requireNonNull(orderItemType);
            return this;
        }

        public Builder preferences(@Nullable PreferencesResponse preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder productDetails(ProductDetailsResponse productDetails) {
            this.productDetails = Objects.requireNonNull(productDetails);
            return this;
        }

        public Builder returnReason(String returnReason) {
            this.returnReason = Objects.requireNonNull(returnReason);
            return this;
        }

        public Builder returnStatus(String returnStatus) {
            this.returnStatus = Objects.requireNonNull(returnStatus);
            return this;
        }

        public Builder reverseShippingDetails(ReverseShippingDetailsResponse reverseShippingDetails) {
            this.reverseShippingDetails = Objects.requireNonNull(reverseShippingDetails);
            return this;
        }
        public OrderItemDetailsResponse build() {
            return new OrderItemDetailsResponse(cancellationReason, cancellationStatus, currentStage, deletionStatus, error, forwardShippingDetails, managementRpDetails, managementRpDetailsList, notificationEmailList, orderItemStageHistory, orderItemType, preferences, productDetails, returnReason, returnStatus, reverseShippingDetails);
        }
    }
}
