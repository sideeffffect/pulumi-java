// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudchannel.v1.outputs.GoogleCloudChannelV1AssociationInfoResponse;
import com.pulumi.googlenative.cloudchannel.v1.outputs.GoogleCloudChannelV1CommitmentSettingsResponse;
import com.pulumi.googlenative.cloudchannel.v1.outputs.GoogleCloudChannelV1ParameterResponse;
import com.pulumi.googlenative.cloudchannel.v1.outputs.GoogleCloudChannelV1ProvisionedServiceResponse;
import com.pulumi.googlenative.cloudchannel.v1.outputs.GoogleCloudChannelV1TrialSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEntitlementResult {
    /**
     * @return Association information to other entitlements.
     * 
     */
    private final GoogleCloudChannelV1AssociationInfoResponse associationInfo;
    /**
     * @return Commitment settings for a commitment-based Offer. Required for commitment based offers.
     * 
     */
    private final GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings;
    /**
     * @return The time at which the entitlement is created.
     * 
     */
    private final String createTime;
    /**
     * @return Resource name of an entitlement in the form: accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
     * 
     */
    private final String name;
    /**
     * @return The offer resource name for which the entitlement is to be created. Takes the form: accounts/{account_id}/offers/{offer_id}.
     * 
     */
    private final String offer;
    /**
     * @return Extended entitlement parameters. When creating an entitlement, valid parameter names and values are defined in the Offer.parameter_definitions. The response may include the following output-only Parameters: - assigned_units: The number of licenses assigned to users. - max_units: The maximum assignable units for a flexible offer. - num_units: The total commitment for commitment-based offers.
     * 
     */
    private final List<GoogleCloudChannelV1ParameterResponse> parameters;
    /**
     * @return Service provisioning details for the entitlement.
     * 
     */
    private final GoogleCloudChannelV1ProvisionedServiceResponse provisionedService;
    /**
     * @return Current provisioning state of the entitlement.
     * 
     */
    private final String provisioningState;
    /**
     * @return Optional. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters. This is only supported for Google Workspace entitlements.
     * 
     */
    private final String purchaseOrderId;
    /**
     * @return Enumerable of all current suspension reasons for an entitlement.
     * 
     */
    private final List<String> suspensionReasons;
    /**
     * @return Settings for trial offers.
     * 
     */
    private final GoogleCloudChannelV1TrialSettingsResponse trialSettings;
    /**
     * @return The time at which the entitlement is updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetEntitlementResult(
        @CustomType.Parameter("associationInfo") GoogleCloudChannelV1AssociationInfoResponse associationInfo,
        @CustomType.Parameter("commitmentSettings") GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("offer") String offer,
        @CustomType.Parameter("parameters") List<GoogleCloudChannelV1ParameterResponse> parameters,
        @CustomType.Parameter("provisionedService") GoogleCloudChannelV1ProvisionedServiceResponse provisionedService,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("purchaseOrderId") String purchaseOrderId,
        @CustomType.Parameter("suspensionReasons") List<String> suspensionReasons,
        @CustomType.Parameter("trialSettings") GoogleCloudChannelV1TrialSettingsResponse trialSettings,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.associationInfo = associationInfo;
        this.commitmentSettings = commitmentSettings;
        this.createTime = createTime;
        this.name = name;
        this.offer = offer;
        this.parameters = parameters;
        this.provisionedService = provisionedService;
        this.provisioningState = provisioningState;
        this.purchaseOrderId = purchaseOrderId;
        this.suspensionReasons = suspensionReasons;
        this.trialSettings = trialSettings;
        this.updateTime = updateTime;
    }

    /**
     * @return Association information to other entitlements.
     * 
     */
    public GoogleCloudChannelV1AssociationInfoResponse associationInfo() {
        return this.associationInfo;
    }
    /**
     * @return Commitment settings for a commitment-based Offer. Required for commitment based offers.
     * 
     */
    public GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings() {
        return this.commitmentSettings;
    }
    /**
     * @return The time at which the entitlement is created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Resource name of an entitlement in the form: accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The offer resource name for which the entitlement is to be created. Takes the form: accounts/{account_id}/offers/{offer_id}.
     * 
     */
    public String offer() {
        return this.offer;
    }
    /**
     * @return Extended entitlement parameters. When creating an entitlement, valid parameter names and values are defined in the Offer.parameter_definitions. The response may include the following output-only Parameters: - assigned_units: The number of licenses assigned to users. - max_units: The maximum assignable units for a flexible offer. - num_units: The total commitment for commitment-based offers.
     * 
     */
    public List<GoogleCloudChannelV1ParameterResponse> parameters() {
        return this.parameters;
    }
    /**
     * @return Service provisioning details for the entitlement.
     * 
     */
    public GoogleCloudChannelV1ProvisionedServiceResponse provisionedService() {
        return this.provisionedService;
    }
    /**
     * @return Current provisioning state of the entitlement.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Optional. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters. This is only supported for Google Workspace entitlements.
     * 
     */
    public String purchaseOrderId() {
        return this.purchaseOrderId;
    }
    /**
     * @return Enumerable of all current suspension reasons for an entitlement.
     * 
     */
    public List<String> suspensionReasons() {
        return this.suspensionReasons;
    }
    /**
     * @return Settings for trial offers.
     * 
     */
    public GoogleCloudChannelV1TrialSettingsResponse trialSettings() {
        return this.trialSettings;
    }
    /**
     * @return The time at which the entitlement is updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntitlementResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1AssociationInfoResponse associationInfo;
        private GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings;
        private String createTime;
        private String name;
        private String offer;
        private List<GoogleCloudChannelV1ParameterResponse> parameters;
        private GoogleCloudChannelV1ProvisionedServiceResponse provisionedService;
        private String provisioningState;
        private String purchaseOrderId;
        private List<String> suspensionReasons;
        private GoogleCloudChannelV1TrialSettingsResponse trialSettings;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntitlementResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationInfo = defaults.associationInfo;
    	      this.commitmentSettings = defaults.commitmentSettings;
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.offer = defaults.offer;
    	      this.parameters = defaults.parameters;
    	      this.provisionedService = defaults.provisionedService;
    	      this.provisioningState = defaults.provisioningState;
    	      this.purchaseOrderId = defaults.purchaseOrderId;
    	      this.suspensionReasons = defaults.suspensionReasons;
    	      this.trialSettings = defaults.trialSettings;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder associationInfo(GoogleCloudChannelV1AssociationInfoResponse associationInfo) {
            this.associationInfo = Objects.requireNonNull(associationInfo);
            return this;
        }
        public Builder commitmentSettings(GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings) {
            this.commitmentSettings = Objects.requireNonNull(commitmentSettings);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder offer(String offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }
        public Builder parameters(List<GoogleCloudChannelV1ParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GoogleCloudChannelV1ParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder provisionedService(GoogleCloudChannelV1ProvisionedServiceResponse provisionedService) {
            this.provisionedService = Objects.requireNonNull(provisionedService);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder purchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = Objects.requireNonNull(purchaseOrderId);
            return this;
        }
        public Builder suspensionReasons(List<String> suspensionReasons) {
            this.suspensionReasons = Objects.requireNonNull(suspensionReasons);
            return this;
        }
        public Builder suspensionReasons(String... suspensionReasons) {
            return suspensionReasons(List.of(suspensionReasons));
        }
        public Builder trialSettings(GoogleCloudChannelV1TrialSettingsResponse trialSettings) {
            this.trialSettings = Objects.requireNonNull(trialSettings);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetEntitlementResult build() {
            return new GetEntitlementResult(associationInfo, commitmentSettings, createTime, name, offer, parameters, provisionedService, provisioningState, purchaseOrderId, suspensionReasons, trialSettings, updateTime);
        }
    }
}
