// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSnapshotResult {
    /**
     * @return The time when the snapshot was created.
     * 
     */
    private final String createTime;
    /**
     * @return A description of the snapshot with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    private final String description;
    /**
     * @return The amount of bytes needed to allocate a full copy of the snapshot content
     * 
     */
    private final String filesystemUsedBytes;
    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The resource name of the snapshot, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}/snapshots/{snapshot_id}`.
     * 
     */
    private final String name;
    /**
     * @return The snapshot state.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetSnapshotResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("filesystemUsedBytes") String filesystemUsedBytes,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state) {
        this.createTime = createTime;
        this.description = description;
        this.filesystemUsedBytes = filesystemUsedBytes;
        this.labels = labels;
        this.name = name;
        this.state = state;
    }

    /**
     * @return The time when the snapshot was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return A description of the snapshot with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The amount of bytes needed to allocate a full copy of the snapshot content
     * 
     */
    public String filesystemUsedBytes() {
        return this.filesystemUsedBytes;
    }
    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource name of the snapshot, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}/snapshots/{snapshot_id}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The snapshot state.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String filesystemUsedBytes;
        private Map<String,String> labels;
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.filesystemUsedBytes = defaults.filesystemUsedBytes;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder filesystemUsedBytes(String filesystemUsedBytes) {
            this.filesystemUsedBytes = Objects.requireNonNull(filesystemUsedBytes);
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
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetSnapshotResult build() {
            return new GetSnapshotResult(createTime, description, filesystemUsedBytes, labels, name, state);
        }
    }
}
