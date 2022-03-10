// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.inputs.ExecutionTemplateResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The definition of a single executed notebook.
 * 
 */
public final class ExecutionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecutionResponse Empty = new ExecutionResponse();

    /**
     * Time the Execution was instantiated.
     * 
     */
    @InputImport(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * A brief description of this execution.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Name used for UI purposes. Name can only contain alphanumeric characters and underscores '_'.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    @InputImport(name="executionTemplate", required=true)
      private final ExecutionTemplateResponse executionTemplate;

    public ExecutionTemplateResponse getExecutionTemplate() {
        return this.executionTemplate;
    }

    /**
     * The URI of the external job used to execute the notebook.
     * 
     */
    @InputImport(name="jobUri", required=true)
      private final String jobUri;

    public String getJobUri() {
        return this.jobUri;
    }

    /**
     * The resource name of the execute. Format: `projects/{project_id}/locations/{location}/executions/{execution_id}`
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Output notebook file generated by this execution
     * 
     */
    @InputImport(name="outputNotebookFile", required=true)
      private final String outputNotebookFile;

    public String getOutputNotebookFile() {
        return this.outputNotebookFile;
    }

    /**
     * State of the underlying AI Platform job.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Time the Execution was last updated.
     * 
     */
    @InputImport(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public ExecutionResponse(
        String createTime,
        String description,
        String displayName,
        ExecutionTemplateResponse executionTemplate,
        String jobUri,
        String name,
        String outputNotebookFile,
        String state,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.executionTemplate = Objects.requireNonNull(executionTemplate, "expected parameter 'executionTemplate' to be non-null");
        this.jobUri = Objects.requireNonNull(jobUri, "expected parameter 'jobUri' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputNotebookFile = Objects.requireNonNull(outputNotebookFile, "expected parameter 'outputNotebookFile' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private ExecutionResponse() {
        this.createTime = null;
        this.description = null;
        this.displayName = null;
        this.executionTemplate = null;
        this.jobUri = null;
        this.name = null;
        this.outputNotebookFile = null;
        this.state = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private ExecutionTemplateResponse executionTemplate;
        private String jobUri;
        private String name;
        private String outputNotebookFile;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.executionTemplate = defaults.executionTemplate;
    	      this.jobUri = defaults.jobUri;
    	      this.name = defaults.name;
    	      this.outputNotebookFile = defaults.outputNotebookFile;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder executionTemplate(ExecutionTemplateResponse executionTemplate) {
            this.executionTemplate = Objects.requireNonNull(executionTemplate);
            return this;
        }

        public Builder jobUri(String jobUri) {
            this.jobUri = Objects.requireNonNull(jobUri);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder outputNotebookFile(String outputNotebookFile) {
            this.outputNotebookFile = Objects.requireNonNull(outputNotebookFile);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public ExecutionResponse build() {
            return new ExecutionResponse(createTime, description, displayName, executionTemplate, jobUri, name, outputNotebookFile, state, updateTime);
        }
    }
}
