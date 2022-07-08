// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gkebackup.v1.outputs.ClusterMetadataResponse;
import com.pulumi.googlenative.gkebackup.v1.outputs.EncryptionKeyResponse;
import com.pulumi.googlenative.gkebackup.v1.outputs.NamespacedNamesResponse;
import com.pulumi.googlenative.gkebackup.v1.outputs.NamespacesResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBackupResult {
    /**
     * @return If True, all namespaces were included in the Backup.
     * 
     */
    private final Boolean allNamespaces;
    /**
     * @return Information about the GKE cluster from which this Backup was created.
     * 
     */
    private final ClusterMetadataResponse clusterMetadata;
    /**
     * @return Completion time of the Backup
     * 
     */
    private final String completeTime;
    /**
     * @return The size of the config backup in bytes.
     * 
     */
    private final String configBackupSizeBytes;
    /**
     * @return Whether or not the Backup contains Kubernetes Secrets. Controlled by the parent BackupPlan&#39;s include_secrets value.
     * 
     */
    private final Boolean containsSecrets;
    /**
     * @return Whether or not the Backup contains volume data. Controlled by the parent BackupPlan&#39;s include_volume_data value.
     * 
     */
    private final Boolean containsVolumeData;
    /**
     * @return The timestamp when this Backup resource was created.
     * 
     */
    private final String createTime;
    /**
     * @return Minimum age for this Backup (in days). If this field is set to a non-zero value, the Backup will be &#34;locked&#34; against deletion (either manual or automatic deletion) for the number of days provided (measured from the creation time of the Backup). MUST be an integer value between 0-90 (inclusive). Defaults to parent BackupPlan&#39;s backup_delete_lock_days setting and may only be increased (either at creation time or in a subsequent update).
     * 
     */
    private final Integer deleteLockDays;
    /**
     * @return The time at which an existing delete lock will expire for this backup (calculated from create_time + delete_lock_days).
     * 
     */
    private final String deleteLockExpireTime;
    /**
     * @return User specified descriptive string for this Backup.
     * 
     */
    private final String description;
    /**
     * @return The customer managed encryption key that was used to encrypt the Backup&#39;s artifacts. Inherited from the parent BackupPlan&#39;s encryption_key value.
     * 
     */
    private final EncryptionKeyResponse encryptionKey;
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a backup from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform backup updates in order to avoid race conditions: An `etag` is returned in the response to `GetBackup`, and systems are expected to put that etag in the request to `UpdateBackup` or `DeleteBackup` to ensure that their change will be applied to the same version of the resource.
     * 
     */
    private final String etag;
    /**
     * @return A set of custom labels supplied by user.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return This flag indicates whether this Backup resource was created manually by a user or via a schedule in the BackupPlan. A value of True means that the Backup was created manually.
     * 
     */
    private final Boolean manual;
    /**
     * @return The fully qualified name of the Backup. projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*
     * 
     */
    private final String name;
    /**
     * @return The total number of Kubernetes Pods contained in the Backup.
     * 
     */
    private final Integer podCount;
    /**
     * @return The total number of Kubernetes resources included in the Backup.
     * 
     */
    private final Integer resourceCount;
    /**
     * @return The age (in days) after which this Backup will be automatically deleted. Must be an integer value &gt;= 0: - If 0, no automatic deletion will occur for this Backup. - If not 0, this must be &gt;= delete_lock_days. Once a Backup is created, this value may only be increased. Defaults to the parent BackupPlan&#39;s backup_retain_days value.
     * 
     */
    private final Integer retainDays;
    /**
     * @return The time at which this Backup will be automatically deleted (calculated from create_time + retain_days).
     * 
     */
    private final String retainExpireTime;
    /**
     * @return If set, the list of ProtectedApplications whose resources were included in the Backup.
     * 
     */
    private final NamespacedNamesResponse selectedApplications;
    /**
     * @return If set, the list of namespaces that were included in the Backup.
     * 
     */
    private final NamespacesResponse selectedNamespaces;
    /**
     * @return The total size of the Backup in bytes = config backup size + sum(volume backup sizes)
     * 
     */
    private final String sizeBytes;
    /**
     * @return Current state of the Backup
     * 
     */
    private final String state;
    /**
     * @return Human-readable description of why the backup is in the current `state`.
     * 
     */
    private final String stateReason;
    /**
     * @return Server generated global unique identifier of [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
     * 
     */
    private final String uid;
    /**
     * @return The timestamp when this Backup resource was last updated.
     * 
     */
    private final String updateTime;
    /**
     * @return The total number of volume backups contained in the Backup.
     * 
     */
    private final Integer volumeCount;

    @CustomType.Constructor
    private GetBackupResult(
        @CustomType.Parameter("allNamespaces") Boolean allNamespaces,
        @CustomType.Parameter("clusterMetadata") ClusterMetadataResponse clusterMetadata,
        @CustomType.Parameter("completeTime") String completeTime,
        @CustomType.Parameter("configBackupSizeBytes") String configBackupSizeBytes,
        @CustomType.Parameter("containsSecrets") Boolean containsSecrets,
        @CustomType.Parameter("containsVolumeData") Boolean containsVolumeData,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteLockDays") Integer deleteLockDays,
        @CustomType.Parameter("deleteLockExpireTime") String deleteLockExpireTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("encryptionKey") EncryptionKeyResponse encryptionKey,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("manual") Boolean manual,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("podCount") Integer podCount,
        @CustomType.Parameter("resourceCount") Integer resourceCount,
        @CustomType.Parameter("retainDays") Integer retainDays,
        @CustomType.Parameter("retainExpireTime") String retainExpireTime,
        @CustomType.Parameter("selectedApplications") NamespacedNamesResponse selectedApplications,
        @CustomType.Parameter("selectedNamespaces") NamespacesResponse selectedNamespaces,
        @CustomType.Parameter("sizeBytes") String sizeBytes,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateReason") String stateReason,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("volumeCount") Integer volumeCount) {
        this.allNamespaces = allNamespaces;
        this.clusterMetadata = clusterMetadata;
        this.completeTime = completeTime;
        this.configBackupSizeBytes = configBackupSizeBytes;
        this.containsSecrets = containsSecrets;
        this.containsVolumeData = containsVolumeData;
        this.createTime = createTime;
        this.deleteLockDays = deleteLockDays;
        this.deleteLockExpireTime = deleteLockExpireTime;
        this.description = description;
        this.encryptionKey = encryptionKey;
        this.etag = etag;
        this.labels = labels;
        this.manual = manual;
        this.name = name;
        this.podCount = podCount;
        this.resourceCount = resourceCount;
        this.retainDays = retainDays;
        this.retainExpireTime = retainExpireTime;
        this.selectedApplications = selectedApplications;
        this.selectedNamespaces = selectedNamespaces;
        this.sizeBytes = sizeBytes;
        this.state = state;
        this.stateReason = stateReason;
        this.uid = uid;
        this.updateTime = updateTime;
        this.volumeCount = volumeCount;
    }

    /**
     * @return If True, all namespaces were included in the Backup.
     * 
     */
    public Boolean allNamespaces() {
        return this.allNamespaces;
    }
    /**
     * @return Information about the GKE cluster from which this Backup was created.
     * 
     */
    public ClusterMetadataResponse clusterMetadata() {
        return this.clusterMetadata;
    }
    /**
     * @return Completion time of the Backup
     * 
     */
    public String completeTime() {
        return this.completeTime;
    }
    /**
     * @return The size of the config backup in bytes.
     * 
     */
    public String configBackupSizeBytes() {
        return this.configBackupSizeBytes;
    }
    /**
     * @return Whether or not the Backup contains Kubernetes Secrets. Controlled by the parent BackupPlan&#39;s include_secrets value.
     * 
     */
    public Boolean containsSecrets() {
        return this.containsSecrets;
    }
    /**
     * @return Whether or not the Backup contains volume data. Controlled by the parent BackupPlan&#39;s include_volume_data value.
     * 
     */
    public Boolean containsVolumeData() {
        return this.containsVolumeData;
    }
    /**
     * @return The timestamp when this Backup resource was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Minimum age for this Backup (in days). If this field is set to a non-zero value, the Backup will be &#34;locked&#34; against deletion (either manual or automatic deletion) for the number of days provided (measured from the creation time of the Backup). MUST be an integer value between 0-90 (inclusive). Defaults to parent BackupPlan&#39;s backup_delete_lock_days setting and may only be increased (either at creation time or in a subsequent update).
     * 
     */
    public Integer deleteLockDays() {
        return this.deleteLockDays;
    }
    /**
     * @return The time at which an existing delete lock will expire for this backup (calculated from create_time + delete_lock_days).
     * 
     */
    public String deleteLockExpireTime() {
        return this.deleteLockExpireTime;
    }
    /**
     * @return User specified descriptive string for this Backup.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The customer managed encryption key that was used to encrypt the Backup&#39;s artifacts. Inherited from the parent BackupPlan&#39;s encryption_key value.
     * 
     */
    public EncryptionKeyResponse encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a backup from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform backup updates in order to avoid race conditions: An `etag` is returned in the response to `GetBackup`, and systems are expected to put that etag in the request to `UpdateBackup` or `DeleteBackup` to ensure that their change will be applied to the same version of the resource.
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
     * @return This flag indicates whether this Backup resource was created manually by a user or via a schedule in the BackupPlan. A value of True means that the Backup was created manually.
     * 
     */
    public Boolean manual() {
        return this.manual;
    }
    /**
     * @return The fully qualified name of the Backup. projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The total number of Kubernetes Pods contained in the Backup.
     * 
     */
    public Integer podCount() {
        return this.podCount;
    }
    /**
     * @return The total number of Kubernetes resources included in the Backup.
     * 
     */
    public Integer resourceCount() {
        return this.resourceCount;
    }
    /**
     * @return The age (in days) after which this Backup will be automatically deleted. Must be an integer value &gt;= 0: - If 0, no automatic deletion will occur for this Backup. - If not 0, this must be &gt;= delete_lock_days. Once a Backup is created, this value may only be increased. Defaults to the parent BackupPlan&#39;s backup_retain_days value.
     * 
     */
    public Integer retainDays() {
        return this.retainDays;
    }
    /**
     * @return The time at which this Backup will be automatically deleted (calculated from create_time + retain_days).
     * 
     */
    public String retainExpireTime() {
        return this.retainExpireTime;
    }
    /**
     * @return If set, the list of ProtectedApplications whose resources were included in the Backup.
     * 
     */
    public NamespacedNamesResponse selectedApplications() {
        return this.selectedApplications;
    }
    /**
     * @return If set, the list of namespaces that were included in the Backup.
     * 
     */
    public NamespacesResponse selectedNamespaces() {
        return this.selectedNamespaces;
    }
    /**
     * @return The total size of the Backup in bytes = config backup size + sum(volume backup sizes)
     * 
     */
    public String sizeBytes() {
        return this.sizeBytes;
    }
    /**
     * @return Current state of the Backup
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Human-readable description of why the backup is in the current `state`.
     * 
     */
    public String stateReason() {
        return this.stateReason;
    }
    /**
     * @return Server generated global unique identifier of [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The timestamp when this Backup resource was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return The total number of volume backups contained in the Backup.
     * 
     */
    public Integer volumeCount() {
        return this.volumeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allNamespaces;
        private ClusterMetadataResponse clusterMetadata;
        private String completeTime;
        private String configBackupSizeBytes;
        private Boolean containsSecrets;
        private Boolean containsVolumeData;
        private String createTime;
        private Integer deleteLockDays;
        private String deleteLockExpireTime;
        private String description;
        private EncryptionKeyResponse encryptionKey;
        private String etag;
        private Map<String,String> labels;
        private Boolean manual;
        private String name;
        private Integer podCount;
        private Integer resourceCount;
        private Integer retainDays;
        private String retainExpireTime;
        private NamespacedNamesResponse selectedApplications;
        private NamespacesResponse selectedNamespaces;
        private String sizeBytes;
        private String state;
        private String stateReason;
        private String uid;
        private String updateTime;
        private Integer volumeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allNamespaces = defaults.allNamespaces;
    	      this.clusterMetadata = defaults.clusterMetadata;
    	      this.completeTime = defaults.completeTime;
    	      this.configBackupSizeBytes = defaults.configBackupSizeBytes;
    	      this.containsSecrets = defaults.containsSecrets;
    	      this.containsVolumeData = defaults.containsVolumeData;
    	      this.createTime = defaults.createTime;
    	      this.deleteLockDays = defaults.deleteLockDays;
    	      this.deleteLockExpireTime = defaults.deleteLockExpireTime;
    	      this.description = defaults.description;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.manual = defaults.manual;
    	      this.name = defaults.name;
    	      this.podCount = defaults.podCount;
    	      this.resourceCount = defaults.resourceCount;
    	      this.retainDays = defaults.retainDays;
    	      this.retainExpireTime = defaults.retainExpireTime;
    	      this.selectedApplications = defaults.selectedApplications;
    	      this.selectedNamespaces = defaults.selectedNamespaces;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.state = defaults.state;
    	      this.stateReason = defaults.stateReason;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.volumeCount = defaults.volumeCount;
        }

        public Builder allNamespaces(Boolean allNamespaces) {
            this.allNamespaces = Objects.requireNonNull(allNamespaces);
            return this;
        }
        public Builder clusterMetadata(ClusterMetadataResponse clusterMetadata) {
            this.clusterMetadata = Objects.requireNonNull(clusterMetadata);
            return this;
        }
        public Builder completeTime(String completeTime) {
            this.completeTime = Objects.requireNonNull(completeTime);
            return this;
        }
        public Builder configBackupSizeBytes(String configBackupSizeBytes) {
            this.configBackupSizeBytes = Objects.requireNonNull(configBackupSizeBytes);
            return this;
        }
        public Builder containsSecrets(Boolean containsSecrets) {
            this.containsSecrets = Objects.requireNonNull(containsSecrets);
            return this;
        }
        public Builder containsVolumeData(Boolean containsVolumeData) {
            this.containsVolumeData = Objects.requireNonNull(containsVolumeData);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deleteLockDays(Integer deleteLockDays) {
            this.deleteLockDays = Objects.requireNonNull(deleteLockDays);
            return this;
        }
        public Builder deleteLockExpireTime(String deleteLockExpireTime) {
            this.deleteLockExpireTime = Objects.requireNonNull(deleteLockExpireTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder encryptionKey(EncryptionKeyResponse encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
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
        public Builder manual(Boolean manual) {
            this.manual = Objects.requireNonNull(manual);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder podCount(Integer podCount) {
            this.podCount = Objects.requireNonNull(podCount);
            return this;
        }
        public Builder resourceCount(Integer resourceCount) {
            this.resourceCount = Objects.requireNonNull(resourceCount);
            return this;
        }
        public Builder retainDays(Integer retainDays) {
            this.retainDays = Objects.requireNonNull(retainDays);
            return this;
        }
        public Builder retainExpireTime(String retainExpireTime) {
            this.retainExpireTime = Objects.requireNonNull(retainExpireTime);
            return this;
        }
        public Builder selectedApplications(NamespacedNamesResponse selectedApplications) {
            this.selectedApplications = Objects.requireNonNull(selectedApplications);
            return this;
        }
        public Builder selectedNamespaces(NamespacesResponse selectedNamespaces) {
            this.selectedNamespaces = Objects.requireNonNull(selectedNamespaces);
            return this;
        }
        public Builder sizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
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
        public Builder volumeCount(Integer volumeCount) {
            this.volumeCount = Objects.requireNonNull(volumeCount);
            return this;
        }        public GetBackupResult build() {
            return new GetBackupResult(allNamespaces, clusterMetadata, completeTime, configBackupSizeBytes, containsSecrets, containsVolumeData, createTime, deleteLockDays, deleteLockExpireTime, description, encryptionKey, etag, labels, manual, name, podCount, resourceCount, retainDays, retainExpireTime, selectedApplications, selectedNamespaces, sizeBytes, state, stateReason, uid, updateTime, volumeCount);
        }
    }
}
