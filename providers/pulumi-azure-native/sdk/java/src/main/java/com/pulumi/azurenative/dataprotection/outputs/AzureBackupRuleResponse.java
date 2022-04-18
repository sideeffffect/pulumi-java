// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.azurenative.dataprotection.outputs.AdhocBasedTriggerContextResponse;
import com.pulumi.azurenative.dataprotection.outputs.AzureBackupParamsResponse;
import com.pulumi.azurenative.dataprotection.outputs.DataStoreInfoBaseResponse;
import com.pulumi.azurenative.dataprotection.outputs.ScheduleBasedTriggerContextResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureBackupRuleResponse {
    /**
     * BackupParameters base
     * 
     */
    private final @Nullable AzureBackupParamsResponse backupParameters;
    /**
     * DataStoreInfo base
     * 
     */
    private final DataStoreInfoBaseResponse dataStore;
    private final String name;
    /**
     * Expected value is 'AzureBackupRule'.
     * 
     */
    private final String objectType;
    /**
     * Trigger context
     * 
     */
    private final Either<AdhocBasedTriggerContextResponse,ScheduleBasedTriggerContextResponse> trigger;

    @CustomType.Constructor
    private AzureBackupRuleResponse(
        @CustomType.Parameter("backupParameters") @Nullable AzureBackupParamsResponse backupParameters,
        @CustomType.Parameter("dataStore") DataStoreInfoBaseResponse dataStore,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("trigger") Either<AdhocBasedTriggerContextResponse,ScheduleBasedTriggerContextResponse> trigger) {
        this.backupParameters = backupParameters;
        this.dataStore = dataStore;
        this.name = name;
        this.objectType = objectType;
        this.trigger = trigger;
    }

    /**
     * BackupParameters base
     * 
    */
    public Optional<AzureBackupParamsResponse> backupParameters() {
        return Optional.ofNullable(this.backupParameters);
    }
    /**
     * DataStoreInfo base
     * 
    */
    public DataStoreInfoBaseResponse dataStore() {
        return this.dataStore;
    }
    public String name() {
        return this.name;
    }
    /**
     * Expected value is 'AzureBackupRule'.
     * 
    */
    public String objectType() {
        return this.objectType;
    }
    /**
     * Trigger context
     * 
    */
    public Either<AdhocBasedTriggerContextResponse,ScheduleBasedTriggerContextResponse> trigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBackupRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureBackupParamsResponse backupParameters;
        private DataStoreInfoBaseResponse dataStore;
        private String name;
        private String objectType;
        private Either<AdhocBasedTriggerContextResponse,ScheduleBasedTriggerContextResponse> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBackupRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupParameters = defaults.backupParameters;
    	      this.dataStore = defaults.dataStore;
    	      this.name = defaults.name;
    	      this.objectType = defaults.objectType;
    	      this.trigger = defaults.trigger;
        }

        public Builder backupParameters(@Nullable AzureBackupParamsResponse backupParameters) {
            this.backupParameters = backupParameters;
            return this;
        }
        public Builder dataStore(DataStoreInfoBaseResponse dataStore) {
            this.dataStore = Objects.requireNonNull(dataStore);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder trigger(Either<AdhocBasedTriggerContextResponse,ScheduleBasedTriggerContextResponse> trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }        public AzureBackupRuleResponse build() {
            return new AzureBackupRuleResponse(backupParameters, dataStore, name, objectType, trigger);
        }
    }
}
