// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackupScheduleResponse {
    /**
     * How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
     * 
     */
    private final Integer frequencyInterval;
    /**
     * The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
     * 
     */
    private final String frequencyUnit;
    /**
     * True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
     * 
     */
    private final Boolean keepAtLeastOneBackup;
    /**
     * Last time when this schedule was triggered.
     * 
     */
    private final String lastExecutionTime;
    /**
     * After how many days backups should be deleted.
     * 
     */
    private final Integer retentionPeriodInDays;
    /**
     * When the schedule should start working.
     * 
     */
    private final @Nullable String startTime;

    @OutputCustomType.Constructor({"frequencyInterval","frequencyUnit","keepAtLeastOneBackup","lastExecutionTime","retentionPeriodInDays","startTime"})
    private BackupScheduleResponse(
        Integer frequencyInterval,
        String frequencyUnit,
        Boolean keepAtLeastOneBackup,
        String lastExecutionTime,
        Integer retentionPeriodInDays,
        @Nullable String startTime) {
        this.frequencyInterval = frequencyInterval;
        this.frequencyUnit = frequencyUnit;
        this.keepAtLeastOneBackup = keepAtLeastOneBackup;
        this.lastExecutionTime = lastExecutionTime;
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.startTime = startTime;
    }

    /**
     * How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
     * 
    */
    public Integer getFrequencyInterval() {
        return this.frequencyInterval;
    }
    /**
     * The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
     * 
    */
    public String getFrequencyUnit() {
        return this.frequencyUnit;
    }
    /**
     * True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
     * 
    */
    public Boolean getKeepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }
    /**
     * Last time when this schedule was triggered.
     * 
    */
    public String getLastExecutionTime() {
        return this.lastExecutionTime;
    }
    /**
     * After how many days backups should be deleted.
     * 
    */
    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }
    /**
     * When the schedule should start working.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer frequencyInterval;
        private String frequencyUnit;
        private Boolean keepAtLeastOneBackup;
        private String lastExecutionTime;
        private Integer retentionPeriodInDays;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInterval = defaults.frequencyInterval;
    	      this.frequencyUnit = defaults.frequencyUnit;
    	      this.keepAtLeastOneBackup = defaults.keepAtLeastOneBackup;
    	      this.lastExecutionTime = defaults.lastExecutionTime;
    	      this.retentionPeriodInDays = defaults.retentionPeriodInDays;
    	      this.startTime = defaults.startTime;
        }

        public Builder setFrequencyInterval(Integer frequencyInterval) {
            this.frequencyInterval = Objects.requireNonNull(frequencyInterval);
            return this;
        }

        public Builder setFrequencyUnit(String frequencyUnit) {
            this.frequencyUnit = Objects.requireNonNull(frequencyUnit);
            return this;
        }

        public Builder setKeepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
            this.keepAtLeastOneBackup = Objects.requireNonNull(keepAtLeastOneBackup);
            return this;
        }

        public Builder setLastExecutionTime(String lastExecutionTime) {
            this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime);
            return this;
        }

        public Builder setRetentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = Objects.requireNonNull(retentionPeriodInDays);
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public BackupScheduleResponse build() {
            return new BackupScheduleResponse(frequencyInterval, frequencyUnit, keepAtLeastOneBackup, lastExecutionTime, retentionPeriodInDays, startTime);
        }
    }
}
