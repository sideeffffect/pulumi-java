// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.CommonExportPropertiesResponse;
import com.pulumi.azurenative.costmanagement.outputs.ErrorDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExportExecutionResponse {
    /**
     * @return eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    private final @Nullable String eTag;
    /**
     * @return The details of any error.
     * 
     */
    private final @Nullable ErrorDetailsResponse error;
    /**
     * @return The type of the export execution.
     * 
     */
    private final @Nullable String executionType;
    /**
     * @return The name of the exported file.
     * 
     */
    private final @Nullable String fileName;
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The time when the export execution finished.
     * 
     */
    private final @Nullable String processingEndTime;
    /**
     * @return The time when export was picked up to be executed.
     * 
     */
    private final @Nullable String processingStartTime;
    /**
     * @return The export settings that were in effect for this execution.
     * 
     */
    private final @Nullable CommonExportPropertiesResponse runSettings;
    /**
     * @return The last known status of the export execution.
     * 
     */
    private final @Nullable String status;
    /**
     * @return The identifier for the entity that executed the export. For OnDemand executions it is the user email. For scheduled executions it is &#39;System&#39;.
     * 
     */
    private final @Nullable String submittedBy;
    /**
     * @return The time when export was queued to be executed.
     * 
     */
    private final @Nullable String submittedTime;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ExportExecutionResponse(
        @CustomType.Parameter("eTag") @Nullable String eTag,
        @CustomType.Parameter("error") @Nullable ErrorDetailsResponse error,
        @CustomType.Parameter("executionType") @Nullable String executionType,
        @CustomType.Parameter("fileName") @Nullable String fileName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("processingEndTime") @Nullable String processingEndTime,
        @CustomType.Parameter("processingStartTime") @Nullable String processingStartTime,
        @CustomType.Parameter("runSettings") @Nullable CommonExportPropertiesResponse runSettings,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("submittedBy") @Nullable String submittedBy,
        @CustomType.Parameter("submittedTime") @Nullable String submittedTime,
        @CustomType.Parameter("type") String type) {
        this.eTag = eTag;
        this.error = error;
        this.executionType = executionType;
        this.fileName = fileName;
        this.id = id;
        this.name = name;
        this.processingEndTime = processingEndTime;
        this.processingStartTime = processingStartTime;
        this.runSettings = runSettings;
        this.status = status;
        this.submittedBy = submittedBy;
        this.submittedTime = submittedTime;
        this.type = type;
    }

    /**
     * @return eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    public Optional<String> eTag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * @return The details of any error.
     * 
     */
    public Optional<ErrorDetailsResponse> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return The type of the export execution.
     * 
     */
    public Optional<String> executionType() {
        return Optional.ofNullable(this.executionType);
    }
    /**
     * @return The name of the exported file.
     * 
     */
    public Optional<String> fileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The time when the export execution finished.
     * 
     */
    public Optional<String> processingEndTime() {
        return Optional.ofNullable(this.processingEndTime);
    }
    /**
     * @return The time when export was picked up to be executed.
     * 
     */
    public Optional<String> processingStartTime() {
        return Optional.ofNullable(this.processingStartTime);
    }
    /**
     * @return The export settings that were in effect for this execution.
     * 
     */
    public Optional<CommonExportPropertiesResponse> runSettings() {
        return Optional.ofNullable(this.runSettings);
    }
    /**
     * @return The last known status of the export execution.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The identifier for the entity that executed the export. For OnDemand executions it is the user email. For scheduled executions it is &#39;System&#39;.
     * 
     */
    public Optional<String> submittedBy() {
        return Optional.ofNullable(this.submittedBy);
    }
    /**
     * @return The time when export was queued to be executed.
     * 
     */
    public Optional<String> submittedTime() {
        return Optional.ofNullable(this.submittedTime);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportExecutionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private @Nullable ErrorDetailsResponse error;
        private @Nullable String executionType;
        private @Nullable String fileName;
        private String id;
        private String name;
        private @Nullable String processingEndTime;
        private @Nullable String processingStartTime;
        private @Nullable CommonExportPropertiesResponse runSettings;
        private @Nullable String status;
        private @Nullable String submittedBy;
        private @Nullable String submittedTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportExecutionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.error = defaults.error;
    	      this.executionType = defaults.executionType;
    	      this.fileName = defaults.fileName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.processingEndTime = defaults.processingEndTime;
    	      this.processingStartTime = defaults.processingStartTime;
    	      this.runSettings = defaults.runSettings;
    	      this.status = defaults.status;
    	      this.submittedBy = defaults.submittedBy;
    	      this.submittedTime = defaults.submittedTime;
    	      this.type = defaults.type;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder error(@Nullable ErrorDetailsResponse error) {
            this.error = error;
            return this;
        }
        public Builder executionType(@Nullable String executionType) {
            this.executionType = executionType;
            return this;
        }
        public Builder fileName(@Nullable String fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder processingEndTime(@Nullable String processingEndTime) {
            this.processingEndTime = processingEndTime;
            return this;
        }
        public Builder processingStartTime(@Nullable String processingStartTime) {
            this.processingStartTime = processingStartTime;
            return this;
        }
        public Builder runSettings(@Nullable CommonExportPropertiesResponse runSettings) {
            this.runSettings = runSettings;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder submittedBy(@Nullable String submittedBy) {
            this.submittedBy = submittedBy;
            return this;
        }
        public Builder submittedTime(@Nullable String submittedTime) {
            this.submittedTime = submittedTime;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ExportExecutionResponse build() {
            return new ExportExecutionResponse(eTag, error, executionType, fileName, id, name, processingEndTime, processingStartTime, runSettings, status, submittedBy, submittedTime, type);
        }
    }
}
