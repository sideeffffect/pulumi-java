// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.enums.LogAnalyticsLogType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container group log analytics information.
 * 
 */
public final class LogAnalyticsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogAnalyticsArgs Empty = new LogAnalyticsArgs();

    /**
     * The log type to be used.
     * 
     */
    @InputImport(name="logType")
      private final @Nullable Input<Either<String,LogAnalyticsLogType>> logType;

    public Input<Either<String,LogAnalyticsLogType>> getLogType() {
        return this.logType == null ? Input.empty() : this.logType;
    }

    /**
     * Metadata for log analytics.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The workspace id for log analytics
     * 
     */
    @InputImport(name="workspaceId", required=true)
      private final Input<String> workspaceId;

    public Input<String> getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * The workspace key for log analytics
     * 
     */
    @InputImport(name="workspaceKey", required=true)
      private final Input<String> workspaceKey;

    public Input<String> getWorkspaceKey() {
        return this.workspaceKey;
    }

    /**
     * The workspace resource id for log analytics
     * 
     */
    @InputImport(name="workspaceResourceId")
      private final @Nullable Input<Map<String,String>> workspaceResourceId;

    public Input<Map<String,String>> getWorkspaceResourceId() {
        return this.workspaceResourceId == null ? Input.empty() : this.workspaceResourceId;
    }

    public LogAnalyticsArgs(
        @Nullable Input<Either<String,LogAnalyticsLogType>> logType,
        @Nullable Input<Map<String,String>> metadata,
        Input<String> workspaceId,
        Input<String> workspaceKey,
        @Nullable Input<Map<String,String>> workspaceResourceId) {
        this.logType = logType;
        this.metadata = metadata;
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
        this.workspaceKey = Objects.requireNonNull(workspaceKey, "expected parameter 'workspaceKey' to be non-null");
        this.workspaceResourceId = workspaceResourceId;
    }

    private LogAnalyticsArgs() {
        this.logType = Input.empty();
        this.metadata = Input.empty();
        this.workspaceId = Input.empty();
        this.workspaceKey = Input.empty();
        this.workspaceResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,LogAnalyticsLogType>> logType;
        private @Nullable Input<Map<String,String>> metadata;
        private Input<String> workspaceId;
        private Input<String> workspaceKey;
        private @Nullable Input<Map<String,String>> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logType = defaults.logType;
    	      this.metadata = defaults.metadata;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceKey = defaults.workspaceKey;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder logType(@Nullable Input<Either<String,LogAnalyticsLogType>> logType) {
            this.logType = logType;
            return this;
        }

        public Builder logType(@Nullable Either<String,LogAnalyticsLogType> logType) {
            this.logType = Input.ofNullable(logType);
            return this;
        }

        public Builder metadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder workspaceId(Input<String> workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Input.of(Objects.requireNonNull(workspaceId));
            return this;
        }

        public Builder workspaceKey(Input<String> workspaceKey) {
            this.workspaceKey = Objects.requireNonNull(workspaceKey);
            return this;
        }

        public Builder workspaceKey(String workspaceKey) {
            this.workspaceKey = Input.of(Objects.requireNonNull(workspaceKey));
            return this;
        }

        public Builder workspaceResourceId(@Nullable Input<Map<String,String>> workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }

        public Builder workspaceResourceId(@Nullable Map<String,String> workspaceResourceId) {
            this.workspaceResourceId = Input.ofNullable(workspaceResourceId);
            return this;
        }
        public LogAnalyticsArgs build() {
            return new LogAnalyticsArgs(logType, metadata, workspaceId, workspaceKey, workspaceResourceId);
        }
    }
}
