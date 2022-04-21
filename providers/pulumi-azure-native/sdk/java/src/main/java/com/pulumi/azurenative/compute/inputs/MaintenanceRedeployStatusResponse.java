// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Maintenance Operation Status.
 * 
 */
public final class MaintenanceRedeployStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final MaintenanceRedeployStatusResponse Empty = new MaintenanceRedeployStatusResponse();

    /**
     * True, if customer is allowed to perform Maintenance.
     * 
     */
    @Import(name="isCustomerInitiatedMaintenanceAllowed")
    private @Nullable Boolean isCustomerInitiatedMaintenanceAllowed;

    public Optional<Boolean> isCustomerInitiatedMaintenanceAllowed() {
        return Optional.ofNullable(this.isCustomerInitiatedMaintenanceAllowed);
    }

    /**
     * Message returned for the last Maintenance Operation.
     * 
     */
    @Import(name="lastOperationMessage")
    private @Nullable String lastOperationMessage;

    public Optional<String> lastOperationMessage() {
        return Optional.ofNullable(this.lastOperationMessage);
    }

    /**
     * The Last Maintenance Operation Result Code.
     * 
     */
    @Import(name="lastOperationResultCode")
    private @Nullable String lastOperationResultCode;

    public Optional<String> lastOperationResultCode() {
        return Optional.ofNullable(this.lastOperationResultCode);
    }

    /**
     * End Time for the Maintenance Window.
     * 
     */
    @Import(name="maintenanceWindowEndTime")
    private @Nullable String maintenanceWindowEndTime;

    public Optional<String> maintenanceWindowEndTime() {
        return Optional.ofNullable(this.maintenanceWindowEndTime);
    }

    /**
     * Start Time for the Maintenance Window.
     * 
     */
    @Import(name="maintenanceWindowStartTime")
    private @Nullable String maintenanceWindowStartTime;

    public Optional<String> maintenanceWindowStartTime() {
        return Optional.ofNullable(this.maintenanceWindowStartTime);
    }

    /**
     * End Time for the Pre Maintenance Window.
     * 
     */
    @Import(name="preMaintenanceWindowEndTime")
    private @Nullable String preMaintenanceWindowEndTime;

    public Optional<String> preMaintenanceWindowEndTime() {
        return Optional.ofNullable(this.preMaintenanceWindowEndTime);
    }

    /**
     * Start Time for the Pre Maintenance Window.
     * 
     */
    @Import(name="preMaintenanceWindowStartTime")
    private @Nullable String preMaintenanceWindowStartTime;

    public Optional<String> preMaintenanceWindowStartTime() {
        return Optional.ofNullable(this.preMaintenanceWindowStartTime);
    }

    private MaintenanceRedeployStatusResponse() {}

    private MaintenanceRedeployStatusResponse(MaintenanceRedeployStatusResponse $) {
        this.isCustomerInitiatedMaintenanceAllowed = $.isCustomerInitiatedMaintenanceAllowed;
        this.lastOperationMessage = $.lastOperationMessage;
        this.lastOperationResultCode = $.lastOperationResultCode;
        this.maintenanceWindowEndTime = $.maintenanceWindowEndTime;
        this.maintenanceWindowStartTime = $.maintenanceWindowStartTime;
        this.preMaintenanceWindowEndTime = $.preMaintenanceWindowEndTime;
        this.preMaintenanceWindowStartTime = $.preMaintenanceWindowStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceRedeployStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceRedeployStatusResponse $;

        public Builder() {
            $ = new MaintenanceRedeployStatusResponse();
        }

        public Builder(MaintenanceRedeployStatusResponse defaults) {
            $ = new MaintenanceRedeployStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder isCustomerInitiatedMaintenanceAllowed(@Nullable Boolean isCustomerInitiatedMaintenanceAllowed) {
            $.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
            return this;
        }

        public Builder lastOperationMessage(@Nullable String lastOperationMessage) {
            $.lastOperationMessage = lastOperationMessage;
            return this;
        }

        public Builder lastOperationResultCode(@Nullable String lastOperationResultCode) {
            $.lastOperationResultCode = lastOperationResultCode;
            return this;
        }

        public Builder maintenanceWindowEndTime(@Nullable String maintenanceWindowEndTime) {
            $.maintenanceWindowEndTime = maintenanceWindowEndTime;
            return this;
        }

        public Builder maintenanceWindowStartTime(@Nullable String maintenanceWindowStartTime) {
            $.maintenanceWindowStartTime = maintenanceWindowStartTime;
            return this;
        }

        public Builder preMaintenanceWindowEndTime(@Nullable String preMaintenanceWindowEndTime) {
            $.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
            return this;
        }

        public Builder preMaintenanceWindowStartTime(@Nullable String preMaintenanceWindowStartTime) {
            $.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
            return this;
        }

        public MaintenanceRedeployStatusResponse build() {
            return $;
        }
    }

}
