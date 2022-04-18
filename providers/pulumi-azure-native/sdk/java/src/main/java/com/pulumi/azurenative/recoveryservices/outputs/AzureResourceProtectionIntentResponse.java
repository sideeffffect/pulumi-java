// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureResourceProtectionIntentResponse {
    /**
     * Type of backup management for the backed up item.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * Friendly name of the VM represented by this backup item.
     * 
     */
    private final @Nullable String friendlyName;
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
     * Expected value is 'AzureResourceItem'.
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

    @CustomType.Constructor
    private AzureResourceProtectionIntentResponse(
        @CustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("itemId") @Nullable String itemId,
        @CustomType.Parameter("policyId") @Nullable String policyId,
        @CustomType.Parameter("protectionIntentItemType") String protectionIntentItemType,
        @CustomType.Parameter("protectionState") @Nullable String protectionState,
        @CustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId) {
        this.backupManagementType = backupManagementType;
        this.friendlyName = friendlyName;
        this.itemId = itemId;
        this.policyId = policyId;
        this.protectionIntentItemType = protectionIntentItemType;
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
    }

    /**
     * Type of backup management for the backed up item.
     * 
    */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * Friendly name of the VM represented by this backup item.
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
    */
    public Optional<String> itemId() {
        return Optional.ofNullable(this.itemId);
    }
    /**
     * ID of the backup policy with which this item is backed up.
     * 
    */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * backup protectionIntent type.
     * Expected value is 'AzureResourceItem'.
     * 
    */
    public String protectionIntentItemType() {
        return this.protectionIntentItemType;
    }
    /**
     * Backup state of this backup item.
     * 
    */
    public Optional<String> protectionState() {
        return Optional.ofNullable(this.protectionState);
    }
    /**
     * ARM ID of the resource to be backed up.
     * 
    */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureResourceProtectionIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String friendlyName;
        private @Nullable String itemId;
        private @Nullable String policyId;
        private String protectionIntentItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureResourceProtectionIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.itemId = defaults.itemId;
    	      this.policyId = defaults.policyId;
    	      this.protectionIntentItemType = defaults.protectionIntentItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
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
        }        public AzureResourceProtectionIntentResponse build() {
            return new AzureResourceProtectionIntentResponse(backupManagementType, friendlyName, itemId, policyId, protectionIntentItemType, protectionState, sourceResourceId);
        }
    }
}
