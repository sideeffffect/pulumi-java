// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExportResult {
    /**
     * @return Time the export job was created.
     * 
     */
    private final String created;
    /**
     * @return Name of the datastore that is the destination of the export job [datastore]
     * 
     */
    private final String datastoreName;
    /**
     * @return Description of the export job.
     * 
     */
    private final String description;
    /**
     * @return Error is set when export fails
     * 
     */
    private final String error;
    /**
     * @return Execution time for this export job. If the job is still in progress, it will be set to the amount of time that has elapsed since`created`, in seconds. Else, it will set to (`updated` - `created`), in seconds.
     * 
     */
    private final String executionTime;
    /**
     * @return Display name of the export job.
     * 
     */
    private final String name;
    /**
     * @return Self link of the export job. A URI that can be used to retrieve the status of an export job. Example: `/organizations/myorg/environments/myenv/analytics/exports/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    private final String self;
    /**
     * @return Status of the export job. Valid values include `enqueued`, `running`, `completed`, and `failed`.
     * 
     */
    private final String state;
    /**
     * @return Time the export job was last updated.
     * 
     */
    private final String updated;

    @CustomType.Constructor
    private GetExportResult(
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("datastoreName") String datastoreName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("error") String error,
        @CustomType.Parameter("executionTime") String executionTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("self") String self,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updated") String updated) {
        this.created = created;
        this.datastoreName = datastoreName;
        this.description = description;
        this.error = error;
        this.executionTime = executionTime;
        this.name = name;
        this.self = self;
        this.state = state;
        this.updated = updated;
    }

    /**
     * @return Time the export job was created.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return Name of the datastore that is the destination of the export job [datastore]
     * 
     */
    public String datastoreName() {
        return this.datastoreName;
    }
    /**
     * @return Description of the export job.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Error is set when export fails
     * 
     */
    public String error() {
        return this.error;
    }
    /**
     * @return Execution time for this export job. If the job is still in progress, it will be set to the amount of time that has elapsed since`created`, in seconds. Else, it will set to (`updated` - `created`), in seconds.
     * 
     */
    public String executionTime() {
        return this.executionTime;
    }
    /**
     * @return Display name of the export job.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Self link of the export job. A URI that can be used to retrieve the status of an export job. Example: `/organizations/myorg/environments/myenv/analytics/exports/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    public String self() {
        return this.self;
    }
    /**
     * @return Status of the export job. Valid values include `enqueued`, `running`, `completed`, and `failed`.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Time the export job was last updated.
     * 
     */
    public String updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private String datastoreName;
        private String description;
        private String error;
        private String executionTime;
        private String name;
        private String self;
        private String state;
        private String updated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.datastoreName = defaults.datastoreName;
    	      this.description = defaults.description;
    	      this.error = defaults.error;
    	      this.executionTime = defaults.executionTime;
    	      this.name = defaults.name;
    	      this.self = defaults.self;
    	      this.state = defaults.state;
    	      this.updated = defaults.updated;
        }

        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder datastoreName(String datastoreName) {
            this.datastoreName = Objects.requireNonNull(datastoreName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder error(String error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder executionTime(String executionTime) {
            this.executionTime = Objects.requireNonNull(executionTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder self(String self) {
            this.self = Objects.requireNonNull(self);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }        public GetExportResult build() {
            return new GetExportResult(created, datastoreName, description, error, executionTime, name, self, state, updated);
        }
    }
}
