// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gkebackup.v1.outputs.RestoreConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRestoreResult {
    /**
     * @return Immutable. A reference to the Backup used as the source from which this Restore will restore. Note that this Backup must be a sub-resource of the RestorePlan&#39;s backup_plan. Format: projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*.
     * 
     */
    private final String backup;
    /**
     * @return The target cluster into which this Restore will restore data. Valid formats: - projects/*{@literal /}locations/*{@literal /}clusters/* - projects/*{@literal /}zones/*{@literal /}clusters/* Inherited from parent RestorePlan&#39;s cluster value.
     * 
     */
    private final String cluster;
    /**
     * @return Timestamp of when the restore operation completed.
     * 
     */
    private final String completeTime;
    /**
     * @return The timestamp when this Restore resource was created.
     * 
     */
    private final String createTime;
    /**
     * @return User specified descriptive string for this Restore.
     * 
     */
    private final String description;
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a restore from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform restore updates in order to avoid race conditions: An `etag` is returned in the response to `GetRestore`, and systems are expected to put that etag in the request to `UpdateRestore` or `DeleteRestore` to ensure that their change will be applied to the same version of the resource.
     * 
     */
    private final String etag;
    /**
     * @return A set of custom labels supplied by user.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The full name of the Restore resource. Format: projects/*{@literal /}locations/*{@literal /}restorePlans/*{@literal /}restores/*
     * 
     */
    private final String name;
    /**
     * @return Number of resources excluded during the restore execution.
     * 
     */
    private final Integer resourcesExcludedCount;
    /**
     * @return Number of resources that failed to be restored during the restore execution.
     * 
     */
    private final Integer resourcesFailedCount;
    /**
     * @return Number of resources restored during the restore execution.
     * 
     */
    private final Integer resourcesRestoredCount;
    /**
     * @return Configuration of the Restore. Inherited from parent RestorePlan&#39;s restore_config.
     * 
     */
    private final RestoreConfigResponse restoreConfig;
    /**
     * @return The current state of the Restore.
     * 
     */
    private final String state;
    /**
     * @return Human-readable description of why the Restore is in its current state.
     * 
     */
    private final String stateReason;
    /**
     * @return Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
     * 
     */
    private final String uid;
    /**
     * @return The timestamp when this Restore resource was last updated.
     * 
     */
    private final String updateTime;
    /**
     * @return Number of volumes restored during the restore execution.
     * 
     */
    private final Integer volumesRestoredCount;

    @CustomType.Constructor
    private GetRestoreResult(
        @CustomType.Parameter("backup") String backup,
        @CustomType.Parameter("cluster") String cluster,
        @CustomType.Parameter("completeTime") String completeTime,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourcesExcludedCount") Integer resourcesExcludedCount,
        @CustomType.Parameter("resourcesFailedCount") Integer resourcesFailedCount,
        @CustomType.Parameter("resourcesRestoredCount") Integer resourcesRestoredCount,
        @CustomType.Parameter("restoreConfig") RestoreConfigResponse restoreConfig,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateReason") String stateReason,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("volumesRestoredCount") Integer volumesRestoredCount) {
        this.backup = backup;
        this.cluster = cluster;
        this.completeTime = completeTime;
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.name = name;
        this.resourcesExcludedCount = resourcesExcludedCount;
        this.resourcesFailedCount = resourcesFailedCount;
        this.resourcesRestoredCount = resourcesRestoredCount;
        this.restoreConfig = restoreConfig;
        this.state = state;
        this.stateReason = stateReason;
        this.uid = uid;
        this.updateTime = updateTime;
        this.volumesRestoredCount = volumesRestoredCount;
    }

    /**
     * @return Immutable. A reference to the Backup used as the source from which this Restore will restore. Note that this Backup must be a sub-resource of the RestorePlan&#39;s backup_plan. Format: projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*.
     * 
     */
    public String backup() {
        return this.backup;
    }
    /**
     * @return The target cluster into which this Restore will restore data. Valid formats: - projects/*{@literal /}locations/*{@literal /}clusters/* - projects/*{@literal /}zones/*{@literal /}clusters/* Inherited from parent RestorePlan&#39;s cluster value.
     * 
     */
    public String cluster() {
        return this.cluster;
    }
    /**
     * @return Timestamp of when the restore operation completed.
     * 
     */
    public String completeTime() {
        return this.completeTime;
    }
    /**
     * @return The timestamp when this Restore resource was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return User specified descriptive string for this Restore.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a restore from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform restore updates in order to avoid race conditions: An `etag` is returned in the response to `GetRestore`, and systems are expected to put that etag in the request to `UpdateRestore` or `DeleteRestore` to ensure that their change will be applied to the same version of the resource.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return A set of custom labels supplied by user.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The full name of the Restore resource. Format: projects/*{@literal /}locations/*{@literal /}restorePlans/*{@literal /}restores/*
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of resources excluded during the restore execution.
     * 
     */
    public Integer resourcesExcludedCount() {
        return this.resourcesExcludedCount;
    }
    /**
     * @return Number of resources that failed to be restored during the restore execution.
     * 
     */
    public Integer resourcesFailedCount() {
        return this.resourcesFailedCount;
    }
    /**
     * @return Number of resources restored during the restore execution.
     * 
     */
    public Integer resourcesRestoredCount() {
        return this.resourcesRestoredCount;
    }
    /**
     * @return Configuration of the Restore. Inherited from parent RestorePlan&#39;s restore_config.
     * 
     */
    public RestoreConfigResponse restoreConfig() {
        return this.restoreConfig;
    }
    /**
     * @return The current state of the Restore.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Human-readable description of why the Restore is in its current state.
     * 
     */
    public String stateReason() {
        return this.stateReason;
    }
    /**
     * @return Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The timestamp when this Restore resource was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return Number of volumes restored during the restore execution.
     * 
     */
    public Integer volumesRestoredCount() {
        return this.volumesRestoredCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backup;
        private String cluster;
        private String completeTime;
        private String createTime;
        private String description;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private Integer resourcesExcludedCount;
        private Integer resourcesFailedCount;
        private Integer resourcesRestoredCount;
        private RestoreConfigResponse restoreConfig;
        private String state;
        private String stateReason;
        private String uid;
        private String updateTime;
        private Integer volumesRestoredCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.cluster = defaults.cluster;
    	      this.completeTime = defaults.completeTime;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.resourcesExcludedCount = defaults.resourcesExcludedCount;
    	      this.resourcesFailedCount = defaults.resourcesFailedCount;
    	      this.resourcesRestoredCount = defaults.resourcesRestoredCount;
    	      this.restoreConfig = defaults.restoreConfig;
    	      this.state = defaults.state;
    	      this.stateReason = defaults.stateReason;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.volumesRestoredCount = defaults.volumesRestoredCount;
        }

        public Builder backup(String backup) {
            this.backup = Objects.requireNonNull(backup);
            return this;
        }
        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder completeTime(String completeTime) {
            this.completeTime = Objects.requireNonNull(completeTime);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourcesExcludedCount(Integer resourcesExcludedCount) {
            this.resourcesExcludedCount = Objects.requireNonNull(resourcesExcludedCount);
            return this;
        }
        public Builder resourcesFailedCount(Integer resourcesFailedCount) {
            this.resourcesFailedCount = Objects.requireNonNull(resourcesFailedCount);
            return this;
        }
        public Builder resourcesRestoredCount(Integer resourcesRestoredCount) {
            this.resourcesRestoredCount = Objects.requireNonNull(resourcesRestoredCount);
            return this;
        }
        public Builder restoreConfig(RestoreConfigResponse restoreConfig) {
            this.restoreConfig = Objects.requireNonNull(restoreConfig);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateReason(String stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder volumesRestoredCount(Integer volumesRestoredCount) {
            this.volumesRestoredCount = Objects.requireNonNull(volumesRestoredCount);
            return this;
        }        public GetRestoreResult build() {
            return new GetRestoreResult(backup, cluster, completeTime, createTime, description, etag, labels, name, resourcesExcludedCount, resourcesFailedCount, resourcesRestoredCount, restoreConfig, state, stateReason, uid, updateTime, volumesRestoredCount);
        }
    }
}
