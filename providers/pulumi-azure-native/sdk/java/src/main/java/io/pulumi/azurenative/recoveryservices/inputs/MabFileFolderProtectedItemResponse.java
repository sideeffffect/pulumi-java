// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.MabFileFolderProtectedItemExtendedInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MAB workload-specific backup item.
 * 
 */
public final class MabFileFolderProtectedItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final MabFileFolderProtectedItemResponse Empty = new MabFileFolderProtectedItemResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @InputImport(name="backupManagementType")
      private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @InputImport(name="backupSetName")
      private final @Nullable String backupSetName;

    public Optional<String> getBackupSetName() {
        return this.backupSetName == null ? Optional.empty() : Optional.ofNullable(this.backupSetName);
    }

    /**
     * Name of the computer associated with this backup item.
     * 
     */
    @InputImport(name="computerName")
      private final @Nullable String computerName;

    public Optional<String> getComputerName() {
        return this.computerName == null ? Optional.empty() : Optional.ofNullable(this.computerName);
    }

    /**
     * Unique name of container
     * 
     */
    @InputImport(name="containerName")
      private final @Nullable String containerName;

    public Optional<String> getContainerName() {
        return this.containerName == null ? Optional.empty() : Optional.ofNullable(this.containerName);
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @InputImport(name="createMode")
      private final @Nullable String createMode;

    public Optional<String> getCreateMode() {
        return this.createMode == null ? Optional.empty() : Optional.ofNullable(this.createMode);
    }

    /**
     * Sync time for deferred deletion in UTC
     * 
     */
    @InputImport(name="deferredDeleteSyncTimeInUTC")
      private final @Nullable Double deferredDeleteSyncTimeInUTC;

    public Optional<Double> getDeferredDeleteSyncTimeInUTC() {
        return this.deferredDeleteSyncTimeInUTC == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteSyncTimeInUTC);
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @InputImport(name="deferredDeleteTimeInUTC")
      private final @Nullable String deferredDeleteTimeInUTC;

    public Optional<String> getDeferredDeleteTimeInUTC() {
        return this.deferredDeleteTimeInUTC == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @InputImport(name="deferredDeleteTimeRemaining")
      private final @Nullable String deferredDeleteTimeRemaining;

    public Optional<String> getDeferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }

    /**
     * Additional information with this backup item.
     * 
     */
    @InputImport(name="extendedInfo")
      private final @Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo;

    public Optional<MabFileFolderProtectedItemExtendedInfoResponse> getExtendedInfo() {
        return this.extendedInfo == null ? Optional.empty() : Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of this backup item.
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @InputImport(name="isDeferredDeleteScheduleUpcoming")
      private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;

    public Optional<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming == null ? Optional.empty() : Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @InputImport(name="isRehydrate")
      private final @Nullable Boolean isRehydrate;

    public Optional<Boolean> getIsRehydrate() {
        return this.isRehydrate == null ? Optional.empty() : Optional.ofNullable(this.isRehydrate);
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @InputImport(name="isScheduledForDeferredDelete")
      private final @Nullable Boolean isScheduledForDeferredDelete;

    public Optional<Boolean> getIsScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete == null ? Optional.empty() : Optional.ofNullable(this.isScheduledForDeferredDelete);
    }

    /**
     * Status of last backup operation.
     * 
     */
    @InputImport(name="lastBackupStatus")
      private final @Nullable String lastBackupStatus;

    public Optional<String> getLastBackupStatus() {
        return this.lastBackupStatus == null ? Optional.empty() : Optional.ofNullable(this.lastBackupStatus);
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @InputImport(name="lastBackupTime")
      private final @Nullable String lastBackupTime;

    public Optional<String> getLastBackupTime() {
        return this.lastBackupTime == null ? Optional.empty() : Optional.ofNullable(this.lastBackupTime);
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @InputImport(name="lastRecoveryPoint")
      private final @Nullable String lastRecoveryPoint;

    public Optional<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.lastRecoveryPoint);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @InputImport(name="policyId")
      private final @Nullable String policyId;

    public Optional<String> getPolicyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    /**
     * backup item type.
     * Expected value is 'MabFileFolderProtectedItem'.
     * 
     */
    @InputImport(name="protectedItemType", required=true)
      private final String protectedItemType;

    public String getProtectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Protected, ProtectionStopped, IRPending or ProtectionError
     * 
     */
    @InputImport(name="protectionState")
      private final @Nullable String protectionState;

    public Optional<String> getProtectionState() {
        return this.protectionState == null ? Optional.empty() : Optional.ofNullable(this.protectionState);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @InputImport(name="sourceResourceId")
      private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @InputImport(name="workloadType")
      private final @Nullable String workloadType;

    public Optional<String> getWorkloadType() {
        return this.workloadType == null ? Optional.empty() : Optional.ofNullable(this.workloadType);
    }

    public MabFileFolderProtectedItemResponse(
        @Nullable String backupManagementType,
        @Nullable String backupSetName,
        @Nullable String computerName,
        @Nullable String containerName,
        @Nullable String createMode,
        @Nullable Double deferredDeleteSyncTimeInUTC,
        @Nullable String deferredDeleteTimeInUTC,
        @Nullable String deferredDeleteTimeRemaining,
        @Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @Nullable Boolean isRehydrate,
        @Nullable Boolean isScheduledForDeferredDelete,
        @Nullable String lastBackupStatus,
        @Nullable String lastBackupTime,
        @Nullable String lastRecoveryPoint,
        @Nullable String policyId,
        String protectedItemType,
        @Nullable String protectionState,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.computerName = computerName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteSyncTimeInUTC = deferredDeleteSyncTimeInUTC;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private MabFileFolderProtectedItemResponse() {
        this.backupManagementType = null;
        this.backupSetName = null;
        this.computerName = null;
        this.containerName = null;
        this.createMode = null;
        this.deferredDeleteSyncTimeInUTC = null;
        this.deferredDeleteTimeInUTC = null;
        this.deferredDeleteTimeRemaining = null;
        this.extendedInfo = null;
        this.friendlyName = null;
        this.isDeferredDeleteScheduleUpcoming = null;
        this.isRehydrate = null;
        this.isScheduledForDeferredDelete = null;
        this.lastBackupStatus = null;
        this.lastBackupTime = null;
        this.lastRecoveryPoint = null;
        this.policyId = null;
        this.protectedItemType = null;
        this.protectionState = null;
        this.sourceResourceId = null;
        this.workloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabFileFolderProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String computerName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable Double deferredDeleteSyncTimeInUTC;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastBackupTime;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String policyId;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(MabFileFolderProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.computerName = defaults.computerName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteSyncTimeInUTC = defaults.deferredDeleteSyncTimeInUTC;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder backupSetName(@Nullable String backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder computerName(@Nullable String computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder createMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder deferredDeleteSyncTimeInUTC(@Nullable Double deferredDeleteSyncTimeInUTC) {
            this.deferredDeleteSyncTimeInUTC = deferredDeleteSyncTimeInUTC;
            return this;
        }

        public Builder deferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder deferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder extendedInfo(@Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder isRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder isScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder lastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder lastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder protectedItemType(String protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder protectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder workloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public MabFileFolderProtectedItemResponse build() {
            return new MabFileFolderProtectedItemResponse(backupManagementType, backupSetName, computerName, containerName, createMode, deferredDeleteSyncTimeInUTC, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, lastBackupStatus, lastBackupTime, lastRecoveryPoint, policyId, protectedItemType, protectionState, sourceResourceId, workloadType);
        }
    }
}
