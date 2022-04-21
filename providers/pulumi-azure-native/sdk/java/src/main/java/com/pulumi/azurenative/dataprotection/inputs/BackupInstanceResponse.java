// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.DatasourceResponse;
import com.pulumi.azurenative.dataprotection.inputs.DatasourceSetResponse;
import com.pulumi.azurenative.dataprotection.inputs.PolicyInfoResponse;
import com.pulumi.azurenative.dataprotection.inputs.ProtectionStatusDetailsResponse;
import com.pulumi.azurenative.dataprotection.inputs.UserFacingErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backup Instance
 * 
 */
public final class BackupInstanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackupInstanceResponse Empty = new BackupInstanceResponse();

    /**
     * Specifies the current protection state of the resource
     * 
     */
    @Import(name="currentProtectionState", required=true)
    private String currentProtectionState;

    public String currentProtectionState() {
        return this.currentProtectionState;
    }

    /**
     * Gets or sets the data source information.
     * 
     */
    @Import(name="dataSourceInfo", required=true)
    private DatasourceResponse dataSourceInfo;

    public DatasourceResponse dataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * Gets or sets the data source set information.
     * 
     */
    @Import(name="dataSourceSetInfo")
    private @Nullable DatasourceSetResponse dataSourceSetInfo;

    public Optional<DatasourceSetResponse> dataSourceSetInfo() {
        return Optional.ofNullable(this.dataSourceSetInfo);
    }

    /**
     * Gets or sets the Backup Instance friendly name.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    @Import(name="objectType", required=true)
    private String objectType;

    public String objectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the policy information.
     * 
     */
    @Import(name="policyInfo", required=true)
    private PolicyInfoResponse policyInfo;

    public PolicyInfoResponse policyInfo() {
        return this.policyInfo;
    }

    /**
     * Specifies the protection error of the resource
     * 
     */
    @Import(name="protectionErrorDetails", required=true)
    private UserFacingErrorResponse protectionErrorDetails;

    public UserFacingErrorResponse protectionErrorDetails() {
        return this.protectionErrorDetails;
    }

    /**
     * Specifies the protection status of the resource
     * 
     */
    @Import(name="protectionStatus", required=true)
    private ProtectionStatusDetailsResponse protectionStatus;

    public ProtectionStatusDetailsResponse protectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Specifies the provisioning state of the resource i.e. provisioning/updating/Succeeded/Failed
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    private BackupInstanceResponse() {}

    private BackupInstanceResponse(BackupInstanceResponse $) {
        this.currentProtectionState = $.currentProtectionState;
        this.dataSourceInfo = $.dataSourceInfo;
        this.dataSourceSetInfo = $.dataSourceSetInfo;
        this.friendlyName = $.friendlyName;
        this.objectType = $.objectType;
        this.policyInfo = $.policyInfo;
        this.protectionErrorDetails = $.protectionErrorDetails;
        this.protectionStatus = $.protectionStatus;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupInstanceResponse $;

        public Builder() {
            $ = new BackupInstanceResponse();
        }

        public Builder(BackupInstanceResponse defaults) {
            $ = new BackupInstanceResponse(Objects.requireNonNull(defaults));
        }

        public Builder currentProtectionState(String currentProtectionState) {
            $.currentProtectionState = currentProtectionState;
            return this;
        }

        public Builder dataSourceInfo(DatasourceResponse dataSourceInfo) {
            $.dataSourceInfo = dataSourceInfo;
            return this;
        }

        public Builder dataSourceSetInfo(@Nullable DatasourceSetResponse dataSourceSetInfo) {
            $.dataSourceSetInfo = dataSourceSetInfo;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        public Builder objectType(String objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder policyInfo(PolicyInfoResponse policyInfo) {
            $.policyInfo = policyInfo;
            return this;
        }

        public Builder protectionErrorDetails(UserFacingErrorResponse protectionErrorDetails) {
            $.protectionErrorDetails = protectionErrorDetails;
            return this;
        }

        public Builder protectionStatus(ProtectionStatusDetailsResponse protectionStatus) {
            $.protectionStatus = protectionStatus;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public BackupInstanceResponse build() {
            $.currentProtectionState = Objects.requireNonNull($.currentProtectionState, "expected parameter 'currentProtectionState' to be non-null");
            $.dataSourceInfo = Objects.requireNonNull($.dataSourceInfo, "expected parameter 'dataSourceInfo' to be non-null");
            $.objectType = Objects.requireNonNull($.objectType, "expected parameter 'objectType' to be non-null");
            $.policyInfo = Objects.requireNonNull($.policyInfo, "expected parameter 'policyInfo' to be non-null");
            $.protectionErrorDetails = Objects.requireNonNull($.protectionErrorDetails, "expected parameter 'protectionErrorDetails' to be non-null");
            $.protectionStatus = Objects.requireNonNull($.protectionStatus, "expected parameter 'protectionStatus' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
