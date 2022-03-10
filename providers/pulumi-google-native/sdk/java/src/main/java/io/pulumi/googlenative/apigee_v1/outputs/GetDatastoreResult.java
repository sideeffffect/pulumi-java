// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1DatastoreConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDatastoreResult {
    /**
     * Datastore create time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    private final String createTime;
    /**
     * Datastore Configurations.
     * 
     */
    private final GoogleCloudApigeeV1DatastoreConfigResponse datastoreConfig;
    /**
     * Display name in UI
     * 
     */
    private final String displayName;
    /**
     * Datastore last update time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
     */
    private final String lastUpdateTime;
    /**
     * Organization that the datastore belongs to
     * 
     */
    private final String org;
    /**
     * Resource link of Datastore. Example: `/organizations/{org}/analytics/datastores/{uuid}`
     * 
     */
    private final String self;
    /**
     * Destination storage type. Supported types `gcs` or `bigquery`.
     * 
     */
    private final String targetType;

    @OutputCustomType.Constructor
    private GetDatastoreResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("datastoreConfig") GoogleCloudApigeeV1DatastoreConfigResponse datastoreConfig,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("lastUpdateTime") String lastUpdateTime,
        @OutputCustomType.Parameter("org") String org,
        @OutputCustomType.Parameter("self") String self,
        @OutputCustomType.Parameter("targetType") String targetType) {
        this.createTime = createTime;
        this.datastoreConfig = datastoreConfig;
        this.displayName = displayName;
        this.lastUpdateTime = lastUpdateTime;
        this.org = org;
        this.self = self;
        this.targetType = targetType;
    }

    /**
     * Datastore create time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Datastore Configurations.
     * 
    */
    public GoogleCloudApigeeV1DatastoreConfigResponse getDatastoreConfig() {
        return this.datastoreConfig;
    }
    /**
     * Display name in UI
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Datastore last update time, in milliseconds since the epoch of 1970-01-01T00:00:00Z
     * 
    */
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * Organization that the datastore belongs to
     * 
    */
    public String getOrg() {
        return this.org;
    }
    /**
     * Resource link of Datastore. Example: `/organizations/{org}/analytics/datastores/{uuid}`
     * 
    */
    public String getSelf() {
        return this.self;
    }
    /**
     * Destination storage type. Supported types `gcs` or `bigquery`.
     * 
    */
    public String getTargetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private GoogleCloudApigeeV1DatastoreConfigResponse datastoreConfig;
        private String displayName;
        private String lastUpdateTime;
        private String org;
        private String self;
        private String targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatastoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.datastoreConfig = defaults.datastoreConfig;
    	      this.displayName = defaults.displayName;
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.org = defaults.org;
    	      this.self = defaults.self;
    	      this.targetType = defaults.targetType;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder datastoreConfig(GoogleCloudApigeeV1DatastoreConfigResponse datastoreConfig) {
            this.datastoreConfig = Objects.requireNonNull(datastoreConfig);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime);
            return this;
        }

        public Builder org(String org) {
            this.org = Objects.requireNonNull(org);
            return this;
        }

        public Builder self(String self) {
            this.self = Objects.requireNonNull(self);
            return this;
        }

        public Builder targetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }
        public GetDatastoreResult build() {
            return new GetDatastoreResult(createTime, datastoreConfig, displayName, lastUpdateTime, org, self, targetType);
        }
    }
}
