// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureWorkloadSQLAutoProtectionIntentResponse {
    /**
     * Type of backup management for the backed up item.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    private final @Nullable String itemId;
    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    private final @Nullable String policyId;
    /**
     * backup protectionIntent type.
     * Expected value is 'AzureWorkloadSQLAutoProtectionIntent'.
     * 
     */
    private final String protectionIntentItemType;
    /**
     * Backup state of this backup item.
     * 
     */
    private final @Nullable String protectionState;
    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    private final @Nullable String sourceResourceId;
    /**
     * Workload item type of the item for which intent is to be set
     * 
     */
    private final @Nullable String workloadItemType;

    @OutputCustomType.Constructor
    private AzureWorkloadSQLAutoProtectionIntentResponse(
        @OutputCustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @OutputCustomType.Parameter("itemId") @Nullable String itemId,
        @OutputCustomType.Parameter("policyId") @Nullable String policyId,
        @OutputCustomType.Parameter("protectionIntentItemType") String protectionIntentItemType,
        @OutputCustomType.Parameter("protectionState") @Nullable String protectionState,
        @OutputCustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId,
        @OutputCustomType.Parameter("workloadItemType") @Nullable String workloadItemType) {
        this.backupManagementType = backupManagementType;
        this.itemId = itemId;
        this.policyId = policyId;
        this.protectionIntentItemType = protectionIntentItemType;
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadItemType = workloadItemType;
    }

    /**
     * Type of backup management for the backed up item.
     * 
    */
    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
    */
    public Optional<String> getItemId() {
        return Optional.ofNullable(this.itemId);
    }
    /**
     * ID of the backup policy with which this item is backed up.
     * 
    */
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * backup protectionIntent type.
     * Expected value is 'AzureWorkloadSQLAutoProtectionIntent'.
     * 
    */
    public String getProtectionIntentItemType() {
        return this.protectionIntentItemType;
    }
    /**
     * Backup state of this backup item.
     * 
    */
    public Optional<String> getProtectionState() {
        return Optional.ofNullable(this.protectionState);
    }
    /**
     * ARM ID of the resource to be backed up.
     * 
    */
    public Optional<String> getSourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    /**
     * Workload item type of the item for which intent is to be set
     * 
    */
    public Optional<String> getWorkloadItemType() {
        return Optional.ofNullable(this.workloadItemType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureWorkloadSQLAutoProtectionIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String itemId;
        private @Nullable String policyId;
        private String protectionIntentItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadItemType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureWorkloadSQLAutoProtectionIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.itemId = defaults.itemId;
    	      this.policyId = defaults.policyId;
    	      this.protectionIntentItemType = defaults.protectionIntentItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadItemType = defaults.workloadItemType;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder itemId(@Nullable String itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder protectionIntentItemType(String protectionIntentItemType) {
            this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType);
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

        public Builder workloadItemType(@Nullable String workloadItemType) {
            this.workloadItemType = workloadItemType;
            return this;
        }
        public AzureWorkloadSQLAutoProtectionIntentResponse build() {
            return new AzureWorkloadSQLAutoProtectionIntentResponse(backupManagementType, itemId, policyId, protectionIntentItemType, protectionState, sourceResourceId, workloadItemType);
        }
    }
}
